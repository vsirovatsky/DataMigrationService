package force.describe;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

import com.sforce.soap.enterprise.DescribeGlobalResult;
import com.sforce.soap.enterprise.DescribeGlobalSObjectResult;
import com.sforce.soap.enterprise.SoapBindingStub;

public class ClassesObtainer {
	
	public class AvailableToLoadClasses {
		
		private final List<String> standard = new ArrayList<String>();
		
		private final List<String> custom = new ArrayList<String>();
		
		public List<String> getStandard() {
			return standard;
		}

		public List<String> getCustom() {
			return custom;
		}

		public AvailableToLoadClasses(){}
		
		public void addCustom( String name ){
			this.custom.add(name);
		}
		
		public void addStandard( String name ){
			this.standard.add(name);
		}
	}

	private final SoapBindingStub stub;

	public ClassesObtainer(SoapBindingStub stub) {
		this.stub = stub;
	}
	
	public ClassesObtainer() {
		this.stub = null;
	}
	
	public AvailableToLoadClasses getAvailableToLoadClasses() throws AxisFault, RemoteException {
		AvailableToLoadClasses cl = new AvailableToLoadClasses();
		if ( this.stub == null ) {
			return cl;
		}
		final DescribeGlobalResult result = stub.describeGlobal();
		final DescribeGlobalSObjectResult[] sObjects = result.getSobjects();
		if ( (sObjects != null) && (sObjects.length > 0) ) {
			for ( DescribeGlobalSObjectResult sObject : sObjects ) {
				if ( sObject.isCustom() ) {
					cl.addCustom( sObject.getName() );
				} else {
					cl.addStandard( sObject.getName() );
				}
			}
		}
		return cl;
	}		
}
