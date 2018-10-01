package force;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis.AxisFault;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.SObject;

public class DataDeleter {

	private final ConnectionData connectionData;
	
	private final ITraceReciever traceReciever;

	public DataDeleter(ConnectionData connectionData, ITraceReciever traceReciever) {
		this.connectionData = connectionData;
		this.traceReciever = traceReciever;
	}
	
	public void deleteAll( final List<String> names ){
		if ( names == null ) {
			return;
		}
		// Delete in reversed order
		for ( int i = names.size()-1; i>=0; i-- ) {
			String name = names.get(i);
			try {
				deleteObjects( name );
				this.traceReciever.println("Deleted objects of : " + name);
			} catch (Throwable e) {
				this.traceReciever.println("Error deleting objects of : " + name);
				this.traceReciever.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	private void deleteObjects(String className) throws Exception {

		String[] idsArray = loadIds(className);
		if ( (idsArray==null) || (idsArray.length==0) ) {
			return;
		}
		this.traceReciever.println("About to delete IDs:");
		int i = 0;
		for ( String s : idsArray ) {
			i++;
			this.traceReciever.println( i + ": " + s );
		}
		int counter = 0;
		final int size = 10;
		String[] ids = getNextLimitIds(idsArray, counter, size);
		while ( ids != null ) {
			try {
				connectionData.getStub().delete(ids);
				System.out.println("made, making next " + counter);
			} catch (Exception e) {
				e.printStackTrace();
			}
			counter++;
			ids = getNextLimitIds(idsArray, counter, size);
		}
	}
	
	private static String[] getNextLimitIds( String[] allIds, int counter, int size ){
		final int startPoint = counter * size;
		if ( startPoint >= allIds.length ) {
			return null;
		}
		int endPoint = (counter + 1) * size - 1;
		if ( allIds.length <= endPoint ) {
			endPoint = allIds.length - 1; 
		}
		int lenthToTake = endPoint - startPoint + 1;
		final String[] ids = new String[ lenthToTake ];
		int j = 0;
		for ( int i = startPoint; i <= endPoint; i++ ) {
			ids[j] = allIds[i];
			j++;
		}
		return ids;
	}
	
	public static void main(String[] args) {
		int totalAmount = 20;
		int size = 10;
		final String[] allIds = new String[totalAmount ];
		for (int i=0; i< totalAmount; i++ ) {
			allIds[i] = "id_" + i;
		}
		String[] ids = null;
		int counter = 0;
		ids = getNextLimitIds(allIds, counter, size);
		System.out.println("result:");
		while ( ids != null ) {
			System.out.println( "length : " + ids.length );
			for ( String s : ids ) {
				System.out.println( s );
			}
			counter++;
			ids = getNextLimitIds(allIds, counter, size);
		}
	}
	
	private String[] loadIds( final String className ) throws AxisFault, RemoteException {
        String queryString = "SELECT Id FROM " + className;
		QueryResult queryResponseDocument = connectionData.getStub().query(queryString);
         
        final SObject[] records = queryResponseDocument.getRecords();
        if ( (records == null) || (records.length==0) ) {
        	return null;
        }
        final String[] ids = new String[ records.length ];
        for ( int i = 0; i<records.length; i++ ) {
        	ids[i] = records[i].getId();
        }
        return ids;
	}
}