/**
 * CapMan__Financial_Data__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Financial_Data__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Capitalization__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Capitalization__r;

    private java.lang.Double capMan__EBITDA_Annual__c;

    private java.lang.Double capMan__EBITDA_Q1__c;

    private java.lang.Double capMan__EBITDA_Q2__c;

    private java.lang.Double capMan__EBITDA_Q3__c;

    private java.lang.Double capMan__EBITDA_Q4__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Financial_Data_Line_Items__r;

    private java.lang.Double capMan__Forecast_EBITDA_Annual__c;

    private java.lang.Double capMan__Forecast_EBITDA_Q1__c;

    private java.lang.Double capMan__Forecast_EBITDA_Q2__c;

    private java.lang.Double capMan__Forecast_EBITDA_Q3__c;

    private java.lang.Double capMan__Forecast_EBITDA_Q4__c;

    private java.lang.Double capMan__Forecast_Net_Income_Annual__c;

    private java.lang.Double capMan__Forecast_Net_Income_Q1__c;

    private java.lang.Double capMan__Forecast_Net_Income_Q2__c;

    private java.lang.Double capMan__Forecast_Net_Income_Q3__c;

    private java.lang.Double capMan__Forecast_Net_Income_Q4__c;

    private java.lang.Double capMan__Forecast_Revenue_Annual__c;

    private java.lang.Double capMan__Forecast_Revenue_Q1__c;

    private java.lang.Double capMan__Forecast_Revenue_Q2__c;

    private java.lang.Double capMan__Forecast_Revenue_Q3__c;

    private java.lang.Double capMan__Forecast_Revenue_Q4__c;

    private java.lang.Double capMan__Net_Income_Annual__c;

    private java.lang.Double capMan__Revenue_Annual__c;

    private java.util.Date capMan__fiscal_close__c;

    private java.lang.Double capMan__net_income_Q1__c;

    private java.lang.Double capMan__net_income_Q2__c;

    private java.lang.Double capMan__net_income_Q3__c;

    private java.lang.Double capMan__net_income_Q4__c;

    private java.lang.Double capMan__revenue_Q1__c;

    private java.lang.Double capMan__revenue_Q2__c;

    private java.lang.Double capMan__revenue_Q3__c;

    private java.lang.Double capMan__revenue_Q4__c;

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

    public CapMan__Financial_Data__c() {
    }

    public CapMan__Financial_Data__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Capitalization__c,
           com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Capitalization__r,
           java.lang.Double capMan__EBITDA_Annual__c,
           java.lang.Double capMan__EBITDA_Q1__c,
           java.lang.Double capMan__EBITDA_Q2__c,
           java.lang.Double capMan__EBITDA_Q3__c,
           java.lang.Double capMan__EBITDA_Q4__c,
           com.sforce.soap.enterprise.QueryResult capMan__Financial_Data_Line_Items__r,
           java.lang.Double capMan__Forecast_EBITDA_Annual__c,
           java.lang.Double capMan__Forecast_EBITDA_Q1__c,
           java.lang.Double capMan__Forecast_EBITDA_Q2__c,
           java.lang.Double capMan__Forecast_EBITDA_Q3__c,
           java.lang.Double capMan__Forecast_EBITDA_Q4__c,
           java.lang.Double capMan__Forecast_Net_Income_Annual__c,
           java.lang.Double capMan__Forecast_Net_Income_Q1__c,
           java.lang.Double capMan__Forecast_Net_Income_Q2__c,
           java.lang.Double capMan__Forecast_Net_Income_Q3__c,
           java.lang.Double capMan__Forecast_Net_Income_Q4__c,
           java.lang.Double capMan__Forecast_Revenue_Annual__c,
           java.lang.Double capMan__Forecast_Revenue_Q1__c,
           java.lang.Double capMan__Forecast_Revenue_Q2__c,
           java.lang.Double capMan__Forecast_Revenue_Q3__c,
           java.lang.Double capMan__Forecast_Revenue_Q4__c,
           java.lang.Double capMan__Net_Income_Annual__c,
           java.lang.Double capMan__Revenue_Annual__c,
           java.util.Date capMan__fiscal_close__c,
           java.lang.Double capMan__net_income_Q1__c,
           java.lang.Double capMan__net_income_Q2__c,
           java.lang.Double capMan__net_income_Q3__c,
           java.lang.Double capMan__net_income_Q4__c,
           java.lang.Double capMan__revenue_Q1__c,
           java.lang.Double capMan__revenue_Q2__c,
           java.lang.Double capMan__revenue_Q3__c,
           java.lang.Double capMan__revenue_Q4__c,
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
        this.capMan__Capitalization__c = capMan__Capitalization__c;
        this.capMan__Capitalization__r = capMan__Capitalization__r;
        this.capMan__EBITDA_Annual__c = capMan__EBITDA_Annual__c;
        this.capMan__EBITDA_Q1__c = capMan__EBITDA_Q1__c;
        this.capMan__EBITDA_Q2__c = capMan__EBITDA_Q2__c;
        this.capMan__EBITDA_Q3__c = capMan__EBITDA_Q3__c;
        this.capMan__EBITDA_Q4__c = capMan__EBITDA_Q4__c;
        this.capMan__Financial_Data_Line_Items__r = capMan__Financial_Data_Line_Items__r;
        this.capMan__Forecast_EBITDA_Annual__c = capMan__Forecast_EBITDA_Annual__c;
        this.capMan__Forecast_EBITDA_Q1__c = capMan__Forecast_EBITDA_Q1__c;
        this.capMan__Forecast_EBITDA_Q2__c = capMan__Forecast_EBITDA_Q2__c;
        this.capMan__Forecast_EBITDA_Q3__c = capMan__Forecast_EBITDA_Q3__c;
        this.capMan__Forecast_EBITDA_Q4__c = capMan__Forecast_EBITDA_Q4__c;
        this.capMan__Forecast_Net_Income_Annual__c = capMan__Forecast_Net_Income_Annual__c;
        this.capMan__Forecast_Net_Income_Q1__c = capMan__Forecast_Net_Income_Q1__c;
        this.capMan__Forecast_Net_Income_Q2__c = capMan__Forecast_Net_Income_Q2__c;
        this.capMan__Forecast_Net_Income_Q3__c = capMan__Forecast_Net_Income_Q3__c;
        this.capMan__Forecast_Net_Income_Q4__c = capMan__Forecast_Net_Income_Q4__c;
        this.capMan__Forecast_Revenue_Annual__c = capMan__Forecast_Revenue_Annual__c;
        this.capMan__Forecast_Revenue_Q1__c = capMan__Forecast_Revenue_Q1__c;
        this.capMan__Forecast_Revenue_Q2__c = capMan__Forecast_Revenue_Q2__c;
        this.capMan__Forecast_Revenue_Q3__c = capMan__Forecast_Revenue_Q3__c;
        this.capMan__Forecast_Revenue_Q4__c = capMan__Forecast_Revenue_Q4__c;
        this.capMan__Net_Income_Annual__c = capMan__Net_Income_Annual__c;
        this.capMan__Revenue_Annual__c = capMan__Revenue_Annual__c;
        this.capMan__fiscal_close__c = capMan__fiscal_close__c;
        this.capMan__net_income_Q1__c = capMan__net_income_Q1__c;
        this.capMan__net_income_Q2__c = capMan__net_income_Q2__c;
        this.capMan__net_income_Q3__c = capMan__net_income_Q3__c;
        this.capMan__net_income_Q4__c = capMan__net_income_Q4__c;
        this.capMan__revenue_Q1__c = capMan__revenue_Q1__c;
        this.capMan__revenue_Q2__c = capMan__revenue_Q2__c;
        this.capMan__revenue_Q3__c = capMan__revenue_Q3__c;
        this.capMan__revenue_Q4__c = capMan__revenue_Q4__c;
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
     * Gets the attachments value for this CapMan__Financial_Data__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Financial_Data__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Capitalization__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Capitalization__c
     */
    public java.lang.String getCapMan__Capitalization__c() {
        return capMan__Capitalization__c;
    }


    /**
     * Sets the capMan__Capitalization__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Capitalization__c
     */
    public void setCapMan__Capitalization__c(java.lang.String capMan__Capitalization__c) {
        this.capMan__Capitalization__c = capMan__Capitalization__c;
    }


    /**
     * Gets the capMan__Capitalization__r value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Capitalization__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c getCapMan__Capitalization__r() {
        return capMan__Capitalization__r;
    }


    /**
     * Sets the capMan__Capitalization__r value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Capitalization__r
     */
    public void setCapMan__Capitalization__r(com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Capitalization__r) {
        this.capMan__Capitalization__r = capMan__Capitalization__r;
    }


    /**
     * Gets the capMan__EBITDA_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__EBITDA_Annual__c
     */
    public java.lang.Double getCapMan__EBITDA_Annual__c() {
        return capMan__EBITDA_Annual__c;
    }


    /**
     * Sets the capMan__EBITDA_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__EBITDA_Annual__c
     */
    public void setCapMan__EBITDA_Annual__c(java.lang.Double capMan__EBITDA_Annual__c) {
        this.capMan__EBITDA_Annual__c = capMan__EBITDA_Annual__c;
    }


    /**
     * Gets the capMan__EBITDA_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__EBITDA_Q1__c
     */
    public java.lang.Double getCapMan__EBITDA_Q1__c() {
        return capMan__EBITDA_Q1__c;
    }


    /**
     * Sets the capMan__EBITDA_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__EBITDA_Q1__c
     */
    public void setCapMan__EBITDA_Q1__c(java.lang.Double capMan__EBITDA_Q1__c) {
        this.capMan__EBITDA_Q1__c = capMan__EBITDA_Q1__c;
    }


    /**
     * Gets the capMan__EBITDA_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__EBITDA_Q2__c
     */
    public java.lang.Double getCapMan__EBITDA_Q2__c() {
        return capMan__EBITDA_Q2__c;
    }


    /**
     * Sets the capMan__EBITDA_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__EBITDA_Q2__c
     */
    public void setCapMan__EBITDA_Q2__c(java.lang.Double capMan__EBITDA_Q2__c) {
        this.capMan__EBITDA_Q2__c = capMan__EBITDA_Q2__c;
    }


    /**
     * Gets the capMan__EBITDA_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__EBITDA_Q3__c
     */
    public java.lang.Double getCapMan__EBITDA_Q3__c() {
        return capMan__EBITDA_Q3__c;
    }


    /**
     * Sets the capMan__EBITDA_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__EBITDA_Q3__c
     */
    public void setCapMan__EBITDA_Q3__c(java.lang.Double capMan__EBITDA_Q3__c) {
        this.capMan__EBITDA_Q3__c = capMan__EBITDA_Q3__c;
    }


    /**
     * Gets the capMan__EBITDA_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__EBITDA_Q4__c
     */
    public java.lang.Double getCapMan__EBITDA_Q4__c() {
        return capMan__EBITDA_Q4__c;
    }


    /**
     * Sets the capMan__EBITDA_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__EBITDA_Q4__c
     */
    public void setCapMan__EBITDA_Q4__c(java.lang.Double capMan__EBITDA_Q4__c) {
        this.capMan__EBITDA_Q4__c = capMan__EBITDA_Q4__c;
    }


    /**
     * Gets the capMan__Financial_Data_Line_Items__r value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Financial_Data_Line_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Financial_Data_Line_Items__r() {
        return capMan__Financial_Data_Line_Items__r;
    }


    /**
     * Sets the capMan__Financial_Data_Line_Items__r value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Financial_Data_Line_Items__r
     */
    public void setCapMan__Financial_Data_Line_Items__r(com.sforce.soap.enterprise.QueryResult capMan__Financial_Data_Line_Items__r) {
        this.capMan__Financial_Data_Line_Items__r = capMan__Financial_Data_Line_Items__r;
    }


    /**
     * Gets the capMan__Forecast_EBITDA_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_EBITDA_Annual__c
     */
    public java.lang.Double getCapMan__Forecast_EBITDA_Annual__c() {
        return capMan__Forecast_EBITDA_Annual__c;
    }


    /**
     * Sets the capMan__Forecast_EBITDA_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_EBITDA_Annual__c
     */
    public void setCapMan__Forecast_EBITDA_Annual__c(java.lang.Double capMan__Forecast_EBITDA_Annual__c) {
        this.capMan__Forecast_EBITDA_Annual__c = capMan__Forecast_EBITDA_Annual__c;
    }


    /**
     * Gets the capMan__Forecast_EBITDA_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_EBITDA_Q1__c
     */
    public java.lang.Double getCapMan__Forecast_EBITDA_Q1__c() {
        return capMan__Forecast_EBITDA_Q1__c;
    }


    /**
     * Sets the capMan__Forecast_EBITDA_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_EBITDA_Q1__c
     */
    public void setCapMan__Forecast_EBITDA_Q1__c(java.lang.Double capMan__Forecast_EBITDA_Q1__c) {
        this.capMan__Forecast_EBITDA_Q1__c = capMan__Forecast_EBITDA_Q1__c;
    }


    /**
     * Gets the capMan__Forecast_EBITDA_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_EBITDA_Q2__c
     */
    public java.lang.Double getCapMan__Forecast_EBITDA_Q2__c() {
        return capMan__Forecast_EBITDA_Q2__c;
    }


    /**
     * Sets the capMan__Forecast_EBITDA_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_EBITDA_Q2__c
     */
    public void setCapMan__Forecast_EBITDA_Q2__c(java.lang.Double capMan__Forecast_EBITDA_Q2__c) {
        this.capMan__Forecast_EBITDA_Q2__c = capMan__Forecast_EBITDA_Q2__c;
    }


    /**
     * Gets the capMan__Forecast_EBITDA_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_EBITDA_Q3__c
     */
    public java.lang.Double getCapMan__Forecast_EBITDA_Q3__c() {
        return capMan__Forecast_EBITDA_Q3__c;
    }


    /**
     * Sets the capMan__Forecast_EBITDA_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_EBITDA_Q3__c
     */
    public void setCapMan__Forecast_EBITDA_Q3__c(java.lang.Double capMan__Forecast_EBITDA_Q3__c) {
        this.capMan__Forecast_EBITDA_Q3__c = capMan__Forecast_EBITDA_Q3__c;
    }


    /**
     * Gets the capMan__Forecast_EBITDA_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_EBITDA_Q4__c
     */
    public java.lang.Double getCapMan__Forecast_EBITDA_Q4__c() {
        return capMan__Forecast_EBITDA_Q4__c;
    }


    /**
     * Sets the capMan__Forecast_EBITDA_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_EBITDA_Q4__c
     */
    public void setCapMan__Forecast_EBITDA_Q4__c(java.lang.Double capMan__Forecast_EBITDA_Q4__c) {
        this.capMan__Forecast_EBITDA_Q4__c = capMan__Forecast_EBITDA_Q4__c;
    }


    /**
     * Gets the capMan__Forecast_Net_Income_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Net_Income_Annual__c
     */
    public java.lang.Double getCapMan__Forecast_Net_Income_Annual__c() {
        return capMan__Forecast_Net_Income_Annual__c;
    }


    /**
     * Sets the capMan__Forecast_Net_Income_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Net_Income_Annual__c
     */
    public void setCapMan__Forecast_Net_Income_Annual__c(java.lang.Double capMan__Forecast_Net_Income_Annual__c) {
        this.capMan__Forecast_Net_Income_Annual__c = capMan__Forecast_Net_Income_Annual__c;
    }


    /**
     * Gets the capMan__Forecast_Net_Income_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Net_Income_Q1__c
     */
    public java.lang.Double getCapMan__Forecast_Net_Income_Q1__c() {
        return capMan__Forecast_Net_Income_Q1__c;
    }


    /**
     * Sets the capMan__Forecast_Net_Income_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Net_Income_Q1__c
     */
    public void setCapMan__Forecast_Net_Income_Q1__c(java.lang.Double capMan__Forecast_Net_Income_Q1__c) {
        this.capMan__Forecast_Net_Income_Q1__c = capMan__Forecast_Net_Income_Q1__c;
    }


    /**
     * Gets the capMan__Forecast_Net_Income_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Net_Income_Q2__c
     */
    public java.lang.Double getCapMan__Forecast_Net_Income_Q2__c() {
        return capMan__Forecast_Net_Income_Q2__c;
    }


    /**
     * Sets the capMan__Forecast_Net_Income_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Net_Income_Q2__c
     */
    public void setCapMan__Forecast_Net_Income_Q2__c(java.lang.Double capMan__Forecast_Net_Income_Q2__c) {
        this.capMan__Forecast_Net_Income_Q2__c = capMan__Forecast_Net_Income_Q2__c;
    }


    /**
     * Gets the capMan__Forecast_Net_Income_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Net_Income_Q3__c
     */
    public java.lang.Double getCapMan__Forecast_Net_Income_Q3__c() {
        return capMan__Forecast_Net_Income_Q3__c;
    }


    /**
     * Sets the capMan__Forecast_Net_Income_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Net_Income_Q3__c
     */
    public void setCapMan__Forecast_Net_Income_Q3__c(java.lang.Double capMan__Forecast_Net_Income_Q3__c) {
        this.capMan__Forecast_Net_Income_Q3__c = capMan__Forecast_Net_Income_Q3__c;
    }


    /**
     * Gets the capMan__Forecast_Net_Income_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Net_Income_Q4__c
     */
    public java.lang.Double getCapMan__Forecast_Net_Income_Q4__c() {
        return capMan__Forecast_Net_Income_Q4__c;
    }


    /**
     * Sets the capMan__Forecast_Net_Income_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Net_Income_Q4__c
     */
    public void setCapMan__Forecast_Net_Income_Q4__c(java.lang.Double capMan__Forecast_Net_Income_Q4__c) {
        this.capMan__Forecast_Net_Income_Q4__c = capMan__Forecast_Net_Income_Q4__c;
    }


    /**
     * Gets the capMan__Forecast_Revenue_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Revenue_Annual__c
     */
    public java.lang.Double getCapMan__Forecast_Revenue_Annual__c() {
        return capMan__Forecast_Revenue_Annual__c;
    }


    /**
     * Sets the capMan__Forecast_Revenue_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Revenue_Annual__c
     */
    public void setCapMan__Forecast_Revenue_Annual__c(java.lang.Double capMan__Forecast_Revenue_Annual__c) {
        this.capMan__Forecast_Revenue_Annual__c = capMan__Forecast_Revenue_Annual__c;
    }


    /**
     * Gets the capMan__Forecast_Revenue_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Revenue_Q1__c
     */
    public java.lang.Double getCapMan__Forecast_Revenue_Q1__c() {
        return capMan__Forecast_Revenue_Q1__c;
    }


    /**
     * Sets the capMan__Forecast_Revenue_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Revenue_Q1__c
     */
    public void setCapMan__Forecast_Revenue_Q1__c(java.lang.Double capMan__Forecast_Revenue_Q1__c) {
        this.capMan__Forecast_Revenue_Q1__c = capMan__Forecast_Revenue_Q1__c;
    }


    /**
     * Gets the capMan__Forecast_Revenue_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Revenue_Q2__c
     */
    public java.lang.Double getCapMan__Forecast_Revenue_Q2__c() {
        return capMan__Forecast_Revenue_Q2__c;
    }


    /**
     * Sets the capMan__Forecast_Revenue_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Revenue_Q2__c
     */
    public void setCapMan__Forecast_Revenue_Q2__c(java.lang.Double capMan__Forecast_Revenue_Q2__c) {
        this.capMan__Forecast_Revenue_Q2__c = capMan__Forecast_Revenue_Q2__c;
    }


    /**
     * Gets the capMan__Forecast_Revenue_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Revenue_Q3__c
     */
    public java.lang.Double getCapMan__Forecast_Revenue_Q3__c() {
        return capMan__Forecast_Revenue_Q3__c;
    }


    /**
     * Sets the capMan__Forecast_Revenue_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Revenue_Q3__c
     */
    public void setCapMan__Forecast_Revenue_Q3__c(java.lang.Double capMan__Forecast_Revenue_Q3__c) {
        this.capMan__Forecast_Revenue_Q3__c = capMan__Forecast_Revenue_Q3__c;
    }


    /**
     * Gets the capMan__Forecast_Revenue_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Forecast_Revenue_Q4__c
     */
    public java.lang.Double getCapMan__Forecast_Revenue_Q4__c() {
        return capMan__Forecast_Revenue_Q4__c;
    }


    /**
     * Sets the capMan__Forecast_Revenue_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Forecast_Revenue_Q4__c
     */
    public void setCapMan__Forecast_Revenue_Q4__c(java.lang.Double capMan__Forecast_Revenue_Q4__c) {
        this.capMan__Forecast_Revenue_Q4__c = capMan__Forecast_Revenue_Q4__c;
    }


    /**
     * Gets the capMan__Net_Income_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Net_Income_Annual__c
     */
    public java.lang.Double getCapMan__Net_Income_Annual__c() {
        return capMan__Net_Income_Annual__c;
    }


    /**
     * Sets the capMan__Net_Income_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Net_Income_Annual__c
     */
    public void setCapMan__Net_Income_Annual__c(java.lang.Double capMan__Net_Income_Annual__c) {
        this.capMan__Net_Income_Annual__c = capMan__Net_Income_Annual__c;
    }


    /**
     * Gets the capMan__Revenue_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__Revenue_Annual__c
     */
    public java.lang.Double getCapMan__Revenue_Annual__c() {
        return capMan__Revenue_Annual__c;
    }


    /**
     * Sets the capMan__Revenue_Annual__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__Revenue_Annual__c
     */
    public void setCapMan__Revenue_Annual__c(java.lang.Double capMan__Revenue_Annual__c) {
        this.capMan__Revenue_Annual__c = capMan__Revenue_Annual__c;
    }


    /**
     * Gets the capMan__fiscal_close__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__fiscal_close__c
     */
    public java.util.Date getCapMan__fiscal_close__c() {
        return capMan__fiscal_close__c;
    }


    /**
     * Sets the capMan__fiscal_close__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__fiscal_close__c
     */
    public void setCapMan__fiscal_close__c(java.util.Date capMan__fiscal_close__c) {
        this.capMan__fiscal_close__c = capMan__fiscal_close__c;
    }


    /**
     * Gets the capMan__net_income_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__net_income_Q1__c
     */
    public java.lang.Double getCapMan__net_income_Q1__c() {
        return capMan__net_income_Q1__c;
    }


    /**
     * Sets the capMan__net_income_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__net_income_Q1__c
     */
    public void setCapMan__net_income_Q1__c(java.lang.Double capMan__net_income_Q1__c) {
        this.capMan__net_income_Q1__c = capMan__net_income_Q1__c;
    }


    /**
     * Gets the capMan__net_income_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__net_income_Q2__c
     */
    public java.lang.Double getCapMan__net_income_Q2__c() {
        return capMan__net_income_Q2__c;
    }


    /**
     * Sets the capMan__net_income_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__net_income_Q2__c
     */
    public void setCapMan__net_income_Q2__c(java.lang.Double capMan__net_income_Q2__c) {
        this.capMan__net_income_Q2__c = capMan__net_income_Q2__c;
    }


    /**
     * Gets the capMan__net_income_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__net_income_Q3__c
     */
    public java.lang.Double getCapMan__net_income_Q3__c() {
        return capMan__net_income_Q3__c;
    }


    /**
     * Sets the capMan__net_income_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__net_income_Q3__c
     */
    public void setCapMan__net_income_Q3__c(java.lang.Double capMan__net_income_Q3__c) {
        this.capMan__net_income_Q3__c = capMan__net_income_Q3__c;
    }


    /**
     * Gets the capMan__net_income_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__net_income_Q4__c
     */
    public java.lang.Double getCapMan__net_income_Q4__c() {
        return capMan__net_income_Q4__c;
    }


    /**
     * Sets the capMan__net_income_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__net_income_Q4__c
     */
    public void setCapMan__net_income_Q4__c(java.lang.Double capMan__net_income_Q4__c) {
        this.capMan__net_income_Q4__c = capMan__net_income_Q4__c;
    }


    /**
     * Gets the capMan__revenue_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__revenue_Q1__c
     */
    public java.lang.Double getCapMan__revenue_Q1__c() {
        return capMan__revenue_Q1__c;
    }


    /**
     * Sets the capMan__revenue_Q1__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__revenue_Q1__c
     */
    public void setCapMan__revenue_Q1__c(java.lang.Double capMan__revenue_Q1__c) {
        this.capMan__revenue_Q1__c = capMan__revenue_Q1__c;
    }


    /**
     * Gets the capMan__revenue_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__revenue_Q2__c
     */
    public java.lang.Double getCapMan__revenue_Q2__c() {
        return capMan__revenue_Q2__c;
    }


    /**
     * Sets the capMan__revenue_Q2__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__revenue_Q2__c
     */
    public void setCapMan__revenue_Q2__c(java.lang.Double capMan__revenue_Q2__c) {
        this.capMan__revenue_Q2__c = capMan__revenue_Q2__c;
    }


    /**
     * Gets the capMan__revenue_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__revenue_Q3__c
     */
    public java.lang.Double getCapMan__revenue_Q3__c() {
        return capMan__revenue_Q3__c;
    }


    /**
     * Sets the capMan__revenue_Q3__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__revenue_Q3__c
     */
    public void setCapMan__revenue_Q3__c(java.lang.Double capMan__revenue_Q3__c) {
        this.capMan__revenue_Q3__c = capMan__revenue_Q3__c;
    }


    /**
     * Gets the capMan__revenue_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @return capMan__revenue_Q4__c
     */
    public java.lang.Double getCapMan__revenue_Q4__c() {
        return capMan__revenue_Q4__c;
    }


    /**
     * Sets the capMan__revenue_Q4__c value for this CapMan__Financial_Data__c.
     * 
     * @param capMan__revenue_Q4__c
     */
    public void setCapMan__revenue_Q4__c(java.lang.Double capMan__revenue_Q4__c) {
        this.capMan__revenue_Q4__c = capMan__revenue_Q4__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Financial_Data__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Financial_Data__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Financial_Data__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Financial_Data__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Financial_Data__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Financial_Data__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Financial_Data__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Financial_Data__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Financial_Data__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Financial_Data__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Financial_Data__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Financial_Data__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Financial_Data__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Financial_Data__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Financial_Data__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Financial_Data__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Financial_Data__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Financial_Data__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Financial_Data__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Financial_Data__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Financial_Data__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Financial_Data__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Financial_Data__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Financial_Data__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this CapMan__Financial_Data__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__Financial_Data__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__Financial_Data__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__Financial_Data__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__Financial_Data__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Financial_Data__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Financial_Data__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Financial_Data__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Financial_Data__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Financial_Data__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Financial_Data__c)) return false;
        CapMan__Financial_Data__c other = (CapMan__Financial_Data__c) obj;
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
            ((this.capMan__Capitalization__c==null && other.getCapMan__Capitalization__c()==null) || 
             (this.capMan__Capitalization__c!=null &&
              this.capMan__Capitalization__c.equals(other.getCapMan__Capitalization__c()))) &&
            ((this.capMan__Capitalization__r==null && other.getCapMan__Capitalization__r()==null) || 
             (this.capMan__Capitalization__r!=null &&
              this.capMan__Capitalization__r.equals(other.getCapMan__Capitalization__r()))) &&
            ((this.capMan__EBITDA_Annual__c==null && other.getCapMan__EBITDA_Annual__c()==null) || 
             (this.capMan__EBITDA_Annual__c!=null &&
              this.capMan__EBITDA_Annual__c.equals(other.getCapMan__EBITDA_Annual__c()))) &&
            ((this.capMan__EBITDA_Q1__c==null && other.getCapMan__EBITDA_Q1__c()==null) || 
             (this.capMan__EBITDA_Q1__c!=null &&
              this.capMan__EBITDA_Q1__c.equals(other.getCapMan__EBITDA_Q1__c()))) &&
            ((this.capMan__EBITDA_Q2__c==null && other.getCapMan__EBITDA_Q2__c()==null) || 
             (this.capMan__EBITDA_Q2__c!=null &&
              this.capMan__EBITDA_Q2__c.equals(other.getCapMan__EBITDA_Q2__c()))) &&
            ((this.capMan__EBITDA_Q3__c==null && other.getCapMan__EBITDA_Q3__c()==null) || 
             (this.capMan__EBITDA_Q3__c!=null &&
              this.capMan__EBITDA_Q3__c.equals(other.getCapMan__EBITDA_Q3__c()))) &&
            ((this.capMan__EBITDA_Q4__c==null && other.getCapMan__EBITDA_Q4__c()==null) || 
             (this.capMan__EBITDA_Q4__c!=null &&
              this.capMan__EBITDA_Q4__c.equals(other.getCapMan__EBITDA_Q4__c()))) &&
            ((this.capMan__Financial_Data_Line_Items__r==null && other.getCapMan__Financial_Data_Line_Items__r()==null) || 
             (this.capMan__Financial_Data_Line_Items__r!=null &&
              this.capMan__Financial_Data_Line_Items__r.equals(other.getCapMan__Financial_Data_Line_Items__r()))) &&
            ((this.capMan__Forecast_EBITDA_Annual__c==null && other.getCapMan__Forecast_EBITDA_Annual__c()==null) || 
             (this.capMan__Forecast_EBITDA_Annual__c!=null &&
              this.capMan__Forecast_EBITDA_Annual__c.equals(other.getCapMan__Forecast_EBITDA_Annual__c()))) &&
            ((this.capMan__Forecast_EBITDA_Q1__c==null && other.getCapMan__Forecast_EBITDA_Q1__c()==null) || 
             (this.capMan__Forecast_EBITDA_Q1__c!=null &&
              this.capMan__Forecast_EBITDA_Q1__c.equals(other.getCapMan__Forecast_EBITDA_Q1__c()))) &&
            ((this.capMan__Forecast_EBITDA_Q2__c==null && other.getCapMan__Forecast_EBITDA_Q2__c()==null) || 
             (this.capMan__Forecast_EBITDA_Q2__c!=null &&
              this.capMan__Forecast_EBITDA_Q2__c.equals(other.getCapMan__Forecast_EBITDA_Q2__c()))) &&
            ((this.capMan__Forecast_EBITDA_Q3__c==null && other.getCapMan__Forecast_EBITDA_Q3__c()==null) || 
             (this.capMan__Forecast_EBITDA_Q3__c!=null &&
              this.capMan__Forecast_EBITDA_Q3__c.equals(other.getCapMan__Forecast_EBITDA_Q3__c()))) &&
            ((this.capMan__Forecast_EBITDA_Q4__c==null && other.getCapMan__Forecast_EBITDA_Q4__c()==null) || 
             (this.capMan__Forecast_EBITDA_Q4__c!=null &&
              this.capMan__Forecast_EBITDA_Q4__c.equals(other.getCapMan__Forecast_EBITDA_Q4__c()))) &&
            ((this.capMan__Forecast_Net_Income_Annual__c==null && other.getCapMan__Forecast_Net_Income_Annual__c()==null) || 
             (this.capMan__Forecast_Net_Income_Annual__c!=null &&
              this.capMan__Forecast_Net_Income_Annual__c.equals(other.getCapMan__Forecast_Net_Income_Annual__c()))) &&
            ((this.capMan__Forecast_Net_Income_Q1__c==null && other.getCapMan__Forecast_Net_Income_Q1__c()==null) || 
             (this.capMan__Forecast_Net_Income_Q1__c!=null &&
              this.capMan__Forecast_Net_Income_Q1__c.equals(other.getCapMan__Forecast_Net_Income_Q1__c()))) &&
            ((this.capMan__Forecast_Net_Income_Q2__c==null && other.getCapMan__Forecast_Net_Income_Q2__c()==null) || 
             (this.capMan__Forecast_Net_Income_Q2__c!=null &&
              this.capMan__Forecast_Net_Income_Q2__c.equals(other.getCapMan__Forecast_Net_Income_Q2__c()))) &&
            ((this.capMan__Forecast_Net_Income_Q3__c==null && other.getCapMan__Forecast_Net_Income_Q3__c()==null) || 
             (this.capMan__Forecast_Net_Income_Q3__c!=null &&
              this.capMan__Forecast_Net_Income_Q3__c.equals(other.getCapMan__Forecast_Net_Income_Q3__c()))) &&
            ((this.capMan__Forecast_Net_Income_Q4__c==null && other.getCapMan__Forecast_Net_Income_Q4__c()==null) || 
             (this.capMan__Forecast_Net_Income_Q4__c!=null &&
              this.capMan__Forecast_Net_Income_Q4__c.equals(other.getCapMan__Forecast_Net_Income_Q4__c()))) &&
            ((this.capMan__Forecast_Revenue_Annual__c==null && other.getCapMan__Forecast_Revenue_Annual__c()==null) || 
             (this.capMan__Forecast_Revenue_Annual__c!=null &&
              this.capMan__Forecast_Revenue_Annual__c.equals(other.getCapMan__Forecast_Revenue_Annual__c()))) &&
            ((this.capMan__Forecast_Revenue_Q1__c==null && other.getCapMan__Forecast_Revenue_Q1__c()==null) || 
             (this.capMan__Forecast_Revenue_Q1__c!=null &&
              this.capMan__Forecast_Revenue_Q1__c.equals(other.getCapMan__Forecast_Revenue_Q1__c()))) &&
            ((this.capMan__Forecast_Revenue_Q2__c==null && other.getCapMan__Forecast_Revenue_Q2__c()==null) || 
             (this.capMan__Forecast_Revenue_Q2__c!=null &&
              this.capMan__Forecast_Revenue_Q2__c.equals(other.getCapMan__Forecast_Revenue_Q2__c()))) &&
            ((this.capMan__Forecast_Revenue_Q3__c==null && other.getCapMan__Forecast_Revenue_Q3__c()==null) || 
             (this.capMan__Forecast_Revenue_Q3__c!=null &&
              this.capMan__Forecast_Revenue_Q3__c.equals(other.getCapMan__Forecast_Revenue_Q3__c()))) &&
            ((this.capMan__Forecast_Revenue_Q4__c==null && other.getCapMan__Forecast_Revenue_Q4__c()==null) || 
             (this.capMan__Forecast_Revenue_Q4__c!=null &&
              this.capMan__Forecast_Revenue_Q4__c.equals(other.getCapMan__Forecast_Revenue_Q4__c()))) &&
            ((this.capMan__Net_Income_Annual__c==null && other.getCapMan__Net_Income_Annual__c()==null) || 
             (this.capMan__Net_Income_Annual__c!=null &&
              this.capMan__Net_Income_Annual__c.equals(other.getCapMan__Net_Income_Annual__c()))) &&
            ((this.capMan__Revenue_Annual__c==null && other.getCapMan__Revenue_Annual__c()==null) || 
             (this.capMan__Revenue_Annual__c!=null &&
              this.capMan__Revenue_Annual__c.equals(other.getCapMan__Revenue_Annual__c()))) &&
            ((this.capMan__fiscal_close__c==null && other.getCapMan__fiscal_close__c()==null) || 
             (this.capMan__fiscal_close__c!=null &&
              this.capMan__fiscal_close__c.equals(other.getCapMan__fiscal_close__c()))) &&
            ((this.capMan__net_income_Q1__c==null && other.getCapMan__net_income_Q1__c()==null) || 
             (this.capMan__net_income_Q1__c!=null &&
              this.capMan__net_income_Q1__c.equals(other.getCapMan__net_income_Q1__c()))) &&
            ((this.capMan__net_income_Q2__c==null && other.getCapMan__net_income_Q2__c()==null) || 
             (this.capMan__net_income_Q2__c!=null &&
              this.capMan__net_income_Q2__c.equals(other.getCapMan__net_income_Q2__c()))) &&
            ((this.capMan__net_income_Q3__c==null && other.getCapMan__net_income_Q3__c()==null) || 
             (this.capMan__net_income_Q3__c!=null &&
              this.capMan__net_income_Q3__c.equals(other.getCapMan__net_income_Q3__c()))) &&
            ((this.capMan__net_income_Q4__c==null && other.getCapMan__net_income_Q4__c()==null) || 
             (this.capMan__net_income_Q4__c!=null &&
              this.capMan__net_income_Q4__c.equals(other.getCapMan__net_income_Q4__c()))) &&
            ((this.capMan__revenue_Q1__c==null && other.getCapMan__revenue_Q1__c()==null) || 
             (this.capMan__revenue_Q1__c!=null &&
              this.capMan__revenue_Q1__c.equals(other.getCapMan__revenue_Q1__c()))) &&
            ((this.capMan__revenue_Q2__c==null && other.getCapMan__revenue_Q2__c()==null) || 
             (this.capMan__revenue_Q2__c!=null &&
              this.capMan__revenue_Q2__c.equals(other.getCapMan__revenue_Q2__c()))) &&
            ((this.capMan__revenue_Q3__c==null && other.getCapMan__revenue_Q3__c()==null) || 
             (this.capMan__revenue_Q3__c!=null &&
              this.capMan__revenue_Q3__c.equals(other.getCapMan__revenue_Q3__c()))) &&
            ((this.capMan__revenue_Q4__c==null && other.getCapMan__revenue_Q4__c()==null) || 
             (this.capMan__revenue_Q4__c!=null &&
              this.capMan__revenue_Q4__c.equals(other.getCapMan__revenue_Q4__c()))) &&
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
        if (getCapMan__Capitalization__c() != null) {
            _hashCode += getCapMan__Capitalization__c().hashCode();
        }
        if (getCapMan__Capitalization__r() != null) {
            _hashCode += getCapMan__Capitalization__r().hashCode();
        }
        if (getCapMan__EBITDA_Annual__c() != null) {
            _hashCode += getCapMan__EBITDA_Annual__c().hashCode();
        }
        if (getCapMan__EBITDA_Q1__c() != null) {
            _hashCode += getCapMan__EBITDA_Q1__c().hashCode();
        }
        if (getCapMan__EBITDA_Q2__c() != null) {
            _hashCode += getCapMan__EBITDA_Q2__c().hashCode();
        }
        if (getCapMan__EBITDA_Q3__c() != null) {
            _hashCode += getCapMan__EBITDA_Q3__c().hashCode();
        }
        if (getCapMan__EBITDA_Q4__c() != null) {
            _hashCode += getCapMan__EBITDA_Q4__c().hashCode();
        }
        if (getCapMan__Financial_Data_Line_Items__r() != null) {
            _hashCode += getCapMan__Financial_Data_Line_Items__r().hashCode();
        }
        if (getCapMan__Forecast_EBITDA_Annual__c() != null) {
            _hashCode += getCapMan__Forecast_EBITDA_Annual__c().hashCode();
        }
        if (getCapMan__Forecast_EBITDA_Q1__c() != null) {
            _hashCode += getCapMan__Forecast_EBITDA_Q1__c().hashCode();
        }
        if (getCapMan__Forecast_EBITDA_Q2__c() != null) {
            _hashCode += getCapMan__Forecast_EBITDA_Q2__c().hashCode();
        }
        if (getCapMan__Forecast_EBITDA_Q3__c() != null) {
            _hashCode += getCapMan__Forecast_EBITDA_Q3__c().hashCode();
        }
        if (getCapMan__Forecast_EBITDA_Q4__c() != null) {
            _hashCode += getCapMan__Forecast_EBITDA_Q4__c().hashCode();
        }
        if (getCapMan__Forecast_Net_Income_Annual__c() != null) {
            _hashCode += getCapMan__Forecast_Net_Income_Annual__c().hashCode();
        }
        if (getCapMan__Forecast_Net_Income_Q1__c() != null) {
            _hashCode += getCapMan__Forecast_Net_Income_Q1__c().hashCode();
        }
        if (getCapMan__Forecast_Net_Income_Q2__c() != null) {
            _hashCode += getCapMan__Forecast_Net_Income_Q2__c().hashCode();
        }
        if (getCapMan__Forecast_Net_Income_Q3__c() != null) {
            _hashCode += getCapMan__Forecast_Net_Income_Q3__c().hashCode();
        }
        if (getCapMan__Forecast_Net_Income_Q4__c() != null) {
            _hashCode += getCapMan__Forecast_Net_Income_Q4__c().hashCode();
        }
        if (getCapMan__Forecast_Revenue_Annual__c() != null) {
            _hashCode += getCapMan__Forecast_Revenue_Annual__c().hashCode();
        }
        if (getCapMan__Forecast_Revenue_Q1__c() != null) {
            _hashCode += getCapMan__Forecast_Revenue_Q1__c().hashCode();
        }
        if (getCapMan__Forecast_Revenue_Q2__c() != null) {
            _hashCode += getCapMan__Forecast_Revenue_Q2__c().hashCode();
        }
        if (getCapMan__Forecast_Revenue_Q3__c() != null) {
            _hashCode += getCapMan__Forecast_Revenue_Q3__c().hashCode();
        }
        if (getCapMan__Forecast_Revenue_Q4__c() != null) {
            _hashCode += getCapMan__Forecast_Revenue_Q4__c().hashCode();
        }
        if (getCapMan__Net_Income_Annual__c() != null) {
            _hashCode += getCapMan__Net_Income_Annual__c().hashCode();
        }
        if (getCapMan__Revenue_Annual__c() != null) {
            _hashCode += getCapMan__Revenue_Annual__c().hashCode();
        }
        if (getCapMan__fiscal_close__c() != null) {
            _hashCode += getCapMan__fiscal_close__c().hashCode();
        }
        if (getCapMan__net_income_Q1__c() != null) {
            _hashCode += getCapMan__net_income_Q1__c().hashCode();
        }
        if (getCapMan__net_income_Q2__c() != null) {
            _hashCode += getCapMan__net_income_Q2__c().hashCode();
        }
        if (getCapMan__net_income_Q3__c() != null) {
            _hashCode += getCapMan__net_income_Q3__c().hashCode();
        }
        if (getCapMan__net_income_Q4__c() != null) {
            _hashCode += getCapMan__net_income_Q4__c().hashCode();
        }
        if (getCapMan__revenue_Q1__c() != null) {
            _hashCode += getCapMan__revenue_Q1__c().hashCode();
        }
        if (getCapMan__revenue_Q2__c() != null) {
            _hashCode += getCapMan__revenue_Q2__c().hashCode();
        }
        if (getCapMan__revenue_Q3__c() != null) {
            _hashCode += getCapMan__revenue_Q3__c().hashCode();
        }
        if (getCapMan__revenue_Q4__c() != null) {
            _hashCode += getCapMan__revenue_Q4__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Financial_Data__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Data__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Capitalization__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Capitalization__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Capitalization__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Capitalization__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Capitalization__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EBITDA_Annual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EBITDA_Annual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EBITDA_Q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EBITDA_Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EBITDA_Q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EBITDA_Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EBITDA_Q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EBITDA_Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EBITDA_Q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EBITDA_Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Financial_Data_Line_Items__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Data_Line_Items__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_EBITDA_Annual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_EBITDA_Annual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_EBITDA_Q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_EBITDA_Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_EBITDA_Q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_EBITDA_Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_EBITDA_Q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_EBITDA_Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_EBITDA_Q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_EBITDA_Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Net_Income_Annual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Net_Income_Annual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Net_Income_Q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Net_Income_Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Net_Income_Q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Net_Income_Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Net_Income_Q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Net_Income_Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Net_Income_Q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Net_Income_Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Revenue_Annual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Revenue_Annual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Revenue_Q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Revenue_Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Revenue_Q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Revenue_Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Revenue_Q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Revenue_Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Forecast_Revenue_Q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Forecast_Revenue_Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Net_Income_Annual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Net_Income_Annual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Revenue_Annual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Revenue_Annual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__fiscal_close__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__fiscal_close__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__net_income_Q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__net_income_Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__net_income_Q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__net_income_Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__net_income_Q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__net_income_Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__net_income_Q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__net_income_Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__revenue_Q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__revenue_Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__revenue_Q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__revenue_Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__revenue_Q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__revenue_Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__revenue_Q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__revenue_Q4__c"));
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
