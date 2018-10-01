/**
 * CapMan__Post_Capitalization_Table__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Post_Capitalization_Table__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Anti_Dilution_Type__c;

    private java.lang.Double capMan__As_Converted_Shares__c;

    private java.lang.Double capMan__Conversion_Price2__c;

    private java.lang.Double capMan__Conversion_Price__c;

    private java.lang.Double capMan__Conversion_Ratio__c;

    private java.lang.String capMan__Issuance__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Issuance__c capMan__Issuance__r;

    private java.lang.Double capMan__Original_Price2__c;

    private java.lang.Double capMan__Original_Price__c;

    private java.lang.Double capMan__Payoffrank__c;

    private java.lang.Double capMan__Pct_Ownership_Pre_Financing__c;

    private java.lang.Double capMan__Pct_Ownership__c;

    private java.lang.String capMan__Security__c;

    private java.lang.Double capMan__Shares_Outstanding__c;

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

    public CapMan__Post_Capitalization_Table__c() {
    }

    public CapMan__Post_Capitalization_Table__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Anti_Dilution_Type__c,
           java.lang.Double capMan__As_Converted_Shares__c,
           java.lang.Double capMan__Conversion_Price2__c,
           java.lang.Double capMan__Conversion_Price__c,
           java.lang.Double capMan__Conversion_Ratio__c,
           java.lang.String capMan__Issuance__c,
           com.sforce.soap.enterprise.sobject.CapMan__Issuance__c capMan__Issuance__r,
           java.lang.Double capMan__Original_Price2__c,
           java.lang.Double capMan__Original_Price__c,
           java.lang.Double capMan__Payoffrank__c,
           java.lang.Double capMan__Pct_Ownership_Pre_Financing__c,
           java.lang.Double capMan__Pct_Ownership__c,
           java.lang.String capMan__Security__c,
           java.lang.Double capMan__Shares_Outstanding__c,
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
        this.capMan__Anti_Dilution_Type__c = capMan__Anti_Dilution_Type__c;
        this.capMan__As_Converted_Shares__c = capMan__As_Converted_Shares__c;
        this.capMan__Conversion_Price2__c = capMan__Conversion_Price2__c;
        this.capMan__Conversion_Price__c = capMan__Conversion_Price__c;
        this.capMan__Conversion_Ratio__c = capMan__Conversion_Ratio__c;
        this.capMan__Issuance__c = capMan__Issuance__c;
        this.capMan__Issuance__r = capMan__Issuance__r;
        this.capMan__Original_Price2__c = capMan__Original_Price2__c;
        this.capMan__Original_Price__c = capMan__Original_Price__c;
        this.capMan__Payoffrank__c = capMan__Payoffrank__c;
        this.capMan__Pct_Ownership_Pre_Financing__c = capMan__Pct_Ownership_Pre_Financing__c;
        this.capMan__Pct_Ownership__c = capMan__Pct_Ownership__c;
        this.capMan__Security__c = capMan__Security__c;
        this.capMan__Shares_Outstanding__c = capMan__Shares_Outstanding__c;
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
     * Gets the attachments value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Anti_Dilution_Type__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Anti_Dilution_Type__c
     */
    public java.lang.String getCapMan__Anti_Dilution_Type__c() {
        return capMan__Anti_Dilution_Type__c;
    }


    /**
     * Sets the capMan__Anti_Dilution_Type__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Anti_Dilution_Type__c
     */
    public void setCapMan__Anti_Dilution_Type__c(java.lang.String capMan__Anti_Dilution_Type__c) {
        this.capMan__Anti_Dilution_Type__c = capMan__Anti_Dilution_Type__c;
    }


    /**
     * Gets the capMan__As_Converted_Shares__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__As_Converted_Shares__c
     */
    public java.lang.Double getCapMan__As_Converted_Shares__c() {
        return capMan__As_Converted_Shares__c;
    }


    /**
     * Sets the capMan__As_Converted_Shares__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__As_Converted_Shares__c
     */
    public void setCapMan__As_Converted_Shares__c(java.lang.Double capMan__As_Converted_Shares__c) {
        this.capMan__As_Converted_Shares__c = capMan__As_Converted_Shares__c;
    }


    /**
     * Gets the capMan__Conversion_Price2__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Conversion_Price2__c
     */
    public java.lang.Double getCapMan__Conversion_Price2__c() {
        return capMan__Conversion_Price2__c;
    }


    /**
     * Sets the capMan__Conversion_Price2__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Conversion_Price2__c
     */
    public void setCapMan__Conversion_Price2__c(java.lang.Double capMan__Conversion_Price2__c) {
        this.capMan__Conversion_Price2__c = capMan__Conversion_Price2__c;
    }


    /**
     * Gets the capMan__Conversion_Price__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Conversion_Price__c
     */
    public java.lang.Double getCapMan__Conversion_Price__c() {
        return capMan__Conversion_Price__c;
    }


    /**
     * Sets the capMan__Conversion_Price__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Conversion_Price__c
     */
    public void setCapMan__Conversion_Price__c(java.lang.Double capMan__Conversion_Price__c) {
        this.capMan__Conversion_Price__c = capMan__Conversion_Price__c;
    }


    /**
     * Gets the capMan__Conversion_Ratio__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Conversion_Ratio__c
     */
    public java.lang.Double getCapMan__Conversion_Ratio__c() {
        return capMan__Conversion_Ratio__c;
    }


    /**
     * Sets the capMan__Conversion_Ratio__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Conversion_Ratio__c
     */
    public void setCapMan__Conversion_Ratio__c(java.lang.Double capMan__Conversion_Ratio__c) {
        this.capMan__Conversion_Ratio__c = capMan__Conversion_Ratio__c;
    }


    /**
     * Gets the capMan__Issuance__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Issuance__c
     */
    public java.lang.String getCapMan__Issuance__c() {
        return capMan__Issuance__c;
    }


    /**
     * Sets the capMan__Issuance__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Issuance__c
     */
    public void setCapMan__Issuance__c(java.lang.String capMan__Issuance__c) {
        this.capMan__Issuance__c = capMan__Issuance__c;
    }


    /**
     * Gets the capMan__Issuance__r value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Issuance__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Issuance__c getCapMan__Issuance__r() {
        return capMan__Issuance__r;
    }


    /**
     * Sets the capMan__Issuance__r value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Issuance__r
     */
    public void setCapMan__Issuance__r(com.sforce.soap.enterprise.sobject.CapMan__Issuance__c capMan__Issuance__r) {
        this.capMan__Issuance__r = capMan__Issuance__r;
    }


    /**
     * Gets the capMan__Original_Price2__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Original_Price2__c
     */
    public java.lang.Double getCapMan__Original_Price2__c() {
        return capMan__Original_Price2__c;
    }


    /**
     * Sets the capMan__Original_Price2__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Original_Price2__c
     */
    public void setCapMan__Original_Price2__c(java.lang.Double capMan__Original_Price2__c) {
        this.capMan__Original_Price2__c = capMan__Original_Price2__c;
    }


    /**
     * Gets the capMan__Original_Price__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Original_Price__c
     */
    public java.lang.Double getCapMan__Original_Price__c() {
        return capMan__Original_Price__c;
    }


    /**
     * Sets the capMan__Original_Price__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Original_Price__c
     */
    public void setCapMan__Original_Price__c(java.lang.Double capMan__Original_Price__c) {
        this.capMan__Original_Price__c = capMan__Original_Price__c;
    }


    /**
     * Gets the capMan__Payoffrank__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Payoffrank__c
     */
    public java.lang.Double getCapMan__Payoffrank__c() {
        return capMan__Payoffrank__c;
    }


    /**
     * Sets the capMan__Payoffrank__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Payoffrank__c
     */
    public void setCapMan__Payoffrank__c(java.lang.Double capMan__Payoffrank__c) {
        this.capMan__Payoffrank__c = capMan__Payoffrank__c;
    }


    /**
     * Gets the capMan__Pct_Ownership_Pre_Financing__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Pct_Ownership_Pre_Financing__c
     */
    public java.lang.Double getCapMan__Pct_Ownership_Pre_Financing__c() {
        return capMan__Pct_Ownership_Pre_Financing__c;
    }


    /**
     * Sets the capMan__Pct_Ownership_Pre_Financing__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Pct_Ownership_Pre_Financing__c
     */
    public void setCapMan__Pct_Ownership_Pre_Financing__c(java.lang.Double capMan__Pct_Ownership_Pre_Financing__c) {
        this.capMan__Pct_Ownership_Pre_Financing__c = capMan__Pct_Ownership_Pre_Financing__c;
    }


    /**
     * Gets the capMan__Pct_Ownership__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Pct_Ownership__c
     */
    public java.lang.Double getCapMan__Pct_Ownership__c() {
        return capMan__Pct_Ownership__c;
    }


    /**
     * Sets the capMan__Pct_Ownership__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Pct_Ownership__c
     */
    public void setCapMan__Pct_Ownership__c(java.lang.Double capMan__Pct_Ownership__c) {
        this.capMan__Pct_Ownership__c = capMan__Pct_Ownership__c;
    }


    /**
     * Gets the capMan__Security__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Security__c
     */
    public java.lang.String getCapMan__Security__c() {
        return capMan__Security__c;
    }


    /**
     * Sets the capMan__Security__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Security__c
     */
    public void setCapMan__Security__c(java.lang.String capMan__Security__c) {
        this.capMan__Security__c = capMan__Security__c;
    }


    /**
     * Gets the capMan__Shares_Outstanding__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return capMan__Shares_Outstanding__c
     */
    public java.lang.Double getCapMan__Shares_Outstanding__c() {
        return capMan__Shares_Outstanding__c;
    }


    /**
     * Sets the capMan__Shares_Outstanding__c value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param capMan__Shares_Outstanding__c
     */
    public void setCapMan__Shares_Outstanding__c(java.lang.Double capMan__Shares_Outstanding__c) {
        this.capMan__Shares_Outstanding__c = capMan__Shares_Outstanding__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Post_Capitalization_Table__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Post_Capitalization_Table__c)) return false;
        CapMan__Post_Capitalization_Table__c other = (CapMan__Post_Capitalization_Table__c) obj;
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
            ((this.capMan__Anti_Dilution_Type__c==null && other.getCapMan__Anti_Dilution_Type__c()==null) || 
             (this.capMan__Anti_Dilution_Type__c!=null &&
              this.capMan__Anti_Dilution_Type__c.equals(other.getCapMan__Anti_Dilution_Type__c()))) &&
            ((this.capMan__As_Converted_Shares__c==null && other.getCapMan__As_Converted_Shares__c()==null) || 
             (this.capMan__As_Converted_Shares__c!=null &&
              this.capMan__As_Converted_Shares__c.equals(other.getCapMan__As_Converted_Shares__c()))) &&
            ((this.capMan__Conversion_Price2__c==null && other.getCapMan__Conversion_Price2__c()==null) || 
             (this.capMan__Conversion_Price2__c!=null &&
              this.capMan__Conversion_Price2__c.equals(other.getCapMan__Conversion_Price2__c()))) &&
            ((this.capMan__Conversion_Price__c==null && other.getCapMan__Conversion_Price__c()==null) || 
             (this.capMan__Conversion_Price__c!=null &&
              this.capMan__Conversion_Price__c.equals(other.getCapMan__Conversion_Price__c()))) &&
            ((this.capMan__Conversion_Ratio__c==null && other.getCapMan__Conversion_Ratio__c()==null) || 
             (this.capMan__Conversion_Ratio__c!=null &&
              this.capMan__Conversion_Ratio__c.equals(other.getCapMan__Conversion_Ratio__c()))) &&
            ((this.capMan__Issuance__c==null && other.getCapMan__Issuance__c()==null) || 
             (this.capMan__Issuance__c!=null &&
              this.capMan__Issuance__c.equals(other.getCapMan__Issuance__c()))) &&
            ((this.capMan__Issuance__r==null && other.getCapMan__Issuance__r()==null) || 
             (this.capMan__Issuance__r!=null &&
              this.capMan__Issuance__r.equals(other.getCapMan__Issuance__r()))) &&
            ((this.capMan__Original_Price2__c==null && other.getCapMan__Original_Price2__c()==null) || 
             (this.capMan__Original_Price2__c!=null &&
              this.capMan__Original_Price2__c.equals(other.getCapMan__Original_Price2__c()))) &&
            ((this.capMan__Original_Price__c==null && other.getCapMan__Original_Price__c()==null) || 
             (this.capMan__Original_Price__c!=null &&
              this.capMan__Original_Price__c.equals(other.getCapMan__Original_Price__c()))) &&
            ((this.capMan__Payoffrank__c==null && other.getCapMan__Payoffrank__c()==null) || 
             (this.capMan__Payoffrank__c!=null &&
              this.capMan__Payoffrank__c.equals(other.getCapMan__Payoffrank__c()))) &&
            ((this.capMan__Pct_Ownership_Pre_Financing__c==null && other.getCapMan__Pct_Ownership_Pre_Financing__c()==null) || 
             (this.capMan__Pct_Ownership_Pre_Financing__c!=null &&
              this.capMan__Pct_Ownership_Pre_Financing__c.equals(other.getCapMan__Pct_Ownership_Pre_Financing__c()))) &&
            ((this.capMan__Pct_Ownership__c==null && other.getCapMan__Pct_Ownership__c()==null) || 
             (this.capMan__Pct_Ownership__c!=null &&
              this.capMan__Pct_Ownership__c.equals(other.getCapMan__Pct_Ownership__c()))) &&
            ((this.capMan__Security__c==null && other.getCapMan__Security__c()==null) || 
             (this.capMan__Security__c!=null &&
              this.capMan__Security__c.equals(other.getCapMan__Security__c()))) &&
            ((this.capMan__Shares_Outstanding__c==null && other.getCapMan__Shares_Outstanding__c()==null) || 
             (this.capMan__Shares_Outstanding__c!=null &&
              this.capMan__Shares_Outstanding__c.equals(other.getCapMan__Shares_Outstanding__c()))) &&
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
        if (getCapMan__Anti_Dilution_Type__c() != null) {
            _hashCode += getCapMan__Anti_Dilution_Type__c().hashCode();
        }
        if (getCapMan__As_Converted_Shares__c() != null) {
            _hashCode += getCapMan__As_Converted_Shares__c().hashCode();
        }
        if (getCapMan__Conversion_Price2__c() != null) {
            _hashCode += getCapMan__Conversion_Price2__c().hashCode();
        }
        if (getCapMan__Conversion_Price__c() != null) {
            _hashCode += getCapMan__Conversion_Price__c().hashCode();
        }
        if (getCapMan__Conversion_Ratio__c() != null) {
            _hashCode += getCapMan__Conversion_Ratio__c().hashCode();
        }
        if (getCapMan__Issuance__c() != null) {
            _hashCode += getCapMan__Issuance__c().hashCode();
        }
        if (getCapMan__Issuance__r() != null) {
            _hashCode += getCapMan__Issuance__r().hashCode();
        }
        if (getCapMan__Original_Price2__c() != null) {
            _hashCode += getCapMan__Original_Price2__c().hashCode();
        }
        if (getCapMan__Original_Price__c() != null) {
            _hashCode += getCapMan__Original_Price__c().hashCode();
        }
        if (getCapMan__Payoffrank__c() != null) {
            _hashCode += getCapMan__Payoffrank__c().hashCode();
        }
        if (getCapMan__Pct_Ownership_Pre_Financing__c() != null) {
            _hashCode += getCapMan__Pct_Ownership_Pre_Financing__c().hashCode();
        }
        if (getCapMan__Pct_Ownership__c() != null) {
            _hashCode += getCapMan__Pct_Ownership__c().hashCode();
        }
        if (getCapMan__Security__c() != null) {
            _hashCode += getCapMan__Security__c().hashCode();
        }
        if (getCapMan__Shares_Outstanding__c() != null) {
            _hashCode += getCapMan__Shares_Outstanding__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Post_Capitalization_Table__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Post_Capitalization_Table__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Anti_Dilution_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Anti_Dilution_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__As_Converted_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__As_Converted_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Conversion_Price2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Conversion_Price2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Conversion_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Conversion_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Conversion_Ratio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Conversion_Ratio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Issuance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Issuance__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuance__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuance__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Original_Price2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Original_Price2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Original_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Original_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Payoffrank__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Payoffrank__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pct_Ownership_Pre_Financing__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pct_Ownership_Pre_Financing__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pct_Ownership__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pct_Ownership__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Shares_Outstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Shares_Outstanding__c"));
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
