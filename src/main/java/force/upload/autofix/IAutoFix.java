package force.upload.autofix;

import com.sforce.soap.enterprise.sobject.SObject;

import force.ITraceReciever;

public interface IAutoFix {
	
	public boolean fix( SObject[] sObjectsArray, SaveError saveError, ITraceReciever trace ) throws Exception;
	
	public String getTitle();
	
}
