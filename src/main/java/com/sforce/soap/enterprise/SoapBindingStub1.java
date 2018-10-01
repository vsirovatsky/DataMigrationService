/**
 * SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

import org.apache.axis.message.RPCElement;

public class SoapBindingStub1 extends org.apache.axis.client.Stub { /*implements com.sforce.soap.enterprise.Soap {
    private static final String URN_ENTERPRISE_SOAP_SFORCE_COM = "urn:enterprise.soap.sforce.com";
	private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[30];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LoginResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.LoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault"),
                      "com.sforce.soap.enterprise.fault.LoginFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSObjectResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSObjectResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSObjectResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSObjectResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeGlobal");
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeGlobalResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeGlobalResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "recordTypeIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeLayoutResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSoftphoneLayout");
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSoftphoneLayoutResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeTabs");
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeTabSetResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeTabSetResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SaveResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SaveResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "externalIDFieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "UpsertResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.UpsertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("merge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "MergeRequest"), com.sforce.soap.enterprise.MergeRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "MergeResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.MergeResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DeleteResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("undelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "UndeleteResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.UndeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyRecycleBin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "EmptyRecycleBinResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.EmptyRecycleBinResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "fieldList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        oper.setReturnClass(com.sforce.soap.enterprise.sobject.SObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "actions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessRequest"), com.sforce.soap.enterprise.ProcessRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.ProcessResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("convertLead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "leadConverts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LeadConvert"), com.sforce.soap.enterprise.LeadConvert[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LeadConvertResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.LeadConvertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invalidateSessions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sessionIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "InvalidateSessionsResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.InvalidateSessionsResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeleted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetDeletedResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetDeletedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUpdated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetUpdatedResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetUpdatedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "QueryResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "QueryResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryMore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "queryLocator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "QueryLocator"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "QueryResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SearchResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault"),
                      "com.sforce.soap.enterprise.fault.MalformedSearchFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerTimestamp");
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetServerTimestampResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetServerTimestampResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SetPasswordResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SetPasswordResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault"),
                      "com.sforce.soap.enterprise.fault.InvalidNewPasswordFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ResetPasswordResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.ResetPasswordResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInfo");
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetUserInfoResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetUserInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "messages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "Email"), com.sforce.soap.enterprise.Email[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SendEmailResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SendEmailResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    public SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">AllowFieldTruncationHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AllowFieldTruncationHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">AssignmentRuleHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AssignmentRuleHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">convertLead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvert[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LeadConvert");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "leadConverts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">convertLeadResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LeadConvertResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">create");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">createResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SaveResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">DebuggingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebuggingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">DebuggingInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebuggingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">delete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">deleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DeleteResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeGlobal");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeGlobalResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutType0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeSObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeSObjectResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeSObjects");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeSObjectsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSObjectResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeSoftphoneLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeSoftphoneLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeTabs");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">describeTabsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabSetResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeTabSetResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">EmailHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">emptyRecycleBin");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">emptyRecycleBinResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmptyRecycleBinResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "EmptyRecycleBinResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getDeleted");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeleted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getDeletedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeletedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getServerTimestamp");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestamp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getServerTimestampResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestampResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getUpdated");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdated.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getUpdatedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdatedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getUserInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">getUserInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">invalidateSessions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sessionIds");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">invalidateSessionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.InvalidateSessionsResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "InvalidateSessionsResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">LocaleOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LocaleOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">login");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">loginResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">LoginScopeHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginScopeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">logout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">logoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">merge");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "MergeRequest");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "request");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">mergeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "MergeResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">MruHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MruHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">PackageVersionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PackageVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "PackageVersion");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "packageVersions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">process");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessRequest");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "actions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">processResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">query");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">queryAll");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">queryAllResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">queryMore");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryMore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">queryMoreResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryMoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">QueryOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">queryResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">resetPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">resetPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">retrieve");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Retrieve.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">retrieveResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">search");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Search.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">searchResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">sendEmail");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Email[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "Email");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "messages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">sendEmailResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SendEmailResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">SessionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SessionHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">setPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">setPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">undelete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">undeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UndeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "UndeleteResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">update");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">updateResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SaveResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">upsert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Upsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">upsertResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UpsertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "UpsertResult");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, ">UserTerritoryDeleteHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UserTerritoryDeleteHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ChildRelationship");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ChildRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DebugLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebugLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DeletedRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeletedRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeGlobalResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeGlobalSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutButtonSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutButton[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutButton");
            qName2 = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "detailButtons");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutRow");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSoftphoneLayoutCallType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSoftphoneLayoutInfoField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSoftphoneLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSoftphoneLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeSoftphoneLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeTab");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "DescribeTabSetResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabSetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "Email");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Email.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "EmailFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "EmailPriority");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "EmptyRecycleBinResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmptyRecycleBinResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "Error");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "Field");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "fieldType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetDeletedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeletedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetServerTimestampResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestampResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetUpdatedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdatedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "GetUserInfoResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "InvalidateSessionsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.InvalidateSessionsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "layoutComponentType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LayoutComponentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LeadConvert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LeadConvertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "LoginResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "MassEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MassEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "MergeRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "MergeResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "PackageVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PackageVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "PicklistEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PicklistEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "PicklistForRecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PicklistForRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessSubmitRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessSubmitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ProcessWorkitemRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessWorkitemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "QueryLocator");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "RecordTypeInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "RecordTypeMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "RelatedList");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "RelatedListColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedListColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "RelatedListSort");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedListSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "ResetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SearchRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SearchResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SendEmailError");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SendEmailResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "SingleEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SingleEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "soapType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoapType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "UndeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UndeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "UpsertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UpsertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ApiFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ApiFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ApiQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ApiQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ExceptionCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ExceptionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "FaultCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.FaultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidFieldFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidIdFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidNewPasswordFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidSObjectFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.LoginFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.MalformedQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.MalformedSearchFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ActivityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AdditionalNumber");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AdditionalNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClass");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexPage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approval");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Approval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Asset");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Asset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssetTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AssetTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssignmentRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AssignmentRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AsyncApexJob");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AsyncApexJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BrandTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BrandTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BusinessHours.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessProcess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BusinessProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Call_Report__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Call_Report__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Call_Report__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Call_Report__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallCenter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CallCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMemberStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignMemberStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject._case.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseSolution");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseSolution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplateMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplateRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplateRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CategoryData");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CategoryNode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CategoryNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Community");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Community.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocument");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocumentHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersionHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentVersionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspace");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentWorkspace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspaceDoc");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentWorkspaceDoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Contract.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CronTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CronTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Document");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DocumentAttachmentMap");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DocumentAttachmentMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DocumentTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DocumentTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ECRT_CreditApplication__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ECRT_CreditApplication__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ECRT_CreditApplication__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ECRT_CreditApplication__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailServicesAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailServicesAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailServicesFunction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailServicesFunction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Event.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventAttendee");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EventAttendee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EventTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Financial_Accounts__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Financial_Accounts__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Financial_Accounts__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Financial_Accounts__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Financial_Accounts__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Financial_Accounts__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FiscalYearSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Folder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ForecastShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Group");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.GroupMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Idea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdeaComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.IdeaComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Lead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailmergeTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MailmergeTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Name.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NoteAndAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NoteAndAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NoteTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NoteTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpenActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Opportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityCompetitor");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityCompetitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityFieldHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityFieldHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityPartner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityStage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityStage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Organization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Organization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrgWideEmailAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrgWideEmailAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Partner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PartnerRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PartnerRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Period");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Period.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pricebook2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PricebookEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PricebookEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceStep");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceWorkitem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceWorkitem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product2");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Product2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Profile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QueueSobject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QueueSobject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scontrol");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Scontrol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SelfServiceUser");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SelfServiceUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Ad_Group__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Ad_Group__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Ad_Group__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Ad_Group__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Google_Campaign__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Google_Campaign__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Google_Campaign__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Google_Campaign__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Keyword__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Keyword__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Keyword__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Keyword__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Search_Phrase__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Search_Phrase__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Search_Phrase__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Search_Phrase__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Text_Ad__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Text_Ad__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Text_Ad__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Text_Ad__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Version_33_0_3__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Version_33_0_3__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Version_33_0_3__Tag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Version_33_0_3__Tag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solution");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Solution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StaticResource");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.StaticResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TagDefinition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TagDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Task");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Task.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskPriority");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskTag");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreference");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserPreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Vote");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Vote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WebLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.WebLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sforce.soap.enterprise.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.LoginFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.LoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.LoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.LoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.LoginFault) {
              throw (com.sforce.soap.enterprise.fault.LoginFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "describeSObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSObjectResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSObjectResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSObjectResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "describeSObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSObjectResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSObjectResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSObjectResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "describeGlobal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeGlobalResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeGlobalResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeGlobalResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "describeLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, recordTypeIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeLayoutResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeLayoutResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeLayoutResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "describeSoftphoneLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "describeTabs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeTabSetResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeTabSetResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeTabSetResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SaveResult[] createMy(RPCElement elem) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invokeMyCreate(new java.lang.Object[] {elem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
            	_exception.printStackTrace();
                return (com.sforce.soap.enterprise.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }
    
    public com.sforce.soap.enterprise.SaveResult[] create(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SaveResult[] update(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "upsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {externalIDFieldName, sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.UpsertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.UpsertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.UpsertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.MergeResult[] merge(com.sforce.soap.enterprise.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "merge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.MergeResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.MergeResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.MergeResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "undelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.UndeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.UndeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.UndeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "emptyRecycleBin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.EmptyRecycleBinResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.EmptyRecycleBinResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.EmptyRecycleBinResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fieldList, sObjectType, ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.sobject.SObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.sobject.SObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.sobject.SObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.ProcessResult[] process(com.sforce.soap.enterprise.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {actions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.ProcessResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.ProcessResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.ProcessResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(com.sforce.soap.enterprise.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "convertLead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {leadConverts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.LeadConvertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.LeadConvertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.LeadConvertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "invalidateSessions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.InvalidateSessionsResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.InvalidateSessionsResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.InvalidateSessionsResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "getDeleted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetDeletedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetDeletedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetDeletedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "getUpdated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetUpdatedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetUpdatedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetUpdatedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public Object queryMy(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invokeMy(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            //extractAttachments(_call);
            try {
                return _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "queryAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "queryMore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryLocator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedSearchFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedSearchFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedSearchFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "getServerTimestamp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetServerTimestampResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetServerTimestampResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetServerTimestampResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidNewPasswordFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "setPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SetPasswordResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SetPasswordResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SetPasswordResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidNewPasswordFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidNewPasswordFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "resetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.ResetPasswordResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.ResetPasswordResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.ResetPasswordResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "getUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetUserInfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetUserInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetUserInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(com.sforce.soap.enterprise.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(URN_ENTERPRISE_SOAP_SFORCE_COM, "sendEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {messages});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SendEmailResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SendEmailResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SendEmailResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }
*/
}
