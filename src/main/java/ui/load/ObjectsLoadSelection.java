package ui.load;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import ui.IObjectsSelection;

import force.describe.ClassesObtainer.AvailableToLoadClasses;
import force.util.ListUtils;

public class ObjectsLoadSelection implements IObjectsSelection {
	
	public class SelectedField {
		
		private final String field;
		
		private boolean included;
		
		private String value;
		
		public SelectedField( String field, boolean included ) {
			this.field = field;
			this.included = included;
			this.value = null;
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

		public void setValue(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
		
		public boolean isValue(){
			return (this.value != null );
		}
	}
	
	private List<String> availableCustom = new ArrayList<String>();
	
	private List<String> availableStandard = new ArrayList<String>();
	
	private List<String> selected = new ArrayList<String>();
	
	private Hashtable<String, List<SelectedField>> fieldsSelected = new Hashtable<String, List<SelectedField>>(); 
	
	public ObjectsLoadSelection(){
		
	}
	
	public boolean isSelectedPresent(){
		return !this.selected.isEmpty();
	}
	
	public void setAvailable( AvailableToLoadClasses data ){
		if ( data == null ) {
			return;
		}
		if ( !ListUtils.isEmptySafe(data.getCustom()) ) {
			availableCustom.addAll( data.getCustom() );
		}
		if ( !ListUtils.isEmptySafe(data.getStandard()) ) {
			availableStandard.addAll( data.getStandard() );
		}
	}

	public List<String> getAvailableCustom() {
		return availableCustom;
	}
	
	public List<String> getAvailableStandard() {
		return availableStandard;
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

	public List<SelectedField> getIncludedFields( String className ){
		List<SelectedField> fields = getFieldsForClass(className);
		List<SelectedField> result = new ArrayList<SelectedField>();
		if ( fields != null ) {
			for ( SelectedField sf : fields ) {
				if ( sf.isIncluded() ) {
					result.add( sf );
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
