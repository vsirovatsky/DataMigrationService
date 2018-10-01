package force.upload.autofix;

import force.ITraceReciever;

public class SaveError {

	private final com.sforce.soap.enterprise.Error[] errors;
	
	private final ITraceReciever trace;
	
	public SaveError( com.sforce.soap.enterprise.Error[] errors, ITraceReciever trace ){
		this.errors = errors;
		this.trace = trace;
	}
	
	public boolean isNoErrors(){
		return ( (this.errors == null) || (this.errors.length == 0) );
	}
	
	public boolean isWrongLookupError(){
		if ( isNoErrors() ) {
			return false;
		}
		for ( com.sforce.soap.enterprise.Error error : this.errors ) {
			if (error.getMessage().equals("insufficient access rights on cross-reference id")) {
				trace.println("Fix requested for: " + error.getMessage());
				return true;
			}
		}
		return false;
	}
	
	public String[] getErrorFields(){
		if ( isNoErrors() ) {
			return null;
		}
		for ( com.sforce.soap.enterprise.Error error : this.errors ) {
			if (error.getMessage().equals("insufficient access rights on cross-reference id")) {
				return error.getFields();
			}
		}
		return null;
	}
}