package force.xml;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.dom4j.Element;

import com.sforce.soap.enterprise.sobject.SObject;

public class SaveConfig extends AbstractConfig {
	
	public class ForceReference {
		
		private static final String MASTER_TYPE_REFERENCE = "master";

		private String baseClassName = null;
		
		private final Hashtable<String, String> refObjects = new Hashtable<String, String>();
		
		private final Hashtable<String, String> refTypes = new Hashtable<String, String>();
		
		private final Hashtable<String, String> refForcedValues = new Hashtable<String, String>();
		
		public ForceReference( String baseClassName, List<Element> references ) {
			if ( (references != null) && (!references.isEmpty()) ) {
				this.baseClassName = baseClassName;
				for ( Element ref : references ) {
					String type = ref.attributeValue("type");
					if ( type == null ) {
						type = "none";
					}
					String field = ref.attributeValue("field");
					this.refObjects.put(field, ref.attributeValue("object"));
					this.refTypes.put(field, type);
					String value = ref.attributeValue("forcedValue");
					if ( (value != null) && (value.length()>0) ) {
						this.refForcedValues.put(field, value);
					}
				}
			}
		}
		
		public String getValue( String fieldName ){
			if ( fieldName == null ) {
				return null;
			}
			return this.refForcedValues.get(fieldName);
		}
		
		public List<String> getMasterReferences(){
			return getTypeReferences( MASTER_TYPE_REFERENCE, true );
		}
		
		public List<String> getNonMasterReferences(){
			return getTypeReferences( MASTER_TYPE_REFERENCE, false );
		}

		public List<String> getTypeReferences( String type, boolean include ){
			final List<String> references = new ArrayList<String>();
			for ( String field : this.refObjects.keySet() ) {
				if ( this.refTypes.get(field).equals(type) ) {
					if (include) {
						references.add( field );
					}
				} else if (!include) {
					references.add( field );
				}
			}
			return references;
		}
		public String getTargetClassName( String fieldName ){
			if ( fieldName == null ) {
				return null;
			}
			return this.refObjects.get(fieldName);
		}
		
		public boolean isValid(){
			return (this.baseClassName != null);
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder();
			sb.append(baseClassName);
			sb.append( " : { " );
			for ( String k : refObjects.keySet() ) {
				sb.append( "[" );
				sb.append( k );
				sb.append( " : " );
				sb.append( refObjects.get(k) );
				sb.append( " : " );
				sb.append( refTypes.get(k) );
				sb.append( "]" );
			}
			sb.append( " }" );
			return sb.toString();
		}

		public boolean isReferencesedToClass(String className) {
			if ( className == null ) {
				return false;
			}
			for ( String objClass : this.refObjects.values() ) {
				if ( className.equals(objClass) ) {
					return true;
				}
			}
			return false;
		}
	}

	private final Hashtable<String, ForceReference> refs = new Hashtable<String, ForceReference>();
	
	public void putClass( String className, String fields, List<Element> references ) throws ClassNotFoundException {
		super.putClass(className, fields);
		final ForceReference ref = new ForceReference( className, references );
		if ( ref.isValid() ) {
			this.refs.put(className, ref);
		}
	}
	
	public ForceReference getReference(Class<? extends SObject> clazz){
		return getReference( getClassString(clazz) );
	}
	
	public ForceReference getReference(String className){
		return ( className != null ) ? this.refs.get(className) : null;
	}
	
	public boolean isCanMassUpload( Class clazz ) {
		String className = getClassString(clazz);
		for ( ForceReference ref : this.refs.values() ) {
			if (ref.isReferencesedToClass( className )){
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		for ( ForceReference fr : this.refs.values() ) {
			sb.append( fr.toString() );
			sb.append("/n/r");
		}
		return sb.toString();
	}
}
