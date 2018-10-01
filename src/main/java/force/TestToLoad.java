package force;

import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.RPCElement;

import force.fObject.fObject;

public class TestToLoad {

	public static void main(String[] args) throws  Exception{
		String[] ar = null;//{"one", "two", "three"};
		RPCElement elem = new RPCElement("urn:enterprise.soap.sforce.com", "ns1:create", ar );
		
		SOAPElement subElem = elem.addChildElement("ns1:sObjects");
		
		Name name = null;
		
		name = new PrefixedQName(null, "arrayType", "soapenc");
		subElem.addAttribute(name,"ns2:sObject[1]");
		
		name = new PrefixedQName(null, "type", "xsi");
		subElem.addAttribute(name,"soapenc:Array");

		name = new PrefixedQName(null, "ns2", "xmlns");
		subElem.addAttribute(name,"urn:sobject.enterprise.soap.sforce.com");

		name = new PrefixedQName(null, "soapenc", "xmlns");
		subElem.addAttribute(name,"http://schemas.xmlsoap.org/soap/encoding/");

		name = new PrefixedQName(null, "xsi", "xmlns");
		subElem.addAttribute(name,"http://www.w3.org/2001/XMLSchema-instance");
		
		SOAPElement subElem1 = subElem.addChildElement("ns1:sObjects");
		
		name = new PrefixedQName(null, "type", "xsi");
		subElem1.addAttribute(name,"ns2:Capitalization__c");
		
		SOAPElement fieldElem1 = subElem1.addChildElement("Exit_Price__c","");
		name = new PrefixedQName(null, "type", "xsi");
		fieldElem1.addAttribute(name,"xsd:double");
		name = new PrefixedQName(null, "xmlns", "xsd");
		fieldElem1.addAttribute(name,"http://www.w3.org/2001/XMLSchema");
		fieldElem1.addTextNode("0.0");
		
		
		fObject obj = new fObject("Capitalization__c");
		obj.set("Id", "asdasdasdasd");
		
		//<Exit_Price__c xsi:type="xsd:double" xmlns:xsd="http://www.w3.org/2001/XMLSchema">0.0</Exit_Price__c>
		
		
		System.out.println( create( obj ) );
	}

	private static RPCElement create( fObject obj ) throws SOAPException {
		RPCElement elem = new RPCElement("urn:enterprise.soap.sforce.com", "ns1:create", null );
		
		SOAPElement subElem = elem.addChildElement("ns1:sObjects");
		
		Name name = null;
		
		name = new PrefixedQName(null, "arrayType", "soapenc");
		subElem.addAttribute(name,"ns2:sObject[1]");
		
		name = new PrefixedQName(null, "type", "xsi");
		subElem.addAttribute(name,"soapenc:Array");

		name = new PrefixedQName(null, "ns2", "xmlns");
		subElem.addAttribute(name,"urn:sobject.enterprise.soap.sforce.com");

		name = new PrefixedQName(null, "soapenc", "xmlns");
		subElem.addAttribute(name,"http://schemas.xmlsoap.org/soap/encoding/");

		name = new PrefixedQName(null, "xsi", "xmlns");
		subElem.addAttribute(name,"http://www.w3.org/2001/XMLSchema-instance");
		
		SOAPElement subElem1 = subElem.addChildElement("ns1:sObjects");
		
		name = new PrefixedQName(null, "type", "xsi");
		subElem1.addAttribute(name,"ns2:" + obj.getName());
		
		for ( String field : obj.getFields() ) {
			SOAPElement fieldElem1 = subElem1.addChildElement(field,"");
			name = new PrefixedQName(null, "type", "xsi");
			fieldElem1.addAttribute(name,"xsd:double");
			name = new PrefixedQName(null, "xmlns", "xsd");
			fieldElem1.addAttribute(name,"http://www.w3.org/2001/XMLSchema");
			fieldElem1.addTextNode( obj.getValue(field) );			
		}
		
		return elem;
	}
	
}
