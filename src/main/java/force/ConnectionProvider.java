package force;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.SessionHeader;
import com.sforce.soap.enterprise.SforceServiceLocator;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.fault.LoginFault;
import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

import force.xml.ParametersLoader;

public class ConnectionProvider {
	
	ConnectionData source = null;
	
	ConnectionData target = null;
	
	public static final ConnectionProvider INSTANCE = new ConnectionProvider();
	
	private ConnectionProvider(){
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public void setSource( ConnectionData source ){
		this.source = source;
	}

	public ConnectionData getSource() throws Exception {
		if ( this.source == null ) {
			this.source = initConnectionData( ParametersLoader.INSTANCE.getSource() );
		}
		return this.source;
	}
	
	public ConnectionData getTarget() throws Exception {
		if ( this.source == null ) {
			this.source = initConnectionData( ParametersLoader.INSTANCE.getTarget() );
		}
		return this.source;
	}
	
	public ConnectionData initConnectionData( LoginData loginData ) {
        String userName = loginData.getLogin();
        String pwd = loginData.getPassword();
        SoapBindingStub binding = null;
        LoginResult lr = null;
        if (userName.length() == 0 || pwd.length() == 0)
            return null;
        else {
            try {
            	binding = (SoapBindingStub) new SforceServiceLocator()
                        .getSoap();
            } catch (ServiceException ex1) {
                System.out.println(ex1.getMessage());
                return null;
            }
			try {
                lr = binding.login(userName, pwd);
            } catch (UnexpectedErrorFault ex2) {
                System.out.println(ex2.getExceptionMessage() + "\n\n");
                return null;
            } catch (LoginFault ex2) {
                System.out.println(ex2.getExceptionMessage() + "\n\n");
                return null;
            } catch (RemoteException ex2) {
                System.out.println(ex2.getMessage() + "\n\n");
                return null;
            }
            System.out.println("Login was successfull.");
            System.out.print("The returned session id is: ");
            System.out.println(lr.getSessionId());
            System.out.print("Your logged in user id is: ");
            System.out.println(lr.getUserId() + " \n\n");

            // on a successful login, you should always set up your session id
            // and the url for subsequent calls

            // reset the url endpoint property, this will cause subsequent calls
            // to made to the serverURL from the login result
            binding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY, lr
                    .getServerUrl());

            // create a session head object
            SessionHeader sh = new SessionHeader();
            // set the sessionId property on the header object using
            // the value from the login result
            sh.setSessionId(lr.getSessionId());
            // add the header to the binding stub
            String sforceURI = new SforceServiceLocator().getServiceName()
                    .getNamespaceURI();
            binding.setHeader(sforceURI, "SessionHeader", sh);
            return new ConnectionData( binding );
        }
	}	
}
