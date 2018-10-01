/**
 * Pcmsys__Journal_Entries__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Pcmsys__Journal_Entries__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.Double pcmsys__Automatic_steps__c;

    private java.util.Date pcmsys__Date__c;

    private java.lang.Boolean pcmsys__Distribute_GP__c;

    private java.lang.Boolean pcmsys__Distribute_LP__c;

    private java.lang.String pcmsys__Fund__c;

    private com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Fund__r;

    private java.lang.Double pcmsys__Items_Count__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r;

    private java.lang.Double pcmsys__Maximum_Amount__c;

    private java.lang.String pcmsys__Memo__c;

    private java.lang.Boolean pcmsys__Memorized_Transaction__c;

    private java.lang.String pcmsys__PayoutOrder__c;

    private java.lang.Boolean pcmsys__Pro_rata_allocation__c;

    private java.lang.String pcmsys__Recurring_Entry__c;

    private java.lang.String pcmsys__Transaction_Name__c;

    private java.lang.String pcmsys__Type__c;

    public Pcmsys__Journal_Entries__c() {
    }

    public Pcmsys__Journal_Entries__c(
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
           java.lang.Double pcmsys__Automatic_steps__c,
           java.util.Date pcmsys__Date__c,
           java.lang.Boolean pcmsys__Distribute_GP__c,
           java.lang.Boolean pcmsys__Distribute_LP__c,
           java.lang.String pcmsys__Fund__c,
           com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Fund__r,
           java.lang.Double pcmsys__Items_Count__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r,
           java.lang.Double pcmsys__Maximum_Amount__c,
           java.lang.String pcmsys__Memo__c,
           java.lang.Boolean pcmsys__Memorized_Transaction__c,
           java.lang.String pcmsys__PayoutOrder__c,
           java.lang.Boolean pcmsys__Pro_rata_allocation__c,
           java.lang.String pcmsys__Recurring_Entry__c,
           java.lang.String pcmsys__Transaction_Name__c,
           java.lang.String pcmsys__Type__c) {
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
        this.pcmsys__Automatic_steps__c = pcmsys__Automatic_steps__c;
        this.pcmsys__Date__c = pcmsys__Date__c;
        this.pcmsys__Distribute_GP__c = pcmsys__Distribute_GP__c;
        this.pcmsys__Distribute_LP__c = pcmsys__Distribute_LP__c;
        this.pcmsys__Fund__c = pcmsys__Fund__c;
        this.pcmsys__Fund__r = pcmsys__Fund__r;
        this.pcmsys__Items_Count__c = pcmsys__Items_Count__c;
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
        this.pcmsys__Maximum_Amount__c = pcmsys__Maximum_Amount__c;
        this.pcmsys__Memo__c = pcmsys__Memo__c;
        this.pcmsys__Memorized_Transaction__c = pcmsys__Memorized_Transaction__c;
        this.pcmsys__PayoutOrder__c = pcmsys__PayoutOrder__c;
        this.pcmsys__Pro_rata_allocation__c = pcmsys__Pro_rata_allocation__c;
        this.pcmsys__Recurring_Entry__c = pcmsys__Recurring_Entry__c;
        this.pcmsys__Transaction_Name__c = pcmsys__Transaction_Name__c;
        this.pcmsys__Type__c = pcmsys__Type__c;
    }


    /**
     * Gets the attachments value for this Pcmsys__Journal_Entries__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Pcmsys__Journal_Entries__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Pcmsys__Journal_Entries__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Pcmsys__Journal_Entries__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Pcmsys__Journal_Entries__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Pcmsys__Journal_Entries__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Pcmsys__Journal_Entries__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Pcmsys__Journal_Entries__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this Pcmsys__Journal_Entries__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this Pcmsys__Journal_Entries__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Pcmsys__Journal_Entries__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Pcmsys__Journal_Entries__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Pcmsys__Journal_Entries__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Pcmsys__Journal_Entries__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Pcmsys__Journal_Entries__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Pcmsys__Journal_Entries__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Pcmsys__Journal_Entries__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Pcmsys__Journal_Entries__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Pcmsys__Journal_Entries__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Pcmsys__Journal_Entries__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Pcmsys__Journal_Entries__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Pcmsys__Journal_Entries__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Pcmsys__Journal_Entries__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Pcmsys__Journal_Entries__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Pcmsys__Journal_Entries__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Pcmsys__Journal_Entries__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Pcmsys__Journal_Entries__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Pcmsys__Journal_Entries__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Pcmsys__Journal_Entries__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Pcmsys__Journal_Entries__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Pcmsys__Journal_Entries__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Pcmsys__Journal_Entries__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Pcmsys__Journal_Entries__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Pcmsys__Journal_Entries__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Pcmsys__Journal_Entries__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Pcmsys__Journal_Entries__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the pcmsys__Automatic_steps__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Automatic_steps__c
     */
    public java.lang.Double getPcmsys__Automatic_steps__c() {
        return pcmsys__Automatic_steps__c;
    }


    /**
     * Sets the pcmsys__Automatic_steps__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Automatic_steps__c
     */
    public void setPcmsys__Automatic_steps__c(java.lang.Double pcmsys__Automatic_steps__c) {
        this.pcmsys__Automatic_steps__c = pcmsys__Automatic_steps__c;
    }


    /**
     * Gets the pcmsys__Date__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Date__c
     */
    public java.util.Date getPcmsys__Date__c() {
        return pcmsys__Date__c;
    }


    /**
     * Sets the pcmsys__Date__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Date__c
     */
    public void setPcmsys__Date__c(java.util.Date pcmsys__Date__c) {
        this.pcmsys__Date__c = pcmsys__Date__c;
    }


    /**
     * Gets the pcmsys__Distribute_GP__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Distribute_GP__c
     */
    public java.lang.Boolean getPcmsys__Distribute_GP__c() {
        return pcmsys__Distribute_GP__c;
    }


    /**
     * Sets the pcmsys__Distribute_GP__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Distribute_GP__c
     */
    public void setPcmsys__Distribute_GP__c(java.lang.Boolean pcmsys__Distribute_GP__c) {
        this.pcmsys__Distribute_GP__c = pcmsys__Distribute_GP__c;
    }


    /**
     * Gets the pcmsys__Distribute_LP__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Distribute_LP__c
     */
    public java.lang.Boolean getPcmsys__Distribute_LP__c() {
        return pcmsys__Distribute_LP__c;
    }


    /**
     * Sets the pcmsys__Distribute_LP__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Distribute_LP__c
     */
    public void setPcmsys__Distribute_LP__c(java.lang.Boolean pcmsys__Distribute_LP__c) {
        this.pcmsys__Distribute_LP__c = pcmsys__Distribute_LP__c;
    }


    /**
     * Gets the pcmsys__Fund__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Fund__c
     */
    public java.lang.String getPcmsys__Fund__c() {
        return pcmsys__Fund__c;
    }


    /**
     * Sets the pcmsys__Fund__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Fund__c
     */
    public void setPcmsys__Fund__c(java.lang.String pcmsys__Fund__c) {
        this.pcmsys__Fund__c = pcmsys__Fund__c;
    }


    /**
     * Gets the pcmsys__Fund__r value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Fund__r
     */
    public com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c getPcmsys__Fund__r() {
        return pcmsys__Fund__r;
    }


    /**
     * Sets the pcmsys__Fund__r value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Fund__r
     */
    public void setPcmsys__Fund__r(com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Fund__r) {
        this.pcmsys__Fund__r = pcmsys__Fund__r;
    }


    /**
     * Gets the pcmsys__Items_Count__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Items_Count__c
     */
    public java.lang.Double getPcmsys__Items_Count__c() {
        return pcmsys__Items_Count__c;
    }


    /**
     * Sets the pcmsys__Items_Count__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Items_Count__c
     */
    public void setPcmsys__Items_Count__c(java.lang.Double pcmsys__Items_Count__c) {
        this.pcmsys__Items_Count__c = pcmsys__Items_Count__c;
    }


    /**
     * Gets the pcmsys__Journal_Entry_Items__r value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Journal_Entry_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Journal_Entry_Items__r() {
        return pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Sets the pcmsys__Journal_Entry_Items__r value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Journal_Entry_Items__r
     */
    public void setPcmsys__Journal_Entry_Items__r(com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r) {
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Gets the pcmsys__Maximum_Amount__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Maximum_Amount__c
     */
    public java.lang.Double getPcmsys__Maximum_Amount__c() {
        return pcmsys__Maximum_Amount__c;
    }


    /**
     * Sets the pcmsys__Maximum_Amount__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Maximum_Amount__c
     */
    public void setPcmsys__Maximum_Amount__c(java.lang.Double pcmsys__Maximum_Amount__c) {
        this.pcmsys__Maximum_Amount__c = pcmsys__Maximum_Amount__c;
    }


    /**
     * Gets the pcmsys__Memo__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Memo__c
     */
    public java.lang.String getPcmsys__Memo__c() {
        return pcmsys__Memo__c;
    }


    /**
     * Sets the pcmsys__Memo__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Memo__c
     */
    public void setPcmsys__Memo__c(java.lang.String pcmsys__Memo__c) {
        this.pcmsys__Memo__c = pcmsys__Memo__c;
    }


    /**
     * Gets the pcmsys__Memorized_Transaction__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Memorized_Transaction__c
     */
    public java.lang.Boolean getPcmsys__Memorized_Transaction__c() {
        return pcmsys__Memorized_Transaction__c;
    }


    /**
     * Sets the pcmsys__Memorized_Transaction__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Memorized_Transaction__c
     */
    public void setPcmsys__Memorized_Transaction__c(java.lang.Boolean pcmsys__Memorized_Transaction__c) {
        this.pcmsys__Memorized_Transaction__c = pcmsys__Memorized_Transaction__c;
    }


    /**
     * Gets the pcmsys__PayoutOrder__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__PayoutOrder__c
     */
    public java.lang.String getPcmsys__PayoutOrder__c() {
        return pcmsys__PayoutOrder__c;
    }


    /**
     * Sets the pcmsys__PayoutOrder__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__PayoutOrder__c
     */
    public void setPcmsys__PayoutOrder__c(java.lang.String pcmsys__PayoutOrder__c) {
        this.pcmsys__PayoutOrder__c = pcmsys__PayoutOrder__c;
    }


    /**
     * Gets the pcmsys__Pro_rata_allocation__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Pro_rata_allocation__c
     */
    public java.lang.Boolean getPcmsys__Pro_rata_allocation__c() {
        return pcmsys__Pro_rata_allocation__c;
    }


    /**
     * Sets the pcmsys__Pro_rata_allocation__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Pro_rata_allocation__c
     */
    public void setPcmsys__Pro_rata_allocation__c(java.lang.Boolean pcmsys__Pro_rata_allocation__c) {
        this.pcmsys__Pro_rata_allocation__c = pcmsys__Pro_rata_allocation__c;
    }


    /**
     * Gets the pcmsys__Recurring_Entry__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Recurring_Entry__c
     */
    public java.lang.String getPcmsys__Recurring_Entry__c() {
        return pcmsys__Recurring_Entry__c;
    }


    /**
     * Sets the pcmsys__Recurring_Entry__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Recurring_Entry__c
     */
    public void setPcmsys__Recurring_Entry__c(java.lang.String pcmsys__Recurring_Entry__c) {
        this.pcmsys__Recurring_Entry__c = pcmsys__Recurring_Entry__c;
    }


    /**
     * Gets the pcmsys__Transaction_Name__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Transaction_Name__c
     */
    public java.lang.String getPcmsys__Transaction_Name__c() {
        return pcmsys__Transaction_Name__c;
    }


    /**
     * Sets the pcmsys__Transaction_Name__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Transaction_Name__c
     */
    public void setPcmsys__Transaction_Name__c(java.lang.String pcmsys__Transaction_Name__c) {
        this.pcmsys__Transaction_Name__c = pcmsys__Transaction_Name__c;
    }


    /**
     * Gets the pcmsys__Type__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @return pcmsys__Type__c
     */
    public java.lang.String getPcmsys__Type__c() {
        return pcmsys__Type__c;
    }


    /**
     * Sets the pcmsys__Type__c value for this Pcmsys__Journal_Entries__c.
     * 
     * @param pcmsys__Type__c
     */
    public void setPcmsys__Type__c(java.lang.String pcmsys__Type__c) {
        this.pcmsys__Type__c = pcmsys__Type__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pcmsys__Journal_Entries__c)) return false;
        Pcmsys__Journal_Entries__c other = (Pcmsys__Journal_Entries__c) obj;
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
            ((this.pcmsys__Automatic_steps__c==null && other.getPcmsys__Automatic_steps__c()==null) || 
             (this.pcmsys__Automatic_steps__c!=null &&
              this.pcmsys__Automatic_steps__c.equals(other.getPcmsys__Automatic_steps__c()))) &&
            ((this.pcmsys__Date__c==null && other.getPcmsys__Date__c()==null) || 
             (this.pcmsys__Date__c!=null &&
              this.pcmsys__Date__c.equals(other.getPcmsys__Date__c()))) &&
            ((this.pcmsys__Distribute_GP__c==null && other.getPcmsys__Distribute_GP__c()==null) || 
             (this.pcmsys__Distribute_GP__c!=null &&
              this.pcmsys__Distribute_GP__c.equals(other.getPcmsys__Distribute_GP__c()))) &&
            ((this.pcmsys__Distribute_LP__c==null && other.getPcmsys__Distribute_LP__c()==null) || 
             (this.pcmsys__Distribute_LP__c!=null &&
              this.pcmsys__Distribute_LP__c.equals(other.getPcmsys__Distribute_LP__c()))) &&
            ((this.pcmsys__Fund__c==null && other.getPcmsys__Fund__c()==null) || 
             (this.pcmsys__Fund__c!=null &&
              this.pcmsys__Fund__c.equals(other.getPcmsys__Fund__c()))) &&
            ((this.pcmsys__Fund__r==null && other.getPcmsys__Fund__r()==null) || 
             (this.pcmsys__Fund__r!=null &&
              this.pcmsys__Fund__r.equals(other.getPcmsys__Fund__r()))) &&
            ((this.pcmsys__Items_Count__c==null && other.getPcmsys__Items_Count__c()==null) || 
             (this.pcmsys__Items_Count__c!=null &&
              this.pcmsys__Items_Count__c.equals(other.getPcmsys__Items_Count__c()))) &&
            ((this.pcmsys__Journal_Entry_Items__r==null && other.getPcmsys__Journal_Entry_Items__r()==null) || 
             (this.pcmsys__Journal_Entry_Items__r!=null &&
              this.pcmsys__Journal_Entry_Items__r.equals(other.getPcmsys__Journal_Entry_Items__r()))) &&
            ((this.pcmsys__Maximum_Amount__c==null && other.getPcmsys__Maximum_Amount__c()==null) || 
             (this.pcmsys__Maximum_Amount__c!=null &&
              this.pcmsys__Maximum_Amount__c.equals(other.getPcmsys__Maximum_Amount__c()))) &&
            ((this.pcmsys__Memo__c==null && other.getPcmsys__Memo__c()==null) || 
             (this.pcmsys__Memo__c!=null &&
              this.pcmsys__Memo__c.equals(other.getPcmsys__Memo__c()))) &&
            ((this.pcmsys__Memorized_Transaction__c==null && other.getPcmsys__Memorized_Transaction__c()==null) || 
             (this.pcmsys__Memorized_Transaction__c!=null &&
              this.pcmsys__Memorized_Transaction__c.equals(other.getPcmsys__Memorized_Transaction__c()))) &&
            ((this.pcmsys__PayoutOrder__c==null && other.getPcmsys__PayoutOrder__c()==null) || 
             (this.pcmsys__PayoutOrder__c!=null &&
              this.pcmsys__PayoutOrder__c.equals(other.getPcmsys__PayoutOrder__c()))) &&
            ((this.pcmsys__Pro_rata_allocation__c==null && other.getPcmsys__Pro_rata_allocation__c()==null) || 
             (this.pcmsys__Pro_rata_allocation__c!=null &&
              this.pcmsys__Pro_rata_allocation__c.equals(other.getPcmsys__Pro_rata_allocation__c()))) &&
            ((this.pcmsys__Recurring_Entry__c==null && other.getPcmsys__Recurring_Entry__c()==null) || 
             (this.pcmsys__Recurring_Entry__c!=null &&
              this.pcmsys__Recurring_Entry__c.equals(other.getPcmsys__Recurring_Entry__c()))) &&
            ((this.pcmsys__Transaction_Name__c==null && other.getPcmsys__Transaction_Name__c()==null) || 
             (this.pcmsys__Transaction_Name__c!=null &&
              this.pcmsys__Transaction_Name__c.equals(other.getPcmsys__Transaction_Name__c()))) &&
            ((this.pcmsys__Type__c==null && other.getPcmsys__Type__c()==null) || 
             (this.pcmsys__Type__c!=null &&
              this.pcmsys__Type__c.equals(other.getPcmsys__Type__c())));
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
        if (getPcmsys__Automatic_steps__c() != null) {
            _hashCode += getPcmsys__Automatic_steps__c().hashCode();
        }
        if (getPcmsys__Date__c() != null) {
            _hashCode += getPcmsys__Date__c().hashCode();
        }
        if (getPcmsys__Distribute_GP__c() != null) {
            _hashCode += getPcmsys__Distribute_GP__c().hashCode();
        }
        if (getPcmsys__Distribute_LP__c() != null) {
            _hashCode += getPcmsys__Distribute_LP__c().hashCode();
        }
        if (getPcmsys__Fund__c() != null) {
            _hashCode += getPcmsys__Fund__c().hashCode();
        }
        if (getPcmsys__Fund__r() != null) {
            _hashCode += getPcmsys__Fund__r().hashCode();
        }
        if (getPcmsys__Items_Count__c() != null) {
            _hashCode += getPcmsys__Items_Count__c().hashCode();
        }
        if (getPcmsys__Journal_Entry_Items__r() != null) {
            _hashCode += getPcmsys__Journal_Entry_Items__r().hashCode();
        }
        if (getPcmsys__Maximum_Amount__c() != null) {
            _hashCode += getPcmsys__Maximum_Amount__c().hashCode();
        }
        if (getPcmsys__Memo__c() != null) {
            _hashCode += getPcmsys__Memo__c().hashCode();
        }
        if (getPcmsys__Memorized_Transaction__c() != null) {
            _hashCode += getPcmsys__Memorized_Transaction__c().hashCode();
        }
        if (getPcmsys__PayoutOrder__c() != null) {
            _hashCode += getPcmsys__PayoutOrder__c().hashCode();
        }
        if (getPcmsys__Pro_rata_allocation__c() != null) {
            _hashCode += getPcmsys__Pro_rata_allocation__c().hashCode();
        }
        if (getPcmsys__Recurring_Entry__c() != null) {
            _hashCode += getPcmsys__Recurring_Entry__c().hashCode();
        }
        if (getPcmsys__Transaction_Name__c() != null) {
            _hashCode += getPcmsys__Transaction_Name__c().hashCode();
        }
        if (getPcmsys__Type__c() != null) {
            _hashCode += getPcmsys__Type__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pcmsys__Journal_Entries__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Journal_Entries__c"));
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
        elemField.setFieldName("pcmsys__Automatic_steps__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Automatic_steps__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("pcmsys__Distribute_GP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Distribute_GP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Distribute_LP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Distribute_LP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("pcmsys__Items_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Items_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("pcmsys__Maximum_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Maximum_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Memo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Memo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Memorized_Transaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Memorized_Transaction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__PayoutOrder__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__PayoutOrder__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Pro_rata_allocation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Pro_rata_allocation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Recurring_Entry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Recurring_Entry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Transaction_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Transaction_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
