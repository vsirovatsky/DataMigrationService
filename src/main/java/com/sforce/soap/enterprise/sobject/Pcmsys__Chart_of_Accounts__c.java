/**
 * Pcmsys__Chart_of_Accounts__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Pcmsys__Chart_of_Accounts__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.String pcmsys__Account_Category__c;

    private java.lang.String pcmsys__Account_Name_Other__c;

    private java.lang.String pcmsys__Account_Name__c;

    private java.lang.String pcmsys__Account_Number__c;

    private java.lang.String pcmsys__CapManRegisteredName__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r;

    private java.lang.Boolean pcmsys__Capital_Contribution_Account__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Chart_of_Accounts__r;

    private java.lang.String pcmsys__Description__c;

    private java.lang.Boolean pcmsys__Has_sub_account__c;

    private java.lang.Boolean pcmsys__Inactive__c;

    private java.lang.String pcmsys__Industry__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r;

    private java.lang.Double pcmsys__Order__c;

    private java.lang.String pcmsys__Parent_Account__c;

    private com.sforce.soap.enterprise.sobject.Pcmsys__Chart_of_Accounts__c pcmsys__Parent_Account__r;

    private java.lang.String pcmsys__Partner_Type__c;

    private java.lang.String pcmsys__Rollup_Account__c;

    public Pcmsys__Chart_of_Accounts__c() {
    }

    public Pcmsys__Chart_of_Accounts__c(
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
           java.lang.String pcmsys__Account_Category__c,
           java.lang.String pcmsys__Account_Name_Other__c,
           java.lang.String pcmsys__Account_Name__c,
           java.lang.String pcmsys__Account_Number__c,
           java.lang.String pcmsys__CapManRegisteredName__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r,
           java.lang.Boolean pcmsys__Capital_Contribution_Account__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__Chart_of_Accounts__r,
           java.lang.String pcmsys__Description__c,
           java.lang.Boolean pcmsys__Has_sub_account__c,
           java.lang.Boolean pcmsys__Inactive__c,
           java.lang.String pcmsys__Industry__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r,
           java.lang.Double pcmsys__Order__c,
           java.lang.String pcmsys__Parent_Account__c,
           com.sforce.soap.enterprise.sobject.Pcmsys__Chart_of_Accounts__c pcmsys__Parent_Account__r,
           java.lang.String pcmsys__Partner_Type__c,
           java.lang.String pcmsys__Rollup_Account__c) {
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
        this.pcmsys__Account_Category__c = pcmsys__Account_Category__c;
        this.pcmsys__Account_Name_Other__c = pcmsys__Account_Name_Other__c;
        this.pcmsys__Account_Name__c = pcmsys__Account_Name__c;
        this.pcmsys__Account_Number__c = pcmsys__Account_Number__c;
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
        this.pcmsys__Capital_Contribution_Account__c = pcmsys__Capital_Contribution_Account__c;
        this.pcmsys__Chart_of_Accounts__r = pcmsys__Chart_of_Accounts__r;
        this.pcmsys__Description__c = pcmsys__Description__c;
        this.pcmsys__Has_sub_account__c = pcmsys__Has_sub_account__c;
        this.pcmsys__Inactive__c = pcmsys__Inactive__c;
        this.pcmsys__Industry__c = pcmsys__Industry__c;
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
        this.pcmsys__Order__c = pcmsys__Order__c;
        this.pcmsys__Parent_Account__c = pcmsys__Parent_Account__c;
        this.pcmsys__Parent_Account__r = pcmsys__Parent_Account__r;
        this.pcmsys__Partner_Type__c = pcmsys__Partner_Type__c;
        this.pcmsys__Rollup_Account__c = pcmsys__Rollup_Account__c;
    }


    /**
     * Gets the attachments value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the pcmsys__Account_Category__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Account_Category__c
     */
    public java.lang.String getPcmsys__Account_Category__c() {
        return pcmsys__Account_Category__c;
    }


    /**
     * Sets the pcmsys__Account_Category__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Account_Category__c
     */
    public void setPcmsys__Account_Category__c(java.lang.String pcmsys__Account_Category__c) {
        this.pcmsys__Account_Category__c = pcmsys__Account_Category__c;
    }


    /**
     * Gets the pcmsys__Account_Name_Other__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Account_Name_Other__c
     */
    public java.lang.String getPcmsys__Account_Name_Other__c() {
        return pcmsys__Account_Name_Other__c;
    }


    /**
     * Sets the pcmsys__Account_Name_Other__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Account_Name_Other__c
     */
    public void setPcmsys__Account_Name_Other__c(java.lang.String pcmsys__Account_Name_Other__c) {
        this.pcmsys__Account_Name_Other__c = pcmsys__Account_Name_Other__c;
    }


    /**
     * Gets the pcmsys__Account_Name__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Account_Name__c
     */
    public java.lang.String getPcmsys__Account_Name__c() {
        return pcmsys__Account_Name__c;
    }


    /**
     * Sets the pcmsys__Account_Name__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Account_Name__c
     */
    public void setPcmsys__Account_Name__c(java.lang.String pcmsys__Account_Name__c) {
        this.pcmsys__Account_Name__c = pcmsys__Account_Name__c;
    }


    /**
     * Gets the pcmsys__Account_Number__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Account_Number__c
     */
    public java.lang.String getPcmsys__Account_Number__c() {
        return pcmsys__Account_Number__c;
    }


    /**
     * Sets the pcmsys__Account_Number__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Account_Number__c
     */
    public void setPcmsys__Account_Number__c(java.lang.String pcmsys__Account_Number__c) {
        this.pcmsys__Account_Number__c = pcmsys__Account_Number__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__CapManRegisteredName__c
     */
    public java.lang.String getPcmsys__CapManRegisteredName__c() {
        return pcmsys__CapManRegisteredName__c;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__CapManRegisteredName__c
     */
    public void setPcmsys__CapManRegisteredName__c(java.lang.String pcmsys__CapManRegisteredName__c) {
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__CapManRegisteredName__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getPcmsys__CapManRegisteredName__r() {
        return pcmsys__CapManRegisteredName__r;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__CapManRegisteredName__r
     */
    public void setPcmsys__CapManRegisteredName__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r) {
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
    }


    /**
     * Gets the pcmsys__Capital_Contribution_Account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Capital_Contribution_Account__c
     */
    public java.lang.Boolean getPcmsys__Capital_Contribution_Account__c() {
        return pcmsys__Capital_Contribution_Account__c;
    }


    /**
     * Sets the pcmsys__Capital_Contribution_Account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Capital_Contribution_Account__c
     */
    public void setPcmsys__Capital_Contribution_Account__c(java.lang.Boolean pcmsys__Capital_Contribution_Account__c) {
        this.pcmsys__Capital_Contribution_Account__c = pcmsys__Capital_Contribution_Account__c;
    }


    /**
     * Gets the pcmsys__Chart_of_Accounts__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Chart_of_Accounts__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Chart_of_Accounts__r() {
        return pcmsys__Chart_of_Accounts__r;
    }


    /**
     * Sets the pcmsys__Chart_of_Accounts__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Chart_of_Accounts__r
     */
    public void setPcmsys__Chart_of_Accounts__r(com.sforce.soap.enterprise.QueryResult pcmsys__Chart_of_Accounts__r) {
        this.pcmsys__Chart_of_Accounts__r = pcmsys__Chart_of_Accounts__r;
    }


    /**
     * Gets the pcmsys__Description__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Description__c
     */
    public java.lang.String getPcmsys__Description__c() {
        return pcmsys__Description__c;
    }


    /**
     * Sets the pcmsys__Description__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Description__c
     */
    public void setPcmsys__Description__c(java.lang.String pcmsys__Description__c) {
        this.pcmsys__Description__c = pcmsys__Description__c;
    }


    /**
     * Gets the pcmsys__Has_sub_account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Has_sub_account__c
     */
    public java.lang.Boolean getPcmsys__Has_sub_account__c() {
        return pcmsys__Has_sub_account__c;
    }


    /**
     * Sets the pcmsys__Has_sub_account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Has_sub_account__c
     */
    public void setPcmsys__Has_sub_account__c(java.lang.Boolean pcmsys__Has_sub_account__c) {
        this.pcmsys__Has_sub_account__c = pcmsys__Has_sub_account__c;
    }


    /**
     * Gets the pcmsys__Inactive__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Inactive__c
     */
    public java.lang.Boolean getPcmsys__Inactive__c() {
        return pcmsys__Inactive__c;
    }


    /**
     * Sets the pcmsys__Inactive__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Inactive__c
     */
    public void setPcmsys__Inactive__c(java.lang.Boolean pcmsys__Inactive__c) {
        this.pcmsys__Inactive__c = pcmsys__Inactive__c;
    }


    /**
     * Gets the pcmsys__Industry__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Industry__c
     */
    public java.lang.String getPcmsys__Industry__c() {
        return pcmsys__Industry__c;
    }


    /**
     * Sets the pcmsys__Industry__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Industry__c
     */
    public void setPcmsys__Industry__c(java.lang.String pcmsys__Industry__c) {
        this.pcmsys__Industry__c = pcmsys__Industry__c;
    }


    /**
     * Gets the pcmsys__Journal_Entry_Items__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Journal_Entry_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Journal_Entry_Items__r() {
        return pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Sets the pcmsys__Journal_Entry_Items__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Journal_Entry_Items__r
     */
    public void setPcmsys__Journal_Entry_Items__r(com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r) {
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Gets the pcmsys__Order__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Order__c
     */
    public java.lang.Double getPcmsys__Order__c() {
        return pcmsys__Order__c;
    }


    /**
     * Sets the pcmsys__Order__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Order__c
     */
    public void setPcmsys__Order__c(java.lang.Double pcmsys__Order__c) {
        this.pcmsys__Order__c = pcmsys__Order__c;
    }


    /**
     * Gets the pcmsys__Parent_Account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Parent_Account__c
     */
    public java.lang.String getPcmsys__Parent_Account__c() {
        return pcmsys__Parent_Account__c;
    }


    /**
     * Sets the pcmsys__Parent_Account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Parent_Account__c
     */
    public void setPcmsys__Parent_Account__c(java.lang.String pcmsys__Parent_Account__c) {
        this.pcmsys__Parent_Account__c = pcmsys__Parent_Account__c;
    }


    /**
     * Gets the pcmsys__Parent_Account__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Parent_Account__r
     */
    public com.sforce.soap.enterprise.sobject.Pcmsys__Chart_of_Accounts__c getPcmsys__Parent_Account__r() {
        return pcmsys__Parent_Account__r;
    }


    /**
     * Sets the pcmsys__Parent_Account__r value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Parent_Account__r
     */
    public void setPcmsys__Parent_Account__r(com.sforce.soap.enterprise.sobject.Pcmsys__Chart_of_Accounts__c pcmsys__Parent_Account__r) {
        this.pcmsys__Parent_Account__r = pcmsys__Parent_Account__r;
    }


    /**
     * Gets the pcmsys__Partner_Type__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Partner_Type__c
     */
    public java.lang.String getPcmsys__Partner_Type__c() {
        return pcmsys__Partner_Type__c;
    }


    /**
     * Sets the pcmsys__Partner_Type__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Partner_Type__c
     */
    public void setPcmsys__Partner_Type__c(java.lang.String pcmsys__Partner_Type__c) {
        this.pcmsys__Partner_Type__c = pcmsys__Partner_Type__c;
    }


    /**
     * Gets the pcmsys__Rollup_Account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @return pcmsys__Rollup_Account__c
     */
    public java.lang.String getPcmsys__Rollup_Account__c() {
        return pcmsys__Rollup_Account__c;
    }


    /**
     * Sets the pcmsys__Rollup_Account__c value for this Pcmsys__Chart_of_Accounts__c.
     * 
     * @param pcmsys__Rollup_Account__c
     */
    public void setPcmsys__Rollup_Account__c(java.lang.String pcmsys__Rollup_Account__c) {
        this.pcmsys__Rollup_Account__c = pcmsys__Rollup_Account__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pcmsys__Chart_of_Accounts__c)) return false;
        Pcmsys__Chart_of_Accounts__c other = (Pcmsys__Chart_of_Accounts__c) obj;
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
            ((this.pcmsys__Account_Category__c==null && other.getPcmsys__Account_Category__c()==null) || 
             (this.pcmsys__Account_Category__c!=null &&
              this.pcmsys__Account_Category__c.equals(other.getPcmsys__Account_Category__c()))) &&
            ((this.pcmsys__Account_Name_Other__c==null && other.getPcmsys__Account_Name_Other__c()==null) || 
             (this.pcmsys__Account_Name_Other__c!=null &&
              this.pcmsys__Account_Name_Other__c.equals(other.getPcmsys__Account_Name_Other__c()))) &&
            ((this.pcmsys__Account_Name__c==null && other.getPcmsys__Account_Name__c()==null) || 
             (this.pcmsys__Account_Name__c!=null &&
              this.pcmsys__Account_Name__c.equals(other.getPcmsys__Account_Name__c()))) &&
            ((this.pcmsys__Account_Number__c==null && other.getPcmsys__Account_Number__c()==null) || 
             (this.pcmsys__Account_Number__c!=null &&
              this.pcmsys__Account_Number__c.equals(other.getPcmsys__Account_Number__c()))) &&
            ((this.pcmsys__CapManRegisteredName__c==null && other.getPcmsys__CapManRegisteredName__c()==null) || 
             (this.pcmsys__CapManRegisteredName__c!=null &&
              this.pcmsys__CapManRegisteredName__c.equals(other.getPcmsys__CapManRegisteredName__c()))) &&
            ((this.pcmsys__CapManRegisteredName__r==null && other.getPcmsys__CapManRegisteredName__r()==null) || 
             (this.pcmsys__CapManRegisteredName__r!=null &&
              this.pcmsys__CapManRegisteredName__r.equals(other.getPcmsys__CapManRegisteredName__r()))) &&
            ((this.pcmsys__Capital_Contribution_Account__c==null && other.getPcmsys__Capital_Contribution_Account__c()==null) || 
             (this.pcmsys__Capital_Contribution_Account__c!=null &&
              this.pcmsys__Capital_Contribution_Account__c.equals(other.getPcmsys__Capital_Contribution_Account__c()))) &&
            ((this.pcmsys__Chart_of_Accounts__r==null && other.getPcmsys__Chart_of_Accounts__r()==null) || 
             (this.pcmsys__Chart_of_Accounts__r!=null &&
              this.pcmsys__Chart_of_Accounts__r.equals(other.getPcmsys__Chart_of_Accounts__r()))) &&
            ((this.pcmsys__Description__c==null && other.getPcmsys__Description__c()==null) || 
             (this.pcmsys__Description__c!=null &&
              this.pcmsys__Description__c.equals(other.getPcmsys__Description__c()))) &&
            ((this.pcmsys__Has_sub_account__c==null && other.getPcmsys__Has_sub_account__c()==null) || 
             (this.pcmsys__Has_sub_account__c!=null &&
              this.pcmsys__Has_sub_account__c.equals(other.getPcmsys__Has_sub_account__c()))) &&
            ((this.pcmsys__Inactive__c==null && other.getPcmsys__Inactive__c()==null) || 
             (this.pcmsys__Inactive__c!=null &&
              this.pcmsys__Inactive__c.equals(other.getPcmsys__Inactive__c()))) &&
            ((this.pcmsys__Industry__c==null && other.getPcmsys__Industry__c()==null) || 
             (this.pcmsys__Industry__c!=null &&
              this.pcmsys__Industry__c.equals(other.getPcmsys__Industry__c()))) &&
            ((this.pcmsys__Journal_Entry_Items__r==null && other.getPcmsys__Journal_Entry_Items__r()==null) || 
             (this.pcmsys__Journal_Entry_Items__r!=null &&
              this.pcmsys__Journal_Entry_Items__r.equals(other.getPcmsys__Journal_Entry_Items__r()))) &&
            ((this.pcmsys__Order__c==null && other.getPcmsys__Order__c()==null) || 
             (this.pcmsys__Order__c!=null &&
              this.pcmsys__Order__c.equals(other.getPcmsys__Order__c()))) &&
            ((this.pcmsys__Parent_Account__c==null && other.getPcmsys__Parent_Account__c()==null) || 
             (this.pcmsys__Parent_Account__c!=null &&
              this.pcmsys__Parent_Account__c.equals(other.getPcmsys__Parent_Account__c()))) &&
            ((this.pcmsys__Parent_Account__r==null && other.getPcmsys__Parent_Account__r()==null) || 
             (this.pcmsys__Parent_Account__r!=null &&
              this.pcmsys__Parent_Account__r.equals(other.getPcmsys__Parent_Account__r()))) &&
            ((this.pcmsys__Partner_Type__c==null && other.getPcmsys__Partner_Type__c()==null) || 
             (this.pcmsys__Partner_Type__c!=null &&
              this.pcmsys__Partner_Type__c.equals(other.getPcmsys__Partner_Type__c()))) &&
            ((this.pcmsys__Rollup_Account__c==null && other.getPcmsys__Rollup_Account__c()==null) || 
             (this.pcmsys__Rollup_Account__c!=null &&
              this.pcmsys__Rollup_Account__c.equals(other.getPcmsys__Rollup_Account__c())));
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
        if (getPcmsys__Account_Category__c() != null) {
            _hashCode += getPcmsys__Account_Category__c().hashCode();
        }
        if (getPcmsys__Account_Name_Other__c() != null) {
            _hashCode += getPcmsys__Account_Name_Other__c().hashCode();
        }
        if (getPcmsys__Account_Name__c() != null) {
            _hashCode += getPcmsys__Account_Name__c().hashCode();
        }
        if (getPcmsys__Account_Number__c() != null) {
            _hashCode += getPcmsys__Account_Number__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__c() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__r() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__r().hashCode();
        }
        if (getPcmsys__Capital_Contribution_Account__c() != null) {
            _hashCode += getPcmsys__Capital_Contribution_Account__c().hashCode();
        }
        if (getPcmsys__Chart_of_Accounts__r() != null) {
            _hashCode += getPcmsys__Chart_of_Accounts__r().hashCode();
        }
        if (getPcmsys__Description__c() != null) {
            _hashCode += getPcmsys__Description__c().hashCode();
        }
        if (getPcmsys__Has_sub_account__c() != null) {
            _hashCode += getPcmsys__Has_sub_account__c().hashCode();
        }
        if (getPcmsys__Inactive__c() != null) {
            _hashCode += getPcmsys__Inactive__c().hashCode();
        }
        if (getPcmsys__Industry__c() != null) {
            _hashCode += getPcmsys__Industry__c().hashCode();
        }
        if (getPcmsys__Journal_Entry_Items__r() != null) {
            _hashCode += getPcmsys__Journal_Entry_Items__r().hashCode();
        }
        if (getPcmsys__Order__c() != null) {
            _hashCode += getPcmsys__Order__c().hashCode();
        }
        if (getPcmsys__Parent_Account__c() != null) {
            _hashCode += getPcmsys__Parent_Account__c().hashCode();
        }
        if (getPcmsys__Parent_Account__r() != null) {
            _hashCode += getPcmsys__Parent_Account__r().hashCode();
        }
        if (getPcmsys__Partner_Type__c() != null) {
            _hashCode += getPcmsys__Partner_Type__c().hashCode();
        }
        if (getPcmsys__Rollup_Account__c() != null) {
            _hashCode += getPcmsys__Rollup_Account__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pcmsys__Chart_of_Accounts__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Chart_of_Accounts__c"));
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
        elemField.setFieldName("pcmsys__Account_Category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Account_Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Account_Name_Other__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Account_Name_Other__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Account_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Account_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Account_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Account_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pcmsys__Capital_Contribution_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Capital_Contribution_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Chart_of_Accounts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Chart_of_Accounts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Has_sub_account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Has_sub_account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Inactive__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Inactive__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Industry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Industry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Journal_Entry_Items__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Journal_Entry_Items__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Parent_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Parent_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Parent_Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Parent_Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Chart_of_Accounts__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Partner_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Partner_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Rollup_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Rollup_Account__c"));
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
