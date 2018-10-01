package force.util;

import java.util.Hashtable;

import com.sforce.soap.enterprise.sobject.SObject;

public class ClassUtils {
	
	private Hashtable<String, Class<? extends SObject>> classes = new Hashtable<String, Class<? extends SObject>>(); 
	
	public static final ClassUtils INSTANCE = new ClassUtils();
	
	private ClassUtils(){}
	
	public Class<? extends SObject> get( String className ) throws ClassNotFoundException {
		if ( className == null ) {
			return null;
		}
		Class<? extends SObject> clazz = this.classes.get( className );
		if ( clazz == null ) {
			clazz = createCorrespondingClass( className );
			this.classes.put(className, clazz);
		}
		return clazz;
	}

	private Class<? extends SObject> createCorrespondingClass(String className) throws ClassNotFoundException {
		String name = "com.sforce.soap.enterprise.sobject." + className;
		Class c = Class.forName( name );
		return c;
	}

}
