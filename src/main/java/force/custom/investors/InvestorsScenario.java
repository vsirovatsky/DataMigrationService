package force.custom.investors;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import force.ConnectionData;
import force.ITraceReciever;
import force.StringUtils;
import force.custom.IScenario;
import force.fObject.fObject;
import force.fObject.fObjectsSet;
import force.load.DataLoader;
import force.upload.DataUploader;

public class InvestorsScenario implements IScenario {

	private DataUploader uploader = null;
	
	private DataLoader loader = null;
	
	private Hashtable<String, List<fObject>> data = new Hashtable<String, List<fObject>>();
	
	public InvestorsScenario(){
		
	}

	@Override
	public void perform(ConnectionData connectionData, String fileName,
			ITraceReciever trace) throws Throwable {
		
		this.uploader = new DataUploader( connectionData );
		this.loader = new DataLoader( connectionData );
		
		ClassesLoader loader = new ClassesLoader( fileName );
		
		for( String s : loader.getClassesNames() ){
			List<fObject> objs = loader.getObjects(s);
			trace.println( s + " size: " + objs.size() );
			data.put(s, objs);
		}
		List<fObject> invObjects = data.get("Investors");
		uploadInvestors(invObjects, trace);
	}
	
	private void uploadInvestors( List<fObject> invObjects, ITraceReciever trace ) throws Exception {
		List<fObject> accounts = new ArrayList<fObject>();
		List<fObject> contacts = new ArrayList<fObject>();
		Hashtable<fObject,fObject> contactToAccounts = new Hashtable<fObject, fObject>();
		for ( fObject f : invObjects ) {
			fObject acc = makeAccount( f );
			accounts.add( acc );
			fObject cont = makeContact( f );
			contacts.add( cont );		
			contactToAccounts.put(cont, acc);
		}
		
		List<fObject> localSubSet = new ArrayList<fObject>();
		Integer count = 0;
		Integer globalCount = 0;
		for (fObject obj : accounts) {
			count++;
			globalCount++;
			localSubSet.add(obj);
			if ( (count < 200) && (globalCount < accounts.size()) ) {
				continue;
			} else {
				count = 0;
			}	
			List<String> newIds = uploader.saveGetIds(localSubSet, trace);
			for (Integer i = 0; i < localSubSet.size(); i++) {
				localSubSet.get(i).setId( newIds.get(i) );
			}
			localSubSet = new ArrayList<fObject>();
		}

		for ( fObject cont : contacts ) {
			fObject acc = contactToAccounts.get( cont );
			cont.set("AccountId", acc.getId());
		}
		
		localSubSet = new ArrayList<fObject>();
		count = 0;
		globalCount = 0;
		for (fObject obj : contacts) {
			count++;
			globalCount++;
			localSubSet.add(obj);
			if ( (count < 200) && (globalCount < accounts.size()) ) {
				continue;
			} else {
				count = 0;
			}	
			uploader.saveGetIds(localSubSet, trace);
			localSubSet = new ArrayList<fObject>();
		}
	}
	
	private fObject makeAccount( fObject obj ){
		fObject acc = new fObject( "Account" );
		acc.set("Name", obj.getValue("Investor Name"));
		acc.set("Type", obj.getValue("Firm Type"));

		String street = obj.getValue("HQ Address 1");
		String street2 = obj.getValue("HQ Address 2");
		if ( StringUtils.isNotBlank(street2) ) {
			street += ", " + street2;
		}
		acc.set("BillingStreet", street);
		acc.set("BillingCity", obj.getValue("HQ City"));
		acc.set("BillingState", obj.getValue("HQ State"));
		acc.set("BillingPostalCode", obj.getValue("HQ Zip"));
		acc.set("BillingCountry", obj.getValue("HQ Country"));

		acc.set("ShippingStreet", street);
		acc.set("ShippingCity", obj.getValue("HQ City"));
		acc.set("ShippingState", obj.getValue("HQ State"));
		acc.set("ShippingPostalCode", obj.getValue("HQ Zip"));
		acc.set("ShippingCountry", obj.getValue("HQ Country"));

		acc.set("Phone", obj.getValue("Phone"));
		//acc.set("Fax", obj.getValue("Firm Type"));
		acc.set("Website", obj.getValue("URL"));
		//acc.set("Industry", obj.getValue("Firm Type"));
		acc.set("AnnualRevenue", obj.getValue("Assets (USD)"));
		//acc.set("NumberOfEmployees", obj.getValue("Firm Type"));
		acc.set("Description", obj.getValue("Firm Type"));
		return acc;
	}

