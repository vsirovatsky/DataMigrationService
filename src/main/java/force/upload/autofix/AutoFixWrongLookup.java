package force.upload.autofix;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sforce.soap.enterprise.sobject.SObject;

import force.ITraceReciever;
import force.ObjectsUtils;
import force.util.ListUtils;
import force.xls.XLSReadData;

public class AutoFixWrongLookup extends AutoFixAbstract {
	
	public AutoFixWrongLookup(){}

	@Override
	public boolean fix(SObject[] objectsArray, SaveError saveError, ITraceReciever trace) throws Exception {
		if ( saveError.isWrongLookupError() ) {
			return perform(objectsArray, saveError.getErrorFields(), trace);
		}
		return false;
	}

	private boolean perform( SObject[] sObjectsArray, String[] fields, ITraceReciever trace ) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
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

	@Override
	public String getTitle() {
		return "Set To Null Wrong LookUps";
	}
}
