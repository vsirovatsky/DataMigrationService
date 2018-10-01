package force.upload;

import java.util.Hashtable;

public class UploadingDataStorage {

	private final Hashtable<String, String> idsMap = new Hashtable<String, String>();
	
	public void put( String oldId, String newId ){
		this.idsMap.put(oldId, newId);
	}
	
	public String getNewId( String oldId ){
		return (oldId != null) ? this.idsMap.get(oldId) : null;
	}

	public String getOldId( String newId ){
		if ( newId == null ) {
			return null;
		}
		for ( String s : this.idsMap.values() ) {
			if ( newId.equals(s) ) {
				return s;
			}
		}
		return null;
	}
}
