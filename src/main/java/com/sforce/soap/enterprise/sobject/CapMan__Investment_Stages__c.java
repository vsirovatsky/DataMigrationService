/**
 * CapMan__Investment_Stages__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Investment_Stages__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__AllocatedShares__c;

    private java.lang.String capMan__Comments__c;

    private java.lang.Double capMan__Commitment__c;

    private java.lang.Boolean capMan__Converted__c;

    private java.lang.String capMan__Email__c;

    private java.util.Date capMan__Expiration__c;

    private java.lang.Double capMan__FullName__c;

    private java.lang.String capMan__Funding_Milestone__c;

    private java.lang.String capMan__Fundraising__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c capMan__Fundraising__r;

    private java.lang.String capMan__Investor__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Investor__r;

    private java.lang.Boolean capMan__Lead_Investor__c;

    private java.lang.Double capMan__Maximum__c;

    private java.lang.Double capMan__Minimum__c;

    private java.lang.String capMan__MobilePhone__c;

    private java.lang.String capMan__Pipeline_Status__c;

    private java.lang.Double capMan__Prerequisites__c;

    private java.lang.Boolean capMan__Registered__c;

    private java.lang.String capMan__RelationshipLead__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__RelationshipLead__r;

    private java.lang.String capMan__Relationship_Mgr__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Relationship_Mgr__r;

    private java.util.Date capMan__SalesStageDate__c;

    private java.lang.String capMan__SalesStage__c;

    private java.lang.Double capMan__SharesAllocated__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currencyIsoCode;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public CapMan__Investment_Stages__c() {
    }

    public CapMan__Investment_Stages__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__AllocatedShares__c,
           java.lang.String capMan__Comments__c,
           java.lang.Double capMan__Commitment__c,
           java.lang.Boolean capMan__Converted__c,
           java.lang.String capMan__Email__c,
           java.util.Date capMan__Expiration__c,
           java.lang.Double capMan__FullName__c,
           java.lang.String capMan__Funding_Milestone__c,
           java.lang.String capMan__Fundraising__c,
           com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c capMan__Fundraising__r,
           java.lang.String capMan__Investor__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Investor__r,
           java.lang.Boolean capMan__Lead_Investor__c,
           java.lang.Double capMan__Maximum__c,
           java.lang.Double capMan__Minimum__c,
           java.lang.String capMan__MobilePhone__c,
           java.lang.String capMan__Pipeline_Status__c,
           java.lang.Double capMan__Prerequisites__c,
           java.lang.Boolean capMan__Registered__c,
           java.lang.String capMan__RelationshipLead__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__RelationshipLead__r,
           java.lang.String capMan__Relationship_Mgr__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Relationship_Mgr__r,
           java.util.Date capMan__SalesStageDate__c,
           java.lang.String capMan__SalesStage__c,
           java.lang.Double capMan__SharesAllocated__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currencyIsoCode,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.capMan__AllocatedShares__c = capMan__AllocatedShares__c;
        this.capMan__Comments__c = capMan__Comments__c;
        this.capMan__Commitment__c = capMan__Commitment__c;
        this.capMan__Converted__c = capMan__Converted__c;
        this.capMan__Email__c = capMan__Email__c;
        this.capMan__Expiration__c = capMan__Expiration__c;
        this.capMan__FullName__c = capMan__FullName__c;
        this.capMan__Funding_Milestone__c = capMan__Funding_Milestone__c;
        this.capMan__Fundraising__c = capMan__Fundraising__c;
        this.capMan__Fundraising__r = capMan__Fundraising__r;
        this.capMan__Investor__c = capMan__Investor__c;
        this.capMan__Investor__r = capMan__Investor__r;
        this.capMan__Lead_Investor__c = capMan__Lead_Investor__c;
        this.capMan__Maximum__c = capMan__Maximum__c;
        this.capMan__Minimum__c = capMan__Minimum__c;
        this.capMan__MobilePhone__c = capMan__MobilePhone__c;
        this.capMan__Pipeline_Status__c = capMan__Pipeline_Status__c;
        this.capMan__Prerequisites__c = capMan__Prerequisites__c;
        this.capMan__Registered__c = capMan__Registered__c;
        this.capMan__RelationshipLead__c = capMan__RelationshipLead__c;
        this.capMan__RelationshipLead__r = capMan__RelationshipLead__r;
        this.capMan__Relationship_Mgr__c = capMan__Relationship_Mgr__c;
        this.capMan__Relationship_Mgr__r = capMan__Relationship_Mgr__r;
        this.capMan__SalesStageDate__c = capMan__SalesStageDate__c;
        this.capMan__SalesStage__c = capMan__SalesStage__c;
        this.capMan__SharesAllocated__c = capMan__SharesAllocated__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currencyIsoCode = currencyIsoCode;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this CapMan__Investment_Stages__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__Investment_Stages__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__Investment_Stages__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Investment_Stages__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__AllocatedShares__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__AllocatedShares__c
     */
    public java.lang.Double getCapMan__AllocatedShares__c() {
        return capMan__AllocatedShares__c;
    }


    /**
     * Sets the capMan__AllocatedShares__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__AllocatedShares__c
     */
    public void setCapMan__AllocatedShares__c(java.lang.Double capMan__AllocatedShares__c) {
        this.capMan__AllocatedShares__c = capMan__AllocatedShares__c;
    }


    /**
     * Gets the capMan__Comments__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Comments__c
     */
    public java.lang.String getCapMan__Comments__c() {
        return capMan__Comments__c;
    }


    /**
     * Sets the capMan__Comments__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Comments__c
     */
    public void setCapMan__Comments__c(java.lang.String capMan__Comments__c) {
        this.capMan__Comments__c = capMan__Comments__c;
    }


    /**
     * Gets the capMan__Commitment__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Commitment__c
     */
    public java.lang.Double getCapMan__Commitment__c() {
        return capMan__Commitment__c;
    }


    /**
     * Sets the capMan__Commitment__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Commitment__c
     */
    public void setCapMan__Commitment__c(java.lang.Double capMan__Commitment__c) {
        this.capMan__Commitment__c = capMan__Commitment__c;
    }


    /**
     * Gets the capMan__Converted__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Converted__c
     */
    public java.lang.Boolean getCapMan__Converted__c() {
        return capMan__Converted__c;
    }


    /**
     * Sets the capMan__Converted__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Converted__c
     */
    public void setCapMan__Converted__c(java.lang.Boolean capMan__Converted__c) {
        this.capMan__Converted__c = capMan__Converted__c;
    }


    /**
     * Gets the capMan__Email__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Email__c
     */
    public java.lang.String getCapMan__Email__c() {
        return capMan__Email__c;
    }


    /**
     * Sets the capMan__Email__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Email__c
     */
    public void setCapMan__Email__c(java.lang.String capMan__Email__c) {
        this.capMan__Email__c = capMan__Email__c;
    }


    /**
     * Gets the capMan__Expiration__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Expiration__c
     */
    public java.util.Date getCapMan__Expiration__c() {
        return capMan__Expiration__c;
    }


    /**
     * Sets the capMan__Expiration__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Expiration__c
     */
    public void setCapMan__Expiration__c(java.util.Date capMan__Expiration__c) {
        this.capMan__Expiration__c = capMan__Expiration__c;
    }


    /**
     * Gets the capMan__FullName__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__FullName__c
     */
    public java.lang.Double getCapMan__FullName__c() {
        return capMan__FullName__c;
    }


    /**
     * Sets the capMan__FullName__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__FullName__c
     */
    public void setCapMan__FullName__c(java.lang.Double capMan__FullName__c) {
        this.capMan__FullName__c = capMan__FullName__c;
    }


    /**
     * Gets the capMan__Funding_Milestone__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Funding_Milestone__c
     */
    public java.lang.String getCapMan__Funding_Milestone__c() {
        return capMan__Funding_Milestone__c;
    }


    /**
     * Sets the capMan__Funding_Milestone__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Funding_Milestone__c
     */
    public void setCapMan__Funding_Milestone__c(java.lang.String capMan__Funding_Milestone__c) {
        this.capMan__Funding_Milestone__c = capMan__Funding_Milestone__c;
    }


    /**
     * Gets the capMan__Fundraising__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Fundraising__c
     */
    public java.lang.String getCapMan__Fundraising__c() {
        return capMan__Fundraising__c;
    }


    /**
     * Sets the capMan__Fundraising__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Fundraising__c
     */
    public void setCapMan__Fundraising__c(java.lang.String capMan__Fundraising__c) {
        this.capMan__Fundraising__c = capMan__Fundraising__c;
    }


    /**
     * Gets the capMan__Fundraising__r value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Fundraising__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c getCapMan__Fundraising__r() {
        return capMan__Fundraising__r;
    }


    /**
     * Sets the capMan__Fundraising__r value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Fundraising__r
     */
    public void setCapMan__Fundraising__r(com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c capMan__Fundraising__r) {
        this.capMan__Fundraising__r = capMan__Fundraising__r;
    }


    /**
     * Gets the capMan__Investor__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Investor__c
     */
    public java.lang.String getCapMan__Investor__c() {
        return capMan__Investor__c;
    }


    /**
     * Sets the capMan__Investor__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Investor__c
     */
    public void setCapMan__Investor__c(java.lang.String capMan__Investor__c) {
        this.capMan__Investor__c = capMan__Investor__c;
    }


    /**
     * Gets the capMan__Investor__r value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Investor__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getCapMan__Investor__r() {
        return capMan__Investor__r;
    }


    /**
     * Sets the capMan__Investor__r value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Investor__r
     */
    public void setCapMan__Investor__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Investor__r) {
        this.capMan__Investor__r = capMan__Investor__r;
    }


    /**
     * Gets the capMan__Lead_Investor__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Lead_Investor__c
     */
    public java.lang.Boolean getCapMan__Lead_Investor__c() {
        return capMan__Lead_Investor__c;
    }


    /**
     * Sets the capMan__Lead_Investor__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Lead_Investor__c
     */
    public void setCapMan__Lead_Investor__c(java.lang.Boolean capMan__Lead_Investor__c) {
        this.capMan__Lead_Investor__c = capMan__Lead_Investor__c;
    }


    /**
     * Gets the capMan__Maximum__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Maximum__c
     */
    public java.lang.Double getCapMan__Maximum__c() {
        return capMan__Maximum__c;
    }


    /**
     * Sets the capMan__Maximum__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Maximum__c
     */
    public void setCapMan__Maximum__c(java.lang.Double capMan__Maximum__c) {
        this.capMan__Maximum__c = capMan__Maximum__c;
    }


    /**
     * Gets the capMan__Minimum__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Minimum__c
     */
    public java.lang.Double getCapMan__Minimum__c() {
        return capMan__Minimum__c;
    }


    /**
     * Sets the capMan__Minimum__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Minimum__c
     */
    public void setCapMan__Minimum__c(java.lang.Double capMan__Minimum__c) {
        this.capMan__Minimum__c = capMan__Minimum__c;
    }


    /**
     * Gets the capMan__MobilePhone__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__MobilePhone__c
     */
    public java.lang.String getCapMan__MobilePhone__c() {
        return capMan__MobilePhone__c;
    }


    /**
     * Sets the capMan__MobilePhone__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__MobilePhone__c
     */
    public void setCapMan__MobilePhone__c(java.lang.String capMan__MobilePhone__c) {
        this.capMan__MobilePhone__c = capMan__MobilePhone__c;
    }


    /**
     * Gets the capMan__Pipeline_Status__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Pipeline_Status__c
     */
    public java.lang.String getCapMan__Pipeline_Status__c() {
        return capMan__Pipeline_Status__c;
    }


    /**
     * Sets the capMan__Pipeline_Status__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Pipeline_Status__c
     */
    public void setCapMan__Pipeline_Status__c(java.lang.String capMan__Pipeline_Status__c) {
        this.capMan__Pipeline_Status__c = capMan__Pipeline_Status__c;
    }


    /**
     * Gets the capMan__Prerequisites__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Prerequisites__c
     */
    public java.lang.Double getCapMan__Prerequisites__c() {
        return capMan__Prerequisites__c;
    }


    /**
     * Sets the capMan__Prerequisites__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Prerequisites__c
     */
    public void setCapMan__Prerequisites__c(java.lang.Double capMan__Prerequisites__c) {
        this.capMan__Prerequisites__c = capMan__Prerequisites__c;
    }


    /**
     * Gets the capMan__Registered__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Registered__c
     */
    public java.lang.Boolean getCapMan__Registered__c() {
        return capMan__Registered__c;
    }


    /**
     * Sets the capMan__Registered__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Registered__c
     */
    public void setCapMan__Registered__c(java.lang.Boolean capMan__Registered__c) {
        this.capMan__Registered__c = capMan__Registered__c;
    }


    /**
     * Gets the capMan__RelationshipLead__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__RelationshipLead__c
     */
    public java.lang.String getCapMan__RelationshipLead__c() {
        return capMan__RelationshipLead__c;
    }


    /**
     * Sets the capMan__RelationshipLead__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__RelationshipLead__c
     */
    public void setCapMan__RelationshipLead__c(java.lang.String capMan__RelationshipLead__c) {
        this.capMan__RelationshipLead__c = capMan__RelationshipLead__c;
    }


    /**
     * Gets the capMan__RelationshipLead__r value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__RelationshipLead__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__RelationshipLead__r() {
        return capMan__RelationshipLead__r;
    }


    /**
     * Sets the capMan__RelationshipLead__r value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__RelationshipLead__r
     */
    public void setCapMan__RelationshipLead__r(com.sforce.soap.enterprise.sobject.Contact capMan__RelationshipLead__r) {
        this.capMan__RelationshipLead__r = capMan__RelationshipLead__r;
    }


    /**
     * Gets the capMan__Relationship_Mgr__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Relationship_Mgr__c
     */
    public java.lang.String getCapMan__Relationship_Mgr__c() {
        return capMan__Relationship_Mgr__c;
    }


    /**
     * Sets the capMan__Relationship_Mgr__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Relationship_Mgr__c
     */
    public void setCapMan__Relationship_Mgr__c(java.lang.String capMan__Relationship_Mgr__c) {
        this.capMan__Relationship_Mgr__c = capMan__Relationship_Mgr__c;
    }


    /**
     * Gets the capMan__Relationship_Mgr__r value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__Relationship_Mgr__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Relationship_Mgr__r() {
        return capMan__Relationship_Mgr__r;
    }


    /**
     * Sets the capMan__Relationship_Mgr__r value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__Relationship_Mgr__r
     */
    public void setCapMan__Relationship_Mgr__r(com.sforce.soap.enterprise.sobject.Contact capMan__Relationship_Mgr__r) {
        this.capMan__Relationship_Mgr__r = capMan__Relationship_Mgr__r;
    }


    /**
     * Gets the capMan__SalesStageDate__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__SalesStageDate__c
     */
    public java.util.Date getCapMan__SalesStageDate__c() {
        return capMan__SalesStageDate__c;
    }


    /**
     * Sets the capMan__SalesStageDate__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__SalesStageDate__c
     */
    public void setCapMan__SalesStageDate__c(java.util.Date capMan__SalesStageDate__c) {
        this.capMan__SalesStageDate__c = capMan__SalesStageDate__c;
    }


    /**
     * Gets the capMan__SalesStage__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__SalesStage__c
     */
    public java.lang.String getCapMan__SalesStage__c() {
        return capMan__SalesStage__c;
    }


    /**
     * Sets the capMan__SalesStage__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__SalesStage__c
     */
    public void setCapMan__SalesStage__c(java.lang.String capMan__SalesStage__c) {
        this.capMan__SalesStage__c = capMan__SalesStage__c;
    }


    /**
     * Gets the capMan__SharesAllocated__c value for this CapMan__Investment_Stages__c.
     * 
     * @return capMan__SharesAllocated__c
     */
    public java.lang.Double getCapMan__SharesAllocated__c() {
        return capMan__SharesAllocated__c;
    }


    /**
     * Sets the capMan__SharesAllocated__c value for this CapMan__Investment_Stages__c.
     * 
     * @param capMan__SharesAllocated__c
     */
    public void setCapMan__SharesAllocated__c(java.lang.Double capMan__SharesAllocated__c) {
        this.capMan__SharesAllocated__c = capMan__SharesAllocated__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Investment_Stages__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Investment_Stages__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Investment_Stages__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Investment_Stages__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Investment_Stages__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Investment_Stages__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Investment_Stages__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Investment_Stages__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__Investment_Stages__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__Investment_Stages__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Investment_Stages__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Investment_Stages__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CapMan__Investment_Stages__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__Investment_Stages__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__Investment_Stages__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Investment_Stages__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__Investment_Stages__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__Investment_Stages__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Investment_Stages__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Investment_Stages__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Investment_Stages__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Investment_Stages__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Investment_Stages__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Investment_Stages__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Investment_Stages__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Investment_Stages__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Investment_Stages__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Investment_Stages__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Investment_Stages__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Investment_Stages__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__Investment_Stages__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__Investment_Stages__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this CapMan__Investment_Stages__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Investment_Stages__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Investment_Stages__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Investment_Stages__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Investment_Stages__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Investment_Stages__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__Investment_Stages__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__Investment_Stages__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Investment_Stages__c)) return false;
        CapMan__Investment_Stages__c other = (CapMan__Investment_Stages__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.capMan__AllocatedShares__c==null && other.getCapMan__AllocatedShares__c()==null) || 
             (this.capMan__AllocatedShares__c!=null &&
              this.capMan__AllocatedShares__c.equals(other.getCapMan__AllocatedShares__c()))) &&
            ((this.capMan__Comments__c==null && other.getCapMan__Comments__c()==null) || 
             (this.capMan__Comments__c!=null &&
              this.capMan__Comments__c.equals(other.getCapMan__Comments__c()))) &&
            ((this.capMan__Commitment__c==null && other.getCapMan__Commitment__c()==null) || 
             (this.capMan__Commitment__c!=null &&
              this.capMan__Commitment__c.equals(other.getCapMan__Commitment__c()))) &&
            ((this.capMan__Converted__c==null && other.getCapMan__Converted__c()==null) || 
             (this.capMan__Converted__c!=null &&
              this.capMan__Converted__c.equals(other.getCapMan__Converted__c()))) &&
            ((this.capMan__Email__c==null && other.getCapMan__Email__c()==null) || 
             (this.capMan__Email__c!=null &&
              this.capMan__Email__c.equals(other.getCapMan__Email__c()))) &&
            ((this.capMan__Expiration__c==null && other.getCapMan__Expiration__c()==null) || 
             (this.capMan__Expiration__c!=null &&
              this.capMan__Expiration__c.equals(other.getCapMan__Expiration__c()))) &&
            ((this.capMan__FullName__c==null && other.getCapMan__FullName__c()==null) || 
             (this.capMan__FullName__c!=null &&
              this.capMan__FullName__c.equals(other.getCapMan__FullName__c()))) &&
            ((this.capMan__Funding_Milestone__c==null && other.getCapMan__Funding_Milestone__c()==null) || 
             (this.capMan__Funding_Milestone__c!=null &&
              this.capMan__Funding_Milestone__c.equals(other.getCapMan__Funding_Milestone__c()))) &&
            ((this.capMan__Fundraising__c==null && other.getCapMan__Fundraising__c()==null) || 
             (this.capMan__Fundraising__c!=null &&
              this.capMan__Fundraising__c.equals(other.getCapMan__Fundraising__c()))) &&
            ((this.capMan__Fundraising__r==null && other.getCapMan__Fundraising__r()==null) || 
             (this.capMan__Fundraising__r!=null &&
              this.capMan__Fundraising__r.equals(other.getCapMan__Fundraising__r()))) &&
            ((this.capMan__Investor__c==null && other.getCapMan__Investor__c()==null) || 
             (this.capMan__Investor__c!=null &&
              this.capMan__Investor__c.equals(other.getCapMan__Investor__c()))) &&
            ((this.capMan__Investor__r==null && other.getCapMan__Investor__r()==null) || 
             (this.capMan__Investor__r!=null &&
              this.capMan__Investor__r.equals(other.getCapMan__Investor__r()))) &&
            ((this.capMan__Lead_Investor__c==null && other.getCapMan__Lead_Investor__c()==null) || 
             (this.capMan__Lead_Investor__c!=null &&
              this.capMan__Lead_Investor__c.equals(other.getCapMan__Lead_Investor__c()))) &&
            ((this.capMan__Maximum__c==null && other.getCapMan__Maximum__c()==null) || 
             (this.capMan__Maximum__c!=null &&
              this.capMan__Maximum__c.equals(other.getCapMan__Maximum__c()))) &&
            ((this.capMan__Minimum__c==null && other.getCapMan__Minimum__c()==null) || 
             (this.capMan__Minimum__c!=null &&
              this.capMan__Minimum__c.equals(other.getCapMan__Minimum__c()))) &&
            ((this.capMan__MobilePhone__c==null && other.getCapMan__MobilePhone__c()==null) || 
             (this.capMan__MobilePhone__c!=null &&
              this.capMan__MobilePhone__c.equals(other.getCapMan__MobilePhone__c()))) &&
            ((this.capMan__Pipeline_Status__c==null && other.getCapMan__Pipeline_Status__c()==null) || 
             (this.capMan__Pipeline_Status__c!=null &&
              this.capMan__Pipeline_Status__c.equals(other.getCapMan__Pipeline_Status__c()))) &&
            ((this.capMan__Prerequisites__c==null && other.getCapMan__Prerequisites__c()==null) || 
             (this.capMan__Prerequisites__c!=null &&
              this.capMan__Prerequisites__c.equals(other.getCapMan__Prerequisites__c()))) &&
            ((this.capMan__Registered__c==null && other.getCapMan__Registered__c()==null) || 
             (this.capMan__Registered__c!=null &&
              this.capMan__Registered__c.equals(other.getCapMan__Registered__c()))) &&
            ((this.capMan__RelationshipLead__c==null && other.getCapMan__RelationshipLead__c()==null) || 
             (this.capMan__RelationshipLead__c!=null &&
              this.capMan__RelationshipLead__c.equals(other.getCapMan__RelationshipLead__c()))) &&
            ((this.capMan__RelationshipLead__r==null && other.getCapMan__RelationshipLead__r()==null) || 
             (this.capMan__RelationshipLead__r!=null &&
              this.capMan__RelationshipLead__r.equals(other.getCapMan__RelationshipLead__r()))) &&
            ((this.capMan__Relationship_Mgr__c==null && other.getCapMan__Relationship_Mgr__c()==null) || 
             (this.capMan__Relationship_Mgr__c!=null &&
              this.capMan__Relationship_Mgr__c.equals(other.getCapMan__Relationship_Mgr__c()))) &&
            ((this.capMan__Relationship_Mgr__r==null && other.getCapMan__Relationship_Mgr__r()==null) || 
             (this.capMan__Relationship_Mgr__r!=null &&
              this.capMan__Relationship_Mgr__r.equals(other.getCapMan__Relationship_Mgr__r()))) &&
            ((this.capMan__SalesStageDate__c==null && other.getCapMan__SalesStageDate__c()==null) || 
             (this.capMan__SalesStageDate__c!=null &&
              this.capMan__SalesStageDate__c.equals(other.getCapMan__SalesStageDate__c()))) &&
            ((this.capMan__SalesStage__c==null && other.getCapMan__SalesStage__c()==null) || 
             (this.capMan__SalesStage__c!=null &&
              this.capMan__SalesStage__c.equals(other.getCapMan__SalesStage__c()))) &&
            ((this.capMan__SharesAllocated__c==null && other.getCapMan__SharesAllocated__c()==null) || 
             (this.capMan__SharesAllocated__c!=null &&
              this.capMan__SharesAllocated__c.equals(other.getCapMan__SharesAllocated__c()))) &&
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
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
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
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks())));
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
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCapMan__AllocatedShares__c() != null) {
            _hashCode += getCapMan__AllocatedShares__c().hashCode();
        }
        if (getCapMan__Comments__c() != null) {
            _hashCode += getCapMan__Comments__c().hashCode();
        }
        if (getCapMan__Commitment__c() != null) {
            _hashCode += getCapMan__Commitment__c().hashCode();
        }
        if (getCapMan__Converted__c() != null) {
            _hashCode += getCapMan__Converted__c().hashCode();
        }
        if (getCapMan__Email__c() != null) {
            _hashCode += getCapMan__Email__c().hashCode();
        }
        if (getCapMan__Expiration__c() != null) {
            _hashCode += getCapMan__Expiration__c().hashCode();
        }
        if (getCapMan__FullName__c() != null) {
            _hashCode += getCapMan__FullName__c().hashCode();
        }
        if (getCapMan__Funding_Milestone__c() != null) {
            _hashCode += getCapMan__Funding_Milestone__c().hashCode();
        }
        if (getCapMan__Fundraising__c() != null) {
            _hashCode += getCapMan__Fundraising__c().hashCode();
        }
        if (getCapMan__Fundraising__r() != null) {
            _hashCode += getCapMan__Fundraising__r().hashCode();
        }
        if (getCapMan__Investor__c() != null) {
            _hashCode += getCapMan__Investor__c().hashCode();
        }
        if (getCapMan__Investor__r() != null) {
            _hashCode += getCapMan__Investor__r().hashCode();
        }
        if (getCapMan__Lead_Investor__c() != null) {
            _hashCode += getCapMan__Lead_Investor__c().hashCode();
        }
        if (getCapMan__Maximum__c() != null) {
            _hashCode += getCapMan__Maximum__c().hashCode();
        }
        if (getCapMan__Minimum__c() != null) {
            _hashCode += getCapMan__Minimum__c().hashCode();
        }
        if (getCapMan__MobilePhone__c() != null) {
            _hashCode += getCapMan__MobilePhone__c().hashCode();
        }
        if (getCapMan__Pipeline_Status__c() != null) {
            _hashCode += getCapMan__Pipeline_Status__c().hashCode();
        }
        if (getCapMan__Prerequisites__c() != null) {
            _hashCode += getCapMan__Prerequisites__c().hashCode();
        }
        if (getCapMan__Registered__c() != null) {
            _hashCode += getCapMan__Registered__c().hashCode();
        }
        if (getCapMan__RelationshipLead__c() != null) {
            _hashCode += getCapMan__RelationshipLead__c().hashCode();
        }
        if (getCapMan__RelationshipLead__r() != null) {
            _hashCode += getCapMan__RelationshipLead__r().hashCode();
        }
        if (getCapMan__Relationship_Mgr__c() != null) {
            _hashCode += getCapMan__Relationship_Mgr__c().hashCode();
        }
        if (getCapMan__Relationship_Mgr__r() != null) {
            _hashCode += getCapMan__Relationship_Mgr__r().hashCode();
        }
        if (getCapMan__SalesStageDate__c() != null) {
            _hashCode += getCapMan__SalesStageDate__c().hashCode();
        }
        if (getCapMan__SalesStage__c() != null) {
            _hashCode += getCapMan__SalesStage__c().hashCode();
        }
        if (getCapMan__SharesAllocated__c() != null) {
            _hashCode += getCapMan__SharesAllocated__c().hashCode();
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
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
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
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
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
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMan__Investment_Stages__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Investment_Stages__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AllocatedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AllocatedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Commitment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Commitment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Converted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Converted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Expiration__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Expiration__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FullName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FullName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Funding_Milestone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Funding_Milestone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fundraising__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fundraising__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Investor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Investor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Investor__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Investor__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Lead_Investor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Lead_Investor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Maximum__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Maximum__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Minimum__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Minimum__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__MobilePhone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__MobilePhone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pipeline_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pipeline_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Prerequisites__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Prerequisites__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Registered__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registered__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RelationshipLead__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RelationshipLead__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RelationshipLead__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RelationshipLead__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Relationship_Mgr__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Relationship_Mgr__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Relationship_Mgr__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Relationship_Mgr__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SalesStageDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SalesStageDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SalesStage__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SalesStage__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SharesAllocated__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SharesAllocated__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
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
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
