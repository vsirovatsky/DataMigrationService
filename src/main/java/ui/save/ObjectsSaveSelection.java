package ui.save;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import ui.IObjectsSelection;

import force.util.ListUtils;

public class ObjectsSaveSelection implements IObjectsSelection {

	public class SelectedField {
		
		private final String field;
		
		private boolean included;
		
		public SelectedField( String field, boolean included ) {
			this.field = field;
			this.included = included;
		}

		public String getField() {
			return field;
		}

		public boolean isIncluded() {
			return included;
		}
	
		public void setIncluded( boolean included ){
			this.included = included;
		}
	}
	
	private List<String> available = new ArrayList<String>();
	
	private List<String> selected = new ArrayList<String>();
	
	private Hashtable<String, List<SelectedField>> fieldsSelected = new Hashtable<String, List<SelectedField>>(); 
	
	public ObjectsSaveSelection(){
		
	}
	
	public boolean isSelectedPresent(){
		return !this.selected.isEmpty();
	}
	
	public void addAvailable( List<String> data ){
		if ( !ListUtils.isEmptySafe(data) ) {
			available.addAll( data );
		}
	}

	public List<String> getAvailable() {
		return available;
	}
	
	public String getSelectedToPrint() {
		StringBuilder sb = new StringBuilder();
		for ( String s : getSelected() ) {
			if ( sb.length() > 0 ) {
				sb.append(',');
				sb.append(' ');
			}
			sb.append( s );
		}
		return sb.toString();
	}

	public List<String> getSelected() {
		return selected;
	}
	
	public List<SelectedField> getFieldsForClass( String className ){
		if ( className == null ) {
			return null;
		}
		return this.fieldsSelected.get( className );
	}

	public List<String> getIncludedFieldsNames( String className ){
		List<SelectedField> fields = getFieldsForClass(className);
		List<String> result = new ArrayList<String>();
		if ( fields != null ) {
			for ( SelectedField sf : fields ) {
				if ( sf.isIncluded() ) {
					result.add( sf.getField() );
				}
			}
		}
		return result;
	}

	public void addToSelected( String text ){
		if ( text == null ) {
			return;
		}
		if ( !this.selected.contains( text ) ) {
			this.selected.add( text );
			this.fieldsSelected.put( text, new ArrayList<SelectedField>() );
		}
	}
	
	public void setFields( String className, List<String> fields ){
		if ( (className == null) || (fields == null) ) {
			return;
		}
		List<SelectedField> obtained = getFieldsForClass(className);
		if ( obtained != null ) {
			for ( String field : fields ) {
				obtained.add( new SelectedField(field, true) );
			}
		}
	}
	
	public void removeFromSelected( String text ){
		if ( text == null ) {
			return;
		}
		this.selected.remove( text );
		this.fieldsSelected.remove( text );
	}

}
