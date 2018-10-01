/**
 * CapMan__Financial_Data_Line_Item__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Financial_Data_Line_Item__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__Annual__c;

    private java.lang.String capMan__Financial_Account__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Financial_Account__c capMan__Financial_Account__r;

    private java.lang.String capMan__Financial_Data__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Financial_Data__c capMan__Financial_Data__r;

    private java.lang.Boolean capMan__Forecast__c;

    private java.lang.Double capMan__Q1__c;

    private java.lang.Double capMan__Q2__c;

    private java.lang.Double capMan__Q3__c;

    private java.lang.Double capMan__Q4__c;

    private java.lang.String capMan__Subcategory__c;

    private java.lang.String capMan__Type__c;

    private java.lang.String capMan__isAnnual__c;

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

    public CapMan__Financial_Data_Line_Item__c() {
    }

    public CapMan__Financial_Data_Line_Item__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__Annual__c,
           java.lang.String capMan__Financial_Account__c,
           com.sforce.soap.enterprise.sobject.CapMan__Financial_Account__c capMan__Financial_Account__r,
           java.lang.String capMan__Financial_Data__c,
           com.sforce.soap.enterprise.sobject.CapMan__Financial_Data__c capMan__Financial_Data__r,
           java.lang.Boolean capMan__Forecast__c,
           java.lang.Double capMan__Q1__c,
           java.lang.Double capMan__Q2__c,
           java.lang.Double capMan__Q3__c,
           java.lang.Double capMan__Q4__c,
           java.lang.String capMan__Subcategory__c,
           java.lang.String capMan__Type__c,
           java.lang.String capMan__isAnnual__c,
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
        this.capMan__Annual__c = capMan__Annual__c;
        this.capMan__Financial_Account__c = capMan__Financial_Account__c;
        this.capMan__Financial_Account__r = capMan__Financial_Account__r;
        this.capMan__Financial_Data__c = capMan__Financial_Data__c;
        this.capMan__Financial_Data__r = capMan__Financial_Data__r;
        this.capMan__Forecast__c = capMan__Forecast__c;
        this.capMan__Q1__c = capMan__Q1__c;
        this.capMan__Q2__c = capMan__Q2__c;
        this.capMan__Q3__c = capMan__Q3__c;
        this.capMan__Q4__c = capMan__Q4__c;
        this.capMan__Subcategory__c = capMan__Subcategory__c;
        this.capMan__Type__c = capMan__Type__c;
        this.capMan__isAnnual__c = capMan__isAnnual__c;
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
     * Gets the attachments value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Annual__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Annual__c
     */
    public java.lang.Double getCapMan__Annual__c() {
        return capMan__Annual__c;
    }


    /**
     * Sets the capMan__Annual__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Annual__c
     */
    public void setCapMan__Annual__c(java.lang.Double capMan__Annual__c) {
        this.capMan__Annual__c = capMan__Annual__c;
    }


    /**
     * Gets the capMan__Financial_Account__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Financial_Account__c
     */
    public java.lang.String getCapMan__Financial_Account__c() {
        return capMan__Financial_Account__c;
    }


    /**
     * Sets the capMan__Financial_Account__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Financial_Account__c
     */
    public void setCapMan__Financial_Account__c(java.lang.String capMan__Financial_Account__c) {
        this.capMan__Financial_Account__c = capMan__Financial_Account__c;
    }


    /**
     * Gets the capMan__Financial_Account__r value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Financial_Account__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Financial_Account__c getCapMan__Financial_Account__r() {
        return capMan__Financial_Account__r;
    }


    /**
     * Sets the capMan__Financial_Account__r value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Financial_Account__r
     */
    public void setCapMan__Financial_Account__r(com.sforce.soap.enterprise.sobject.CapMan__Financial_Account__c capMan__Financial_Account__r) {
        this.capMan__Financial_Account__r = capMan__Financial_Account__r;
    }


    /**
     * Gets the capMan__Financial_Data__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Financial_Data__c
     */
    public java.lang.String getCapMan__Financial_Data__c() {
        return capMan__Financial_Data__c;
    }


    /**
     * Sets the capMan__Financial_Data__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Financial_Data__c
     */
    public void setCapMan__Financial_Data__c(java.lang.String capMan__Financial_Data__c) {
        this.capMan__Financial_Data__c = capMan__Financial_Data__c;
    }


    /**
     * Gets the capMan__Financial_Data__r value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Financial_Data__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Financial_Data__c getCapMan__Financial_Data__r() {
        return capMan__Financial_Data__r;
    }


    /**
     * Sets the capMan__Financial_Data__r value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Financial_Data__r
     */
    public void setCapMan__Financial_Data__r(com.sforce.soap.enterprise.sobject.CapMan__Financial_Data__c capMan__Financial_Data__r) {
        this.capMan__Financial_Data__r = capMan__Financial_Data__r;
    }


    /**
     * Gets the capMan__Forecast__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Forecast__c
     */
    public java.lang.Boolean getCapMan__Forecast__c() {
        return capMan__Forecast__c;
    }


    /**
     * Sets the capMan__Forecast__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Forecast__c
     */
    public void setCapMan__Forecast__c(java.lang.Boolean capMan__Forecast__c) {
        this.capMan__Forecast__c = capMan__Forecast__c;
    }


    /**
     * Gets the capMan__Q1__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Q1__c
     */
    public java.lang.Double getCapMan__Q1__c() {
        return capMan__Q1__c;
    }


    /**
     * Sets the capMan__Q1__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Q1__c
     */
    public void setCapMan__Q1__c(java.lang.Double capMan__Q1__c) {
        this.capMan__Q1__c = capMan__Q1__c;
    }


    /**
     * Gets the capMan__Q2__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Q2__c
     */
    public java.lang.Double getCapMan__Q2__c() {
        return capMan__Q2__c;
    }


    /**
     * Sets the capMan__Q2__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Q2__c
     */
    public void setCapMan__Q2__c(java.lang.Double capMan__Q2__c) {
        this.capMan__Q2__c = capMan__Q2__c;
    }


    /**
     * Gets the capMan__Q3__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Q3__c
     */
    public java.lang.Double getCapMan__Q3__c() {
        return capMan__Q3__c;
    }


    /**
     * Sets the capMan__Q3__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Q3__c
     */
    public void setCapMan__Q3__c(java.lang.Double capMan__Q3__c) {
        this.capMan__Q3__c = capMan__Q3__c;
    }


    /**
     * Gets the capMan__Q4__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Q4__c
     */
    public java.lang.Double getCapMan__Q4__c() {
        return capMan__Q4__c;
    }


    /**
     * Sets the capMan__Q4__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Q4__c
     */
    public void setCapMan__Q4__c(java.lang.Double capMan__Q4__c) {
        this.capMan__Q4__c = capMan__Q4__c;
    }


    /**
     * Gets the capMan__Subcategory__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Subcategory__c
     */
    public java.lang.String getCapMan__Subcategory__c() {
        return capMan__Subcategory__c;
    }


    /**
     * Sets the capMan__Subcategory__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Subcategory__c
     */
    public void setCapMan__Subcategory__c(java.lang.String capMan__Subcategory__c) {
        this.capMan__Subcategory__c = capMan__Subcategory__c;
    }


    /**
     * Gets the capMan__Type__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__Type__c
     */
    public java.lang.String getCapMan__Type__c() {
        return capMan__Type__c;
    }


    /**
     * Sets the capMan__Type__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__Type__c
     */
    public void setCapMan__Type__c(java.lang.String capMan__Type__c) {
        this.capMan__Type__c = capMan__Type__c;
    }


    /**
     * Gets the capMan__isAnnual__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return capMan__isAnnual__c
     */
    public java.lang.String getCapMan__isAnnual__c() {
        return capMan__isAnnual__c;
    }


    /**
     * Sets the capMan__isAnnual__c value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param capMan__isAnnual__c
     */
    public void setCapMan__isAnnual__c(java.lang.String capMan__isAnnual__c) {
        this.capMan__isAnnual__c = capMan__isAnnual__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Financial_Data_Line_Item__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Financial_Data_Line_Item__c)) return false;
        CapMan__Financial_Data_Line_Item__c other = (CapMan__Financial_Data_Line_Item__c) obj;
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
            ((this.capMan__Annual__c==null && other.getCapMan__Annual__c()==null) || 
             (this.capMan__Annual__c!=null &&
              this.capMan__Annual__c.equals(other.getCapMan__Annual__c()))) &&
            ((this.capMan__Financial_Account__c==null && other.getCapMan__Financial_Account__c()==null) || 
             (this.capMan__Financial_Account__c!=null &&
              this.capMan__Financial_Account__c.equals(other.getCapMan__Financial_Account__c()))) &&
            ((this.capMan__Financial_Account__r==null && other.getCapMan__Financial_Account__r()==null) || 
             (this.capMan__Financial_Account__r!=null &&
              this.capMan__Financial_Account__r.equals(other.getCapMan__Financial_Account__r()))) &&
            ((this.capMan__Financial_Data__c==null && other.getCapMan__Financial_Data__c()==null) || 
             (this.capMan__Financial_Data__c!=null &&
              this.capMan__Financial_Data__c.equals(other.getCapMan__Financial_Data__c()))) &&
            ((this.capMan__Financial_Data__r==null && other.getCapMan__Financial_Data__r()==null) || 
             (this.capMan__Financial_Data__r!=null &&
              this.capMan__Financial_Data__r.equals(other.getCapMan__Financial_Data__r()))) &&
            ((this.capMan__Forecast__c==null && other.getCapMan__Forecast__c()==null) || 
             (this.capMan__Forecast__c!=null &&
              this.capMan__Forecast__c.equals(other.getCapMan__Forecast__c()))) &&
            ((this.capMan__Q1__c==null && other.getCapMan__Q1__c()==null) || 
             (this.capMan__Q1__c!=null &&
              this.capMan__Q1__c.equals(other.getCapMan__Q1__c()))) &&
            ((this.capMan__Q2__c==null && other.getCapMan__Q2__c()==null) || 
             (this.capMan__Q2__c!=null &&
              this.capMan__Q2__c.equals(other.getCapMan__Q2__c()))) &&
            ((this.capMan__Q3__c==null && other.getCapMan__Q3__c()==null) || 
             (this.capMan__Q3__c!=null &&
              this.capMan__Q3__c.equals(other.getCapMan__Q3__c()))) &&
            ((this.capMan__Q4__c==null && other.getCapMan__Q4__c()==null) || 
             (this.capMan__Q4__c!=null &&
              this.capMan__Q4__c.equals(other.getCapMan__Q4__c()))) &&
            ((this.capMan__Subcategory__c==null && other.getCapMan__Subcategory__c()==null) || 
             (this.capMan__Subcategory__c!=null &&
              this.capMan__Subcategory__c.equals(other.getCapMan__Subcategory__c()))) &&
            ((this.capMan__Type__c==null && other.getCapMan__Type__c()==null) || 
             (this.capMan__Type__c!=null &&
              this.capMan__Type__c.equals(other.getCapMan__Type__c()))) &&
            ((this.capMan__isAnnual__c==null && other.getCapMan__isAnnual__c()==null) || 
             (this.capMan__isAnnual__c!=null &&
              this.capMan__isAnnual__c.equals(other.getCapMan__isAnnual__c()))) &&
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
        if (getCapMan__Annual__c() != null) {
            _hashCode += getCapMan__Annual__c().hashCode();
        }
        if (getCapMan__Financial_Account__c() != null) {
            _hashCode += getCapMan__Financial_Account__c().hashCode();
        }
        if (getCapMan__Financial_Account__r() != null) {
            _hashCode += getCapMan__Financial_Account__r().hashCode();
        }
        if (getCapMan__Financial_Data__c() != null) {
            _hashCode += getCapMan__Financial_Data__c().hashCode();
        }
        if (getCapMan__Financial_Data__r() != null) {
            _hashCode += getCapMan__Financial_Data__r().hashCode();
        }
        if (getCapMan__Forecast__c() != null) {
            _hashCode += getCapMan__Forecast__c().hashCode();
        }
        if (getCapMan__Q1__c() != null) {
            _hashCode += getCapMan__Q1__c().hashCode();
        }
        if (getCapMan__Q2__c() != null) {
            _hashCode += getCapMan__Q2__c().hashCode();
        }
        if (getCapMan__Q3__c() != null) {
            _hashCode += getCapMan__Q3__c().hashCode();
        }
        if (getCapMan__Q4__c() != null) {
            _hashCode += getCapMan__Q4__c().hashCode();
        }
        if (getCapMan__Subcategory__c() != null) {
            _hashCode += getCapMan__Subcategory__c().hashCode();
        }
        if (getCapMan__Type__c() != null) {
            _hashCode += getCapMan__Type__c().hashCode();
        }
        if (getCapMan__isAnnual__c() != null) {
            _hashCode += getCapMan__isAnnual__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Financial_Data_Line_Item__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Data_Line_Item__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Annual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Annual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Financial_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Financial_Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Account__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Financial_Data__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Data__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Financial_Data__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Data__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Data__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Subcategory__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Subcategory__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__isAnnual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__isAnnual__c"));
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
