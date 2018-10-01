package force.load;

import org.apache.axis.message.RPCElement;
import org.w3c.dom.Element;

import force.ConnectionData;
import force.ITraceReciever;
import force.fObject.fObjectsSet;

public class DataLoader {
	
	private final ConnectionData connectionData;

	public DataLoader( ConnectionData connectionData ){
		this.connectionData = connectionData;
	}
	
	public fObjectsSet loadRawObjects( final String queryStr ) throws Exception {
		RPCElement queryResult = (RPCElement)connectionData.getStub().queryMy( queryStr );
        
        //System.out.println( queryResult.toString() );
        Element elem = queryResult.getAsDOM();
        fObjectsSet set = new fObjectsSet( elem );
        
        return set;//queryResult.getRecords();	
	}
	
	public fObjectsSet loadObjects( String queryStr, ITraceReciever trace ) throws Exception {
		trace.println( queryStr );
		if ( queryStr == null ) {
			trace.println("Error: empty query string");
			return new fObjectsSet(null); 
		}
		fObjectsSet rawObjects = loadRawObjects( queryStr );
		trace.println("HERE size: " + rawObjects.getSize());
		return rawObjects;
	}
}