/**
 * Pcmsys__Capital_Account__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Pcmsys__Capital_Account__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

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

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private java.lang.Double pcmsys__BeginCapital__c;

    private java.lang.String pcmsys__CapManRegisteredName__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r;

    private java.lang.Double pcmsys__CapitalPct__c;

    private java.lang.Double pcmsys__Commitments__c;

    private java.lang.Double pcmsys__Contributions__c;

    private java.lang.Double pcmsys__Distributions__c;

    private java.util.Date pcmsys__End_Date__c;

    private java.lang.Double pcmsys__EndingBalance__c;

    private java.lang.Double pcmsys__Expenses__c;

    private java.lang.Double pcmsys__Income__c;

    private java.lang.Double pcmsys__InterimCapital__c;

    private java.lang.Double pcmsys__MgtFee__c;

    private java.lang.String pcmsys__Period__c;

    private java.lang.Double pcmsys__RealGain__c;

    private java.lang.Double pcmsys__Reallocation__c;

    private java.util.Date pcmsys__Start_Date__c;

    private java.lang.Double pcmsys__SyndicCosts__c;

    private java.lang.String pcmsys__Type__c;

    private java.lang.Double pcmsys__UnrealGain__c;

    public Pcmsys__Capital_Account__c() {
    }

    public Pcmsys__Capital_Account__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
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
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           java.lang.Double pcmsys__BeginCapital__c,
           java.lang.String pcmsys__CapManRegisteredName__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r,
           java.lang.Double pcmsys__CapitalPct__c,
           java.lang.Double pcmsys__Commitments__c,
           java.lang.Double pcmsys__Contributions__c,
           java.lang.Double pcmsys__Distributions__c,
           java.util.Date pcmsys__End_Date__c,
           java.lang.Double pcmsys__EndingBalance__c,
           java.lang.Double pcmsys__Expenses__c,
           java.lang.Double pcmsys__Income__c,
           java.lang.Double pcmsys__InterimCapital__c,
           java.lang.Double pcmsys__MgtFee__c,
           java.lang.String pcmsys__Period__c,
           java.lang.Double pcmsys__RealGain__c,
           java.lang.Double pcmsys__Reallocation__c,
           java.util.Date pcmsys__Start_Date__c,
           java.lang.Double pcmsys__SyndicCosts__c,
           java.lang.String pcmsys__Type__c,
           java.lang.Double pcmsys__UnrealGain__c) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
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
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.pcmsys__BeginCapital__c = pcmsys__BeginCapital__c;
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
        this.pcmsys__CapitalPct__c = pcmsys__CapitalPct__c;
        this.pcmsys__Commitments__c = pcmsys__Commitments__c;
        this.pcmsys__Contributions__c = pcmsys__Contributions__c;
        this.pcmsys__Distributions__c = pcmsys__Distributions__c;
        this.pcmsys__End_Date__c = pcmsys__End_Date__c;
        this.pcmsys__EndingBalance__c = pcmsys__EndingBalance__c;
        this.pcmsys__Expenses__c = pcmsys__Expenses__c;
        this.pcmsys__Income__c = pcmsys__Income__c;
        this.pcmsys__InterimCapital__c = pcmsys__InterimCapital__c;
        this.pcmsys__MgtFee__c = pcmsys__MgtFee__c;
        this.pcmsys__Period__c = pcmsys__Period__c;
        this.pcmsys__RealGain__c = pcmsys__RealGain__c;
        this.pcmsys__Reallocation__c = pcmsys__Reallocation__c;
        this.pcmsys__Start_Date__c = pcmsys__Start_Date__c;
        this.pcmsys__SyndicCosts__c = pcmsys__SyndicCosts__c;
        this.pcmsys__Type__c = pcmsys__Type__c;
        this.pcmsys__UnrealGain__c = pcmsys__UnrealGain__c;
    }


    /**
     * Gets the attachments value for this Pcmsys__Capital_Account__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Pcmsys__Capital_Account__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Pcmsys__Capital_Account__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Pcmsys__Capital_Account__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Pcmsys__Capital_Account__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Pcmsys__Capital_Account__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Pcmsys__Capital_Account__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Pcmsys__Capital_Account__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this Pcmsys__Capital_Account__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this Pcmsys__Capital_Account__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Pcmsys__Capital_Account__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Pcmsys__Capital_Account__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Pcmsys__Capital_Account__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Pcmsys__Capital_Account__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Pcmsys__Capital_Account__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Pcmsys__Capital_Account__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Pcmsys__Capital_Account__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Pcmsys__Capital_Account__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Pcmsys__Capital_Account__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Pcmsys__Capital_Account__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Pcmsys__Capital_Account__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Pcmsys__Capital_Account__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Pcmsys__Capital_Account__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Pcmsys__Capital_Account__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Pcmsys__Capital_Account__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Pcmsys__Capital_Account__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Pcmsys__Capital_Account__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Pcmsys__Capital_Account__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Pcmsys__Capital_Account__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Pcmsys__Capital_Account__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Pcmsys__Capital_Account__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Pcmsys__Capital_Account__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Pcmsys__Capital_Account__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Pcmsys__Capital_Account__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Pcmsys__Capital_Account__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Pcmsys__Capital_Account__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the pcmsys__BeginCapital__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__BeginCapital__c
     */
    public java.lang.Double getPcmsys__BeginCapital__c() {
        return pcmsys__BeginCapital__c;
    }


    /**
     * Sets the pcmsys__BeginCapital__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__BeginCapital__c
     */
    public void setPcmsys__BeginCapital__c(java.lang.Double pcmsys__BeginCapital__c) {
        this.pcmsys__BeginCapital__c = pcmsys__BeginCapital__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__CapManRegisteredName__c
     */
    public java.lang.String getPcmsys__CapManRegisteredName__c() {
        return pcmsys__CapManRegisteredName__c;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__CapManRegisteredName__c
     */
    public void setPcmsys__CapManRegisteredName__c(java.lang.String pcmsys__CapManRegisteredName__c) {
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__CapManRegisteredName__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getPcmsys__CapManRegisteredName__r() {
        return pcmsys__CapManRegisteredName__r;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__CapManRegisteredName__r
     */
    public void setPcmsys__CapManRegisteredName__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r) {
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
    }


    /**
     * Gets the pcmsys__CapitalPct__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__CapitalPct__c
     */
    public java.lang.Double getPcmsys__CapitalPct__c() {
        return pcmsys__CapitalPct__c;
    }


    /**
     * Sets the pcmsys__CapitalPct__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__CapitalPct__c
     */
    public void setPcmsys__CapitalPct__c(java.lang.Double pcmsys__CapitalPct__c) {
        this.pcmsys__CapitalPct__c = pcmsys__CapitalPct__c;
    }


    /**
     * Gets the pcmsys__Commitments__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Commitments__c
     */
    public java.lang.Double getPcmsys__Commitments__c() {
        return pcmsys__Commitments__c;
    }


    /**
     * Sets the pcmsys__Commitments__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Commitments__c
     */
    public void setPcmsys__Commitments__c(java.lang.Double pcmsys__Commitments__c) {
        this.pcmsys__Commitments__c = pcmsys__Commitments__c;
    }


    /**
     * Gets the pcmsys__Contributions__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Contributions__c
     */
    public java.lang.Double getPcmsys__Contributions__c() {
        return pcmsys__Contributions__c;
    }


    /**
     * Sets the pcmsys__Contributions__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Contributions__c
     */
    public void setPcmsys__Contributions__c(java.lang.Double pcmsys__Contributions__c) {
        this.pcmsys__Contributions__c = pcmsys__Contributions__c;
    }


    /**
     * Gets the pcmsys__Distributions__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Distributions__c
     */
    public java.lang.Double getPcmsys__Distributions__c() {
        return pcmsys__Distributions__c;
    }


    /**
     * Sets the pcmsys__Distributions__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Distributions__c
     */
    public void setPcmsys__Distributions__c(java.lang.Double pcmsys__Distributions__c) {
        this.pcmsys__Distributions__c = pcmsys__Distributions__c;
    }


    /**
     * Gets the pcmsys__End_Date__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__End_Date__c
     */
    public java.util.Date getPcmsys__End_Date__c() {
        return pcmsys__End_Date__c;
    }


    /**
     * Sets the pcmsys__End_Date__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__End_Date__c
     */
    public void setPcmsys__End_Date__c(java.util.Date pcmsys__End_Date__c) {
        this.pcmsys__End_Date__c = pcmsys__End_Date__c;
    }


    /**
     * Gets the pcmsys__EndingBalance__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__EndingBalance__c
     */
    public java.lang.Double getPcmsys__EndingBalance__c() {
        return pcmsys__EndingBalance__c;
    }


    /**
     * Sets the pcmsys__EndingBalance__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__EndingBalance__c
     */
    public void setPcmsys__EndingBalance__c(java.lang.Double pcmsys__EndingBalance__c) {
        this.pcmsys__EndingBalance__c = pcmsys__EndingBalance__c;
    }


    /**
     * Gets the pcmsys__Expenses__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Expenses__c
     */
    public java.lang.Double getPcmsys__Expenses__c() {
        return pcmsys__Expenses__c;
    }


    /**
     * Sets the pcmsys__Expenses__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Expenses__c
     */
    public void setPcmsys__Expenses__c(java.lang.Double pcmsys__Expenses__c) {
        this.pcmsys__Expenses__c = pcmsys__Expenses__c;
    }


    /**
     * Gets the pcmsys__Income__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Income__c
     */
    public java.lang.Double getPcmsys__Income__c() {
        return pcmsys__Income__c;
    }


    /**
     * Sets the pcmsys__Income__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Income__c
     */
    public void setPcmsys__Income__c(java.lang.Double pcmsys__Income__c) {
        this.pcmsys__Income__c = pcmsys__Income__c;
    }


    /**
     * Gets the pcmsys__InterimCapital__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__InterimCapital__c
     */
    public java.lang.Double getPcmsys__InterimCapital__c() {
        return pcmsys__InterimCapital__c;
    }


    /**
     * Sets the pcmsys__InterimCapital__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__InterimCapital__c
     */
    public void setPcmsys__InterimCapital__c(java.lang.Double pcmsys__InterimCapital__c) {
        this.pcmsys__InterimCapital__c = pcmsys__InterimCapital__c;
    }


    /**
     * Gets the pcmsys__MgtFee__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__MgtFee__c
     */
    public java.lang.Double getPcmsys__MgtFee__c() {
        return pcmsys__MgtFee__c;
    }


    /**
     * Sets the pcmsys__MgtFee__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__MgtFee__c
     */
    public void setPcmsys__MgtFee__c(java.lang.Double pcmsys__MgtFee__c) {
        this.pcmsys__MgtFee__c = pcmsys__MgtFee__c;
    }


    /**
     * Gets the pcmsys__Period__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Period__c
     */
    public java.lang.String getPcmsys__Period__c() {
        return pcmsys__Period__c;
    }


    /**
     * Sets the pcmsys__Period__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Period__c
     */
    public void setPcmsys__Period__c(java.lang.String pcmsys__Period__c) {
        this.pcmsys__Period__c = pcmsys__Period__c;
    }


    /**
     * Gets the pcmsys__RealGain__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__RealGain__c
     */
    public java.lang.Double getPcmsys__RealGain__c() {
        return pcmsys__RealGain__c;
    }


    /**
     * Sets the pcmsys__RealGain__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__RealGain__c
     */
    public void setPcmsys__RealGain__c(java.lang.Double pcmsys__RealGain__c) {
        this.pcmsys__RealGain__c = pcmsys__RealGain__c;
    }


    /**
     * Gets the pcmsys__Reallocation__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Reallocation__c
     */
    public java.lang.Double getPcmsys__Reallocation__c() {
        return pcmsys__Reallocation__c;
    }


    /**
     * Sets the pcmsys__Reallocation__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Reallocation__c
     */
    public void setPcmsys__Reallocation__c(java.lang.Double pcmsys__Reallocation__c) {
        this.pcmsys__Reallocation__c = pcmsys__Reallocation__c;
    }


    /**
     * Gets the pcmsys__Start_Date__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Start_Date__c
     */
    public java.util.Date getPcmsys__Start_Date__c() {
        return pcmsys__Start_Date__c;
    }


    /**
     * Sets the pcmsys__Start_Date__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Start_Date__c
     */
    public void setPcmsys__Start_Date__c(java.util.Date pcmsys__Start_Date__c) {
        this.pcmsys__Start_Date__c = pcmsys__Start_Date__c;
    }


    /**
     * Gets the pcmsys__SyndicCosts__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__SyndicCosts__c
     */
    public java.lang.Double getPcmsys__SyndicCosts__c() {
        return pcmsys__SyndicCosts__c;
    }


    /**
     * Sets the pcmsys__SyndicCosts__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__SyndicCosts__c
     */
    public void setPcmsys__SyndicCosts__c(java.lang.Double pcmsys__SyndicCosts__c) {
        this.pcmsys__SyndicCosts__c = pcmsys__SyndicCosts__c;
    }


    /**
     * Gets the pcmsys__Type__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__Type__c
     */
    public java.lang.String getPcmsys__Type__c() {
        return pcmsys__Type__c;
    }


    /**
     * Sets the pcmsys__Type__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__Type__c
     */
    public void setPcmsys__Type__c(java.lang.String pcmsys__Type__c) {
        this.pcmsys__Type__c = pcmsys__Type__c;
    }


    /**
     * Gets the pcmsys__UnrealGain__c value for this Pcmsys__Capital_Account__c.
     * 
     * @return pcmsys__UnrealGain__c
     */
    public java.lang.Double getPcmsys__UnrealGain__c() {
        return pcmsys__UnrealGain__c;
    }


    /**
     * Sets the pcmsys__UnrealGain__c value for this Pcmsys__Capital_Account__c.
     * 
     * @param pcmsys__UnrealGain__c
     */
    public void setPcmsys__UnrealGain__c(java.lang.Double pcmsys__UnrealGain__c) {
        this.pcmsys__UnrealGain__c = pcmsys__UnrealGain__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pcmsys__Capital_Account__c)) return false;
        Pcmsys__Capital_Account__c other = (Pcmsys__Capital_Account__c) obj;
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
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.pcmsys__BeginCapital__c==null && other.getPcmsys__BeginCapital__c()==null) || 
             (this.pcmsys__BeginCapital__c!=null &&
              this.pcmsys__BeginCapital__c.equals(other.getPcmsys__BeginCapital__c()))) &&
            ((this.pcmsys__CapManRegisteredName__c==null && other.getPcmsys__CapManRegisteredName__c()==null) || 
             (this.pcmsys__CapManRegisteredName__c!=null &&
              this.pcmsys__CapManRegisteredName__c.equals(other.getPcmsys__CapManRegisteredName__c()))) &&
            ((this.pcmsys__CapManRegisteredName__r==null && other.getPcmsys__CapManRegisteredName__r()==null) || 
             (this.pcmsys__CapManRegisteredName__r!=null &&
              this.pcmsys__CapManRegisteredName__r.equals(other.getPcmsys__CapManRegisteredName__r()))) &&
            ((this.pcmsys__CapitalPct__c==null && other.getPcmsys__CapitalPct__c()==null) || 
             (this.pcmsys__CapitalPct__c!=null &&
              this.pcmsys__CapitalPct__c.equals(other.getPcmsys__CapitalPct__c()))) &&
            ((this.pcmsys__Commitments__c==null && other.getPcmsys__Commitments__c()==null) || 
             (this.pcmsys__Commitments__c!=null &&
              this.pcmsys__Commitments__c.equals(other.getPcmsys__Commitments__c()))) &&
            ((this.pcmsys__Contributions__c==null && other.getPcmsys__Contributions__c()==null) || 
             (this.pcmsys__Contributions__c!=null &&
              this.pcmsys__Contributions__c.equals(other.getPcmsys__Contributions__c()))) &&
            ((this.pcmsys__Distributions__c==null && other.getPcmsys__Distributions__c()==null) || 
             (this.pcmsys__Distributions__c!=null &&
              this.pcmsys__Distributions__c.equals(other.getPcmsys__Distributions__c()))) &&
            ((this.pcmsys__End_Date__c==null && other.getPcmsys__End_Date__c()==null) || 
             (this.pcmsys__End_Date__c!=null &&
              this.pcmsys__End_Date__c.equals(other.getPcmsys__End_Date__c()))) &&
            ((this.pcmsys__EndingBalance__c==null && other.getPcmsys__EndingBalance__c()==null) || 
             (this.pcmsys__EndingBalance__c!=null &&
              this.pcmsys__EndingBalance__c.equals(other.getPcmsys__EndingBalance__c()))) &&
            ((this.pcmsys__Expenses__c==null && other.getPcmsys__Expenses__c()==null) || 
             (this.pcmsys__Expenses__c!=null &&
              this.pcmsys__Expenses__c.equals(other.getPcmsys__Expenses__c()))) &&
            ((this.pcmsys__Income__c==null && other.getPcmsys__Income__c()==null) || 
             (this.pcmsys__Income__c!=null &&
              this.pcmsys__Income__c.equals(other.getPcmsys__Income__c()))) &&
            ((this.pcmsys__InterimCapital__c==null && other.getPcmsys__InterimCapital__c()==null) || 
             (this.pcmsys__InterimCapital__c!=null &&
              this.pcmsys__InterimCapital__c.equals(other.getPcmsys__InterimCapital__c()))) &&
            ((this.pcmsys__MgtFee__c==null && other.getPcmsys__MgtFee__c()==null) || 
             (this.pcmsys__MgtFee__c!=null &&
              this.pcmsys__MgtFee__c.equals(other.getPcmsys__MgtFee__c()))) &&
            ((this.pcmsys__Period__c==null && other.getPcmsys__Period__c()==null) || 
             (this.pcmsys__Period__c!=null &&
              this.pcmsys__Period__c.equals(other.getPcmsys__Period__c()))) &&
            ((this.pcmsys__RealGain__c==null && other.getPcmsys__RealGain__c()==null) || 
             (this.pcmsys__RealGain__c!=null &&
              this.pcmsys__RealGain__c.equals(other.getPcmsys__RealGain__c()))) &&
            ((this.pcmsys__Reallocation__c==null && other.getPcmsys__Reallocation__c()==null) || 
             (this.pcmsys__Reallocation__c!=null &&
              this.pcmsys__Reallocation__c.equals(other.getPcmsys__Reallocation__c()))) &&
            ((this.pcmsys__Start_Date__c==null && other.getPcmsys__Start_Date__c()==null) || 
             (this.pcmsys__Start_Date__c!=null &&
              this.pcmsys__Start_Date__c.equals(other.getPcmsys__Start_Date__c()))) &&
            ((this.pcmsys__SyndicCosts__c==null && other.getPcmsys__SyndicCosts__c()==null) || 
             (this.pcmsys__SyndicCosts__c!=null &&
              this.pcmsys__SyndicCosts__c.equals(other.getPcmsys__SyndicCosts__c()))) &&
            ((this.pcmsys__Type__c==null && other.getPcmsys__Type__c()==null) || 
             (this.pcmsys__Type__c!=null &&
              this.pcmsys__Type__c.equals(other.getPcmsys__Type__c()))) &&
            ((this.pcmsys__UnrealGain__c==null && other.getPcmsys__UnrealGain__c()==null) || 
             (this.pcmsys__UnrealGain__c!=null &&
              this.pcmsys__UnrealGain__c.equals(other.getPcmsys__UnrealGain__c())));
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
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
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
        if (getPcmsys__BeginCapital__c() != null) {
            _hashCode += getPcmsys__BeginCapital__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__c() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__r() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__r().hashCode();
        }
        if (getPcmsys__CapitalPct__c() != null) {
            _hashCode += getPcmsys__CapitalPct__c().hashCode();
        }
        if (getPcmsys__Commitments__c() != null) {
            _hashCode += getPcmsys__Commitments__c().hashCode();
        }
        if (getPcmsys__Contributions__c() != null) {
            _hashCode += getPcmsys__Contributions__c().hashCode();
        }
        if (getPcmsys__Distributions__c() != null) {
            _hashCode += getPcmsys__Distributions__c().hashCode();
        }
        if (getPcmsys__End_Date__c() != null) {
            _hashCode += getPcmsys__End_Date__c().hashCode();
        }
        if (getPcmsys__EndingBalance__c() != null) {
            _hashCode += getPcmsys__EndingBalance__c().hashCode();
        }
        if (getPcmsys__Expenses__c() != null) {
            _hashCode += getPcmsys__Expenses__c().hashCode();
        }
        if (getPcmsys__Income__c() != null) {
            _hashCode += getPcmsys__Income__c().hashCode();
        }
        if (getPcmsys__InterimCapital__c() != null) {
            _hashCode += getPcmsys__InterimCapital__c().hashCode();
        }
        if (getPcmsys__MgtFee__c() != null) {
            _hashCode += getPcmsys__MgtFee__c().hashCode();
        }
        if (getPcmsys__Period__c() != null) {
            _hashCode += getPcmsys__Period__c().hashCode();
        }
        if (getPcmsys__RealGain__c() != null) {
            _hashCode += getPcmsys__RealGain__c().hashCode();
        }
        if (getPcmsys__Reallocation__c() != null) {
            _hashCode += getPcmsys__Reallocation__c().hashCode();
        }
        if (getPcmsys__Start_Date__c() != null) {
            _hashCode += getPcmsys__Start_Date__c().hashCode();
        }
        if (getPcmsys__SyndicCosts__c() != null) {
            _hashCode += getPcmsys__SyndicCosts__c().hashCode();
        }
        if (getPcmsys__Type__c() != null) {
            _hashCode += getPcmsys__Type__c().hashCode();
        }
        if (getPcmsys__UnrealGain__c() != null) {
            _hashCode += getPcmsys__UnrealGain__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pcmsys__Capital_Account__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Capital_Account__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pcmsys__BeginCapital__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__BeginCapital__c"));
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
        elemField.setFieldName("pcmsys__CapitalPct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__CapitalPct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Commitments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Commitments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Contributions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Contributions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Distributions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Distributions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__EndingBalance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__EndingBalance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Expenses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Expenses__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Income__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Income__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__InterimCapital__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__InterimCapital__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__MgtFee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__MgtFee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Period__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Period__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__RealGain__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__RealGain__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Reallocation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Reallocation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__SyndicCosts__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__SyndicCosts__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__UnrealGain__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__UnrealGain__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
