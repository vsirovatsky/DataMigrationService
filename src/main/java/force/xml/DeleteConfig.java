package force.xml;

import java.util.ArrayList;
import java.util.List;

public class DeleteConfig {
	
	private final List<String> classesNames = new ArrayList<String>();

	public DeleteConfig(){
		
	}
	
	public List<String> getClassesNames(){
		return this.classesNames;
	}
	
	public void addClass( String className ){
		if ( className != null ) {
			this.classesNames.add(className);
		}
	}
}
