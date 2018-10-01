/**
 * CapMan__Balance_Sheet__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Balance_Sheet__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__APAP__c;

    private java.lang.Double capMan__APAR__c;

    private java.lang.Double capMan__APCash__c;

    private java.lang.Double capMan__APDebt__c;

    private java.lang.Double capMan__APDefRev__c;

    private java.lang.Double capMan__APEq__c;

    private java.lang.Double capMan__APFix__c;

    private java.lang.Double capMan__APOca__c;

    private java.lang.Double capMan__APOtLi__c;

    private java.lang.Double capMan__APOtas__c;

    private java.lang.Double capMan__APTotLE__c;

    private java.lang.Double capMan__APTotLi__c;

    private java.lang.Double capMan__APTotas__c;

    private java.lang.Double capMan__APTotca__c;

    private java.lang.String capMan__Account__c;

    private com.sforce.soap.enterprise.sobject.Account capMan__Account__r;

    private java.lang.String capMan__Default_Quarter__c;

    private java.util.Date capMan__End_Date__c;

    private java.lang.Double capMan__FYAAP__c;

    private java.lang.Double capMan__FYAAR__c;

    private java.lang.Double capMan__FYACash__c;

    private java.lang.Double capMan__FYADebt__c;

    private java.lang.Double capMan__FYADefRev__c;

    private java.lang.Double capMan__FYAEq__c;

    private java.lang.Double capMan__FYAFix__c;

    private java.lang.Double capMan__FYAOca__c;

    private java.lang.Double capMan__FYAOtLi__c;

    private java.lang.Double capMan__FYAOtas__c;

    private java.lang.Double capMan__FYATotLE__c;

    private java.lang.Double capMan__FYATotLi__c;

    private java.lang.Double capMan__FYATotas__c;

    private java.lang.Double capMan__FYATotca__c;

    private java.lang.Double capMan__FYPAP__c;

    private java.lang.Double capMan__FYPAR__c;

    private java.lang.Double capMan__FYPCash__c;

    private java.lang.Double capMan__FYPDebt__c;

    private java.lang.Double capMan__FYPDefRev__c;

    private java.lang.Double capMan__FYPEq__c;

    private java.lang.Double capMan__FYPFix__c;

    private java.lang.Double capMan__FYPOca__c;

    private java.lang.Double capMan__FYPOtLi__c;

    private java.lang.Double capMan__FYPOtas__c;

    private java.lang.Double capMan__FYPTotLE_NEW__c;

    private java.lang.Double capMan__FYPTotLE__c;

    private java.lang.Double capMan__FYPTotLi__c;

    private java.lang.Double capMan__FYPTotas__c;

    private java.lang.Double capMan__FYPTotca__c;

    private java.lang.String capMan__FiscalYear__c;

    private java.util.Date capMan__Formula_Start_Date__c;

    private java.lang.String capMan__Industry__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Pipeline1__r;

    private java.lang.Double capMan__Q1AAP__c;

    private java.lang.Double capMan__Q1AAR__c;

    private java.lang.Double capMan__Q1ACash__c;

    private java.lang.Double capMan__Q1ADebt__c;

    private java.lang.Double capMan__Q1ADefRev__c;

    private java.lang.Double capMan__Q1AEq__c;

    private java.lang.Double capMan__Q1AFix__c;

    private java.lang.Double capMan__Q1AOca__c;

    private java.lang.Double capMan__Q1AOtLi__c;

    private java.lang.Double capMan__Q1AOtas__c;

    private java.lang.Double capMan__Q1ATotEQ_FML__c;

    private java.lang.Double capMan__Q1ATotLE__c;

    private java.lang.Double capMan__Q1ATotLi__c;

    private java.lang.Double capMan__Q1ATotas__c;

    private java.lang.Double capMan__Q1ATotca__c;

    private java.lang.Double capMan__Q1PAP__c;

    private java.lang.Double capMan__Q1PAR__c;

    private java.lang.Double capMan__Q1PCash__c;

    private java.lang.Double capMan__Q1PDebt__c;

    private java.lang.Double capMan__Q1PDefrev__c;

    private java.lang.Double capMan__Q1PEq__c;

    private java.lang.Double capMan__Q1PFix__c;

    private java.lang.Double capMan__Q1POca__c;

    private java.lang.Double capMan__Q1POtLi__c;

    private java.lang.Double capMan__Q1POtas__c;

    private java.lang.Double capMan__Q1PTotEQ_FML__c;

    private java.lang.Double capMan__Q1PTotLE__c;

    private java.lang.Double capMan__Q1PTotLi__c;

    private java.lang.Double capMan__Q1PTotas__c;

    private java.lang.Double capMan__Q1PTotca__c;

    private java.lang.String capMan__Q1_Actual__c;

    private java.lang.String capMan__Q1_Plan__c;

    private java.lang.Double capMan__Q2AAP__c;

    private java.lang.Double capMan__Q2AAR__c;

    private java.lang.Double capMan__Q2ACash__c;

    private java.lang.Double capMan__Q2ADebt__c;

    private java.lang.Double capMan__Q2ADefRev__c;

    private java.lang.Double capMan__Q2AEq__c;

    private java.lang.Double capMan__Q2AFix__c;

    private java.lang.Double capMan__Q2AOca__c;

    private java.lang.Double capMan__Q2AOtLi__c;

    private java.lang.Double capMan__Q2AOtas__c;

    private java.lang.Double capMan__Q2ATotEQ_FML__c;

    private java.lang.Double capMan__Q2ATotLE__c;

    private java.lang.Double capMan__Q2ATotLi__c;

    private java.lang.Double capMan__Q2ATotas__c;

    private java.lang.Double capMan__Q2ATotca__c;

    private java.lang.Double capMan__Q2PAP__c;

    private java.lang.Double capMan__Q2PAR__c;

    private java.lang.Double capMan__Q2PCash__c;

    private java.lang.Double capMan__Q2PDebt__c;

    private java.lang.Double capMan__Q2PDefRev__c;

    private java.lang.Double capMan__Q2PEq__c;

    private java.lang.Double capMan__Q2PFix__c;

    private java.lang.Double capMan__Q2POca__c;

    private java.lang.Double capMan__Q2POtLi__c;

    private java.lang.Double capMan__Q2POtas__c;

    private java.lang.Double capMan__Q2PTotEQ_FML__c;

    private java.lang.Double capMan__Q2PTotLE__c;

    private java.lang.Double capMan__Q2PTotLi__c;

    private java.lang.Double capMan__Q2PTotas__c;

    private java.lang.Double capMan__Q2PTotca__c;

    private java.lang.String capMan__Q2_Actual__c;

    private java.lang.String capMan__Q2_Plan__c;

    private java.lang.Double capMan__Q3AAP__c;

    private java.lang.Double capMan__Q3AAR__c;

    private java.lang.Double capMan__Q3ACash__c;

    private java.lang.Double capMan__Q3ADebt__c;

    private java.lang.Double capMan__Q3ADefRev__c;

    private java.lang.Double capMan__Q3AEq__c;

    private java.lang.Double capMan__Q3AFix__c;

    private java.lang.Double capMan__Q3AOca__c;

    private java.lang.Double capMan__Q3AOtLi__c;

    private java.lang.Double capMan__Q3AOtas__c;

    private java.lang.Double capMan__Q3ATotEQ_FML__c;

    private java.lang.Double capMan__Q3ATotLE__c;

    private java.lang.Double capMan__Q3ATotLi__c;

    private java.lang.Double capMan__Q3ATotas__c;

    private java.lang.Double capMan__Q3ATotca__c;

    private java.lang.Double capMan__Q3PAP__c;

    private java.lang.Double capMan__Q3PAR__c;

    private java.lang.Double capMan__Q3PCash__c;

    private java.lang.Double capMan__Q3PDebt__c;

    private java.lang.Double capMan__Q3PDefRev__c;

    private java.lang.Double capMan__Q3PEq__c;

    private java.lang.Double capMan__Q3PFix__c;

    private java.lang.Double capMan__Q3POca__c;

    private java.lang.Double capMan__Q3POtLi__c;

    private java.lang.Double capMan__Q3POtas__c;

    private java.lang.Double capMan__Q3PTotEQ_FML__c;

    private java.lang.Double capMan__Q3PTotEQ_FML_for_text__c;

    private java.lang.Double capMan__Q3PTotLE__c;

    private java.lang.Double capMan__Q3PTotLi__c;

    private java.lang.Double capMan__Q3PTotas__c;

    private java.lang.Double capMan__Q3PTotca__c;

    private java.lang.Double capMan__Q3TOTALS__c;

    private java.lang.String capMan__Q3_Actual__c;

    private java.lang.String capMan__Q3_Plan__c;

    private java.lang.Double capMan__Q4AAP__c;

    private java.lang.Double capMan__Q4AAR__c;

    private java.lang.Double capMan__Q4ACash__c;

    private java.lang.Double capMan__Q4ADebt__c;

    private java.lang.Double capMan__Q4ADefRev__c;

    private java.lang.Double capMan__Q4AEq__c;

    private java.lang.Double capMan__Q4AFix__c;

    private java.lang.Double capMan__Q4AOca__c;

    private java.lang.Double capMan__Q4AOtLi__c;

    private java.lang.Double capMan__Q4AOtas__c;

    private java.lang.Double capMan__Q4ATotEQ_FML__c;

    private java.lang.Double capMan__Q4ATotLE__c;

    private java.lang.Double capMan__Q4ATotLi__c;

    private java.lang.Double capMan__Q4ATotas__c;

    private java.lang.Double capMan__Q4ATotca__c;

    private java.lang.Double capMan__Q4PAP__c;

    private java.lang.Double capMan__Q4PAR__c;

    private java.lang.Double capMan__Q4PCash__c;

    private java.lang.Double capMan__Q4PDebt__c;

    private java.lang.Double capMan__Q4PDefRev__c;

    private java.lang.Double capMan__Q4PEq__c;

    private java.lang.Double capMan__Q4PFix__c;

    private java.lang.Double capMan__Q4POca__c;

    private java.lang.Double capMan__Q4POtLi__c;

    private java.lang.Double capMan__Q4POtas__c;

    private java.lang.Double capMan__Q4PTotEQ_FML__c;

    private java.lang.Double capMan__Q4PTotLE__c;

    private java.lang.Double capMan__Q4PTotLi__c;

    private java.lang.Double capMan__Q4PTotas__c;

    private java.lang.Double capMan__Q4PTotas_new__c;

    private java.lang.Double capMan__Q4PTotca__c;

    private java.lang.Double capMan__Q4P_NEW_Tot_LE__c;

    private java.lang.String capMan__Q4_Actual__c;

    private java.lang.String capMan__Q4_Plan__c;

    private java.util.Date capMan__Start_Date__c;

    private java.lang.String capMan__Year__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currencyIsoCode;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    public CapMan__Balance_Sheet__c() {
    }

    public CapMan__Balance_Sheet__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__APAP__c,
           java.lang.Double capMan__APAR__c,
           java.lang.Double capMan__APCash__c,
           java.lang.Double capMan__APDebt__c,
           java.lang.Double capMan__APDefRev__c,
           java.lang.Double capMan__APEq__c,
           java.lang.Double capMan__APFix__c,
           java.lang.Double capMan__APOca__c,
           java.lang.Double capMan__APOtLi__c,
           java.lang.Double capMan__APOtas__c,
           java.lang.Double capMan__APTotLE__c,
           java.lang.Double capMan__APTotLi__c,
           java.lang.Double capMan__APTotas__c,
           java.lang.Double capMan__APTotca__c,
           java.lang.String capMan__Account__c,
           com.sforce.soap.enterprise.sobject.Account capMan__Account__r,
           java.lang.String capMan__Default_Quarter__c,
           java.util.Date capMan__End_Date__c,
           java.lang.Double capMan__FYAAP__c,
           java.lang.Double capMan__FYAAR__c,
           java.lang.Double capMan__FYACash__c,
           java.lang.Double capMan__FYADebt__c,
           java.lang.Double capMan__FYADefRev__c,
           java.lang.Double capMan__FYAEq__c,
           java.lang.Double capMan__FYAFix__c,
           java.lang.Double capMan__FYAOca__c,
           java.lang.Double capMan__FYAOtLi__c,
           java.lang.Double capMan__FYAOtas__c,
           java.lang.Double capMan__FYATotLE__c,
           java.lang.Double capMan__FYATotLi__c,
           java.lang.Double capMan__FYATotas__c,
           java.lang.Double capMan__FYATotca__c,
           java.lang.Double capMan__FYPAP__c,
           java.lang.Double capMan__FYPAR__c,
           java.lang.Double capMan__FYPCash__c,
           java.lang.Double capMan__FYPDebt__c,
           java.lang.Double capMan__FYPDefRev__c,
           java.lang.Double capMan__FYPEq__c,
           java.lang.Double capMan__FYPFix__c,
           java.lang.Double capMan__FYPOca__c,
           java.lang.Double capMan__FYPOtLi__c,
           java.lang.Double capMan__FYPOtas__c,
           java.lang.Double capMan__FYPTotLE_NEW__c,
           java.lang.Double capMan__FYPTotLE__c,
           java.lang.Double capMan__FYPTotLi__c,
           java.lang.Double capMan__FYPTotas__c,
           java.lang.Double capMan__FYPTotca__c,
           java.lang.String capMan__FiscalYear__c,
           java.util.Date capMan__Formula_Start_Date__c,
           java.lang.String capMan__Industry__c,
           com.sforce.soap.enterprise.QueryResult capMan__Pipeline1__r,
           java.lang.Double capMan__Q1AAP__c,
           java.lang.Double capMan__Q1AAR__c,
           java.lang.Double capMan__Q1ACash__c,
           java.lang.Double capMan__Q1ADebt__c,
           java.lang.Double capMan__Q1ADefRev__c,
           java.lang.Double capMan__Q1AEq__c,
           java.lang.Double capMan__Q1AFix__c,
           java.lang.Double capMan__Q1AOca__c,
           java.lang.Double capMan__Q1AOtLi__c,
           java.lang.Double capMan__Q1AOtas__c,
           java.lang.Double capMan__Q1ATotEQ_FML__c,
           java.lang.Double capMan__Q1ATotLE__c,
           java.lang.Double capMan__Q1ATotLi__c,
           java.lang.Double capMan__Q1ATotas__c,
           java.lang.Double capMan__Q1ATotca__c,
           java.lang.Double capMan__Q1PAP__c,
           java.lang.Double capMan__Q1PAR__c,
           java.lang.Double capMan__Q1PCash__c,
           java.lang.Double capMan__Q1PDebt__c,
           java.lang.Double capMan__Q1PDefrev__c,
           java.lang.Double capMan__Q1PEq__c,
           java.lang.Double capMan__Q1PFix__c,
           java.lang.Double capMan__Q1POca__c,
           java.lang.Double capMan__Q1POtLi__c,
           java.lang.Double capMan__Q1POtas__c,
           java.lang.Double capMan__Q1PTotEQ_FML__c,
           java.lang.Double capMan__Q1PTotLE__c,
           java.lang.Double capMan__Q1PTotLi__c,
           java.lang.Double capMan__Q1PTotas__c,
           java.lang.Double capMan__Q1PTotca__c,
           java.lang.String capMan__Q1_Actual__c,
           java.lang.String capMan__Q1_Plan__c,
           java.lang.Double capMan__Q2AAP__c,
           java.lang.Double capMan__Q2AAR__c,
           java.lang.Double capMan__Q2ACash__c,
           java.lang.Double capMan__Q2ADebt__c,
           java.lang.Double capMan__Q2ADefRev__c,
           java.lang.Double capMan__Q2AEq__c,
           java.lang.Double capMan__Q2AFix__c,
           java.lang.Double capMan__Q2AOca__c,
           java.lang.Double capMan__Q2AOtLi__c,
           java.lang.Double capMan__Q2AOtas__c,
           java.lang.Double capMan__Q2ATotEQ_FML__c,
           java.lang.Double capMan__Q2ATotLE__c,
           java.lang.Double capMan__Q2ATotLi__c,
           java.lang.Double capMan__Q2ATotas__c,
           java.lang.Double capMan__Q2ATotca__c,
           java.lang.Double capMan__Q2PAP__c,
           java.lang.Double capMan__Q2PAR__c,
           java.lang.Double capMan__Q2PCash__c,
           java.lang.Double capMan__Q2PDebt__c,
           java.lang.Double capMan__Q2PDefRev__c,
           java.lang.Double capMan__Q2PEq__c,
           java.lang.Double capMan__Q2PFix__c,
           java.lang.Double capMan__Q2POca__c,
           java.lang.Double capMan__Q2POtLi__c,
           java.lang.Double capMan__Q2POtas__c,
           java.lang.Double capMan__Q2PTotEQ_FML__c,
           java.lang.Double capMan__Q2PTotLE__c,
           java.lang.Double capMan__Q2PTotLi__c,
           java.lang.Double capMan__Q2PTotas__c,
           java.lang.Double capMan__Q2PTotca__c,
           java.lang.String capMan__Q2_Actual__c,
           java.lang.String capMan__Q2_Plan__c,
           java.lang.Double capMan__Q3AAP__c,
           java.lang.Double capMan__Q3AAR__c,
           java.lang.Double capMan__Q3ACash__c,
           java.lang.Double capMan__Q3ADebt__c,
           java.lang.Double capMan__Q3ADefRev__c,
           java.lang.Double capMan__Q3AEq__c,
           java.lang.Double capMan__Q3AFix__c,
           java.lang.Double capMan__Q3AOca__c,
           java.lang.Double capMan__Q3AOtLi__c,
           java.lang.Double capMan__Q3AOtas__c,
           java.lang.Double capMan__Q3ATotEQ_FML__c,
           java.lang.Double capMan__Q3ATotLE__c,
           java.lang.Double capMan__Q3ATotLi__c,
           java.lang.Double capMan__Q3ATotas__c,
           java.lang.Double capMan__Q3ATotca__c,
           java.lang.Double capMan__Q3PAP__c,
           java.lang.Double capMan__Q3PAR__c,
           java.lang.Double capMan__Q3PCash__c,
           java.lang.Double capMan__Q3PDebt__c,
           java.lang.Double capMan__Q3PDefRev__c,
           java.lang.Double capMan__Q3PEq__c,
           java.lang.Double capMan__Q3PFix__c,
           java.lang.Double capMan__Q3POca__c,
           java.lang.Double capMan__Q3POtLi__c,
           java.lang.Double capMan__Q3POtas__c,
           java.lang.Double capMan__Q3PTotEQ_FML__c,
           java.lang.Double capMan__Q3PTotEQ_FML_for_text__c,
           java.lang.Double capMan__Q3PTotLE__c,
           java.lang.Double capMan__Q3PTotLi__c,
           java.lang.Double capMan__Q3PTotas__c,
           java.lang.Double capMan__Q3PTotca__c,
           java.lang.Double capMan__Q3TOTALS__c,
           java.lang.String capMan__Q3_Actual__c,
           java.lang.String capMan__Q3_Plan__c,
           java.lang.Double capMan__Q4AAP__c,
           java.lang.Double capMan__Q4AAR__c,
           java.lang.Double capMan__Q4ACash__c,
           java.lang.Double capMan__Q4ADebt__c,
           java.lang.Double capMan__Q4ADefRev__c,
           java.lang.Double capMan__Q4AEq__c,
           java.lang.Double capMan__Q4AFix__c,
           java.lang.Double capMan__Q4AOca__c,
           java.lang.Double capMan__Q4AOtLi__c,
           java.lang.Double capMan__Q4AOtas__c,
           java.lang.Double capMan__Q4ATotEQ_FML__c,
           java.lang.Double capMan__Q4ATotLE__c,
           java.lang.Double capMan__Q4ATotLi__c,
           java.lang.Double capMan__Q4ATotas__c,
           java.lang.Double capMan__Q4ATotca__c,
           java.lang.Double capMan__Q4PAP__c,
           java.lang.Double capMan__Q4PAR__c,
           java.lang.Double capMan__Q4PCash__c,
           java.lang.Double capMan__Q4PDebt__c,
           java.lang.Double capMan__Q4PDefRev__c,
           java.lang.Double capMan__Q4PEq__c,
           java.lang.Double capMan__Q4PFix__c,
           java.lang.Double capMan__Q4POca__c,
           java.lang.Double capMan__Q4POtLi__c,
           java.lang.Double capMan__Q4POtas__c,
           java.lang.Double capMan__Q4PTotEQ_FML__c,
           java.lang.Double capMan__Q4PTotLE__c,
           java.lang.Double capMan__Q4PTotLi__c,
           java.lang.Double capMan__Q4PTotas__c,
           java.lang.Double capMan__Q4PTotas_new__c,
           java.lang.Double capMan__Q4PTotca__c,
           java.lang.Double capMan__Q4P_NEW_Tot_LE__c,
           java.lang.String capMan__Q4_Actual__c,
           java.lang.String capMan__Q4_Plan__c,
           java.util.Date capMan__Start_Date__c,
           java.lang.String capMan__Year__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currencyIsoCode,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.capMan__APAP__c = capMan__APAP__c;
        this.capMan__APAR__c = capMan__APAR__c;
        this.capMan__APCash__c = capMan__APCash__c;
        this.capMan__APDebt__c = capMan__APDebt__c;
        this.capMan__APDefRev__c = capMan__APDefRev__c;
        this.capMan__APEq__c = capMan__APEq__c;
        this.capMan__APFix__c = capMan__APFix__c;
        this.capMan__APOca__c = capMan__APOca__c;
        this.capMan__APOtLi__c = capMan__APOtLi__c;
        this.capMan__APOtas__c = capMan__APOtas__c;
        this.capMan__APTotLE__c = capMan__APTotLE__c;
        this.capMan__APTotLi__c = capMan__APTotLi__c;
        this.capMan__APTotas__c = capMan__APTotas__c;
        this.capMan__APTotca__c = capMan__APTotca__c;
        this.capMan__Account__c = capMan__Account__c;
        this.capMan__Account__r = capMan__Account__r;
        this.capMan__Default_Quarter__c = capMan__Default_Quarter__c;
        this.capMan__End_Date__c = capMan__End_Date__c;
        this.capMan__FYAAP__c = capMan__FYAAP__c;
        this.capMan__FYAAR__c = capMan__FYAAR__c;
        this.capMan__FYACash__c = capMan__FYACash__c;
        this.capMan__FYADebt__c = capMan__FYADebt__c;
        this.capMan__FYADefRev__c = capMan__FYADefRev__c;
        this.capMan__FYAEq__c = capMan__FYAEq__c;
        this.capMan__FYAFix__c = capMan__FYAFix__c;
        this.capMan__FYAOca__c = capMan__FYAOca__c;
        this.capMan__FYAOtLi__c = capMan__FYAOtLi__c;
        this.capMan__FYAOtas__c = capMan__FYAOtas__c;
        this.capMan__FYATotLE__c = capMan__FYATotLE__c;
        this.capMan__FYATotLi__c = capMan__FYATotLi__c;
        this.capMan__FYATotas__c = capMan__FYATotas__c;
        this.capMan__FYATotca__c = capMan__FYATotca__c;
        this.capMan__FYPAP__c = capMan__FYPAP__c;
        this.capMan__FYPAR__c = capMan__FYPAR__c;
        this.capMan__FYPCash__c = capMan__FYPCash__c;
        this.capMan__FYPDebt__c = capMan__FYPDebt__c;
        this.capMan__FYPDefRev__c = capMan__FYPDefRev__c;
        this.capMan__FYPEq__c = capMan__FYPEq__c;
        this.capMan__FYPFix__c = capMan__FYPFix__c;
        this.capMan__FYPOca__c = capMan__FYPOca__c;
        this.capMan__FYPOtLi__c = capMan__FYPOtLi__c;
        this.capMan__FYPOtas__c = capMan__FYPOtas__c;
        this.capMan__FYPTotLE_NEW__c = capMan__FYPTotLE_NEW__c;
        this.capMan__FYPTotLE__c = capMan__FYPTotLE__c;
        this.capMan__FYPTotLi__c = capMan__FYPTotLi__c;
        this.capMan__FYPTotas__c = capMan__FYPTotas__c;
        this.capMan__FYPTotca__c = capMan__FYPTotca__c;
        this.capMan__FiscalYear__c = capMan__FiscalYear__c;
        this.capMan__Formula_Start_Date__c = capMan__Formula_Start_Date__c;
        this.capMan__Industry__c = capMan__Industry__c;
        this.capMan__Pipeline1__r = capMan__Pipeline1__r;
        this.capMan__Q1AAP__c = capMan__Q1AAP__c;
        this.capMan__Q1AAR__c = capMan__Q1AAR__c;
        this.capMan__Q1ACash__c = capMan__Q1ACash__c;
        this.capMan__Q1ADebt__c = capMan__Q1ADebt__c;
        this.capMan__Q1ADefRev__c = capMan__Q1ADefRev__c;
        this.capMan__Q1AEq__c = capMan__Q1AEq__c;
        this.capMan__Q1AFix__c = capMan__Q1AFix__c;
        this.capMan__Q1AOca__c = capMan__Q1AOca__c;
        this.capMan__Q1AOtLi__c = capMan__Q1AOtLi__c;
        this.capMan__Q1AOtas__c = capMan__Q1AOtas__c;
        this.capMan__Q1ATotEQ_FML__c = capMan__Q1ATotEQ_FML__c;
        this.capMan__Q1ATotLE__c = capMan__Q1ATotLE__c;
        this.capMan__Q1ATotLi__c = capMan__Q1ATotLi__c;
        this.capMan__Q1ATotas__c = capMan__Q1ATotas__c;
        this.capMan__Q1ATotca__c = capMan__Q1ATotca__c;
        this.capMan__Q1PAP__c = capMan__Q1PAP__c;
        this.capMan__Q1PAR__c = capMan__Q1PAR__c;
        this.capMan__Q1PCash__c = capMan__Q1PCash__c;
        this.capMan__Q1PDebt__c = capMan__Q1PDebt__c;
        this.capMan__Q1PDefrev__c = capMan__Q1PDefrev__c;
        this.capMan__Q1PEq__c = capMan__Q1PEq__c;
        this.capMan__Q1PFix__c = capMan__Q1PFix__c;
        this.capMan__Q1POca__c = capMan__Q1POca__c;
        this.capMan__Q1POtLi__c = capMan__Q1POtLi__c;
        this.capMan__Q1POtas__c = capMan__Q1POtas__c;
        this.capMan__Q1PTotEQ_FML__c = capMan__Q1PTotEQ_FML__c;
        this.capMan__Q1PTotLE__c = capMan__Q1PTotLE__c;
        this.capMan__Q1PTotLi__c = capMan__Q1PTotLi__c;
        this.capMan__Q1PTotas__c = capMan__Q1PTotas__c;
        this.capMan__Q1PTotca__c = capMan__Q1PTotca__c;
        this.capMan__Q1_Actual__c = capMan__Q1_Actual__c;
        this.capMan__Q1_Plan__c = capMan__Q1_Plan__c;
        this.capMan__Q2AAP__c = capMan__Q2AAP__c;
        this.capMan__Q2AAR__c = capMan__Q2AAR__c;
        this.capMan__Q2ACash__c = capMan__Q2ACash__c;
        this.capMan__Q2ADebt__c = capMan__Q2ADebt__c;
        this.capMan__Q2ADefRev__c = capMan__Q2ADefRev__c;
        this.capMan__Q2AEq__c = capMan__Q2AEq__c;
        this.capMan__Q2AFix__c = capMan__Q2AFix__c;
        this.capMan__Q2AOca__c = capMan__Q2AOca__c;
        this.capMan__Q2AOtLi__c = capMan__Q2AOtLi__c;
        this.capMan__Q2AOtas__c = capMan__Q2AOtas__c;
        this.capMan__Q2ATotEQ_FML__c = capMan__Q2ATotEQ_FML__c;
        this.capMan__Q2ATotLE__c = capMan__Q2ATotLE__c;
        this.capMan__Q2ATotLi__c = capMan__Q2ATotLi__c;
        this.capMan__Q2ATotas__c = capMan__Q2ATotas__c;
        this.capMan__Q2ATotca__c = capMan__Q2ATotca__c;
        this.capMan__Q2PAP__c = capMan__Q2PAP__c;
        this.capMan__Q2PAR__c = capMan__Q2PAR__c;
        this.capMan__Q2PCash__c = capMan__Q2PCash__c;
        this.capMan__Q2PDebt__c = capMan__Q2PDebt__c;
        this.capMan__Q2PDefRev__c = capMan__Q2PDefRev__c;
        this.capMan__Q2PEq__c = capMan__Q2PEq__c;
        this.capMan__Q2PFix__c = capMan__Q2PFix__c;
        this.capMan__Q2POca__c = capMan__Q2POca__c;
        this.capMan__Q2POtLi__c = capMan__Q2POtLi__c;
        this.capMan__Q2POtas__c = capMan__Q2POtas__c;
        this.capMan__Q2PTotEQ_FML__c = capMan__Q2PTotEQ_FML__c;
        this.capMan__Q2PTotLE__c = capMan__Q2PTotLE__c;
        this.capMan__Q2PTotLi__c = capMan__Q2PTotLi__c;
        this.capMan__Q2PTotas__c = capMan__Q2PTotas__c;
        this.capMan__Q2PTotca__c = capMan__Q2PTotca__c;
        this.capMan__Q2_Actual__c = capMan__Q2_Actual__c;
        this.capMan__Q2_Plan__c = capMan__Q2_Plan__c;
        this.capMan__Q3AAP__c = capMan__Q3AAP__c;
        this.capMan__Q3AAR__c = capMan__Q3AAR__c;
        this.capMan__Q3ACash__c = capMan__Q3ACash__c;
        this.capMan__Q3ADebt__c = capMan__Q3ADebt__c;
        this.capMan__Q3ADefRev__c = capMan__Q3ADefRev__c;
        this.capMan__Q3AEq__c = capMan__Q3AEq__c;
        this.capMan__Q3AFix__c = capMan__Q3AFix__c;
        this.capMan__Q3AOca__c = capMan__Q3AOca__c;
        this.capMan__Q3AOtLi__c = capMan__Q3AOtLi__c;
        this.capMan__Q3AOtas__c = capMan__Q3AOtas__c;
        this.capMan__Q3ATotEQ_FML__c = capMan__Q3ATotEQ_FML__c;
        this.capMan__Q3ATotLE__c = capMan__Q3ATotLE__c;
        this.capMan__Q3ATotLi__c = capMan__Q3ATotLi__c;
        this.capMan__Q3ATotas__c = capMan__Q3ATotas__c;
        this.capMan__Q3ATotca__c = capMan__Q3ATotca__c;
        this.capMan__Q3PAP__c = capMan__Q3PAP__c;
        this.capMan__Q3PAR__c = capMan__Q3PAR__c;
        this.capMan__Q3PCash__c = capMan__Q3PCash__c;
        this.capMan__Q3PDebt__c = capMan__Q3PDebt__c;
        this.capMan__Q3PDefRev__c = capMan__Q3PDefRev__c;
        this.capMan__Q3PEq__c = capMan__Q3PEq__c;
        this.capMan__Q3PFix__c = capMan__Q3PFix__c;
        this.capMan__Q3POca__c = capMan__Q3POca__c;
        this.capMan__Q3POtLi__c = capMan__Q3POtLi__c;
        this.capMan__Q3POtas__c = capMan__Q3POtas__c;
        this.capMan__Q3PTotEQ_FML__c = capMan__Q3PTotEQ_FML__c;
        this.capMan__Q3PTotEQ_FML_for_text__c = capMan__Q3PTotEQ_FML_for_text__c;
        this.capMan__Q3PTotLE__c = capMan__Q3PTotLE__c;
        this.capMan__Q3PTotLi__c = capMan__Q3PTotLi__c;
        this.capMan__Q3PTotas__c = capMan__Q3PTotas__c;
        this.capMan__Q3PTotca__c = capMan__Q3PTotca__c;
        this.capMan__Q3TOTALS__c = capMan__Q3TOTALS__c;
        this.capMan__Q3_Actual__c = capMan__Q3_Actual__c;
        this.capMan__Q3_Plan__c = capMan__Q3_Plan__c;
        this.capMan__Q4AAP__c = capMan__Q4AAP__c;
        this.capMan__Q4AAR__c = capMan__Q4AAR__c;
        this.capMan__Q4ACash__c = capMan__Q4ACash__c;
        this.capMan__Q4ADebt__c = capMan__Q4ADebt__c;
        this.capMan__Q4ADefRev__c = capMan__Q4ADefRev__c;
        this.capMan__Q4AEq__c = capMan__Q4AEq__c;
        this.capMan__Q4AFix__c = capMan__Q4AFix__c;
        this.capMan__Q4AOca__c = capMan__Q4AOca__c;
        this.capMan__Q4AOtLi__c = capMan__Q4AOtLi__c;
        this.capMan__Q4AOtas__c = capMan__Q4AOtas__c;
        this.capMan__Q4ATotEQ_FML__c = capMan__Q4ATotEQ_FML__c;
        this.capMan__Q4ATotLE__c = capMan__Q4ATotLE__c;
        this.capMan__Q4ATotLi__c = capMan__Q4ATotLi__c;
        this.capMan__Q4ATotas__c = capMan__Q4ATotas__c;
        this.capMan__Q4ATotca__c = capMan__Q4ATotca__c;
        this.capMan__Q4PAP__c = capMan__Q4PAP__c;
        this.capMan__Q4PAR__c = capMan__Q4PAR__c;
        this.capMan__Q4PCash__c = capMan__Q4PCash__c;
        this.capMan__Q4PDebt__c = capMan__Q4PDebt__c;
        this.capMan__Q4PDefRev__c = capMan__Q4PDefRev__c;
        this.capMan__Q4PEq__c = capMan__Q4PEq__c;
        this.capMan__Q4PFix__c = capMan__Q4PFix__c;
        this.capMan__Q4POca__c = capMan__Q4POca__c;
        this.capMan__Q4POtLi__c = capMan__Q4POtLi__c;
        this.capMan__Q4POtas__c = capMan__Q4POtas__c;
        this.capMan__Q4PTotEQ_FML__c = capMan__Q4PTotEQ_FML__c;
        this.capMan__Q4PTotLE__c = capMan__Q4PTotLE__c;
        this.capMan__Q4PTotLi__c = capMan__Q4PTotLi__c;
        this.capMan__Q4PTotas__c = capMan__Q4PTotas__c;
        this.capMan__Q4PTotas_new__c = capMan__Q4PTotas_new__c;
        this.capMan__Q4PTotca__c = capMan__Q4PTotca__c;
        this.capMan__Q4P_NEW_Tot_LE__c = capMan__Q4P_NEW_Tot_LE__c;
        this.capMan__Q4_Actual__c = capMan__Q4_Actual__c;
        this.capMan__Q4_Plan__c = capMan__Q4_Plan__c;
        this.capMan__Start_Date__c = capMan__Start_Date__c;
        this.capMan__Year__c = capMan__Year__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currencyIsoCode = currencyIsoCode;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the attachments value for this CapMan__Balance_Sheet__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Balance_Sheet__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__APAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APAP__c
     */
    public java.lang.Double getCapMan__APAP__c() {
        return capMan__APAP__c;
    }


    /**
     * Sets the capMan__APAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APAP__c
     */
    public void setCapMan__APAP__c(java.lang.Double capMan__APAP__c) {
        this.capMan__APAP__c = capMan__APAP__c;
    }


    /**
     * Gets the capMan__APAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APAR__c
     */
    public java.lang.Double getCapMan__APAR__c() {
        return capMan__APAR__c;
    }


    /**
     * Sets the capMan__APAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APAR__c
     */
    public void setCapMan__APAR__c(java.lang.Double capMan__APAR__c) {
        this.capMan__APAR__c = capMan__APAR__c;
    }


    /**
     * Gets the capMan__APCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APCash__c
     */
    public java.lang.Double getCapMan__APCash__c() {
        return capMan__APCash__c;
    }


    /**
     * Sets the capMan__APCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APCash__c
     */
    public void setCapMan__APCash__c(java.lang.Double capMan__APCash__c) {
        this.capMan__APCash__c = capMan__APCash__c;
    }


    /**
     * Gets the capMan__APDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APDebt__c
     */
    public java.lang.Double getCapMan__APDebt__c() {
        return capMan__APDebt__c;
    }


    /**
     * Sets the capMan__APDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APDebt__c
     */
    public void setCapMan__APDebt__c(java.lang.Double capMan__APDebt__c) {
        this.capMan__APDebt__c = capMan__APDebt__c;
    }


    /**
     * Gets the capMan__APDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APDefRev__c
     */
    public java.lang.Double getCapMan__APDefRev__c() {
        return capMan__APDefRev__c;
    }


    /**
     * Sets the capMan__APDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APDefRev__c
     */
    public void setCapMan__APDefRev__c(java.lang.Double capMan__APDefRev__c) {
        this.capMan__APDefRev__c = capMan__APDefRev__c;
    }


    /**
     * Gets the capMan__APEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APEq__c
     */
    public java.lang.Double getCapMan__APEq__c() {
        return capMan__APEq__c;
    }


    /**
     * Sets the capMan__APEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APEq__c
     */
    public void setCapMan__APEq__c(java.lang.Double capMan__APEq__c) {
        this.capMan__APEq__c = capMan__APEq__c;
    }


    /**
     * Gets the capMan__APFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APFix__c
     */
    public java.lang.Double getCapMan__APFix__c() {
        return capMan__APFix__c;
    }


    /**
     * Sets the capMan__APFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APFix__c
     */
    public void setCapMan__APFix__c(java.lang.Double capMan__APFix__c) {
        this.capMan__APFix__c = capMan__APFix__c;
    }


    /**
     * Gets the capMan__APOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APOca__c
     */
    public java.lang.Double getCapMan__APOca__c() {
        return capMan__APOca__c;
    }


    /**
     * Sets the capMan__APOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APOca__c
     */
    public void setCapMan__APOca__c(java.lang.Double capMan__APOca__c) {
        this.capMan__APOca__c = capMan__APOca__c;
    }


    /**
     * Gets the capMan__APOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APOtLi__c
     */
    public java.lang.Double getCapMan__APOtLi__c() {
        return capMan__APOtLi__c;
    }


    /**
     * Sets the capMan__APOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APOtLi__c
     */
    public void setCapMan__APOtLi__c(java.lang.Double capMan__APOtLi__c) {
        this.capMan__APOtLi__c = capMan__APOtLi__c;
    }


    /**
     * Gets the capMan__APOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APOtas__c
     */
    public java.lang.Double getCapMan__APOtas__c() {
        return capMan__APOtas__c;
    }


    /**
     * Sets the capMan__APOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APOtas__c
     */
    public void setCapMan__APOtas__c(java.lang.Double capMan__APOtas__c) {
        this.capMan__APOtas__c = capMan__APOtas__c;
    }


    /**
     * Gets the capMan__APTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APTotLE__c
     */
    public java.lang.Double getCapMan__APTotLE__c() {
        return capMan__APTotLE__c;
    }


    /**
     * Sets the capMan__APTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APTotLE__c
     */
    public void setCapMan__APTotLE__c(java.lang.Double capMan__APTotLE__c) {
        this.capMan__APTotLE__c = capMan__APTotLE__c;
    }


    /**
     * Gets the capMan__APTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APTotLi__c
     */
    public java.lang.Double getCapMan__APTotLi__c() {
        return capMan__APTotLi__c;
    }


    /**
     * Sets the capMan__APTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APTotLi__c
     */
    public void setCapMan__APTotLi__c(java.lang.Double capMan__APTotLi__c) {
        this.capMan__APTotLi__c = capMan__APTotLi__c;
    }


    /**
     * Gets the capMan__APTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APTotas__c
     */
    public java.lang.Double getCapMan__APTotas__c() {
        return capMan__APTotas__c;
    }


    /**
     * Sets the capMan__APTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APTotas__c
     */
    public void setCapMan__APTotas__c(java.lang.Double capMan__APTotas__c) {
        this.capMan__APTotas__c = capMan__APTotas__c;
    }


    /**
     * Gets the capMan__APTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__APTotca__c
     */
    public java.lang.Double getCapMan__APTotca__c() {
        return capMan__APTotca__c;
    }


    /**
     * Sets the capMan__APTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__APTotca__c
     */
    public void setCapMan__APTotca__c(java.lang.Double capMan__APTotca__c) {
        this.capMan__APTotca__c = capMan__APTotca__c;
    }


    /**
     * Gets the capMan__Account__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Account__c
     */
    public java.lang.String getCapMan__Account__c() {
        return capMan__Account__c;
    }


    /**
     * Sets the capMan__Account__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Account__c
     */
    public void setCapMan__Account__c(java.lang.String capMan__Account__c) {
        this.capMan__Account__c = capMan__Account__c;
    }


    /**
     * Gets the capMan__Account__r value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getCapMan__Account__r() {
        return capMan__Account__r;
    }


    /**
     * Sets the capMan__Account__r value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Account__r
     */
    public void setCapMan__Account__r(com.sforce.soap.enterprise.sobject.Account capMan__Account__r) {
        this.capMan__Account__r = capMan__Account__r;
    }


    /**
     * Gets the capMan__Default_Quarter__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Default_Quarter__c
     */
    public java.lang.String getCapMan__Default_Quarter__c() {
        return capMan__Default_Quarter__c;
    }


    /**
     * Sets the capMan__Default_Quarter__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Default_Quarter__c
     */
    public void setCapMan__Default_Quarter__c(java.lang.String capMan__Default_Quarter__c) {
        this.capMan__Default_Quarter__c = capMan__Default_Quarter__c;
    }


    /**
     * Gets the capMan__End_Date__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__End_Date__c
     */
    public java.util.Date getCapMan__End_Date__c() {
        return capMan__End_Date__c;
    }


    /**
     * Sets the capMan__End_Date__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__End_Date__c
     */
    public void setCapMan__End_Date__c(java.util.Date capMan__End_Date__c) {
        this.capMan__End_Date__c = capMan__End_Date__c;
    }


    /**
     * Gets the capMan__FYAAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYAAP__c
     */
    public java.lang.Double getCapMan__FYAAP__c() {
        return capMan__FYAAP__c;
    }


    /**
     * Sets the capMan__FYAAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYAAP__c
     */
    public void setCapMan__FYAAP__c(java.lang.Double capMan__FYAAP__c) {
        this.capMan__FYAAP__c = capMan__FYAAP__c;
    }


    /**
     * Gets the capMan__FYAAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYAAR__c
     */
    public java.lang.Double getCapMan__FYAAR__c() {
        return capMan__FYAAR__c;
    }


    /**
     * Sets the capMan__FYAAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYAAR__c
     */
    public void setCapMan__FYAAR__c(java.lang.Double capMan__FYAAR__c) {
        this.capMan__FYAAR__c = capMan__FYAAR__c;
    }


    /**
     * Gets the capMan__FYACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYACash__c
     */
    public java.lang.Double getCapMan__FYACash__c() {
        return capMan__FYACash__c;
    }


    /**
     * Sets the capMan__FYACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYACash__c
     */
    public void setCapMan__FYACash__c(java.lang.Double capMan__FYACash__c) {
        this.capMan__FYACash__c = capMan__FYACash__c;
    }


    /**
     * Gets the capMan__FYADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYADebt__c
     */
    public java.lang.Double getCapMan__FYADebt__c() {
        return capMan__FYADebt__c;
    }


    /**
     * Sets the capMan__FYADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYADebt__c
     */
    public void setCapMan__FYADebt__c(java.lang.Double capMan__FYADebt__c) {
        this.capMan__FYADebt__c = capMan__FYADebt__c;
    }


    /**
     * Gets the capMan__FYADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYADefRev__c
     */
    public java.lang.Double getCapMan__FYADefRev__c() {
        return capMan__FYADefRev__c;
    }


    /**
     * Sets the capMan__FYADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYADefRev__c
     */
    public void setCapMan__FYADefRev__c(java.lang.Double capMan__FYADefRev__c) {
        this.capMan__FYADefRev__c = capMan__FYADefRev__c;
    }


    /**
     * Gets the capMan__FYAEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYAEq__c
     */
    public java.lang.Double getCapMan__FYAEq__c() {
        return capMan__FYAEq__c;
    }


    /**
     * Sets the capMan__FYAEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYAEq__c
     */
    public void setCapMan__FYAEq__c(java.lang.Double capMan__FYAEq__c) {
        this.capMan__FYAEq__c = capMan__FYAEq__c;
    }


    /**
     * Gets the capMan__FYAFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYAFix__c
     */
    public java.lang.Double getCapMan__FYAFix__c() {
        return capMan__FYAFix__c;
    }


    /**
     * Sets the capMan__FYAFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYAFix__c
     */
    public void setCapMan__FYAFix__c(java.lang.Double capMan__FYAFix__c) {
        this.capMan__FYAFix__c = capMan__FYAFix__c;
    }


    /**
     * Gets the capMan__FYAOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYAOca__c
     */
    public java.lang.Double getCapMan__FYAOca__c() {
        return capMan__FYAOca__c;
    }


    /**
     * Sets the capMan__FYAOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYAOca__c
     */
    public void setCapMan__FYAOca__c(java.lang.Double capMan__FYAOca__c) {
        this.capMan__FYAOca__c = capMan__FYAOca__c;
    }


    /**
     * Gets the capMan__FYAOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYAOtLi__c
     */
    public java.lang.Double getCapMan__FYAOtLi__c() {
        return capMan__FYAOtLi__c;
    }


    /**
     * Sets the capMan__FYAOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYAOtLi__c
     */
    public void setCapMan__FYAOtLi__c(java.lang.Double capMan__FYAOtLi__c) {
        this.capMan__FYAOtLi__c = capMan__FYAOtLi__c;
    }


    /**
     * Gets the capMan__FYAOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYAOtas__c
     */
    public java.lang.Double getCapMan__FYAOtas__c() {
        return capMan__FYAOtas__c;
    }


    /**
     * Sets the capMan__FYAOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYAOtas__c
     */
    public void setCapMan__FYAOtas__c(java.lang.Double capMan__FYAOtas__c) {
        this.capMan__FYAOtas__c = capMan__FYAOtas__c;
    }


    /**
     * Gets the capMan__FYATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYATotLE__c
     */
    public java.lang.Double getCapMan__FYATotLE__c() {
        return capMan__FYATotLE__c;
    }


    /**
     * Sets the capMan__FYATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYATotLE__c
     */
    public void setCapMan__FYATotLE__c(java.lang.Double capMan__FYATotLE__c) {
        this.capMan__FYATotLE__c = capMan__FYATotLE__c;
    }


    /**
     * Gets the capMan__FYATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYATotLi__c
     */
    public java.lang.Double getCapMan__FYATotLi__c() {
        return capMan__FYATotLi__c;
    }


    /**
     * Sets the capMan__FYATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYATotLi__c
     */
    public void setCapMan__FYATotLi__c(java.lang.Double capMan__FYATotLi__c) {
        this.capMan__FYATotLi__c = capMan__FYATotLi__c;
    }


    /**
     * Gets the capMan__FYATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYATotas__c
     */
    public java.lang.Double getCapMan__FYATotas__c() {
        return capMan__FYATotas__c;
    }


    /**
     * Sets the capMan__FYATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYATotas__c
     */
    public void setCapMan__FYATotas__c(java.lang.Double capMan__FYATotas__c) {
        this.capMan__FYATotas__c = capMan__FYATotas__c;
    }


    /**
     * Gets the capMan__FYATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYATotca__c
     */
    public java.lang.Double getCapMan__FYATotca__c() {
        return capMan__FYATotca__c;
    }


    /**
     * Sets the capMan__FYATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYATotca__c
     */
    public void setCapMan__FYATotca__c(java.lang.Double capMan__FYATotca__c) {
        this.capMan__FYATotca__c = capMan__FYATotca__c;
    }


    /**
     * Gets the capMan__FYPAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPAP__c
     */
    public java.lang.Double getCapMan__FYPAP__c() {
        return capMan__FYPAP__c;
    }


    /**
     * Sets the capMan__FYPAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPAP__c
     */
    public void setCapMan__FYPAP__c(java.lang.Double capMan__FYPAP__c) {
        this.capMan__FYPAP__c = capMan__FYPAP__c;
    }


    /**
     * Gets the capMan__FYPAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPAR__c
     */
    public java.lang.Double getCapMan__FYPAR__c() {
        return capMan__FYPAR__c;
    }


    /**
     * Sets the capMan__FYPAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPAR__c
     */
    public void setCapMan__FYPAR__c(java.lang.Double capMan__FYPAR__c) {
        this.capMan__FYPAR__c = capMan__FYPAR__c;
    }


    /**
     * Gets the capMan__FYPCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPCash__c
     */
    public java.lang.Double getCapMan__FYPCash__c() {
        return capMan__FYPCash__c;
    }


    /**
     * Sets the capMan__FYPCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPCash__c
     */
    public void setCapMan__FYPCash__c(java.lang.Double capMan__FYPCash__c) {
        this.capMan__FYPCash__c = capMan__FYPCash__c;
    }


    /**
     * Gets the capMan__FYPDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPDebt__c
     */
    public java.lang.Double getCapMan__FYPDebt__c() {
        return capMan__FYPDebt__c;
    }


    /**
     * Sets the capMan__FYPDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPDebt__c
     */
    public void setCapMan__FYPDebt__c(java.lang.Double capMan__FYPDebt__c) {
        this.capMan__FYPDebt__c = capMan__FYPDebt__c;
    }


    /**
     * Gets the capMan__FYPDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPDefRev__c
     */
    public java.lang.Double getCapMan__FYPDefRev__c() {
        return capMan__FYPDefRev__c;
    }


    /**
     * Sets the capMan__FYPDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPDefRev__c
     */
    public void setCapMan__FYPDefRev__c(java.lang.Double capMan__FYPDefRev__c) {
        this.capMan__FYPDefRev__c = capMan__FYPDefRev__c;
    }


    /**
     * Gets the capMan__FYPEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPEq__c
     */
    public java.lang.Double getCapMan__FYPEq__c() {
        return capMan__FYPEq__c;
    }


    /**
     * Sets the capMan__FYPEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPEq__c
     */
    public void setCapMan__FYPEq__c(java.lang.Double capMan__FYPEq__c) {
        this.capMan__FYPEq__c = capMan__FYPEq__c;
    }


    /**
     * Gets the capMan__FYPFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPFix__c
     */
    public java.lang.Double getCapMan__FYPFix__c() {
        return capMan__FYPFix__c;
    }


    /**
     * Sets the capMan__FYPFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPFix__c
     */
    public void setCapMan__FYPFix__c(java.lang.Double capMan__FYPFix__c) {
        this.capMan__FYPFix__c = capMan__FYPFix__c;
    }


    /**
     * Gets the capMan__FYPOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPOca__c
     */
    public java.lang.Double getCapMan__FYPOca__c() {
        return capMan__FYPOca__c;
    }


    /**
     * Sets the capMan__FYPOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPOca__c
     */
    public void setCapMan__FYPOca__c(java.lang.Double capMan__FYPOca__c) {
        this.capMan__FYPOca__c = capMan__FYPOca__c;
    }


    /**
     * Gets the capMan__FYPOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPOtLi__c
     */
    public java.lang.Double getCapMan__FYPOtLi__c() {
        return capMan__FYPOtLi__c;
    }


    /**
     * Sets the capMan__FYPOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPOtLi__c
     */
    public void setCapMan__FYPOtLi__c(java.lang.Double capMan__FYPOtLi__c) {
        this.capMan__FYPOtLi__c = capMan__FYPOtLi__c;
    }


    /**
     * Gets the capMan__FYPOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPOtas__c
     */
    public java.lang.Double getCapMan__FYPOtas__c() {
        return capMan__FYPOtas__c;
    }


    /**
     * Sets the capMan__FYPOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPOtas__c
     */
    public void setCapMan__FYPOtas__c(java.lang.Double capMan__FYPOtas__c) {
        this.capMan__FYPOtas__c = capMan__FYPOtas__c;
    }


    /**
     * Gets the capMan__FYPTotLE_NEW__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPTotLE_NEW__c
     */
    public java.lang.Double getCapMan__FYPTotLE_NEW__c() {
        return capMan__FYPTotLE_NEW__c;
    }


    /**
     * Sets the capMan__FYPTotLE_NEW__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPTotLE_NEW__c
     */
    public void setCapMan__FYPTotLE_NEW__c(java.lang.Double capMan__FYPTotLE_NEW__c) {
        this.capMan__FYPTotLE_NEW__c = capMan__FYPTotLE_NEW__c;
    }


    /**
     * Gets the capMan__FYPTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPTotLE__c
     */
    public java.lang.Double getCapMan__FYPTotLE__c() {
        return capMan__FYPTotLE__c;
    }


    /**
     * Sets the capMan__FYPTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPTotLE__c
     */
    public void setCapMan__FYPTotLE__c(java.lang.Double capMan__FYPTotLE__c) {
        this.capMan__FYPTotLE__c = capMan__FYPTotLE__c;
    }


    /**
     * Gets the capMan__FYPTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPTotLi__c
     */
    public java.lang.Double getCapMan__FYPTotLi__c() {
        return capMan__FYPTotLi__c;
    }


    /**
     * Sets the capMan__FYPTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPTotLi__c
     */
    public void setCapMan__FYPTotLi__c(java.lang.Double capMan__FYPTotLi__c) {
        this.capMan__FYPTotLi__c = capMan__FYPTotLi__c;
    }


    /**
     * Gets the capMan__FYPTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPTotas__c
     */
    public java.lang.Double getCapMan__FYPTotas__c() {
        return capMan__FYPTotas__c;
    }


    /**
     * Sets the capMan__FYPTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPTotas__c
     */
    public void setCapMan__FYPTotas__c(java.lang.Double capMan__FYPTotas__c) {
        this.capMan__FYPTotas__c = capMan__FYPTotas__c;
    }


    /**
     * Gets the capMan__FYPTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FYPTotca__c
     */
    public java.lang.Double getCapMan__FYPTotca__c() {
        return capMan__FYPTotca__c;
    }


    /**
     * Sets the capMan__FYPTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FYPTotca__c
     */
    public void setCapMan__FYPTotca__c(java.lang.Double capMan__FYPTotca__c) {
        this.capMan__FYPTotca__c = capMan__FYPTotca__c;
    }


    /**
     * Gets the capMan__FiscalYear__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__FiscalYear__c
     */
    public java.lang.String getCapMan__FiscalYear__c() {
        return capMan__FiscalYear__c;
    }


    /**
     * Sets the capMan__FiscalYear__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__FiscalYear__c
     */
    public void setCapMan__FiscalYear__c(java.lang.String capMan__FiscalYear__c) {
        this.capMan__FiscalYear__c = capMan__FiscalYear__c;
    }


    /**
     * Gets the capMan__Formula_Start_Date__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Formula_Start_Date__c
     */
    public java.util.Date getCapMan__Formula_Start_Date__c() {
        return capMan__Formula_Start_Date__c;
    }


    /**
     * Sets the capMan__Formula_Start_Date__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Formula_Start_Date__c
     */
    public void setCapMan__Formula_Start_Date__c(java.util.Date capMan__Formula_Start_Date__c) {
        this.capMan__Formula_Start_Date__c = capMan__Formula_Start_Date__c;
    }


    /**
     * Gets the capMan__Industry__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Industry__c
     */
    public java.lang.String getCapMan__Industry__c() {
        return capMan__Industry__c;
    }


    /**
     * Sets the capMan__Industry__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Industry__c
     */
    public void setCapMan__Industry__c(java.lang.String capMan__Industry__c) {
        this.capMan__Industry__c = capMan__Industry__c;
    }


    /**
     * Gets the capMan__Pipeline1__r value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Pipeline1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Pipeline1__r() {
        return capMan__Pipeline1__r;
    }


    /**
     * Sets the capMan__Pipeline1__r value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Pipeline1__r
     */
    public void setCapMan__Pipeline1__r(com.sforce.soap.enterprise.QueryResult capMan__Pipeline1__r) {
        this.capMan__Pipeline1__r = capMan__Pipeline1__r;
    }


    /**
     * Gets the capMan__Q1AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1AAP__c
     */
    public java.lang.Double getCapMan__Q1AAP__c() {
        return capMan__Q1AAP__c;
    }


    /**
     * Sets the capMan__Q1AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1AAP__c
     */
    public void setCapMan__Q1AAP__c(java.lang.Double capMan__Q1AAP__c) {
        this.capMan__Q1AAP__c = capMan__Q1AAP__c;
    }


    /**
     * Gets the capMan__Q1AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1AAR__c
     */
    public java.lang.Double getCapMan__Q1AAR__c() {
        return capMan__Q1AAR__c;
    }


    /**
     * Sets the capMan__Q1AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1AAR__c
     */
    public void setCapMan__Q1AAR__c(java.lang.Double capMan__Q1AAR__c) {
        this.capMan__Q1AAR__c = capMan__Q1AAR__c;
    }


    /**
     * Gets the capMan__Q1ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ACash__c
     */
    public java.lang.Double getCapMan__Q1ACash__c() {
        return capMan__Q1ACash__c;
    }


    /**
     * Sets the capMan__Q1ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ACash__c
     */
    public void setCapMan__Q1ACash__c(java.lang.Double capMan__Q1ACash__c) {
        this.capMan__Q1ACash__c = capMan__Q1ACash__c;
    }


    /**
     * Gets the capMan__Q1ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ADebt__c
     */
    public java.lang.Double getCapMan__Q1ADebt__c() {
        return capMan__Q1ADebt__c;
    }


    /**
     * Sets the capMan__Q1ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ADebt__c
     */
    public void setCapMan__Q1ADebt__c(java.lang.Double capMan__Q1ADebt__c) {
        this.capMan__Q1ADebt__c = capMan__Q1ADebt__c;
    }


    /**
     * Gets the capMan__Q1ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ADefRev__c
     */
    public java.lang.Double getCapMan__Q1ADefRev__c() {
        return capMan__Q1ADefRev__c;
    }


    /**
     * Sets the capMan__Q1ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ADefRev__c
     */
    public void setCapMan__Q1ADefRev__c(java.lang.Double capMan__Q1ADefRev__c) {
        this.capMan__Q1ADefRev__c = capMan__Q1ADefRev__c;
    }


    /**
     * Gets the capMan__Q1AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1AEq__c
     */
    public java.lang.Double getCapMan__Q1AEq__c() {
        return capMan__Q1AEq__c;
    }


    /**
     * Sets the capMan__Q1AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1AEq__c
     */
    public void setCapMan__Q1AEq__c(java.lang.Double capMan__Q1AEq__c) {
        this.capMan__Q1AEq__c = capMan__Q1AEq__c;
    }


    /**
     * Gets the capMan__Q1AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1AFix__c
     */
    public java.lang.Double getCapMan__Q1AFix__c() {
        return capMan__Q1AFix__c;
    }


    /**
     * Sets the capMan__Q1AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1AFix__c
     */
    public void setCapMan__Q1AFix__c(java.lang.Double capMan__Q1AFix__c) {
        this.capMan__Q1AFix__c = capMan__Q1AFix__c;
    }


    /**
     * Gets the capMan__Q1AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1AOca__c
     */
    public java.lang.Double getCapMan__Q1AOca__c() {
        return capMan__Q1AOca__c;
    }


    /**
     * Sets the capMan__Q1AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1AOca__c
     */
    public void setCapMan__Q1AOca__c(java.lang.Double capMan__Q1AOca__c) {
        this.capMan__Q1AOca__c = capMan__Q1AOca__c;
    }


    /**
     * Gets the capMan__Q1AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1AOtLi__c
     */
    public java.lang.Double getCapMan__Q1AOtLi__c() {
        return capMan__Q1AOtLi__c;
    }


    /**
     * Sets the capMan__Q1AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1AOtLi__c
     */
    public void setCapMan__Q1AOtLi__c(java.lang.Double capMan__Q1AOtLi__c) {
        this.capMan__Q1AOtLi__c = capMan__Q1AOtLi__c;
    }


    /**
     * Gets the capMan__Q1AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1AOtas__c
     */
    public java.lang.Double getCapMan__Q1AOtas__c() {
        return capMan__Q1AOtas__c;
    }


    /**
     * Sets the capMan__Q1AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1AOtas__c
     */
    public void setCapMan__Q1AOtas__c(java.lang.Double capMan__Q1AOtas__c) {
        this.capMan__Q1AOtas__c = capMan__Q1AOtas__c;
    }


    /**
     * Gets the capMan__Q1ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ATotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q1ATotEQ_FML__c() {
        return capMan__Q1ATotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q1ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ATotEQ_FML__c
     */
    public void setCapMan__Q1ATotEQ_FML__c(java.lang.Double capMan__Q1ATotEQ_FML__c) {
        this.capMan__Q1ATotEQ_FML__c = capMan__Q1ATotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q1ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ATotLE__c
     */
    public java.lang.Double getCapMan__Q1ATotLE__c() {
        return capMan__Q1ATotLE__c;
    }


    /**
     * Sets the capMan__Q1ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ATotLE__c
     */
    public void setCapMan__Q1ATotLE__c(java.lang.Double capMan__Q1ATotLE__c) {
        this.capMan__Q1ATotLE__c = capMan__Q1ATotLE__c;
    }


    /**
     * Gets the capMan__Q1ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ATotLi__c
     */
    public java.lang.Double getCapMan__Q1ATotLi__c() {
        return capMan__Q1ATotLi__c;
    }


    /**
     * Sets the capMan__Q1ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ATotLi__c
     */
    public void setCapMan__Q1ATotLi__c(java.lang.Double capMan__Q1ATotLi__c) {
        this.capMan__Q1ATotLi__c = capMan__Q1ATotLi__c;
    }


    /**
     * Gets the capMan__Q1ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ATotas__c
     */
    public java.lang.Double getCapMan__Q1ATotas__c() {
        return capMan__Q1ATotas__c;
    }


    /**
     * Sets the capMan__Q1ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ATotas__c
     */
    public void setCapMan__Q1ATotas__c(java.lang.Double capMan__Q1ATotas__c) {
        this.capMan__Q1ATotas__c = capMan__Q1ATotas__c;
    }


    /**
     * Gets the capMan__Q1ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1ATotca__c
     */
    public java.lang.Double getCapMan__Q1ATotca__c() {
        return capMan__Q1ATotca__c;
    }


    /**
     * Sets the capMan__Q1ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1ATotca__c
     */
    public void setCapMan__Q1ATotca__c(java.lang.Double capMan__Q1ATotca__c) {
        this.capMan__Q1ATotca__c = capMan__Q1ATotca__c;
    }


    /**
     * Gets the capMan__Q1PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PAP__c
     */
    public java.lang.Double getCapMan__Q1PAP__c() {
        return capMan__Q1PAP__c;
    }


    /**
     * Sets the capMan__Q1PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PAP__c
     */
    public void setCapMan__Q1PAP__c(java.lang.Double capMan__Q1PAP__c) {
        this.capMan__Q1PAP__c = capMan__Q1PAP__c;
    }


    /**
     * Gets the capMan__Q1PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PAR__c
     */
    public java.lang.Double getCapMan__Q1PAR__c() {
        return capMan__Q1PAR__c;
    }


    /**
     * Sets the capMan__Q1PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PAR__c
     */
    public void setCapMan__Q1PAR__c(java.lang.Double capMan__Q1PAR__c) {
        this.capMan__Q1PAR__c = capMan__Q1PAR__c;
    }


    /**
     * Gets the capMan__Q1PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PCash__c
     */
    public java.lang.Double getCapMan__Q1PCash__c() {
        return capMan__Q1PCash__c;
    }


    /**
     * Sets the capMan__Q1PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PCash__c
     */
    public void setCapMan__Q1PCash__c(java.lang.Double capMan__Q1PCash__c) {
        this.capMan__Q1PCash__c = capMan__Q1PCash__c;
    }


    /**
     * Gets the capMan__Q1PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PDebt__c
     */
    public java.lang.Double getCapMan__Q1PDebt__c() {
        return capMan__Q1PDebt__c;
    }


    /**
     * Sets the capMan__Q1PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PDebt__c
     */
    public void setCapMan__Q1PDebt__c(java.lang.Double capMan__Q1PDebt__c) {
        this.capMan__Q1PDebt__c = capMan__Q1PDebt__c;
    }


    /**
     * Gets the capMan__Q1PDefrev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PDefrev__c
     */
    public java.lang.Double getCapMan__Q1PDefrev__c() {
        return capMan__Q1PDefrev__c;
    }


    /**
     * Sets the capMan__Q1PDefrev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PDefrev__c
     */
    public void setCapMan__Q1PDefrev__c(java.lang.Double capMan__Q1PDefrev__c) {
        this.capMan__Q1PDefrev__c = capMan__Q1PDefrev__c;
    }


    /**
     * Gets the capMan__Q1PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PEq__c
     */
    public java.lang.Double getCapMan__Q1PEq__c() {
        return capMan__Q1PEq__c;
    }


    /**
     * Sets the capMan__Q1PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PEq__c
     */
    public void setCapMan__Q1PEq__c(java.lang.Double capMan__Q1PEq__c) {
        this.capMan__Q1PEq__c = capMan__Q1PEq__c;
    }


    /**
     * Gets the capMan__Q1PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PFix__c
     */
    public java.lang.Double getCapMan__Q1PFix__c() {
        return capMan__Q1PFix__c;
    }


    /**
     * Sets the capMan__Q1PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PFix__c
     */
    public void setCapMan__Q1PFix__c(java.lang.Double capMan__Q1PFix__c) {
        this.capMan__Q1PFix__c = capMan__Q1PFix__c;
    }


    /**
     * Gets the capMan__Q1POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1POca__c
     */
    public java.lang.Double getCapMan__Q1POca__c() {
        return capMan__Q1POca__c;
    }


    /**
     * Sets the capMan__Q1POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1POca__c
     */
    public void setCapMan__Q1POca__c(java.lang.Double capMan__Q1POca__c) {
        this.capMan__Q1POca__c = capMan__Q1POca__c;
    }


    /**
     * Gets the capMan__Q1POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1POtLi__c
     */
    public java.lang.Double getCapMan__Q1POtLi__c() {
        return capMan__Q1POtLi__c;
    }


    /**
     * Sets the capMan__Q1POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1POtLi__c
     */
    public void setCapMan__Q1POtLi__c(java.lang.Double capMan__Q1POtLi__c) {
        this.capMan__Q1POtLi__c = capMan__Q1POtLi__c;
    }


    /**
     * Gets the capMan__Q1POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1POtas__c
     */
    public java.lang.Double getCapMan__Q1POtas__c() {
        return capMan__Q1POtas__c;
    }


    /**
     * Sets the capMan__Q1POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1POtas__c
     */
    public void setCapMan__Q1POtas__c(java.lang.Double capMan__Q1POtas__c) {
        this.capMan__Q1POtas__c = capMan__Q1POtas__c;
    }


    /**
     * Gets the capMan__Q1PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PTotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q1PTotEQ_FML__c() {
        return capMan__Q1PTotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q1PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PTotEQ_FML__c
     */
    public void setCapMan__Q1PTotEQ_FML__c(java.lang.Double capMan__Q1PTotEQ_FML__c) {
        this.capMan__Q1PTotEQ_FML__c = capMan__Q1PTotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q1PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PTotLE__c
     */
    public java.lang.Double getCapMan__Q1PTotLE__c() {
        return capMan__Q1PTotLE__c;
    }


    /**
     * Sets the capMan__Q1PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PTotLE__c
     */
    public void setCapMan__Q1PTotLE__c(java.lang.Double capMan__Q1PTotLE__c) {
        this.capMan__Q1PTotLE__c = capMan__Q1PTotLE__c;
    }


    /**
     * Gets the capMan__Q1PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PTotLi__c
     */
    public java.lang.Double getCapMan__Q1PTotLi__c() {
        return capMan__Q1PTotLi__c;
    }


    /**
     * Sets the capMan__Q1PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PTotLi__c
     */
    public void setCapMan__Q1PTotLi__c(java.lang.Double capMan__Q1PTotLi__c) {
        this.capMan__Q1PTotLi__c = capMan__Q1PTotLi__c;
    }


    /**
     * Gets the capMan__Q1PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PTotas__c
     */
    public java.lang.Double getCapMan__Q1PTotas__c() {
        return capMan__Q1PTotas__c;
    }


    /**
     * Sets the capMan__Q1PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PTotas__c
     */
    public void setCapMan__Q1PTotas__c(java.lang.Double capMan__Q1PTotas__c) {
        this.capMan__Q1PTotas__c = capMan__Q1PTotas__c;
    }


    /**
     * Gets the capMan__Q1PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1PTotca__c
     */
    public java.lang.Double getCapMan__Q1PTotca__c() {
        return capMan__Q1PTotca__c;
    }


    /**
     * Sets the capMan__Q1PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1PTotca__c
     */
    public void setCapMan__Q1PTotca__c(java.lang.Double capMan__Q1PTotca__c) {
        this.capMan__Q1PTotca__c = capMan__Q1PTotca__c;
    }


    /**
     * Gets the capMan__Q1_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1_Actual__c
     */
    public java.lang.String getCapMan__Q1_Actual__c() {
        return capMan__Q1_Actual__c;
    }


    /**
     * Sets the capMan__Q1_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1_Actual__c
     */
    public void setCapMan__Q1_Actual__c(java.lang.String capMan__Q1_Actual__c) {
        this.capMan__Q1_Actual__c = capMan__Q1_Actual__c;
    }


    /**
     * Gets the capMan__Q1_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q1_Plan__c
     */
    public java.lang.String getCapMan__Q1_Plan__c() {
        return capMan__Q1_Plan__c;
    }


    /**
     * Sets the capMan__Q1_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q1_Plan__c
     */
    public void setCapMan__Q1_Plan__c(java.lang.String capMan__Q1_Plan__c) {
        this.capMan__Q1_Plan__c = capMan__Q1_Plan__c;
    }


    /**
     * Gets the capMan__Q2AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2AAP__c
     */
    public java.lang.Double getCapMan__Q2AAP__c() {
        return capMan__Q2AAP__c;
    }


    /**
     * Sets the capMan__Q2AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2AAP__c
     */
    public void setCapMan__Q2AAP__c(java.lang.Double capMan__Q2AAP__c) {
        this.capMan__Q2AAP__c = capMan__Q2AAP__c;
    }


    /**
     * Gets the capMan__Q2AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2AAR__c
     */
    public java.lang.Double getCapMan__Q2AAR__c() {
        return capMan__Q2AAR__c;
    }


    /**
     * Sets the capMan__Q2AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2AAR__c
     */
    public void setCapMan__Q2AAR__c(java.lang.Double capMan__Q2AAR__c) {
        this.capMan__Q2AAR__c = capMan__Q2AAR__c;
    }


    /**
     * Gets the capMan__Q2ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ACash__c
     */
    public java.lang.Double getCapMan__Q2ACash__c() {
        return capMan__Q2ACash__c;
    }


    /**
     * Sets the capMan__Q2ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ACash__c
     */
    public void setCapMan__Q2ACash__c(java.lang.Double capMan__Q2ACash__c) {
        this.capMan__Q2ACash__c = capMan__Q2ACash__c;
    }


    /**
     * Gets the capMan__Q2ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ADebt__c
     */
    public java.lang.Double getCapMan__Q2ADebt__c() {
        return capMan__Q2ADebt__c;
    }


    /**
     * Sets the capMan__Q2ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ADebt__c
     */
    public void setCapMan__Q2ADebt__c(java.lang.Double capMan__Q2ADebt__c) {
        this.capMan__Q2ADebt__c = capMan__Q2ADebt__c;
    }


    /**
     * Gets the capMan__Q2ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ADefRev__c
     */
    public java.lang.Double getCapMan__Q2ADefRev__c() {
        return capMan__Q2ADefRev__c;
    }


    /**
     * Sets the capMan__Q2ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ADefRev__c
     */
    public void setCapMan__Q2ADefRev__c(java.lang.Double capMan__Q2ADefRev__c) {
        this.capMan__Q2ADefRev__c = capMan__Q2ADefRev__c;
    }


    /**
     * Gets the capMan__Q2AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2AEq__c
     */
    public java.lang.Double getCapMan__Q2AEq__c() {
        return capMan__Q2AEq__c;
    }


    /**
     * Sets the capMan__Q2AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2AEq__c
     */
    public void setCapMan__Q2AEq__c(java.lang.Double capMan__Q2AEq__c) {
        this.capMan__Q2AEq__c = capMan__Q2AEq__c;
    }


    /**
     * Gets the capMan__Q2AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2AFix__c
     */
    public java.lang.Double getCapMan__Q2AFix__c() {
        return capMan__Q2AFix__c;
    }


    /**
     * Sets the capMan__Q2AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2AFix__c
     */
    public void setCapMan__Q2AFix__c(java.lang.Double capMan__Q2AFix__c) {
        this.capMan__Q2AFix__c = capMan__Q2AFix__c;
    }


    /**
     * Gets the capMan__Q2AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2AOca__c
     */
    public java.lang.Double getCapMan__Q2AOca__c() {
        return capMan__Q2AOca__c;
    }


    /**
     * Sets the capMan__Q2AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2AOca__c
     */
    public void setCapMan__Q2AOca__c(java.lang.Double capMan__Q2AOca__c) {
        this.capMan__Q2AOca__c = capMan__Q2AOca__c;
    }


    /**
     * Gets the capMan__Q2AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2AOtLi__c
     */
    public java.lang.Double getCapMan__Q2AOtLi__c() {
        return capMan__Q2AOtLi__c;
    }


    /**
     * Sets the capMan__Q2AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2AOtLi__c
     */
    public void setCapMan__Q2AOtLi__c(java.lang.Double capMan__Q2AOtLi__c) {
        this.capMan__Q2AOtLi__c = capMan__Q2AOtLi__c;
    }


    /**
     * Gets the capMan__Q2AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2AOtas__c
     */
    public java.lang.Double getCapMan__Q2AOtas__c() {
        return capMan__Q2AOtas__c;
    }


    /**
     * Sets the capMan__Q2AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2AOtas__c
     */
    public void setCapMan__Q2AOtas__c(java.lang.Double capMan__Q2AOtas__c) {
        this.capMan__Q2AOtas__c = capMan__Q2AOtas__c;
    }


    /**
     * Gets the capMan__Q2ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ATotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q2ATotEQ_FML__c() {
        return capMan__Q2ATotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q2ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ATotEQ_FML__c
     */
    public void setCapMan__Q2ATotEQ_FML__c(java.lang.Double capMan__Q2ATotEQ_FML__c) {
        this.capMan__Q2ATotEQ_FML__c = capMan__Q2ATotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q2ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ATotLE__c
     */
    public java.lang.Double getCapMan__Q2ATotLE__c() {
        return capMan__Q2ATotLE__c;
    }


    /**
     * Sets the capMan__Q2ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ATotLE__c
     */
    public void setCapMan__Q2ATotLE__c(java.lang.Double capMan__Q2ATotLE__c) {
        this.capMan__Q2ATotLE__c = capMan__Q2ATotLE__c;
    }


    /**
     * Gets the capMan__Q2ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ATotLi__c
     */
    public java.lang.Double getCapMan__Q2ATotLi__c() {
        return capMan__Q2ATotLi__c;
    }


    /**
     * Sets the capMan__Q2ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ATotLi__c
     */
    public void setCapMan__Q2ATotLi__c(java.lang.Double capMan__Q2ATotLi__c) {
        this.capMan__Q2ATotLi__c = capMan__Q2ATotLi__c;
    }


    /**
     * Gets the capMan__Q2ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ATotas__c
     */
    public java.lang.Double getCapMan__Q2ATotas__c() {
        return capMan__Q2ATotas__c;
    }


    /**
     * Sets the capMan__Q2ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ATotas__c
     */
    public void setCapMan__Q2ATotas__c(java.lang.Double capMan__Q2ATotas__c) {
        this.capMan__Q2ATotas__c = capMan__Q2ATotas__c;
    }


    /**
     * Gets the capMan__Q2ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2ATotca__c
     */
    public java.lang.Double getCapMan__Q2ATotca__c() {
        return capMan__Q2ATotca__c;
    }


    /**
     * Sets the capMan__Q2ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2ATotca__c
     */
    public void setCapMan__Q2ATotca__c(java.lang.Double capMan__Q2ATotca__c) {
        this.capMan__Q2ATotca__c = capMan__Q2ATotca__c;
    }


    /**
     * Gets the capMan__Q2PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PAP__c
     */
    public java.lang.Double getCapMan__Q2PAP__c() {
        return capMan__Q2PAP__c;
    }


    /**
     * Sets the capMan__Q2PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PAP__c
     */
    public void setCapMan__Q2PAP__c(java.lang.Double capMan__Q2PAP__c) {
        this.capMan__Q2PAP__c = capMan__Q2PAP__c;
    }


    /**
     * Gets the capMan__Q2PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PAR__c
     */
    public java.lang.Double getCapMan__Q2PAR__c() {
        return capMan__Q2PAR__c;
    }


    /**
     * Sets the capMan__Q2PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PAR__c
     */
    public void setCapMan__Q2PAR__c(java.lang.Double capMan__Q2PAR__c) {
        this.capMan__Q2PAR__c = capMan__Q2PAR__c;
    }


    /**
     * Gets the capMan__Q2PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PCash__c
     */
    public java.lang.Double getCapMan__Q2PCash__c() {
        return capMan__Q2PCash__c;
    }


    /**
     * Sets the capMan__Q2PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PCash__c
     */
    public void setCapMan__Q2PCash__c(java.lang.Double capMan__Q2PCash__c) {
        this.capMan__Q2PCash__c = capMan__Q2PCash__c;
    }


    /**
     * Gets the capMan__Q2PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PDebt__c
     */
    public java.lang.Double getCapMan__Q2PDebt__c() {
        return capMan__Q2PDebt__c;
    }


    /**
     * Sets the capMan__Q2PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PDebt__c
     */
    public void setCapMan__Q2PDebt__c(java.lang.Double capMan__Q2PDebt__c) {
        this.capMan__Q2PDebt__c = capMan__Q2PDebt__c;
    }


    /**
     * Gets the capMan__Q2PDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PDefRev__c
     */
    public java.lang.Double getCapMan__Q2PDefRev__c() {
        return capMan__Q2PDefRev__c;
    }


    /**
     * Sets the capMan__Q2PDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PDefRev__c
     */
    public void setCapMan__Q2PDefRev__c(java.lang.Double capMan__Q2PDefRev__c) {
        this.capMan__Q2PDefRev__c = capMan__Q2PDefRev__c;
    }


    /**
     * Gets the capMan__Q2PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PEq__c
     */
    public java.lang.Double getCapMan__Q2PEq__c() {
        return capMan__Q2PEq__c;
    }


    /**
     * Sets the capMan__Q2PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PEq__c
     */
    public void setCapMan__Q2PEq__c(java.lang.Double capMan__Q2PEq__c) {
        this.capMan__Q2PEq__c = capMan__Q2PEq__c;
    }


    /**
     * Gets the capMan__Q2PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PFix__c
     */
    public java.lang.Double getCapMan__Q2PFix__c() {
        return capMan__Q2PFix__c;
    }


    /**
     * Sets the capMan__Q2PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PFix__c
     */
    public void setCapMan__Q2PFix__c(java.lang.Double capMan__Q2PFix__c) {
        this.capMan__Q2PFix__c = capMan__Q2PFix__c;
    }


    /**
     * Gets the capMan__Q2POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2POca__c
     */
    public java.lang.Double getCapMan__Q2POca__c() {
        return capMan__Q2POca__c;
    }


    /**
     * Sets the capMan__Q2POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2POca__c
     */
    public void setCapMan__Q2POca__c(java.lang.Double capMan__Q2POca__c) {
        this.capMan__Q2POca__c = capMan__Q2POca__c;
    }


    /**
     * Gets the capMan__Q2POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2POtLi__c
     */
    public java.lang.Double getCapMan__Q2POtLi__c() {
        return capMan__Q2POtLi__c;
    }


    /**
     * Sets the capMan__Q2POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2POtLi__c
     */
    public void setCapMan__Q2POtLi__c(java.lang.Double capMan__Q2POtLi__c) {
        this.capMan__Q2POtLi__c = capMan__Q2POtLi__c;
    }


    /**
     * Gets the capMan__Q2POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2POtas__c
     */
    public java.lang.Double getCapMan__Q2POtas__c() {
        return capMan__Q2POtas__c;
    }


    /**
     * Sets the capMan__Q2POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2POtas__c
     */
    public void setCapMan__Q2POtas__c(java.lang.Double capMan__Q2POtas__c) {
        this.capMan__Q2POtas__c = capMan__Q2POtas__c;
    }


    /**
     * Gets the capMan__Q2PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PTotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q2PTotEQ_FML__c() {
        return capMan__Q2PTotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q2PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PTotEQ_FML__c
     */
    public void setCapMan__Q2PTotEQ_FML__c(java.lang.Double capMan__Q2PTotEQ_FML__c) {
        this.capMan__Q2PTotEQ_FML__c = capMan__Q2PTotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q2PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PTotLE__c
     */
    public java.lang.Double getCapMan__Q2PTotLE__c() {
        return capMan__Q2PTotLE__c;
    }


    /**
     * Sets the capMan__Q2PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PTotLE__c
     */
    public void setCapMan__Q2PTotLE__c(java.lang.Double capMan__Q2PTotLE__c) {
        this.capMan__Q2PTotLE__c = capMan__Q2PTotLE__c;
    }


    /**
     * Gets the capMan__Q2PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PTotLi__c
     */
    public java.lang.Double getCapMan__Q2PTotLi__c() {
        return capMan__Q2PTotLi__c;
    }


    /**
     * Sets the capMan__Q2PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PTotLi__c
     */
    public void setCapMan__Q2PTotLi__c(java.lang.Double capMan__Q2PTotLi__c) {
        this.capMan__Q2PTotLi__c = capMan__Q2PTotLi__c;
    }


    /**
     * Gets the capMan__Q2PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PTotas__c
     */
    public java.lang.Double getCapMan__Q2PTotas__c() {
        return capMan__Q2PTotas__c;
    }


    /**
     * Sets the capMan__Q2PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PTotas__c
     */
    public void setCapMan__Q2PTotas__c(java.lang.Double capMan__Q2PTotas__c) {
        this.capMan__Q2PTotas__c = capMan__Q2PTotas__c;
    }


    /**
     * Gets the capMan__Q2PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2PTotca__c
     */
    public java.lang.Double getCapMan__Q2PTotca__c() {
        return capMan__Q2PTotca__c;
    }


    /**
     * Sets the capMan__Q2PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2PTotca__c
     */
    public void setCapMan__Q2PTotca__c(java.lang.Double capMan__Q2PTotca__c) {
        this.capMan__Q2PTotca__c = capMan__Q2PTotca__c;
    }


    /**
     * Gets the capMan__Q2_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2_Actual__c
     */
    public java.lang.String getCapMan__Q2_Actual__c() {
        return capMan__Q2_Actual__c;
    }


    /**
     * Sets the capMan__Q2_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2_Actual__c
     */
    public void setCapMan__Q2_Actual__c(java.lang.String capMan__Q2_Actual__c) {
        this.capMan__Q2_Actual__c = capMan__Q2_Actual__c;
    }


    /**
     * Gets the capMan__Q2_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q2_Plan__c
     */
    public java.lang.String getCapMan__Q2_Plan__c() {
        return capMan__Q2_Plan__c;
    }


    /**
     * Sets the capMan__Q2_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q2_Plan__c
     */
    public void setCapMan__Q2_Plan__c(java.lang.String capMan__Q2_Plan__c) {
        this.capMan__Q2_Plan__c = capMan__Q2_Plan__c;
    }


    /**
     * Gets the capMan__Q3AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3AAP__c
     */
    public java.lang.Double getCapMan__Q3AAP__c() {
        return capMan__Q3AAP__c;
    }


    /**
     * Sets the capMan__Q3AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3AAP__c
     */
    public void setCapMan__Q3AAP__c(java.lang.Double capMan__Q3AAP__c) {
        this.capMan__Q3AAP__c = capMan__Q3AAP__c;
    }


    /**
     * Gets the capMan__Q3AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3AAR__c
     */
    public java.lang.Double getCapMan__Q3AAR__c() {
        return capMan__Q3AAR__c;
    }


    /**
     * Sets the capMan__Q3AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3AAR__c
     */
    public void setCapMan__Q3AAR__c(java.lang.Double capMan__Q3AAR__c) {
        this.capMan__Q3AAR__c = capMan__Q3AAR__c;
    }


    /**
     * Gets the capMan__Q3ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ACash__c
     */
    public java.lang.Double getCapMan__Q3ACash__c() {
        return capMan__Q3ACash__c;
    }


    /**
     * Sets the capMan__Q3ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ACash__c
     */
    public void setCapMan__Q3ACash__c(java.lang.Double capMan__Q3ACash__c) {
        this.capMan__Q3ACash__c = capMan__Q3ACash__c;
    }


    /**
     * Gets the capMan__Q3ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ADebt__c
     */
    public java.lang.Double getCapMan__Q3ADebt__c() {
        return capMan__Q3ADebt__c;
    }


    /**
     * Sets the capMan__Q3ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ADebt__c
     */
    public void setCapMan__Q3ADebt__c(java.lang.Double capMan__Q3ADebt__c) {
        this.capMan__Q3ADebt__c = capMan__Q3ADebt__c;
    }


    /**
     * Gets the capMan__Q3ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ADefRev__c
     */
    public java.lang.Double getCapMan__Q3ADefRev__c() {
        return capMan__Q3ADefRev__c;
    }


    /**
     * Sets the capMan__Q3ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ADefRev__c
     */
    public void setCapMan__Q3ADefRev__c(java.lang.Double capMan__Q3ADefRev__c) {
        this.capMan__Q3ADefRev__c = capMan__Q3ADefRev__c;
    }


    /**
     * Gets the capMan__Q3AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3AEq__c
     */
    public java.lang.Double getCapMan__Q3AEq__c() {
        return capMan__Q3AEq__c;
    }


    /**
     * Sets the capMan__Q3AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3AEq__c
     */
    public void setCapMan__Q3AEq__c(java.lang.Double capMan__Q3AEq__c) {
        this.capMan__Q3AEq__c = capMan__Q3AEq__c;
    }


    /**
     * Gets the capMan__Q3AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3AFix__c
     */
    public java.lang.Double getCapMan__Q3AFix__c() {
        return capMan__Q3AFix__c;
    }


    /**
     * Sets the capMan__Q3AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3AFix__c
     */
    public void setCapMan__Q3AFix__c(java.lang.Double capMan__Q3AFix__c) {
        this.capMan__Q3AFix__c = capMan__Q3AFix__c;
    }


    /**
     * Gets the capMan__Q3AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3AOca__c
     */
    public java.lang.Double getCapMan__Q3AOca__c() {
        return capMan__Q3AOca__c;
    }


    /**
     * Sets the capMan__Q3AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3AOca__c
     */
    public void setCapMan__Q3AOca__c(java.lang.Double capMan__Q3AOca__c) {
        this.capMan__Q3AOca__c = capMan__Q3AOca__c;
    }


    /**
     * Gets the capMan__Q3AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3AOtLi__c
     */
    public java.lang.Double getCapMan__Q3AOtLi__c() {
        return capMan__Q3AOtLi__c;
    }


    /**
     * Sets the capMan__Q3AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3AOtLi__c
     */
    public void setCapMan__Q3AOtLi__c(java.lang.Double capMan__Q3AOtLi__c) {
        this.capMan__Q3AOtLi__c = capMan__Q3AOtLi__c;
    }


    /**
     * Gets the capMan__Q3AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3AOtas__c
     */
    public java.lang.Double getCapMan__Q3AOtas__c() {
        return capMan__Q3AOtas__c;
    }


    /**
     * Sets the capMan__Q3AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3AOtas__c
     */
    public void setCapMan__Q3AOtas__c(java.lang.Double capMan__Q3AOtas__c) {
        this.capMan__Q3AOtas__c = capMan__Q3AOtas__c;
    }


    /**
     * Gets the capMan__Q3ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ATotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q3ATotEQ_FML__c() {
        return capMan__Q3ATotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q3ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ATotEQ_FML__c
     */
    public void setCapMan__Q3ATotEQ_FML__c(java.lang.Double capMan__Q3ATotEQ_FML__c) {
        this.capMan__Q3ATotEQ_FML__c = capMan__Q3ATotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q3ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ATotLE__c
     */
    public java.lang.Double getCapMan__Q3ATotLE__c() {
        return capMan__Q3ATotLE__c;
    }


    /**
     * Sets the capMan__Q3ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ATotLE__c
     */
    public void setCapMan__Q3ATotLE__c(java.lang.Double capMan__Q3ATotLE__c) {
        this.capMan__Q3ATotLE__c = capMan__Q3ATotLE__c;
    }


    /**
     * Gets the capMan__Q3ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ATotLi__c
     */
    public java.lang.Double getCapMan__Q3ATotLi__c() {
        return capMan__Q3ATotLi__c;
    }


    /**
     * Sets the capMan__Q3ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ATotLi__c
     */
    public void setCapMan__Q3ATotLi__c(java.lang.Double capMan__Q3ATotLi__c) {
        this.capMan__Q3ATotLi__c = capMan__Q3ATotLi__c;
    }


    /**
     * Gets the capMan__Q3ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ATotas__c
     */
    public java.lang.Double getCapMan__Q3ATotas__c() {
        return capMan__Q3ATotas__c;
    }


    /**
     * Sets the capMan__Q3ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ATotas__c
     */
    public void setCapMan__Q3ATotas__c(java.lang.Double capMan__Q3ATotas__c) {
        this.capMan__Q3ATotas__c = capMan__Q3ATotas__c;
    }


    /**
     * Gets the capMan__Q3ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3ATotca__c
     */
    public java.lang.Double getCapMan__Q3ATotca__c() {
        return capMan__Q3ATotca__c;
    }


    /**
     * Sets the capMan__Q3ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3ATotca__c
     */
    public void setCapMan__Q3ATotca__c(java.lang.Double capMan__Q3ATotca__c) {
        this.capMan__Q3ATotca__c = capMan__Q3ATotca__c;
    }


    /**
     * Gets the capMan__Q3PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PAP__c
     */
    public java.lang.Double getCapMan__Q3PAP__c() {
        return capMan__Q3PAP__c;
    }


    /**
     * Sets the capMan__Q3PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PAP__c
     */
    public void setCapMan__Q3PAP__c(java.lang.Double capMan__Q3PAP__c) {
        this.capMan__Q3PAP__c = capMan__Q3PAP__c;
    }


    /**
     * Gets the capMan__Q3PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PAR__c
     */
    public java.lang.Double getCapMan__Q3PAR__c() {
        return capMan__Q3PAR__c;
    }


    /**
     * Sets the capMan__Q3PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PAR__c
     */
    public void setCapMan__Q3PAR__c(java.lang.Double capMan__Q3PAR__c) {
        this.capMan__Q3PAR__c = capMan__Q3PAR__c;
    }


    /**
     * Gets the capMan__Q3PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PCash__c
     */
    public java.lang.Double getCapMan__Q3PCash__c() {
        return capMan__Q3PCash__c;
    }


    /**
     * Sets the capMan__Q3PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PCash__c
     */
    public void setCapMan__Q3PCash__c(java.lang.Double capMan__Q3PCash__c) {
        this.capMan__Q3PCash__c = capMan__Q3PCash__c;
    }


    /**
     * Gets the capMan__Q3PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PDebt__c
     */
    public java.lang.Double getCapMan__Q3PDebt__c() {
        return capMan__Q3PDebt__c;
    }


    /**
     * Sets the capMan__Q3PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PDebt__c
     */
    public void setCapMan__Q3PDebt__c(java.lang.Double capMan__Q3PDebt__c) {
        this.capMan__Q3PDebt__c = capMan__Q3PDebt__c;
    }


    /**
     * Gets the capMan__Q3PDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PDefRev__c
     */
    public java.lang.Double getCapMan__Q3PDefRev__c() {
        return capMan__Q3PDefRev__c;
    }


    /**
     * Sets the capMan__Q3PDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PDefRev__c
     */
    public void setCapMan__Q3PDefRev__c(java.lang.Double capMan__Q3PDefRev__c) {
        this.capMan__Q3PDefRev__c = capMan__Q3PDefRev__c;
    }


    /**
     * Gets the capMan__Q3PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PEq__c
     */
    public java.lang.Double getCapMan__Q3PEq__c() {
        return capMan__Q3PEq__c;
    }


    /**
     * Sets the capMan__Q3PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PEq__c
     */
    public void setCapMan__Q3PEq__c(java.lang.Double capMan__Q3PEq__c) {
        this.capMan__Q3PEq__c = capMan__Q3PEq__c;
    }


    /**
     * Gets the capMan__Q3PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PFix__c
     */
    public java.lang.Double getCapMan__Q3PFix__c() {
        return capMan__Q3PFix__c;
    }


    /**
     * Sets the capMan__Q3PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PFix__c
     */
    public void setCapMan__Q3PFix__c(java.lang.Double capMan__Q3PFix__c) {
        this.capMan__Q3PFix__c = capMan__Q3PFix__c;
    }


    /**
     * Gets the capMan__Q3POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3POca__c
     */
    public java.lang.Double getCapMan__Q3POca__c() {
        return capMan__Q3POca__c;
    }


    /**
     * Sets the capMan__Q3POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3POca__c
     */
    public void setCapMan__Q3POca__c(java.lang.Double capMan__Q3POca__c) {
        this.capMan__Q3POca__c = capMan__Q3POca__c;
    }


    /**
     * Gets the capMan__Q3POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3POtLi__c
     */
    public java.lang.Double getCapMan__Q3POtLi__c() {
        return capMan__Q3POtLi__c;
    }


    /**
     * Sets the capMan__Q3POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3POtLi__c
     */
    public void setCapMan__Q3POtLi__c(java.lang.Double capMan__Q3POtLi__c) {
        this.capMan__Q3POtLi__c = capMan__Q3POtLi__c;
    }


    /**
     * Gets the capMan__Q3POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3POtas__c
     */
    public java.lang.Double getCapMan__Q3POtas__c() {
        return capMan__Q3POtas__c;
    }


    /**
     * Sets the capMan__Q3POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3POtas__c
     */
    public void setCapMan__Q3POtas__c(java.lang.Double capMan__Q3POtas__c) {
        this.capMan__Q3POtas__c = capMan__Q3POtas__c;
    }


    /**
     * Gets the capMan__Q3PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PTotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q3PTotEQ_FML__c() {
        return capMan__Q3PTotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q3PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PTotEQ_FML__c
     */
    public void setCapMan__Q3PTotEQ_FML__c(java.lang.Double capMan__Q3PTotEQ_FML__c) {
        this.capMan__Q3PTotEQ_FML__c = capMan__Q3PTotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q3PTotEQ_FML_for_text__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PTotEQ_FML_for_text__c
     */
    public java.lang.Double getCapMan__Q3PTotEQ_FML_for_text__c() {
        return capMan__Q3PTotEQ_FML_for_text__c;
    }


    /**
     * Sets the capMan__Q3PTotEQ_FML_for_text__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PTotEQ_FML_for_text__c
     */
    public void setCapMan__Q3PTotEQ_FML_for_text__c(java.lang.Double capMan__Q3PTotEQ_FML_for_text__c) {
        this.capMan__Q3PTotEQ_FML_for_text__c = capMan__Q3PTotEQ_FML_for_text__c;
    }


    /**
     * Gets the capMan__Q3PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PTotLE__c
     */
    public java.lang.Double getCapMan__Q3PTotLE__c() {
        return capMan__Q3PTotLE__c;
    }


    /**
     * Sets the capMan__Q3PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PTotLE__c
     */
    public void setCapMan__Q3PTotLE__c(java.lang.Double capMan__Q3PTotLE__c) {
        this.capMan__Q3PTotLE__c = capMan__Q3PTotLE__c;
    }


    /**
     * Gets the capMan__Q3PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PTotLi__c
     */
    public java.lang.Double getCapMan__Q3PTotLi__c() {
        return capMan__Q3PTotLi__c;
    }


    /**
     * Sets the capMan__Q3PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PTotLi__c
     */
    public void setCapMan__Q3PTotLi__c(java.lang.Double capMan__Q3PTotLi__c) {
        this.capMan__Q3PTotLi__c = capMan__Q3PTotLi__c;
    }


    /**
     * Gets the capMan__Q3PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PTotas__c
     */
    public java.lang.Double getCapMan__Q3PTotas__c() {
        return capMan__Q3PTotas__c;
    }


    /**
     * Sets the capMan__Q3PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PTotas__c
     */
    public void setCapMan__Q3PTotas__c(java.lang.Double capMan__Q3PTotas__c) {
        this.capMan__Q3PTotas__c = capMan__Q3PTotas__c;
    }


    /**
     * Gets the capMan__Q3PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3PTotca__c
     */
    public java.lang.Double getCapMan__Q3PTotca__c() {
        return capMan__Q3PTotca__c;
    }


    /**
     * Sets the capMan__Q3PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3PTotca__c
     */
    public void setCapMan__Q3PTotca__c(java.lang.Double capMan__Q3PTotca__c) {
        this.capMan__Q3PTotca__c = capMan__Q3PTotca__c;
    }


    /**
     * Gets the capMan__Q3TOTALS__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3TOTALS__c
     */
    public java.lang.Double getCapMan__Q3TOTALS__c() {
        return capMan__Q3TOTALS__c;
    }


    /**
     * Sets the capMan__Q3TOTALS__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3TOTALS__c
     */
    public void setCapMan__Q3TOTALS__c(java.lang.Double capMan__Q3TOTALS__c) {
        this.capMan__Q3TOTALS__c = capMan__Q3TOTALS__c;
    }


    /**
     * Gets the capMan__Q3_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3_Actual__c
     */
    public java.lang.String getCapMan__Q3_Actual__c() {
        return capMan__Q3_Actual__c;
    }


    /**
     * Sets the capMan__Q3_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3_Actual__c
     */
    public void setCapMan__Q3_Actual__c(java.lang.String capMan__Q3_Actual__c) {
        this.capMan__Q3_Actual__c = capMan__Q3_Actual__c;
    }


    /**
     * Gets the capMan__Q3_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q3_Plan__c
     */
    public java.lang.String getCapMan__Q3_Plan__c() {
        return capMan__Q3_Plan__c;
    }


    /**
     * Sets the capMan__Q3_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q3_Plan__c
     */
    public void setCapMan__Q3_Plan__c(java.lang.String capMan__Q3_Plan__c) {
        this.capMan__Q3_Plan__c = capMan__Q3_Plan__c;
    }


    /**
     * Gets the capMan__Q4AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4AAP__c
     */
    public java.lang.Double getCapMan__Q4AAP__c() {
        return capMan__Q4AAP__c;
    }


    /**
     * Sets the capMan__Q4AAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4AAP__c
     */
    public void setCapMan__Q4AAP__c(java.lang.Double capMan__Q4AAP__c) {
        this.capMan__Q4AAP__c = capMan__Q4AAP__c;
    }


    /**
     * Gets the capMan__Q4AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4AAR__c
     */
    public java.lang.Double getCapMan__Q4AAR__c() {
        return capMan__Q4AAR__c;
    }


    /**
     * Sets the capMan__Q4AAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4AAR__c
     */
    public void setCapMan__Q4AAR__c(java.lang.Double capMan__Q4AAR__c) {
        this.capMan__Q4AAR__c = capMan__Q4AAR__c;
    }


    /**
     * Gets the capMan__Q4ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ACash__c
     */
    public java.lang.Double getCapMan__Q4ACash__c() {
        return capMan__Q4ACash__c;
    }


    /**
     * Sets the capMan__Q4ACash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ACash__c
     */
    public void setCapMan__Q4ACash__c(java.lang.Double capMan__Q4ACash__c) {
        this.capMan__Q4ACash__c = capMan__Q4ACash__c;
    }


    /**
     * Gets the capMan__Q4ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ADebt__c
     */
    public java.lang.Double getCapMan__Q4ADebt__c() {
        return capMan__Q4ADebt__c;
    }


    /**
     * Sets the capMan__Q4ADebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ADebt__c
     */
    public void setCapMan__Q4ADebt__c(java.lang.Double capMan__Q4ADebt__c) {
        this.capMan__Q4ADebt__c = capMan__Q4ADebt__c;
    }


    /**
     * Gets the capMan__Q4ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ADefRev__c
     */
    public java.lang.Double getCapMan__Q4ADefRev__c() {
        return capMan__Q4ADefRev__c;
    }


    /**
     * Sets the capMan__Q4ADefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ADefRev__c
     */
    public void setCapMan__Q4ADefRev__c(java.lang.Double capMan__Q4ADefRev__c) {
        this.capMan__Q4ADefRev__c = capMan__Q4ADefRev__c;
    }


    /**
     * Gets the capMan__Q4AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4AEq__c
     */
    public java.lang.Double getCapMan__Q4AEq__c() {
        return capMan__Q4AEq__c;
    }


    /**
     * Sets the capMan__Q4AEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4AEq__c
     */
    public void setCapMan__Q4AEq__c(java.lang.Double capMan__Q4AEq__c) {
        this.capMan__Q4AEq__c = capMan__Q4AEq__c;
    }


    /**
     * Gets the capMan__Q4AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4AFix__c
     */
    public java.lang.Double getCapMan__Q4AFix__c() {
        return capMan__Q4AFix__c;
    }


    /**
     * Sets the capMan__Q4AFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4AFix__c
     */
    public void setCapMan__Q4AFix__c(java.lang.Double capMan__Q4AFix__c) {
        this.capMan__Q4AFix__c = capMan__Q4AFix__c;
    }


    /**
     * Gets the capMan__Q4AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4AOca__c
     */
    public java.lang.Double getCapMan__Q4AOca__c() {
        return capMan__Q4AOca__c;
    }


    /**
     * Sets the capMan__Q4AOca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4AOca__c
     */
    public void setCapMan__Q4AOca__c(java.lang.Double capMan__Q4AOca__c) {
        this.capMan__Q4AOca__c = capMan__Q4AOca__c;
    }


    /**
     * Gets the capMan__Q4AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4AOtLi__c
     */
    public java.lang.Double getCapMan__Q4AOtLi__c() {
        return capMan__Q4AOtLi__c;
    }


    /**
     * Sets the capMan__Q4AOtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4AOtLi__c
     */
    public void setCapMan__Q4AOtLi__c(java.lang.Double capMan__Q4AOtLi__c) {
        this.capMan__Q4AOtLi__c = capMan__Q4AOtLi__c;
    }


    /**
     * Gets the capMan__Q4AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4AOtas__c
     */
    public java.lang.Double getCapMan__Q4AOtas__c() {
        return capMan__Q4AOtas__c;
    }


    /**
     * Sets the capMan__Q4AOtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4AOtas__c
     */
    public void setCapMan__Q4AOtas__c(java.lang.Double capMan__Q4AOtas__c) {
        this.capMan__Q4AOtas__c = capMan__Q4AOtas__c;
    }


    /**
     * Gets the capMan__Q4ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ATotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q4ATotEQ_FML__c() {
        return capMan__Q4ATotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q4ATotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ATotEQ_FML__c
     */
    public void setCapMan__Q4ATotEQ_FML__c(java.lang.Double capMan__Q4ATotEQ_FML__c) {
        this.capMan__Q4ATotEQ_FML__c = capMan__Q4ATotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q4ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ATotLE__c
     */
    public java.lang.Double getCapMan__Q4ATotLE__c() {
        return capMan__Q4ATotLE__c;
    }


    /**
     * Sets the capMan__Q4ATotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ATotLE__c
     */
    public void setCapMan__Q4ATotLE__c(java.lang.Double capMan__Q4ATotLE__c) {
        this.capMan__Q4ATotLE__c = capMan__Q4ATotLE__c;
    }


    /**
     * Gets the capMan__Q4ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ATotLi__c
     */
    public java.lang.Double getCapMan__Q4ATotLi__c() {
        return capMan__Q4ATotLi__c;
    }


    /**
     * Sets the capMan__Q4ATotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ATotLi__c
     */
    public void setCapMan__Q4ATotLi__c(java.lang.Double capMan__Q4ATotLi__c) {
        this.capMan__Q4ATotLi__c = capMan__Q4ATotLi__c;
    }


    /**
     * Gets the capMan__Q4ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ATotas__c
     */
    public java.lang.Double getCapMan__Q4ATotas__c() {
        return capMan__Q4ATotas__c;
    }


    /**
     * Sets the capMan__Q4ATotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ATotas__c
     */
    public void setCapMan__Q4ATotas__c(java.lang.Double capMan__Q4ATotas__c) {
        this.capMan__Q4ATotas__c = capMan__Q4ATotas__c;
    }


    /**
     * Gets the capMan__Q4ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4ATotca__c
     */
    public java.lang.Double getCapMan__Q4ATotca__c() {
        return capMan__Q4ATotca__c;
    }


    /**
     * Sets the capMan__Q4ATotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4ATotca__c
     */
    public void setCapMan__Q4ATotca__c(java.lang.Double capMan__Q4ATotca__c) {
        this.capMan__Q4ATotca__c = capMan__Q4ATotca__c;
    }


    /**
     * Gets the capMan__Q4PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PAP__c
     */
    public java.lang.Double getCapMan__Q4PAP__c() {
        return capMan__Q4PAP__c;
    }


    /**
     * Sets the capMan__Q4PAP__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PAP__c
     */
    public void setCapMan__Q4PAP__c(java.lang.Double capMan__Q4PAP__c) {
        this.capMan__Q4PAP__c = capMan__Q4PAP__c;
    }


    /**
     * Gets the capMan__Q4PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PAR__c
     */
    public java.lang.Double getCapMan__Q4PAR__c() {
        return capMan__Q4PAR__c;
    }


    /**
     * Sets the capMan__Q4PAR__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PAR__c
     */
    public void setCapMan__Q4PAR__c(java.lang.Double capMan__Q4PAR__c) {
        this.capMan__Q4PAR__c = capMan__Q4PAR__c;
    }


    /**
     * Gets the capMan__Q4PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PCash__c
     */
    public java.lang.Double getCapMan__Q4PCash__c() {
        return capMan__Q4PCash__c;
    }


    /**
     * Sets the capMan__Q4PCash__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PCash__c
     */
    public void setCapMan__Q4PCash__c(java.lang.Double capMan__Q4PCash__c) {
        this.capMan__Q4PCash__c = capMan__Q4PCash__c;
    }


    /**
     * Gets the capMan__Q4PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PDebt__c
     */
    public java.lang.Double getCapMan__Q4PDebt__c() {
        return capMan__Q4PDebt__c;
    }


    /**
     * Sets the capMan__Q4PDebt__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PDebt__c
     */
    public void setCapMan__Q4PDebt__c(java.lang.Double capMan__Q4PDebt__c) {
        this.capMan__Q4PDebt__c = capMan__Q4PDebt__c;
    }


    /**
     * Gets the capMan__Q4PDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PDefRev__c
     */
    public java.lang.Double getCapMan__Q4PDefRev__c() {
        return capMan__Q4PDefRev__c;
    }


    /**
     * Sets the capMan__Q4PDefRev__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PDefRev__c
     */
    public void setCapMan__Q4PDefRev__c(java.lang.Double capMan__Q4PDefRev__c) {
        this.capMan__Q4PDefRev__c = capMan__Q4PDefRev__c;
    }


    /**
     * Gets the capMan__Q4PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PEq__c
     */
    public java.lang.Double getCapMan__Q4PEq__c() {
        return capMan__Q4PEq__c;
    }


    /**
     * Sets the capMan__Q4PEq__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PEq__c
     */
    public void setCapMan__Q4PEq__c(java.lang.Double capMan__Q4PEq__c) {
        this.capMan__Q4PEq__c = capMan__Q4PEq__c;
    }


    /**
     * Gets the capMan__Q4PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PFix__c
     */
    public java.lang.Double getCapMan__Q4PFix__c() {
        return capMan__Q4PFix__c;
    }


    /**
     * Sets the capMan__Q4PFix__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PFix__c
     */
    public void setCapMan__Q4PFix__c(java.lang.Double capMan__Q4PFix__c) {
        this.capMan__Q4PFix__c = capMan__Q4PFix__c;
    }


    /**
     * Gets the capMan__Q4POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4POca__c
     */
    public java.lang.Double getCapMan__Q4POca__c() {
        return capMan__Q4POca__c;
    }


    /**
     * Sets the capMan__Q4POca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4POca__c
     */
    public void setCapMan__Q4POca__c(java.lang.Double capMan__Q4POca__c) {
        this.capMan__Q4POca__c = capMan__Q4POca__c;
    }


    /**
     * Gets the capMan__Q4POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4POtLi__c
     */
    public java.lang.Double getCapMan__Q4POtLi__c() {
        return capMan__Q4POtLi__c;
    }


    /**
     * Sets the capMan__Q4POtLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4POtLi__c
     */
    public void setCapMan__Q4POtLi__c(java.lang.Double capMan__Q4POtLi__c) {
        this.capMan__Q4POtLi__c = capMan__Q4POtLi__c;
    }


    /**
     * Gets the capMan__Q4POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4POtas__c
     */
    public java.lang.Double getCapMan__Q4POtas__c() {
        return capMan__Q4POtas__c;
    }


    /**
     * Sets the capMan__Q4POtas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4POtas__c
     */
    public void setCapMan__Q4POtas__c(java.lang.Double capMan__Q4POtas__c) {
        this.capMan__Q4POtas__c = capMan__Q4POtas__c;
    }


    /**
     * Gets the capMan__Q4PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PTotEQ_FML__c
     */
    public java.lang.Double getCapMan__Q4PTotEQ_FML__c() {
        return capMan__Q4PTotEQ_FML__c;
    }


    /**
     * Sets the capMan__Q4PTotEQ_FML__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PTotEQ_FML__c
     */
    public void setCapMan__Q4PTotEQ_FML__c(java.lang.Double capMan__Q4PTotEQ_FML__c) {
        this.capMan__Q4PTotEQ_FML__c = capMan__Q4PTotEQ_FML__c;
    }


    /**
     * Gets the capMan__Q4PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PTotLE__c
     */
    public java.lang.Double getCapMan__Q4PTotLE__c() {
        return capMan__Q4PTotLE__c;
    }


    /**
     * Sets the capMan__Q4PTotLE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PTotLE__c
     */
    public void setCapMan__Q4PTotLE__c(java.lang.Double capMan__Q4PTotLE__c) {
        this.capMan__Q4PTotLE__c = capMan__Q4PTotLE__c;
    }


    /**
     * Gets the capMan__Q4PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PTotLi__c
     */
    public java.lang.Double getCapMan__Q4PTotLi__c() {
        return capMan__Q4PTotLi__c;
    }


    /**
     * Sets the capMan__Q4PTotLi__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PTotLi__c
     */
    public void setCapMan__Q4PTotLi__c(java.lang.Double capMan__Q4PTotLi__c) {
        this.capMan__Q4PTotLi__c = capMan__Q4PTotLi__c;
    }


    /**
     * Gets the capMan__Q4PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PTotas__c
     */
    public java.lang.Double getCapMan__Q4PTotas__c() {
        return capMan__Q4PTotas__c;
    }


    /**
     * Sets the capMan__Q4PTotas__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PTotas__c
     */
    public void setCapMan__Q4PTotas__c(java.lang.Double capMan__Q4PTotas__c) {
        this.capMan__Q4PTotas__c = capMan__Q4PTotas__c;
    }


    /**
     * Gets the capMan__Q4PTotas_new__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PTotas_new__c
     */
    public java.lang.Double getCapMan__Q4PTotas_new__c() {
        return capMan__Q4PTotas_new__c;
    }


    /**
     * Sets the capMan__Q4PTotas_new__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PTotas_new__c
     */
    public void setCapMan__Q4PTotas_new__c(java.lang.Double capMan__Q4PTotas_new__c) {
        this.capMan__Q4PTotas_new__c = capMan__Q4PTotas_new__c;
    }


    /**
     * Gets the capMan__Q4PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4PTotca__c
     */
    public java.lang.Double getCapMan__Q4PTotca__c() {
        return capMan__Q4PTotca__c;
    }


    /**
     * Sets the capMan__Q4PTotca__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4PTotca__c
     */
    public void setCapMan__Q4PTotca__c(java.lang.Double capMan__Q4PTotca__c) {
        this.capMan__Q4PTotca__c = capMan__Q4PTotca__c;
    }


    /**
     * Gets the capMan__Q4P_NEW_Tot_LE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4P_NEW_Tot_LE__c
     */
    public java.lang.Double getCapMan__Q4P_NEW_Tot_LE__c() {
        return capMan__Q4P_NEW_Tot_LE__c;
    }


    /**
     * Sets the capMan__Q4P_NEW_Tot_LE__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4P_NEW_Tot_LE__c
     */
    public void setCapMan__Q4P_NEW_Tot_LE__c(java.lang.Double capMan__Q4P_NEW_Tot_LE__c) {
        this.capMan__Q4P_NEW_Tot_LE__c = capMan__Q4P_NEW_Tot_LE__c;
    }


    /**
     * Gets the capMan__Q4_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4_Actual__c
     */
    public java.lang.String getCapMan__Q4_Actual__c() {
        return capMan__Q4_Actual__c;
    }


    /**
     * Sets the capMan__Q4_Actual__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4_Actual__c
     */
    public void setCapMan__Q4_Actual__c(java.lang.String capMan__Q4_Actual__c) {
        this.capMan__Q4_Actual__c = capMan__Q4_Actual__c;
    }


    /**
     * Gets the capMan__Q4_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Q4_Plan__c
     */
    public java.lang.String getCapMan__Q4_Plan__c() {
        return capMan__Q4_Plan__c;
    }


    /**
     * Sets the capMan__Q4_Plan__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Q4_Plan__c
     */
    public void setCapMan__Q4_Plan__c(java.lang.String capMan__Q4_Plan__c) {
        this.capMan__Q4_Plan__c = capMan__Q4_Plan__c;
    }


    /**
     * Gets the capMan__Start_Date__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Start_Date__c
     */
    public java.util.Date getCapMan__Start_Date__c() {
        return capMan__Start_Date__c;
    }


    /**
     * Sets the capMan__Start_Date__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Start_Date__c
     */
    public void setCapMan__Start_Date__c(java.util.Date capMan__Start_Date__c) {
        this.capMan__Start_Date__c = capMan__Start_Date__c;
    }


    /**
     * Gets the capMan__Year__c value for this CapMan__Balance_Sheet__c.
     * 
     * @return capMan__Year__c
     */
    public java.lang.String getCapMan__Year__c() {
        return capMan__Year__c;
    }


    /**
     * Sets the capMan__Year__c value for this CapMan__Balance_Sheet__c.
     * 
     * @param capMan__Year__c
     */
    public void setCapMan__Year__c(java.lang.String capMan__Year__c) {
        this.capMan__Year__c = capMan__Year__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Balance_Sheet__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Balance_Sheet__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Balance_Sheet__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Balance_Sheet__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Balance_Sheet__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Balance_Sheet__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Balance_Sheet__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Balance_Sheet__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Balance_Sheet__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Balance_Sheet__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Balance_Sheet__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Balance_Sheet__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Balance_Sheet__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Balance_Sheet__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Balance_Sheet__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Balance_Sheet__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Balance_Sheet__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Balance_Sheet__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Balance_Sheet__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Balance_Sheet__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Balance_Sheet__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Balance_Sheet__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Balance_Sheet__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Balance_Sheet__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this CapMan__Balance_Sheet__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Balance_Sheet__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Balance_Sheet__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Balance_Sheet__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Balance_Sheet__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Balance_Sheet__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Balance_Sheet__c)) return false;
        CapMan__Balance_Sheet__c other = (CapMan__Balance_Sheet__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.capMan__APAP__c==null && other.getCapMan__APAP__c()==null) || 
             (this.capMan__APAP__c!=null &&
              this.capMan__APAP__c.equals(other.getCapMan__APAP__c()))) &&
            ((this.capMan__APAR__c==null && other.getCapMan__APAR__c()==null) || 
             (this.capMan__APAR__c!=null &&
              this.capMan__APAR__c.equals(other.getCapMan__APAR__c()))) &&
            ((this.capMan__APCash__c==null && other.getCapMan__APCash__c()==null) || 
             (this.capMan__APCash__c!=null &&
              this.capMan__APCash__c.equals(other.getCapMan__APCash__c()))) &&
            ((this.capMan__APDebt__c==null && other.getCapMan__APDebt__c()==null) || 
             (this.capMan__APDebt__c!=null &&
              this.capMan__APDebt__c.equals(other.getCapMan__APDebt__c()))) &&
            ((this.capMan__APDefRev__c==null && other.getCapMan__APDefRev__c()==null) || 
             (this.capMan__APDefRev__c!=null &&
              this.capMan__APDefRev__c.equals(other.getCapMan__APDefRev__c()))) &&
            ((this.capMan__APEq__c==null && other.getCapMan__APEq__c()==null) || 
             (this.capMan__APEq__c!=null &&
              this.capMan__APEq__c.equals(other.getCapMan__APEq__c()))) &&
            ((this.capMan__APFix__c==null && other.getCapMan__APFix__c()==null) || 
             (this.capMan__APFix__c!=null &&
              this.capMan__APFix__c.equals(other.getCapMan__APFix__c()))) &&
            ((this.capMan__APOca__c==null && other.getCapMan__APOca__c()==null) || 
             (this.capMan__APOca__c!=null &&
              this.capMan__APOca__c.equals(other.getCapMan__APOca__c()))) &&
            ((this.capMan__APOtLi__c==null && other.getCapMan__APOtLi__c()==null) || 
             (this.capMan__APOtLi__c!=null &&
              this.capMan__APOtLi__c.equals(other.getCapMan__APOtLi__c()))) &&
            ((this.capMan__APOtas__c==null && other.getCapMan__APOtas__c()==null) || 
             (this.capMan__APOtas__c!=null &&
              this.capMan__APOtas__c.equals(other.getCapMan__APOtas__c()))) &&
            ((this.capMan__APTotLE__c==null && other.getCapMan__APTotLE__c()==null) || 
             (this.capMan__APTotLE__c!=null &&
              this.capMan__APTotLE__c.equals(other.getCapMan__APTotLE__c()))) &&
            ((this.capMan__APTotLi__c==null && other.getCapMan__APTotLi__c()==null) || 
             (this.capMan__APTotLi__c!=null &&
              this.capMan__APTotLi__c.equals(other.getCapMan__APTotLi__c()))) &&
            ((this.capMan__APTotas__c==null && other.getCapMan__APTotas__c()==null) || 
             (this.capMan__APTotas__c!=null &&
              this.capMan__APTotas__c.equals(other.getCapMan__APTotas__c()))) &&
            ((this.capMan__APTotca__c==null && other.getCapMan__APTotca__c()==null) || 
             (this.capMan__APTotca__c!=null &&
              this.capMan__APTotca__c.equals(other.getCapMan__APTotca__c()))) &&
            ((this.capMan__Account__c==null && other.getCapMan__Account__c()==null) || 
             (this.capMan__Account__c!=null &&
              this.capMan__Account__c.equals(other.getCapMan__Account__c()))) &&
            ((this.capMan__Account__r==null && other.getCapMan__Account__r()==null) || 
             (this.capMan__Account__r!=null &&
              this.capMan__Account__r.equals(other.getCapMan__Account__r()))) &&
            ((this.capMan__Default_Quarter__c==null && other.getCapMan__Default_Quarter__c()==null) || 
             (this.capMan__Default_Quarter__c!=null &&
              this.capMan__Default_Quarter__c.equals(other.getCapMan__Default_Quarter__c()))) &&
            ((this.capMan__End_Date__c==null && other.getCapMan__End_Date__c()==null) || 
             (this.capMan__End_Date__c!=null &&
              this.capMan__End_Date__c.equals(other.getCapMan__End_Date__c()))) &&
            ((this.capMan__FYAAP__c==null && other.getCapMan__FYAAP__c()==null) || 
             (this.capMan__FYAAP__c!=null &&
              this.capMan__FYAAP__c.equals(other.getCapMan__FYAAP__c()))) &&
            ((this.capMan__FYAAR__c==null && other.getCapMan__FYAAR__c()==null) || 
             (this.capMan__FYAAR__c!=null &&
              this.capMan__FYAAR__c.equals(other.getCapMan__FYAAR__c()))) &&
            ((this.capMan__FYACash__c==null && other.getCapMan__FYACash__c()==null) || 
             (this.capMan__FYACash__c!=null &&
              this.capMan__FYACash__c.equals(other.getCapMan__FYACash__c()))) &&
            ((this.capMan__FYADebt__c==null && other.getCapMan__FYADebt__c()==null) || 
             (this.capMan__FYADebt__c!=null &&
              this.capMan__FYADebt__c.equals(other.getCapMan__FYADebt__c()))) &&
            ((this.capMan__FYADefRev__c==null && other.getCapMan__FYADefRev__c()==null) || 
             (this.capMan__FYADefRev__c!=null &&
              this.capMan__FYADefRev__c.equals(other.getCapMan__FYADefRev__c()))) &&
            ((this.capMan__FYAEq__c==null && other.getCapMan__FYAEq__c()==null) || 
             (this.capMan__FYAEq__c!=null &&
              this.capMan__FYAEq__c.equals(other.getCapMan__FYAEq__c()))) &&
            ((this.capMan__FYAFix__c==null && other.getCapMan__FYAFix__c()==null) || 
             (this.capMan__FYAFix__c!=null &&
              this.capMan__FYAFix__c.equals(other.getCapMan__FYAFix__c()))) &&
            ((this.capMan__FYAOca__c==null && other.getCapMan__FYAOca__c()==null) || 
             (this.capMan__FYAOca__c!=null &&
              this.capMan__FYAOca__c.equals(other.getCapMan__FYAOca__c()))) &&
            ((this.capMan__FYAOtLi__c==null && other.getCapMan__FYAOtLi__c()==null) || 
             (this.capMan__FYAOtLi__c!=null &&
              this.capMan__FYAOtLi__c.equals(other.getCapMan__FYAOtLi__c()))) &&
            ((this.capMan__FYAOtas__c==null && other.getCapMan__FYAOtas__c()==null) || 
             (this.capMan__FYAOtas__c!=null &&
              this.capMan__FYAOtas__c.equals(other.getCapMan__FYAOtas__c()))) &&
            ((this.capMan__FYATotLE__c==null && other.getCapMan__FYATotLE__c()==null) || 
             (this.capMan__FYATotLE__c!=null &&
              this.capMan__FYATotLE__c.equals(other.getCapMan__FYATotLE__c()))) &&
            ((this.capMan__FYATotLi__c==null && other.getCapMan__FYATotLi__c()==null) || 
             (this.capMan__FYATotLi__c!=null &&
              this.capMan__FYATotLi__c.equals(other.getCapMan__FYATotLi__c()))) &&
            ((this.capMan__FYATotas__c==null && other.getCapMan__FYATotas__c()==null) || 
             (this.capMan__FYATotas__c!=null &&
              this.capMan__FYATotas__c.equals(other.getCapMan__FYATotas__c()))) &&
            ((this.capMan__FYATotca__c==null && other.getCapMan__FYATotca__c()==null) || 
             (this.capMan__FYATotca__c!=null &&
              this.capMan__FYATotca__c.equals(other.getCapMan__FYATotca__c()))) &&
            ((this.capMan__FYPAP__c==null && other.getCapMan__FYPAP__c()==null) || 
             (this.capMan__FYPAP__c!=null &&
              this.capMan__FYPAP__c.equals(other.getCapMan__FYPAP__c()))) &&
            ((this.capMan__FYPAR__c==null && other.getCapMan__FYPAR__c()==null) || 
             (this.capMan__FYPAR__c!=null &&
              this.capMan__FYPAR__c.equals(other.getCapMan__FYPAR__c()))) &&
            ((this.capMan__FYPCash__c==null && other.getCapMan__FYPCash__c()==null) || 
             (this.capMan__FYPCash__c!=null &&
              this.capMan__FYPCash__c.equals(other.getCapMan__FYPCash__c()))) &&
            ((this.capMan__FYPDebt__c==null && other.getCapMan__FYPDebt__c()==null) || 
             (this.capMan__FYPDebt__c!=null &&
              this.capMan__FYPDebt__c.equals(other.getCapMan__FYPDebt__c()))) &&
            ((this.capMan__FYPDefRev__c==null && other.getCapMan__FYPDefRev__c()==null) || 
             (this.capMan__FYPDefRev__c!=null &&
              this.capMan__FYPDefRev__c.equals(other.getCapMan__FYPDefRev__c()))) &&
            ((this.capMan__FYPEq__c==null && other.getCapMan__FYPEq__c()==null) || 
             (this.capMan__FYPEq__c!=null &&
              this.capMan__FYPEq__c.equals(other.getCapMan__FYPEq__c()))) &&
            ((this.capMan__FYPFix__c==null && other.getCapMan__FYPFix__c()==null) || 
             (this.capMan__FYPFix__c!=null &&
              this.capMan__FYPFix__c.equals(other.getCapMan__FYPFix__c()))) &&
            ((this.capMan__FYPOca__c==null && other.getCapMan__FYPOca__c()==null) || 
             (this.capMan__FYPOca__c!=null &&
              this.capMan__FYPOca__c.equals(other.getCapMan__FYPOca__c()))) &&
            ((this.capMan__FYPOtLi__c==null && other.getCapMan__FYPOtLi__c()==null) || 
             (this.capMan__FYPOtLi__c!=null &&
              this.capMan__FYPOtLi__c.equals(other.getCapMan__FYPOtLi__c()))) &&
            ((this.capMan__FYPOtas__c==null && other.getCapMan__FYPOtas__c()==null) || 
             (this.capMan__FYPOtas__c!=null &&
              this.capMan__FYPOtas__c.equals(other.getCapMan__FYPOtas__c()))) &&
            ((this.capMan__FYPTotLE_NEW__c==null && other.getCapMan__FYPTotLE_NEW__c()==null) || 
             (this.capMan__FYPTotLE_NEW__c!=null &&
              this.capMan__FYPTotLE_NEW__c.equals(other.getCapMan__FYPTotLE_NEW__c()))) &&
            ((this.capMan__FYPTotLE__c==null && other.getCapMan__FYPTotLE__c()==null) || 
             (this.capMan__FYPTotLE__c!=null &&
              this.capMan__FYPTotLE__c.equals(other.getCapMan__FYPTotLE__c()))) &&
            ((this.capMan__FYPTotLi__c==null && other.getCapMan__FYPTotLi__c()==null) || 
             (this.capMan__FYPTotLi__c!=null &&
              this.capMan__FYPTotLi__c.equals(other.getCapMan__FYPTotLi__c()))) &&
            ((this.capMan__FYPTotas__c==null && other.getCapMan__FYPTotas__c()==null) || 
             (this.capMan__FYPTotas__c!=null &&
              this.capMan__FYPTotas__c.equals(other.getCapMan__FYPTotas__c()))) &&
            ((this.capMan__FYPTotca__c==null && other.getCapMan__FYPTotca__c()==null) || 
             (this.capMan__FYPTotca__c!=null &&
              this.capMan__FYPTotca__c.equals(other.getCapMan__FYPTotca__c()))) &&
            ((this.capMan__FiscalYear__c==null && other.getCapMan__FiscalYear__c()==null) || 
             (this.capMan__FiscalYear__c!=null &&
              this.capMan__FiscalYear__c.equals(other.getCapMan__FiscalYear__c()))) &&
            ((this.capMan__Formula_Start_Date__c==null && other.getCapMan__Formula_Start_Date__c()==null) || 
             (this.capMan__Formula_Start_Date__c!=null &&
              this.capMan__Formula_Start_Date__c.equals(other.getCapMan__Formula_Start_Date__c()))) &&
            ((this.capMan__Industry__c==null && other.getCapMan__Industry__c()==null) || 
             (this.capMan__Industry__c!=null &&
              this.capMan__Industry__c.equals(other.getCapMan__Industry__c()))) &&
            ((this.capMan__Pipeline1__r==null && other.getCapMan__Pipeline1__r()==null) || 
             (this.capMan__Pipeline1__r!=null &&
              this.capMan__Pipeline1__r.equals(other.getCapMan__Pipeline1__r()))) &&
            ((this.capMan__Q1AAP__c==null && other.getCapMan__Q1AAP__c()==null) || 
             (this.capMan__Q1AAP__c!=null &&
              this.capMan__Q1AAP__c.equals(other.getCapMan__Q1AAP__c()))) &&
            ((this.capMan__Q1AAR__c==null && other.getCapMan__Q1AAR__c()==null) || 
             (this.capMan__Q1AAR__c!=null &&
              this.capMan__Q1AAR__c.equals(other.getCapMan__Q1AAR__c()))) &&
            ((this.capMan__Q1ACash__c==null && other.getCapMan__Q1ACash__c()==null) || 
             (this.capMan__Q1ACash__c!=null &&
              this.capMan__Q1ACash__c.equals(other.getCapMan__Q1ACash__c()))) &&
            ((this.capMan__Q1ADebt__c==null && other.getCapMan__Q1ADebt__c()==null) || 
             (this.capMan__Q1ADebt__c!=null &&
              this.capMan__Q1ADebt__c.equals(other.getCapMan__Q1ADebt__c()))) &&
            ((this.capMan__Q1ADefRev__c==null && other.getCapMan__Q1ADefRev__c()==null) || 
             (this.capMan__Q1ADefRev__c!=null &&
              this.capMan__Q1ADefRev__c.equals(other.getCapMan__Q1ADefRev__c()))) &&
            ((this.capMan__Q1AEq__c==null && other.getCapMan__Q1AEq__c()==null) || 
             (this.capMan__Q1AEq__c!=null &&
              this.capMan__Q1AEq__c.equals(other.getCapMan__Q1AEq__c()))) &&
            ((this.capMan__Q1AFix__c==null && other.getCapMan__Q1AFix__c()==null) || 
             (this.capMan__Q1AFix__c!=null &&
              this.capMan__Q1AFix__c.equals(other.getCapMan__Q1AFix__c()))) &&
            ((this.capMan__Q1AOca__c==null && other.getCapMan__Q1AOca__c()==null) || 
             (this.capMan__Q1AOca__c!=null &&
              this.capMan__Q1AOca__c.equals(other.getCapMan__Q1AOca__c()))) &&
            ((this.capMan__Q1AOtLi__c==null && other.getCapMan__Q1AOtLi__c()==null) || 
             (this.capMan__Q1AOtLi__c!=null &&
              this.capMan__Q1AOtLi__c.equals(other.getCapMan__Q1AOtLi__c()))) &&
            ((this.capMan__Q1AOtas__c==null && other.getCapMan__Q1AOtas__c()==null) || 
             (this.capMan__Q1AOtas__c!=null &&
              this.capMan__Q1AOtas__c.equals(other.getCapMan__Q1AOtas__c()))) &&
            ((this.capMan__Q1ATotEQ_FML__c==null && other.getCapMan__Q1ATotEQ_FML__c()==null) || 
             (this.capMan__Q1ATotEQ_FML__c!=null &&
              this.capMan__Q1ATotEQ_FML__c.equals(other.getCapMan__Q1ATotEQ_FML__c()))) &&
            ((this.capMan__Q1ATotLE__c==null && other.getCapMan__Q1ATotLE__c()==null) || 
             (this.capMan__Q1ATotLE__c!=null &&
              this.capMan__Q1ATotLE__c.equals(other.getCapMan__Q1ATotLE__c()))) &&
            ((this.capMan__Q1ATotLi__c==null && other.getCapMan__Q1ATotLi__c()==null) || 
             (this.capMan__Q1ATotLi__c!=null &&
              this.capMan__Q1ATotLi__c.equals(other.getCapMan__Q1ATotLi__c()))) &&
            ((this.capMan__Q1ATotas__c==null && other.getCapMan__Q1ATotas__c()==null) || 
             (this.capMan__Q1ATotas__c!=null &&
              this.capMan__Q1ATotas__c.equals(other.getCapMan__Q1ATotas__c()))) &&
            ((this.capMan__Q1ATotca__c==null && other.getCapMan__Q1ATotca__c()==null) || 
             (this.capMan__Q1ATotca__c!=null &&
              this.capMan__Q1ATotca__c.equals(other.getCapMan__Q1ATotca__c()))) &&
            ((this.capMan__Q1PAP__c==null && other.getCapMan__Q1PAP__c()==null) || 
             (this.capMan__Q1PAP__c!=null &&
              this.capMan__Q1PAP__c.equals(other.getCapMan__Q1PAP__c()))) &&
            ((this.capMan__Q1PAR__c==null && other.getCapMan__Q1PAR__c()==null) || 
             (this.capMan__Q1PAR__c!=null &&
              this.capMan__Q1PAR__c.equals(other.getCapMan__Q1PAR__c()))) &&
            ((this.capMan__Q1PCash__c==null && other.getCapMan__Q1PCash__c()==null) || 
             (this.capMan__Q1PCash__c!=null &&
              this.capMan__Q1PCash__c.equals(other.getCapMan__Q1PCash__c()))) &&
            ((this.capMan__Q1PDebt__c==null && other.getCapMan__Q1PDebt__c()==null) || 
             (this.capMan__Q1PDebt__c!=null &&
              this.capMan__Q1PDebt__c.equals(other.getCapMan__Q1PDebt__c()))) &&
            ((this.capMan__Q1PDefrev__c==null && other.getCapMan__Q1PDefrev__c()==null) || 
             (this.capMan__Q1PDefrev__c!=null &&
              this.capMan__Q1PDefrev__c.equals(other.getCapMan__Q1PDefrev__c()))) &&
            ((this.capMan__Q1PEq__c==null && other.getCapMan__Q1PEq__c()==null) || 
             (this.capMan__Q1PEq__c!=null &&
              this.capMan__Q1PEq__c.equals(other.getCapMan__Q1PEq__c()))) &&
            ((this.capMan__Q1PFix__c==null && other.getCapMan__Q1PFix__c()==null) || 
             (this.capMan__Q1PFix__c!=null &&
              this.capMan__Q1PFix__c.equals(other.getCapMan__Q1PFix__c()))) &&
            ((this.capMan__Q1POca__c==null && other.getCapMan__Q1POca__c()==null) || 
             (this.capMan__Q1POca__c!=null &&
              this.capMan__Q1POca__c.equals(other.getCapMan__Q1POca__c()))) &&
            ((this.capMan__Q1POtLi__c==null && other.getCapMan__Q1POtLi__c()==null) || 
             (this.capMan__Q1POtLi__c!=null &&
              this.capMan__Q1POtLi__c.equals(other.getCapMan__Q1POtLi__c()))) &&
            ((this.capMan__Q1POtas__c==null && other.getCapMan__Q1POtas__c()==null) || 
             (this.capMan__Q1POtas__c!=null &&
              this.capMan__Q1POtas__c.equals(other.getCapMan__Q1POtas__c()))) &&
            ((this.capMan__Q1PTotEQ_FML__c==null && other.getCapMan__Q1PTotEQ_FML__c()==null) || 
             (this.capMan__Q1PTotEQ_FML__c!=null &&
              this.capMan__Q1PTotEQ_FML__c.equals(other.getCapMan__Q1PTotEQ_FML__c()))) &&
            ((this.capMan__Q1PTotLE__c==null && other.getCapMan__Q1PTotLE__c()==null) || 
             (this.capMan__Q1PTotLE__c!=null &&
              this.capMan__Q1PTotLE__c.equals(other.getCapMan__Q1PTotLE__c()))) &&
            ((this.capMan__Q1PTotLi__c==null && other.getCapMan__Q1PTotLi__c()==null) || 
             (this.capMan__Q1PTotLi__c!=null &&
              this.capMan__Q1PTotLi__c.equals(other.getCapMan__Q1PTotLi__c()))) &&
            ((this.capMan__Q1PTotas__c==null && other.getCapMan__Q1PTotas__c()==null) || 
             (this.capMan__Q1PTotas__c!=null &&
              this.capMan__Q1PTotas__c.equals(other.getCapMan__Q1PTotas__c()))) &&
            ((this.capMan__Q1PTotca__c==null && other.getCapMan__Q1PTotca__c()==null) || 
             (this.capMan__Q1PTotca__c!=null &&
              this.capMan__Q1PTotca__c.equals(other.getCapMan__Q1PTotca__c()))) &&
            ((this.capMan__Q1_Actual__c==null && other.getCapMan__Q1_Actual__c()==null) || 
             (this.capMan__Q1_Actual__c!=null &&
              this.capMan__Q1_Actual__c.equals(other.getCapMan__Q1_Actual__c()))) &&
            ((this.capMan__Q1_Plan__c==null && other.getCapMan__Q1_Plan__c()==null) || 
             (this.capMan__Q1_Plan__c!=null &&
              this.capMan__Q1_Plan__c.equals(other.getCapMan__Q1_Plan__c()))) &&
            ((this.capMan__Q2AAP__c==null && other.getCapMan__Q2AAP__c()==null) || 
             (this.capMan__Q2AAP__c!=null &&
              this.capMan__Q2AAP__c.equals(other.getCapMan__Q2AAP__c()))) &&
            ((this.capMan__Q2AAR__c==null && other.getCapMan__Q2AAR__c()==null) || 
             (this.capMan__Q2AAR__c!=null &&
              this.capMan__Q2AAR__c.equals(other.getCapMan__Q2AAR__c()))) &&
            ((this.capMan__Q2ACash__c==null && other.getCapMan__Q2ACash__c()==null) || 
             (this.capMan__Q2ACash__c!=null &&
              this.capMan__Q2ACash__c.equals(other.getCapMan__Q2ACash__c()))) &&
            ((this.capMan__Q2ADebt__c==null && other.getCapMan__Q2ADebt__c()==null) || 
             (this.capMan__Q2ADebt__c!=null &&
              this.capMan__Q2ADebt__c.equals(other.getCapMan__Q2ADebt__c()))) &&
            ((this.capMan__Q2ADefRev__c==null && other.getCapMan__Q2ADefRev__c()==null) || 
             (this.capMan__Q2ADefRev__c!=null &&
              this.capMan__Q2ADefRev__c.equals(other.getCapMan__Q2ADefRev__c()))) &&
            ((this.capMan__Q2AEq__c==null && other.getCapMan__Q2AEq__c()==null) || 
             (this.capMan__Q2AEq__c!=null &&
              this.capMan__Q2AEq__c.equals(other.getCapMan__Q2AEq__c()))) &&
            ((this.capMan__Q2AFix__c==null && other.getCapMan__Q2AFix__c()==null) || 
             (this.capMan__Q2AFix__c!=null &&
              this.capMan__Q2AFix__c.equals(other.getCapMan__Q2AFix__c()))) &&
            ((this.capMan__Q2AOca__c==null && other.getCapMan__Q2AOca__c()==null) || 
             (this.capMan__Q2AOca__c!=null &&
              this.capMan__Q2AOca__c.equals(other.getCapMan__Q2AOca__c()))) &&
            ((this.capMan__Q2AOtLi__c==null && other.getCapMan__Q2AOtLi__c()==null) || 
             (this.capMan__Q2AOtLi__c!=null &&
              this.capMan__Q2AOtLi__c.equals(other.getCapMan__Q2AOtLi__c()))) &&
            ((this.capMan__Q2AOtas__c==null && other.getCapMan__Q2AOtas__c()==null) || 
             (this.capMan__Q2AOtas__c!=null &&
              this.capMan__Q2AOtas__c.equals(other.getCapMan__Q2AOtas__c()))) &&
            ((this.capMan__Q2ATotEQ_FML__c==null && other.getCapMan__Q2ATotEQ_FML__c()==null) || 
             (this.capMan__Q2ATotEQ_FML__c!=null &&
              this.capMan__Q2ATotEQ_FML__c.equals(other.getCapMan__Q2ATotEQ_FML__c()))) &&
            ((this.capMan__Q2ATotLE__c==null && other.getCapMan__Q2ATotLE__c()==null) || 
             (this.capMan__Q2ATotLE__c!=null &&
              this.capMan__Q2ATotLE__c.equals(other.getCapMan__Q2ATotLE__c()))) &&
            ((this.capMan__Q2ATotLi__c==null && other.getCapMan__Q2ATotLi__c()==null) || 
             (this.capMan__Q2ATotLi__c!=null &&
              this.capMan__Q2ATotLi__c.equals(other.getCapMan__Q2ATotLi__c()))) &&
            ((this.capMan__Q2ATotas__c==null && other.getCapMan__Q2ATotas__c()==null) || 
             (this.capMan__Q2ATotas__c!=null &&
              this.capMan__Q2ATotas__c.equals(other.getCapMan__Q2ATotas__c()))) &&
            ((this.capMan__Q2ATotca__c==null && other.getCapMan__Q2ATotca__c()==null) || 
             (this.capMan__Q2ATotca__c!=null &&
              this.capMan__Q2ATotca__c.equals(other.getCapMan__Q2ATotca__c()))) &&
            ((this.capMan__Q2PAP__c==null && other.getCapMan__Q2PAP__c()==null) || 
             (this.capMan__Q2PAP__c!=null &&
              this.capMan__Q2PAP__c.equals(other.getCapMan__Q2PAP__c()))) &&
            ((this.capMan__Q2PAR__c==null && other.getCapMan__Q2PAR__c()==null) || 
             (this.capMan__Q2PAR__c!=null &&
              this.capMan__Q2PAR__c.equals(other.getCapMan__Q2PAR__c()))) &&
            ((this.capMan__Q2PCash__c==null && other.getCapMan__Q2PCash__c()==null) || 
             (this.capMan__Q2PCash__c!=null &&
              this.capMan__Q2PCash__c.equals(other.getCapMan__Q2PCash__c()))) &&
            ((this.capMan__Q2PDebt__c==null && other.getCapMan__Q2PDebt__c()==null) || 
             (this.capMan__Q2PDebt__c!=null &&
              this.capMan__Q2PDebt__c.equals(other.getCapMan__Q2PDebt__c()))) &&
            ((this.capMan__Q2PDefRev__c==null && other.getCapMan__Q2PDefRev__c()==null) || 
             (this.capMan__Q2PDefRev__c!=null &&
              this.capMan__Q2PDefRev__c.equals(other.getCapMan__Q2PDefRev__c()))) &&
            ((this.capMan__Q2PEq__c==null && other.getCapMan__Q2PEq__c()==null) || 
             (this.capMan__Q2PEq__c!=null &&
              this.capMan__Q2PEq__c.equals(other.getCapMan__Q2PEq__c()))) &&
            ((this.capMan__Q2PFix__c==null && other.getCapMan__Q2PFix__c()==null) || 
             (this.capMan__Q2PFix__c!=null &&
              this.capMan__Q2PFix__c.equals(other.getCapMan__Q2PFix__c()))) &&
            ((this.capMan__Q2POca__c==null && other.getCapMan__Q2POca__c()==null) || 
             (this.capMan__Q2POca__c!=null &&
              this.capMan__Q2POca__c.equals(other.getCapMan__Q2POca__c()))) &&
            ((this.capMan__Q2POtLi__c==null && other.getCapMan__Q2POtLi__c()==null) || 
             (this.capMan__Q2POtLi__c!=null &&
              this.capMan__Q2POtLi__c.equals(other.getCapMan__Q2POtLi__c()))) &&
            ((this.capMan__Q2POtas__c==null && other.getCapMan__Q2POtas__c()==null) || 
             (this.capMan__Q2POtas__c!=null &&
              this.capMan__Q2POtas__c.equals(other.getCapMan__Q2POtas__c()))) &&
            ((this.capMan__Q2PTotEQ_FML__c==null && other.getCapMan__Q2PTotEQ_FML__c()==null) || 
             (this.capMan__Q2PTotEQ_FML__c!=null &&
              this.capMan__Q2PTotEQ_FML__c.equals(other.getCapMan__Q2PTotEQ_FML__c()))) &&
            ((this.capMan__Q2PTotLE__c==null && other.getCapMan__Q2PTotLE__c()==null) || 
             (this.capMan__Q2PTotLE__c!=null &&
              this.capMan__Q2PTotLE__c.equals(other.getCapMan__Q2PTotLE__c()))) &&
            ((this.capMan__Q2PTotLi__c==null && other.getCapMan__Q2PTotLi__c()==null) || 
             (this.capMan__Q2PTotLi__c!=null &&
              this.capMan__Q2PTotLi__c.equals(other.getCapMan__Q2PTotLi__c()))) &&
            ((this.capMan__Q2PTotas__c==null && other.getCapMan__Q2PTotas__c()==null) || 
             (this.capMan__Q2PTotas__c!=null &&
              this.capMan__Q2PTotas__c.equals(other.getCapMan__Q2PTotas__c()))) &&
            ((this.capMan__Q2PTotca__c==null && other.getCapMan__Q2PTotca__c()==null) || 
             (this.capMan__Q2PTotca__c!=null &&
              this.capMan__Q2PTotca__c.equals(other.getCapMan__Q2PTotca__c()))) &&
            ((this.capMan__Q2_Actual__c==null && other.getCapMan__Q2_Actual__c()==null) || 
             (this.capMan__Q2_Actual__c!=null &&
              this.capMan__Q2_Actual__c.equals(other.getCapMan__Q2_Actual__c()))) &&
            ((this.capMan__Q2_Plan__c==null && other.getCapMan__Q2_Plan__c()==null) || 
             (this.capMan__Q2_Plan__c!=null &&
              this.capMan__Q2_Plan__c.equals(other.getCapMan__Q2_Plan__c()))) &&
            ((this.capMan__Q3AAP__c==null && other.getCapMan__Q3AAP__c()==null) || 
             (this.capMan__Q3AAP__c!=null &&
              this.capMan__Q3AAP__c.equals(other.getCapMan__Q3AAP__c()))) &&
            ((this.capMan__Q3AAR__c==null && other.getCapMan__Q3AAR__c()==null) || 
             (this.capMan__Q3AAR__c!=null &&
              this.capMan__Q3AAR__c.equals(other.getCapMan__Q3AAR__c()))) &&
            ((this.capMan__Q3ACash__c==null && other.getCapMan__Q3ACash__c()==null) || 
             (this.capMan__Q3ACash__c!=null &&
              this.capMan__Q3ACash__c.equals(other.getCapMan__Q3ACash__c()))) &&
            ((this.capMan__Q3ADebt__c==null && other.getCapMan__Q3ADebt__c()==null) || 
             (this.capMan__Q3ADebt__c!=null &&
              this.capMan__Q3ADebt__c.equals(other.getCapMan__Q3ADebt__c()))) &&
            ((this.capMan__Q3ADefRev__c==null && other.getCapMan__Q3ADefRev__c()==null) || 
             (this.capMan__Q3ADefRev__c!=null &&
              this.capMan__Q3ADefRev__c.equals(other.getCapMan__Q3ADefRev__c()))) &&
            ((this.capMan__Q3AEq__c==null && other.getCapMan__Q3AEq__c()==null) || 
             (this.capMan__Q3AEq__c!=null &&
              this.capMan__Q3AEq__c.equals(other.getCapMan__Q3AEq__c()))) &&
            ((this.capMan__Q3AFix__c==null && other.getCapMan__Q3AFix__c()==null) || 
             (this.capMan__Q3AFix__c!=null &&
              this.capMan__Q3AFix__c.equals(other.getCapMan__Q3AFix__c()))) &&
            ((this.capMan__Q3AOca__c==null && other.getCapMan__Q3AOca__c()==null) || 
             (this.capMan__Q3AOca__c!=null &&
              this.capMan__Q3AOca__c.equals(other.getCapMan__Q3AOca__c()))) &&
            ((this.capMan__Q3AOtLi__c==null && other.getCapMan__Q3AOtLi__c()==null) || 
             (this.capMan__Q3AOtLi__c!=null &&
              this.capMan__Q3AOtLi__c.equals(other.getCapMan__Q3AOtLi__c()))) &&
            ((this.capMan__Q3AOtas__c==null && other.getCapMan__Q3AOtas__c()==null) || 
             (this.capMan__Q3AOtas__c!=null &&
              this.capMan__Q3AOtas__c.equals(other.getCapMan__Q3AOtas__c()))) &&
            ((this.capMan__Q3ATotEQ_FML__c==null && other.getCapMan__Q3ATotEQ_FML__c()==null) || 
             (this.capMan__Q3ATotEQ_FML__c!=null &&
              this.capMan__Q3ATotEQ_FML__c.equals(other.getCapMan__Q3ATotEQ_FML__c()))) &&
            ((this.capMan__Q3ATotLE__c==null && other.getCapMan__Q3ATotLE__c()==null) || 
             (this.capMan__Q3ATotLE__c!=null &&
              this.capMan__Q3ATotLE__c.equals(other.getCapMan__Q3ATotLE__c()))) &&
            ((this.capMan__Q3ATotLi__c==null && other.getCapMan__Q3ATotLi__c()==null) || 
             (this.capMan__Q3ATotLi__c!=null &&
              this.capMan__Q3ATotLi__c.equals(other.getCapMan__Q3ATotLi__c()))) &&
            ((this.capMan__Q3ATotas__c==null && other.getCapMan__Q3ATotas__c()==null) || 
             (this.capMan__Q3ATotas__c!=null &&
              this.capMan__Q3ATotas__c.equals(other.getCapMan__Q3ATotas__c()))) &&
            ((this.capMan__Q3ATotca__c==null && other.getCapMan__Q3ATotca__c()==null) || 
             (this.capMan__Q3ATotca__c!=null &&
              this.capMan__Q3ATotca__c.equals(other.getCapMan__Q3ATotca__c()))) &&
            ((this.capMan__Q3PAP__c==null && other.getCapMan__Q3PAP__c()==null) || 
             (this.capMan__Q3PAP__c!=null &&
              this.capMan__Q3PAP__c.equals(other.getCapMan__Q3PAP__c()))) &&
            ((this.capMan__Q3PAR__c==null && other.getCapMan__Q3PAR__c()==null) || 
             (this.capMan__Q3PAR__c!=null &&
              this.capMan__Q3PAR__c.equals(other.getCapMan__Q3PAR__c()))) &&
            ((this.capMan__Q3PCash__c==null && other.getCapMan__Q3PCash__c()==null) || 
             (this.capMan__Q3PCash__c!=null &&
              this.capMan__Q3PCash__c.equals(other.getCapMan__Q3PCash__c()))) &&
            ((this.capMan__Q3PDebt__c==null && other.getCapMan__Q3PDebt__c()==null) || 
             (this.capMan__Q3PDebt__c!=null &&
              this.capMan__Q3PDebt__c.equals(other.getCapMan__Q3PDebt__c()))) &&
            ((this.capMan__Q3PDefRev__c==null && other.getCapMan__Q3PDefRev__c()==null) || 
             (this.capMan__Q3PDefRev__c!=null &&
              this.capMan__Q3PDefRev__c.equals(other.getCapMan__Q3PDefRev__c()))) &&
            ((this.capMan__Q3PEq__c==null && other.getCapMan__Q3PEq__c()==null) || 
             (this.capMan__Q3PEq__c!=null &&
              this.capMan__Q3PEq__c.equals(other.getCapMan__Q3PEq__c()))) &&
            ((this.capMan__Q3PFix__c==null && other.getCapMan__Q3PFix__c()==null) || 
             (this.capMan__Q3PFix__c!=null &&
              this.capMan__Q3PFix__c.equals(other.getCapMan__Q3PFix__c()))) &&
            ((this.capMan__Q3POca__c==null && other.getCapMan__Q3POca__c()==null) || 
             (this.capMan__Q3POca__c!=null &&
              this.capMan__Q3POca__c.equals(other.getCapMan__Q3POca__c()))) &&
            ((this.capMan__Q3POtLi__c==null && other.getCapMan__Q3POtLi__c()==null) || 
             (this.capMan__Q3POtLi__c!=null &&
              this.capMan__Q3POtLi__c.equals(other.getCapMan__Q3POtLi__c()))) &&
            ((this.capMan__Q3POtas__c==null && other.getCapMan__Q3POtas__c()==null) || 
             (this.capMan__Q3POtas__c!=null &&
              this.capMan__Q3POtas__c.equals(other.getCapMan__Q3POtas__c()))) &&
            ((this.capMan__Q3PTotEQ_FML__c==null && other.getCapMan__Q3PTotEQ_FML__c()==null) || 
             (this.capMan__Q3PTotEQ_FML__c!=null &&
              this.capMan__Q3PTotEQ_FML__c.equals(other.getCapMan__Q3PTotEQ_FML__c()))) &&
            ((this.capMan__Q3PTotEQ_FML_for_text__c==null && other.getCapMan__Q3PTotEQ_FML_for_text__c()==null) || 
             (this.capMan__Q3PTotEQ_FML_for_text__c!=null &&
              this.capMan__Q3PTotEQ_FML_for_text__c.equals(other.getCapMan__Q3PTotEQ_FML_for_text__c()))) &&
            ((this.capMan__Q3PTotLE__c==null && other.getCapMan__Q3PTotLE__c()==null) || 
             (this.capMan__Q3PTotLE__c!=null &&
              this.capMan__Q3PTotLE__c.equals(other.getCapMan__Q3PTotLE__c()))) &&
            ((this.capMan__Q3PTotLi__c==null && other.getCapMan__Q3PTotLi__c()==null) || 
             (this.capMan__Q3PTotLi__c!=null &&
              this.capMan__Q3PTotLi__c.equals(other.getCapMan__Q3PTotLi__c()))) &&
            ((this.capMan__Q3PTotas__c==null && other.getCapMan__Q3PTotas__c()==null) || 
             (this.capMan__Q3PTotas__c!=null &&
              this.capMan__Q3PTotas__c.equals(other.getCapMan__Q3PTotas__c()))) &&
            ((this.capMan__Q3PTotca__c==null && other.getCapMan__Q3PTotca__c()==null) || 
             (this.capMan__Q3PTotca__c!=null &&
              this.capMan__Q3PTotca__c.equals(other.getCapMan__Q3PTotca__c()))) &&
            ((this.capMan__Q3TOTALS__c==null && other.getCapMan__Q3TOTALS__c()==null) || 
             (this.capMan__Q3TOTALS__c!=null &&
              this.capMan__Q3TOTALS__c.equals(other.getCapMan__Q3TOTALS__c()))) &&
            ((this.capMan__Q3_Actual__c==null && other.getCapMan__Q3_Actual__c()==null) || 
             (this.capMan__Q3_Actual__c!=null &&
              this.capMan__Q3_Actual__c.equals(other.getCapMan__Q3_Actual__c()))) &&
            ((this.capMan__Q3_Plan__c==null && other.getCapMan__Q3_Plan__c()==null) || 
             (this.capMan__Q3_Plan__c!=null &&
              this.capMan__Q3_Plan__c.equals(other.getCapMan__Q3_Plan__c()))) &&
            ((this.capMan__Q4AAP__c==null && other.getCapMan__Q4AAP__c()==null) || 
             (this.capMan__Q4AAP__c!=null &&
              this.capMan__Q4AAP__c.equals(other.getCapMan__Q4AAP__c()))) &&
            ((this.capMan__Q4AAR__c==null && other.getCapMan__Q4AAR__c()==null) || 
             (this.capMan__Q4AAR__c!=null &&
              this.capMan__Q4AAR__c.equals(other.getCapMan__Q4AAR__c()))) &&
            ((this.capMan__Q4ACash__c==null && other.getCapMan__Q4ACash__c()==null) || 
             (this.capMan__Q4ACash__c!=null &&
              this.capMan__Q4ACash__c.equals(other.getCapMan__Q4ACash__c()))) &&
            ((this.capMan__Q4ADebt__c==null && other.getCapMan__Q4ADebt__c()==null) || 
             (this.capMan__Q4ADebt__c!=null &&
              this.capMan__Q4ADebt__c.equals(other.getCapMan__Q4ADebt__c()))) &&
            ((this.capMan__Q4ADefRev__c==null && other.getCapMan__Q4ADefRev__c()==null) || 
             (this.capMan__Q4ADefRev__c!=null &&
              this.capMan__Q4ADefRev__c.equals(other.getCapMan__Q4ADefRev__c()))) &&
            ((this.capMan__Q4AEq__c==null && other.getCapMan__Q4AEq__c()==null) || 
             (this.capMan__Q4AEq__c!=null &&
              this.capMan__Q4AEq__c.equals(other.getCapMan__Q4AEq__c()))) &&
            ((this.capMan__Q4AFix__c==null && other.getCapMan__Q4AFix__c()==null) || 
             (this.capMan__Q4AFix__c!=null &&
              this.capMan__Q4AFix__c.equals(other.getCapMan__Q4AFix__c()))) &&
            ((this.capMan__Q4AOca__c==null && other.getCapMan__Q4AOca__c()==null) || 
             (this.capMan__Q4AOca__c!=null &&
              this.capMan__Q4AOca__c.equals(other.getCapMan__Q4AOca__c()))) &&
            ((this.capMan__Q4AOtLi__c==null && other.getCapMan__Q4AOtLi__c()==null) || 
             (this.capMan__Q4AOtLi__c!=null &&
              this.capMan__Q4AOtLi__c.equals(other.getCapMan__Q4AOtLi__c()))) &&
            ((this.capMan__Q4AOtas__c==null && other.getCapMan__Q4AOtas__c()==null) || 
             (this.capMan__Q4AOtas__c!=null &&
              this.capMan__Q4AOtas__c.equals(other.getCapMan__Q4AOtas__c()))) &&
            ((this.capMan__Q4ATotEQ_FML__c==null && other.getCapMan__Q4ATotEQ_FML__c()==null) || 
             (this.capMan__Q4ATotEQ_FML__c!=null &&
              this.capMan__Q4ATotEQ_FML__c.equals(other.getCapMan__Q4ATotEQ_FML__c()))) &&
            ((this.capMan__Q4ATotLE__c==null && other.getCapMan__Q4ATotLE__c()==null) || 
             (this.capMan__Q4ATotLE__c!=null &&
              this.capMan__Q4ATotLE__c.equals(other.getCapMan__Q4ATotLE__c()))) &&
            ((this.capMan__Q4ATotLi__c==null && other.getCapMan__Q4ATotLi__c()==null) || 
             (this.capMan__Q4ATotLi__c!=null &&
              this.capMan__Q4ATotLi__c.equals(other.getCapMan__Q4ATotLi__c()))) &&
            ((this.capMan__Q4ATotas__c==null && other.getCapMan__Q4ATotas__c()==null) || 
             (this.capMan__Q4ATotas__c!=null &&
              this.capMan__Q4ATotas__c.equals(other.getCapMan__Q4ATotas__c()))) &&
            ((this.capMan__Q4ATotca__c==null && other.getCapMan__Q4ATotca__c()==null) || 
             (this.capMan__Q4ATotca__c!=null &&
              this.capMan__Q4ATotca__c.equals(other.getCapMan__Q4ATotca__c()))) &&
            ((this.capMan__Q4PAP__c==null && other.getCapMan__Q4PAP__c()==null) || 
             (this.capMan__Q4PAP__c!=null &&
              this.capMan__Q4PAP__c.equals(other.getCapMan__Q4PAP__c()))) &&
            ((this.capMan__Q4PAR__c==null && other.getCapMan__Q4PAR__c()==null) || 
             (this.capMan__Q4PAR__c!=null &&
              this.capMan__Q4PAR__c.equals(other.getCapMan__Q4PAR__c()))) &&
            ((this.capMan__Q4PCash__c==null && other.getCapMan__Q4PCash__c()==null) || 
             (this.capMan__Q4PCash__c!=null &&
              this.capMan__Q4PCash__c.equals(other.getCapMan__Q4PCash__c()))) &&
            ((this.capMan__Q4PDebt__c==null && other.getCapMan__Q4PDebt__c()==null) || 
             (this.capMan__Q4PDebt__c!=null &&
              this.capMan__Q4PDebt__c.equals(other.getCapMan__Q4PDebt__c()))) &&
            ((this.capMan__Q4PDefRev__c==null && other.getCapMan__Q4PDefRev__c()==null) || 
             (this.capMan__Q4PDefRev__c!=null &&
              this.capMan__Q4PDefRev__c.equals(other.getCapMan__Q4PDefRev__c()))) &&
            ((this.capMan__Q4PEq__c==null && other.getCapMan__Q4PEq__c()==null) || 
             (this.capMan__Q4PEq__c!=null &&
              this.capMan__Q4PEq__c.equals(other.getCapMan__Q4PEq__c()))) &&
            ((this.capMan__Q4PFix__c==null && other.getCapMan__Q4PFix__c()==null) || 
             (this.capMan__Q4PFix__c!=null &&
              this.capMan__Q4PFix__c.equals(other.getCapMan__Q4PFix__c()))) &&
            ((this.capMan__Q4POca__c==null && other.getCapMan__Q4POca__c()==null) || 
             (this.capMan__Q4POca__c!=null &&
              this.capMan__Q4POca__c.equals(other.getCapMan__Q4POca__c()))) &&
            ((this.capMan__Q4POtLi__c==null && other.getCapMan__Q4POtLi__c()==null) || 
             (this.capMan__Q4POtLi__c!=null &&
              this.capMan__Q4POtLi__c.equals(other.getCapMan__Q4POtLi__c()))) &&
            ((this.capMan__Q4POtas__c==null && other.getCapMan__Q4POtas__c()==null) || 
             (this.capMan__Q4POtas__c!=null &&
              this.capMan__Q4POtas__c.equals(other.getCapMan__Q4POtas__c()))) &&
            ((this.capMan__Q4PTotEQ_FML__c==null && other.getCapMan__Q4PTotEQ_FML__c()==null) || 
             (this.capMan__Q4PTotEQ_FML__c!=null &&
              this.capMan__Q4PTotEQ_FML__c.equals(other.getCapMan__Q4PTotEQ_FML__c()))) &&
            ((this.capMan__Q4PTotLE__c==null && other.getCapMan__Q4PTotLE__c()==null) || 
             (this.capMan__Q4PTotLE__c!=null &&
              this.capMan__Q4PTotLE__c.equals(other.getCapMan__Q4PTotLE__c()))) &&
            ((this.capMan__Q4PTotLi__c==null && other.getCapMan__Q4PTotLi__c()==null) || 
             (this.capMan__Q4PTotLi__c!=null &&
              this.capMan__Q4PTotLi__c.equals(other.getCapMan__Q4PTotLi__c()))) &&
            ((this.capMan__Q4PTotas__c==null && other.getCapMan__Q4PTotas__c()==null) || 
             (this.capMan__Q4PTotas__c!=null &&
              this.capMan__Q4PTotas__c.equals(other.getCapMan__Q4PTotas__c()))) &&
            ((this.capMan__Q4PTotas_new__c==null && other.getCapMan__Q4PTotas_new__c()==null) || 
             (this.capMan__Q4PTotas_new__c!=null &&
              this.capMan__Q4PTotas_new__c.equals(other.getCapMan__Q4PTotas_new__c()))) &&
            ((this.capMan__Q4PTotca__c==null && other.getCapMan__Q4PTotca__c()==null) || 
             (this.capMan__Q4PTotca__c!=null &&
              this.capMan__Q4PTotca__c.equals(other.getCapMan__Q4PTotca__c()))) &&
            ((this.capMan__Q4P_NEW_Tot_LE__c==null && other.getCapMan__Q4P_NEW_Tot_LE__c()==null) || 
             (this.capMan__Q4P_NEW_Tot_LE__c!=null &&
              this.capMan__Q4P_NEW_Tot_LE__c.equals(other.getCapMan__Q4P_NEW_Tot_LE__c()))) &&
            ((this.capMan__Q4_Actual__c==null && other.getCapMan__Q4_Actual__c()==null) || 
             (this.capMan__Q4_Actual__c!=null &&
              this.capMan__Q4_Actual__c.equals(other.getCapMan__Q4_Actual__c()))) &&
            ((this.capMan__Q4_Plan__c==null && other.getCapMan__Q4_Plan__c()==null) || 
             (this.capMan__Q4_Plan__c!=null &&
              this.capMan__Q4_Plan__c.equals(other.getCapMan__Q4_Plan__c()))) &&
            ((this.capMan__Start_Date__c==null && other.getCapMan__Start_Date__c()==null) || 
             (this.capMan__Start_Date__c!=null &&
              this.capMan__Start_Date__c.equals(other.getCapMan__Start_Date__c()))) &&
            ((this.capMan__Year__c==null && other.getCapMan__Year__c()==null) || 
             (this.capMan__Year__c!=null &&
              this.capMan__Year__c.equals(other.getCapMan__Year__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currencyIsoCode==null && other.getCurrencyIsoCode()==null) || 
             (this.currencyIsoCode!=null &&
              this.currencyIsoCode.equals(other.getCurrencyIsoCode()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCapMan__APAP__c() != null) {
            _hashCode += getCapMan__APAP__c().hashCode();
        }
        if (getCapMan__APAR__c() != null) {
            _hashCode += getCapMan__APAR__c().hashCode();
        }
        if (getCapMan__APCash__c() != null) {
            _hashCode += getCapMan__APCash__c().hashCode();
        }
        if (getCapMan__APDebt__c() != null) {
            _hashCode += getCapMan__APDebt__c().hashCode();
        }
        if (getCapMan__APDefRev__c() != null) {
            _hashCode += getCapMan__APDefRev__c().hashCode();
        }
        if (getCapMan__APEq__c() != null) {
            _hashCode += getCapMan__APEq__c().hashCode();
        }
        if (getCapMan__APFix__c() != null) {
            _hashCode += getCapMan__APFix__c().hashCode();
        }
        if (getCapMan__APOca__c() != null) {
            _hashCode += getCapMan__APOca__c().hashCode();
        }
        if (getCapMan__APOtLi__c() != null) {
            _hashCode += getCapMan__APOtLi__c().hashCode();
        }
        if (getCapMan__APOtas__c() != null) {
            _hashCode += getCapMan__APOtas__c().hashCode();
        }
        if (getCapMan__APTotLE__c() != null) {
            _hashCode += getCapMan__APTotLE__c().hashCode();
        }
        if (getCapMan__APTotLi__c() != null) {
            _hashCode += getCapMan__APTotLi__c().hashCode();
        }
        if (getCapMan__APTotas__c() != null) {
            _hashCode += getCapMan__APTotas__c().hashCode();
        }
        if (getCapMan__APTotca__c() != null) {
            _hashCode += getCapMan__APTotca__c().hashCode();
        }
        if (getCapMan__Account__c() != null) {
            _hashCode += getCapMan__Account__c().hashCode();
        }
        if (getCapMan__Account__r() != null) {
            _hashCode += getCapMan__Account__r().hashCode();
        }
        if (getCapMan__Default_Quarter__c() != null) {
            _hashCode += getCapMan__Default_Quarter__c().hashCode();
        }
        if (getCapMan__End_Date__c() != null) {
            _hashCode += getCapMan__End_Date__c().hashCode();
        }
        if (getCapMan__FYAAP__c() != null) {
            _hashCode += getCapMan__FYAAP__c().hashCode();
        }
        if (getCapMan__FYAAR__c() != null) {
            _hashCode += getCapMan__FYAAR__c().hashCode();
        }
        if (getCapMan__FYACash__c() != null) {
            _hashCode += getCapMan__FYACash__c().hashCode();
        }
        if (getCapMan__FYADebt__c() != null) {
            _hashCode += getCapMan__FYADebt__c().hashCode();
        }
        if (getCapMan__FYADefRev__c() != null) {
            _hashCode += getCapMan__FYADefRev__c().hashCode();
        }
        if (getCapMan__FYAEq__c() != null) {
            _hashCode += getCapMan__FYAEq__c().hashCode();
        }
        if (getCapMan__FYAFix__c() != null) {
            _hashCode += getCapMan__FYAFix__c().hashCode();
        }
        if (getCapMan__FYAOca__c() != null) {
            _hashCode += getCapMan__FYAOca__c().hashCode();
        }
        if (getCapMan__FYAOtLi__c() != null) {
            _hashCode += getCapMan__FYAOtLi__c().hashCode();
        }
        if (getCapMan__FYAOtas__c() != null) {
            _hashCode += getCapMan__FYAOtas__c().hashCode();
        }
        if (getCapMan__FYATotLE__c() != null) {
            _hashCode += getCapMan__FYATotLE__c().hashCode();
        }
        if (getCapMan__FYATotLi__c() != null) {
            _hashCode += getCapMan__FYATotLi__c().hashCode();
        }
        if (getCapMan__FYATotas__c() != null) {
            _hashCode += getCapMan__FYATotas__c().hashCode();
        }
        if (getCapMan__FYATotca__c() != null) {
            _hashCode += getCapMan__FYATotca__c().hashCode();
        }
        if (getCapMan__FYPAP__c() != null) {
            _hashCode += getCapMan__FYPAP__c().hashCode();
        }
        if (getCapMan__FYPAR__c() != null) {
            _hashCode += getCapMan__FYPAR__c().hashCode();
        }
        if (getCapMan__FYPCash__c() != null) {
            _hashCode += getCapMan__FYPCash__c().hashCode();
        }
        if (getCapMan__FYPDebt__c() != null) {
            _hashCode += getCapMan__FYPDebt__c().hashCode();
        }
        if (getCapMan__FYPDefRev__c() != null) {
            _hashCode += getCapMan__FYPDefRev__c().hashCode();
        }
        if (getCapMan__FYPEq__c() != null) {
            _hashCode += getCapMan__FYPEq__c().hashCode();
        }
        if (getCapMan__FYPFix__c() != null) {
            _hashCode += getCapMan__FYPFix__c().hashCode();
        }
        if (getCapMan__FYPOca__c() != null) {
            _hashCode += getCapMan__FYPOca__c().hashCode();
        }
        if (getCapMan__FYPOtLi__c() != null) {
            _hashCode += getCapMan__FYPOtLi__c().hashCode();
        }
        if (getCapMan__FYPOtas__c() != null) {
            _hashCode += getCapMan__FYPOtas__c().hashCode();
        }
        if (getCapMan__FYPTotLE_NEW__c() != null) {
            _hashCode += getCapMan__FYPTotLE_NEW__c().hashCode();
        }
        if (getCapMan__FYPTotLE__c() != null) {
            _hashCode += getCapMan__FYPTotLE__c().hashCode();
        }
        if (getCapMan__FYPTotLi__c() != null) {
            _hashCode += getCapMan__FYPTotLi__c().hashCode();
        }
        if (getCapMan__FYPTotas__c() != null) {
            _hashCode += getCapMan__FYPTotas__c().hashCode();
        }
        if (getCapMan__FYPTotca__c() != null) {
            _hashCode += getCapMan__FYPTotca__c().hashCode();
        }
        if (getCapMan__FiscalYear__c() != null) {
            _hashCode += getCapMan__FiscalYear__c().hashCode();
        }
        if (getCapMan__Formula_Start_Date__c() != null) {
            _hashCode += getCapMan__Formula_Start_Date__c().hashCode();
        }
        if (getCapMan__Industry__c() != null) {
            _hashCode += getCapMan__Industry__c().hashCode();
        }
        if (getCapMan__Pipeline1__r() != null) {
            _hashCode += getCapMan__Pipeline1__r().hashCode();
        }
        if (getCapMan__Q1AAP__c() != null) {
            _hashCode += getCapMan__Q1AAP__c().hashCode();
        }
        if (getCapMan__Q1AAR__c() != null) {
            _hashCode += getCapMan__Q1AAR__c().hashCode();
        }
        if (getCapMan__Q1ACash__c() != null) {
            _hashCode += getCapMan__Q1ACash__c().hashCode();
        }
        if (getCapMan__Q1ADebt__c() != null) {
            _hashCode += getCapMan__Q1ADebt__c().hashCode();
        }
        if (getCapMan__Q1ADefRev__c() != null) {
            _hashCode += getCapMan__Q1ADefRev__c().hashCode();
        }
        if (getCapMan__Q1AEq__c() != null) {
            _hashCode += getCapMan__Q1AEq__c().hashCode();
        }
        if (getCapMan__Q1AFix__c() != null) {
            _hashCode += getCapMan__Q1AFix__c().hashCode();
        }
        if (getCapMan__Q1AOca__c() != null) {
            _hashCode += getCapMan__Q1AOca__c().hashCode();
        }
        if (getCapMan__Q1AOtLi__c() != null) {
            _hashCode += getCapMan__Q1AOtLi__c().hashCode();
        }
        if (getCapMan__Q1AOtas__c() != null) {
            _hashCode += getCapMan__Q1AOtas__c().hashCode();
        }
        if (getCapMan__Q1ATotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q1ATotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q1ATotLE__c() != null) {
            _hashCode += getCapMan__Q1ATotLE__c().hashCode();
        }
        if (getCapMan__Q1ATotLi__c() != null) {
            _hashCode += getCapMan__Q1ATotLi__c().hashCode();
        }
        if (getCapMan__Q1ATotas__c() != null) {
            _hashCode += getCapMan__Q1ATotas__c().hashCode();
        }
        if (getCapMan__Q1ATotca__c() != null) {
            _hashCode += getCapMan__Q1ATotca__c().hashCode();
        }
        if (getCapMan__Q1PAP__c() != null) {
            _hashCode += getCapMan__Q1PAP__c().hashCode();
        }
        if (getCapMan__Q1PAR__c() != null) {
            _hashCode += getCapMan__Q1PAR__c().hashCode();
        }
        if (getCapMan__Q1PCash__c() != null) {
            _hashCode += getCapMan__Q1PCash__c().hashCode();
        }
        if (getCapMan__Q1PDebt__c() != null) {
            _hashCode += getCapMan__Q1PDebt__c().hashCode();
        }
        if (getCapMan__Q1PDefrev__c() != null) {
            _hashCode += getCapMan__Q1PDefrev__c().hashCode();
        }
        if (getCapMan__Q1PEq__c() != null) {
            _hashCode += getCapMan__Q1PEq__c().hashCode();
        }
        if (getCapMan__Q1PFix__c() != null) {
            _hashCode += getCapMan__Q1PFix__c().hashCode();
        }
        if (getCapMan__Q1POca__c() != null) {
            _hashCode += getCapMan__Q1POca__c().hashCode();
        }
        if (getCapMan__Q1POtLi__c() != null) {
            _hashCode += getCapMan__Q1POtLi__c().hashCode();
        }
        if (getCapMan__Q1POtas__c() != null) {
            _hashCode += getCapMan__Q1POtas__c().hashCode();
        }
        if (getCapMan__Q1PTotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q1PTotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q1PTotLE__c() != null) {
            _hashCode += getCapMan__Q1PTotLE__c().hashCode();
        }
        if (getCapMan__Q1PTotLi__c() != null) {
            _hashCode += getCapMan__Q1PTotLi__c().hashCode();
        }
        if (getCapMan__Q1PTotas__c() != null) {
            _hashCode += getCapMan__Q1PTotas__c().hashCode();
        }
        if (getCapMan__Q1PTotca__c() != null) {
            _hashCode += getCapMan__Q1PTotca__c().hashCode();
        }
        if (getCapMan__Q1_Actual__c() != null) {
            _hashCode += getCapMan__Q1_Actual__c().hashCode();
        }
        if (getCapMan__Q1_Plan__c() != null) {
            _hashCode += getCapMan__Q1_Plan__c().hashCode();
        }
        if (getCapMan__Q2AAP__c() != null) {
            _hashCode += getCapMan__Q2AAP__c().hashCode();
        }
        if (getCapMan__Q2AAR__c() != null) {
            _hashCode += getCapMan__Q2AAR__c().hashCode();
        }
        if (getCapMan__Q2ACash__c() != null) {
            _hashCode += getCapMan__Q2ACash__c().hashCode();
        }
        if (getCapMan__Q2ADebt__c() != null) {
            _hashCode += getCapMan__Q2ADebt__c().hashCode();
        }
        if (getCapMan__Q2ADefRev__c() != null) {
            _hashCode += getCapMan__Q2ADefRev__c().hashCode();
        }
        if (getCapMan__Q2AEq__c() != null) {
            _hashCode += getCapMan__Q2AEq__c().hashCode();
        }
        if (getCapMan__Q2AFix__c() != null) {
            _hashCode += getCapMan__Q2AFix__c().hashCode();
        }
        if (getCapMan__Q2AOca__c() != null) {
            _hashCode += getCapMan__Q2AOca__c().hashCode();
        }
        if (getCapMan__Q2AOtLi__c() != null) {
            _hashCode += getCapMan__Q2AOtLi__c().hashCode();
        }
        if (getCapMan__Q2AOtas__c() != null) {
            _hashCode += getCapMan__Q2AOtas__c().hashCode();
        }
        if (getCapMan__Q2ATotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q2ATotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q2ATotLE__c() != null) {
            _hashCode += getCapMan__Q2ATotLE__c().hashCode();
        }
        if (getCapMan__Q2ATotLi__c() != null) {
            _hashCode += getCapMan__Q2ATotLi__c().hashCode();
        }
        if (getCapMan__Q2ATotas__c() != null) {
            _hashCode += getCapMan__Q2ATotas__c().hashCode();
        }
        if (getCapMan__Q2ATotca__c() != null) {
            _hashCode += getCapMan__Q2ATotca__c().hashCode();
        }
        if (getCapMan__Q2PAP__c() != null) {
            _hashCode += getCapMan__Q2PAP__c().hashCode();
        }
        if (getCapMan__Q2PAR__c() != null) {
            _hashCode += getCapMan__Q2PAR__c().hashCode();
        }
        if (getCapMan__Q2PCash__c() != null) {
            _hashCode += getCapMan__Q2PCash__c().hashCode();
        }
        if (getCapMan__Q2PDebt__c() != null) {
            _hashCode += getCapMan__Q2PDebt__c().hashCode();
        }
        if (getCapMan__Q2PDefRev__c() != null) {
            _hashCode += getCapMan__Q2PDefRev__c().hashCode();
        }
        if (getCapMan__Q2PEq__c() != null) {
            _hashCode += getCapMan__Q2PEq__c().hashCode();
        }
        if (getCapMan__Q2PFix__c() != null) {
            _hashCode += getCapMan__Q2PFix__c().hashCode();
        }
        if (getCapMan__Q2POca__c() != null) {
            _hashCode += getCapMan__Q2POca__c().hashCode();
        }
        if (getCapMan__Q2POtLi__c() != null) {
            _hashCode += getCapMan__Q2POtLi__c().hashCode();
        }
        if (getCapMan__Q2POtas__c() != null) {
            _hashCode += getCapMan__Q2POtas__c().hashCode();
        }
        if (getCapMan__Q2PTotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q2PTotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q2PTotLE__c() != null) {
            _hashCode += getCapMan__Q2PTotLE__c().hashCode();
        }
        if (getCapMan__Q2PTotLi__c() != null) {
            _hashCode += getCapMan__Q2PTotLi__c().hashCode();
        }
        if (getCapMan__Q2PTotas__c() != null) {
            _hashCode += getCapMan__Q2PTotas__c().hashCode();
        }
        if (getCapMan__Q2PTotca__c() != null) {
            _hashCode += getCapMan__Q2PTotca__c().hashCode();
        }
        if (getCapMan__Q2_Actual__c() != null) {
            _hashCode += getCapMan__Q2_Actual__c().hashCode();
        }
        if (getCapMan__Q2_Plan__c() != null) {
            _hashCode += getCapMan__Q2_Plan__c().hashCode();
        }
        if (getCapMan__Q3AAP__c() != null) {
            _hashCode += getCapMan__Q3AAP__c().hashCode();
        }
        if (getCapMan__Q3AAR__c() != null) {
            _hashCode += getCapMan__Q3AAR__c().hashCode();
        }
        if (getCapMan__Q3ACash__c() != null) {
            _hashCode += getCapMan__Q3ACash__c().hashCode();
        }
        if (getCapMan__Q3ADebt__c() != null) {
            _hashCode += getCapMan__Q3ADebt__c().hashCode();
        }
        if (getCapMan__Q3ADefRev__c() != null) {
            _hashCode += getCapMan__Q3ADefRev__c().hashCode();
        }
        if (getCapMan__Q3AEq__c() != null) {
            _hashCode += getCapMan__Q3AEq__c().hashCode();
        }
        if (getCapMan__Q3AFix__c() != null) {
            _hashCode += getCapMan__Q3AFix__c().hashCode();
        }
        if (getCapMan__Q3AOca__c() != null) {
            _hashCode += getCapMan__Q3AOca__c().hashCode();
        }
        if (getCapMan__Q3AOtLi__c() != null) {
            _hashCode += getCapMan__Q3AOtLi__c().hashCode();
        }
        if (getCapMan__Q3AOtas__c() != null) {
            _hashCode += getCapMan__Q3AOtas__c().hashCode();
        }
        if (getCapMan__Q3ATotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q3ATotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q3ATotLE__c() != null) {
            _hashCode += getCapMan__Q3ATotLE__c().hashCode();
        }
        if (getCapMan__Q3ATotLi__c() != null) {
            _hashCode += getCapMan__Q3ATotLi__c().hashCode();
        }
        if (getCapMan__Q3ATotas__c() != null) {
            _hashCode += getCapMan__Q3ATotas__c().hashCode();
        }
        if (getCapMan__Q3ATotca__c() != null) {
            _hashCode += getCapMan__Q3ATotca__c().hashCode();
        }
        if (getCapMan__Q3PAP__c() != null) {
            _hashCode += getCapMan__Q3PAP__c().hashCode();
        }
        if (getCapMan__Q3PAR__c() != null) {
            _hashCode += getCapMan__Q3PAR__c().hashCode();
        }
        if (getCapMan__Q3PCash__c() != null) {
            _hashCode += getCapMan__Q3PCash__c().hashCode();
        }
        if (getCapMan__Q3PDebt__c() != null) {
            _hashCode += getCapMan__Q3PDebt__c().hashCode();
        }
        if (getCapMan__Q3PDefRev__c() != null) {
            _hashCode += getCapMan__Q3PDefRev__c().hashCode();
        }
        if (getCapMan__Q3PEq__c() != null) {
            _hashCode += getCapMan__Q3PEq__c().hashCode();
        }
        if (getCapMan__Q3PFix__c() != null) {
            _hashCode += getCapMan__Q3PFix__c().hashCode();
        }
        if (getCapMan__Q3POca__c() != null) {
            _hashCode += getCapMan__Q3POca__c().hashCode();
        }
        if (getCapMan__Q3POtLi__c() != null) {
            _hashCode += getCapMan__Q3POtLi__c().hashCode();
        }
        if (getCapMan__Q3POtas__c() != null) {
            _hashCode += getCapMan__Q3POtas__c().hashCode();
        }
        if (getCapMan__Q3PTotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q3PTotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q3PTotEQ_FML_for_text__c() != null) {
            _hashCode += getCapMan__Q3PTotEQ_FML_for_text__c().hashCode();
        }
        if (getCapMan__Q3PTotLE__c() != null) {
            _hashCode += getCapMan__Q3PTotLE__c().hashCode();
        }
        if (getCapMan__Q3PTotLi__c() != null) {
            _hashCode += getCapMan__Q3PTotLi__c().hashCode();
        }
        if (getCapMan__Q3PTotas__c() != null) {
            _hashCode += getCapMan__Q3PTotas__c().hashCode();
        }
        if (getCapMan__Q3PTotca__c() != null) {
            _hashCode += getCapMan__Q3PTotca__c().hashCode();
        }
        if (getCapMan__Q3TOTALS__c() != null) {
            _hashCode += getCapMan__Q3TOTALS__c().hashCode();
        }
        if (getCapMan__Q3_Actual__c() != null) {
            _hashCode += getCapMan__Q3_Actual__c().hashCode();
        }
        if (getCapMan__Q3_Plan__c() != null) {
            _hashCode += getCapMan__Q3_Plan__c().hashCode();
        }
        if (getCapMan__Q4AAP__c() != null) {
            _hashCode += getCapMan__Q4AAP__c().hashCode();
        }
        if (getCapMan__Q4AAR__c() != null) {
            _hashCode += getCapMan__Q4AAR__c().hashCode();
        }
        if (getCapMan__Q4ACash__c() != null) {
            _hashCode += getCapMan__Q4ACash__c().hashCode();
        }
        if (getCapMan__Q4ADebt__c() != null) {
            _hashCode += getCapMan__Q4ADebt__c().hashCode();
        }
        if (getCapMan__Q4ADefRev__c() != null) {
            _hashCode += getCapMan__Q4ADefRev__c().hashCode();
        }
        if (getCapMan__Q4AEq__c() != null) {
            _hashCode += getCapMan__Q4AEq__c().hashCode();
        }
        if (getCapMan__Q4AFix__c() != null) {
            _hashCode += getCapMan__Q4AFix__c().hashCode();
        }
        if (getCapMan__Q4AOca__c() != null) {
            _hashCode += getCapMan__Q4AOca__c().hashCode();
        }
        if (getCapMan__Q4AOtLi__c() != null) {
            _hashCode += getCapMan__Q4AOtLi__c().hashCode();
        }
        if (getCapMan__Q4AOtas__c() != null) {
            _hashCode += getCapMan__Q4AOtas__c().hashCode();
        }
        if (getCapMan__Q4ATotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q4ATotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q4ATotLE__c() != null) {
            _hashCode += getCapMan__Q4ATotLE__c().hashCode();
        }
        if (getCapMan__Q4ATotLi__c() != null) {
            _hashCode += getCapMan__Q4ATotLi__c().hashCode();
        }
        if (getCapMan__Q4ATotas__c() != null) {
            _hashCode += getCapMan__Q4ATotas__c().hashCode();
        }
        if (getCapMan__Q4ATotca__c() != null) {
            _hashCode += getCapMan__Q4ATotca__c().hashCode();
        }
        if (getCapMan__Q4PAP__c() != null) {
            _hashCode += getCapMan__Q4PAP__c().hashCode();
        }
        if (getCapMan__Q4PAR__c() != null) {
            _hashCode += getCapMan__Q4PAR__c().hashCode();
        }
        if (getCapMan__Q4PCash__c() != null) {
            _hashCode += getCapMan__Q4PCash__c().hashCode();
        }
        if (getCapMan__Q4PDebt__c() != null) {
            _hashCode += getCapMan__Q4PDebt__c().hashCode();
        }
        if (getCapMan__Q4PDefRev__c() != null) {
            _hashCode += getCapMan__Q4PDefRev__c().hashCode();
        }
        if (getCapMan__Q4PEq__c() != null) {
            _hashCode += getCapMan__Q4PEq__c().hashCode();
        }
        if (getCapMan__Q4PFix__c() != null) {
            _hashCode += getCapMan__Q4PFix__c().hashCode();
        }
        if (getCapMan__Q4POca__c() != null) {
            _hashCode += getCapMan__Q4POca__c().hashCode();
        }
        if (getCapMan__Q4POtLi__c() != null) {
            _hashCode += getCapMan__Q4POtLi__c().hashCode();
        }
        if (getCapMan__Q4POtas__c() != null) {
            _hashCode += getCapMan__Q4POtas__c().hashCode();
        }
        if (getCapMan__Q4PTotEQ_FML__c() != null) {
            _hashCode += getCapMan__Q4PTotEQ_FML__c().hashCode();
        }
        if (getCapMan__Q4PTotLE__c() != null) {
            _hashCode += getCapMan__Q4PTotLE__c().hashCode();
        }
        if (getCapMan__Q4PTotLi__c() != null) {
            _hashCode += getCapMan__Q4PTotLi__c().hashCode();
        }
        if (getCapMan__Q4PTotas__c() != null) {
            _hashCode += getCapMan__Q4PTotas__c().hashCode();
        }
        if (getCapMan__Q4PTotas_new__c() != null) {
            _hashCode += getCapMan__Q4PTotas_new__c().hashCode();
        }
        if (getCapMan__Q4PTotca__c() != null) {
            _hashCode += getCapMan__Q4PTotca__c().hashCode();
        }
        if (getCapMan__Q4P_NEW_Tot_LE__c() != null) {
            _hashCode += getCapMan__Q4P_NEW_Tot_LE__c().hashCode();
        }
        if (getCapMan__Q4_Actual__c() != null) {
            _hashCode += getCapMan__Q4_Actual__c().hashCode();
        }
        if (getCapMan__Q4_Plan__c() != null) {
            _hashCode += getCapMan__Q4_Plan__c().hashCode();
        }
        if (getCapMan__Start_Date__c() != null) {
            _hashCode += getCapMan__Start_Date__c().hashCode();
        }
        if (getCapMan__Year__c() != null) {
            _hashCode += getCapMan__Year__c().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCurrencyIsoCode() != null) {
            _hashCode += getCurrencyIsoCode().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMan__Balance_Sheet__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Balance_Sheet__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APCash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APCash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APDefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APDefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APOca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APOca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APOtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APOtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APOtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APOtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APTotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APTotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APTotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APTotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APTotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APTotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APTotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APTotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Default_Quarter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Default_Quarter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYACash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYACash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYADebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYADebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYADefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYADefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAOca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAOca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAOtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAOtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAOtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAOtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYATotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYATotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYATotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYATotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYATotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYATotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYATotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYATotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPCash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPCash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPDefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPDefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPOca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPOca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPOtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPOtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPOtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPOtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPTotLE_NEW__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPTotLE_NEW__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPTotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPTotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPTotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPTotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPTotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPTotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPTotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPTotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FiscalYear__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FiscalYear__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Formula_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Formula_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Industry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Industry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pipeline1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pipeline1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ACash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ACash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ADebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ADebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ADefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ADefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AOca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AOca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AOtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AOtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AOtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AOtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ATotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ATotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ATotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ATotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ATotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ATotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ATotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ATotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ATotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ATotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PCash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PCash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PDefrev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PDefrev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1POca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1POca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1POtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1POtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1POtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1POtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PTotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PTotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PTotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PTotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PTotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PTotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PTotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PTotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PTotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PTotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1_Actual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1_Actual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1_Plan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1_Plan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ACash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ACash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ADebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ADebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ADefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ADefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AOca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AOca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AOtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AOtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AOtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AOtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ATotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ATotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ATotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ATotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ATotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ATotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ATotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ATotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ATotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ATotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PCash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PCash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PDefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PDefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2POca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2POca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2POtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2POtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2POtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2POtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PTotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PTotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PTotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PTotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PTotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PTotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PTotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PTotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PTotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PTotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2_Actual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2_Actual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2_Plan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2_Plan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ACash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ACash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ADebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ADebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ADefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ADefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AOca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AOca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AOtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AOtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AOtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AOtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ATotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ATotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ATotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ATotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ATotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ATotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ATotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ATotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ATotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ATotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PCash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PCash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PDefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PDefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3POca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3POca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3POtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3POtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3POtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3POtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PTotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PTotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PTotEQ_FML_for_text__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PTotEQ_FML_for_text__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PTotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PTotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PTotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PTotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PTotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PTotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PTotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PTotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3TOTALS__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3TOTALS__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3_Actual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3_Actual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3_Plan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3_Plan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ACash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ACash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ADebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ADebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ADefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ADefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AOca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AOca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AOtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AOtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AOtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AOtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ATotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ATotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ATotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ATotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ATotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ATotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ATotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ATotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ATotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ATotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PAP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PAP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PCash__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PCash__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PDefRev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PDefRev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PEq__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PEq__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PFix__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PFix__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4POca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4POca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4POtLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4POtLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4POtas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4POtas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PTotEQ_FML__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PTotEQ_FML__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PTotLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PTotLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PTotLi__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PTotLi__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PTotas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PTotas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PTotas_new__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PTotas_new__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PTotca__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PTotca__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4P_NEW_Tot_LE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4P_NEW_Tot_LE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4_Actual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4_Actual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4_Plan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4_Plan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Year__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyIsoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CurrencyIsoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
