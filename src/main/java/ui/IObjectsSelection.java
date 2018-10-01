package ui;

import java.util.List;

public interface IObjectsSelection {

	public List<String> getSelected();
	
	public List<String> getIncludedFieldsNames( String className );
	
}
