/**
 * Pcmsys__Capital_Commitments_Calls__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Pcmsys__Capital_Commitments_Calls__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

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

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Double pcmsys__Amount_Collected__c;

    private java.lang.Double pcmsys__Amount_percent__c;

    private java.lang.String pcmsys__CapManRegisteredName__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r;

    private java.lang.Boolean pcmsys__Capital_Account_Created__c;

    private java.lang.String pcmsys__Comment__c;

    private java.lang.Double pcmsys__Committment_Amount__c;

    private java.lang.String pcmsys__Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact pcmsys__Contact__r;

    private java.util.Date pcmsys__Date__c;

    private java.lang.String pcmsys__Fund__c;

    private com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Fund__r;

    private java.lang.Double pcmsys__IndicationAmount__c;

    private java.lang.String pcmsys__Partnership_Fundraising__c;

    private com.sforce.soap.enterprise.sobject.Pcmsys__Partnership_Fundraising__c pcmsys__Partnership_Fundraising__r;

    private java.lang.String pcmsys__Sales_Stage__c;

    private java.lang.String pcmsys__Transaction_Type__c;

    public Pcmsys__Capital_Commitments_Calls__c() {
    }

    public Pcmsys__Capital_Commitments_Calls__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
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
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Double pcmsys__Amount_Collected__c,
           java.lang.Double pcmsys__Amount_percent__c,
           java.lang.String pcmsys__CapManRegisteredName__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r,
           java.lang.Boolean pcmsys__Capital_Account_Created__c,
           java.lang.String pcmsys__Comment__c,
           java.lang.Double pcmsys__Committment_Amount__c,
           java.lang.String pcmsys__Contact__c,
           com.sforce.soap.enterprise.sobject.Contact pcmsys__Contact__r,
           java.util.Date pcmsys__Date__c,
           java.lang.String pcmsys__Fund__c,
           com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Fund__r,
           java.lang.Double pcmsys__IndicationAmount__c,
           java.lang.String pcmsys__Partnership_Fundraising__c,
           com.sforce.soap.enterprise.sobject.Pcmsys__Partnership_Fundraising__c pcmsys__Partnership_Fundraising__r,
           java.lang.String pcmsys__Sales_Stage__c,
           java.lang.String pcmsys__Transaction_Type__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
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
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.pcmsys__Amount_Collected__c = pcmsys__Amount_Collected__c;
        this.pcmsys__Amount_percent__c = pcmsys__Amount_percent__c;
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
        this.pcmsys__Capital_Account_Created__c = pcmsys__Capital_Account_Created__c;
        this.pcmsys__Comment__c = pcmsys__Comment__c;
        this.pcmsys__Committment_Amount__c = pcmsys__Committment_Amount__c;
        this.pcmsys__Contact__c = pcmsys__Contact__c;
        this.pcmsys__Contact__r = pcmsys__Contact__r;
        this.pcmsys__Date__c = pcmsys__Date__c;
        this.pcmsys__Fund__c = pcmsys__Fund__c;
        this.pcmsys__Fund__r = pcmsys__Fund__r;
        this.pcmsys__IndicationAmount__c = pcmsys__IndicationAmount__c;
        this.pcmsys__Partnership_Fundraising__c = pcmsys__Partnership_Fundraising__c;
        this.pcmsys__Partnership_Fundraising__r = pcmsys__Partnership_Fundraising__r;
        this.pcmsys__Sales_Stage__c = pcmsys__Sales_Stage__c;
        this.pcmsys__Transaction_Type__c = pcmsys__Transaction_Type__c;
    }


    /**
     * Gets the activityHistories value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the systemModstamp value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the pcmsys__Amount_Collected__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Amount_Collected__c
     */
    public java.lang.Double getPcmsys__Amount_Collected__c() {
        return pcmsys__Amount_Collected__c;
    }


    /**
     * Sets the pcmsys__Amount_Collected__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Amount_Collected__c
     */
    public void setPcmsys__Amount_Collected__c(java.lang.Double pcmsys__Amount_Collected__c) {
        this.pcmsys__Amount_Collected__c = pcmsys__Amount_Collected__c;
    }


    /**
     * Gets the pcmsys__Amount_percent__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Amount_percent__c
     */
    public java.lang.Double getPcmsys__Amount_percent__c() {
        return pcmsys__Amount_percent__c;
    }


    /**
     * Sets the pcmsys__Amount_percent__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Amount_percent__c
     */
    public void setPcmsys__Amount_percent__c(java.lang.Double pcmsys__Amount_percent__c) {
        this.pcmsys__Amount_percent__c = pcmsys__Amount_percent__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__CapManRegisteredName__c
     */
    public java.lang.String getPcmsys__CapManRegisteredName__c() {
        return pcmsys__CapManRegisteredName__c;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__CapManRegisteredName__c
     */
    public void setPcmsys__CapManRegisteredName__c(java.lang.String pcmsys__CapManRegisteredName__c) {
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__CapManRegisteredName__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getPcmsys__CapManRegisteredName__r() {
        return pcmsys__CapManRegisteredName__r;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__CapManRegisteredName__r
     */
    public void setPcmsys__CapManRegisteredName__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r) {
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
    }


    /**
     * Gets the pcmsys__Capital_Account_Created__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Capital_Account_Created__c
     */
    public java.lang.Boolean getPcmsys__Capital_Account_Created__c() {
        return pcmsys__Capital_Account_Created__c;
    }


    /**
     * Sets the pcmsys__Capital_Account_Created__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Capital_Account_Created__c
     */
    public void setPcmsys__Capital_Account_Created__c(java.lang.Boolean pcmsys__Capital_Account_Created__c) {
        this.pcmsys__Capital_Account_Created__c = pcmsys__Capital_Account_Created__c;
    }


    /**
     * Gets the pcmsys__Comment__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Comment__c
     */
    public java.lang.String getPcmsys__Comment__c() {
        return pcmsys__Comment__c;
    }


    /**
     * Sets the pcmsys__Comment__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Comment__c
     */
    public void setPcmsys__Comment__c(java.lang.String pcmsys__Comment__c) {
        this.pcmsys__Comment__c = pcmsys__Comment__c;
    }


    /**
     * Gets the pcmsys__Committment_Amount__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Committment_Amount__c
     */
    public java.lang.Double getPcmsys__Committment_Amount__c() {
        return pcmsys__Committment_Amount__c;
    }


    /**
     * Sets the pcmsys__Committment_Amount__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Committment_Amount__c
     */
    public void setPcmsys__Committment_Amount__c(java.lang.Double pcmsys__Committment_Amount__c) {
        this.pcmsys__Committment_Amount__c = pcmsys__Committment_Amount__c;
    }


    /**
     * Gets the pcmsys__Contact__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Contact__c
     */
    public java.lang.String getPcmsys__Contact__c() {
        return pcmsys__Contact__c;
    }


    /**
     * Sets the pcmsys__Contact__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Contact__c
     */
    public void setPcmsys__Contact__c(java.lang.String pcmsys__Contact__c) {
        this.pcmsys__Contact__c = pcmsys__Contact__c;
    }


    /**
     * Gets the pcmsys__Contact__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getPcmsys__Contact__r() {
        return pcmsys__Contact__r;
    }


    /**
     * Sets the pcmsys__Contact__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Contact__r
     */
    public void setPcmsys__Contact__r(com.sforce.soap.enterprise.sobject.Contact pcmsys__Contact__r) {
        this.pcmsys__Contact__r = pcmsys__Contact__r;
    }


    /**
     * Gets the pcmsys__Date__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Date__c
     */
    public java.util.Date getPcmsys__Date__c() {
        return pcmsys__Date__c;
    }


    /**
     * Sets the pcmsys__Date__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Date__c
     */
    public void setPcmsys__Date__c(java.util.Date pcmsys__Date__c) {
        this.pcmsys__Date__c = pcmsys__Date__c;
    }


    /**
     * Gets the pcmsys__Fund__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Fund__c
     */
    public java.lang.String getPcmsys__Fund__c() {
        return pcmsys__Fund__c;
    }


    /**
     * Sets the pcmsys__Fund__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Fund__c
     */
    public void setPcmsys__Fund__c(java.lang.String pcmsys__Fund__c) {
        this.pcmsys__Fund__c = pcmsys__Fund__c;
    }


    /**
     * Gets the pcmsys__Fund__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Fund__r
     */
    public com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c getPcmsys__Fund__r() {
        return pcmsys__Fund__r;
    }


    /**
     * Sets the pcmsys__Fund__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Fund__r
     */
    public void setPcmsys__Fund__r(com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Fund__r) {
        this.pcmsys__Fund__r = pcmsys__Fund__r;
    }


    /**
     * Gets the pcmsys__IndicationAmount__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__IndicationAmount__c
     */
    public java.lang.Double getPcmsys__IndicationAmount__c() {
        return pcmsys__IndicationAmount__c;
    }


    /**
     * Sets the pcmsys__IndicationAmount__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__IndicationAmount__c
     */
    public void setPcmsys__IndicationAmount__c(java.lang.Double pcmsys__IndicationAmount__c) {
        this.pcmsys__IndicationAmount__c = pcmsys__IndicationAmount__c;
    }


    /**
     * Gets the pcmsys__Partnership_Fundraising__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Partnership_Fundraising__c
     */
    public java.lang.String getPcmsys__Partnership_Fundraising__c() {
        return pcmsys__Partnership_Fundraising__c;
    }


    /**
     * Sets the pcmsys__Partnership_Fundraising__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Partnership_Fundraising__c
     */
    public void setPcmsys__Partnership_Fundraising__c(java.lang.String pcmsys__Partnership_Fundraising__c) {
        this.pcmsys__Partnership_Fundraising__c = pcmsys__Partnership_Fundraising__c;
    }


    /**
     * Gets the pcmsys__Partnership_Fundraising__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Partnership_Fundraising__r
     */
    public com.sforce.soap.enterprise.sobject.Pcmsys__Partnership_Fundraising__c getPcmsys__Partnership_Fundraising__r() {
        return pcmsys__Partnership_Fundraising__r;
    }


    /**
     * Sets the pcmsys__Partnership_Fundraising__r value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Partnership_Fundraising__r
     */
    public void setPcmsys__Partnership_Fundraising__r(com.sforce.soap.enterprise.sobject.Pcmsys__Partnership_Fundraising__c pcmsys__Partnership_Fundraising__r) {
        this.pcmsys__Partnership_Fundraising__r = pcmsys__Partnership_Fundraising__r;
    }


    /**
     * Gets the pcmsys__Sales_Stage__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Sales_Stage__c
     */
    public java.lang.String getPcmsys__Sales_Stage__c() {
        return pcmsys__Sales_Stage__c;
    }


    /**
     * Sets the pcmsys__Sales_Stage__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Sales_Stage__c
     */
    public void setPcmsys__Sales_Stage__c(java.lang.String pcmsys__Sales_Stage__c) {
        this.pcmsys__Sales_Stage__c = pcmsys__Sales_Stage__c;
    }


    /**
     * Gets the pcmsys__Transaction_Type__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @return pcmsys__Transaction_Type__c
     */
    public java.lang.String getPcmsys__Transaction_Type__c() {
        return pcmsys__Transaction_Type__c;
    }


    /**
     * Sets the pcmsys__Transaction_Type__c value for this Pcmsys__Capital_Commitments_Calls__c.
     * 
     * @param pcmsys__Transaction_Type__c
     */
    public void setPcmsys__Transaction_Type__c(java.lang.String pcmsys__Transaction_Type__c) {
        this.pcmsys__Transaction_Type__c = pcmsys__Transaction_Type__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pcmsys__Capital_Commitments_Calls__c)) return false;
        Pcmsys__Capital_Commitments_Calls__c other = (Pcmsys__Capital_Commitments_Calls__c) obj;
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
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.pcmsys__Amount_Collected__c==null && other.getPcmsys__Amount_Collected__c()==null) || 
             (this.pcmsys__Amount_Collected__c!=null &&
              this.pcmsys__Amount_Collected__c.equals(other.getPcmsys__Amount_Collected__c()))) &&
            ((this.pcmsys__Amount_percent__c==null && other.getPcmsys__Amount_percent__c()==null) || 
             (this.pcmsys__Amount_percent__c!=null &&
              this.pcmsys__Amount_percent__c.equals(other.getPcmsys__Amount_percent__c()))) &&
            ((this.pcmsys__CapManRegisteredName__c==null && other.getPcmsys__CapManRegisteredName__c()==null) || 
             (this.pcmsys__CapManRegisteredName__c!=null &&
              this.pcmsys__CapManRegisteredName__c.equals(other.getPcmsys__CapManRegisteredName__c()))) &&
            ((this.pcmsys__CapManRegisteredName__r==null && other.getPcmsys__CapManRegisteredName__r()==null) || 
             (this.pcmsys__CapManRegisteredName__r!=null &&
              this.pcmsys__CapManRegisteredName__r.equals(other.getPcmsys__CapManRegisteredName__r()))) &&
            ((this.pcmsys__Capital_Account_Created__c==null && other.getPcmsys__Capital_Account_Created__c()==null) || 
             (this.pcmsys__Capital_Account_Created__c!=null &&
              this.pcmsys__Capital_Account_Created__c.equals(other.getPcmsys__Capital_Account_Created__c()))) &&
            ((this.pcmsys__Comment__c==null && other.getPcmsys__Comment__c()==null) || 
             (this.pcmsys__Comment__c!=null &&
              this.pcmsys__Comment__c.equals(other.getPcmsys__Comment__c()))) &&
            ((this.pcmsys__Committment_Amount__c==null && other.getPcmsys__Committment_Amount__c()==null) || 
             (this.pcmsys__Committment_Amount__c!=null &&
              this.pcmsys__Committment_Amount__c.equals(other.getPcmsys__Committment_Amount__c()))) &&
            ((this.pcmsys__Contact__c==null && other.getPcmsys__Contact__c()==null) || 
             (this.pcmsys__Contact__c!=null &&
              this.pcmsys__Contact__c.equals(other.getPcmsys__Contact__c()))) &&
            ((this.pcmsys__Contact__r==null && other.getPcmsys__Contact__r()==null) || 
             (this.pcmsys__Contact__r!=null &&
              this.pcmsys__Contact__r.equals(other.getPcmsys__Contact__r()))) &&
            ((this.pcmsys__Date__c==null && other.getPcmsys__Date__c()==null) || 
             (this.pcmsys__Date__c!=null &&
              this.pcmsys__Date__c.equals(other.getPcmsys__Date__c()))) &&
            ((this.pcmsys__Fund__c==null && other.getPcmsys__Fund__c()==null) || 
             (this.pcmsys__Fund__c!=null &&
              this.pcmsys__Fund__c.equals(other.getPcmsys__Fund__c()))) &&
            ((this.pcmsys__Fund__r==null && other.getPcmsys__Fund__r()==null) || 
             (this.pcmsys__Fund__r!=null &&
              this.pcmsys__Fund__r.equals(other.getPcmsys__Fund__r()))) &&
            ((this.pcmsys__IndicationAmount__c==null && other.getPcmsys__IndicationAmount__c()==null) || 
             (this.pcmsys__IndicationAmount__c!=null &&
              this.pcmsys__IndicationAmount__c.equals(other.getPcmsys__IndicationAmount__c()))) &&
            ((this.pcmsys__Partnership_Fundraising__c==null && other.getPcmsys__Partnership_Fundraising__c()==null) || 
             (this.pcmsys__Partnership_Fundraising__c!=null &&
              this.pcmsys__Partnership_Fundraising__c.equals(other.getPcmsys__Partnership_Fundraising__c()))) &&
            ((this.pcmsys__Partnership_Fundraising__r==null && other.getPcmsys__Partnership_Fundraising__r()==null) || 
             (this.pcmsys__Partnership_Fundraising__r!=null &&
              this.pcmsys__Partnership_Fundraising__r.equals(other.getPcmsys__Partnership_Fundraising__r()))) &&
            ((this.pcmsys__Sales_Stage__c==null && other.getPcmsys__Sales_Stage__c()==null) || 
             (this.pcmsys__Sales_Stage__c!=null &&
              this.pcmsys__Sales_Stage__c.equals(other.getPcmsys__Sales_Stage__c()))) &&
            ((this.pcmsys__Transaction_Type__c==null && other.getPcmsys__Transaction_Type__c()==null) || 
             (this.pcmsys__Transaction_Type__c!=null &&
              this.pcmsys__Transaction_Type__c.equals(other.getPcmsys__Transaction_Type__c())));
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
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getPcmsys__Amount_Collected__c() != null) {
            _hashCode += getPcmsys__Amount_Collected__c().hashCode();
        }
        if (getPcmsys__Amount_percent__c() != null) {
            _hashCode += getPcmsys__Amount_percent__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__c() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__r() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__r().hashCode();
        }
        if (getPcmsys__Capital_Account_Created__c() != null) {
            _hashCode += getPcmsys__Capital_Account_Created__c().hashCode();
        }
        if (getPcmsys__Comment__c() != null) {
            _hashCode += getPcmsys__Comment__c().hashCode();
        }
        if (getPcmsys__Committment_Amount__c() != null) {
            _hashCode += getPcmsys__Committment_Amount__c().hashCode();
        }
        if (getPcmsys__Contact__c() != null) {
            _hashCode += getPcmsys__Contact__c().hashCode();
        }
        if (getPcmsys__Contact__r() != null) {
            _hashCode += getPcmsys__Contact__r().hashCode();
        }
        if (getPcmsys__Date__c() != null) {
            _hashCode += getPcmsys__Date__c().hashCode();
        }
        if (getPcmsys__Fund__c() != null) {
            _hashCode += getPcmsys__Fund__c().hashCode();
        }
        if (getPcmsys__Fund__r() != null) {
            _hashCode += getPcmsys__Fund__r().hashCode();
        }
        if (getPcmsys__IndicationAmount__c() != null) {
            _hashCode += getPcmsys__IndicationAmount__c().hashCode();
        }
        if (getPcmsys__Partnership_Fundraising__c() != null) {
            _hashCode += getPcmsys__Partnership_Fundraising__c().hashCode();
        }
        if (getPcmsys__Partnership_Fundraising__r() != null) {
            _hashCode += getPcmsys__Partnership_Fundraising__r().hashCode();
        }
        if (getPcmsys__Sales_Stage__c() != null) {
            _hashCode += getPcmsys__Sales_Stage__c().hashCode();
        }
        if (getPcmsys__Transaction_Type__c() != null) {
            _hashCode += getPcmsys__Transaction_Type__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pcmsys__Capital_Commitments_Calls__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Capital_Commitments_Calls__c"));
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
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Amount_Collected__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Amount_Collected__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Amount_percent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Amount_percent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__CapManRegisteredName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__CapManRegisteredName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__CapManRegisteredName__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__CapManRegisteredName__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Capital_Account_Created__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Capital_Account_Created__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Committment_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Committment_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Fund__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Fund__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Fund__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Fund__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Fund__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__IndicationAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__IndicationAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Partnership_Fundraising__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Partnership_Fundraising__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Partnership_Fundraising__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Partnership_Fundraising__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Partnership_Fundraising__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Sales_Stage__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Sales_Stage__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Transaction_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Transaction_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
