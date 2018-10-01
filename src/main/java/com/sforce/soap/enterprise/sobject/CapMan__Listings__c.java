/**
 * CapMan__Listings__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Listings__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Action__c;

    private java.lang.String capMan__Certificate__c;

    private java.util.Date capMan__Expiration_Date__c;

    private java.util.Date capMan__First_refusal_expiration_date__c;

    private java.lang.String capMan__Issuer__c;

    private java.lang.String capMan__Owner_Investor__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Owner_Investor__r;

    private java.lang.String capMan__Registered_Investor__c;

    private java.lang.String capMan__RightofFirstRefusal__c;

    private java.lang.String capMan__Security_Name__c;

    private java.lang.String capMan__Security_Transaction__c;

    private com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Security_Transaction__r;

    private java.lang.Double capMan__SharePrice2__c;

    private java.lang.Double capMan__SharePrice__c;

    private java.lang.Double capMan__Shares__c;

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

    public CapMan__Listings__c() {
    }

    public CapMan__Listings__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Action__c,
           java.lang.String capMan__Certificate__c,
           java.util.Date capMan__Expiration_Date__c,
           java.util.Date capMan__First_refusal_expiration_date__c,
           java.lang.String capMan__Issuer__c,
           java.lang.String capMan__Owner_Investor__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Owner_Investor__r,
           java.lang.String capMan__Registered_Investor__c,
           java.lang.String capMan__RightofFirstRefusal__c,
           java.lang.String capMan__Security_Name__c,
           java.lang.String capMan__Security_Transaction__c,
           com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Security_Transaction__r,
           java.lang.Double capMan__SharePrice2__c,
           java.lang.Double capMan__SharePrice__c,
           java.lang.Double capMan__Shares__c,
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
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.capMan__Action__c = capMan__Action__c;
        this.capMan__Certificate__c = capMan__Certificate__c;
        this.capMan__Expiration_Date__c = capMan__Expiration_Date__c;
        this.capMan__First_refusal_expiration_date__c = capMan__First_refusal_expiration_date__c;
        this.capMan__Issuer__c = capMan__Issuer__c;
        this.capMan__Owner_Investor__c = capMan__Owner_Investor__c;
        this.capMan__Owner_Investor__r = capMan__Owner_Investor__r;
        this.capMan__Registered_Investor__c = capMan__Registered_Investor__c;
        this.capMan__RightofFirstRefusal__c = capMan__RightofFirstRefusal__c;
        this.capMan__Security_Name__c = capMan__Security_Name__c;
        this.capMan__Security_Transaction__c = capMan__Security_Transaction__c;
        this.capMan__Security_Transaction__r = capMan__Security_Transaction__r;
        this.capMan__SharePrice2__c = capMan__SharePrice2__c;
        this.capMan__SharePrice__c = capMan__SharePrice__c;
        this.capMan__Shares__c = capMan__Shares__c;
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
    }


    /**
     * Gets the attachments value for this CapMan__Listings__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Listings__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Action__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Action__c
     */
    public java.lang.String getCapMan__Action__c() {
        return capMan__Action__c;
    }


    /**
     * Sets the capMan__Action__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Action__c
     */
    public void setCapMan__Action__c(java.lang.String capMan__Action__c) {
        this.capMan__Action__c = capMan__Action__c;
    }


    /**
     * Gets the capMan__Certificate__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Certificate__c
     */
    public java.lang.String getCapMan__Certificate__c() {
        return capMan__Certificate__c;
    }


    /**
     * Sets the capMan__Certificate__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Certificate__c
     */
    public void setCapMan__Certificate__c(java.lang.String capMan__Certificate__c) {
        this.capMan__Certificate__c = capMan__Certificate__c;
    }


    /**
     * Gets the capMan__Expiration_Date__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Expiration_Date__c
     */
    public java.util.Date getCapMan__Expiration_Date__c() {
        return capMan__Expiration_Date__c;
    }


    /**
     * Sets the capMan__Expiration_Date__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Expiration_Date__c
     */
    public void setCapMan__Expiration_Date__c(java.util.Date capMan__Expiration_Date__c) {
        this.capMan__Expiration_Date__c = capMan__Expiration_Date__c;
    }


    /**
     * Gets the capMan__First_refusal_expiration_date__c value for this CapMan__Listings__c.
     * 
     * @return capMan__First_refusal_expiration_date__c
     */
    public java.util.Date getCapMan__First_refusal_expiration_date__c() {
        return capMan__First_refusal_expiration_date__c;
    }


    /**
     * Sets the capMan__First_refusal_expiration_date__c value for this CapMan__Listings__c.
     * 
     * @param capMan__First_refusal_expiration_date__c
     */
    public void setCapMan__First_refusal_expiration_date__c(java.util.Date capMan__First_refusal_expiration_date__c) {
        this.capMan__First_refusal_expiration_date__c = capMan__First_refusal_expiration_date__c;
    }


    /**
     * Gets the capMan__Issuer__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Issuer__c
     */
    public java.lang.String getCapMan__Issuer__c() {
        return capMan__Issuer__c;
    }


    /**
     * Sets the capMan__Issuer__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Issuer__c
     */
    public void setCapMan__Issuer__c(java.lang.String capMan__Issuer__c) {
        this.capMan__Issuer__c = capMan__Issuer__c;
    }


    /**
     * Gets the capMan__Owner_Investor__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Owner_Investor__c
     */
    public java.lang.String getCapMan__Owner_Investor__c() {
        return capMan__Owner_Investor__c;
    }


    /**
     * Sets the capMan__Owner_Investor__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Owner_Investor__c
     */
    public void setCapMan__Owner_Investor__c(java.lang.String capMan__Owner_Investor__c) {
        this.capMan__Owner_Investor__c = capMan__Owner_Investor__c;
    }


    /**
     * Gets the capMan__Owner_Investor__r value for this CapMan__Listings__c.
     * 
     * @return capMan__Owner_Investor__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getCapMan__Owner_Investor__r() {
        return capMan__Owner_Investor__r;
    }


    /**
     * Sets the capMan__Owner_Investor__r value for this CapMan__Listings__c.
     * 
     * @param capMan__Owner_Investor__r
     */
    public void setCapMan__Owner_Investor__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Owner_Investor__r) {
        this.capMan__Owner_Investor__r = capMan__Owner_Investor__r;
    }


    /**
     * Gets the capMan__Registered_Investor__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Registered_Investor__c
     */
    public java.lang.String getCapMan__Registered_Investor__c() {
        return capMan__Registered_Investor__c;
    }


    /**
     * Sets the capMan__Registered_Investor__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Registered_Investor__c
     */
    public void setCapMan__Registered_Investor__c(java.lang.String capMan__Registered_Investor__c) {
        this.capMan__Registered_Investor__c = capMan__Registered_Investor__c;
    }


    /**
     * Gets the capMan__RightofFirstRefusal__c value for this CapMan__Listings__c.
     * 
     * @return capMan__RightofFirstRefusal__c
     */
    public java.lang.String getCapMan__RightofFirstRefusal__c() {
        return capMan__RightofFirstRefusal__c;
    }


    /**
     * Sets the capMan__RightofFirstRefusal__c value for this CapMan__Listings__c.
     * 
     * @param capMan__RightofFirstRefusal__c
     */
    public void setCapMan__RightofFirstRefusal__c(java.lang.String capMan__RightofFirstRefusal__c) {
        this.capMan__RightofFirstRefusal__c = capMan__RightofFirstRefusal__c;
    }


    /**
     * Gets the capMan__Security_Name__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Security_Name__c
     */
    public java.lang.String getCapMan__Security_Name__c() {
        return capMan__Security_Name__c;
    }


    /**
     * Sets the capMan__Security_Name__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Security_Name__c
     */
    public void setCapMan__Security_Name__c(java.lang.String capMan__Security_Name__c) {
        this.capMan__Security_Name__c = capMan__Security_Name__c;
    }


    /**
     * Gets the capMan__Security_Transaction__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Security_Transaction__c
     */
    public java.lang.String getCapMan__Security_Transaction__c() {
        return capMan__Security_Transaction__c;
    }


    /**
     * Sets the capMan__Security_Transaction__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Security_Transaction__c
     */
    public void setCapMan__Security_Transaction__c(java.lang.String capMan__Security_Transaction__c) {
        this.capMan__Security_Transaction__c = capMan__Security_Transaction__c;
    }


    /**
     * Gets the capMan__Security_Transaction__r value for this CapMan__Listings__c.
     * 
     * @return capMan__Security_Transaction__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c getCapMan__Security_Transaction__r() {
        return capMan__Security_Transaction__r;
    }


    /**
     * Sets the capMan__Security_Transaction__r value for this CapMan__Listings__c.
     * 
     * @param capMan__Security_Transaction__r
     */
    public void setCapMan__Security_Transaction__r(com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Security_Transaction__r) {
        this.capMan__Security_Transaction__r = capMan__Security_Transaction__r;
    }


    /**
     * Gets the capMan__SharePrice2__c value for this CapMan__Listings__c.
     * 
     * @return capMan__SharePrice2__c
     */
    public java.lang.Double getCapMan__SharePrice2__c() {
        return capMan__SharePrice2__c;
    }


    /**
     * Sets the capMan__SharePrice2__c value for this CapMan__Listings__c.
     * 
     * @param capMan__SharePrice2__c
     */
    public void setCapMan__SharePrice2__c(java.lang.Double capMan__SharePrice2__c) {
        this.capMan__SharePrice2__c = capMan__SharePrice2__c;
    }


    /**
     * Gets the capMan__SharePrice__c value for this CapMan__Listings__c.
     * 
     * @return capMan__SharePrice__c
     */
    public java.lang.Double getCapMan__SharePrice__c() {
        return capMan__SharePrice__c;
    }


    /**
     * Sets the capMan__SharePrice__c value for this CapMan__Listings__c.
     * 
     * @param capMan__SharePrice__c
     */
    public void setCapMan__SharePrice__c(java.lang.Double capMan__SharePrice__c) {
        this.capMan__SharePrice__c = capMan__SharePrice__c;
    }


    /**
     * Gets the capMan__Shares__c value for this CapMan__Listings__c.
     * 
     * @return capMan__Shares__c
     */
    public java.lang.Double getCapMan__Shares__c() {
        return capMan__Shares__c;
    }


    /**
     * Sets the capMan__Shares__c value for this CapMan__Listings__c.
     * 
     * @param capMan__Shares__c
     */
    public void setCapMan__Shares__c(java.lang.Double capMan__Shares__c) {
        this.capMan__Shares__c = capMan__Shares__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Listings__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Listings__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Listings__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Listings__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Listings__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Listings__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Listings__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Listings__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Listings__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Listings__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Listings__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Listings__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Listings__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Listings__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Listings__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Listings__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Listings__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Listings__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Listings__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Listings__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Listings__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Listings__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Listings__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Listings__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this CapMan__Listings__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__Listings__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__Listings__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__Listings__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__Listings__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Listings__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Listings__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Listings__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Listings__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Listings__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Listings__c)) return false;
        CapMan__Listings__c other = (CapMan__Listings__c) obj;
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
            ((this.capMan__Action__c==null && other.getCapMan__Action__c()==null) || 
             (this.capMan__Action__c!=null &&
              this.capMan__Action__c.equals(other.getCapMan__Action__c()))) &&
            ((this.capMan__Certificate__c==null && other.getCapMan__Certificate__c()==null) || 
             (this.capMan__Certificate__c!=null &&
              this.capMan__Certificate__c.equals(other.getCapMan__Certificate__c()))) &&
            ((this.capMan__Expiration_Date__c==null && other.getCapMan__Expiration_Date__c()==null) || 
             (this.capMan__Expiration_Date__c!=null &&
              this.capMan__Expiration_Date__c.equals(other.getCapMan__Expiration_Date__c()))) &&
            ((this.capMan__First_refusal_expiration_date__c==null && other.getCapMan__First_refusal_expiration_date__c()==null) || 
             (this.capMan__First_refusal_expiration_date__c!=null &&
              this.capMan__First_refusal_expiration_date__c.equals(other.getCapMan__First_refusal_expiration_date__c()))) &&
            ((this.capMan__Issuer__c==null && other.getCapMan__Issuer__c()==null) || 
             (this.capMan__Issuer__c!=null &&
              this.capMan__Issuer__c.equals(other.getCapMan__Issuer__c()))) &&
            ((this.capMan__Owner_Investor__c==null && other.getCapMan__Owner_Investor__c()==null) || 
             (this.capMan__Owner_Investor__c!=null &&
              this.capMan__Owner_Investor__c.equals(other.getCapMan__Owner_Investor__c()))) &&
            ((this.capMan__Owner_Investor__r==null && other.getCapMan__Owner_Investor__r()==null) || 
             (this.capMan__Owner_Investor__r!=null &&
              this.capMan__Owner_Investor__r.equals(other.getCapMan__Owner_Investor__r()))) &&
            ((this.capMan__Registered_Investor__c==null && other.getCapMan__Registered_Investor__c()==null) || 
             (this.capMan__Registered_Investor__c!=null &&
              this.capMan__Registered_Investor__c.equals(other.getCapMan__Registered_Investor__c()))) &&
            ((this.capMan__RightofFirstRefusal__c==null && other.getCapMan__RightofFirstRefusal__c()==null) || 
             (this.capMan__RightofFirstRefusal__c!=null &&
              this.capMan__RightofFirstRefusal__c.equals(other.getCapMan__RightofFirstRefusal__c()))) &&
            ((this.capMan__Security_Name__c==null && other.getCapMan__Security_Name__c()==null) || 
             (this.capMan__Security_Name__c!=null &&
              this.capMan__Security_Name__c.equals(other.getCapMan__Security_Name__c()))) &&
            ((this.capMan__Security_Transaction__c==null && other.getCapMan__Security_Transaction__c()==null) || 
             (this.capMan__Security_Transaction__c!=null &&
              this.capMan__Security_Transaction__c.equals(other.getCapMan__Security_Transaction__c()))) &&
            ((this.capMan__Security_Transaction__r==null && other.getCapMan__Security_Transaction__r()==null) || 
             (this.capMan__Security_Transaction__r!=null &&
              this.capMan__Security_Transaction__r.equals(other.getCapMan__Security_Transaction__r()))) &&
            ((this.capMan__SharePrice2__c==null && other.getCapMan__SharePrice2__c()==null) || 
             (this.capMan__SharePrice2__c!=null &&
              this.capMan__SharePrice2__c.equals(other.getCapMan__SharePrice2__c()))) &&
            ((this.capMan__SharePrice__c==null && other.getCapMan__SharePrice__c()==null) || 
             (this.capMan__SharePrice__c!=null &&
              this.capMan__SharePrice__c.equals(other.getCapMan__SharePrice__c()))) &&
            ((this.capMan__Shares__c==null && other.getCapMan__Shares__c()==null) || 
             (this.capMan__Shares__c!=null &&
              this.capMan__Shares__c.equals(other.getCapMan__Shares__c()))) &&
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
        if (getCapMan__Action__c() != null) {
            _hashCode += getCapMan__Action__c().hashCode();
        }
        if (getCapMan__Certificate__c() != null) {
            _hashCode += getCapMan__Certificate__c().hashCode();
        }
        if (getCapMan__Expiration_Date__c() != null) {
            _hashCode += getCapMan__Expiration_Date__c().hashCode();
        }
        if (getCapMan__First_refusal_expiration_date__c() != null) {
            _hashCode += getCapMan__First_refusal_expiration_date__c().hashCode();
        }
        if (getCapMan__Issuer__c() != null) {
            _hashCode += getCapMan__Issuer__c().hashCode();
        }
        if (getCapMan__Owner_Investor__c() != null) {
            _hashCode += getCapMan__Owner_Investor__c().hashCode();
        }
        if (getCapMan__Owner_Investor__r() != null) {
            _hashCode += getCapMan__Owner_Investor__r().hashCode();
        }
        if (getCapMan__Registered_Investor__c() != null) {
            _hashCode += getCapMan__Registered_Investor__c().hashCode();
        }
        if (getCapMan__RightofFirstRefusal__c() != null) {
            _hashCode += getCapMan__RightofFirstRefusal__c().hashCode();
        }
        if (getCapMan__Security_Name__c() != null) {
            _hashCode += getCapMan__Security_Name__c().hashCode();
        }
        if (getCapMan__Security_Transaction__c() != null) {
            _hashCode += getCapMan__Security_Transaction__c().hashCode();
        }
        if (getCapMan__Security_Transaction__r() != null) {
            _hashCode += getCapMan__Security_Transaction__r().hashCode();
        }
        if (getCapMan__SharePrice2__c() != null) {
            _hashCode += getCapMan__SharePrice2__c().hashCode();
        }
        if (getCapMan__SharePrice__c() != null) {
            _hashCode += getCapMan__SharePrice__c().hashCode();
        }
        if (getCapMan__Shares__c() != null) {
            _hashCode += getCapMan__Shares__c().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMan__Listings__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Listings__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Action__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Action__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Certificate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Certificate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Expiration_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Expiration_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__First_refusal_expiration_date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__First_refusal_expiration_date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Issuer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Owner_Investor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Owner_Investor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Owner_Investor__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Owner_Investor__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Registered_Investor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registered_Investor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RightofFirstRefusal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RightofFirstRefusal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Transaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Transaction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Transaction__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Transaction__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityTransaction__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SharePrice2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SharePrice2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SharePrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SharePrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Shares__c"));
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
