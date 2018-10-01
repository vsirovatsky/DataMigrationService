package force.describe;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class RestrictedFields {

	private final Hashtable<String, List<String>> fields = new Hashtable<String, List<String>>();
	
	public static final RestrictedFields INSTANCE = new RestrictedFields();
	
	private RestrictedFields(){
		final List<String> AllRounds__Security__cList = new ArrayList<String>();
		AllRounds__Security__cList.add("AllRounds__Section83b__c");
		fields.put("AllRounds__Security__c", AllRounds__Security__cList);

		final List<String> Security__cList = new ArrayList<String>();
		Security__cList.add("Section83b__c");
		fields.put("Security__c", Security__cList);
		
		final List<String> SecurityTransaction__cList = new ArrayList<String>();
		SecurityTransaction__cList.add("checksum__c");
		fields.put("SecurityTransaction__c", SecurityTransaction__cList);	
		
		final List<String> RegisteredName__cList = new ArrayList<String>();
		RegisteredName__cList.add("isAccredited__c");
		RegisteredName__cList.add("isEntity__c");
		RegisteredName__cList.add("isInvestor__c");
		RegisteredName__cList.add("isInvestor__c");
		RegisteredName__cList.add("isInvestor__c");
		RegisteredName__cList.add("isInvestor__c");
		fields.put("RegisteredName__c", RegisteredName__cList);	
		
		final List<String> account__cList = new ArrayList<String>();
		account__cList.add("RecordTypeId");
		fields.put("Account", account__cList);
	}
	
	private final static String[] staticFields = {
		"IsPersonType",
		"LastModifiedById",
		"IsActive",
		"SystemModstamp",
		"CreatedById",
		"CreatedDate",
		"LastModifiedDate",
		"IsPersonType",
		"LastModifiedById",
		"IsActive",
		"SystemModstamp",
		"CreatedById",
		"CreatedDate",
		"LastModifiedDate",
		"OwnerId",
		"RecordTypeId"
	};
	
	public boolean isRestricted( String className, String field ){
		if ( (className == null) || (field == null) ) {
			return false;
		}
		for ( String f : staticFields ) {
			if ( f.equals(field) ) {
				return true;
			}
		}
		final List<String> fields = this.fields.get(className);
		if ( fields == null ) {
			return false;
		}
		return fields.contains(field);
	}
}
