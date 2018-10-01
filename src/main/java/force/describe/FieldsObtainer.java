package force.describe;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

import com.sforce.soap.enterprise.DescribeSObjectResult;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

public class FieldsObtainer {

	private static final String DELIMETER = ", ";
	
	private final SoapBindingStub stub;
	
	public FieldsObtainer( SoapBindingStub stub ){
		this.stub = stub;
	}
	
	public List<String> getFieldsToLoad( String sObjectName ) throws AxisFault, UnexpectedErrorFault, RemoteException {
		final List<String> fieldNames = new ArrayList<String>();
		final DescribeSObjectResult describe = this.stub.describeSObject( sObjectName );
		for ( Field f : describe.getFields() ) {
			if ( !f.isDeprecatedAndHidden() && !RestrictedFields.INSTANCE.isRestricted(sObjectName, f.getName())) {
				fieldNames.add( f.getName() );
			}
		}
		return fieldNames;
	}
	
	public String getFieldsToLoadAsOneString( String sObjectName ) throws AxisFault, UnexpectedErrorFault, RemoteException {
		final List<String> fields = getFieldsToLoad( sObjectName );
		final StringBuilder sb = new StringBuilder();
		for ( String f : fields ) {
			if ( sb.length() > 0) {
				sb.append(DELIMETER);
			}
			sb.append( f );
		}
		return sb.toString();
	}
	
	public List<String> getFieldsToSave( String sObjectName ) throws AxisFault, UnexpectedErrorFault, RemoteException {
		final List<String> fieldNames = new ArrayList<String>();
		final DescribeSObjectResult describe = this.stub.describeSObject( sObjectName );
		for ( Field f : describe.getFields() ) {
			if ( !f.isDeprecatedAndHidden() && f.isCreateable() && !RestrictedFields.INSTANCE.isRestricted(sObjectName, f.getName())) {
			//if ( !f.isDeprecatedAndHidden() && !RestrictedFields.INSTANCE.isRestricted(sObjectName, f.getName())) {
				fieldNames.add( f.getName() );
			}
		}
		return fieldNames;
	}
	
	public String getFieldsToSaveAsOneString( String sObjectName ) throws AxisFault, UnexpectedErrorFault, RemoteException {
		final List<String> fields = getFieldsToSave( sObjectName );
		final StringBuilder sb = new StringBuilder();
		for ( String f : fields ) {
			if ( sb.length() > 0) {
				sb.append(DELIMETER);
			}
			sb.append( f );
		}
		return sb.toString();
	}
}
