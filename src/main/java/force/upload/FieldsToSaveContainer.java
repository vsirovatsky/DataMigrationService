package force.upload;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.axis.AxisFault;

import ui.save.ObjectsSaveSelection;

import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

import force.describe.FieldsObtainer;
import force.util.ListUtils;

public class FieldsToSaveContainer {
	
	private final Hashtable<String, List<String>> fieldsHash = new Hashtable<String, List<String>>();
	
	private final SoapBindingStub stub;
	
	private final ObjectsSaveSelection objectsSelection;
	
	private static final String DELIMETER = ", ";
	
	public FieldsToSaveContainer( SoapBindingStub stub, ObjectsSaveSelection objectsSelection ){
		this.stub = stub;
		this.objectsSelection = objectsSelection;
	}

	public List<String> getFieldsToSave( String className ) throws UnexpectedErrorFault, AxisFault, RemoteException{
		System.out.println("!!!!!!!!!!!! CLASSNAME : " + className);
		if ( className == null ) {
			return null;
		}
		List<String> fields = this.fieldsHash.get( className );
		if ( fields == null ) {
			final FieldsObtainer obt = new FieldsObtainer( this.stub );
			fields = obt.getFieldsToSave( className );
			List<String> includedFields = this.objectsSelection.getIncludedFieldsNames(className);
			List<String> fieldsFinal = new ArrayList<String>();
			if ( !ListUtils.isEmptySafe(fields) && !ListUtils.isEmptySafe(includedFields) ) {
				for ( String f : fields ) {
					if ( includedFields.contains(f) ) {
						fieldsFinal.add( f );
						System.out.println("adding field: " + f);
					}
				}
			}
			this.fieldsHash.put( className, fieldsFinal );
		}
		return this.fieldsHash.get( className );
	}
	
	public String getFieldsToSaveAsOneString( String sObjectName ) throws AxisFault, UnexpectedErrorFault, RemoteException {
		final List<String> fields = getFieldsToSave( sObjectName );
		if ( ListUtils.isEmptySafe(fields) ) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for ( String f : fields ) {
			if ( sb.length() > 0) {
				sb.append(DELIMETER);
			}
			sb.append( f );
		}
		return sb.toString();
	}
	
	public boolean isInToSaveFields( String className, String field ) throws UnexpectedErrorFault, AxisFault, RemoteException{
		if ( (className == null) || (field == null) ) {
			return false;
		}
		final List<String> fields = getFieldsToSave(className);
		if ( ListUtils.isEmptySafe(fields) ) {
			return false;
		}
		return fields.contains( field );
	}
}
