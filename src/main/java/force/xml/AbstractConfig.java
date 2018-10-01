package force.xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import com.sforce.soap.enterprise.sobject.SObject;

import force.ConnectionProvider;
import force.ObjectsUtils;
import force.describe.FieldsObtainer;

public class AbstractConfig {
	
	protected final List<Class<? extends SObject>> classesOrder = new ArrayList<Class<? extends SObject>>();

	protected final Hashtable<String, Class<? extends SObject>> classes = new Hashtable<String, Class<? extends SObject>>();
	
	private String prefix = null;

	public Collection<Class<? extends SObject>> getClasses(){
		return this.classesOrder;
	}
	
	public String getClassFields( Class<? extends SObject> clazz ) throws Exception {
		final String classString = getClassString(clazz);
		if ( classString == null ) {
			return null;
		}
		final FieldsObtainer fo = new FieldsObtainer( ConnectionProvider.INSTANCE.getSource().getStub() );
		return fo.getFieldsToLoadAsOneString(classString);
	}
	
	public List<String> getClassFieldsList( Class<? extends SObject> clazz ) throws Exception {
		final String classString = getClassString(clazz);
		if ( classString == null ) {
			return null;
		}
		final FieldsObtainer fo = new FieldsObtainer( ConnectionProvider.INSTANCE.getSource().getStub() );
		return fo.getFieldsToLoad(classString);
	}
	
	public String getClassString( Class<? extends SObject> clazz ){
		if ( clazz == null ) {
			return null;
		}
		for ( String s : this.classes.keySet()) {
			if ( this.classes.get(s).equals(clazz) ) {
				return s;
			}
		}
		return null;
	}
	
	public Class<? extends SObject> getClassOnString( String className ){
		if ( className == null ) {
			return null;
		}
		return this.classes.get(className);
	}
	
	private String buildNameOfClass( String className ){
		return className;		
	}
	
	private Class<? extends SObject> getCorrespondingClass(String className) throws ClassNotFoundException {
		String name = "com.sforce.soap.enterprise.sobject." + buildNameOfClass(className);
		Class c = Class.forName( name );
		return c;
	}
	
	protected void putClass( String className, String fields ) throws ClassNotFoundException {
		final Class clazz = getCorrespondingClass(className);
		this.classesOrder.add( clazz );
		this.classes.put(className, clazz);
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public String getPrefix(){
		return this.prefix;
	}
}
