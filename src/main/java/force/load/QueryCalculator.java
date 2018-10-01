package force.load;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis.AxisFault;

import ui.load.ObjectsLoadSelection.SelectedField;

import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

import force.StringUtils;
import force.load.query.QueryAppendixFactory;

public class QueryCalculator {

	public static String calculateOnlyIds( String className, List<SelectedField> fields, DependenciesManager depManager, DataLoadedSaver data ) throws Exception {
		final StringBuilder sb = new StringBuilder();
		sb.append( "SELECT Id from " );
		sb.append( className );
		final String fromAppendexes = generateOnAppendexes( className, depManager, data, fields );
		if ( StringUtils.isNotBlank(fromAppendexes)) {
			sb.append(" WHERE ");
			sb.append( fromAppendexes );
		}
		return sb.toString();	
	}
	
	public static String calculate( String className, List<String> fields ) throws Exception {
		final StringBuilder sb = new StringBuilder();
		sb.append("SELECT ");
		boolean comma = false;
		for ( String f : fields ) {
			if ( comma ) {
				sb.append(", ");
			} else {
				comma = true;
			}
			sb.append( f );
		}
		sb.append(" FROM ");
		sb.append( className );
		return sb.toString();	
	}

	public static String calculate( String className, List<SelectedField> fields, DependenciesManager depManager, DataLoadedSaver data ) throws Exception {
		//if ( true ) {
		//	return "SELECT Id, OwnerId, IsDeleted, Name, RecordTypeId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, LastActivityDate, Account_Address__c, Account_Name__c, AmountIssued__c, AsConvertedDebt__c, Board_Approvals__c, Board_of_Directors__c, CalculatedSharePrice__c, CalculatorType__c, Capitalization__c, CloseDate__c, Co_Sale_Agreement__c, Conversion_Ratio__c, ConvertConvertibleDebt__c, Convert_Debt_Amount__c, Demand_Registration_Percent__c, Demand_Registration_Threshold__c, EnterSharePrice__c, Execution_days__c, Expected_Close_Date__c, FullyDilutedCalc__c, FullyDilutedShares__c, FullyminusConvCalc__c, ImputedNewShares__c, Issuance_Name__c, IssueStatus__c, Issue_Amount__c, Key_Employee_Compensation__c, Key_Employee_Severance__c, LastUpdateTimestamp__c, Lead_Investor_List__c, Legal_Fees__c, NewPostMoneyShares__c, NextFinancingDate__c, OptionBump__c, OptionPlanTargetPct__c, OptionPlanTarget__c, OptionsAvailable__c, OptionsOutstanding__c, Percent_to_Amend__c, PostMoneyShare__c, PreMoneyShares__c, Proposed_Issue_Amount__c, Security_Name__c, Security_Type__c, Security__c, Security_pref_Percent__c, Share_Price__c, SharesIssued__c, Term_Sheet_Date__c, Total_Amount_Raised__c, UpdateOnly__c, Use_of_Proceeds__c, ValuationMethod__c, Valuation__c, Fundraising_Maximum__c, Fundraising_Minimum__c, Fundraising__c FROM Issuance__c WHERE Capitalization__c IN ('a02A0000001HRe8IAG','a02A0000001HRdPIAW') AND Security__c IN ('a0OA00000008nlqMAA','a0OA00000008nlmMAA','a0OA00000008nm8MAA','a0OA00000008nlpMAA','a0OA00000008nlsMAA','a0OA00000008nmNMAQ','a0OA00000008nlrMAA')";
		//}
		final StringBuilder sb = new StringBuilder();
		sb.append( generateSelectAllForClass(className, fields) );
		final String fromAppendexes = null;//generateOnAppendexes( className, depManager, data, fields );
		if ( StringUtils.isNotBlank(fromAppendexes)) {
			sb.append(" WHERE ");
			sb.append( fromAppendexes );
		}
		return sb.toString();	
	}
	
	private static String generateOnAppendexes(String className, DependenciesManager depManager, DataLoadedSaver data, List<SelectedField> fields) throws Exception {
		final StringBuilder sb = new StringBuilder();
		//if ( sb != null ) {
		//	return null;
		//}
		//final List<String> appendexesValues = QueryAppendixFactory.INSTANCE.createWithValues(className, fields);
		Boolean addGlobalAnd = false;
		/*if ( !appendexesValues.isEmpty() ) {
			boolean addAnd = false;
			for ( String s : appendexesValues ) {
				if ( StringUtils.isBlank(s)) {
					continue;
				}
				if ( addAnd ) {
					sb.append(" AND ");
				} else {
					addAnd = true;
				}
				sb.append( s );
				addGlobalAnd = true;
			}
		}*/
		/*if ( "AllRounds__Capitalization__c".equals( className ) ) {
			addGlobalAnd = true;
			sb.append( "Id in ('a0A5000000428qH','a0A500000041wDo')" );
		}*/

		final List<String> appendexes = QueryAppendixFactory.INSTANCE.create( className, depManager, data );
		if ( !appendexes.isEmpty() ) {
			boolean addAnd = false;
			boolean placed = false;
			for ( String s : appendexes ) {
				if ( StringUtils.isBlank(s)) {
					continue;
				}
				if ( addGlobalAnd ) {
					sb.append(" AND ");
					sb.append("(");
					placed = true;
					addGlobalAnd = false;
				}
				if ( addAnd ) {
					sb.append(" OR ");
				} else {
					addAnd = true;
				}
				sb.append( s );
			}
			if ( placed ) {
				sb.append(")");
			}
		}
		
		return sb.toString();
	}
	private static String generateSelectAllForClass( String className, List<SelectedField> fields ) throws Exception {
		final StringBuilder sb = new StringBuilder();
		sb.append("SELECT ");
		sb.append( getAsOneString( fields ) );
		sb.append(" FROM ");
		sb.append( className );
		return sb.toString();
	}
	
	private static String getAsOneString( List<SelectedField> fields ) throws AxisFault, UnexpectedErrorFault, RemoteException {
		final StringBuilder sb = new StringBuilder();
		for ( SelectedField f : fields ) {
			if ( sb.length() > 0) {
				sb.append(", ");
			}
			sb.append( f.getField() );
		}
		return sb.toString();
	}
}
