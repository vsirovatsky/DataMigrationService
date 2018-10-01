package force;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


import force.load.DataLoader;

public class QueryGenerator {
	
	private static final String DELIMETER_IN_QUERY = ", ";
	
	private static final char CONCAT_SYMBOL = '_';
	private static final char CUSTOM_CHAR = 'C';
	private static final char CUSTOM_CHAR2 = 'R';
	
	private static final String TO_ADD_CUSTOM_FIELD ="__c";
	private static final String TO_ADD_CUSTOM_FIELD2 ="__r";
	private static final String BLANK_STRING = "";
	private static final String GET_PREFIX = "get";
	
	private static final String[] NOT_ALLOWED_FIELDS = {
		"Attachments",
		"Activity_Histories",
		"Capitalizations__r",
		"Connection_Received",
		"Connection_Sent",
		"Created_By",
		"Events",
		"Histories",
		"Issuances__r",
		"Issuer__r",
		"Last_Modified_By",
		"Liquidation_Include_Derivatives__r",
		"Notes",
		"Notes_And_Attachments",
		"Open_Activities",
		"Process_Instances",
		"Process_Steps",
		"Record_Type",
		"Referenced_Ranked_Security__r",
		"Referenced_Converted_Security__r",
		"Securities1__r",
		"Securities3__r",
		"Securities__r",
		"Share_Authorizations__r",
		"Tags",
		"Tasks",
		"Transactions__r",
		"Underlying_Security__r",
		"Warrant_Schedule1__r",
		"Warrant_Schedule__r",
		"Company__r",
		"LiquidationAnalytics__r",
		"Options__r",
		"SecurityTransactions__r",
		"Shares",
		"StockSplits__r",
		"Owner",
		"CounterpartyInvestor__r",
		"DebtTransactionLots__r",
		"DerivativeTransactionLots__r",
		"Issuance__r",
		"JournalEntryItems__r",
		"MilestoneVesting__r",
		"OptionExpenses__r",
		"RegisteredName__r",
		"SecurityID__c",
		"Security__r",
		"TransactionID__c",
		"TransactionLots1__r",
		"TransactionLots2__r"
	};
	
	private static final Hashtable<String, String> fieldChanges = new Hashtable<String, String>();
	
	static {
		fieldChanges.put("As_Converted_Options_Available__c", "AsConvertedOptionsAvailable__c");
		fieldChanges.put("Authorized_Shares__c", "AuthorizedShares__c");
		fieldChanges.put("Debt_Authorized__c", "DebtAuthorized__c");
		fieldChanges.put("Debt_Issued__c", "DebtIssued__c");
		fieldChanges.put("Diluted_Minus_Convertable__c", "DilutedMinusConvertable__c");
		fieldChanges.put("Equity_Type__c", "EquityType__c");
		fieldChanges.put("Issued_Shares__c", "IssuedShares__c");
		fieldChanges.put("Last_Update__c", "LastUpdate__c");
		fieldChanges.put("Tax_Rate__c", "TaxRate__c");
		fieldChanges.put("Tot_Common_As_Conv__c", "TotCommonAsConv__c");
		fieldChanges.put("Tot_Conv_Debt_As_Conv__c", "TotConvDebtAsConv__c");
		fieldChanges.put("Tot_Options_Available_As_Conv__c", "TotOptionsAvailableAsConv__c");
		fieldChanges.put("Tot_Opts_As_Conv__c", "TotOptsAsConv__c");
		fieldChanges.put("Tot_Ser_Aas_Conv__c", "TotSerAasConv__c");
		fieldChanges.put("Tot_Ser_Bas_Conv__c", "TotSerBasConv__c");
		fieldChanges.put("Tot_Ser_Cas_Conv__c", "TotSerCasConv__c");
		fieldChanges.put("Tot_Ser_Das_Conv__c", "TotSerDasConv__c");
		fieldChanges.put("Tot_Ser_Eas_Conv__c", "TotSerEasConv__c");
		fieldChanges.put("Tot_War_As_Conv__c", "TotWarAsConv__c");
		fieldChanges.put("Total_Issued_Options__c", "TotalIssuedOptions__c");
		fieldChanges.put("Total_War_Common_As_Conv__c", "TotalWarCommonAsConv__c");
		fieldChanges.put("Totals_As_Conv__c", "TotalsAsConv__c");
		fieldChanges.put("Totals_As_Converted_Convertible__c", "TotalsAsConvertedConvertible__c");
		fieldChanges.put("Security_Name__c", "SecurityName__c");
		fieldChanges.put("After_Tax_Interest_Payable__c", "AfterTaxInterestPayable__c");
		
		
	}
	