	private fObject makeContact( fObject obj ){
		fObject cont = new fObject( "Contact" );
		String lastName = obj.getValue("Contact Last Name");
		String firstName = obj.getValue("Contact First Name");
		if ( StringUtils.isBlank(lastName) ) {
			lastName = "Unknown";
		}
		if ( StringUtils.isBlank(firstName) ) {
			firstName = "Contact";
		}
		cont.set("LastName", lastName);
		cont.set("FirstName", firstName);
		//cont.set("Salutation", obj.getValue(""));
		//cont.set("Name", obj.getValue(""));

		String street = obj.getValue("Contact Address 1");
		String street2 = obj.getValue("Contact Address 2");
		if ( StringUtils.isNotBlank(street2) ) {
			street += ", " + street2;
		}
		cont.set("MailingStreet", street);
		cont.set("MailingCity", obj.getValue("Contact City"));
		cont.set("MailingState", obj.getValue("Contact State"));
		cont.set("MailingPostalCode", obj.getValue("Contact Zip"));
		cont.set("MailingCountry", obj.getValue("Contact Country"));
		
		cont.set("Phone", obj.getValue("Contact Phone"));
		cont.set("Fax", obj.getValue("Contact Fax"));
		cont.set("Email", obj.getValue("Contact Email"));
		return cont;
	}
	
	private void updateAndUploadSecurity( List<fObject> capObjects, fObject cap, ITraceReciever trace ) throws Exception {
		for ( fObject s : capObjects ) {
			s.set("CapMan__Issuer__c", cap.getId());
		}
		final List<fObject> withoutUnderlined = new ArrayList<fObject>();
		final List<fObject> withUnderlined = new ArrayList<fObject>();
		for ( fObject f : capObjects ) {
			String secType = f.getValue("CapMan__Security_Type__c");
			String shares = f.getValue("CapMan__Shares__c");
			if ( "Equity".equals(secType) ) {
				f.set("CapMan__AuthorizedSecurities__c", shares);
			} else if ( "Option".equals(secType) ) {
				f.set("CapMan__optionsauthorized__c", shares);
			} else if ( "Warrant".equals(secType) ) {
				f.set("CapMan__warrantsauthorized__c", shares);
			} else if ( "Debt".equals(secType) || "ConvertibleDebt".equals(secType) ) {
				f.set("CapMan__debtauthorized__c", shares);
			}
			String value = f.getValue( "CapMan__Underlying_Security__c" );
			if ( StringUtils.isBlank( value ) ) {
				withoutUnderlined.add( f );
			} else {
				withUnderlined.add( f );
			}
			f.set("CapMan__SecurityName__c", f.getValue("Name"));
		}
		for ( fObject f : withoutUnderlined ) {
			String id = this.uploader.saveGetId(f, trace);
			f.setId( id );
		}
		for ( fObject f : withUnderlined ) {
			String value = f.getValue( "CapMan__Underlying_Security__c" );
			if ( value == null ) {
				continue;
			}
			for ( fObject f1 : withoutUnderlined ) {
				if ( value.equals(f1.getValue("Name")) ) {
					 f.set("CapMan__Underlying_Security__c", f1.getId());
					 break;
				}
			}
		}
		for ( fObject f : withUnderlined ) {
			String id = this.uploader.saveGetId(f, trace);
			f.setId( id );
		}
	}
	
	private void updateAndUploadIssuances( List<fObject> issuances, fObject cap,  List<fObject> securities, ITraceReciever trace ) throws Exception {
		for ( fObject f : issuances ) {
			String price = f.getValue("CapMan__EnterSharePrice__c");
			f.set("CapMan__CalculatedSharePrice__c", price);
			f.set("CapMan__Capitalization__c", cap.getId());
			String secName = f.getValue("CapMan__Security__c");
			if ( StringUtils.isNotBlank(secName)) {
				for ( fObject s : securities ) {
					if ( secName.equals(s.getValue("Name"))){
						f.set("CapMan__Security__c", s.getId());
						break;
					}
				}
			}
			String issueStatus = f.getValue("CapMan__IssueStatus__c");
			if ( "Issued".equals(issueStatus) ) {
				f.set("CapMan__CloseDate__c", f.getValue("CapMan__NextFinancingDate__c"));
			}
		}
		for ( fObject f : issuances ) {
			String id = this.uploader.saveGetId(f, trace);
			f.setId( id );
		}
	}

	private void testik( List<fObject> secTransactions, ITraceReciever trace ) throws Exception {
		fObject secTrans = secTransactions.get(0);
		final String type = secTrans.getValue("CapMan__Investor_Type__c");
		secTrans.removeValue("CapMan__Investor_Type__c");
		if ( StringUtils.isBlank(type) ) {
			secTrans.removeValue( "Registered Name" );
			return;
		}
		final boolean conType = isContactType(type);
		final String value = secTrans.getValue("Registered Name");
		secTrans.removeValue( "Registered Name" );
		secTrans.set("CapMan__Issuer__c", "a02A00000022jLR");
		secTrans.set("CapMan__Security__c", "a0OA0000000C7qx");
		secTrans.set("CapMan__Issuance__c", "a08A0000003Ar7f");
		secTrans.set("CapMan__RegisteredName__c", "a0LA00000006bTB");
		String id = this.uploader.saveGetId(secTrans, trace);
		trace.println("" + id);
	}
	
