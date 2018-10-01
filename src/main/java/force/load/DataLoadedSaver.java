package force.load;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import force.ITraceReciever;
import force.fObject.fObject;
import force.fObject.fObjectsSet;

public class DataLoadedSaver {
	
	private final Hashtable<String, Hashtable<String, fObject>> objectsLoaded = new Hashtable<String, Hashtable<String,fObject>>();
	
	final ITraceReciever trace;

	public DataLoadedSaver( ITraceReciever trace ){
		this.trace = trace;
	}

	public void saveLoaded( String className, fObjectsSet objectsSet ){
		if ( className == null ) {
			this.trace.error("className is null");
			return;
		}
		if ( objectsSet == null ) {
			this.trace.error("objects is null");
			return;
		}
		for ( fObject o : objectsSet.getObjects() ) {
			saveLoaded(className, o);
		}
	}
	
	public void saveLoaded( String className, fObject object ){
		if ( className == null ) {
			this.trace.error("className is null");
			return;
		}
		if ( object == null ) {
			this.trace.error("object is null");
			return;
		}
		getObjects(className).put(object.getId(), object);
	}
	
	public Hashtable<String, fObject> getObjects( String className ){
		if ( className == null ) {
			return null;
		}
		Hashtable<String, fObject> objs = this.objectsLoaded.get(className);
		if ( objs == null ) {
			objs = new Hashtable<String, fObject>();
			this.objectsLoaded.put(className, objs);
		}
		return objs;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append( "classes: " + this.objectsLoaded.keySet().size() );
		for ( String className : this.objectsLoaded.keySet() ) {
			Hashtable<String, fObject> data = this.objectsLoaded.get( className );
			sb.append( className );
			sb.append( " : " );
			sb.append( "{" );
			sb.append( data.keySet().size() );
			sb.append( "}" );
			sb.append( "\n\r" );
		}
		return sb.toString();
	}

	public List<String> getIds( String className ) {
		final List<String> ids = new ArrayList<String>(); 
		if ( className == null ) {
			return ids;  
		}
		final Hashtable<String, fObject> objs = getObjects(className);
		ids.addAll( objs.keySet() );
		return ids;
	}

	public List<String> getValues(String className,
			String targetField) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException, ClassNotFoundException {
		final List<String> values = new ArrayList<String>(); 
		if ( className == null ) {
			return values;  
		}
		final Hashtable<String, fObject> objs = getObjects( className );
		for ( String id : objs.keySet() ) {
			fObject obj = objs.get(id);
			final String value = obj.getValue(targetField);
			if ( (value != null) && (!"null".equalsIgnoreCase(value)) ) {
				values.add( value );
			}
		}
		return values;
	}
	
	public void setAllowedFields( String objName, List<String> allowedFields ){
		Hashtable<String, fObject> objs = this.objectsLoaded.get( objName );
		if ( objs != null ) {
			for ( fObject f : objs.values() ) {
				f.setAllowedSet(allowedFields);
			}
		}
	}
}
