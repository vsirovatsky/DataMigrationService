package force.custom.capitalization;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import force.fObject.fObject;
import force.xls.XLSReadData;
import force.xls.XLSReader;

public class ClassesLoader {
	
	private Hashtable<String, List<fObject>> data = new Hashtable<String, List<fObject>>();

	public ClassesLoader( String inputFile ) throws ClassNotFoundException{
		XLSReader reader = new XLSReader( inputFile );
		List<String> names = reader.getClassesNames();
		for ( String name : names ) {
			XLSReadData obtained = reader.readData( name );
			data.put(name, obtained.generateObjectsRaw() );
		}
	}
	
	public Set<String> getClassesNames() {
		return this.data.keySet();
	}
	
	public List<fObject> getObjects( String className ){
		return this.data.get( className );
	}
}
