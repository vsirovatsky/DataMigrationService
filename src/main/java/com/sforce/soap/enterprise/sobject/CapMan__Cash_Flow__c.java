/**
 * CapMan__Cash_Flow__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Cash_Flow__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__APCaBur__c;

    private java.lang.Double capMan__APCaChg__c;

    private java.lang.Double capMan__APCaOut__c;

    private java.lang.Double capMan__APEndCa__c;

    private java.lang.Double capMan__APFinCa__c;

    private java.lang.Double capMan__APInvCa__c;

    private java.lang.Double capMan__APOpsCa__c;

    private java.lang.Double capMan__APStarCa__c;

    private java.lang.String capMan__Account__c;

    private com.sforce.soap.enterprise.sobject.Account capMan__Account__r;

    private java.util.Date capMan__End_Date__c;

    private java.lang.Double capMan__FYACaBur__c;

    private java.lang.Double capMan__FYACaChg__c;

    private java.lang.Double capMan__FYACaOut__c;

    private java.lang.Double capMan__FYACaOut_new__c;

    private java.lang.Double capMan__FYAEndCa__c;

    private java.lang.Double capMan__FYAFinCa__c;

    private java.lang.Double capMan__FYAInvCa__c;

    private java.lang.Double capMan__FYAOpsCa__c;

    private java.lang.Double capMan__FYAStarCa__c;

    private java.lang.Double capMan__FYPCaBur__c;

    private java.lang.Double capMan__FYPCaChg__c;

    private java.lang.Double capMan__FYPCaOut__c;

    private java.lang.Double capMan__FYPCaOut_new__c;

    private java.lang.Double capMan__FYPEndCa__c;

    private java.lang.Double capMan__FYPFinCa__c;

    private java.lang.Double capMan__FYPInvCa__c;

    private java.lang.Double capMan__FYPOpsCa__c;

    private java.lang.Double capMan__FYPStarCa__c;

    private java.util.Date capMan__Formula_Start_Date__c;

    private java.lang.Double capMan__Q1ACaBur__c;

    private java.lang.Double capMan__Q1ACaChg__c;

    private java.lang.Double capMan__Q1ACaOut__c;

    private java.lang.Double capMan__Q1AEndCa__c;

    private java.lang.Double capMan__Q1AFinCa__c;

    private java.lang.Double capMan__Q1AInvCa__c;

    private java.lang.Double capMan__Q1AOpsCa__c;

    private java.lang.Double capMan__Q1AStarCa__c;

    private java.lang.Double capMan__Q1PCaBur__c;

    private java.lang.Double capMan__Q1PCaChg__c;

    private java.lang.Double capMan__Q1PCaOut__c;

    private java.lang.Double capMan__Q1PEndCa__c;

    private java.lang.Double capMan__Q1PFinCa__c;

    private java.lang.Double capMan__Q1PInvCa__c;

    private java.lang.Double capMan__Q1POpsCa__c;

    private java.lang.Double capMan__Q1PStarCa__c;

    private java.lang.Double capMan__Q2ACaBur__c;

    private java.lang.Double capMan__Q2ACaChg__c;

    private java.lang.Double capMan__Q2ACaOut__c;

    private java.lang.Double capMan__Q2AEndCa__c;

    private java.lang.Double capMan__Q2AFinCa__c;

    private java.lang.Double capMan__Q2AInvCa__c;

    private java.lang.Double capMan__Q2AOpsCa__c;

    private java.lang.Double capMan__Q2AStarCa__c;

    private java.lang.Double capMan__Q2PCaBur__c;

    private java.lang.Double capMan__Q2PCaChg__c;

    private java.lang.Double capMan__Q2PCaOut__c;

    private java.lang.Double capMan__Q2PEndCa__c;

    private java.lang.Double capMan__Q2PFinCa__c;

    private java.lang.Double capMan__Q2PInvCa__c;

    private java.lang.Double capMan__Q2POpsCa__c;

    private java.lang.Double capMan__Q2PStarCa__c;

    private java.lang.Double capMan__Q3ACaBur__c;

    private java.lang.Double capMan__Q3ACaChg__c;

    private java.lang.Double capMan__Q3ACaOut__c;

    private java.lang.Double capMan__Q3AEndCa__c;

    private java.lang.Double capMan__Q3AFinCa__c;

    private java.lang.Double capMan__Q3AInvCa__c;

    private java.lang.Double capMan__Q3AOpsCa__c;

    private java.lang.Double capMan__Q3AStarCa__c;

    private java.lang.Double capMan__Q3PCaBur__c;

    private java.lang.Double capMan__Q3PCaChg__c;

    private java.lang.Double capMan__Q3PCaOut__c;

    private java.lang.Double capMan__Q3PEndCa__c;

    private java.lang.Double capMan__Q3PFinCa__c;

    private java.lang.Double capMan__Q3PInvCa__c;

    private java.lang.Double capMan__Q3POpsCa__c;

    private java.lang.Double capMan__Q3PStarCa__c;

    private java.lang.Double capMan__Q4ACaBur__c;

    private java.lang.Double capMan__Q4ACaChg__c;

    private java.lang.Double capMan__Q4ACaOut__c;

    private java.lang.Double capMan__Q4AEndCa__c;

    private java.lang.Double capMan__Q4AFinCa__c;

    private java.lang.Double capMan__Q4AInvCa__c;

    private java.lang.Double capMan__Q4AOpsCa__c;

    private java.lang.Double capMan__Q4AStarCa__c;

    private java.lang.Double capMan__Q4PCaBur__c;

    private java.lang.Double capMan__Q4PCaChg__c;

    private java.lang.Double capMan__Q4PCaOut__c;

    private java.lang.Double capMan__Q4PEndCa__c;

    private java.lang.Double capMan__Q4PFinCa__c;

    private java.lang.Double capMan__Q4PInvCa__c;

    private java.lang.Double capMan__Q4POpsCa__c;

    private java.lang.Double capMan__Q4PStarCa__c;

    private java.util.Date capMan__Start_Date__c;

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

    public CapMan__Cash_Flow__c() {
    }

    public CapMan__Cash_Flow__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__APCaBur__c,
           java.lang.Double capMan__APCaChg__c,
           java.lang.Double capMan__APCaOut__c,
           java.lang.Double capMan__APEndCa__c,
           java.lang.Double capMan__APFinCa__c,
           java.lang.Double capMan__APInvCa__c,
           java.lang.Double capMan__APOpsCa__c,
           java.lang.Double capMan__APStarCa__c,
           java.lang.String capMan__Account__c,
           com.sforce.soap.enterprise.sobject.Account capMan__Account__r,
           java.util.Date capMan__End_Date__c,
           java.lang.Double capMan__FYACaBur__c,
           java.lang.Double capMan__FYACaChg__c,
           java.lang.Double capMan__FYACaOut__c,
           java.lang.Double capMan__FYACaOut_new__c,
           java.lang.Double capMan__FYAEndCa__c,
           java.lang.Double capMan__FYAFinCa__c,
           java.lang.Double capMan__FYAInvCa__c,
           java.lang.Double capMan__FYAOpsCa__c,
           java.lang.Double capMan__FYAStarCa__c,
           java.lang.Double capMan__FYPCaBur__c,
           java.lang.Double capMan__FYPCaChg__c,
           java.lang.Double capMan__FYPCaOut__c,
           java.lang.Double capMan__FYPCaOut_new__c,
           java.lang.Double capMan__FYPEndCa__c,
           java.lang.Double capMan__FYPFinCa__c,
           java.lang.Double capMan__FYPInvCa__c,
           java.lang.Double capMan__FYPOpsCa__c,
           java.lang.Double capMan__FYPStarCa__c,
           java.util.Date capMan__Formula_Start_Date__c,
           java.lang.Double capMan__Q1ACaBur__c,
           java.lang.Double capMan__Q1ACaChg__c,
           java.lang.Double capMan__Q1ACaOut__c,
           java.lang.Double capMan__Q1AEndCa__c,
           java.lang.Double capMan__Q1AFinCa__c,
           java.lang.Double capMan__Q1AInvCa__c,
           java.lang.Double capMan__Q1AOpsCa__c,
           java.lang.Double capMan__Q1AStarCa__c,
           java.lang.Double capMan__Q1PCaBur__c,
           java.lang.Double capMan__Q1PCaChg__c,
           java.lang.Double capMan__Q1PCaOut__c,
           java.lang.Double capMan__Q1PEndCa__c,
           java.lang.Double capMan__Q1PFinCa__c,
           java.lang.Double capMan__Q1PInvCa__c,
           java.lang.Double capMan__Q1POpsCa__c,
           java.lang.Double capMan__Q1PStarCa__c,
           java.lang.Double capMan__Q2ACaBur__c,
           java.lang.Double capMan__Q2ACaChg__c,
           java.lang.Double capMan__Q2ACaOut__c,
           java.lang.Double capMan__Q2AEndCa__c,
           java.lang.Double capMan__Q2AFinCa__c,
           java.lang.Double capMan__Q2AInvCa__c,
           java.lang.Double capMan__Q2AOpsCa__c,
           java.lang.Double capMan__Q2AStarCa__c,
           java.lang.Double capMan__Q2PCaBur__c,
           java.lang.Double capMan__Q2PCaChg__c,
           java.lang.Double capMan__Q2PCaOut__c,
           java.lang.Double capMan__Q2PEndCa__c,
           java.lang.Double capMan__Q2PFinCa__c,
           java.lang.Double capMan__Q2PInvCa__c,
           java.lang.Double capMan__Q2POpsCa__c,
           java.lang.Double capMan__Q2PStarCa__c,
           java.lang.Double capMan__Q3ACaBur__c,
           java.lang.Double capMan__Q3ACaChg__c,
           java.lang.Double capMan__Q3ACaOut__c,
           java.lang.Double capMan__Q3AEndCa__c,
           java.lang.Double capMan__Q3AFinCa__c,
           java.lang.Double capMan__Q3AInvCa__c,
           java.lang.Double capMan__Q3AOpsCa__c,
           java.lang.Double capMan__Q3AStarCa__c,
           java.lang.Double capMan__Q3PCaBur__c,
           java.lang.Double capMan__Q3PCaChg__c,
           java.lang.Double capMan__Q3PCaOut__c,
           java.lang.Double capMan__Q3PEndCa__c,
           java.lang.Double capMan__Q3PFinCa__c,
           java.lang.Double capMan__Q3PInvCa__c,
           java.lang.Double capMan__Q3POpsCa__c,
           java.lang.Double capMan__Q3PStarCa__c,
           java.lang.Double capMan__Q4ACaBur__c,
           java.lang.Double capMan__Q4ACaChg__c,
           java.lang.Double capMan__Q4ACaOut__c,
           java.lang.Double capMan__Q4AEndCa__c,
           java.lang.Double capMan__Q4AFinCa__c,
           java.lang.Double capMan__Q4AInvCa__c,
           java.lang.Double capMan__Q4AOpsCa__c,
           java.lang.Double capMan__Q4AStarCa__c,
           java.lang.Double capMan__Q4PCaBur__c,
           java.lang.Double capMan__Q4PCaChg__c,
           java.lang.Double capMan__Q4PCaOut__c,
           java.lang.Double capMan__Q4PEndCa__c,
           java.lang.Double capMan__Q4PFinCa__c,
           java.lang.Double capMan__Q4PInvCa__c,
           java.lang.Double capMan__Q4POpsCa__c,
           java.lang.Double capMan__Q4PStarCa__c,
           java.util.Date capMan__Start_Date__c,
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
        this.capMan__APCaBur__c = capMan__APCaBur__c;
        this.capMan__APCaChg__c = capMan__APCaChg__c;
        this.capMan__APCaOut__c = capMan__APCaOut__c;
        this.capMan__APEndCa__c = capMan__APEndCa__c;
        this.capMan__APFinCa__c = capMan__APFinCa__c;
        this.capMan__APInvCa__c = capMan__APInvCa__c;
        this.capMan__APOpsCa__c = capMan__APOpsCa__c;
        this.capMan__APStarCa__c = capMan__APStarCa__c;
        this.capMan__Account__c = capMan__Account__c;
        this.capMan__Account__r = capMan__Account__r;
        this.capMan__End_Date__c = capMan__End_Date__c;
        this.capMan__FYACaBur__c = capMan__FYACaBur__c;
        this.capMan__FYACaChg__c = capMan__FYACaChg__c;
        this.capMan__FYACaOut__c = capMan__FYACaOut__c;
        this.capMan__FYACaOut_new__c = capMan__FYACaOut_new__c;
        this.capMan__FYAEndCa__c = capMan__FYAEndCa__c;
        this.capMan__FYAFinCa__c = capMan__FYAFinCa__c;
        this.capMan__FYAInvCa__c = capMan__FYAInvCa__c;
        this.capMan__FYAOpsCa__c = capMan__FYAOpsCa__c;
        this.capMan__FYAStarCa__c = capMan__FYAStarCa__c;
        this.capMan__FYPCaBur__c = capMan__FYPCaBur__c;
        this.capMan__FYPCaChg__c = capMan__FYPCaChg__c;
        this.capMan__FYPCaOut__c = capMan__FYPCaOut__c;
        this.capMan__FYPCaOut_new__c = capMan__FYPCaOut_new__c;
        this.capMan__FYPEndCa__c = capMan__FYPEndCa__c;
        this.capMan__FYPFinCa__c = capMan__FYPFinCa__c;
        this.capMan__FYPInvCa__c = capMan__FYPInvCa__c;
        this.capMan__FYPOpsCa__c = capMan__FYPOpsCa__c;
        this.capMan__FYPStarCa__c = capMan__FYPStarCa__c;
        this.capMan__Formula_Start_Date__c = capMan__Formula_Start_Date__c;
        this.capMan__Q1ACaBur__c = capMan__Q1ACaBur__c;
        this.capMan__Q1ACaChg__c = capMan__Q1ACaChg__c;
        this.capMan__Q1ACaOut__c = capMan__Q1ACaOut__c;
        this.capMan__Q1AEndCa__c = capMan__Q1AEndCa__c;
        this.capMan__Q1AFinCa__c = capMan__Q1AFinCa__c;
        this.capMan__Q1AInvCa__c = capMan__Q1AInvCa__c;
        this.capMan__Q1AOpsCa__c = capMan__Q1AOpsCa__c;
        this.capMan__Q1AStarCa__c = capMan__Q1AStarCa__c;
        this.capMan__Q1PCaBur__c = capMan__Q1PCaBur__c;
        this.capMan__Q1PCaChg__c = capMan__Q1PCaChg__c;
        this.capMan__Q1PCaOut__c = capMan__Q1PCaOut__c;
        this.capMan__Q1PEndCa__c = capMan__Q1PEndCa__c;
        this.capMan__Q1PFinCa__c = capMan__Q1PFinCa__c;
        this.capMan__Q1PInvCa__c = capMan__Q1PInvCa__c;
        this.capMan__Q1POpsCa__c = capMan__Q1POpsCa__c;
        this.capMan__Q1PStarCa__c = capMan__Q1PStarCa__c;
        this.capMan__Q2ACaBur__c = capMan__Q2ACaBur__c;
        this.capMan__Q2ACaChg__c = capMan__Q2ACaChg__c;
        this.capMan__Q2ACaOut__c = capMan__Q2ACaOut__c;
        this.capMan__Q2AEndCa__c = capMan__Q2AEndCa__c;
        this.capMan__Q2AFinCa__c = capMan__Q2AFinCa__c;
        this.capMan__Q2AInvCa__c = capMan__Q2AInvCa__c;
        this.capMan__Q2AOpsCa__c = capMan__Q2AOpsCa__c;
        this.capMan__Q2AStarCa__c = capMan__Q2AStarCa__c;
        this.capMan__Q2PCaBur__c = capMan__Q2PCaBur__c;
        this.capMan__Q2PCaChg__c = capMan__Q2PCaChg__c;
        this.capMan__Q2PCaOut__c = capMan__Q2PCaOut__c;
        this.capMan__Q2PEndCa__c = capMan__Q2PEndCa__c;
        this.capMan__Q2PFinCa__c = capMan__Q2PFinCa__c;
        this.capMan__Q2PInvCa__c = capMan__Q2PInvCa__c;
        this.capMan__Q2POpsCa__c = capMan__Q2POpsCa__c;
        this.capMan__Q2PStarCa__c = capMan__Q2PStarCa__c;
        this.capMan__Q3ACaBur__c = capMan__Q3ACaBur__c;
        this.capMan__Q3ACaChg__c = capMan__Q3ACaChg__c;
        this.capMan__Q3ACaOut__c = capMan__Q3ACaOut__c;
        this.capMan__Q3AEndCa__c = capMan__Q3AEndCa__c;
        this.capMan__Q3AFinCa__c = capMan__Q3AFinCa__c;
        this.capMan__Q3AInvCa__c = capMan__Q3AInvCa__c;
        this.capMan__Q3AOpsCa__c = capMan__Q3AOpsCa__c;
        this.capMan__Q3AStarCa__c = capMan__Q3AStarCa__c;
        this.capMan__Q3PCaBur__c = capMan__Q3PCaBur__c;
        this.capMan__Q3PCaChg__c = capMan__Q3PCaChg__c;
        this.capMan__Q3PCaOut__c = capMan__Q3PCaOut__c;
        this.capMan__Q3PEndCa__c = capMan__Q3PEndCa__c;
        this.capMan__Q3PFinCa__c = capMan__Q3PFinCa__c;
        this.capMan__Q3PInvCa__c = capMan__Q3PInvCa__c;
        this.capMan__Q3POpsCa__c = capMan__Q3POpsCa__c;
        this.capMan__Q3PStarCa__c = capMan__Q3PStarCa__c;
        this.capMan__Q4ACaBur__c = capMan__Q4ACaBur__c;
        this.capMan__Q4ACaChg__c = capMan__Q4ACaChg__c;
        this.capMan__Q4ACaOut__c = capMan__Q4ACaOut__c;
        this.capMan__Q4AEndCa__c = capMan__Q4AEndCa__c;
        this.capMan__Q4AFinCa__c = capMan__Q4AFinCa__c;
        this.capMan__Q4AInvCa__c = capMan__Q4AInvCa__c;
        this.capMan__Q4AOpsCa__c = capMan__Q4AOpsCa__c;
        this.capMan__Q4AStarCa__c = capMan__Q4AStarCa__c;
        this.capMan__Q4PCaBur__c = capMan__Q4PCaBur__c;
        this.capMan__Q4PCaChg__c = capMan__Q4PCaChg__c;
        this.capMan__Q4PCaOut__c = capMan__Q4PCaOut__c;
        this.capMan__Q4PEndCa__c = capMan__Q4PEndCa__c;
        this.capMan__Q4PFinCa__c = capMan__Q4PFinCa__c;
        this.capMan__Q4PInvCa__c = capMan__Q4PInvCa__c;
        this.capMan__Q4POpsCa__c = capMan__Q4POpsCa__c;
        this.capMan__Q4PStarCa__c = capMan__Q4PStarCa__c;
        this.capMan__Start_Date__c = capMan__Start_Date__c;
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
     * Gets the attachments value for this CapMan__Cash_Flow__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Cash_Flow__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__APCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APCaBur__c
     */
    public java.lang.Double getCapMan__APCaBur__c() {
        return capMan__APCaBur__c;
    }


    /**
     * Sets the capMan__APCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APCaBur__c
     */
    public void setCapMan__APCaBur__c(java.lang.Double capMan__APCaBur__c) {
        this.capMan__APCaBur__c = capMan__APCaBur__c;
    }


    /**
     * Gets the capMan__APCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APCaChg__c
     */
    public java.lang.Double getCapMan__APCaChg__c() {
        return capMan__APCaChg__c;
    }


    /**
     * Sets the capMan__APCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APCaChg__c
     */
    public void setCapMan__APCaChg__c(java.lang.Double capMan__APCaChg__c) {
        this.capMan__APCaChg__c = capMan__APCaChg__c;
    }


    /**
     * Gets the capMan__APCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APCaOut__c
     */
    public java.lang.Double getCapMan__APCaOut__c() {
        return capMan__APCaOut__c;
    }


    /**
     * Sets the capMan__APCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APCaOut__c
     */
    public void setCapMan__APCaOut__c(java.lang.Double capMan__APCaOut__c) {
        this.capMan__APCaOut__c = capMan__APCaOut__c;
    }


    /**
     * Gets the capMan__APEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APEndCa__c
     */
    public java.lang.Double getCapMan__APEndCa__c() {
        return capMan__APEndCa__c;
    }


    /**
     * Sets the capMan__APEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APEndCa__c
     */
    public void setCapMan__APEndCa__c(java.lang.Double capMan__APEndCa__c) {
        this.capMan__APEndCa__c = capMan__APEndCa__c;
    }


    /**
     * Gets the capMan__APFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APFinCa__c
     */
    public java.lang.Double getCapMan__APFinCa__c() {
        return capMan__APFinCa__c;
    }


    /**
     * Sets the capMan__APFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APFinCa__c
     */
    public void setCapMan__APFinCa__c(java.lang.Double capMan__APFinCa__c) {
        this.capMan__APFinCa__c = capMan__APFinCa__c;
    }


    /**
     * Gets the capMan__APInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APInvCa__c
     */
    public java.lang.Double getCapMan__APInvCa__c() {
        return capMan__APInvCa__c;
    }


    /**
     * Sets the capMan__APInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APInvCa__c
     */
    public void setCapMan__APInvCa__c(java.lang.Double capMan__APInvCa__c) {
        this.capMan__APInvCa__c = capMan__APInvCa__c;
    }


    /**
     * Gets the capMan__APOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APOpsCa__c
     */
    public java.lang.Double getCapMan__APOpsCa__c() {
        return capMan__APOpsCa__c;
    }


    /**
     * Sets the capMan__APOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APOpsCa__c
     */
    public void setCapMan__APOpsCa__c(java.lang.Double capMan__APOpsCa__c) {
        this.capMan__APOpsCa__c = capMan__APOpsCa__c;
    }


    /**
     * Gets the capMan__APStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__APStarCa__c
     */
    public java.lang.Double getCapMan__APStarCa__c() {
        return capMan__APStarCa__c;
    }


    /**
     * Sets the capMan__APStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__APStarCa__c
     */
    public void setCapMan__APStarCa__c(java.lang.Double capMan__APStarCa__c) {
        this.capMan__APStarCa__c = capMan__APStarCa__c;
    }


    /**
     * Gets the capMan__Account__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Account__c
     */
    public java.lang.String getCapMan__Account__c() {
        return capMan__Account__c;
    }


    /**
     * Sets the capMan__Account__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Account__c
     */
    public void setCapMan__Account__c(java.lang.String capMan__Account__c) {
        this.capMan__Account__c = capMan__Account__c;
    }


    /**
     * Gets the capMan__Account__r value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getCapMan__Account__r() {
        return capMan__Account__r;
    }


    /**
     * Sets the capMan__Account__r value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Account__r
     */
    public void setCapMan__Account__r(com.sforce.soap.enterprise.sobject.Account capMan__Account__r) {
        this.capMan__Account__r = capMan__Account__r;
    }


    /**
     * Gets the capMan__End_Date__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__End_Date__c
     */
    public java.util.Date getCapMan__End_Date__c() {
        return capMan__End_Date__c;
    }


    /**
     * Sets the capMan__End_Date__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__End_Date__c
     */
    public void setCapMan__End_Date__c(java.util.Date capMan__End_Date__c) {
        this.capMan__End_Date__c = capMan__End_Date__c;
    }


    /**
     * Gets the capMan__FYACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYACaBur__c
     */
    public java.lang.Double getCapMan__FYACaBur__c() {
        return capMan__FYACaBur__c;
    }


    /**
     * Sets the capMan__FYACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYACaBur__c
     */
    public void setCapMan__FYACaBur__c(java.lang.Double capMan__FYACaBur__c) {
        this.capMan__FYACaBur__c = capMan__FYACaBur__c;
    }


    /**
     * Gets the capMan__FYACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYACaChg__c
     */
    public java.lang.Double getCapMan__FYACaChg__c() {
        return capMan__FYACaChg__c;
    }


    /**
     * Sets the capMan__FYACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYACaChg__c
     */
    public void setCapMan__FYACaChg__c(java.lang.Double capMan__FYACaChg__c) {
        this.capMan__FYACaChg__c = capMan__FYACaChg__c;
    }


    /**
     * Gets the capMan__FYACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYACaOut__c
     */
    public java.lang.Double getCapMan__FYACaOut__c() {
        return capMan__FYACaOut__c;
    }


    /**
     * Sets the capMan__FYACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYACaOut__c
     */
    public void setCapMan__FYACaOut__c(java.lang.Double capMan__FYACaOut__c) {
        this.capMan__FYACaOut__c = capMan__FYACaOut__c;
    }


    /**
     * Gets the capMan__FYACaOut_new__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYACaOut_new__c
     */
    public java.lang.Double getCapMan__FYACaOut_new__c() {
        return capMan__FYACaOut_new__c;
    }


    /**
     * Sets the capMan__FYACaOut_new__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYACaOut_new__c
     */
    public void setCapMan__FYACaOut_new__c(java.lang.Double capMan__FYACaOut_new__c) {
        this.capMan__FYACaOut_new__c = capMan__FYACaOut_new__c;
    }


    /**
     * Gets the capMan__FYAEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYAEndCa__c
     */
    public java.lang.Double getCapMan__FYAEndCa__c() {
        return capMan__FYAEndCa__c;
    }


    /**
     * Sets the capMan__FYAEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYAEndCa__c
     */
    public void setCapMan__FYAEndCa__c(java.lang.Double capMan__FYAEndCa__c) {
        this.capMan__FYAEndCa__c = capMan__FYAEndCa__c;
    }


    /**
     * Gets the capMan__FYAFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYAFinCa__c
     */
    public java.lang.Double getCapMan__FYAFinCa__c() {
        return capMan__FYAFinCa__c;
    }


    /**
     * Sets the capMan__FYAFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYAFinCa__c
     */
    public void setCapMan__FYAFinCa__c(java.lang.Double capMan__FYAFinCa__c) {
        this.capMan__FYAFinCa__c = capMan__FYAFinCa__c;
    }


    /**
     * Gets the capMan__FYAInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYAInvCa__c
     */
    public java.lang.Double getCapMan__FYAInvCa__c() {
        return capMan__FYAInvCa__c;
    }


    /**
     * Sets the capMan__FYAInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYAInvCa__c
     */
    public void setCapMan__FYAInvCa__c(java.lang.Double capMan__FYAInvCa__c) {
        this.capMan__FYAInvCa__c = capMan__FYAInvCa__c;
    }


    /**
     * Gets the capMan__FYAOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYAOpsCa__c
     */
    public java.lang.Double getCapMan__FYAOpsCa__c() {
        return capMan__FYAOpsCa__c;
    }


    /**
     * Sets the capMan__FYAOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYAOpsCa__c
     */
    public void setCapMan__FYAOpsCa__c(java.lang.Double capMan__FYAOpsCa__c) {
        this.capMan__FYAOpsCa__c = capMan__FYAOpsCa__c;
    }


    /**
     * Gets the capMan__FYAStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYAStarCa__c
     */
    public java.lang.Double getCapMan__FYAStarCa__c() {
        return capMan__FYAStarCa__c;
    }


    /**
     * Sets the capMan__FYAStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYAStarCa__c
     */
    public void setCapMan__FYAStarCa__c(java.lang.Double capMan__FYAStarCa__c) {
        this.capMan__FYAStarCa__c = capMan__FYAStarCa__c;
    }


    /**
     * Gets the capMan__FYPCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPCaBur__c
     */
    public java.lang.Double getCapMan__FYPCaBur__c() {
        return capMan__FYPCaBur__c;
    }


    /**
     * Sets the capMan__FYPCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPCaBur__c
     */
    public void setCapMan__FYPCaBur__c(java.lang.Double capMan__FYPCaBur__c) {
        this.capMan__FYPCaBur__c = capMan__FYPCaBur__c;
    }


    /**
     * Gets the capMan__FYPCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPCaChg__c
     */
    public java.lang.Double getCapMan__FYPCaChg__c() {
        return capMan__FYPCaChg__c;
    }


    /**
     * Sets the capMan__FYPCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPCaChg__c
     */
    public void setCapMan__FYPCaChg__c(java.lang.Double capMan__FYPCaChg__c) {
        this.capMan__FYPCaChg__c = capMan__FYPCaChg__c;
    }


    /**
     * Gets the capMan__FYPCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPCaOut__c
     */
    public java.lang.Double getCapMan__FYPCaOut__c() {
        return capMan__FYPCaOut__c;
    }


    /**
     * Sets the capMan__FYPCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPCaOut__c
     */
    public void setCapMan__FYPCaOut__c(java.lang.Double capMan__FYPCaOut__c) {
        this.capMan__FYPCaOut__c = capMan__FYPCaOut__c;
    }


    /**
     * Gets the capMan__FYPCaOut_new__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPCaOut_new__c
     */
    public java.lang.Double getCapMan__FYPCaOut_new__c() {
        return capMan__FYPCaOut_new__c;
    }


    /**
     * Sets the capMan__FYPCaOut_new__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPCaOut_new__c
     */
    public void setCapMan__FYPCaOut_new__c(java.lang.Double capMan__FYPCaOut_new__c) {
        this.capMan__FYPCaOut_new__c = capMan__FYPCaOut_new__c;
    }


    /**
     * Gets the capMan__FYPEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPEndCa__c
     */
    public java.lang.Double getCapMan__FYPEndCa__c() {
        return capMan__FYPEndCa__c;
    }


    /**
     * Sets the capMan__FYPEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPEndCa__c
     */
    public void setCapMan__FYPEndCa__c(java.lang.Double capMan__FYPEndCa__c) {
        this.capMan__FYPEndCa__c = capMan__FYPEndCa__c;
    }


    /**
     * Gets the capMan__FYPFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPFinCa__c
     */
    public java.lang.Double getCapMan__FYPFinCa__c() {
        return capMan__FYPFinCa__c;
    }


    /**
     * Sets the capMan__FYPFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPFinCa__c
     */
    public void setCapMan__FYPFinCa__c(java.lang.Double capMan__FYPFinCa__c) {
        this.capMan__FYPFinCa__c = capMan__FYPFinCa__c;
    }


    /**
     * Gets the capMan__FYPInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPInvCa__c
     */
    public java.lang.Double getCapMan__FYPInvCa__c() {
        return capMan__FYPInvCa__c;
    }


    /**
     * Sets the capMan__FYPInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPInvCa__c
     */
    public void setCapMan__FYPInvCa__c(java.lang.Double capMan__FYPInvCa__c) {
        this.capMan__FYPInvCa__c = capMan__FYPInvCa__c;
    }


    /**
     * Gets the capMan__FYPOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPOpsCa__c
     */
    public java.lang.Double getCapMan__FYPOpsCa__c() {
        return capMan__FYPOpsCa__c;
    }


    /**
     * Sets the capMan__FYPOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPOpsCa__c
     */
    public void setCapMan__FYPOpsCa__c(java.lang.Double capMan__FYPOpsCa__c) {
        this.capMan__FYPOpsCa__c = capMan__FYPOpsCa__c;
    }


    /**
     * Gets the capMan__FYPStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__FYPStarCa__c
     */
    public java.lang.Double getCapMan__FYPStarCa__c() {
        return capMan__FYPStarCa__c;
    }


    /**
     * Sets the capMan__FYPStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__FYPStarCa__c
     */
    public void setCapMan__FYPStarCa__c(java.lang.Double capMan__FYPStarCa__c) {
        this.capMan__FYPStarCa__c = capMan__FYPStarCa__c;
    }


    /**
     * Gets the capMan__Formula_Start_Date__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Formula_Start_Date__c
     */
    public java.util.Date getCapMan__Formula_Start_Date__c() {
        return capMan__Formula_Start_Date__c;
    }


    /**
     * Sets the capMan__Formula_Start_Date__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Formula_Start_Date__c
     */
    public void setCapMan__Formula_Start_Date__c(java.util.Date capMan__Formula_Start_Date__c) {
        this.capMan__Formula_Start_Date__c = capMan__Formula_Start_Date__c;
    }


    /**
     * Gets the capMan__Q1ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1ACaBur__c
     */
    public java.lang.Double getCapMan__Q1ACaBur__c() {
        return capMan__Q1ACaBur__c;
    }


    /**
     * Sets the capMan__Q1ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1ACaBur__c
     */
    public void setCapMan__Q1ACaBur__c(java.lang.Double capMan__Q1ACaBur__c) {
        this.capMan__Q1ACaBur__c = capMan__Q1ACaBur__c;
    }


    /**
     * Gets the capMan__Q1ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1ACaChg__c
     */
    public java.lang.Double getCapMan__Q1ACaChg__c() {
        return capMan__Q1ACaChg__c;
    }


    /**
     * Sets the capMan__Q1ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1ACaChg__c
     */
    public void setCapMan__Q1ACaChg__c(java.lang.Double capMan__Q1ACaChg__c) {
        this.capMan__Q1ACaChg__c = capMan__Q1ACaChg__c;
    }


    /**
     * Gets the capMan__Q1ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1ACaOut__c
     */
    public java.lang.Double getCapMan__Q1ACaOut__c() {
        return capMan__Q1ACaOut__c;
    }


    /**
     * Sets the capMan__Q1ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1ACaOut__c
     */
    public void setCapMan__Q1ACaOut__c(java.lang.Double capMan__Q1ACaOut__c) {
        this.capMan__Q1ACaOut__c = capMan__Q1ACaOut__c;
    }


    /**
     * Gets the capMan__Q1AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1AEndCa__c
     */
    public java.lang.Double getCapMan__Q1AEndCa__c() {
        return capMan__Q1AEndCa__c;
    }


    /**
     * Sets the capMan__Q1AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1AEndCa__c
     */
    public void setCapMan__Q1AEndCa__c(java.lang.Double capMan__Q1AEndCa__c) {
        this.capMan__Q1AEndCa__c = capMan__Q1AEndCa__c;
    }


    /**
     * Gets the capMan__Q1AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1AFinCa__c
     */
    public java.lang.Double getCapMan__Q1AFinCa__c() {
        return capMan__Q1AFinCa__c;
    }


    /**
     * Sets the capMan__Q1AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1AFinCa__c
     */
    public void setCapMan__Q1AFinCa__c(java.lang.Double capMan__Q1AFinCa__c) {
        this.capMan__Q1AFinCa__c = capMan__Q1AFinCa__c;
    }


    /**
     * Gets the capMan__Q1AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1AInvCa__c
     */
    public java.lang.Double getCapMan__Q1AInvCa__c() {
        return capMan__Q1AInvCa__c;
    }


    /**
     * Sets the capMan__Q1AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1AInvCa__c
     */
    public void setCapMan__Q1AInvCa__c(java.lang.Double capMan__Q1AInvCa__c) {
        this.capMan__Q1AInvCa__c = capMan__Q1AInvCa__c;
    }


    /**
     * Gets the capMan__Q1AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1AOpsCa__c
     */
    public java.lang.Double getCapMan__Q1AOpsCa__c() {
        return capMan__Q1AOpsCa__c;
    }


    /**
     * Sets the capMan__Q1AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1AOpsCa__c
     */
    public void setCapMan__Q1AOpsCa__c(java.lang.Double capMan__Q1AOpsCa__c) {
        this.capMan__Q1AOpsCa__c = capMan__Q1AOpsCa__c;
    }


    /**
     * Gets the capMan__Q1AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1AStarCa__c
     */
    public java.lang.Double getCapMan__Q1AStarCa__c() {
        return capMan__Q1AStarCa__c;
    }


    /**
     * Sets the capMan__Q1AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1AStarCa__c
     */
    public void setCapMan__Q1AStarCa__c(java.lang.Double capMan__Q1AStarCa__c) {
        this.capMan__Q1AStarCa__c = capMan__Q1AStarCa__c;
    }


    /**
     * Gets the capMan__Q1PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1PCaBur__c
     */
    public java.lang.Double getCapMan__Q1PCaBur__c() {
        return capMan__Q1PCaBur__c;
    }


    /**
     * Sets the capMan__Q1PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1PCaBur__c
     */
    public void setCapMan__Q1PCaBur__c(java.lang.Double capMan__Q1PCaBur__c) {
        this.capMan__Q1PCaBur__c = capMan__Q1PCaBur__c;
    }


    /**
     * Gets the capMan__Q1PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1PCaChg__c
     */
    public java.lang.Double getCapMan__Q1PCaChg__c() {
        return capMan__Q1PCaChg__c;
    }


    /**
     * Sets the capMan__Q1PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1PCaChg__c
     */
    public void setCapMan__Q1PCaChg__c(java.lang.Double capMan__Q1PCaChg__c) {
        this.capMan__Q1PCaChg__c = capMan__Q1PCaChg__c;
    }


    /**
     * Gets the capMan__Q1PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1PCaOut__c
     */
    public java.lang.Double getCapMan__Q1PCaOut__c() {
        return capMan__Q1PCaOut__c;
    }


    /**
     * Sets the capMan__Q1PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1PCaOut__c
     */
    public void setCapMan__Q1PCaOut__c(java.lang.Double capMan__Q1PCaOut__c) {
        this.capMan__Q1PCaOut__c = capMan__Q1PCaOut__c;
    }


    /**
     * Gets the capMan__Q1PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1PEndCa__c
     */
    public java.lang.Double getCapMan__Q1PEndCa__c() {
        return capMan__Q1PEndCa__c;
    }


    /**
     * Sets the capMan__Q1PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1PEndCa__c
     */
    public void setCapMan__Q1PEndCa__c(java.lang.Double capMan__Q1PEndCa__c) {
        this.capMan__Q1PEndCa__c = capMan__Q1PEndCa__c;
    }


    /**
     * Gets the capMan__Q1PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1PFinCa__c
     */
    public java.lang.Double getCapMan__Q1PFinCa__c() {
        return capMan__Q1PFinCa__c;
    }


    /**
     * Sets the capMan__Q1PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1PFinCa__c
     */
    public void setCapMan__Q1PFinCa__c(java.lang.Double capMan__Q1PFinCa__c) {
        this.capMan__Q1PFinCa__c = capMan__Q1PFinCa__c;
    }


    /**
     * Gets the capMan__Q1PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1PInvCa__c
     */
    public java.lang.Double getCapMan__Q1PInvCa__c() {
        return capMan__Q1PInvCa__c;
    }


    /**
     * Sets the capMan__Q1PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1PInvCa__c
     */
    public void setCapMan__Q1PInvCa__c(java.lang.Double capMan__Q1PInvCa__c) {
        this.capMan__Q1PInvCa__c = capMan__Q1PInvCa__c;
    }


    /**
     * Gets the capMan__Q1POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1POpsCa__c
     */
    public java.lang.Double getCapMan__Q1POpsCa__c() {
        return capMan__Q1POpsCa__c;
    }


    /**
     * Sets the capMan__Q1POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1POpsCa__c
     */
    public void setCapMan__Q1POpsCa__c(java.lang.Double capMan__Q1POpsCa__c) {
        this.capMan__Q1POpsCa__c = capMan__Q1POpsCa__c;
    }


    /**
     * Gets the capMan__Q1PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q1PStarCa__c
     */
    public java.lang.Double getCapMan__Q1PStarCa__c() {
        return capMan__Q1PStarCa__c;
    }


    /**
     * Sets the capMan__Q1PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q1PStarCa__c
     */
    public void setCapMan__Q1PStarCa__c(java.lang.Double capMan__Q1PStarCa__c) {
        this.capMan__Q1PStarCa__c = capMan__Q1PStarCa__c;
    }


    /**
     * Gets the capMan__Q2ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2ACaBur__c
     */
    public java.lang.Double getCapMan__Q2ACaBur__c() {
        return capMan__Q2ACaBur__c;
    }


    /**
     * Sets the capMan__Q2ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2ACaBur__c
     */
    public void setCapMan__Q2ACaBur__c(java.lang.Double capMan__Q2ACaBur__c) {
        this.capMan__Q2ACaBur__c = capMan__Q2ACaBur__c;
    }


    /**
     * Gets the capMan__Q2ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2ACaChg__c
     */
    public java.lang.Double getCapMan__Q2ACaChg__c() {
        return capMan__Q2ACaChg__c;
    }


    /**
     * Sets the capMan__Q2ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2ACaChg__c
     */
    public void setCapMan__Q2ACaChg__c(java.lang.Double capMan__Q2ACaChg__c) {
        this.capMan__Q2ACaChg__c = capMan__Q2ACaChg__c;
    }


    /**
     * Gets the capMan__Q2ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2ACaOut__c
     */
    public java.lang.Double getCapMan__Q2ACaOut__c() {
        return capMan__Q2ACaOut__c;
    }


    /**
     * Sets the capMan__Q2ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2ACaOut__c
     */
    public void setCapMan__Q2ACaOut__c(java.lang.Double capMan__Q2ACaOut__c) {
        this.capMan__Q2ACaOut__c = capMan__Q2ACaOut__c;
    }


    /**
     * Gets the capMan__Q2AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2AEndCa__c
     */
    public java.lang.Double getCapMan__Q2AEndCa__c() {
        return capMan__Q2AEndCa__c;
    }


    /**
     * Sets the capMan__Q2AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2AEndCa__c
     */
    public void setCapMan__Q2AEndCa__c(java.lang.Double capMan__Q2AEndCa__c) {
        this.capMan__Q2AEndCa__c = capMan__Q2AEndCa__c;
    }


    /**
     * Gets the capMan__Q2AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2AFinCa__c
     */
    public java.lang.Double getCapMan__Q2AFinCa__c() {
        return capMan__Q2AFinCa__c;
    }


    /**
     * Sets the capMan__Q2AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2AFinCa__c
     */
    public void setCapMan__Q2AFinCa__c(java.lang.Double capMan__Q2AFinCa__c) {
        this.capMan__Q2AFinCa__c = capMan__Q2AFinCa__c;
    }


    /**
     * Gets the capMan__Q2AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2AInvCa__c
     */
    public java.lang.Double getCapMan__Q2AInvCa__c() {
        return capMan__Q2AInvCa__c;
    }


    /**
     * Sets the capMan__Q2AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2AInvCa__c
     */
    public void setCapMan__Q2AInvCa__c(java.lang.Double capMan__Q2AInvCa__c) {
        this.capMan__Q2AInvCa__c = capMan__Q2AInvCa__c;
    }


    /**
     * Gets the capMan__Q2AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2AOpsCa__c
     */
    public java.lang.Double getCapMan__Q2AOpsCa__c() {
        return capMan__Q2AOpsCa__c;
    }


    /**
     * Sets the capMan__Q2AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2AOpsCa__c
     */
    public void setCapMan__Q2AOpsCa__c(java.lang.Double capMan__Q2AOpsCa__c) {
        this.capMan__Q2AOpsCa__c = capMan__Q2AOpsCa__c;
    }


    /**
     * Gets the capMan__Q2AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2AStarCa__c
     */
    public java.lang.Double getCapMan__Q2AStarCa__c() {
        return capMan__Q2AStarCa__c;
    }


    /**
     * Sets the capMan__Q2AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2AStarCa__c
     */
    public void setCapMan__Q2AStarCa__c(java.lang.Double capMan__Q2AStarCa__c) {
        this.capMan__Q2AStarCa__c = capMan__Q2AStarCa__c;
    }


    /**
     * Gets the capMan__Q2PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2PCaBur__c
     */
    public java.lang.Double getCapMan__Q2PCaBur__c() {
        return capMan__Q2PCaBur__c;
    }


    /**
     * Sets the capMan__Q2PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2PCaBur__c
     */
    public void setCapMan__Q2PCaBur__c(java.lang.Double capMan__Q2PCaBur__c) {
        this.capMan__Q2PCaBur__c = capMan__Q2PCaBur__c;
    }


    /**
     * Gets the capMan__Q2PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2PCaChg__c
     */
    public java.lang.Double getCapMan__Q2PCaChg__c() {
        return capMan__Q2PCaChg__c;
    }


    /**
     * Sets the capMan__Q2PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2PCaChg__c
     */
    public void setCapMan__Q2PCaChg__c(java.lang.Double capMan__Q2PCaChg__c) {
        this.capMan__Q2PCaChg__c = capMan__Q2PCaChg__c;
    }


    /**
     * Gets the capMan__Q2PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2PCaOut__c
     */
    public java.lang.Double getCapMan__Q2PCaOut__c() {
        return capMan__Q2PCaOut__c;
    }


    /**
     * Sets the capMan__Q2PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2PCaOut__c
     */
    public void setCapMan__Q2PCaOut__c(java.lang.Double capMan__Q2PCaOut__c) {
        this.capMan__Q2PCaOut__c = capMan__Q2PCaOut__c;
    }


    /**
     * Gets the capMan__Q2PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2PEndCa__c
     */
    public java.lang.Double getCapMan__Q2PEndCa__c() {
        return capMan__Q2PEndCa__c;
    }


    /**
     * Sets the capMan__Q2PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2PEndCa__c
     */
    public void setCapMan__Q2PEndCa__c(java.lang.Double capMan__Q2PEndCa__c) {
        this.capMan__Q2PEndCa__c = capMan__Q2PEndCa__c;
    }


    /**
     * Gets the capMan__Q2PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2PFinCa__c
     */
    public java.lang.Double getCapMan__Q2PFinCa__c() {
        return capMan__Q2PFinCa__c;
    }


    /**
     * Sets the capMan__Q2PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2PFinCa__c
     */
    public void setCapMan__Q2PFinCa__c(java.lang.Double capMan__Q2PFinCa__c) {
        this.capMan__Q2PFinCa__c = capMan__Q2PFinCa__c;
    }


    /**
     * Gets the capMan__Q2PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2PInvCa__c
     */
    public java.lang.Double getCapMan__Q2PInvCa__c() {
        return capMan__Q2PInvCa__c;
    }


    /**
     * Sets the capMan__Q2PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2PInvCa__c
     */
    public void setCapMan__Q2PInvCa__c(java.lang.Double capMan__Q2PInvCa__c) {
        this.capMan__Q2PInvCa__c = capMan__Q2PInvCa__c;
    }


    /**
     * Gets the capMan__Q2POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2POpsCa__c
     */
    public java.lang.Double getCapMan__Q2POpsCa__c() {
        return capMan__Q2POpsCa__c;
    }


    /**
     * Sets the capMan__Q2POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2POpsCa__c
     */
    public void setCapMan__Q2POpsCa__c(java.lang.Double capMan__Q2POpsCa__c) {
        this.capMan__Q2POpsCa__c = capMan__Q2POpsCa__c;
    }


    /**
     * Gets the capMan__Q2PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q2PStarCa__c
     */
    public java.lang.Double getCapMan__Q2PStarCa__c() {
        return capMan__Q2PStarCa__c;
    }


    /**
     * Sets the capMan__Q2PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q2PStarCa__c
     */
    public void setCapMan__Q2PStarCa__c(java.lang.Double capMan__Q2PStarCa__c) {
        this.capMan__Q2PStarCa__c = capMan__Q2PStarCa__c;
    }


    /**
     * Gets the capMan__Q3ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3ACaBur__c
     */
    public java.lang.Double getCapMan__Q3ACaBur__c() {
        return capMan__Q3ACaBur__c;
    }


    /**
     * Sets the capMan__Q3ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3ACaBur__c
     */
    public void setCapMan__Q3ACaBur__c(java.lang.Double capMan__Q3ACaBur__c) {
        this.capMan__Q3ACaBur__c = capMan__Q3ACaBur__c;
    }


    /**
     * Gets the capMan__Q3ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3ACaChg__c
     */
    public java.lang.Double getCapMan__Q3ACaChg__c() {
        return capMan__Q3ACaChg__c;
    }


    /**
     * Sets the capMan__Q3ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3ACaChg__c
     */
    public void setCapMan__Q3ACaChg__c(java.lang.Double capMan__Q3ACaChg__c) {
        this.capMan__Q3ACaChg__c = capMan__Q3ACaChg__c;
    }


    /**
     * Gets the capMan__Q3ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3ACaOut__c
     */
    public java.lang.Double getCapMan__Q3ACaOut__c() {
        return capMan__Q3ACaOut__c;
    }


    /**
     * Sets the capMan__Q3ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3ACaOut__c
     */
    public void setCapMan__Q3ACaOut__c(java.lang.Double capMan__Q3ACaOut__c) {
        this.capMan__Q3ACaOut__c = capMan__Q3ACaOut__c;
    }


    /**
     * Gets the capMan__Q3AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3AEndCa__c
     */
    public java.lang.Double getCapMan__Q3AEndCa__c() {
        return capMan__Q3AEndCa__c;
    }


    /**
     * Sets the capMan__Q3AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3AEndCa__c
     */
    public void setCapMan__Q3AEndCa__c(java.lang.Double capMan__Q3AEndCa__c) {
        this.capMan__Q3AEndCa__c = capMan__Q3AEndCa__c;
    }


    /**
     * Gets the capMan__Q3AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3AFinCa__c
     */
    public java.lang.Double getCapMan__Q3AFinCa__c() {
        return capMan__Q3AFinCa__c;
    }


    /**
     * Sets the capMan__Q3AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3AFinCa__c
     */
    public void setCapMan__Q3AFinCa__c(java.lang.Double capMan__Q3AFinCa__c) {
        this.capMan__Q3AFinCa__c = capMan__Q3AFinCa__c;
    }


    /**
     * Gets the capMan__Q3AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3AInvCa__c
     */
    public java.lang.Double getCapMan__Q3AInvCa__c() {
        return capMan__Q3AInvCa__c;
    }


    /**
     * Sets the capMan__Q3AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3AInvCa__c
     */
    public void setCapMan__Q3AInvCa__c(java.lang.Double capMan__Q3AInvCa__c) {
        this.capMan__Q3AInvCa__c = capMan__Q3AInvCa__c;
    }


    /**
     * Gets the capMan__Q3AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3AOpsCa__c
     */
    public java.lang.Double getCapMan__Q3AOpsCa__c() {
        return capMan__Q3AOpsCa__c;
    }


    /**
     * Sets the capMan__Q3AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3AOpsCa__c
     */
    public void setCapMan__Q3AOpsCa__c(java.lang.Double capMan__Q3AOpsCa__c) {
        this.capMan__Q3AOpsCa__c = capMan__Q3AOpsCa__c;
    }


    /**
     * Gets the capMan__Q3AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3AStarCa__c
     */
    public java.lang.Double getCapMan__Q3AStarCa__c() {
        return capMan__Q3AStarCa__c;
    }


    /**
     * Sets the capMan__Q3AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3AStarCa__c
     */
    public void setCapMan__Q3AStarCa__c(java.lang.Double capMan__Q3AStarCa__c) {
        this.capMan__Q3AStarCa__c = capMan__Q3AStarCa__c;
    }


    /**
     * Gets the capMan__Q3PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3PCaBur__c
     */
    public java.lang.Double getCapMan__Q3PCaBur__c() {
        return capMan__Q3PCaBur__c;
    }


    /**
     * Sets the capMan__Q3PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3PCaBur__c
     */
    public void setCapMan__Q3PCaBur__c(java.lang.Double capMan__Q3PCaBur__c) {
        this.capMan__Q3PCaBur__c = capMan__Q3PCaBur__c;
    }


    /**
     * Gets the capMan__Q3PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3PCaChg__c
     */
    public java.lang.Double getCapMan__Q3PCaChg__c() {
        return capMan__Q3PCaChg__c;
    }


    /**
     * Sets the capMan__Q3PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3PCaChg__c
     */
    public void setCapMan__Q3PCaChg__c(java.lang.Double capMan__Q3PCaChg__c) {
        this.capMan__Q3PCaChg__c = capMan__Q3PCaChg__c;
    }


    /**
     * Gets the capMan__Q3PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3PCaOut__c
     */
    public java.lang.Double getCapMan__Q3PCaOut__c() {
        return capMan__Q3PCaOut__c;
    }


    /**
     * Sets the capMan__Q3PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3PCaOut__c
     */
    public void setCapMan__Q3PCaOut__c(java.lang.Double capMan__Q3PCaOut__c) {
        this.capMan__Q3PCaOut__c = capMan__Q3PCaOut__c;
    }


    /**
     * Gets the capMan__Q3PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3PEndCa__c
     */
    public java.lang.Double getCapMan__Q3PEndCa__c() {
        return capMan__Q3PEndCa__c;
    }


    /**
     * Sets the capMan__Q3PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3PEndCa__c
     */
    public void setCapMan__Q3PEndCa__c(java.lang.Double capMan__Q3PEndCa__c) {
        this.capMan__Q3PEndCa__c = capMan__Q3PEndCa__c;
    }


    /**
     * Gets the capMan__Q3PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3PFinCa__c
     */
    public java.lang.Double getCapMan__Q3PFinCa__c() {
        return capMan__Q3PFinCa__c;
    }


    /**
     * Sets the capMan__Q3PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3PFinCa__c
     */
    public void setCapMan__Q3PFinCa__c(java.lang.Double capMan__Q3PFinCa__c) {
        this.capMan__Q3PFinCa__c = capMan__Q3PFinCa__c;
    }


    /**
     * Gets the capMan__Q3PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3PInvCa__c
     */
    public java.lang.Double getCapMan__Q3PInvCa__c() {
        return capMan__Q3PInvCa__c;
    }


    /**
     * Sets the capMan__Q3PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3PInvCa__c
     */
    public void setCapMan__Q3PInvCa__c(java.lang.Double capMan__Q3PInvCa__c) {
        this.capMan__Q3PInvCa__c = capMan__Q3PInvCa__c;
    }


    /**
     * Gets the capMan__Q3POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3POpsCa__c
     */
    public java.lang.Double getCapMan__Q3POpsCa__c() {
        return capMan__Q3POpsCa__c;
    }


    /**
     * Sets the capMan__Q3POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3POpsCa__c
     */
    public void setCapMan__Q3POpsCa__c(java.lang.Double capMan__Q3POpsCa__c) {
        this.capMan__Q3POpsCa__c = capMan__Q3POpsCa__c;
    }


    /**
     * Gets the capMan__Q3PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q3PStarCa__c
     */
    public java.lang.Double getCapMan__Q3PStarCa__c() {
        return capMan__Q3PStarCa__c;
    }


    /**
     * Sets the capMan__Q3PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q3PStarCa__c
     */
    public void setCapMan__Q3PStarCa__c(java.lang.Double capMan__Q3PStarCa__c) {
        this.capMan__Q3PStarCa__c = capMan__Q3PStarCa__c;
    }


    /**
     * Gets the capMan__Q4ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4ACaBur__c
     */
    public java.lang.Double getCapMan__Q4ACaBur__c() {
        return capMan__Q4ACaBur__c;
    }


    /**
     * Sets the capMan__Q4ACaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4ACaBur__c
     */
    public void setCapMan__Q4ACaBur__c(java.lang.Double capMan__Q4ACaBur__c) {
        this.capMan__Q4ACaBur__c = capMan__Q4ACaBur__c;
    }


    /**
     * Gets the capMan__Q4ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4ACaChg__c
     */
    public java.lang.Double getCapMan__Q4ACaChg__c() {
        return capMan__Q4ACaChg__c;
    }


    /**
     * Sets the capMan__Q4ACaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4ACaChg__c
     */
    public void setCapMan__Q4ACaChg__c(java.lang.Double capMan__Q4ACaChg__c) {
        this.capMan__Q4ACaChg__c = capMan__Q4ACaChg__c;
    }


    /**
     * Gets the capMan__Q4ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4ACaOut__c
     */
    public java.lang.Double getCapMan__Q4ACaOut__c() {
        return capMan__Q4ACaOut__c;
    }


    /**
     * Sets the capMan__Q4ACaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4ACaOut__c
     */
    public void setCapMan__Q4ACaOut__c(java.lang.Double capMan__Q4ACaOut__c) {
        this.capMan__Q4ACaOut__c = capMan__Q4ACaOut__c;
    }


    /**
     * Gets the capMan__Q4AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4AEndCa__c
     */
    public java.lang.Double getCapMan__Q4AEndCa__c() {
        return capMan__Q4AEndCa__c;
    }


    /**
     * Sets the capMan__Q4AEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4AEndCa__c
     */
    public void setCapMan__Q4AEndCa__c(java.lang.Double capMan__Q4AEndCa__c) {
        this.capMan__Q4AEndCa__c = capMan__Q4AEndCa__c;
    }


    /**
     * Gets the capMan__Q4AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4AFinCa__c
     */
    public java.lang.Double getCapMan__Q4AFinCa__c() {
        return capMan__Q4AFinCa__c;
    }


    /**
     * Sets the capMan__Q4AFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4AFinCa__c
     */
    public void setCapMan__Q4AFinCa__c(java.lang.Double capMan__Q4AFinCa__c) {
        this.capMan__Q4AFinCa__c = capMan__Q4AFinCa__c;
    }


    /**
     * Gets the capMan__Q4AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4AInvCa__c
     */
    public java.lang.Double getCapMan__Q4AInvCa__c() {
        return capMan__Q4AInvCa__c;
    }


    /**
     * Sets the capMan__Q4AInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4AInvCa__c
     */
    public void setCapMan__Q4AInvCa__c(java.lang.Double capMan__Q4AInvCa__c) {
        this.capMan__Q4AInvCa__c = capMan__Q4AInvCa__c;
    }


    /**
     * Gets the capMan__Q4AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4AOpsCa__c
     */
    public java.lang.Double getCapMan__Q4AOpsCa__c() {
        return capMan__Q4AOpsCa__c;
    }


    /**
     * Sets the capMan__Q4AOpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4AOpsCa__c
     */
    public void setCapMan__Q4AOpsCa__c(java.lang.Double capMan__Q4AOpsCa__c) {
        this.capMan__Q4AOpsCa__c = capMan__Q4AOpsCa__c;
    }


    /**
     * Gets the capMan__Q4AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4AStarCa__c
     */
    public java.lang.Double getCapMan__Q4AStarCa__c() {
        return capMan__Q4AStarCa__c;
    }


    /**
     * Sets the capMan__Q4AStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4AStarCa__c
     */
    public void setCapMan__Q4AStarCa__c(java.lang.Double capMan__Q4AStarCa__c) {
        this.capMan__Q4AStarCa__c = capMan__Q4AStarCa__c;
    }


    /**
     * Gets the capMan__Q4PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4PCaBur__c
     */
    public java.lang.Double getCapMan__Q4PCaBur__c() {
        return capMan__Q4PCaBur__c;
    }


    /**
     * Sets the capMan__Q4PCaBur__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4PCaBur__c
     */
    public void setCapMan__Q4PCaBur__c(java.lang.Double capMan__Q4PCaBur__c) {
        this.capMan__Q4PCaBur__c = capMan__Q4PCaBur__c;
    }


    /**
     * Gets the capMan__Q4PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4PCaChg__c
     */
    public java.lang.Double getCapMan__Q4PCaChg__c() {
        return capMan__Q4PCaChg__c;
    }


    /**
     * Sets the capMan__Q4PCaChg__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4PCaChg__c
     */
    public void setCapMan__Q4PCaChg__c(java.lang.Double capMan__Q4PCaChg__c) {
        this.capMan__Q4PCaChg__c = capMan__Q4PCaChg__c;
    }


    /**
     * Gets the capMan__Q4PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4PCaOut__c
     */
    public java.lang.Double getCapMan__Q4PCaOut__c() {
        return capMan__Q4PCaOut__c;
    }


    /**
     * Sets the capMan__Q4PCaOut__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4PCaOut__c
     */
    public void setCapMan__Q4PCaOut__c(java.lang.Double capMan__Q4PCaOut__c) {
        this.capMan__Q4PCaOut__c = capMan__Q4PCaOut__c;
    }


    /**
     * Gets the capMan__Q4PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4PEndCa__c
     */
    public java.lang.Double getCapMan__Q4PEndCa__c() {
        return capMan__Q4PEndCa__c;
    }


    /**
     * Sets the capMan__Q4PEndCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4PEndCa__c
     */
    public void setCapMan__Q4PEndCa__c(java.lang.Double capMan__Q4PEndCa__c) {
        this.capMan__Q4PEndCa__c = capMan__Q4PEndCa__c;
    }


    /**
     * Gets the capMan__Q4PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4PFinCa__c
     */
    public java.lang.Double getCapMan__Q4PFinCa__c() {
        return capMan__Q4PFinCa__c;
    }


    /**
     * Sets the capMan__Q4PFinCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4PFinCa__c
     */
    public void setCapMan__Q4PFinCa__c(java.lang.Double capMan__Q4PFinCa__c) {
        this.capMan__Q4PFinCa__c = capMan__Q4PFinCa__c;
    }


    /**
     * Gets the capMan__Q4PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4PInvCa__c
     */
    public java.lang.Double getCapMan__Q4PInvCa__c() {
        return capMan__Q4PInvCa__c;
    }


    /**
     * Sets the capMan__Q4PInvCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4PInvCa__c
     */
    public void setCapMan__Q4PInvCa__c(java.lang.Double capMan__Q4PInvCa__c) {
        this.capMan__Q4PInvCa__c = capMan__Q4PInvCa__c;
    }


    /**
     * Gets the capMan__Q4POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4POpsCa__c
     */
    public java.lang.Double getCapMan__Q4POpsCa__c() {
        return capMan__Q4POpsCa__c;
    }


    /**
     * Sets the capMan__Q4POpsCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4POpsCa__c
     */
    public void setCapMan__Q4POpsCa__c(java.lang.Double capMan__Q4POpsCa__c) {
        this.capMan__Q4POpsCa__c = capMan__Q4POpsCa__c;
    }


    /**
     * Gets the capMan__Q4PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Q4PStarCa__c
     */
    public java.lang.Double getCapMan__Q4PStarCa__c() {
        return capMan__Q4PStarCa__c;
    }


    /**
     * Sets the capMan__Q4PStarCa__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Q4PStarCa__c
     */
    public void setCapMan__Q4PStarCa__c(java.lang.Double capMan__Q4PStarCa__c) {
        this.capMan__Q4PStarCa__c = capMan__Q4PStarCa__c;
    }


    /**
     * Gets the capMan__Start_Date__c value for this CapMan__Cash_Flow__c.
     * 
     * @return capMan__Start_Date__c
     */
    public java.util.Date getCapMan__Start_Date__c() {
        return capMan__Start_Date__c;
    }


    /**
     * Sets the capMan__Start_Date__c value for this CapMan__Cash_Flow__c.
     * 
     * @param capMan__Start_Date__c
     */
    public void setCapMan__Start_Date__c(java.util.Date capMan__Start_Date__c) {
        this.capMan__Start_Date__c = capMan__Start_Date__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Cash_Flow__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Cash_Flow__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Cash_Flow__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Cash_Flow__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Cash_Flow__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Cash_Flow__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Cash_Flow__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Cash_Flow__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Cash_Flow__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Cash_Flow__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Cash_Flow__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Cash_Flow__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Cash_Flow__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Cash_Flow__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Cash_Flow__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Cash_Flow__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Cash_Flow__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Cash_Flow__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Cash_Flow__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Cash_Flow__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Cash_Flow__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Cash_Flow__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Cash_Flow__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Cash_Flow__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this CapMan__Cash_Flow__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Cash_Flow__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Cash_Flow__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Cash_Flow__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Cash_Flow__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Cash_Flow__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Cash_Flow__c)) return false;
        CapMan__Cash_Flow__c other = (CapMan__Cash_Flow__c) obj;
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
            ((this.capMan__APCaBur__c==null && other.getCapMan__APCaBur__c()==null) || 
             (this.capMan__APCaBur__c!=null &&
              this.capMan__APCaBur__c.equals(other.getCapMan__APCaBur__c()))) &&
            ((this.capMan__APCaChg__c==null && other.getCapMan__APCaChg__c()==null) || 
             (this.capMan__APCaChg__c!=null &&
              this.capMan__APCaChg__c.equals(other.getCapMan__APCaChg__c()))) &&
            ((this.capMan__APCaOut__c==null && other.getCapMan__APCaOut__c()==null) || 
             (this.capMan__APCaOut__c!=null &&
              this.capMan__APCaOut__c.equals(other.getCapMan__APCaOut__c()))) &&
            ((this.capMan__APEndCa__c==null && other.getCapMan__APEndCa__c()==null) || 
             (this.capMan__APEndCa__c!=null &&
              this.capMan__APEndCa__c.equals(other.getCapMan__APEndCa__c()))) &&
            ((this.capMan__APFinCa__c==null && other.getCapMan__APFinCa__c()==null) || 
             (this.capMan__APFinCa__c!=null &&
              this.capMan__APFinCa__c.equals(other.getCapMan__APFinCa__c()))) &&
            ((this.capMan__APInvCa__c==null && other.getCapMan__APInvCa__c()==null) || 
             (this.capMan__APInvCa__c!=null &&
              this.capMan__APInvCa__c.equals(other.getCapMan__APInvCa__c()))) &&
            ((this.capMan__APOpsCa__c==null && other.getCapMan__APOpsCa__c()==null) || 
             (this.capMan__APOpsCa__c!=null &&
              this.capMan__APOpsCa__c.equals(other.getCapMan__APOpsCa__c()))) &&
            ((this.capMan__APStarCa__c==null && other.getCapMan__APStarCa__c()==null) || 
             (this.capMan__APStarCa__c!=null &&
              this.capMan__APStarCa__c.equals(other.getCapMan__APStarCa__c()))) &&
            ((this.capMan__Account__c==null && other.getCapMan__Account__c()==null) || 
             (this.capMan__Account__c!=null &&
              this.capMan__Account__c.equals(other.getCapMan__Account__c()))) &&
            ((this.capMan__Account__r==null && other.getCapMan__Account__r()==null) || 
             (this.capMan__Account__r!=null &&
              this.capMan__Account__r.equals(other.getCapMan__Account__r()))) &&
            ((this.capMan__End_Date__c==null && other.getCapMan__End_Date__c()==null) || 
             (this.capMan__End_Date__c!=null &&
              this.capMan__End_Date__c.equals(other.getCapMan__End_Date__c()))) &&
            ((this.capMan__FYACaBur__c==null && other.getCapMan__FYACaBur__c()==null) || 
             (this.capMan__FYACaBur__c!=null &&
              this.capMan__FYACaBur__c.equals(other.getCapMan__FYACaBur__c()))) &&
            ((this.capMan__FYACaChg__c==null && other.getCapMan__FYACaChg__c()==null) || 
             (this.capMan__FYACaChg__c!=null &&
              this.capMan__FYACaChg__c.equals(other.getCapMan__FYACaChg__c()))) &&
            ((this.capMan__FYACaOut__c==null && other.getCapMan__FYACaOut__c()==null) || 
             (this.capMan__FYACaOut__c!=null &&
              this.capMan__FYACaOut__c.equals(other.getCapMan__FYACaOut__c()))) &&
            ((this.capMan__FYACaOut_new__c==null && other.getCapMan__FYACaOut_new__c()==null) || 
             (this.capMan__FYACaOut_new__c!=null &&
              this.capMan__FYACaOut_new__c.equals(other.getCapMan__FYACaOut_new__c()))) &&
            ((this.capMan__FYAEndCa__c==null && other.getCapMan__FYAEndCa__c()==null) || 
             (this.capMan__FYAEndCa__c!=null &&
              this.capMan__FYAEndCa__c.equals(other.getCapMan__FYAEndCa__c()))) &&
            ((this.capMan__FYAFinCa__c==null && other.getCapMan__FYAFinCa__c()==null) || 
             (this.capMan__FYAFinCa__c!=null &&
              this.capMan__FYAFinCa__c.equals(other.getCapMan__FYAFinCa__c()))) &&
            ((this.capMan__FYAInvCa__c==null && other.getCapMan__FYAInvCa__c()==null) || 
             (this.capMan__FYAInvCa__c!=null &&
              this.capMan__FYAInvCa__c.equals(other.getCapMan__FYAInvCa__c()))) &&
            ((this.capMan__FYAOpsCa__c==null && other.getCapMan__FYAOpsCa__c()==null) || 
             (this.capMan__FYAOpsCa__c!=null &&
              this.capMan__FYAOpsCa__c.equals(other.getCapMan__FYAOpsCa__c()))) &&
            ((this.capMan__FYAStarCa__c==null && other.getCapMan__FYAStarCa__c()==null) || 
             (this.capMan__FYAStarCa__c!=null &&
              this.capMan__FYAStarCa__c.equals(other.getCapMan__FYAStarCa__c()))) &&
            ((this.capMan__FYPCaBur__c==null && other.getCapMan__FYPCaBur__c()==null) || 
             (this.capMan__FYPCaBur__c!=null &&
              this.capMan__FYPCaBur__c.equals(other.getCapMan__FYPCaBur__c()))) &&
            ((this.capMan__FYPCaChg__c==null && other.getCapMan__FYPCaChg__c()==null) || 
             (this.capMan__FYPCaChg__c!=null &&
              this.capMan__FYPCaChg__c.equals(other.getCapMan__FYPCaChg__c()))) &&
            ((this.capMan__FYPCaOut__c==null && other.getCapMan__FYPCaOut__c()==null) || 
             (this.capMan__FYPCaOut__c!=null &&
              this.capMan__FYPCaOut__c.equals(other.getCapMan__FYPCaOut__c()))) &&
            ((this.capMan__FYPCaOut_new__c==null && other.getCapMan__FYPCaOut_new__c()==null) || 
             (this.capMan__FYPCaOut_new__c!=null &&
              this.capMan__FYPCaOut_new__c.equals(other.getCapMan__FYPCaOut_new__c()))) &&
            ((this.capMan__FYPEndCa__c==null && other.getCapMan__FYPEndCa__c()==null) || 
             (this.capMan__FYPEndCa__c!=null &&
              this.capMan__FYPEndCa__c.equals(other.getCapMan__FYPEndCa__c()))) &&
            ((this.capMan__FYPFinCa__c==null && other.getCapMan__FYPFinCa__c()==null) || 
             (this.capMan__FYPFinCa__c!=null &&
              this.capMan__FYPFinCa__c.equals(other.getCapMan__FYPFinCa__c()))) &&
            ((this.capMan__FYPInvCa__c==null && other.getCapMan__FYPInvCa__c()==null) || 
             (this.capMan__FYPInvCa__c!=null &&
              this.capMan__FYPInvCa__c.equals(other.getCapMan__FYPInvCa__c()))) &&
            ((this.capMan__FYPOpsCa__c==null && other.getCapMan__FYPOpsCa__c()==null) || 
             (this.capMan__FYPOpsCa__c!=null &&
              this.capMan__FYPOpsCa__c.equals(other.getCapMan__FYPOpsCa__c()))) &&
            ((this.capMan__FYPStarCa__c==null && other.getCapMan__FYPStarCa__c()==null) || 
             (this.capMan__FYPStarCa__c!=null &&
              this.capMan__FYPStarCa__c.equals(other.getCapMan__FYPStarCa__c()))) &&
            ((this.capMan__Formula_Start_Date__c==null && other.getCapMan__Formula_Start_Date__c()==null) || 
             (this.capMan__Formula_Start_Date__c!=null &&
              this.capMan__Formula_Start_Date__c.equals(other.getCapMan__Formula_Start_Date__c()))) &&
            ((this.capMan__Q1ACaBur__c==null && other.getCapMan__Q1ACaBur__c()==null) || 
             (this.capMan__Q1ACaBur__c!=null &&
              this.capMan__Q1ACaBur__c.equals(other.getCapMan__Q1ACaBur__c()))) &&
            ((this.capMan__Q1ACaChg__c==null && other.getCapMan__Q1ACaChg__c()==null) || 
             (this.capMan__Q1ACaChg__c!=null &&
              this.capMan__Q1ACaChg__c.equals(other.getCapMan__Q1ACaChg__c()))) &&
            ((this.capMan__Q1ACaOut__c==null && other.getCapMan__Q1ACaOut__c()==null) || 
             (this.capMan__Q1ACaOut__c!=null &&
              this.capMan__Q1ACaOut__c.equals(other.getCapMan__Q1ACaOut__c()))) &&
            ((this.capMan__Q1AEndCa__c==null && other.getCapMan__Q1AEndCa__c()==null) || 
             (this.capMan__Q1AEndCa__c!=null &&
              this.capMan__Q1AEndCa__c.equals(other.getCapMan__Q1AEndCa__c()))) &&
            ((this.capMan__Q1AFinCa__c==null && other.getCapMan__Q1AFinCa__c()==null) || 
             (this.capMan__Q1AFinCa__c!=null &&
              this.capMan__Q1AFinCa__c.equals(other.getCapMan__Q1AFinCa__c()))) &&
            ((this.capMan__Q1AInvCa__c==null && other.getCapMan__Q1AInvCa__c()==null) || 
             (this.capMan__Q1AInvCa__c!=null &&
              this.capMan__Q1AInvCa__c.equals(other.getCapMan__Q1AInvCa__c()))) &&
            ((this.capMan__Q1AOpsCa__c==null && other.getCapMan__Q1AOpsCa__c()==null) || 
             (this.capMan__Q1AOpsCa__c!=null &&
              this.capMan__Q1AOpsCa__c.equals(other.getCapMan__Q1AOpsCa__c()))) &&
            ((this.capMan__Q1AStarCa__c==null && other.getCapMan__Q1AStarCa__c()==null) || 
             (this.capMan__Q1AStarCa__c!=null &&
              this.capMan__Q1AStarCa__c.equals(other.getCapMan__Q1AStarCa__c()))) &&
            ((this.capMan__Q1PCaBur__c==null && other.getCapMan__Q1PCaBur__c()==null) || 
             (this.capMan__Q1PCaBur__c!=null &&
              this.capMan__Q1PCaBur__c.equals(other.getCapMan__Q1PCaBur__c()))) &&
            ((this.capMan__Q1PCaChg__c==null && other.getCapMan__Q1PCaChg__c()==null) || 
             (this.capMan__Q1PCaChg__c!=null &&
              this.capMan__Q1PCaChg__c.equals(other.getCapMan__Q1PCaChg__c()))) &&
            ((this.capMan__Q1PCaOut__c==null && other.getCapMan__Q1PCaOut__c()==null) || 
             (this.capMan__Q1PCaOut__c!=null &&
              this.capMan__Q1PCaOut__c.equals(other.getCapMan__Q1PCaOut__c()))) &&
            ((this.capMan__Q1PEndCa__c==null && other.getCapMan__Q1PEndCa__c()==null) || 
             (this.capMan__Q1PEndCa__c!=null &&
              this.capMan__Q1PEndCa__c.equals(other.getCapMan__Q1PEndCa__c()))) &&
            ((this.capMan__Q1PFinCa__c==null && other.getCapMan__Q1PFinCa__c()==null) || 
             (this.capMan__Q1PFinCa__c!=null &&
              this.capMan__Q1PFinCa__c.equals(other.getCapMan__Q1PFinCa__c()))) &&
            ((this.capMan__Q1PInvCa__c==null && other.getCapMan__Q1PInvCa__c()==null) || 
             (this.capMan__Q1PInvCa__c!=null &&
              this.capMan__Q1PInvCa__c.equals(other.getCapMan__Q1PInvCa__c()))) &&
            ((this.capMan__Q1POpsCa__c==null && other.getCapMan__Q1POpsCa__c()==null) || 
             (this.capMan__Q1POpsCa__c!=null &&
              this.capMan__Q1POpsCa__c.equals(other.getCapMan__Q1POpsCa__c()))) &&
            ((this.capMan__Q1PStarCa__c==null && other.getCapMan__Q1PStarCa__c()==null) || 
             (this.capMan__Q1PStarCa__c!=null &&
              this.capMan__Q1PStarCa__c.equals(other.getCapMan__Q1PStarCa__c()))) &&
            ((this.capMan__Q2ACaBur__c==null && other.getCapMan__Q2ACaBur__c()==null) || 
             (this.capMan__Q2ACaBur__c!=null &&
              this.capMan__Q2ACaBur__c.equals(other.getCapMan__Q2ACaBur__c()))) &&
            ((this.capMan__Q2ACaChg__c==null && other.getCapMan__Q2ACaChg__c()==null) || 
             (this.capMan__Q2ACaChg__c!=null &&
              this.capMan__Q2ACaChg__c.equals(other.getCapMan__Q2ACaChg__c()))) &&
            ((this.capMan__Q2ACaOut__c==null && other.getCapMan__Q2ACaOut__c()==null) || 
             (this.capMan__Q2ACaOut__c!=null &&
              this.capMan__Q2ACaOut__c.equals(other.getCapMan__Q2ACaOut__c()))) &&
            ((this.capMan__Q2AEndCa__c==null && other.getCapMan__Q2AEndCa__c()==null) || 
             (this.capMan__Q2AEndCa__c!=null &&
              this.capMan__Q2AEndCa__c.equals(other.getCapMan__Q2AEndCa__c()))) &&
            ((this.capMan__Q2AFinCa__c==null && other.getCapMan__Q2AFinCa__c()==null) || 
             (this.capMan__Q2AFinCa__c!=null &&
              this.capMan__Q2AFinCa__c.equals(other.getCapMan__Q2AFinCa__c()))) &&
            ((this.capMan__Q2AInvCa__c==null && other.getCapMan__Q2AInvCa__c()==null) || 
             (this.capMan__Q2AInvCa__c!=null &&
              this.capMan__Q2AInvCa__c.equals(other.getCapMan__Q2AInvCa__c()))) &&
            ((this.capMan__Q2AOpsCa__c==null && other.getCapMan__Q2AOpsCa__c()==null) || 
             (this.capMan__Q2AOpsCa__c!=null &&
              this.capMan__Q2AOpsCa__c.equals(other.getCapMan__Q2AOpsCa__c()))) &&
            ((this.capMan__Q2AStarCa__c==null && other.getCapMan__Q2AStarCa__c()==null) || 
             (this.capMan__Q2AStarCa__c!=null &&
              this.capMan__Q2AStarCa__c.equals(other.getCapMan__Q2AStarCa__c()))) &&
            ((this.capMan__Q2PCaBur__c==null && other.getCapMan__Q2PCaBur__c()==null) || 
             (this.capMan__Q2PCaBur__c!=null &&
              this.capMan__Q2PCaBur__c.equals(other.getCapMan__Q2PCaBur__c()))) &&
            ((this.capMan__Q2PCaChg__c==null && other.getCapMan__Q2PCaChg__c()==null) || 
             (this.capMan__Q2PCaChg__c!=null &&
              this.capMan__Q2PCaChg__c.equals(other.getCapMan__Q2PCaChg__c()))) &&
            ((this.capMan__Q2PCaOut__c==null && other.getCapMan__Q2PCaOut__c()==null) || 
             (this.capMan__Q2PCaOut__c!=null &&
              this.capMan__Q2PCaOut__c.equals(other.getCapMan__Q2PCaOut__c()))) &&
            ((this.capMan__Q2PEndCa__c==null && other.getCapMan__Q2PEndCa__c()==null) || 
             (this.capMan__Q2PEndCa__c!=null &&
              this.capMan__Q2PEndCa__c.equals(other.getCapMan__Q2PEndCa__c()))) &&
            ((this.capMan__Q2PFinCa__c==null && other.getCapMan__Q2PFinCa__c()==null) || 
             (this.capMan__Q2PFinCa__c!=null &&
              this.capMan__Q2PFinCa__c.equals(other.getCapMan__Q2PFinCa__c()))) &&
            ((this.capMan__Q2PInvCa__c==null && other.getCapMan__Q2PInvCa__c()==null) || 
             (this.capMan__Q2PInvCa__c!=null &&
              this.capMan__Q2PInvCa__c.equals(other.getCapMan__Q2PInvCa__c()))) &&
            ((this.capMan__Q2POpsCa__c==null && other.getCapMan__Q2POpsCa__c()==null) || 
             (this.capMan__Q2POpsCa__c!=null &&
              this.capMan__Q2POpsCa__c.equals(other.getCapMan__Q2POpsCa__c()))) &&
            ((this.capMan__Q2PStarCa__c==null && other.getCapMan__Q2PStarCa__c()==null) || 
             (this.capMan__Q2PStarCa__c!=null &&
              this.capMan__Q2PStarCa__c.equals(other.getCapMan__Q2PStarCa__c()))) &&
            ((this.capMan__Q3ACaBur__c==null && other.getCapMan__Q3ACaBur__c()==null) || 
             (this.capMan__Q3ACaBur__c!=null &&
              this.capMan__Q3ACaBur__c.equals(other.getCapMan__Q3ACaBur__c()))) &&
            ((this.capMan__Q3ACaChg__c==null && other.getCapMan__Q3ACaChg__c()==null) || 
             (this.capMan__Q3ACaChg__c!=null &&
              this.capMan__Q3ACaChg__c.equals(other.getCapMan__Q3ACaChg__c()))) &&
            ((this.capMan__Q3ACaOut__c==null && other.getCapMan__Q3ACaOut__c()==null) || 
             (this.capMan__Q3ACaOut__c!=null &&
              this.capMan__Q3ACaOut__c.equals(other.getCapMan__Q3ACaOut__c()))) &&
            ((this.capMan__Q3AEndCa__c==null && other.getCapMan__Q3AEndCa__c()==null) || 
             (this.capMan__Q3AEndCa__c!=null &&
              this.capMan__Q3AEndCa__c.equals(other.getCapMan__Q3AEndCa__c()))) &&
            ((this.capMan__Q3AFinCa__c==null && other.getCapMan__Q3AFinCa__c()==null) || 
             (this.capMan__Q3AFinCa__c!=null &&
              this.capMan__Q3AFinCa__c.equals(other.getCapMan__Q3AFinCa__c()))) &&
            ((this.capMan__Q3AInvCa__c==null && other.getCapMan__Q3AInvCa__c()==null) || 
             (this.capMan__Q3AInvCa__c!=null &&
              this.capMan__Q3AInvCa__c.equals(other.getCapMan__Q3AInvCa__c()))) &&
            ((this.capMan__Q3AOpsCa__c==null && other.getCapMan__Q3AOpsCa__c()==null) || 
             (this.capMan__Q3AOpsCa__c!=null &&
              this.capMan__Q3AOpsCa__c.equals(other.getCapMan__Q3AOpsCa__c()))) &&
            ((this.capMan__Q3AStarCa__c==null && other.getCapMan__Q3AStarCa__c()==null) || 
             (this.capMan__Q3AStarCa__c!=null &&
              this.capMan__Q3AStarCa__c.equals(other.getCapMan__Q3AStarCa__c()))) &&
            ((this.capMan__Q3PCaBur__c==null && other.getCapMan__Q3PCaBur__c()==null) || 
             (this.capMan__Q3PCaBur__c!=null &&
              this.capMan__Q3PCaBur__c.equals(other.getCapMan__Q3PCaBur__c()))) &&
            ((this.capMan__Q3PCaChg__c==null && other.getCapMan__Q3PCaChg__c()==null) || 
             (this.capMan__Q3PCaChg__c!=null &&
              this.capMan__Q3PCaChg__c.equals(other.getCapMan__Q3PCaChg__c()))) &&
            ((this.capMan__Q3PCaOut__c==null && other.getCapMan__Q3PCaOut__c()==null) || 
             (this.capMan__Q3PCaOut__c!=null &&
              this.capMan__Q3PCaOut__c.equals(other.getCapMan__Q3PCaOut__c()))) &&
            ((this.capMan__Q3PEndCa__c==null && other.getCapMan__Q3PEndCa__c()==null) || 
             (this.capMan__Q3PEndCa__c!=null &&
              this.capMan__Q3PEndCa__c.equals(other.getCapMan__Q3PEndCa__c()))) &&
            ((this.capMan__Q3PFinCa__c==null && other.getCapMan__Q3PFinCa__c()==null) || 
             (this.capMan__Q3PFinCa__c!=null &&
              this.capMan__Q3PFinCa__c.equals(other.getCapMan__Q3PFinCa__c()))) &&
            ((this.capMan__Q3PInvCa__c==null && other.getCapMan__Q3PInvCa__c()==null) || 
             (this.capMan__Q3PInvCa__c!=null &&
              this.capMan__Q3PInvCa__c.equals(other.getCapMan__Q3PInvCa__c()))) &&
            ((this.capMan__Q3POpsCa__c==null && other.getCapMan__Q3POpsCa__c()==null) || 
             (this.capMan__Q3POpsCa__c!=null &&
              this.capMan__Q3POpsCa__c.equals(other.getCapMan__Q3POpsCa__c()))) &&
            ((this.capMan__Q3PStarCa__c==null && other.getCapMan__Q3PStarCa__c()==null) || 
             (this.capMan__Q3PStarCa__c!=null &&
              this.capMan__Q3PStarCa__c.equals(other.getCapMan__Q3PStarCa__c()))) &&
            ((this.capMan__Q4ACaBur__c==null && other.getCapMan__Q4ACaBur__c()==null) || 
             (this.capMan__Q4ACaBur__c!=null &&
              this.capMan__Q4ACaBur__c.equals(other.getCapMan__Q4ACaBur__c()))) &&
            ((this.capMan__Q4ACaChg__c==null && other.getCapMan__Q4ACaChg__c()==null) || 
             (this.capMan__Q4ACaChg__c!=null &&
              this.capMan__Q4ACaChg__c.equals(other.getCapMan__Q4ACaChg__c()))) &&
            ((this.capMan__Q4ACaOut__c==null && other.getCapMan__Q4ACaOut__c()==null) || 
             (this.capMan__Q4ACaOut__c!=null &&
              this.capMan__Q4ACaOut__c.equals(other.getCapMan__Q4ACaOut__c()))) &&
            ((this.capMan__Q4AEndCa__c==null && other.getCapMan__Q4AEndCa__c()==null) || 
             (this.capMan__Q4AEndCa__c!=null &&
              this.capMan__Q4AEndCa__c.equals(other.getCapMan__Q4AEndCa__c()))) &&
            ((this.capMan__Q4AFinCa__c==null && other.getCapMan__Q4AFinCa__c()==null) || 
             (this.capMan__Q4AFinCa__c!=null &&
              this.capMan__Q4AFinCa__c.equals(other.getCapMan__Q4AFinCa__c()))) &&
            ((this.capMan__Q4AInvCa__c==null && other.getCapMan__Q4AInvCa__c()==null) || 
             (this.capMan__Q4AInvCa__c!=null &&
              this.capMan__Q4AInvCa__c.equals(other.getCapMan__Q4AInvCa__c()))) &&
            ((this.capMan__Q4AOpsCa__c==null && other.getCapMan__Q4AOpsCa__c()==null) || 
             (this.capMan__Q4AOpsCa__c!=null &&
              this.capMan__Q4AOpsCa__c.equals(other.getCapMan__Q4AOpsCa__c()))) &&
            ((this.capMan__Q4AStarCa__c==null && other.getCapMan__Q4AStarCa__c()==null) || 
             (this.capMan__Q4AStarCa__c!=null &&
              this.capMan__Q4AStarCa__c.equals(other.getCapMan__Q4AStarCa__c()))) &&
            ((this.capMan__Q4PCaBur__c==null && other.getCapMan__Q4PCaBur__c()==null) || 
             (this.capMan__Q4PCaBur__c!=null &&
              this.capMan__Q4PCaBur__c.equals(other.getCapMan__Q4PCaBur__c()))) &&
            ((this.capMan__Q4PCaChg__c==null && other.getCapMan__Q4PCaChg__c()==null) || 
             (this.capMan__Q4PCaChg__c!=null &&
              this.capMan__Q4PCaChg__c.equals(other.getCapMan__Q4PCaChg__c()))) &&
            ((this.capMan__Q4PCaOut__c==null && other.getCapMan__Q4PCaOut__c()==null) || 
             (this.capMan__Q4PCaOut__c!=null &&
              this.capMan__Q4PCaOut__c.equals(other.getCapMan__Q4PCaOut__c()))) &&
            ((this.capMan__Q4PEndCa__c==null && other.getCapMan__Q4PEndCa__c()==null) || 
             (this.capMan__Q4PEndCa__c!=null &&
              this.capMan__Q4PEndCa__c.equals(other.getCapMan__Q4PEndCa__c()))) &&
            ((this.capMan__Q4PFinCa__c==null && other.getCapMan__Q4PFinCa__c()==null) || 
             (this.capMan__Q4PFinCa__c!=null &&
              this.capMan__Q4PFinCa__c.equals(other.getCapMan__Q4PFinCa__c()))) &&
            ((this.capMan__Q4PInvCa__c==null && other.getCapMan__Q4PInvCa__c()==null) || 
             (this.capMan__Q4PInvCa__c!=null &&
              this.capMan__Q4PInvCa__c.equals(other.getCapMan__Q4PInvCa__c()))) &&
            ((this.capMan__Q4POpsCa__c==null && other.getCapMan__Q4POpsCa__c()==null) || 
             (this.capMan__Q4POpsCa__c!=null &&
              this.capMan__Q4POpsCa__c.equals(other.getCapMan__Q4POpsCa__c()))) &&
            ((this.capMan__Q4PStarCa__c==null && other.getCapMan__Q4PStarCa__c()==null) || 
             (this.capMan__Q4PStarCa__c!=null &&
              this.capMan__Q4PStarCa__c.equals(other.getCapMan__Q4PStarCa__c()))) &&
            ((this.capMan__Start_Date__c==null && other.getCapMan__Start_Date__c()==null) || 
             (this.capMan__Start_Date__c!=null &&
              this.capMan__Start_Date__c.equals(other.getCapMan__Start_Date__c()))) &&
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
        if (getCapMan__APCaBur__c() != null) {
            _hashCode += getCapMan__APCaBur__c().hashCode();
        }
        if (getCapMan__APCaChg__c() != null) {
            _hashCode += getCapMan__APCaChg__c().hashCode();
        }
        if (getCapMan__APCaOut__c() != null) {
            _hashCode += getCapMan__APCaOut__c().hashCode();
        }
        if (getCapMan__APEndCa__c() != null) {
            _hashCode += getCapMan__APEndCa__c().hashCode();
        }
        if (getCapMan__APFinCa__c() != null) {
            _hashCode += getCapMan__APFinCa__c().hashCode();
        }
        if (getCapMan__APInvCa__c() != null) {
            _hashCode += getCapMan__APInvCa__c().hashCode();
        }
        if (getCapMan__APOpsCa__c() != null) {
            _hashCode += getCapMan__APOpsCa__c().hashCode();
        }
        if (getCapMan__APStarCa__c() != null) {
            _hashCode += getCapMan__APStarCa__c().hashCode();
        }
        if (getCapMan__Account__c() != null) {
            _hashCode += getCapMan__Account__c().hashCode();
        }
        if (getCapMan__Account__r() != null) {
            _hashCode += getCapMan__Account__r().hashCode();
        }
        if (getCapMan__End_Date__c() != null) {
            _hashCode += getCapMan__End_Date__c().hashCode();
        }
        if (getCapMan__FYACaBur__c() != null) {
            _hashCode += getCapMan__FYACaBur__c().hashCode();
        }
        if (getCapMan__FYACaChg__c() != null) {
            _hashCode += getCapMan__FYACaChg__c().hashCode();
        }
        if (getCapMan__FYACaOut__c() != null) {
            _hashCode += getCapMan__FYACaOut__c().hashCode();
        }
        if (getCapMan__FYACaOut_new__c() != null) {
            _hashCode += getCapMan__FYACaOut_new__c().hashCode();
        }
        if (getCapMan__FYAEndCa__c() != null) {
            _hashCode += getCapMan__FYAEndCa__c().hashCode();
        }
        if (getCapMan__FYAFinCa__c() != null) {
            _hashCode += getCapMan__FYAFinCa__c().hashCode();
        }
        if (getCapMan__FYAInvCa__c() != null) {
            _hashCode += getCapMan__FYAInvCa__c().hashCode();
        }
        if (getCapMan__FYAOpsCa__c() != null) {
            _hashCode += getCapMan__FYAOpsCa__c().hashCode();
        }
        if (getCapMan__FYAStarCa__c() != null) {
            _hashCode += getCapMan__FYAStarCa__c().hashCode();
        }
        if (getCapMan__FYPCaBur__c() != null) {
            _hashCode += getCapMan__FYPCaBur__c().hashCode();
        }
        if (getCapMan__FYPCaChg__c() != null) {
            _hashCode += getCapMan__FYPCaChg__c().hashCode();
        }
        if (getCapMan__FYPCaOut__c() != null) {
            _hashCode += getCapMan__FYPCaOut__c().hashCode();
        }
        if (getCapMan__FYPCaOut_new__c() != null) {
            _hashCode += getCapMan__FYPCaOut_new__c().hashCode();
        }
        if (getCapMan__FYPEndCa__c() != null) {
            _hashCode += getCapMan__FYPEndCa__c().hashCode();
        }
        if (getCapMan__FYPFinCa__c() != null) {
            _hashCode += getCapMan__FYPFinCa__c().hashCode();
        }
        if (getCapMan__FYPInvCa__c() != null) {
            _hashCode += getCapMan__FYPInvCa__c().hashCode();
        }
        if (getCapMan__FYPOpsCa__c() != null) {
            _hashCode += getCapMan__FYPOpsCa__c().hashCode();
        }
        if (getCapMan__FYPStarCa__c() != null) {
            _hashCode += getCapMan__FYPStarCa__c().hashCode();
        }
        if (getCapMan__Formula_Start_Date__c() != null) {
            _hashCode += getCapMan__Formula_Start_Date__c().hashCode();
        }
        if (getCapMan__Q1ACaBur__c() != null) {
            _hashCode += getCapMan__Q1ACaBur__c().hashCode();
        }
        if (getCapMan__Q1ACaChg__c() != null) {
            _hashCode += getCapMan__Q1ACaChg__c().hashCode();
        }
        if (getCapMan__Q1ACaOut__c() != null) {
            _hashCode += getCapMan__Q1ACaOut__c().hashCode();
        }
        if (getCapMan__Q1AEndCa__c() != null) {
            _hashCode += getCapMan__Q1AEndCa__c().hashCode();
        }
        if (getCapMan__Q1AFinCa__c() != null) {
            _hashCode += getCapMan__Q1AFinCa__c().hashCode();
        }
        if (getCapMan__Q1AInvCa__c() != null) {
            _hashCode += getCapMan__Q1AInvCa__c().hashCode();
        }
        if (getCapMan__Q1AOpsCa__c() != null) {
            _hashCode += getCapMan__Q1AOpsCa__c().hashCode();
        }
        if (getCapMan__Q1AStarCa__c() != null) {
            _hashCode += getCapMan__Q1AStarCa__c().hashCode();
        }
        if (getCapMan__Q1PCaBur__c() != null) {
            _hashCode += getCapMan__Q1PCaBur__c().hashCode();
        }
        if (getCapMan__Q1PCaChg__c() != null) {
            _hashCode += getCapMan__Q1PCaChg__c().hashCode();
        }
        if (getCapMan__Q1PCaOut__c() != null) {
            _hashCode += getCapMan__Q1PCaOut__c().hashCode();
        }
        if (getCapMan__Q1PEndCa__c() != null) {
            _hashCode += getCapMan__Q1PEndCa__c().hashCode();
        }
        if (getCapMan__Q1PFinCa__c() != null) {
            _hashCode += getCapMan__Q1PFinCa__c().hashCode();
        }
        if (getCapMan__Q1PInvCa__c() != null) {
            _hashCode += getCapMan__Q1PInvCa__c().hashCode();
        }
        if (getCapMan__Q1POpsCa__c() != null) {
            _hashCode += getCapMan__Q1POpsCa__c().hashCode();
        }
        if (getCapMan__Q1PStarCa__c() != null) {
            _hashCode += getCapMan__Q1PStarCa__c().hashCode();
        }
        if (getCapMan__Q2ACaBur__c() != null) {
            _hashCode += getCapMan__Q2ACaBur__c().hashCode();
        }
        if (getCapMan__Q2ACaChg__c() != null) {
            _hashCode += getCapMan__Q2ACaChg__c().hashCode();
        }
        if (getCapMan__Q2ACaOut__c() != null) {
            _hashCode += getCapMan__Q2ACaOut__c().hashCode();
        }
        if (getCapMan__Q2AEndCa__c() != null) {
            _hashCode += getCapMan__Q2AEndCa__c().hashCode();
        }
        if (getCapMan__Q2AFinCa__c() != null) {
            _hashCode += getCapMan__Q2AFinCa__c().hashCode();
        }
        if (getCapMan__Q2AInvCa__c() != null) {
            _hashCode += getCapMan__Q2AInvCa__c().hashCode();
        }
        if (getCapMan__Q2AOpsCa__c() != null) {
            _hashCode += getCapMan__Q2AOpsCa__c().hashCode();
        }
        if (getCapMan__Q2AStarCa__c() != null) {
            _hashCode += getCapMan__Q2AStarCa__c().hashCode();
        }
        if (getCapMan__Q2PCaBur__c() != null) {
            _hashCode += getCapMan__Q2PCaBur__c().hashCode();
        }
        if (getCapMan__Q2PCaChg__c() != null) {
            _hashCode += getCapMan__Q2PCaChg__c().hashCode();
        }
        if (getCapMan__Q2PCaOut__c() != null) {
            _hashCode += getCapMan__Q2PCaOut__c().hashCode();
        }
        if (getCapMan__Q2PEndCa__c() != null) {
            _hashCode += getCapMan__Q2PEndCa__c().hashCode();
        }
        if (getCapMan__Q2PFinCa__c() != null) {
            _hashCode += getCapMan__Q2PFinCa__c().hashCode();
        }
        if (getCapMan__Q2PInvCa__c() != null) {
            _hashCode += getCapMan__Q2PInvCa__c().hashCode();
        }
        if (getCapMan__Q2POpsCa__c() != null) {
            _hashCode += getCapMan__Q2POpsCa__c().hashCode();
        }
        if (getCapMan__Q2PStarCa__c() != null) {
            _hashCode += getCapMan__Q2PStarCa__c().hashCode();
        }
        if (getCapMan__Q3ACaBur__c() != null) {
            _hashCode += getCapMan__Q3ACaBur__c().hashCode();
        }
        if (getCapMan__Q3ACaChg__c() != null) {
            _hashCode += getCapMan__Q3ACaChg__c().hashCode();
        }
        if (getCapMan__Q3ACaOut__c() != null) {
            _hashCode += getCapMan__Q3ACaOut__c().hashCode();
        }
        if (getCapMan__Q3AEndCa__c() != null) {
            _hashCode += getCapMan__Q3AEndCa__c().hashCode();
        }
        if (getCapMan__Q3AFinCa__c() != null) {
            _hashCode += getCapMan__Q3AFinCa__c().hashCode();
        }
        if (getCapMan__Q3AInvCa__c() != null) {
            _hashCode += getCapMan__Q3AInvCa__c().hashCode();
        }
        if (getCapMan__Q3AOpsCa__c() != null) {
            _hashCode += getCapMan__Q3AOpsCa__c().hashCode();
        }
        if (getCapMan__Q3AStarCa__c() != null) {
            _hashCode += getCapMan__Q3AStarCa__c().hashCode();
        }
        if (getCapMan__Q3PCaBur__c() != null) {
            _hashCode += getCapMan__Q3PCaBur__c().hashCode();
        }
        if (getCapMan__Q3PCaChg__c() != null) {
            _hashCode += getCapMan__Q3PCaChg__c().hashCode();
        }
        if (getCapMan__Q3PCaOut__c() != null) {
            _hashCode += getCapMan__Q3PCaOut__c().hashCode();
        }
        if (getCapMan__Q3PEndCa__c() != null) {
            _hashCode += getCapMan__Q3PEndCa__c().hashCode();
        }
        if (getCapMan__Q3PFinCa__c() != null) {
            _hashCode += getCapMan__Q3PFinCa__c().hashCode();
        }
        if (getCapMan__Q3PInvCa__c() != null) {
            _hashCode += getCapMan__Q3PInvCa__c().hashCode();
        }
        if (getCapMan__Q3POpsCa__c() != null) {
            _hashCode += getCapMan__Q3POpsCa__c().hashCode();
        }
        if (getCapMan__Q3PStarCa__c() != null) {
            _hashCode += getCapMan__Q3PStarCa__c().hashCode();
        }
        if (getCapMan__Q4ACaBur__c() != null) {
            _hashCode += getCapMan__Q4ACaBur__c().hashCode();
        }
        if (getCapMan__Q4ACaChg__c() != null) {
            _hashCode += getCapMan__Q4ACaChg__c().hashCode();
        }
        if (getCapMan__Q4ACaOut__c() != null) {
            _hashCode += getCapMan__Q4ACaOut__c().hashCode();
        }
        if (getCapMan__Q4AEndCa__c() != null) {
            _hashCode += getCapMan__Q4AEndCa__c().hashCode();
        }
        if (getCapMan__Q4AFinCa__c() != null) {
            _hashCode += getCapMan__Q4AFinCa__c().hashCode();
        }
        if (getCapMan__Q4AInvCa__c() != null) {
            _hashCode += getCapMan__Q4AInvCa__c().hashCode();
        }
        if (getCapMan__Q4AOpsCa__c() != null) {
            _hashCode += getCapMan__Q4AOpsCa__c().hashCode();
        }
        if (getCapMan__Q4AStarCa__c() != null) {
            _hashCode += getCapMan__Q4AStarCa__c().hashCode();
        }
        if (getCapMan__Q4PCaBur__c() != null) {
            _hashCode += getCapMan__Q4PCaBur__c().hashCode();
        }
        if (getCapMan__Q4PCaChg__c() != null) {
            _hashCode += getCapMan__Q4PCaChg__c().hashCode();
        }
        if (getCapMan__Q4PCaOut__c() != null) {
            _hashCode += getCapMan__Q4PCaOut__c().hashCode();
        }
        if (getCapMan__Q4PEndCa__c() != null) {
            _hashCode += getCapMan__Q4PEndCa__c().hashCode();
        }
        if (getCapMan__Q4PFinCa__c() != null) {
            _hashCode += getCapMan__Q4PFinCa__c().hashCode();
        }
        if (getCapMan__Q4PInvCa__c() != null) {
            _hashCode += getCapMan__Q4PInvCa__c().hashCode();
        }
        if (getCapMan__Q4POpsCa__c() != null) {
            _hashCode += getCapMan__Q4POpsCa__c().hashCode();
        }
        if (getCapMan__Q4PStarCa__c() != null) {
            _hashCode += getCapMan__Q4PStarCa__c().hashCode();
        }
        if (getCapMan__Start_Date__c() != null) {
            _hashCode += getCapMan__Start_Date__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Cash_Flow__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Cash_Flow__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APCaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APCaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APCaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APCaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APCaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APCaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APOpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APOpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__APStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__APStarCa__c"));
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
        elemField.setFieldName("capMan__End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYACaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYACaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYACaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYACaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYACaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYACaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYACaOut_new__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYACaOut_new__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAOpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAOpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYAStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYAStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPCaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPCaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPCaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPCaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPCaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPCaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPCaOut_new__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPCaOut_new__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPOpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPOpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FYPStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FYPStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Q1ACaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ACaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ACaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ACaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1ACaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1ACaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AOpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AOpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1AStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1AStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PCaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PCaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PCaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PCaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PCaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PCaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1POpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1POpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1PStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1PStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ACaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ACaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ACaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ACaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2ACaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2ACaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AOpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AOpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2AStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2AStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PCaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PCaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PCaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PCaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PCaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PCaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2POpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2POpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2PStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2PStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ACaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ACaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ACaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ACaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3ACaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3ACaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AOpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AOpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3AStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3AStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PCaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PCaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PCaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PCaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PCaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PCaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3POpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3POpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3PStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3PStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ACaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ACaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ACaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ACaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4ACaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4ACaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AOpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AOpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4AStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4AStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PCaBur__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PCaBur__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PCaChg__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PCaChg__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PCaOut__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PCaOut__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PEndCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PEndCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PFinCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PFinCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PInvCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PInvCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4POpsCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4POpsCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4PStarCa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4PStarCa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
