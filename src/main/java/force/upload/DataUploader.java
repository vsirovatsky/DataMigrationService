package force.upload;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.message.RPCElement;

import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.SObject;

import force.ConnectionData;
import force.ITraceReciever;
import force.ObjectsUtils;
import force.fObject.RPCElementBuilder;
import force.fObject.fObject;
import force.upload.ErrorGeatherer.ErrorGeathererNode;
import force.upload.autofix.AutoFixManager;
import force.upload.autofix.SaveError;
import force.util.ListUtils;
import force.xls.XLSReadData;


public class DataUploader {
	
	private final ConnectionData connectionData;

	public DataUploader( ConnectionData connectionData ){
		this.connectionData = connectionData;
	}
	
	public String saveGetId( fObject object, ITraceReciever trace ) throws Exception {
		trace.println("");
		trace.println( "saving: " + object.getClass().getSimpleName() + " : " + object.getId() );
		final SaveResult[] results = saveRawObjectNew(object, trace );
		if ( (results == null) || (results.length == 0) ) {
			return null;
		}
		String id = results[0].getId();
		return id;
	}
	
	public List<String> saveGetIds( List<fObject> objects, ITraceReciever trace ) throws Exception {
		final SaveResult[] saveResults = saveRawObjectsListNew(objects, trace );
		List<String> result = new ArrayList<String>();
		for ( SaveResult sr : saveResults ) {
			result.add( sr.getId() );
		}
		return result;
	}
	
	public SaveResult[] saveRawObjectsListNew( List<fObject> objects, ITraceReciever trace ) throws Exception {
		List<ErrorGeathererNode> nodes = new ArrayList<ErrorGeathererNode>();
		for ( fObject f : objects ) {
			ErrorGeathererNode node = ErrorGeatherer.INSTANCE.createNode( f.getName(), f.getId() );
			nodes.add( node );
			f.removeId();
		}
		final RPCElement elem = RPCElementBuilder.create( objects );
		final SaveResult[] saveResultArray = this.connectionData.getStub().createMy( elem );
		Integer count = 0;
		Integer i = 0;
		for ( SaveResult sr : saveResultArray ) {
			if ( sr.isSuccess() ) {
				count++;
			} else {
	       		for (com.sforce.soap.enterprise.Error err : sr.getErrors()) {
	       			trace.error( err.getMessage() );
	      			ListUtils.println( err.getFields() );
	       			if ( err.getFields() != null ) {
	       				for ( String s : err.getFields()) {
	       					trace.println(s);
	       					nodes.get(i).add( s );
	       				}
	       			}
	       		}
	       		trace.println("not uploaded");
	       		ErrorGeatherer.INSTANCE.error(nodes.get(i));
	       		ErrorGeatherer.INSTANCE.println();
	       		//System.exit(0);
			}
			i++;
		}
		trace.println( "uploaded " + count );
		if ( (i - count) > 0 ) {
			trace.println( "errors " + (i - count) );
		}
		return saveResultArray;
	}
	
	public SaveResult[] saveRawObjectNew( fObject object, ITraceReciever trace ) throws Exception {
	
		ErrorGeathererNode node = ErrorGeatherer.INSTANCE.createNode( object.getName(), object.getId() );
		object.removeId();
		final RPCElement elem = RPCElementBuilder.create( object );
        final SaveResult[] saveResultArray = this.connectionData.getStub().createMy( elem );

       	if (saveResultArray[0].isSuccess()) {
        		trace.println( "uploaded" );
       	} else {
       		//if ( AutoFixManager.INSTANCE.applyFixes( object, new SaveError(saveResultArray[0].getErrors(), trace), trace ) ) {
       		//	return saveRawObjectNew(object, trace);
       		//}
       		for (com.sforce.soap.enterprise.Error err : saveResultArray[0].getErrors()) {
       			trace.error( err.getMessage() );
      			ListUtils.println( err.getFields() );
       			if ( err.getFields() != null ) {
       				for ( String s : err.getFields()) {
       					trace.println(s);
       					node.add( s );
       				}
       			}
       		}
       		trace.println("not uploaded");
       		ErrorGeatherer.INSTANCE.error(node);
       		ErrorGeatherer.INSTANCE.println();
       		System.exit(0);
       	}
        return saveResultArray;
	}
	
	public SaveResult[] saveRawObjects( SObject[] sObjectsArray, ITraceReciever trace ) throws Exception {
        
        SaveResult[] saveResultArray = this.connectionData.getStub().create(sObjectsArray);

        for (int i=0;i<sObjectsArray.length;i++) {
        	if (saveResultArray[i].isSuccess()) {
        		trace.println( "uploaded" );
        	} else {
        		/*if ( AutoFixManager.INSTANCE.applyFixes( sObjectsArray, new SaveError(saveResultArray[i].getErrors(), trace), trace ) ) {
        			return saveRawObjects(sObjectsArray, trace);
        		}*/
        		for (com.sforce.soap.enterprise.Error err : saveResultArray[i].getErrors()) {
        			trace.error( err.getMessage() );
        			ListUtils.println( err.getFields() );
        			if ( err.getFields() != null ) {
        				for ( String s : err.getFields()) {
        					trace.println(s);
        				}
            			if ( err.getMessage().equals("insufficient access rights on cross-reference id") ) {
            				if (retryToNull(sObjectsArray, err.getFields())) {
            					return saveRawObjects(sObjectsArray, trace);
            				}
            			}
        			}
        		}
        		trace.error("not uploaded");
        	}
        }
        return saveResultArray;
	}
	
	private boolean retryToNull( SObject[] sObjectsArray, String[] fields ) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		if ( (fields == null) || (fields.length == 0) ) {
			return false;
		}
		System.out.println( "retry for fields: " );
		ListUtils.println( fields );
		boolean result = false;
		for ( String field : fields ) {
			String name = ObjectsUtils.buildSetMethod(field);
			Method m = null;
			Class targetValueClass = null;
			for ( Class clazzInSet : XLSReadData.classesInSet ) {
				try {
					m = sObjectsArray[0].getClass().getMethod(name , clazzInSet);
					targetValueClass = clazzInSet;
					break;
				} catch (SecurityException e) {} 
				catch (NoSuchMethodException e) {}
			}
			if ( m != null ) {
				for ( SObject o : sObjectsArray ) {
					m.invoke( o, targetValueClass.cast(null) );
					result = true;
				}
			}
		}
		return result;
	}
}
