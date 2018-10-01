package force.xml;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.dom4j.Element;

import com.sforce.soap.enterprise.sobject.SObject;


public class LoadConfig extends AbstractConfig {

	public class Dependency {
		
		public class Links {
			
			private final Hashtable<String, String> linkObjects = new Hashtable<String, String>();
			
			public Links( List<Element> links ){
				if ( (links != null) && (!links.isEmpty()) ) {
					for ( Element e : links ) {
						linkObjects.put(e.attributeValue("field"),
								e.attributeValue("object"));
					}
				}
			}
		
			public boolean isValid(){
				return !this.linkObjects.values().isEmpty();
			}
			
			public List<String> getFields(){
				return new ArrayList<String>( this.linkObjects.keySet() );
			}
			
			public String getTargetObject( String field ){
				if ( field == null ) {
					return null;
				}
				return this.linkObjects.get( field );
			}
		}

		private static final String NONE_REFERENCE_TYPE = "none";

		private static final String REVERSE_REFERENCE = "reverse";

		private String baseClassName = null;

		private final Hashtable<String, String> depObjects = new Hashtable<String, String>();

		private final Hashtable<String, String> depTypes = new Hashtable<String, String>();

		private final Hashtable<String, String> depValues = new Hashtable<String, String>();
		
		private final Hashtable<String, Links> depLinks = new Hashtable<String, Links>();

		public Dependency( String baseClassName, List<Element> dependencies ) {
			if ( (dependencies != null) && (!dependencies.isEmpty()) ) {
				this.baseClassName = baseClassName;
				for ( Element dep : dependencies ) {
					String type = dep.attributeValue("type");
					if ( type == null ) {
						type = NONE_REFERENCE_TYPE;
					}
					String field = dep.attributeValue("field");
					String object = dep.attributeValue("object");
					if ( object != null ) {
						this.depObjects.put(field, object);
					} else {
						this.depObjects.put(field, "");
					}
					this.depTypes.put(field, type);
					String value = dep.attributeValue("value");
					if ( (value != null) && (value.length()>0) ) {
						this.depValues.put(field, value);
					}
					if (REVERSE_REFERENCE.equals(type)) {
						initReverseReference( field, dep );
					}
				}
			}
		}
		
		public Links getLinks( String field ){
			if ( field == null ) {
				return null;
			}
			return this.depLinks.get(field);
		}

		private void initReverseReference( String field, Element dep ) {
			final Links links = new Links( dep.elements("link") );
			if ( links.isValid() ) {
				this.depLinks.put(field, links);
				System.out.println("Here");
			}
		}

		public String getTargetClassName( String fieldName ){
			if ( fieldName == null ) {
				return null;
			}
			return this.depObjects.get(fieldName);
		}

		public boolean isValid(){
			return (this.baseClassName != null);
		}

		public String getValue( String fieldName ){
			if ( fieldName == null ) {
				return null;
			}
			return this.depValues.get(fieldName);
		}

		public List<String> getOrdinalDependencies(){
			return getTypeDependencies( NONE_REFERENCE_TYPE );
		}

		public List<String> getReverseDependencies(){
			return getTypeDependencies( REVERSE_REFERENCE );
		}

		private List<String> getTypeDependencies( String type ){
			final List<String> references = new ArrayList<String>();
			for ( String field : this.depObjects.keySet() ) {
				if ( this.depTypes.get(field).equals(type) ) {
						references.add( field );
				}
			}
			return references;
		}
		
		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder();
			sb.append(baseClassName);
			sb.append( " : { " );
			for ( String k : depObjects.keySet() ) {
				sb.append( "[" );
				sb.append( k );
				sb.append( " : " );
				sb.append( depObjects.get(k) );
				sb.append( " : " );
				sb.append( depTypes.get(k) );
				sb.append( " : " );
				sb.append( depValues.get(k) );
				sb.append( "]" );
			}
			sb.append( " }" );
			return sb.toString();
		}
	}

	private Hashtable<String, Dependency> deps = new Hashtable<String, Dependency>();
	
	public LoadConfig(){
		
	}
	
	public void putClass( String className, List<Element> dependencies ) throws ClassNotFoundException {
		super.putClass(className, null);
		final Dependency dep = new Dependency( className, dependencies );
		if ( dep.isValid() ) {
			this.deps.put(className, dep);
		}
	}

	public Dependency getDependency(Class<? extends SObject> clazz){
		return getDependency( getClassString(clazz) );
	}
	
	public Dependency getDependency(String className){
		return ( className != null ) ? this.deps.get(className) : null;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append( "LoadConfig" );
		sb.append("\n\r");
		for ( Dependency de : this.deps.values() ) {
			sb.append( de.toString() );
			sb.append("\n\r");
		}
		return sb.toString();
	}


}
