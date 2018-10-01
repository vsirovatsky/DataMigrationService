package force.fObject;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class fObject {
	
	private final String name;
	
	private final Hashtable<String, String> data = new Hashtable<String, String>();
	
	private List<String> allowedSet = null;
	
	public fObject( String name ){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void set( String field, String value ){
		if ( (field == null) || (value == null) ) {
			return;
		}
		this.data.put(field, value);
	}
	
	public void setNullIfNull( String field ){
		if ( field == null ) {
			return;
		}
		if ( getValue(field) == null ) {
			set(field, "null");
		}
	}
	
	public List<String> getFields(){
		return (this.allowedSet==null) ? new ArrayList<String>(data.keySet()) : this.allowedSet;
	}
	
	public String getValue( String field ){
		if ( field == null ) {
			return null;
		}
		return data.get( field );
	}
	
	public String getId(){
		return getValue("Id");
	}

	public void setId(String value) {
		set("Id", value);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Name : ");
		sb.append(this.name);
		sb.append(" { ");
		boolean comma = false;
		for ( String field : data.keySet() ) {
			sb.append( "[" );
			sb.append( field );
			sb.append( " : " );
			sb.append( data.get(field) );
			sb.append( "]" );
			if ( comma ) {
				sb.append( ", " );
			} else {
				comma = true;
			}
		}
		sb.append(" } ");
		return sb.toString();
	}

	public void removeId() {
		this.data.remove("Id");
	}

	public void removeValue( String field ){
		if ( field == null ) {
			return;
		}
		this.data.remove( field );
	}
	
	public void setAllowedSet( List<String> allowedFields ){
		this.allowedSet = allowedFields;
	}
}
