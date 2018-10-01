package org.salesforce.quickstart;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.sforce.soap.enterprise.DescribeSObjectResult;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SessionHeader;
import com.sforce.soap.enterprise.SforceServiceLocator;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.fault.LoginFault;
import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;
import com.sforce.soap.enterprise.sobject.SObject;

import force.load.DependenciesCalculator;
import force.load.DependencyNode;
import force.util.AllowedSaveFieldsGenerator;
import force.util.ListUtils;

public class Test {
	
    private SoapBindingStub binding = null;
    
    private LoginResult lr = null; // maintain the login results
    
	public static void main(String[] args) throws Exception {
		final Test test = new Test();
		test.init();
		test.test();
	}
	
	private void init(){
		doLogin();
	}
	
	public void test() throws Exception {
        try {
			//AllowedSaveFieldsGenerator.INSTANCE.generate(binding, "Security__c");
        	/*final DependenciesCalculator calc = new DependenciesCalculator( binding );
        	final List<String> classesNames = new ArrayList<String>();
        	classesNames.add("Capitalization__c");
        	classesNames.add("Security__c");
        	classesNames.add("RegisteredName__c");
        	classesNames.add("Issuance__c");
        	classesNames.add("SecurityTransaction__c");
			List<DependencyNode> refs = calc.getReferences("Capitalization__c", classesNames );
			ListUtils.println(refs);

			refs = calc.getReferences("Security__c", classesNames );
			ListUtils.println(refs);

			refs = calc.getReferences("RegisteredName__c", classesNames );
			ListUtils.println(refs);

			refs = calc.getReferences("Issuance__c", classesNames );
			ListUtils.println(refs);

			refs = calc.getReferences("SecurityTransaction__c", classesNames );
			ListUtils.println(refs);
*/
			/*Field[] fields = descCap.getFields();
			for ( Field f : fields ) {
				System.out.println("--------------");
				System.out.println(f.getName());
				System.out.println(f.getByteLength());
				System.out.println(f.getCalculatedFormula());
				System.out.println(f.getControllerName());
				System.out.println(f.getDefaultValueFormula());
				System.out.println(f.getDigits());
				System.out.println(f.getLabel());
				System.out.println(f.getPrecision());
				System.out.println(f.getRelationshipName());
				System.out.println(f.getScale());
				System.out.println(f.getDependentPicklist());
				System.out.println(f.getExternalId());
				System.out.println(f.getHtmlFormatted());
				System.out.println(f.getNamePointing());
				System.out.println(f.getSortable());
			}
			QueryResult qr = binding.query("SELECT Id, AllRounds__Company__c FROM AllRounds__Capitalization__c LIMIT 1");
			SObject[] recs = qr.getRecords();
			for ( SObject rec : recs ) {
				System.out.println( rec.getId() );
			}*/
        	
        } catch ( Throwable e ) {
        	e.printStackTrace();
        }
	}
	
	private void doLogin() {
	        String userName = "atarimotu2@ok.ru";//"vsirovatsky@all-rounds.com";
	        String pwd = "password124ZeiskZpjfWo4V3OKH2h7OeP";//"vty7uif12rAw4eLjo8ScVoWwVE7uZIILrut";
	        if (userName.length() == 0 || pwd.length() == 0)
	            return;
	        else {
	            try {
	                binding = (SoapBindingStub) new SforceServiceLocator()
	                        .getSoap();
	            } catch (ServiceException ex1) {
	                System.out.println(ex1.getMessage());
	                return;
	            }
	            try {
	                lr = binding.login(userName, pwd);
	            } catch (UnexpectedErrorFault ex2) {
	                System.out.println(ex2.getExceptionMessage() + "\n\n");
	                return;
	            } catch (LoginFault ex2) {
	                System.out.println(ex2.getExceptionMessage() + "\n\n");
	                return;
	            } catch (RemoteException ex2) {
	                System.out.println(ex2.getMessage() + "\n\n");
	                return;
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
	            return;
	        }
	 }
}