	private void updateAndUploadTransaction( List<fObject> secTransactions, List<fObject> issuances, fObject cap,  List<fObject> securities, ITraceReciever trace ) throws Exception {
		String queryStr = "SELECT Id, Name, CapMan__Contact__c, CapMan__NameText__c, CapMan__Investor_Type__c, CapMan__Account_Name__c, CapMan__Account__c FROM CapMan__RegisteredName__c";
		List<fObject> regNamesSet = this.loader.loadObjects(queryStr , trace).getObjects();
		String queryStr2 = "SELECT Id, Name FROM Account";
		fObjectsSet accountsSet = this.loader.loadObjects(queryStr2 , trace);
		String queryStr3 = "SELECT Id, FirstName, LastName FROM Contact";
		fObjectsSet contactsSet = this.loader.loadObjects(queryStr3 , trace);
		final Hashtable<String, fObject> accountsHash = new Hashtable<String, fObject>();
		final Hashtable<String, fObject> contactsHash = new Hashtable<String, fObject>();
		for ( fObject f : accountsSet.getObjects() ) {
			accountsHash.put(f.getValue("Name"), f);
		}
		for ( fObject f : contactsSet.getObjects() ) {
			contactsHash.put(f.getValue("FirstName") + ' ' + f.getValue("LastName"), f);
		}
		Integer i = 0;
		for ( fObject f : secTransactions ) {
			try {
			f.set("CapMan__Issuer__c", cap.getId());
			String issName = f.getValue("CapMan__Issuance__c");
			if ( StringUtils.isNotBlank(issName)) {
				for ( fObject iss : issuances ) {
					if (issName.equals(iss.getValue("Name"))){
						f.set("CapMan__Issuance__c", iss.getId());
						break;
					}
				}
			}
			String secName = f.getValue("CapMan__Security__c");
			if ( StringUtils.isNotBlank(secName) ) {
				for ( fObject sec : securities ) {
					if ( secName.equals(sec.getValue("Name")) ) {
						f.set("CapMan__Security__c", sec.getId());
						break;
					}
				}
			}
			makeWithInvestor(f, regNamesSet, accountsHash, contactsHash, trace);
			String id = this.uploader.saveGetId(f, trace);
			f.setId( id );
			i++;
			} catch (Throwable ex) {
				System.out.println("Problem with Security Transaction #" + i);
				ex.printStackTrace();
			}
		}
	}
	
	private void makeWithInvestor(fObject secTrans, List<fObject> regNamesSet,
			Hashtable<String, fObject> accountsHash, Hashtable<String, fObject> contactsHash, ITraceReciever trace) throws Exception {
		final String type = secTrans.getValue("CapMan__Investor_Type__c");
		secTrans.removeValue("CapMan__Investor_Type__c");
		if ( StringUtils.isBlank(type) ) {
			secTrans.removeValue( "Registered Name" );
			return;
		}
		final boolean conType = isContactType(type);
		final String value = secTrans.getValue("Registered Name");
		secTrans.removeValue( "Registered Name" );
		boolean foundRegName = false;
		for ( fObject f : regNamesSet ) {
			if ( conType && value.equals(f.getValue("CapMan__NameText__c"))) {
				secTrans.set("CapMan__RegisteredName__c", f.getId());
				foundRegName = true;
				break;
			}
			if ( !conType && value.equals(f.getValue("CapMan__Account_Name__c"))) {
				secTrans.set("CapMan__RegisteredName__c", f.getId());
				foundRegName = true;
				break;
			}
		}
		if ( foundRegName ) {
			return;
		}
		fObject regName = null;
		if ( conType ) {
			fObject contact = contactsHash.get( value );
			if ( contact == null ) {
				contact = new fObject("Contact");
				String[] tokens = value.split(" ");
				contact.set("FirstName", tokens[0]);
				contact.set("LastName", tokens[1]);
				String id = this.uploader.saveGetId(contact, trace);
				contact.setId( id );
				contactsHash.put(value, contact);
			}
			regName = new fObject("CapMan__RegisteredName__c");
			regName.set("CapMan__Contact__c", contact.getId());
			regName.set("CapMan__NameText__c", value);
		} else {
			fObject account = accountsHash.get( value );
			if ( account == null ) {
				account = new fObject("Account");
				account.set("Name", value);
				String id = this.uploader.saveGetId(account, trace);
				account.setId( id );
				accountsHash.put(value, account);
			}
			regName = new fObject("CapMan__RegisteredName__c");
			regName.set("CapMan__Account__c", account.getId());
			regName.set("CapMan__Account_Name__c", value);
		}
		regName.set("CapMan__Investor_Type__c", type);
		String id = this.uploader.saveGetId(regName, trace);
		regName.setId( id );
		secTrans.set("CapMan__RegisteredName__c", regName.getId());
		regNamesSet.add( regName );
	}

	private boolean isContactType( String type ){
		if ( "Individual Investor".equals(type) || "Employee".equals(type) ) {
			return true;
		} else {
			return false;
		}
	}
}