	private QueryGenerator(){
	}
	
	private static String changeField( String source ){
		if ( source == null ) {
			return null;
		}
		String target = fieldChanges.get( source );
		return (target != null) ? target : source;
	}
	
	public static void main(String[] args) throws Throwable {
		checkBuildQuery();
	}

	/*public static String getAllCapitalizationQueryStr(){
		return queryGetOnClass(AllRounds__Capitalization__c.class);
	}*/
	
	private static boolean isGetMethod( String method ){
		return (method != null) && (method.startsWith(GET_PREFIX));
	}
	
	public static String queryGetOnClass( Class clazz ){
		final StringBuilder sb = new StringBuilder();
		sb.append( "SELECT " );
		sb.append( constructFields(clazz) );
		sb.append( " FROM " );
		sb.append( buildObjectNameOnGetter(clazz.getSimpleName()) );
		return sb.toString();
	}
	
	private static String constructFields( Class clazz ){
		final StringBuilder sb = new StringBuilder();
		sb.append("id");
		for ( Method m : clazz.getDeclaredMethods() ) {
			if ( isGetMethod(m.getName()) ) {
				String field = changeField( buildFieldNameOnGetter(m.getName()) );
				if ( isFieldAllowed( field ) ) {
					sb.append(DELIMETER_IN_QUERY);
					sb.append( field );
				}
			}
		}
		return sb.toString();
	}

	private static boolean isFieldAllowed(String field) {
		if ( field == null ) {
			return false;
		}
		for ( String s : NOT_ALLOWED_FIELDS ) {
			if ( s.equals(field) ) {
				return false;
			}
		}
		return true;
	}

	private static String buildObjectNameOnGetter( String getter ){
		return buildFieldNameOnGetter(getter, 0, true);
	}

	private static String buildFieldNameOnGetter( String getter ){
		return buildFieldNameOnGetter(getter, 3, true);
	}
	
	private static String buildFieldNameOnIs( String is ){
		return buildFieldNameOnGetter(is, 2, true);
	}
	
	private static String buildFieldNameOnGetter( String getter, int startPoint, boolean addUnderline ){
		if ( getter == null ) {
			return BLANK_STRING;
		}
		System.out.println( getter );
		final StringBuilder sb = new StringBuilder();
		if ( getter.startsWith("getAllRounds") ) {
			startPoint = 12;
			sb.append("AllRounds__");
		}
		for ( int i = startPoint; i < getter.length(); i++ ) {
			char c = getter.charAt(i);
			if ( (c == CUSTOM_CHAR) && (i == (getter.length() - 1))) {
				sb.append( TO_ADD_CUSTOM_FIELD );
			} else if ( (c == CUSTOM_CHAR2) && (i == (getter.length() - 1))) {
				sb.append( TO_ADD_CUSTOM_FIELD2 );
			} else {
				if ( addUnderline && (Character.isUpperCase(c)) && (i != startPoint) ) {
					sb.append( CONCAT_SYMBOL );
				}
				sb.append( c );
			}
		}
		return sb.toString();
	}
	
	private static void checkBuildQuery(  ) throws Throwable {
		DataLoader loader = new DataLoader( ConnectionProvider.INSTANCE.getSource() );
		Class clazz = null;//AllRounds__RegisteredName__c.class;
		String clName = buildObjectNameOnGetter(clazz.getSimpleName()); 
		final StringBuilder sbQuery = new StringBuilder();
		final List<String> blocked = new ArrayList<String>();
		int i = 0;
		sbQuery.append("id");
		for ( Method m : clazz.getDeclaredMethods() ) {
			if ( isGetMethod(m.getName()) ) {
				String f = buildFieldNameOnGetter(m.getName(), 3, true);
				if ( !isFieldAllowed( f ) ) {
					continue;
				}
				try {
					loader.loadRawObjects( "SELECT " + f + " FROM " + "AllRounds__RegisteredName__c" + " LIMIT 1" );
					sbQuery.append( DELIMETER_IN_QUERY );
					sbQuery.append(f);
				} catch ( Exception ex ) {
					//ex.printStackTrace();
					f = buildFieldNameOnGetter(m.getName(), 3, false);
					try {
						loader.loadRawObjects( "SELECT " + f + " FROM " + "AllRounds__RegisteredName__c" + " LIMIT 1" );
						sbQuery.append( DELIMETER_IN_QUERY );
						sbQuery.append(f);
					} catch ( Exception ex1 ) {
						blocked.add( f );
						i++;
						System.out.println( i + ": " + f );
					}
				}
			}
		}
		System.out.println( sbQuery.toString() );
	}
}
