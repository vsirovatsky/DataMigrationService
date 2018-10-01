package force.fObject;

import java.util.List;

import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.RPCElement;

import force.StringUtils;

public class RPCElementBuilder {
	
	public static RPCElement create( List<fObject> objs ) throws SOAPException {
		RPCElement elem = new RPCElement("urn:enterprise.soap.sforce.com", "ns1:create", null );
		for ( fObject f : objs ) {
			addSingleElement( f, elem );
		}
		return elem;
	}
	
	private static void addSingleElement( fObject obj, RPCElement elem ) throws SOAPException {
		SOAPElement subElem = elem.addChildElement("ns1:sObjects");
		
		Name name = null;
		
		//name = new PrefixedQName(null, "arrayType", "soapenc");
		//subElem.addAttribute(name,"ns2:sObject[1]");
		
		//name = new PrefixedQName(null, "type", "xsi");
		//subElem.addAttribute(name,"soapenc:Array");
		name = new PrefixedQName(null, "type", "xsi");
		subElem.addAttribute(name,"ns2:" + obj.getName());
		
		name = new PrefixedQName(null, "ns2", "xmlns");
		subElem.addAttribute(name,"urn:sobject.enterprise.soap.sforce.com");

		name = new PrefixedQName(null, "soapenc", "xmlns");
		subElem.addAttribute(name,"http://schemas.xmlsoap.org/soap/encoding/");

		name = new PrefixedQName(null, "xsi", "xmlns");
		subElem.addAttribute(name,"http://www.w3.org/2001/XMLSchema-instance");
		
		//SOAPElement subElem1 = subElem.addChildElement("ns1:sObjects");
		
		
		
		for ( String field : obj.getFields() ) {
			String value = obj.getValue(field);
			if ( StringUtils.isBlank(value) || ("null".equalsIgnoreCase(value)) ) {
				continue;
			}
			//ZOBO: TEMPORARY
			//if ( field.equals("Pathfinder__Answer_Date__c") ) {
			//	String[] parts = value.split(" ");
			//	if ( (parts == null) || (parts.length < 3)) {
			//		continue;
			//	}
			//	value = parts[2] + '-' + parts[1] + '-' + parts[0];
			//}
			SOAPElement fieldElem1 = subElem.addChildElement(field,"");
			//name = new PrefixedQName(null, "type", "xsi");
			//fieldElem1.addAttribute(name,"xsd:double");
			name = new PrefixedQName(null, "xmlns", "xsd");
			fieldElem1.addAttribute(name,"http://www.w3.org/2001/XMLSchema");
			fieldElem1.addTextNode( value );			
		}
	}

	public static RPCElement create( fObject obj ) throws SOAPException {
		RPCElement elem = new RPCElement("urn:enterprise.soap.sforce.com", "ns1:create", null );
		addSingleElement( obj, elem );
		/*SOAPElement subElem = elem.addChildElement("ns1:sObjects");
		
		Name name = null;
		
		//name = new PrefixedQName(null, "arrayType", "soapenc");
		//subElem.addAttribute(name,"ns2:sObject[1]");
		
		//name = new PrefixedQName(null, "type", "xsi");
		//subElem.addAttribute(name,"soapenc:Array");
		name = new PrefixedQName(null, "type", "xsi");
		subElem.addAttribute(name,"ns2:" + obj.getName());
		
		name = new PrefixedQName(null, "ns2", "xmlns");
		subElem.addAttribute(name,"urn:sobject.enterprise.soap.sforce.com");

		name = new PrefixedQName(null, "soapenc", "xmlns");
		subElem.addAttribute(name,"http://schemas.xmlsoap.org/soap/encoding/");

		name = new PrefixedQName(null, "xsi", "xmlns");
		subElem.addAttribute(name,"http://www.w3.org/2001/XMLSchema-instance");
		
		//SOAPElement subElem1 = subElem.addChildElement("ns1:sObjects");
		
		
		
		for ( String field : obj.getFields() ) {
			String value = obj.getValue(field);
			if ( StringUtils.isBlank(value) || ("null".equalsIgnoreCase(value)) ) {
				continue;
			}
			SOAPElement fieldElem1 = subElem.addChildElement(field,"");
			//name = new PrefixedQName(null, "type", "xsi");
			//fieldElem1.addAttribute(name,"xsd:double");
			name = new PrefixedQName(null, "xmlns", "xsd");
			fieldElem1.addAttribute(name,"http://www.w3.org/2001/XMLSchema");
			fieldElem1.addTextNode( value );			
		}*/
		
		return elem;
	}
	
}

