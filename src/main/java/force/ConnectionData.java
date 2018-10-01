package force;

import com.sforce.soap.enterprise.SoapBindingStub;

public class ConnectionData {

	final private SoapBindingStub stub;

	public ConnectionData(SoapBindingStub stub) {
		this.stub = stub;
	}

	public SoapBindingStub getStub() {
		return stub;
	}
}
