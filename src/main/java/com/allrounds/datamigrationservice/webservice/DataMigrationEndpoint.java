package com.allrounds.datamigrationservice.webservice;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.springframework.ws.server.endpoint.AbstractJDomPayloadEndpoint;


public class DataMigrationEndpoint extends AbstractJDomPayloadEndpoint {

    private Namespace namespace;

    private final DataMigrationResourceService dataMigrationService;

    public DataMigrationEndpoint(DataMigrationResourceService dataMigrationService) throws JDOMException {
        this.dataMigrationService = dataMigrationService;
        this.namespace = Namespace.getNamespace("hr", "http://allrounds.com/hr/schemas");
    }

    protected Element invokeInternal(Element dataMigrationRequest) throws Exception {
        System.out.println("XML Doc >> ");
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(dataMigrationRequest, System.out);
        
        Element type = dataMigrationRequest.getChild("type", this.namespace);
        String typeValue = type.getValue();
        
        ServiceTraceReceiver trace = new ServiceTraceReceiver();
        
        System.out.println();
        System.out.println( "type: " + typeValue );
        trace.println("type: " + typeValue);
        try {
        	if ( typeValue.equals("capitalization") ) {
        		String capitalization = dataMigrationRequest.getChild("capitalization", this.namespace).getValue();
        		Element source = dataMigrationRequest.getChild("source", this.namespace);
        		Element target = dataMigrationRequest.getChild("target", this.namespace);
        		String sourceLogin = source.getChild("login", this.namespace).getValue();
        		String sourcePass = source.getChild("pass", this.namespace).getValue();
        		String targetLogin = target.getChild("login", this.namespace).getValue();
        		String targetPass = target.getChild("pass", this.namespace).getValue();
        		System.out.println( "capitalization: " + capitalization );
        		trace.println("sourceLogin: " + sourceLogin);
        		System.out.println( "sourceLogin: " + sourceLogin );
        		System.out.println( "sourcePass: " + sourcePass );
        		trace.println("targetLogin: " + targetLogin);
        		System.out.println( "targetLogin: " + targetLogin );
        		System.out.println( "targetPass: " + targetPass );
        	
        		this.dataMigrationService.moveCapitalization(sourceLogin, sourcePass, targetLogin, targetPass, capitalization, trace);
        	}
        } catch (Throwable ex) {
        	ex.printStackTrace();
        	trace.error(ex.getMessage());
        }
       /* final List<Element> requestsList = dataMigrationRequest.getChildren("PDFRequest", this.namespace);
        if ( (requestsList==null) || requestsList.isEmpty() ) {
        	throw new PDFException("Requests are blank");
        }
        
        final List<IData> dataList = new ArrayList<IData>(); 
        for ( Element singleRequest : requestsList ) {
        	List<Element> records = singleRequest.getChildren("PDFRecord", this.namespace);
            if ( (records==null) || records.isEmpty() ) {
            	System.out.println( "no records" );
            	continue;
            }
            System.out.println( "records size: " + records.size() );
            WSData data = new WSData();
        	for ( Element el : records ) {
        		String field = el.getChild("field", this.namespace).getValue();
        		String value = el.getChild("value", this.namespace).getValue();
        		System.out.println( "field: " + field );
        		System.out.println( "value: " + value );
        		data.addRecord(field, value);
        	}
        	dataList.add( data );
        }
        
    	final PDFResults results = this.pdfService.process( dataList );
    	if ( (results == null) || results.isEmpty() ) {
    		throw new PDFException("Requests cannot be processed");
    	}

        final Namespace namespace = Namespace.getNamespace("hr", "http://allrounds.com/hr/schemas");
        final Element root = new Element("PDFResponses", namespace);
        for ( PDFResults.PDFResult res : results.getResults() ) {
            Element pdfResponse = new Element("PDFResponse", namespace);
            root.addContent(pdfResponse);
            Element title = new Element("title", namespace);
            pdfResponse.addContent(title);
            title.setText(res.getFileName());
            Element link = new Element("id", namespace);
            pdfResponse.addContent(link);
            link.setText(res.getFileId());        	
        }
        */
        final Element root = new Element("DataMigrationResponce", namespace);
        Element status = new Element("status", namespace);
        root.addContent( status );
        status.setText("request taken for processing");
        Element messages = new Element("messages", namespace);
        for ( String str : trace.getErrors() ) {
        	Element message = new Element("error", namespace);
        	message.setText( str );
        	messages.addContent( message );
        }
        for ( String str : trace.getMessages() ) {
        	Element message = new Element("message", namespace);
        	message.setText( str );
        	messages.addContent( message );
        }
        root.addContent( messages );
        final Document doc = new Document(root);

        // return response XML
        System.out.println();
        System.out.println("XML Response Doc >> ");
        xmlOutputter.output(doc, System.out);
        return doc.getRootElement();

    }

}