package force.custom;

import force.ConnectionData;
import force.ITraceReciever;

public interface IScenario {

	public void perform(ConnectionData connectionData, String fileName, ITraceReciever trace) throws Throwable;
	
}
