/**
 * CapMan__Company_Overview__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Company_Overview__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Account__c;

    private com.sforce.soap.enterprise.sobject.Account capMan__Account__r;

    private java.lang.String capMan__Company__c;

    private java.lang.Double capMan__Diluted__c;

    private java.lang.String capMan__Existing_Competitors__c;

    private java.lang.String capMan__Existing_Customers__c;

    private java.lang.String capMan__Exit_Path__c;

    private java.lang.Double capMan__Expect_Price__c;

    private java.lang.String capMan__Growth_Perspectives__c;

    private java.lang.String capMan__Industry__c;

    private java.lang.String capMan__Key_Employee_1__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_1__r;

    private java.lang.String capMan__Key_Employee_2__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_2__r;

    private java.lang.String capMan__Key_Employee_3__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_3__r;

    private java.lang.String capMan__Liquidation_Preference__c;

    private java.lang.String capMan__Market_Market_Segment__c;

    private java.util.Date capMan__Monitoring_Date__c;

    private java.lang.String capMan__New_Customers__c;

    private java.lang.String capMan__Potential_Acquirers__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Registered_Investors__r;

    private java.lang.String capMan__Sub_Industry__c;

    private java.util.Date capMan__Time_of_Exit__c;

    private java.lang.Double capMan__Undiluted__c;

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

    public CapMan__Company_Overview__c() {
    }

    public CapMan__Company_Overview__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Account__c,
           com.sforce.soap.enterprise.sobject.Account capMan__Account__r,
           java.lang.String capMan__Company__c,
           java.lang.Double capMan__Diluted__c,
           java.lang.String capMan__Existing_Competitors__c,
           java.lang.String capMan__Existing_Customers__c,
           java.lang.String capMan__Exit_Path__c,
           java.lang.Double capMan__Expect_Price__c,
           java.lang.String capMan__Growth_Perspectives__c,
           java.lang.String capMan__Industry__c,
           java.lang.String capMan__Key_Employee_1__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_1__r,
           java.lang.String capMan__Key_Employee_2__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_2__r,
           java.lang.String capMan__Key_Employee_3__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_3__r,
           java.lang.String capMan__Liquidation_Preference__c,
           java.lang.String capMan__Market_Market_Segment__c,
           java.util.Date capMan__Monitoring_Date__c,
           java.lang.String capMan__New_Customers__c,
           java.lang.String capMan__Potential_Acquirers__c,
           com.sforce.soap.enterprise.QueryResult capMan__Registered_Investors__r,
           java.lang.String capMan__Sub_Industry__c,
           java.util.Date capMan__Time_of_Exit__c,
           java.lang.Double capMan__Undiluted__c,
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
        this.capMan__Account__c = capMan__Account__c;
        this.capMan__Account__r = capMan__Account__r;
        this.capMan__Company__c = capMan__Company__c;
        this.capMan__Diluted__c = capMan__Diluted__c;
        this.capMan__Existing_Competitors__c = capMan__Existing_Competitors__c;
        this.capMan__Existing_Customers__c = capMan__Existing_Customers__c;
        this.capMan__Exit_Path__c = capMan__Exit_Path__c;
        this.capMan__Expect_Price__c = capMan__Expect_Price__c;
        this.capMan__Growth_Perspectives__c = capMan__Growth_Perspectives__c;
        this.capMan__Industry__c = capMan__Industry__c;
        this.capMan__Key_Employee_1__c = capMan__Key_Employee_1__c;
        this.capMan__Key_Employee_1__r = capMan__Key_Employee_1__r;
        this.capMan__Key_Employee_2__c = capMan__Key_Employee_2__c;
        this.capMan__Key_Employee_2__r = capMan__Key_Employee_2__r;
        this.capMan__Key_Employee_3__c = capMan__Key_Employee_3__c;
        this.capMan__Key_Employee_3__r = capMan__Key_Employee_3__r;
        this.capMan__Liquidation_Preference__c = capMan__Liquidation_Preference__c;
        this.capMan__Market_Market_Segment__c = capMan__Market_Market_Segment__c;
        this.capMan__Monitoring_Date__c = capMan__Monitoring_Date__c;
        this.capMan__New_Customers__c = capMan__New_Customers__c;
        this.capMan__Potential_Acquirers__c = capMan__Potential_Acquirers__c;
        this.capMan__Registered_Investors__r = capMan__Registered_Investors__r;
        this.capMan__Sub_Industry__c = capMan__Sub_Industry__c;
        this.capMan__Time_of_Exit__c = capMan__Time_of_Exit__c;
        this.capMan__Undiluted__c = capMan__Undiluted__c;
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
     * Gets the attachments value for this CapMan__Company_Overview__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Company_Overview__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Account__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Account__c
     */
    public java.lang.String getCapMan__Account__c() {
        return capMan__Account__c;
    }


    /**
     * Sets the capMan__Account__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Account__c
     */
    public void setCapMan__Account__c(java.lang.String capMan__Account__c) {
        this.capMan__Account__c = capMan__Account__c;
    }


    /**
     * Gets the capMan__Account__r value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getCapMan__Account__r() {
        return capMan__Account__r;
    }


    /**
     * Sets the capMan__Account__r value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Account__r
     */
    public void setCapMan__Account__r(com.sforce.soap.enterprise.sobject.Account capMan__Account__r) {
        this.capMan__Account__r = capMan__Account__r;
    }


    /**
     * Gets the capMan__Company__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Company__c
     */
    public java.lang.String getCapMan__Company__c() {
        return capMan__Company__c;
    }


    /**
     * Sets the capMan__Company__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Company__c
     */
    public void setCapMan__Company__c(java.lang.String capMan__Company__c) {
        this.capMan__Company__c = capMan__Company__c;
    }


    /**
     * Gets the capMan__Diluted__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Diluted__c
     */
    public java.lang.Double getCapMan__Diluted__c() {
        return capMan__Diluted__c;
    }


    /**
     * Sets the capMan__Diluted__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Diluted__c
     */
    public void setCapMan__Diluted__c(java.lang.Double capMan__Diluted__c) {
        this.capMan__Diluted__c = capMan__Diluted__c;
    }


    /**
     * Gets the capMan__Existing_Competitors__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Existing_Competitors__c
     */
    public java.lang.String getCapMan__Existing_Competitors__c() {
        return capMan__Existing_Competitors__c;
    }


    /**
     * Sets the capMan__Existing_Competitors__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Existing_Competitors__c
     */
    public void setCapMan__Existing_Competitors__c(java.lang.String capMan__Existing_Competitors__c) {
        this.capMan__Existing_Competitors__c = capMan__Existing_Competitors__c;
    }


    /**
     * Gets the capMan__Existing_Customers__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Existing_Customers__c
     */
    public java.lang.String getCapMan__Existing_Customers__c() {
        return capMan__Existing_Customers__c;
    }


    /**
     * Sets the capMan__Existing_Customers__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Existing_Customers__c
     */
    public void setCapMan__Existing_Customers__c(java.lang.String capMan__Existing_Customers__c) {
        this.capMan__Existing_Customers__c = capMan__Existing_Customers__c;
    }


    /**
     * Gets the capMan__Exit_Path__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Exit_Path__c
     */
    public java.lang.String getCapMan__Exit_Path__c() {
        return capMan__Exit_Path__c;
    }


    /**
     * Sets the capMan__Exit_Path__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Exit_Path__c
     */
    public void setCapMan__Exit_Path__c(java.lang.String capMan__Exit_Path__c) {
        this.capMan__Exit_Path__c = capMan__Exit_Path__c;
    }


    /**
     * Gets the capMan__Expect_Price__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Expect_Price__c
     */
    public java.lang.Double getCapMan__Expect_Price__c() {
        return capMan__Expect_Price__c;
    }


    /**
     * Sets the capMan__Expect_Price__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Expect_Price__c
     */
    public void setCapMan__Expect_Price__c(java.lang.Double capMan__Expect_Price__c) {
        this.capMan__Expect_Price__c = capMan__Expect_Price__c;
    }


    /**
     * Gets the capMan__Growth_Perspectives__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Growth_Perspectives__c
     */
    public java.lang.String getCapMan__Growth_Perspectives__c() {
        return capMan__Growth_Perspectives__c;
    }


    /**
     * Sets the capMan__Growth_Perspectives__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Growth_Perspectives__c
     */
    public void setCapMan__Growth_Perspectives__c(java.lang.String capMan__Growth_Perspectives__c) {
        this.capMan__Growth_Perspectives__c = capMan__Growth_Perspectives__c;
    }


    /**
     * Gets the capMan__Industry__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Industry__c
     */
    public java.lang.String getCapMan__Industry__c() {
        return capMan__Industry__c;
    }


    /**
     * Sets the capMan__Industry__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Industry__c
     */
    public void setCapMan__Industry__c(java.lang.String capMan__Industry__c) {
        this.capMan__Industry__c = capMan__Industry__c;
    }


    /**
     * Gets the capMan__Key_Employee_1__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Key_Employee_1__c
     */
    public java.lang.String getCapMan__Key_Employee_1__c() {
        return capMan__Key_Employee_1__c;
    }


    /**
     * Sets the capMan__Key_Employee_1__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Key_Employee_1__c
     */
    public void setCapMan__Key_Employee_1__c(java.lang.String capMan__Key_Employee_1__c) {
        this.capMan__Key_Employee_1__c = capMan__Key_Employee_1__c;
    }


    /**
     * Gets the capMan__Key_Employee_1__r value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Key_Employee_1__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Key_Employee_1__r() {
        return capMan__Key_Employee_1__r;
    }


    /**
     * Sets the capMan__Key_Employee_1__r value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Key_Employee_1__r
     */
    public void setCapMan__Key_Employee_1__r(com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_1__r) {
        this.capMan__Key_Employee_1__r = capMan__Key_Employee_1__r;
    }


    /**
     * Gets the capMan__Key_Employee_2__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Key_Employee_2__c
     */
    public java.lang.String getCapMan__Key_Employee_2__c() {
        return capMan__Key_Employee_2__c;
    }


    /**
     * Sets the capMan__Key_Employee_2__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Key_Employee_2__c
     */
    public void setCapMan__Key_Employee_2__c(java.lang.String capMan__Key_Employee_2__c) {
        this.capMan__Key_Employee_2__c = capMan__Key_Employee_2__c;
    }


    /**
     * Gets the capMan__Key_Employee_2__r value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Key_Employee_2__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Key_Employee_2__r() {
        return capMan__Key_Employee_2__r;
    }


    /**
     * Sets the capMan__Key_Employee_2__r value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Key_Employee_2__r
     */
    public void setCapMan__Key_Employee_2__r(com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_2__r) {
        this.capMan__Key_Employee_2__r = capMan__Key_Employee_2__r;
    }


    /**
     * Gets the capMan__Key_Employee_3__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Key_Employee_3__c
     */
    public java.lang.String getCapMan__Key_Employee_3__c() {
        return capMan__Key_Employee_3__c;
    }


    /**
     * Sets the capMan__Key_Employee_3__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Key_Employee_3__c
     */
    public void setCapMan__Key_Employee_3__c(java.lang.String capMan__Key_Employee_3__c) {
        this.capMan__Key_Employee_3__c = capMan__Key_Employee_3__c;
    }


    /**
     * Gets the capMan__Key_Employee_3__r value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Key_Employee_3__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Key_Employee_3__r() {
        return capMan__Key_Employee_3__r;
    }


    /**
     * Sets the capMan__Key_Employee_3__r value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Key_Employee_3__r
     */
    public void setCapMan__Key_Employee_3__r(com.sforce.soap.enterprise.sobject.Contact capMan__Key_Employee_3__r) {
        this.capMan__Key_Employee_3__r = capMan__Key_Employee_3__r;
    }


    /**
     * Gets the capMan__Liquidation_Preference__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Liquidation_Preference__c
     */
    public java.lang.String getCapMan__Liquidation_Preference__c() {
        return capMan__Liquidation_Preference__c;
    }


    /**
     * Sets the capMan__Liquidation_Preference__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Liquidation_Preference__c
     */
    public void setCapMan__Liquidation_Preference__c(java.lang.String capMan__Liquidation_Preference__c) {
        this.capMan__Liquidation_Preference__c = capMan__Liquidation_Preference__c;
    }


    /**
     * Gets the capMan__Market_Market_Segment__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Market_Market_Segment__c
     */
    public java.lang.String getCapMan__Market_Market_Segment__c() {
        return capMan__Market_Market_Segment__c;
    }


    /**
     * Sets the capMan__Market_Market_Segment__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Market_Market_Segment__c
     */
    public void setCapMan__Market_Market_Segment__c(java.lang.String capMan__Market_Market_Segment__c) {
        this.capMan__Market_Market_Segment__c = capMan__Market_Market_Segment__c;
    }


    /**
     * Gets the capMan__Monitoring_Date__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Monitoring_Date__c
     */
    public java.util.Date getCapMan__Monitoring_Date__c() {
        return capMan__Monitoring_Date__c;
    }


    /**
     * Sets the capMan__Monitoring_Date__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Monitoring_Date__c
     */
    public void setCapMan__Monitoring_Date__c(java.util.Date capMan__Monitoring_Date__c) {
        this.capMan__Monitoring_Date__c = capMan__Monitoring_Date__c;
    }


    /**
     * Gets the capMan__New_Customers__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__New_Customers__c
     */
    public java.lang.String getCapMan__New_Customers__c() {
        return capMan__New_Customers__c;
    }


    /**
     * Sets the capMan__New_Customers__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__New_Customers__c
     */
    public void setCapMan__New_Customers__c(java.lang.String capMan__New_Customers__c) {
        this.capMan__New_Customers__c = capMan__New_Customers__c;
    }


    /**
     * Gets the capMan__Potential_Acquirers__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Potential_Acquirers__c
     */
    public java.lang.String getCapMan__Potential_Acquirers__c() {
        return capMan__Potential_Acquirers__c;
    }


    /**
     * Sets the capMan__Potential_Acquirers__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Potential_Acquirers__c
     */
    public void setCapMan__Potential_Acquirers__c(java.lang.String capMan__Potential_Acquirers__c) {
        this.capMan__Potential_Acquirers__c = capMan__Potential_Acquirers__c;
    }


    /**
     * Gets the capMan__Registered_Investors__r value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Registered_Investors__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Registered_Investors__r() {
        return capMan__Registered_Investors__r;
    }


    /**
     * Sets the capMan__Registered_Investors__r value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Registered_Investors__r
     */
    public void setCapMan__Registered_Investors__r(com.sforce.soap.enterprise.QueryResult capMan__Registered_Investors__r) {
        this.capMan__Registered_Investors__r = capMan__Registered_Investors__r;
    }


    /**
     * Gets the capMan__Sub_Industry__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Sub_Industry__c
     */
    public java.lang.String getCapMan__Sub_Industry__c() {
        return capMan__Sub_Industry__c;
    }


    /**
     * Sets the capMan__Sub_Industry__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Sub_Industry__c
     */
    public void setCapMan__Sub_Industry__c(java.lang.String capMan__Sub_Industry__c) {
        this.capMan__Sub_Industry__c = capMan__Sub_Industry__c;
    }


    /**
     * Gets the capMan__Time_of_Exit__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Time_of_Exit__c
     */
    public java.util.Date getCapMan__Time_of_Exit__c() {
        return capMan__Time_of_Exit__c;
    }


    /**
     * Sets the capMan__Time_of_Exit__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Time_of_Exit__c
     */
    public void setCapMan__Time_of_Exit__c(java.util.Date capMan__Time_of_Exit__c) {
        this.capMan__Time_of_Exit__c = capMan__Time_of_Exit__c;
    }


    /**
     * Gets the capMan__Undiluted__c value for this CapMan__Company_Overview__c.
     * 
     * @return capMan__Undiluted__c
     */
    public java.lang.Double getCapMan__Undiluted__c() {
        return capMan__Undiluted__c;
    }


    /**
     * Sets the capMan__Undiluted__c value for this CapMan__Company_Overview__c.
     * 
     * @param capMan__Undiluted__c
     */
    public void setCapMan__Undiluted__c(java.lang.Double capMan__Undiluted__c) {
        this.capMan__Undiluted__c = capMan__Undiluted__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Company_Overview__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Company_Overview__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Company_Overview__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Company_Overview__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Company_Overview__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Company_Overview__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Company_Overview__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Company_Overview__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Company_Overview__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Company_Overview__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Company_Overview__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Company_Overview__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Company_Overview__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Company_Overview__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Company_Overview__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Company_Overview__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Company_Overview__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Company_Overview__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Company_Overview__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Company_Overview__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Company_Overview__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Company_Overview__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Company_Overview__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Company_Overview__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this CapMan__Company_Overview__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Company_Overview__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Company_Overview__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Company_Overview__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Company_Overview__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Company_Overview__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Company_Overview__c)) return false;
        CapMan__Company_Overview__c other = (CapMan__Company_Overview__c) obj;
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
            ((this.capMan__Account__c==null && other.getCapMan__Account__c()==null) || 
             (this.capMan__Account__c!=null &&
              this.capMan__Account__c.equals(other.getCapMan__Account__c()))) &&
            ((this.capMan__Account__r==null && other.getCapMan__Account__r()==null) || 
             (this.capMan__Account__r!=null &&
              this.capMan__Account__r.equals(other.getCapMan__Account__r()))) &&
            ((this.capMan__Company__c==null && other.getCapMan__Company__c()==null) || 
             (this.capMan__Company__c!=null &&
              this.capMan__Company__c.equals(other.getCapMan__Company__c()))) &&
            ((this.capMan__Diluted__c==null && other.getCapMan__Diluted__c()==null) || 
             (this.capMan__Diluted__c!=null &&
              this.capMan__Diluted__c.equals(other.getCapMan__Diluted__c()))) &&
            ((this.capMan__Existing_Competitors__c==null && other.getCapMan__Existing_Competitors__c()==null) || 
             (this.capMan__Existing_Competitors__c!=null &&
              this.capMan__Existing_Competitors__c.equals(other.getCapMan__Existing_Competitors__c()))) &&
            ((this.capMan__Existing_Customers__c==null && other.getCapMan__Existing_Customers__c()==null) || 
             (this.capMan__Existing_Customers__c!=null &&
              this.capMan__Existing_Customers__c.equals(other.getCapMan__Existing_Customers__c()))) &&
            ((this.capMan__Exit_Path__c==null && other.getCapMan__Exit_Path__c()==null) || 
             (this.capMan__Exit_Path__c!=null &&
              this.capMan__Exit_Path__c.equals(other.getCapMan__Exit_Path__c()))) &&
            ((this.capMan__Expect_Price__c==null && other.getCapMan__Expect_Price__c()==null) || 
             (this.capMan__Expect_Price__c!=null &&
              this.capMan__Expect_Price__c.equals(other.getCapMan__Expect_Price__c()))) &&
            ((this.capMan__Growth_Perspectives__c==null && other.getCapMan__Growth_Perspectives__c()==null) || 
             (this.capMan__Growth_Perspectives__c!=null &&
              this.capMan__Growth_Perspectives__c.equals(other.getCapMan__Growth_Perspectives__c()))) &&
            ((this.capMan__Industry__c==null && other.getCapMan__Industry__c()==null) || 
             (this.capMan__Industry__c!=null &&
              this.capMan__Industry__c.equals(other.getCapMan__Industry__c()))) &&
            ((this.capMan__Key_Employee_1__c==null && other.getCapMan__Key_Employee_1__c()==null) || 
             (this.capMan__Key_Employee_1__c!=null &&
              this.capMan__Key_Employee_1__c.equals(other.getCapMan__Key_Employee_1__c()))) &&
            ((this.capMan__Key_Employee_1__r==null && other.getCapMan__Key_Employee_1__r()==null) || 
             (this.capMan__Key_Employee_1__r!=null &&
              this.capMan__Key_Employee_1__r.equals(other.getCapMan__Key_Employee_1__r()))) &&
            ((this.capMan__Key_Employee_2__c==null && other.getCapMan__Key_Employee_2__c()==null) || 
             (this.capMan__Key_Employee_2__c!=null &&
              this.capMan__Key_Employee_2__c.equals(other.getCapMan__Key_Employee_2__c()))) &&
            ((this.capMan__Key_Employee_2__r==null && other.getCapMan__Key_Employee_2__r()==null) || 
             (this.capMan__Key_Employee_2__r!=null &&
              this.capMan__Key_Employee_2__r.equals(other.getCapMan__Key_Employee_2__r()))) &&
            ((this.capMan__Key_Employee_3__c==null && other.getCapMan__Key_Employee_3__c()==null) || 
             (this.capMan__Key_Employee_3__c!=null &&
              this.capMan__Key_Employee_3__c.equals(other.getCapMan__Key_Employee_3__c()))) &&
            ((this.capMan__Key_Employee_3__r==null && other.getCapMan__Key_Employee_3__r()==null) || 
             (this.capMan__Key_Employee_3__r!=null &&
              this.capMan__Key_Employee_3__r.equals(other.getCapMan__Key_Employee_3__r()))) &&
            ((this.capMan__Liquidation_Preference__c==null && other.getCapMan__Liquidation_Preference__c()==null) || 
             (this.capMan__Liquidation_Preference__c!=null &&
              this.capMan__Liquidation_Preference__c.equals(other.getCapMan__Liquidation_Preference__c()))) &&
            ((this.capMan__Market_Market_Segment__c==null && other.getCapMan__Market_Market_Segment__c()==null) || 
             (this.capMan__Market_Market_Segment__c!=null &&
              this.capMan__Market_Market_Segment__c.equals(other.getCapMan__Market_Market_Segment__c()))) &&
            ((this.capMan__Monitoring_Date__c==null && other.getCapMan__Monitoring_Date__c()==null) || 
             (this.capMan__Monitoring_Date__c!=null &&
              this.capMan__Monitoring_Date__c.equals(other.getCapMan__Monitoring_Date__c()))) &&
            ((this.capMan__New_Customers__c==null && other.getCapMan__New_Customers__c()==null) || 
             (this.capMan__New_Customers__c!=null &&
              this.capMan__New_Customers__c.equals(other.getCapMan__New_Customers__c()))) &&
            ((this.capMan__Potential_Acquirers__c==null && other.getCapMan__Potential_Acquirers__c()==null) || 
             (this.capMan__Potential_Acquirers__c!=null &&
              this.capMan__Potential_Acquirers__c.equals(other.getCapMan__Potential_Acquirers__c()))) &&
            ((this.capMan__Registered_Investors__r==null && other.getCapMan__Registered_Investors__r()==null) || 
             (this.capMan__Registered_Investors__r!=null &&
              this.capMan__Registered_Investors__r.equals(other.getCapMan__Registered_Investors__r()))) &&
            ((this.capMan__Sub_Industry__c==null && other.getCapMan__Sub_Industry__c()==null) || 
             (this.capMan__Sub_Industry__c!=null &&
              this.capMan__Sub_Industry__c.equals(other.getCapMan__Sub_Industry__c()))) &&
            ((this.capMan__Time_of_Exit__c==null && other.getCapMan__Time_of_Exit__c()==null) || 
             (this.capMan__Time_of_Exit__c!=null &&
              this.capMan__Time_of_Exit__c.equals(other.getCapMan__Time_of_Exit__c()))) &&
            ((this.capMan__Undiluted__c==null && other.getCapMan__Undiluted__c()==null) || 
             (this.capMan__Undiluted__c!=null &&
              this.capMan__Undiluted__c.equals(other.getCapMan__Undiluted__c()))) &&
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
        if (getCapMan__Account__c() != null) {
            _hashCode += getCapMan__Account__c().hashCode();
        }
        if (getCapMan__Account__r() != null) {
            _hashCode += getCapMan__Account__r().hashCode();
        }
        if (getCapMan__Company__c() != null) {
            _hashCode += getCapMan__Company__c().hashCode();
        }
        if (getCapMan__Diluted__c() != null) {
            _hashCode += getCapMan__Diluted__c().hashCode();
        }
        if (getCapMan__Existing_Competitors__c() != null) {
            _hashCode += getCapMan__Existing_Competitors__c().hashCode();
        }
        if (getCapMan__Existing_Customers__c() != null) {
            _hashCode += getCapMan__Existing_Customers__c().hashCode();
        }
        if (getCapMan__Exit_Path__c() != null) {
            _hashCode += getCapMan__Exit_Path__c().hashCode();
        }
        if (getCapMan__Expect_Price__c() != null) {
            _hashCode += getCapMan__Expect_Price__c().hashCode();
        }
        if (getCapMan__Growth_Perspectives__c() != null) {
            _hashCode += getCapMan__Growth_Perspectives__c().hashCode();
        }
        if (getCapMan__Industry__c() != null) {
            _hashCode += getCapMan__Industry__c().hashCode();
        }
        if (getCapMan__Key_Employee_1__c() != null) {
            _hashCode += getCapMan__Key_Employee_1__c().hashCode();
        }
        if (getCapMan__Key_Employee_1__r() != null) {
            _hashCode += getCapMan__Key_Employee_1__r().hashCode();
        }
        if (getCapMan__Key_Employee_2__c() != null) {
            _hashCode += getCapMan__Key_Employee_2__c().hashCode();
        }
        if (getCapMan__Key_Employee_2__r() != null) {
            _hashCode += getCapMan__Key_Employee_2__r().hashCode();
        }
        if (getCapMan__Key_Employee_3__c() != null) {
            _hashCode += getCapMan__Key_Employee_3__c().hashCode();
        }
        if (getCapMan__Key_Employee_3__r() != null) {
            _hashCode += getCapMan__Key_Employee_3__r().hashCode();
        }
        if (getCapMan__Liquidation_Preference__c() != null) {
            _hashCode += getCapMan__Liquidation_Preference__c().hashCode();
        }
        if (getCapMan__Market_Market_Segment__c() != null) {
            _hashCode += getCapMan__Market_Market_Segment__c().hashCode();
        }
        if (getCapMan__Monitoring_Date__c() != null) {
            _hashCode += getCapMan__Monitoring_Date__c().hashCode();
        }
        if (getCapMan__New_Customers__c() != null) {
            _hashCode += getCapMan__New_Customers__c().hashCode();
        }
        if (getCapMan__Potential_Acquirers__c() != null) {
            _hashCode += getCapMan__Potential_Acquirers__c().hashCode();
        }
        if (getCapMan__Registered_Investors__r() != null) {
            _hashCode += getCapMan__Registered_Investors__r().hashCode();
        }
        if (getCapMan__Sub_Industry__c() != null) {
            _hashCode += getCapMan__Sub_Industry__c().hashCode();
        }
        if (getCapMan__Time_of_Exit__c() != null) {
            _hashCode += getCapMan__Time_of_Exit__c().hashCode();
        }
        if (getCapMan__Undiluted__c() != null) {
            _hashCode += getCapMan__Undiluted__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Company_Overview__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Company_Overview__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("capMan__Company__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Company__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Diluted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Diluted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Existing_Competitors__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Existing_Competitors__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Existing_Customers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Existing_Customers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Exit_Path__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exit_Path__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Expect_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Expect_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Growth_Perspectives__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Growth_Perspectives__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Industry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Industry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_3__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_3__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidation_Preference__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Preference__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Market_Market_Segment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Market_Market_Segment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Monitoring_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Monitoring_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__New_Customers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__New_Customers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Potential_Acquirers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Potential_Acquirers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Registered_Investors__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registered_Investors__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Sub_Industry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Sub_Industry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Time_of_Exit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Time_of_Exit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Undiluted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Undiluted__c"));
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
