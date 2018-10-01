package force.util;

import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.PicklistEntry;

public class CommonUtils {

	public static void printField( Field f ){
		if ( f == null ) {
			return;
		}
		System.out.println("-------" + f.getName() + "---------");
		System.out.println("f.getCalculatedFormula();" + f.getCalculatedFormula()); 
		System.out.println("f.getControllerName();" + f.getControllerName()); 
		System.out.println("f.getDefaultValueFormula();" + f.getDefaultValueFormula());
		System.out.println("f.getDependentPicklist();" + f.getDependentPicklist());
		System.out.println("f.getDigits();" + f.getDigits());
		System.out.println("f.getExternalId();" + f.getExternalId());
		System.out.println("f.getHtmlFormatted();" + f.getHtmlFormatted());
		System.out.println("f.getInlineHelpText();" + f.getInlineHelpText());
		System.out.println("f.getLabel();" + f.getLabel());
		System.out.println("f.getLength();" + f.getLength());
		System.out.println("f.getName();" + f.getName());
		System.out.println("f.getNamePointing();" + f.getNamePointing()); 
		System.out.println("f.getPrecision();" + f.getPrecision());
		System.out.println("f.getRelationshipName();" + f.getRelationshipName());
		System.out.println("f.getRelationshipOrder();" + f.getRelationshipOrder());
		System.out.println("f.getScale();" + f.getScale());
		System.out.println("f.getSoapType();" + f.getSoapType());
		System.out.println("f.getSortable();" + f.getSortable());
		System.out.println("f.getType();" + f.getType());
		System.out.println("f.getWriteRequiresMasterRead();" + f.getWriteRequiresMasterRead());
	    System.out.println("f.isAutoNumber();" + f.isAutoNumber());
	    System.out.println("f.isCalculated();" + f.isCalculated());
	    System.out.println("f.isCaseSensitive();" + f.isCaseSensitive());
	    System.out.println("f.isCreateable();" + f.isCreateable());
	    System.out.println("f.isCustom();" + f.isCustom());
	    System.out.println("f.isDefaultedOnCreate();" + f.isDefaultedOnCreate());
	    System.out.println("f.isDeprecatedAndHidden();" + f.isDeprecatedAndHidden());
	    System.out.println("f.isFilterable();" + f.isFilterable());
	    System.out.println("f.isIdLookup();" + f.isIdLookup());
	    System.out.println("f.isNameField();" + f.isNameField());
	    System.out.println("f.isNillable();" + f.isNillable());
	    System.out.println("f.isRestrictedPicklist();" + f.isRestrictedPicklist());
	    System.out.println("f.isUnique();" + f.isUnique());
	    System.out.println("f.isUpdateable();" + f.isUpdateable());
		
		String[] refs = f.getReferenceTo();
		if ( (refs != null) && (refs.length>0) ) {
			System.out.println("getReferenceTo:");
			ListUtils.println(refs);
		}
		
		PicklistEntry[] values = f.getPicklistValues();
		if ( (values != null) && (values.length>0) ) {
			System.out.println( "picklist size: " +values.length );
			for ( PicklistEntry en : values ) {
				System.out.println( "value: " + en.getValue() );
			}
		}
		
		System.out.println("");
	}
	
}
