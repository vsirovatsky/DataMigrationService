/**
 * CapMan__Liquidation_Analytics__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Liquidation_Analytics__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__Adjusted_Value_Per_Common__c;

    private java.lang.Double capMan__Adjusted_Value_Total__c;

    private java.util.Date capMan__Analysis_Date__c;

    private java.lang.String capMan__Analyst__c;

    private java.lang.Double capMan__Calculated_Discount_Factor_Hidden__c;

    private java.lang.Double capMan__Calculated_Discount_Factor__c;

    private java.lang.Double capMan__Calculated_WACC__c;

    private java.lang.Double capMan__Common_Per_Share__c;

    private java.lang.Double capMan__DLOM__c;

    private java.lang.Double capMan__Days_Until__c;

    private java.lang.Double capMan__Discounted_Expected_Value__c;

    private java.lang.Boolean capMan__Include_in_Stock_Chart__c;

    private java.lang.String capMan__Independent_Valuation_by__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Independent_Valuation_by__r;

    private java.lang.String capMan__Issuer__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r;

    private com.sforce.soap.enterprise.QueryResult capMan__LiquidationSeniority__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Breakpoints__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Include_Derivatives__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Outstanding_Securities__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Preference__r;

    private java.lang.Double capMan__Liquidation_Value__c;

    private java.lang.Double capMan__Multiple__c;

    private java.lang.String capMan__Performance_Metric_Description__c;

    private java.lang.Double capMan__Performance_Metric_Value__c;

    private java.lang.Double capMan__Probability_Weighted_Common__c;

    private java.lang.Double capMan__Probability_of_Outcome__c;

    private java.lang.String capMan__Scenario_Name__c;

    private java.lang.Double capMan__Standard_Deviation_Days__c;

    private java.lang.Double capMan__Standard_Deviation__c;

    private java.util.Date capMan__Timing_Of_Event__c;

    private java.lang.String capMan__Valuation_Basis_Value__c;

    private java.lang.String capMan__Valuation_Basis__c;

    private java.lang.String capMan__Valuation_Type_Value__c;

    private java.lang.String capMan__Valuation_Type__c;

    private java.lang.Double capMan__Weighting__c;

    private java.lang.String capMan__Year__c;

    private java.lang.Double capMan__Years_Until__c;

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

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public CapMan__Liquidation_Analytics__c() {
    }

    public CapMan__Liquidation_Analytics__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__Adjusted_Value_Per_Common__c,
           java.lang.Double capMan__Adjusted_Value_Total__c,
           java.util.Date capMan__Analysis_Date__c,
           java.lang.String capMan__Analyst__c,
           java.lang.Double capMan__Calculated_Discount_Factor_Hidden__c,
           java.lang.Double capMan__Calculated_Discount_Factor__c,
           java.lang.Double capMan__Calculated_WACC__c,
           java.lang.Double capMan__Common_Per_Share__c,
           java.lang.Double capMan__DLOM__c,
           java.lang.Double capMan__Days_Until__c,
           java.lang.Double capMan__Discounted_Expected_Value__c,
           java.lang.Boolean capMan__Include_in_Stock_Chart__c,
           java.lang.String capMan__Independent_Valuation_by__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Independent_Valuation_by__r,
           java.lang.String capMan__Issuer__c,
           com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r,
           com.sforce.soap.enterprise.QueryResult capMan__LiquidationSeniority__r,
           com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Breakpoints__r,
           com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Include_Derivatives__r,
           com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Outstanding_Securities__r,
           com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Preference__r,
           java.lang.Double capMan__Liquidation_Value__c,
           java.lang.Double capMan__Multiple__c,
           java.lang.String capMan__Performance_Metric_Description__c,
           java.lang.Double capMan__Performance_Metric_Value__c,
           java.lang.Double capMan__Probability_Weighted_Common__c,
           java.lang.Double capMan__Probability_of_Outcome__c,
           java.lang.String capMan__Scenario_Name__c,
           java.lang.Double capMan__Standard_Deviation_Days__c,
           java.lang.Double capMan__Standard_Deviation__c,
           java.util.Date capMan__Timing_Of_Event__c,
           java.lang.String capMan__Valuation_Basis_Value__c,
           java.lang.String capMan__Valuation_Basis__c,
           java.lang.String capMan__Valuation_Type_Value__c,
           java.lang.String capMan__Valuation_Type__c,
           java.lang.Double capMan__Weighting__c,
           java.lang.String capMan__Year__c,
           java.lang.Double capMan__Years_Until__c,
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
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.capMan__Adjusted_Value_Per_Common__c = capMan__Adjusted_Value_Per_Common__c;
        this.capMan__Adjusted_Value_Total__c = capMan__Adjusted_Value_Total__c;
        this.capMan__Analysis_Date__c = capMan__Analysis_Date__c;
        this.capMan__Analyst__c = capMan__Analyst__c;
        this.capMan__Calculated_Discount_Factor_Hidden__c = capMan__Calculated_Discount_Factor_Hidden__c;
        this.capMan__Calculated_Discount_Factor__c = capMan__Calculated_Discount_Factor__c;
        this.capMan__Calculated_WACC__c = capMan__Calculated_WACC__c;
        this.capMan__Common_Per_Share__c = capMan__Common_Per_Share__c;
        this.capMan__DLOM__c = capMan__DLOM__c;
        this.capMan__Days_Until__c = capMan__Days_Until__c;
        this.capMan__Discounted_Expected_Value__c = capMan__Discounted_Expected_Value__c;
        this.capMan__Include_in_Stock_Chart__c = capMan__Include_in_Stock_Chart__c;
        this.capMan__Independent_Valuation_by__c = capMan__Independent_Valuation_by__c;
        this.capMan__Independent_Valuation_by__r = capMan__Independent_Valuation_by__r;
        this.capMan__Issuer__c = capMan__Issuer__c;
        this.capMan__Issuer__r = capMan__Issuer__r;
        this.capMan__LiquidationSeniority__r = capMan__LiquidationSeniority__r;
        this.capMan__Liquidation_Breakpoints__r = capMan__Liquidation_Breakpoints__r;
        this.capMan__Liquidation_Include_Derivatives__r = capMan__Liquidation_Include_Derivatives__r;
        this.capMan__Liquidation_Outstanding_Securities__r = capMan__Liquidation_Outstanding_Securities__r;
        this.capMan__Liquidation_Preference__r = capMan__Liquidation_Preference__r;
        this.capMan__Liquidation_Value__c = capMan__Liquidation_Value__c;
        this.capMan__Multiple__c = capMan__Multiple__c;
        this.capMan__Performance_Metric_Description__c = capMan__Performance_Metric_Description__c;
        this.capMan__Performance_Metric_Value__c = capMan__Performance_Metric_Value__c;
        this.capMan__Probability_Weighted_Common__c = capMan__Probability_Weighted_Common__c;
        this.capMan__Probability_of_Outcome__c = capMan__Probability_of_Outcome__c;
        this.capMan__Scenario_Name__c = capMan__Scenario_Name__c;
        this.capMan__Standard_Deviation_Days__c = capMan__Standard_Deviation_Days__c;
        this.capMan__Standard_Deviation__c = capMan__Standard_Deviation__c;
        this.capMan__Timing_Of_Event__c = capMan__Timing_Of_Event__c;
        this.capMan__Valuation_Basis_Value__c = capMan__Valuation_Basis_Value__c;
        this.capMan__Valuation_Basis__c = capMan__Valuation_Basis__c;
        this.capMan__Valuation_Type_Value__c = capMan__Valuation_Type_Value__c;
        this.capMan__Valuation_Type__c = capMan__Valuation_Type__c;
        this.capMan__Weighting__c = capMan__Weighting__c;
        this.capMan__Year__c = capMan__Year__c;
        this.capMan__Years_Until__c = capMan__Years_Until__c;
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
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Adjusted_Value_Per_Common__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Adjusted_Value_Per_Common__c
     */
    public java.lang.Double getCapMan__Adjusted_Value_Per_Common__c() {
        return capMan__Adjusted_Value_Per_Common__c;
    }


    /**
     * Sets the capMan__Adjusted_Value_Per_Common__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Adjusted_Value_Per_Common__c
     */
    public void setCapMan__Adjusted_Value_Per_Common__c(java.lang.Double capMan__Adjusted_Value_Per_Common__c) {
        this.capMan__Adjusted_Value_Per_Common__c = capMan__Adjusted_Value_Per_Common__c;
    }


    /**
     * Gets the capMan__Adjusted_Value_Total__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Adjusted_Value_Total__c
     */
    public java.lang.Double getCapMan__Adjusted_Value_Total__c() {
        return capMan__Adjusted_Value_Total__c;
    }


    /**
     * Sets the capMan__Adjusted_Value_Total__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Adjusted_Value_Total__c
     */
    public void setCapMan__Adjusted_Value_Total__c(java.lang.Double capMan__Adjusted_Value_Total__c) {
        this.capMan__Adjusted_Value_Total__c = capMan__Adjusted_Value_Total__c;
    }


    /**
     * Gets the capMan__Analysis_Date__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Analysis_Date__c
     */
    public java.util.Date getCapMan__Analysis_Date__c() {
        return capMan__Analysis_Date__c;
    }


    /**
     * Sets the capMan__Analysis_Date__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Analysis_Date__c
     */
    public void setCapMan__Analysis_Date__c(java.util.Date capMan__Analysis_Date__c) {
        this.capMan__Analysis_Date__c = capMan__Analysis_Date__c;
    }


    /**
     * Gets the capMan__Analyst__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Analyst__c
     */
    public java.lang.String getCapMan__Analyst__c() {
        return capMan__Analyst__c;
    }


    /**
     * Sets the capMan__Analyst__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Analyst__c
     */
    public void setCapMan__Analyst__c(java.lang.String capMan__Analyst__c) {
        this.capMan__Analyst__c = capMan__Analyst__c;
    }


    /**
     * Gets the capMan__Calculated_Discount_Factor_Hidden__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Calculated_Discount_Factor_Hidden__c
     */
    public java.lang.Double getCapMan__Calculated_Discount_Factor_Hidden__c() {
        return capMan__Calculated_Discount_Factor_Hidden__c;
    }


    /**
     * Sets the capMan__Calculated_Discount_Factor_Hidden__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Calculated_Discount_Factor_Hidden__c
     */
    public void setCapMan__Calculated_Discount_Factor_Hidden__c(java.lang.Double capMan__Calculated_Discount_Factor_Hidden__c) {
        this.capMan__Calculated_Discount_Factor_Hidden__c = capMan__Calculated_Discount_Factor_Hidden__c;
    }


    /**
     * Gets the capMan__Calculated_Discount_Factor__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Calculated_Discount_Factor__c
     */
    public java.lang.Double getCapMan__Calculated_Discount_Factor__c() {
        return capMan__Calculated_Discount_Factor__c;
    }


    /**
     * Sets the capMan__Calculated_Discount_Factor__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Calculated_Discount_Factor__c
     */
    public void setCapMan__Calculated_Discount_Factor__c(java.lang.Double capMan__Calculated_Discount_Factor__c) {
        this.capMan__Calculated_Discount_Factor__c = capMan__Calculated_Discount_Factor__c;
    }


    /**
     * Gets the capMan__Calculated_WACC__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Calculated_WACC__c
     */
    public java.lang.Double getCapMan__Calculated_WACC__c() {
        return capMan__Calculated_WACC__c;
    }


    /**
     * Sets the capMan__Calculated_WACC__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Calculated_WACC__c
     */
    public void setCapMan__Calculated_WACC__c(java.lang.Double capMan__Calculated_WACC__c) {
        this.capMan__Calculated_WACC__c = capMan__Calculated_WACC__c;
    }


    /**
     * Gets the capMan__Common_Per_Share__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Common_Per_Share__c
     */
    public java.lang.Double getCapMan__Common_Per_Share__c() {
        return capMan__Common_Per_Share__c;
    }


    /**
     * Sets the capMan__Common_Per_Share__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Common_Per_Share__c
     */
    public void setCapMan__Common_Per_Share__c(java.lang.Double capMan__Common_Per_Share__c) {
        this.capMan__Common_Per_Share__c = capMan__Common_Per_Share__c;
    }


    /**
     * Gets the capMan__DLOM__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__DLOM__c
     */
    public java.lang.Double getCapMan__DLOM__c() {
        return capMan__DLOM__c;
    }


    /**
     * Sets the capMan__DLOM__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__DLOM__c
     */
    public void setCapMan__DLOM__c(java.lang.Double capMan__DLOM__c) {
        this.capMan__DLOM__c = capMan__DLOM__c;
    }


    /**
     * Gets the capMan__Days_Until__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Days_Until__c
     */
    public java.lang.Double getCapMan__Days_Until__c() {
        return capMan__Days_Until__c;
    }


    /**
     * Sets the capMan__Days_Until__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Days_Until__c
     */
    public void setCapMan__Days_Until__c(java.lang.Double capMan__Days_Until__c) {
        this.capMan__Days_Until__c = capMan__Days_Until__c;
    }


    /**
     * Gets the capMan__Discounted_Expected_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Discounted_Expected_Value__c
     */
    public java.lang.Double getCapMan__Discounted_Expected_Value__c() {
        return capMan__Discounted_Expected_Value__c;
    }


    /**
     * Sets the capMan__Discounted_Expected_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Discounted_Expected_Value__c
     */
    public void setCapMan__Discounted_Expected_Value__c(java.lang.Double capMan__Discounted_Expected_Value__c) {
        this.capMan__Discounted_Expected_Value__c = capMan__Discounted_Expected_Value__c;
    }


    /**
     * Gets the capMan__Include_in_Stock_Chart__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Include_in_Stock_Chart__c
     */
    public java.lang.Boolean getCapMan__Include_in_Stock_Chart__c() {
        return capMan__Include_in_Stock_Chart__c;
    }


    /**
     * Sets the capMan__Include_in_Stock_Chart__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Include_in_Stock_Chart__c
     */
    public void setCapMan__Include_in_Stock_Chart__c(java.lang.Boolean capMan__Include_in_Stock_Chart__c) {
        this.capMan__Include_in_Stock_Chart__c = capMan__Include_in_Stock_Chart__c;
    }


    /**
     * Gets the capMan__Independent_Valuation_by__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Independent_Valuation_by__c
     */
    public java.lang.String getCapMan__Independent_Valuation_by__c() {
        return capMan__Independent_Valuation_by__c;
    }


    /**
     * Sets the capMan__Independent_Valuation_by__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Independent_Valuation_by__c
     */
    public void setCapMan__Independent_Valuation_by__c(java.lang.String capMan__Independent_Valuation_by__c) {
        this.capMan__Independent_Valuation_by__c = capMan__Independent_Valuation_by__c;
    }


    /**
     * Gets the capMan__Independent_Valuation_by__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Independent_Valuation_by__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Independent_Valuation_by__r() {
        return capMan__Independent_Valuation_by__r;
    }


    /**
     * Sets the capMan__Independent_Valuation_by__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Independent_Valuation_by__r
     */
    public void setCapMan__Independent_Valuation_by__r(com.sforce.soap.enterprise.sobject.Contact capMan__Independent_Valuation_by__r) {
        this.capMan__Independent_Valuation_by__r = capMan__Independent_Valuation_by__r;
    }


    /**
     * Gets the capMan__Issuer__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Issuer__c
     */
    public java.lang.String getCapMan__Issuer__c() {
        return capMan__Issuer__c;
    }


    /**
     * Sets the capMan__Issuer__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Issuer__c
     */
    public void setCapMan__Issuer__c(java.lang.String capMan__Issuer__c) {
        this.capMan__Issuer__c = capMan__Issuer__c;
    }


    /**
     * Gets the capMan__Issuer__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Issuer__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c getCapMan__Issuer__r() {
        return capMan__Issuer__r;
    }


    /**
     * Sets the capMan__Issuer__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Issuer__r
     */
    public void setCapMan__Issuer__r(com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r) {
        this.capMan__Issuer__r = capMan__Issuer__r;
    }


    /**
     * Gets the capMan__LiquidationSeniority__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__LiquidationSeniority__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__LiquidationSeniority__r() {
        return capMan__LiquidationSeniority__r;
    }


    /**
     * Sets the capMan__LiquidationSeniority__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__LiquidationSeniority__r
     */
    public void setCapMan__LiquidationSeniority__r(com.sforce.soap.enterprise.QueryResult capMan__LiquidationSeniority__r) {
        this.capMan__LiquidationSeniority__r = capMan__LiquidationSeniority__r;
    }


    /**
     * Gets the capMan__Liquidation_Breakpoints__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Liquidation_Breakpoints__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Liquidation_Breakpoints__r() {
        return capMan__Liquidation_Breakpoints__r;
    }


    /**
     * Sets the capMan__Liquidation_Breakpoints__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Liquidation_Breakpoints__r
     */
    public void setCapMan__Liquidation_Breakpoints__r(com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Breakpoints__r) {
        this.capMan__Liquidation_Breakpoints__r = capMan__Liquidation_Breakpoints__r;
    }


    /**
     * Gets the capMan__Liquidation_Include_Derivatives__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Liquidation_Include_Derivatives__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Liquidation_Include_Derivatives__r() {
        return capMan__Liquidation_Include_Derivatives__r;
    }


    /**
     * Sets the capMan__Liquidation_Include_Derivatives__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Liquidation_Include_Derivatives__r
     */
    public void setCapMan__Liquidation_Include_Derivatives__r(com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Include_Derivatives__r) {
        this.capMan__Liquidation_Include_Derivatives__r = capMan__Liquidation_Include_Derivatives__r;
    }


    /**
     * Gets the capMan__Liquidation_Outstanding_Securities__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Liquidation_Outstanding_Securities__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Liquidation_Outstanding_Securities__r() {
        return capMan__Liquidation_Outstanding_Securities__r;
    }


    /**
     * Sets the capMan__Liquidation_Outstanding_Securities__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Liquidation_Outstanding_Securities__r
     */
    public void setCapMan__Liquidation_Outstanding_Securities__r(com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Outstanding_Securities__r) {
        this.capMan__Liquidation_Outstanding_Securities__r = capMan__Liquidation_Outstanding_Securities__r;
    }


    /**
     * Gets the capMan__Liquidation_Preference__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Liquidation_Preference__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Liquidation_Preference__r() {
        return capMan__Liquidation_Preference__r;
    }


    /**
     * Sets the capMan__Liquidation_Preference__r value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Liquidation_Preference__r
     */
    public void setCapMan__Liquidation_Preference__r(com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Preference__r) {
        this.capMan__Liquidation_Preference__r = capMan__Liquidation_Preference__r;
    }


    /**
     * Gets the capMan__Liquidation_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Liquidation_Value__c
     */
    public java.lang.Double getCapMan__Liquidation_Value__c() {
        return capMan__Liquidation_Value__c;
    }


    /**
     * Sets the capMan__Liquidation_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Liquidation_Value__c
     */
    public void setCapMan__Liquidation_Value__c(java.lang.Double capMan__Liquidation_Value__c) {
        this.capMan__Liquidation_Value__c = capMan__Liquidation_Value__c;
    }


    /**
     * Gets the capMan__Multiple__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Multiple__c
     */
    public java.lang.Double getCapMan__Multiple__c() {
        return capMan__Multiple__c;
    }


    /**
     * Sets the capMan__Multiple__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Multiple__c
     */
    public void setCapMan__Multiple__c(java.lang.Double capMan__Multiple__c) {
        this.capMan__Multiple__c = capMan__Multiple__c;
    }


    /**
     * Gets the capMan__Performance_Metric_Description__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Performance_Metric_Description__c
     */
    public java.lang.String getCapMan__Performance_Metric_Description__c() {
        return capMan__Performance_Metric_Description__c;
    }


    /**
     * Sets the capMan__Performance_Metric_Description__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Performance_Metric_Description__c
     */
    public void setCapMan__Performance_Metric_Description__c(java.lang.String capMan__Performance_Metric_Description__c) {
        this.capMan__Performance_Metric_Description__c = capMan__Performance_Metric_Description__c;
    }


    /**
     * Gets the capMan__Performance_Metric_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Performance_Metric_Value__c
     */
    public java.lang.Double getCapMan__Performance_Metric_Value__c() {
        return capMan__Performance_Metric_Value__c;
    }


    /**
     * Sets the capMan__Performance_Metric_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Performance_Metric_Value__c
     */
    public void setCapMan__Performance_Metric_Value__c(java.lang.Double capMan__Performance_Metric_Value__c) {
        this.capMan__Performance_Metric_Value__c = capMan__Performance_Metric_Value__c;
    }


    /**
     * Gets the capMan__Probability_Weighted_Common__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Probability_Weighted_Common__c
     */
    public java.lang.Double getCapMan__Probability_Weighted_Common__c() {
        return capMan__Probability_Weighted_Common__c;
    }


    /**
     * Sets the capMan__Probability_Weighted_Common__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Probability_Weighted_Common__c
     */
    public void setCapMan__Probability_Weighted_Common__c(java.lang.Double capMan__Probability_Weighted_Common__c) {
        this.capMan__Probability_Weighted_Common__c = capMan__Probability_Weighted_Common__c;
    }


    /**
     * Gets the capMan__Probability_of_Outcome__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Probability_of_Outcome__c
     */
    public java.lang.Double getCapMan__Probability_of_Outcome__c() {
        return capMan__Probability_of_Outcome__c;
    }


    /**
     * Sets the capMan__Probability_of_Outcome__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Probability_of_Outcome__c
     */
    public void setCapMan__Probability_of_Outcome__c(java.lang.Double capMan__Probability_of_Outcome__c) {
        this.capMan__Probability_of_Outcome__c = capMan__Probability_of_Outcome__c;
    }


    /**
     * Gets the capMan__Scenario_Name__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Scenario_Name__c
     */
    public java.lang.String getCapMan__Scenario_Name__c() {
        return capMan__Scenario_Name__c;
    }


    /**
     * Sets the capMan__Scenario_Name__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Scenario_Name__c
     */
    public void setCapMan__Scenario_Name__c(java.lang.String capMan__Scenario_Name__c) {
        this.capMan__Scenario_Name__c = capMan__Scenario_Name__c;
    }


    /**
     * Gets the capMan__Standard_Deviation_Days__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Standard_Deviation_Days__c
     */
    public java.lang.Double getCapMan__Standard_Deviation_Days__c() {
        return capMan__Standard_Deviation_Days__c;
    }


    /**
     * Sets the capMan__Standard_Deviation_Days__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Standard_Deviation_Days__c
     */
    public void setCapMan__Standard_Deviation_Days__c(java.lang.Double capMan__Standard_Deviation_Days__c) {
        this.capMan__Standard_Deviation_Days__c = capMan__Standard_Deviation_Days__c;
    }


    /**
     * Gets the capMan__Standard_Deviation__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Standard_Deviation__c
     */
    public java.lang.Double getCapMan__Standard_Deviation__c() {
        return capMan__Standard_Deviation__c;
    }


    /**
     * Sets the capMan__Standard_Deviation__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Standard_Deviation__c
     */
    public void setCapMan__Standard_Deviation__c(java.lang.Double capMan__Standard_Deviation__c) {
        this.capMan__Standard_Deviation__c = capMan__Standard_Deviation__c;
    }


    /**
     * Gets the capMan__Timing_Of_Event__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Timing_Of_Event__c
     */
    public java.util.Date getCapMan__Timing_Of_Event__c() {
        return capMan__Timing_Of_Event__c;
    }


    /**
     * Sets the capMan__Timing_Of_Event__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Timing_Of_Event__c
     */
    public void setCapMan__Timing_Of_Event__c(java.util.Date capMan__Timing_Of_Event__c) {
        this.capMan__Timing_Of_Event__c = capMan__Timing_Of_Event__c;
    }


    /**
     * Gets the capMan__Valuation_Basis_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Valuation_Basis_Value__c
     */
    public java.lang.String getCapMan__Valuation_Basis_Value__c() {
        return capMan__Valuation_Basis_Value__c;
    }


    /**
     * Sets the capMan__Valuation_Basis_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Valuation_Basis_Value__c
     */
    public void setCapMan__Valuation_Basis_Value__c(java.lang.String capMan__Valuation_Basis_Value__c) {
        this.capMan__Valuation_Basis_Value__c = capMan__Valuation_Basis_Value__c;
    }


    /**
     * Gets the capMan__Valuation_Basis__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Valuation_Basis__c
     */
    public java.lang.String getCapMan__Valuation_Basis__c() {
        return capMan__Valuation_Basis__c;
    }


    /**
     * Sets the capMan__Valuation_Basis__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Valuation_Basis__c
     */
    public void setCapMan__Valuation_Basis__c(java.lang.String capMan__Valuation_Basis__c) {
        this.capMan__Valuation_Basis__c = capMan__Valuation_Basis__c;
    }


    /**
     * Gets the capMan__Valuation_Type_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Valuation_Type_Value__c
     */
    public java.lang.String getCapMan__Valuation_Type_Value__c() {
        return capMan__Valuation_Type_Value__c;
    }


    /**
     * Sets the capMan__Valuation_Type_Value__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Valuation_Type_Value__c
     */
    public void setCapMan__Valuation_Type_Value__c(java.lang.String capMan__Valuation_Type_Value__c) {
        this.capMan__Valuation_Type_Value__c = capMan__Valuation_Type_Value__c;
    }


    /**
     * Gets the capMan__Valuation_Type__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Valuation_Type__c
     */
    public java.lang.String getCapMan__Valuation_Type__c() {
        return capMan__Valuation_Type__c;
    }


    /**
     * Sets the capMan__Valuation_Type__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Valuation_Type__c
     */
    public void setCapMan__Valuation_Type__c(java.lang.String capMan__Valuation_Type__c) {
        this.capMan__Valuation_Type__c = capMan__Valuation_Type__c;
    }


    /**
     * Gets the capMan__Weighting__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Weighting__c
     */
    public java.lang.Double getCapMan__Weighting__c() {
        return capMan__Weighting__c;
    }


    /**
     * Sets the capMan__Weighting__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Weighting__c
     */
    public void setCapMan__Weighting__c(java.lang.Double capMan__Weighting__c) {
        this.capMan__Weighting__c = capMan__Weighting__c;
    }


    /**
     * Gets the capMan__Year__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Year__c
     */
    public java.lang.String getCapMan__Year__c() {
        return capMan__Year__c;
    }


    /**
     * Sets the capMan__Year__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Year__c
     */
    public void setCapMan__Year__c(java.lang.String capMan__Year__c) {
        this.capMan__Year__c = capMan__Year__c;
    }


    /**
     * Gets the capMan__Years_Until__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return capMan__Years_Until__c
     */
    public java.lang.Double getCapMan__Years_Until__c() {
        return capMan__Years_Until__c;
    }


    /**
     * Sets the capMan__Years_Until__c value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param capMan__Years_Until__c
     */
    public void setCapMan__Years_Until__c(java.lang.Double capMan__Years_Until__c) {
        this.capMan__Years_Until__c = capMan__Years_Until__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__Liquidation_Analytics__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__Liquidation_Analytics__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Liquidation_Analytics__c)) return false;
        CapMan__Liquidation_Analytics__c other = (CapMan__Liquidation_Analytics__c) obj;
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
            ((this.capMan__Adjusted_Value_Per_Common__c==null && other.getCapMan__Adjusted_Value_Per_Common__c()==null) || 
             (this.capMan__Adjusted_Value_Per_Common__c!=null &&
              this.capMan__Adjusted_Value_Per_Common__c.equals(other.getCapMan__Adjusted_Value_Per_Common__c()))) &&
            ((this.capMan__Adjusted_Value_Total__c==null && other.getCapMan__Adjusted_Value_Total__c()==null) || 
             (this.capMan__Adjusted_Value_Total__c!=null &&
              this.capMan__Adjusted_Value_Total__c.equals(other.getCapMan__Adjusted_Value_Total__c()))) &&
            ((this.capMan__Analysis_Date__c==null && other.getCapMan__Analysis_Date__c()==null) || 
             (this.capMan__Analysis_Date__c!=null &&
              this.capMan__Analysis_Date__c.equals(other.getCapMan__Analysis_Date__c()))) &&
            ((this.capMan__Analyst__c==null && other.getCapMan__Analyst__c()==null) || 
             (this.capMan__Analyst__c!=null &&
              this.capMan__Analyst__c.equals(other.getCapMan__Analyst__c()))) &&
            ((this.capMan__Calculated_Discount_Factor_Hidden__c==null && other.getCapMan__Calculated_Discount_Factor_Hidden__c()==null) || 
             (this.capMan__Calculated_Discount_Factor_Hidden__c!=null &&
              this.capMan__Calculated_Discount_Factor_Hidden__c.equals(other.getCapMan__Calculated_Discount_Factor_Hidden__c()))) &&
            ((this.capMan__Calculated_Discount_Factor__c==null && other.getCapMan__Calculated_Discount_Factor__c()==null) || 
             (this.capMan__Calculated_Discount_Factor__c!=null &&
              this.capMan__Calculated_Discount_Factor__c.equals(other.getCapMan__Calculated_Discount_Factor__c()))) &&
            ((this.capMan__Calculated_WACC__c==null && other.getCapMan__Calculated_WACC__c()==null) || 
             (this.capMan__Calculated_WACC__c!=null &&
              this.capMan__Calculated_WACC__c.equals(other.getCapMan__Calculated_WACC__c()))) &&
            ((this.capMan__Common_Per_Share__c==null && other.getCapMan__Common_Per_Share__c()==null) || 
             (this.capMan__Common_Per_Share__c!=null &&
              this.capMan__Common_Per_Share__c.equals(other.getCapMan__Common_Per_Share__c()))) &&
            ((this.capMan__DLOM__c==null && other.getCapMan__DLOM__c()==null) || 
             (this.capMan__DLOM__c!=null &&
              this.capMan__DLOM__c.equals(other.getCapMan__DLOM__c()))) &&
            ((this.capMan__Days_Until__c==null && other.getCapMan__Days_Until__c()==null) || 
             (this.capMan__Days_Until__c!=null &&
              this.capMan__Days_Until__c.equals(other.getCapMan__Days_Until__c()))) &&
            ((this.capMan__Discounted_Expected_Value__c==null && other.getCapMan__Discounted_Expected_Value__c()==null) || 
             (this.capMan__Discounted_Expected_Value__c!=null &&
              this.capMan__Discounted_Expected_Value__c.equals(other.getCapMan__Discounted_Expected_Value__c()))) &&
            ((this.capMan__Include_in_Stock_Chart__c==null && other.getCapMan__Include_in_Stock_Chart__c()==null) || 
             (this.capMan__Include_in_Stock_Chart__c!=null &&
              this.capMan__Include_in_Stock_Chart__c.equals(other.getCapMan__Include_in_Stock_Chart__c()))) &&
            ((this.capMan__Independent_Valuation_by__c==null && other.getCapMan__Independent_Valuation_by__c()==null) || 
             (this.capMan__Independent_Valuation_by__c!=null &&
              this.capMan__Independent_Valuation_by__c.equals(other.getCapMan__Independent_Valuation_by__c()))) &&
            ((this.capMan__Independent_Valuation_by__r==null && other.getCapMan__Independent_Valuation_by__r()==null) || 
             (this.capMan__Independent_Valuation_by__r!=null &&
              this.capMan__Independent_Valuation_by__r.equals(other.getCapMan__Independent_Valuation_by__r()))) &&
            ((this.capMan__Issuer__c==null && other.getCapMan__Issuer__c()==null) || 
             (this.capMan__Issuer__c!=null &&
              this.capMan__Issuer__c.equals(other.getCapMan__Issuer__c()))) &&
            ((this.capMan__Issuer__r==null && other.getCapMan__Issuer__r()==null) || 
             (this.capMan__Issuer__r!=null &&
              this.capMan__Issuer__r.equals(other.getCapMan__Issuer__r()))) &&
            ((this.capMan__LiquidationSeniority__r==null && other.getCapMan__LiquidationSeniority__r()==null) || 
             (this.capMan__LiquidationSeniority__r!=null &&
              this.capMan__LiquidationSeniority__r.equals(other.getCapMan__LiquidationSeniority__r()))) &&
            ((this.capMan__Liquidation_Breakpoints__r==null && other.getCapMan__Liquidation_Breakpoints__r()==null) || 
             (this.capMan__Liquidation_Breakpoints__r!=null &&
              this.capMan__Liquidation_Breakpoints__r.equals(other.getCapMan__Liquidation_Breakpoints__r()))) &&
            ((this.capMan__Liquidation_Include_Derivatives__r==null && other.getCapMan__Liquidation_Include_Derivatives__r()==null) || 
             (this.capMan__Liquidation_Include_Derivatives__r!=null &&
              this.capMan__Liquidation_Include_Derivatives__r.equals(other.getCapMan__Liquidation_Include_Derivatives__r()))) &&
            ((this.capMan__Liquidation_Outstanding_Securities__r==null && other.getCapMan__Liquidation_Outstanding_Securities__r()==null) || 
             (this.capMan__Liquidation_Outstanding_Securities__r!=null &&
              this.capMan__Liquidation_Outstanding_Securities__r.equals(other.getCapMan__Liquidation_Outstanding_Securities__r()))) &&
            ((this.capMan__Liquidation_Preference__r==null && other.getCapMan__Liquidation_Preference__r()==null) || 
             (this.capMan__Liquidation_Preference__r!=null &&
              this.capMan__Liquidation_Preference__r.equals(other.getCapMan__Liquidation_Preference__r()))) &&
            ((this.capMan__Liquidation_Value__c==null && other.getCapMan__Liquidation_Value__c()==null) || 
             (this.capMan__Liquidation_Value__c!=null &&
              this.capMan__Liquidation_Value__c.equals(other.getCapMan__Liquidation_Value__c()))) &&
            ((this.capMan__Multiple__c==null && other.getCapMan__Multiple__c()==null) || 
             (this.capMan__Multiple__c!=null &&
              this.capMan__Multiple__c.equals(other.getCapMan__Multiple__c()))) &&
            ((this.capMan__Performance_Metric_Description__c==null && other.getCapMan__Performance_Metric_Description__c()==null) || 
             (this.capMan__Performance_Metric_Description__c!=null &&
              this.capMan__Performance_Metric_Description__c.equals(other.getCapMan__Performance_Metric_Description__c()))) &&
            ((this.capMan__Performance_Metric_Value__c==null && other.getCapMan__Performance_Metric_Value__c()==null) || 
             (this.capMan__Performance_Metric_Value__c!=null &&
              this.capMan__Performance_Metric_Value__c.equals(other.getCapMan__Performance_Metric_Value__c()))) &&
            ((this.capMan__Probability_Weighted_Common__c==null && other.getCapMan__Probability_Weighted_Common__c()==null) || 
             (this.capMan__Probability_Weighted_Common__c!=null &&
              this.capMan__Probability_Weighted_Common__c.equals(other.getCapMan__Probability_Weighted_Common__c()))) &&
            ((this.capMan__Probability_of_Outcome__c==null && other.getCapMan__Probability_of_Outcome__c()==null) || 
             (this.capMan__Probability_of_Outcome__c!=null &&
              this.capMan__Probability_of_Outcome__c.equals(other.getCapMan__Probability_of_Outcome__c()))) &&
            ((this.capMan__Scenario_Name__c==null && other.getCapMan__Scenario_Name__c()==null) || 
             (this.capMan__Scenario_Name__c!=null &&
              this.capMan__Scenario_Name__c.equals(other.getCapMan__Scenario_Name__c()))) &&
            ((this.capMan__Standard_Deviation_Days__c==null && other.getCapMan__Standard_Deviation_Days__c()==null) || 
             (this.capMan__Standard_Deviation_Days__c!=null &&
              this.capMan__Standard_Deviation_Days__c.equals(other.getCapMan__Standard_Deviation_Days__c()))) &&
            ((this.capMan__Standard_Deviation__c==null && other.getCapMan__Standard_Deviation__c()==null) || 
             (this.capMan__Standard_Deviation__c!=null &&
              this.capMan__Standard_Deviation__c.equals(other.getCapMan__Standard_Deviation__c()))) &&
            ((this.capMan__Timing_Of_Event__c==null && other.getCapMan__Timing_Of_Event__c()==null) || 
             (this.capMan__Timing_Of_Event__c!=null &&
              this.capMan__Timing_Of_Event__c.equals(other.getCapMan__Timing_Of_Event__c()))) &&
            ((this.capMan__Valuation_Basis_Value__c==null && other.getCapMan__Valuation_Basis_Value__c()==null) || 
             (this.capMan__Valuation_Basis_Value__c!=null &&
              this.capMan__Valuation_Basis_Value__c.equals(other.getCapMan__Valuation_Basis_Value__c()))) &&
            ((this.capMan__Valuation_Basis__c==null && other.getCapMan__Valuation_Basis__c()==null) || 
             (this.capMan__Valuation_Basis__c!=null &&
              this.capMan__Valuation_Basis__c.equals(other.getCapMan__Valuation_Basis__c()))) &&
            ((this.capMan__Valuation_Type_Value__c==null && other.getCapMan__Valuation_Type_Value__c()==null) || 
             (this.capMan__Valuation_Type_Value__c!=null &&
              this.capMan__Valuation_Type_Value__c.equals(other.getCapMan__Valuation_Type_Value__c()))) &&
            ((this.capMan__Valuation_Type__c==null && other.getCapMan__Valuation_Type__c()==null) || 
             (this.capMan__Valuation_Type__c!=null &&
              this.capMan__Valuation_Type__c.equals(other.getCapMan__Valuation_Type__c()))) &&
            ((this.capMan__Weighting__c==null && other.getCapMan__Weighting__c()==null) || 
             (this.capMan__Weighting__c!=null &&
              this.capMan__Weighting__c.equals(other.getCapMan__Weighting__c()))) &&
            ((this.capMan__Year__c==null && other.getCapMan__Year__c()==null) || 
             (this.capMan__Year__c!=null &&
              this.capMan__Year__c.equals(other.getCapMan__Year__c()))) &&
            ((this.capMan__Years_Until__c==null && other.getCapMan__Years_Until__c()==null) || 
             (this.capMan__Years_Until__c!=null &&
              this.capMan__Years_Until__c.equals(other.getCapMan__Years_Until__c()))) &&
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
        if (getCapMan__Adjusted_Value_Per_Common__c() != null) {
            _hashCode += getCapMan__Adjusted_Value_Per_Common__c().hashCode();
        }
        if (getCapMan__Adjusted_Value_Total__c() != null) {
            _hashCode += getCapMan__Adjusted_Value_Total__c().hashCode();
        }
        if (getCapMan__Analysis_Date__c() != null) {
            _hashCode += getCapMan__Analysis_Date__c().hashCode();
        }
        if (getCapMan__Analyst__c() != null) {
            _hashCode += getCapMan__Analyst__c().hashCode();
        }
        if (getCapMan__Calculated_Discount_Factor_Hidden__c() != null) {
            _hashCode += getCapMan__Calculated_Discount_Factor_Hidden__c().hashCode();
        }
        if (getCapMan__Calculated_Discount_Factor__c() != null) {
            _hashCode += getCapMan__Calculated_Discount_Factor__c().hashCode();
        }
        if (getCapMan__Calculated_WACC__c() != null) {
            _hashCode += getCapMan__Calculated_WACC__c().hashCode();
        }
        if (getCapMan__Common_Per_Share__c() != null) {
            _hashCode += getCapMan__Common_Per_Share__c().hashCode();
        }
        if (getCapMan__DLOM__c() != null) {
            _hashCode += getCapMan__DLOM__c().hashCode();
        }
        if (getCapMan__Days_Until__c() != null) {
            _hashCode += getCapMan__Days_Until__c().hashCode();
        }
        if (getCapMan__Discounted_Expected_Value__c() != null) {
            _hashCode += getCapMan__Discounted_Expected_Value__c().hashCode();
        }
        if (getCapMan__Include_in_Stock_Chart__c() != null) {
            _hashCode += getCapMan__Include_in_Stock_Chart__c().hashCode();
        }
        if (getCapMan__Independent_Valuation_by__c() != null) {
            _hashCode += getCapMan__Independent_Valuation_by__c().hashCode();
        }
        if (getCapMan__Independent_Valuation_by__r() != null) {
            _hashCode += getCapMan__Independent_Valuation_by__r().hashCode();
        }
        if (getCapMan__Issuer__c() != null) {
            _hashCode += getCapMan__Issuer__c().hashCode();
        }
        if (getCapMan__Issuer__r() != null) {
            _hashCode += getCapMan__Issuer__r().hashCode();
        }
        if (getCapMan__LiquidationSeniority__r() != null) {
            _hashCode += getCapMan__LiquidationSeniority__r().hashCode();
        }
        if (getCapMan__Liquidation_Breakpoints__r() != null) {
            _hashCode += getCapMan__Liquidation_Breakpoints__r().hashCode();
        }
        if (getCapMan__Liquidation_Include_Derivatives__r() != null) {
            _hashCode += getCapMan__Liquidation_Include_Derivatives__r().hashCode();
        }
        if (getCapMan__Liquidation_Outstanding_Securities__r() != null) {
            _hashCode += getCapMan__Liquidation_Outstanding_Securities__r().hashCode();
        }
        if (getCapMan__Liquidation_Preference__r() != null) {
            _hashCode += getCapMan__Liquidation_Preference__r().hashCode();
        }
        if (getCapMan__Liquidation_Value__c() != null) {
            _hashCode += getCapMan__Liquidation_Value__c().hashCode();
        }
        if (getCapMan__Multiple__c() != null) {
            _hashCode += getCapMan__Multiple__c().hashCode();
        }
        if (getCapMan__Performance_Metric_Description__c() != null) {
            _hashCode += getCapMan__Performance_Metric_Description__c().hashCode();
        }
        if (getCapMan__Performance_Metric_Value__c() != null) {
            _hashCode += getCapMan__Performance_Metric_Value__c().hashCode();
        }
        if (getCapMan__Probability_Weighted_Common__c() != null) {
            _hashCode += getCapMan__Probability_Weighted_Common__c().hashCode();
        }
        if (getCapMan__Probability_of_Outcome__c() != null) {
            _hashCode += getCapMan__Probability_of_Outcome__c().hashCode();
        }
        if (getCapMan__Scenario_Name__c() != null) {
            _hashCode += getCapMan__Scenario_Name__c().hashCode();
        }
        if (getCapMan__Standard_Deviation_Days__c() != null) {
            _hashCode += getCapMan__Standard_Deviation_Days__c().hashCode();
        }
        if (getCapMan__Standard_Deviation__c() != null) {
            _hashCode += getCapMan__Standard_Deviation__c().hashCode();
        }
        if (getCapMan__Timing_Of_Event__c() != null) {
            _hashCode += getCapMan__Timing_Of_Event__c().hashCode();
        }
        if (getCapMan__Valuation_Basis_Value__c() != null) {
            _hashCode += getCapMan__Valuation_Basis_Value__c().hashCode();
        }
        if (getCapMan__Valuation_Basis__c() != null) {
            _hashCode += getCapMan__Valuation_Basis__c().hashCode();
        }
        if (getCapMan__Valuation_Type_Value__c() != null) {
            _hashCode += getCapMan__Valuation_Type_Value__c().hashCode();
        }
        if (getCapMan__Valuation_Type__c() != null) {
            _hashCode += getCapMan__Valuation_Type__c().hashCode();
        }
        if (getCapMan__Weighting__c() != null) {
            _hashCode += getCapMan__Weighting__c().hashCode();
        }
        if (getCapMan__Year__c() != null) {
            _hashCode += getCapMan__Year__c().hashCode();
        }
        if (getCapMan__Years_Until__c() != null) {
            _hashCode += getCapMan__Years_Until__c().hashCode();
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
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMan__Liquidation_Analytics__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Analytics__c"));
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
        elemField.setFieldName("capMan__Adjusted_Value_Per_Common__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Adjusted_Value_Per_Common__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Adjusted_Value_Total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Adjusted_Value_Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Analysis_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Analysis_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Analyst__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Analyst__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Calculated_Discount_Factor_Hidden__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Calculated_Discount_Factor_Hidden__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Calculated_Discount_Factor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Calculated_Discount_Factor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Calculated_WACC__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Calculated_WACC__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Common_Per_Share__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Common_Per_Share__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DLOM__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DLOM__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Days_Until__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Days_Until__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Discounted_Expected_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Discounted_Expected_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Include_in_Stock_Chart__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Include_in_Stock_Chart__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Independent_Valuation_by__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Independent_Valuation_by__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Independent_Valuation_by__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Independent_Valuation_by__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("capMan__Issuer__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuer__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Capitalization__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LiquidationSeniority__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LiquidationSeniority__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidation_Breakpoints__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Breakpoints__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidation_Include_Derivatives__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Include_Derivatives__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidation_Outstanding_Securities__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Outstanding_Securities__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidation_Preference__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Preference__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidation_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Multiple__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Multiple__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Performance_Metric_Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Performance_Metric_Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Performance_Metric_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Performance_Metric_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Probability_Weighted_Common__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Probability_Weighted_Common__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Probability_of_Outcome__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Probability_of_Outcome__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Scenario_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Scenario_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Standard_Deviation_Days__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Standard_Deviation_Days__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Standard_Deviation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Standard_Deviation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Timing_Of_Event__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Timing_Of_Event__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Valuation_Basis_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Valuation_Basis_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Valuation_Basis__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Valuation_Basis__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Valuation_Type_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Valuation_Type_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Valuation_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Valuation_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Weighting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Weighting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Year__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Years_Until__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Years_Until__c"));
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
