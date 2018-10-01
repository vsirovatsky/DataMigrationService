package force.upload;

import java.util.Hashtable;

import force.StringUtils;

public class FieldsForceValues {
	
	public static final String NULL_VALUE = "";
	
	private final Hashtable<String, String> values = new Hashtable<String, String>();

	public FieldsForceValues(){
		setValue("OwnerId", null);
	}
	
	public String getValue( String field ){
		if ( field == null ) {
			return null;
		}
		return this.values.get( field );
	}
	
	public void setValue( String field, String value ){
		if ( (field == null) ) {
			return;
		}
		if ( StringUtils.isBlank(value) ) {
			value = NULL_VALUE;
		}
		this.values.put(field, value);
	}
}
