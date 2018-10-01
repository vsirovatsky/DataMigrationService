/**
 * CapMan__Fund__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Fund__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__AccountName__c;

    private java.lang.String capMan__AccountNumber__c;

    private java.lang.String capMan__AccountType__c;

    private java.lang.Double capMan__Account_Value__c;

    private java.lang.Double capMan__AccruedManagementFee__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Attribution_Analytics_Tracks__r;

    private java.lang.Double capMan__CapitalCalls__c;

    private java.lang.Double capMan__CapitalContributions__c;

    private java.lang.Double capMan__Catchup__c;

    private java.lang.Double capMan__ClawbackAmount__c;

    private java.lang.String capMan__ClawbackFrequency__c;

    private java.lang.Double capMan__Clawback__c;

    private java.lang.Double capMan__ContingencyLoss__c;

    private java.lang.String capMan__Description__c;

    private java.lang.String capMan__Dividend_Frequency__c;

    private java.lang.Double capMan__Dividend_Payout_Order__c;

    private java.lang.Double capMan__FinalCarry__c;

    private java.lang.Double capMan__FirstCarryGPPct__c;

    private java.lang.Double capMan__First_Carry__c;

    private java.util.Date capMan__FiscalYearEnd__c;

    private java.util.Date capMan__FundCloseDate__c;

    private java.util.Date capMan__FundDisolutionDate__c;

    private java.lang.String capMan__FundName__c;

    private java.lang.Double capMan__FundSize__c;

    private java.lang.Double capMan__FundTerm__c;

    private java.lang.String capMan__FundType__c;

    private java.lang.Double capMan__GPPrincipalLiability__c;

    private java.lang.Double capMan__GP_Principal_Payout_Order__c;

    private java.lang.Boolean capMan__Has_First_Carry__c;

    private java.lang.Boolean capMan__Has_Second_Carry__c;

    private java.lang.String capMan__Industry__c;

    private java.lang.Double capMan__InitialCapitalCall__c;

    private java.lang.Boolean capMan__KeyManProvision__c;

    private java.lang.Double capMan__LPPrincipalLiability__c;

    private java.lang.Double capMan__LP_Principal_Payout_Order__c;

    private java.lang.Double capMan__Last_Distribution_GP_Pct__c;

    private java.lang.String capMan__LegalName__c;

    private java.lang.Double capMan__ManagementFee__c;

    private java.lang.String capMan__Management_Fee_Frequency__c;

    private java.lang.Double capMan__Management_Fee_Payout_Order__c;

    private java.lang.Double capMan__MaximumFundSize__c;

    private java.lang.Double capMan__PartnersContribution__c;

    private java.lang.Double capMan__PayoutDefined__c;

    private java.lang.Double capMan__PreferredDividendLiability__c;

    private java.lang.Double capMan__Preferred_Dividend__c;

    private java.lang.String capMan__Registered_Investor__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Registered_Investor__r;

    private java.util.Date capMan__Report_Date__c;

    private java.lang.String capMan__RollUpAccount__c;

    private java.lang.Double capMan__SecondCarryGPPct__c;

    private java.lang.Double capMan__Second_Carry__c;

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

    public CapMan__Fund__c() {
    }

    public CapMan__Fund__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__AccountName__c,
           java.lang.String capMan__AccountNumber__c,
           java.lang.String capMan__AccountType__c,
           java.lang.Double capMan__Account_Value__c,
           java.lang.Double capMan__AccruedManagementFee__c,
           com.sforce.soap.enterprise.QueryResult capMan__Attribution_Analytics_Tracks__r,
           java.lang.Double capMan__CapitalCalls__c,
           java.lang.Double capMan__CapitalContributions__c,
           java.lang.Double capMan__Catchup__c,
           java.lang.Double capMan__ClawbackAmount__c,
           java.lang.String capMan__ClawbackFrequency__c,
           java.lang.Double capMan__Clawback__c,
           java.lang.Double capMan__ContingencyLoss__c,
           java.lang.String capMan__Description__c,
           java.lang.String capMan__Dividend_Frequency__c,
           java.lang.Double capMan__Dividend_Payout_Order__c,
           java.lang.Double capMan__FinalCarry__c,
           java.lang.Double capMan__FirstCarryGPPct__c,
           java.lang.Double capMan__First_Carry__c,
           java.util.Date capMan__FiscalYearEnd__c,
           java.util.Date capMan__FundCloseDate__c,
           java.util.Date capMan__FundDisolutionDate__c,
           java.lang.String capMan__FundName__c,
           java.lang.Double capMan__FundSize__c,
           java.lang.Double capMan__FundTerm__c,
           java.lang.String capMan__FundType__c,
           java.lang.Double capMan__GPPrincipalLiability__c,
           java.lang.Double capMan__GP_Principal_Payout_Order__c,
           java.lang.Boolean capMan__Has_First_Carry__c,
           java.lang.Boolean capMan__Has_Second_Carry__c,
           java.lang.String capMan__Industry__c,
           java.lang.Double capMan__InitialCapitalCall__c,
           java.lang.Boolean capMan__KeyManProvision__c,
           java.lang.Double capMan__LPPrincipalLiability__c,
           java.lang.Double capMan__LP_Principal_Payout_Order__c,
           java.lang.Double capMan__Last_Distribution_GP_Pct__c,
           java.lang.String capMan__LegalName__c,
           java.lang.Double capMan__ManagementFee__c,
           java.lang.String capMan__Management_Fee_Frequency__c,
           java.lang.Double capMan__Management_Fee_Payout_Order__c,
           java.lang.Double capMan__MaximumFundSize__c,
           java.lang.Double capMan__PartnersContribution__c,
           java.lang.Double capMan__PayoutDefined__c,
           java.lang.Double capMan__PreferredDividendLiability__c,
           java.lang.Double capMan__Preferred_Dividend__c,
           java.lang.String capMan__Registered_Investor__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Registered_Investor__r,
           java.util.Date capMan__Report_Date__c,
           java.lang.String capMan__RollUpAccount__c,
           java.lang.Double capMan__SecondCarryGPPct__c,
           java.lang.Double capMan__Second_Carry__c,
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
        this.capMan__AccountName__c = capMan__AccountName__c;
        this.capMan__AccountNumber__c = capMan__AccountNumber__c;
        this.capMan__AccountType__c = capMan__AccountType__c;
        this.capMan__Account_Value__c = capMan__Account_Value__c;
        this.capMan__AccruedManagementFee__c = capMan__AccruedManagementFee__c;
        this.capMan__Attribution_Analytics_Tracks__r = capMan__Attribution_Analytics_Tracks__r;
        this.capMan__CapitalCalls__c = capMan__CapitalCalls__c;
        this.capMan__CapitalContributions__c = capMan__CapitalContributions__c;
        this.capMan__Catchup__c = capMan__Catchup__c;
        this.capMan__ClawbackAmount__c = capMan__ClawbackAmount__c;
        this.capMan__ClawbackFrequency__c = capMan__ClawbackFrequency__c;
        this.capMan__Clawback__c = capMan__Clawback__c;
        this.capMan__ContingencyLoss__c = capMan__ContingencyLoss__c;
        this.capMan__Description__c = capMan__Description__c;
        this.capMan__Dividend_Frequency__c = capMan__Dividend_Frequency__c;
        this.capMan__Dividend_Payout_Order__c = capMan__Dividend_Payout_Order__c;
        this.capMan__FinalCarry__c = capMan__FinalCarry__c;
        this.capMan__FirstCarryGPPct__c = capMan__FirstCarryGPPct__c;
        this.capMan__First_Carry__c = capMan__First_Carry__c;
        this.capMan__FiscalYearEnd__c = capMan__FiscalYearEnd__c;
        this.capMan__FundCloseDate__c = capMan__FundCloseDate__c;
        this.capMan__FundDisolutionDate__c = capMan__FundDisolutionDate__c;
        this.capMan__FundName__c = capMan__FundName__c;
        this.capMan__FundSize__c = capMan__FundSize__c;
        this.capMan__FundTerm__c = capMan__FundTerm__c;
        this.capMan__FundType__c = capMan__FundType__c;
        this.capMan__GPPrincipalLiability__c = capMan__GPPrincipalLiability__c;
        this.capMan__GP_Principal_Payout_Order__c = capMan__GP_Principal_Payout_Order__c;
        this.capMan__Has_First_Carry__c = capMan__Has_First_Carry__c;
        this.capMan__Has_Second_Carry__c = capMan__Has_Second_Carry__c;
        this.capMan__Industry__c = capMan__Industry__c;
        this.capMan__InitialCapitalCall__c = capMan__InitialCapitalCall__c;
        this.capMan__KeyManProvision__c = capMan__KeyManProvision__c;
        this.capMan__LPPrincipalLiability__c = capMan__LPPrincipalLiability__c;
        this.capMan__LP_Principal_Payout_Order__c = capMan__LP_Principal_Payout_Order__c;
        this.capMan__Last_Distribution_GP_Pct__c = capMan__Last_Distribution_GP_Pct__c;
        this.capMan__LegalName__c = capMan__LegalName__c;
        this.capMan__ManagementFee__c = capMan__ManagementFee__c;
        this.capMan__Management_Fee_Frequency__c = capMan__Management_Fee_Frequency__c;
        this.capMan__Management_Fee_Payout_Order__c = capMan__Management_Fee_Payout_Order__c;
        this.capMan__MaximumFundSize__c = capMan__MaximumFundSize__c;
        this.capMan__PartnersContribution__c = capMan__PartnersContribution__c;
        this.capMan__PayoutDefined__c = capMan__PayoutDefined__c;
        this.capMan__PreferredDividendLiability__c = capMan__PreferredDividendLiability__c;
        this.capMan__Preferred_Dividend__c = capMan__Preferred_Dividend__c;
        this.capMan__Registered_Investor__c = capMan__Registered_Investor__c;
        this.capMan__Registered_Investor__r = capMan__Registered_Investor__r;
        this.capMan__Report_Date__c = capMan__Report_Date__c;
        this.capMan__RollUpAccount__c = capMan__RollUpAccount__c;
        this.capMan__SecondCarryGPPct__c = capMan__SecondCarryGPPct__c;
        this.capMan__Second_Carry__c = capMan__Second_Carry__c;
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
     * Gets the activityHistories value for this CapMan__Fund__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__Fund__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__Fund__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Fund__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__AccountName__c value for this CapMan__Fund__c.
     * 
     * @return capMan__AccountName__c
     */
    public java.lang.String getCapMan__AccountName__c() {
        return capMan__AccountName__c;
    }


    /**
     * Sets the capMan__AccountName__c value for this CapMan__Fund__c.
     * 
     * @param capMan__AccountName__c
     */
    public void setCapMan__AccountName__c(java.lang.String capMan__AccountName__c) {
        this.capMan__AccountName__c = capMan__AccountName__c;
    }


    /**
     * Gets the capMan__AccountNumber__c value for this CapMan__Fund__c.
     * 
     * @return capMan__AccountNumber__c
     */
    public java.lang.String getCapMan__AccountNumber__c() {
        return capMan__AccountNumber__c;
    }


    /**
     * Sets the capMan__AccountNumber__c value for this CapMan__Fund__c.
     * 
     * @param capMan__AccountNumber__c
     */
    public void setCapMan__AccountNumber__c(java.lang.String capMan__AccountNumber__c) {
        this.capMan__AccountNumber__c = capMan__AccountNumber__c;
    }


    /**
     * Gets the capMan__AccountType__c value for this CapMan__Fund__c.
     * 
     * @return capMan__AccountType__c
     */
    public java.lang.String getCapMan__AccountType__c() {
        return capMan__AccountType__c;
    }


    /**
     * Sets the capMan__AccountType__c value for this CapMan__Fund__c.
     * 
     * @param capMan__AccountType__c
     */
    public void setCapMan__AccountType__c(java.lang.String capMan__AccountType__c) {
        this.capMan__AccountType__c = capMan__AccountType__c;
    }


    /**
     * Gets the capMan__Account_Value__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Account_Value__c
     */
    public java.lang.Double getCapMan__Account_Value__c() {
        return capMan__Account_Value__c;
    }


    /**
     * Sets the capMan__Account_Value__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Account_Value__c
     */
    public void setCapMan__Account_Value__c(java.lang.Double capMan__Account_Value__c) {
        this.capMan__Account_Value__c = capMan__Account_Value__c;
    }


    /**
     * Gets the capMan__AccruedManagementFee__c value for this CapMan__Fund__c.
     * 
     * @return capMan__AccruedManagementFee__c
     */
    public java.lang.Double getCapMan__AccruedManagementFee__c() {
        return capMan__AccruedManagementFee__c;
    }


    /**
     * Sets the capMan__AccruedManagementFee__c value for this CapMan__Fund__c.
     * 
     * @param capMan__AccruedManagementFee__c
     */
    public void setCapMan__AccruedManagementFee__c(java.lang.Double capMan__AccruedManagementFee__c) {
        this.capMan__AccruedManagementFee__c = capMan__AccruedManagementFee__c;
    }


    /**
     * Gets the capMan__Attribution_Analytics_Tracks__r value for this CapMan__Fund__c.
     * 
     * @return capMan__Attribution_Analytics_Tracks__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Attribution_Analytics_Tracks__r() {
        return capMan__Attribution_Analytics_Tracks__r;
    }


    /**
     * Sets the capMan__Attribution_Analytics_Tracks__r value for this CapMan__Fund__c.
     * 
     * @param capMan__Attribution_Analytics_Tracks__r
     */
    public void setCapMan__Attribution_Analytics_Tracks__r(com.sforce.soap.enterprise.QueryResult capMan__Attribution_Analytics_Tracks__r) {
        this.capMan__Attribution_Analytics_Tracks__r = capMan__Attribution_Analytics_Tracks__r;
    }


    /**
     * Gets the capMan__CapitalCalls__c value for this CapMan__Fund__c.
     * 
     * @return capMan__CapitalCalls__c
     */
    public java.lang.Double getCapMan__CapitalCalls__c() {
        return capMan__CapitalCalls__c;
    }


    /**
     * Sets the capMan__CapitalCalls__c value for this CapMan__Fund__c.
     * 
     * @param capMan__CapitalCalls__c
     */
    public void setCapMan__CapitalCalls__c(java.lang.Double capMan__CapitalCalls__c) {
        this.capMan__CapitalCalls__c = capMan__CapitalCalls__c;
    }


    /**
     * Gets the capMan__CapitalContributions__c value for this CapMan__Fund__c.
     * 
     * @return capMan__CapitalContributions__c
     */
    public java.lang.Double getCapMan__CapitalContributions__c() {
        return capMan__CapitalContributions__c;
    }


    /**
     * Sets the capMan__CapitalContributions__c value for this CapMan__Fund__c.
     * 
     * @param capMan__CapitalContributions__c
     */
    public void setCapMan__CapitalContributions__c(java.lang.Double capMan__CapitalContributions__c) {
        this.capMan__CapitalContributions__c = capMan__CapitalContributions__c;
    }


    /**
     * Gets the capMan__Catchup__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Catchup__c
     */
    public java.lang.Double getCapMan__Catchup__c() {
        return capMan__Catchup__c;
    }


    /**
     * Sets the capMan__Catchup__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Catchup__c
     */
    public void setCapMan__Catchup__c(java.lang.Double capMan__Catchup__c) {
        this.capMan__Catchup__c = capMan__Catchup__c;
    }


    /**
     * Gets the capMan__ClawbackAmount__c value for this CapMan__Fund__c.
     * 
     * @return capMan__ClawbackAmount__c
     */
    public java.lang.Double getCapMan__ClawbackAmount__c() {
        return capMan__ClawbackAmount__c;
    }


    /**
     * Sets the capMan__ClawbackAmount__c value for this CapMan__Fund__c.
     * 
     * @param capMan__ClawbackAmount__c
     */
    public void setCapMan__ClawbackAmount__c(java.lang.Double capMan__ClawbackAmount__c) {
        this.capMan__ClawbackAmount__c = capMan__ClawbackAmount__c;
    }


    /**
     * Gets the capMan__ClawbackFrequency__c value for this CapMan__Fund__c.
     * 
     * @return capMan__ClawbackFrequency__c
     */
    public java.lang.String getCapMan__ClawbackFrequency__c() {
        return capMan__ClawbackFrequency__c;
    }


    /**
     * Sets the capMan__ClawbackFrequency__c value for this CapMan__Fund__c.
     * 
     * @param capMan__ClawbackFrequency__c
     */
    public void setCapMan__ClawbackFrequency__c(java.lang.String capMan__ClawbackFrequency__c) {
        this.capMan__ClawbackFrequency__c = capMan__ClawbackFrequency__c;
    }


    /**
     * Gets the capMan__Clawback__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Clawback__c
     */
    public java.lang.Double getCapMan__Clawback__c() {
        return capMan__Clawback__c;
    }


    /**
     * Sets the capMan__Clawback__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Clawback__c
     */
    public void setCapMan__Clawback__c(java.lang.Double capMan__Clawback__c) {
        this.capMan__Clawback__c = capMan__Clawback__c;
    }


    /**
     * Gets the capMan__ContingencyLoss__c value for this CapMan__Fund__c.
     * 
     * @return capMan__ContingencyLoss__c
     */
    public java.lang.Double getCapMan__ContingencyLoss__c() {
        return capMan__ContingencyLoss__c;
    }


    /**
     * Sets the capMan__ContingencyLoss__c value for this CapMan__Fund__c.
     * 
     * @param capMan__ContingencyLoss__c
     */
    public void setCapMan__ContingencyLoss__c(java.lang.Double capMan__ContingencyLoss__c) {
        this.capMan__ContingencyLoss__c = capMan__ContingencyLoss__c;
    }


    /**
     * Gets the capMan__Description__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Description__c
     */
    public java.lang.String getCapMan__Description__c() {
        return capMan__Description__c;
    }


    /**
     * Sets the capMan__Description__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Description__c
     */
    public void setCapMan__Description__c(java.lang.String capMan__Description__c) {
        this.capMan__Description__c = capMan__Description__c;
    }


    /**
     * Gets the capMan__Dividend_Frequency__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Dividend_Frequency__c
     */
    public java.lang.String getCapMan__Dividend_Frequency__c() {
        return capMan__Dividend_Frequency__c;
    }


    /**
     * Sets the capMan__Dividend_Frequency__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Dividend_Frequency__c
     */
    public void setCapMan__Dividend_Frequency__c(java.lang.String capMan__Dividend_Frequency__c) {
        this.capMan__Dividend_Frequency__c = capMan__Dividend_Frequency__c;
    }


    /**
     * Gets the capMan__Dividend_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Dividend_Payout_Order__c
     */
    public java.lang.Double getCapMan__Dividend_Payout_Order__c() {
        return capMan__Dividend_Payout_Order__c;
    }


    /**
     * Sets the capMan__Dividend_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Dividend_Payout_Order__c
     */
    public void setCapMan__Dividend_Payout_Order__c(java.lang.Double capMan__Dividend_Payout_Order__c) {
        this.capMan__Dividend_Payout_Order__c = capMan__Dividend_Payout_Order__c;
    }


    /**
     * Gets the capMan__FinalCarry__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FinalCarry__c
     */
    public java.lang.Double getCapMan__FinalCarry__c() {
        return capMan__FinalCarry__c;
    }


    /**
     * Sets the capMan__FinalCarry__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FinalCarry__c
     */
    public void setCapMan__FinalCarry__c(java.lang.Double capMan__FinalCarry__c) {
        this.capMan__FinalCarry__c = capMan__FinalCarry__c;
    }


    /**
     * Gets the capMan__FirstCarryGPPct__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FirstCarryGPPct__c
     */
    public java.lang.Double getCapMan__FirstCarryGPPct__c() {
        return capMan__FirstCarryGPPct__c;
    }


    /**
     * Sets the capMan__FirstCarryGPPct__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FirstCarryGPPct__c
     */
    public void setCapMan__FirstCarryGPPct__c(java.lang.Double capMan__FirstCarryGPPct__c) {
        this.capMan__FirstCarryGPPct__c = capMan__FirstCarryGPPct__c;
    }


    /**
     * Gets the capMan__First_Carry__c value for this CapMan__Fund__c.
     * 
     * @return capMan__First_Carry__c
     */
    public java.lang.Double getCapMan__First_Carry__c() {
        return capMan__First_Carry__c;
    }


    /**
     * Sets the capMan__First_Carry__c value for this CapMan__Fund__c.
     * 
     * @param capMan__First_Carry__c
     */
    public void setCapMan__First_Carry__c(java.lang.Double capMan__First_Carry__c) {
        this.capMan__First_Carry__c = capMan__First_Carry__c;
    }


    /**
     * Gets the capMan__FiscalYearEnd__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FiscalYearEnd__c
     */
    public java.util.Date getCapMan__FiscalYearEnd__c() {
        return capMan__FiscalYearEnd__c;
    }


    /**
     * Sets the capMan__FiscalYearEnd__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FiscalYearEnd__c
     */
    public void setCapMan__FiscalYearEnd__c(java.util.Date capMan__FiscalYearEnd__c) {
        this.capMan__FiscalYearEnd__c = capMan__FiscalYearEnd__c;
    }


    /**
     * Gets the capMan__FundCloseDate__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FundCloseDate__c
     */
    public java.util.Date getCapMan__FundCloseDate__c() {
        return capMan__FundCloseDate__c;
    }


    /**
     * Sets the capMan__FundCloseDate__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FundCloseDate__c
     */
    public void setCapMan__FundCloseDate__c(java.util.Date capMan__FundCloseDate__c) {
        this.capMan__FundCloseDate__c = capMan__FundCloseDate__c;
    }


    /**
     * Gets the capMan__FundDisolutionDate__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FundDisolutionDate__c
     */
    public java.util.Date getCapMan__FundDisolutionDate__c() {
        return capMan__FundDisolutionDate__c;
    }


    /**
     * Sets the capMan__FundDisolutionDate__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FundDisolutionDate__c
     */
    public void setCapMan__FundDisolutionDate__c(java.util.Date capMan__FundDisolutionDate__c) {
        this.capMan__FundDisolutionDate__c = capMan__FundDisolutionDate__c;
    }


    /**
     * Gets the capMan__FundName__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FundName__c
     */
    public java.lang.String getCapMan__FundName__c() {
        return capMan__FundName__c;
    }


    /**
     * Sets the capMan__FundName__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FundName__c
     */
    public void setCapMan__FundName__c(java.lang.String capMan__FundName__c) {
        this.capMan__FundName__c = capMan__FundName__c;
    }


    /**
     * Gets the capMan__FundSize__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FundSize__c
     */
    public java.lang.Double getCapMan__FundSize__c() {
        return capMan__FundSize__c;
    }


    /**
     * Sets the capMan__FundSize__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FundSize__c
     */
    public void setCapMan__FundSize__c(java.lang.Double capMan__FundSize__c) {
        this.capMan__FundSize__c = capMan__FundSize__c;
    }


    /**
     * Gets the capMan__FundTerm__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FundTerm__c
     */
    public java.lang.Double getCapMan__FundTerm__c() {
        return capMan__FundTerm__c;
    }


    /**
     * Sets the capMan__FundTerm__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FundTerm__c
     */
    public void setCapMan__FundTerm__c(java.lang.Double capMan__FundTerm__c) {
        this.capMan__FundTerm__c = capMan__FundTerm__c;
    }


    /**
     * Gets the capMan__FundType__c value for this CapMan__Fund__c.
     * 
     * @return capMan__FundType__c
     */
    public java.lang.String getCapMan__FundType__c() {
        return capMan__FundType__c;
    }


    /**
     * Sets the capMan__FundType__c value for this CapMan__Fund__c.
     * 
     * @param capMan__FundType__c
     */
    public void setCapMan__FundType__c(java.lang.String capMan__FundType__c) {
        this.capMan__FundType__c = capMan__FundType__c;
    }


    /**
     * Gets the capMan__GPPrincipalLiability__c value for this CapMan__Fund__c.
     * 
     * @return capMan__GPPrincipalLiability__c
     */
    public java.lang.Double getCapMan__GPPrincipalLiability__c() {
        return capMan__GPPrincipalLiability__c;
    }


    /**
     * Sets the capMan__GPPrincipalLiability__c value for this CapMan__Fund__c.
     * 
     * @param capMan__GPPrincipalLiability__c
     */
    public void setCapMan__GPPrincipalLiability__c(java.lang.Double capMan__GPPrincipalLiability__c) {
        this.capMan__GPPrincipalLiability__c = capMan__GPPrincipalLiability__c;
    }


    /**
     * Gets the capMan__GP_Principal_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @return capMan__GP_Principal_Payout_Order__c
     */
    public java.lang.Double getCapMan__GP_Principal_Payout_Order__c() {
        return capMan__GP_Principal_Payout_Order__c;
    }


    /**
     * Sets the capMan__GP_Principal_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @param capMan__GP_Principal_Payout_Order__c
     */
    public void setCapMan__GP_Principal_Payout_Order__c(java.lang.Double capMan__GP_Principal_Payout_Order__c) {
        this.capMan__GP_Principal_Payout_Order__c = capMan__GP_Principal_Payout_Order__c;
    }


    /**
     * Gets the capMan__Has_First_Carry__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Has_First_Carry__c
     */
    public java.lang.Boolean getCapMan__Has_First_Carry__c() {
        return capMan__Has_First_Carry__c;
    }


    /**
     * Sets the capMan__Has_First_Carry__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Has_First_Carry__c
     */
    public void setCapMan__Has_First_Carry__c(java.lang.Boolean capMan__Has_First_Carry__c) {
        this.capMan__Has_First_Carry__c = capMan__Has_First_Carry__c;
    }


    /**
     * Gets the capMan__Has_Second_Carry__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Has_Second_Carry__c
     */
    public java.lang.Boolean getCapMan__Has_Second_Carry__c() {
        return capMan__Has_Second_Carry__c;
    }


    /**
     * Sets the capMan__Has_Second_Carry__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Has_Second_Carry__c
     */
    public void setCapMan__Has_Second_Carry__c(java.lang.Boolean capMan__Has_Second_Carry__c) {
        this.capMan__Has_Second_Carry__c = capMan__Has_Second_Carry__c;
    }


    /**
     * Gets the capMan__Industry__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Industry__c
     */
    public java.lang.String getCapMan__Industry__c() {
        return capMan__Industry__c;
    }


    /**
     * Sets the capMan__Industry__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Industry__c
     */
    public void setCapMan__Industry__c(java.lang.String capMan__Industry__c) {
        this.capMan__Industry__c = capMan__Industry__c;
    }


    /**
     * Gets the capMan__InitialCapitalCall__c value for this CapMan__Fund__c.
     * 
     * @return capMan__InitialCapitalCall__c
     */
    public java.lang.Double getCapMan__InitialCapitalCall__c() {
        return capMan__InitialCapitalCall__c;
    }


    /**
     * Sets the capMan__InitialCapitalCall__c value for this CapMan__Fund__c.
     * 
     * @param capMan__InitialCapitalCall__c
     */
    public void setCapMan__InitialCapitalCall__c(java.lang.Double capMan__InitialCapitalCall__c) {
        this.capMan__InitialCapitalCall__c = capMan__InitialCapitalCall__c;
    }


    /**
     * Gets the capMan__KeyManProvision__c value for this CapMan__Fund__c.
     * 
     * @return capMan__KeyManProvision__c
     */
    public java.lang.Boolean getCapMan__KeyManProvision__c() {
        return capMan__KeyManProvision__c;
    }


    /**
     * Sets the capMan__KeyManProvision__c value for this CapMan__Fund__c.
     * 
     * @param capMan__KeyManProvision__c
     */
    public void setCapMan__KeyManProvision__c(java.lang.Boolean capMan__KeyManProvision__c) {
        this.capMan__KeyManProvision__c = capMan__KeyManProvision__c;
    }


    /**
     * Gets the capMan__LPPrincipalLiability__c value for this CapMan__Fund__c.
     * 
     * @return capMan__LPPrincipalLiability__c
     */
    public java.lang.Double getCapMan__LPPrincipalLiability__c() {
        return capMan__LPPrincipalLiability__c;
    }


    /**
     * Sets the capMan__LPPrincipalLiability__c value for this CapMan__Fund__c.
     * 
     * @param capMan__LPPrincipalLiability__c
     */
    public void setCapMan__LPPrincipalLiability__c(java.lang.Double capMan__LPPrincipalLiability__c) {
        this.capMan__LPPrincipalLiability__c = capMan__LPPrincipalLiability__c;
    }


    /**
     * Gets the capMan__LP_Principal_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @return capMan__LP_Principal_Payout_Order__c
     */
    public java.lang.Double getCapMan__LP_Principal_Payout_Order__c() {
        return capMan__LP_Principal_Payout_Order__c;
    }


    /**
     * Sets the capMan__LP_Principal_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @param capMan__LP_Principal_Payout_Order__c
     */
    public void setCapMan__LP_Principal_Payout_Order__c(java.lang.Double capMan__LP_Principal_Payout_Order__c) {
        this.capMan__LP_Principal_Payout_Order__c = capMan__LP_Principal_Payout_Order__c;
    }


    /**
     * Gets the capMan__Last_Distribution_GP_Pct__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Last_Distribution_GP_Pct__c
     */
    public java.lang.Double getCapMan__Last_Distribution_GP_Pct__c() {
        return capMan__Last_Distribution_GP_Pct__c;
    }


    /**
     * Sets the capMan__Last_Distribution_GP_Pct__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Last_Distribution_GP_Pct__c
     */
    public void setCapMan__Last_Distribution_GP_Pct__c(java.lang.Double capMan__Last_Distribution_GP_Pct__c) {
        this.capMan__Last_Distribution_GP_Pct__c = capMan__Last_Distribution_GP_Pct__c;
    }


    /**
     * Gets the capMan__LegalName__c value for this CapMan__Fund__c.
     * 
     * @return capMan__LegalName__c
     */
    public java.lang.String getCapMan__LegalName__c() {
        return capMan__LegalName__c;
    }


    /**
     * Sets the capMan__LegalName__c value for this CapMan__Fund__c.
     * 
     * @param capMan__LegalName__c
     */
    public void setCapMan__LegalName__c(java.lang.String capMan__LegalName__c) {
        this.capMan__LegalName__c = capMan__LegalName__c;
    }


    /**
     * Gets the capMan__ManagementFee__c value for this CapMan__Fund__c.
     * 
     * @return capMan__ManagementFee__c
     */
    public java.lang.Double getCapMan__ManagementFee__c() {
        return capMan__ManagementFee__c;
    }


    /**
     * Sets the capMan__ManagementFee__c value for this CapMan__Fund__c.
     * 
     * @param capMan__ManagementFee__c
     */
    public void setCapMan__ManagementFee__c(java.lang.Double capMan__ManagementFee__c) {
        this.capMan__ManagementFee__c = capMan__ManagementFee__c;
    }


    /**
     * Gets the capMan__Management_Fee_Frequency__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Management_Fee_Frequency__c
     */
    public java.lang.String getCapMan__Management_Fee_Frequency__c() {
        return capMan__Management_Fee_Frequency__c;
    }


    /**
     * Sets the capMan__Management_Fee_Frequency__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Management_Fee_Frequency__c
     */
    public void setCapMan__Management_Fee_Frequency__c(java.lang.String capMan__Management_Fee_Frequency__c) {
        this.capMan__Management_Fee_Frequency__c = capMan__Management_Fee_Frequency__c;
    }


    /**
     * Gets the capMan__Management_Fee_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Management_Fee_Payout_Order__c
     */
    public java.lang.Double getCapMan__Management_Fee_Payout_Order__c() {
        return capMan__Management_Fee_Payout_Order__c;
    }


    /**
     * Sets the capMan__Management_Fee_Payout_Order__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Management_Fee_Payout_Order__c
     */
    public void setCapMan__Management_Fee_Payout_Order__c(java.lang.Double capMan__Management_Fee_Payout_Order__c) {
        this.capMan__Management_Fee_Payout_Order__c = capMan__Management_Fee_Payout_Order__c;
    }


    /**
     * Gets the capMan__MaximumFundSize__c value for this CapMan__Fund__c.
     * 
     * @return capMan__MaximumFundSize__c
     */
    public java.lang.Double getCapMan__MaximumFundSize__c() {
        return capMan__MaximumFundSize__c;
    }


    /**
     * Sets the capMan__MaximumFundSize__c value for this CapMan__Fund__c.
     * 
     * @param capMan__MaximumFundSize__c
     */
    public void setCapMan__MaximumFundSize__c(java.lang.Double capMan__MaximumFundSize__c) {
        this.capMan__MaximumFundSize__c = capMan__MaximumFundSize__c;
    }


    /**
     * Gets the capMan__PartnersContribution__c value for this CapMan__Fund__c.
     * 
     * @return capMan__PartnersContribution__c
     */
    public java.lang.Double getCapMan__PartnersContribution__c() {
        return capMan__PartnersContribution__c;
    }


    /**
     * Sets the capMan__PartnersContribution__c value for this CapMan__Fund__c.
     * 
     * @param capMan__PartnersContribution__c
     */
    public void setCapMan__PartnersContribution__c(java.lang.Double capMan__PartnersContribution__c) {
        this.capMan__PartnersContribution__c = capMan__PartnersContribution__c;
    }


    /**
     * Gets the capMan__PayoutDefined__c value for this CapMan__Fund__c.
     * 
     * @return capMan__PayoutDefined__c
     */
    public java.lang.Double getCapMan__PayoutDefined__c() {
        return capMan__PayoutDefined__c;
    }


    /**
     * Sets the capMan__PayoutDefined__c value for this CapMan__Fund__c.
     * 
     * @param capMan__PayoutDefined__c
     */
    public void setCapMan__PayoutDefined__c(java.lang.Double capMan__PayoutDefined__c) {
        this.capMan__PayoutDefined__c = capMan__PayoutDefined__c;
    }


    /**
     * Gets the capMan__PreferredDividendLiability__c value for this CapMan__Fund__c.
     * 
     * @return capMan__PreferredDividendLiability__c
     */
    public java.lang.Double getCapMan__PreferredDividendLiability__c() {
        return capMan__PreferredDividendLiability__c;
    }


    /**
     * Sets the capMan__PreferredDividendLiability__c value for this CapMan__Fund__c.
     * 
     * @param capMan__PreferredDividendLiability__c
     */
    public void setCapMan__PreferredDividendLiability__c(java.lang.Double capMan__PreferredDividendLiability__c) {
        this.capMan__PreferredDividendLiability__c = capMan__PreferredDividendLiability__c;
    }


    /**
     * Gets the capMan__Preferred_Dividend__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Preferred_Dividend__c
     */
    public java.lang.Double getCapMan__Preferred_Dividend__c() {
        return capMan__Preferred_Dividend__c;
    }


    /**
     * Sets the capMan__Preferred_Dividend__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Preferred_Dividend__c
     */
    public void setCapMan__Preferred_Dividend__c(java.lang.Double capMan__Preferred_Dividend__c) {
        this.capMan__Preferred_Dividend__c = capMan__Preferred_Dividend__c;
    }


    /**
     * Gets the capMan__Registered_Investor__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Registered_Investor__c
     */
    public java.lang.String getCapMan__Registered_Investor__c() {
        return capMan__Registered_Investor__c;
    }


    /**
     * Sets the capMan__Registered_Investor__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Registered_Investor__c
     */
    public void setCapMan__Registered_Investor__c(java.lang.String capMan__Registered_Investor__c) {
        this.capMan__Registered_Investor__c = capMan__Registered_Investor__c;
    }


    /**
     * Gets the capMan__Registered_Investor__r value for this CapMan__Fund__c.
     * 
     * @return capMan__Registered_Investor__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getCapMan__Registered_Investor__r() {
        return capMan__Registered_Investor__r;
    }


    /**
     * Sets the capMan__Registered_Investor__r value for this CapMan__Fund__c.
     * 
     * @param capMan__Registered_Investor__r
     */
    public void setCapMan__Registered_Investor__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__Registered_Investor__r) {
        this.capMan__Registered_Investor__r = capMan__Registered_Investor__r;
    }


    /**
     * Gets the capMan__Report_Date__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Report_Date__c
     */
    public java.util.Date getCapMan__Report_Date__c() {
        return capMan__Report_Date__c;
    }


    /**
     * Sets the capMan__Report_Date__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Report_Date__c
     */
    public void setCapMan__Report_Date__c(java.util.Date capMan__Report_Date__c) {
        this.capMan__Report_Date__c = capMan__Report_Date__c;
    }


    /**
     * Gets the capMan__RollUpAccount__c value for this CapMan__Fund__c.
     * 
     * @return capMan__RollUpAccount__c
     */
    public java.lang.String getCapMan__RollUpAccount__c() {
        return capMan__RollUpAccount__c;
    }


    /**
     * Sets the capMan__RollUpAccount__c value for this CapMan__Fund__c.
     * 
     * @param capMan__RollUpAccount__c
     */
    public void setCapMan__RollUpAccount__c(java.lang.String capMan__RollUpAccount__c) {
        this.capMan__RollUpAccount__c = capMan__RollUpAccount__c;
    }


    /**
     * Gets the capMan__SecondCarryGPPct__c value for this CapMan__Fund__c.
     * 
     * @return capMan__SecondCarryGPPct__c
     */
    public java.lang.Double getCapMan__SecondCarryGPPct__c() {
        return capMan__SecondCarryGPPct__c;
    }


    /**
     * Sets the capMan__SecondCarryGPPct__c value for this CapMan__Fund__c.
     * 
     * @param capMan__SecondCarryGPPct__c
     */
    public void setCapMan__SecondCarryGPPct__c(java.lang.Double capMan__SecondCarryGPPct__c) {
        this.capMan__SecondCarryGPPct__c = capMan__SecondCarryGPPct__c;
    }


    /**
     * Gets the capMan__Second_Carry__c value for this CapMan__Fund__c.
     * 
     * @return capMan__Second_Carry__c
     */
    public java.lang.Double getCapMan__Second_Carry__c() {
        return capMan__Second_Carry__c;
    }


    /**
     * Sets the capMan__Second_Carry__c value for this CapMan__Fund__c.
     * 
     * @param capMan__Second_Carry__c
     */
    public void setCapMan__Second_Carry__c(java.lang.Double capMan__Second_Carry__c) {
        this.capMan__Second_Carry__c = capMan__Second_Carry__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Fund__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Fund__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Fund__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Fund__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Fund__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Fund__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Fund__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Fund__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__Fund__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__Fund__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Fund__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Fund__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CapMan__Fund__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__Fund__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__Fund__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Fund__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__Fund__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__Fund__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Fund__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Fund__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Fund__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Fund__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Fund__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Fund__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Fund__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Fund__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Fund__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Fund__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Fund__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Fund__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__Fund__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__Fund__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this CapMan__Fund__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__Fund__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__Fund__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__Fund__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__Fund__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Fund__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Fund__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Fund__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Fund__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Fund__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__Fund__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__Fund__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Fund__c)) return false;
        CapMan__Fund__c other = (CapMan__Fund__c) obj;
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
            ((this.capMan__AccountName__c==null && other.getCapMan__AccountName__c()==null) || 
             (this.capMan__AccountName__c!=null &&
              this.capMan__AccountName__c.equals(other.getCapMan__AccountName__c()))) &&
            ((this.capMan__AccountNumber__c==null && other.getCapMan__AccountNumber__c()==null) || 
             (this.capMan__AccountNumber__c!=null &&
              this.capMan__AccountNumber__c.equals(other.getCapMan__AccountNumber__c()))) &&
            ((this.capMan__AccountType__c==null && other.getCapMan__AccountType__c()==null) || 
             (this.capMan__AccountType__c!=null &&
              this.capMan__AccountType__c.equals(other.getCapMan__AccountType__c()))) &&
            ((this.capMan__Account_Value__c==null && other.getCapMan__Account_Value__c()==null) || 
             (this.capMan__Account_Value__c!=null &&
              this.capMan__Account_Value__c.equals(other.getCapMan__Account_Value__c()))) &&
            ((this.capMan__AccruedManagementFee__c==null && other.getCapMan__AccruedManagementFee__c()==null) || 
             (this.capMan__AccruedManagementFee__c!=null &&
              this.capMan__AccruedManagementFee__c.equals(other.getCapMan__AccruedManagementFee__c()))) &&
            ((this.capMan__Attribution_Analytics_Tracks__r==null && other.getCapMan__Attribution_Analytics_Tracks__r()==null) || 
             (this.capMan__Attribution_Analytics_Tracks__r!=null &&
              this.capMan__Attribution_Analytics_Tracks__r.equals(other.getCapMan__Attribution_Analytics_Tracks__r()))) &&
            ((this.capMan__CapitalCalls__c==null && other.getCapMan__CapitalCalls__c()==null) || 
             (this.capMan__CapitalCalls__c!=null &&
              this.capMan__CapitalCalls__c.equals(other.getCapMan__CapitalCalls__c()))) &&
            ((this.capMan__CapitalContributions__c==null && other.getCapMan__CapitalContributions__c()==null) || 
             (this.capMan__CapitalContributions__c!=null &&
              this.capMan__CapitalContributions__c.equals(other.getCapMan__CapitalContributions__c()))) &&
            ((this.capMan__Catchup__c==null && other.getCapMan__Catchup__c()==null) || 
             (this.capMan__Catchup__c!=null &&
              this.capMan__Catchup__c.equals(other.getCapMan__Catchup__c()))) &&
            ((this.capMan__ClawbackAmount__c==null && other.getCapMan__ClawbackAmount__c()==null) || 
             (this.capMan__ClawbackAmount__c!=null &&
              this.capMan__ClawbackAmount__c.equals(other.getCapMan__ClawbackAmount__c()))) &&
            ((this.capMan__ClawbackFrequency__c==null && other.getCapMan__ClawbackFrequency__c()==null) || 
             (this.capMan__ClawbackFrequency__c!=null &&
              this.capMan__ClawbackFrequency__c.equals(other.getCapMan__ClawbackFrequency__c()))) &&
            ((this.capMan__Clawback__c==null && other.getCapMan__Clawback__c()==null) || 
             (this.capMan__Clawback__c!=null &&
              this.capMan__Clawback__c.equals(other.getCapMan__Clawback__c()))) &&
            ((this.capMan__ContingencyLoss__c==null && other.getCapMan__ContingencyLoss__c()==null) || 
             (this.capMan__ContingencyLoss__c!=null &&
              this.capMan__ContingencyLoss__c.equals(other.getCapMan__ContingencyLoss__c()))) &&
            ((this.capMan__Description__c==null && other.getCapMan__Description__c()==null) || 
             (this.capMan__Description__c!=null &&
              this.capMan__Description__c.equals(other.getCapMan__Description__c()))) &&
            ((this.capMan__Dividend_Frequency__c==null && other.getCapMan__Dividend_Frequency__c()==null) || 
             (this.capMan__Dividend_Frequency__c!=null &&
              this.capMan__Dividend_Frequency__c.equals(other.getCapMan__Dividend_Frequency__c()))) &&
            ((this.capMan__Dividend_Payout_Order__c==null && other.getCapMan__Dividend_Payout_Order__c()==null) || 
             (this.capMan__Dividend_Payout_Order__c!=null &&
              this.capMan__Dividend_Payout_Order__c.equals(other.getCapMan__Dividend_Payout_Order__c()))) &&
            ((this.capMan__FinalCarry__c==null && other.getCapMan__FinalCarry__c()==null) || 
             (this.capMan__FinalCarry__c!=null &&
              this.capMan__FinalCarry__c.equals(other.getCapMan__FinalCarry__c()))) &&
            ((this.capMan__FirstCarryGPPct__c==null && other.getCapMan__FirstCarryGPPct__c()==null) || 
             (this.capMan__FirstCarryGPPct__c!=null &&
              this.capMan__FirstCarryGPPct__c.equals(other.getCapMan__FirstCarryGPPct__c()))) &&
            ((this.capMan__First_Carry__c==null && other.getCapMan__First_Carry__c()==null) || 
             (this.capMan__First_Carry__c!=null &&
              this.capMan__First_Carry__c.equals(other.getCapMan__First_Carry__c()))) &&
            ((this.capMan__FiscalYearEnd__c==null && other.getCapMan__FiscalYearEnd__c()==null) || 
             (this.capMan__FiscalYearEnd__c!=null &&
              this.capMan__FiscalYearEnd__c.equals(other.getCapMan__FiscalYearEnd__c()))) &&
            ((this.capMan__FundCloseDate__c==null && other.getCapMan__FundCloseDate__c()==null) || 
             (this.capMan__FundCloseDate__c!=null &&
              this.capMan__FundCloseDate__c.equals(other.getCapMan__FundCloseDate__c()))) &&
            ((this.capMan__FundDisolutionDate__c==null && other.getCapMan__FundDisolutionDate__c()==null) || 
             (this.capMan__FundDisolutionDate__c!=null &&
              this.capMan__FundDisolutionDate__c.equals(other.getCapMan__FundDisolutionDate__c()))) &&
            ((this.capMan__FundName__c==null && other.getCapMan__FundName__c()==null) || 
             (this.capMan__FundName__c!=null &&
              this.capMan__FundName__c.equals(other.getCapMan__FundName__c()))) &&
            ((this.capMan__FundSize__c==null && other.getCapMan__FundSize__c()==null) || 
             (this.capMan__FundSize__c!=null &&
              this.capMan__FundSize__c.equals(other.getCapMan__FundSize__c()))) &&
            ((this.capMan__FundTerm__c==null && other.getCapMan__FundTerm__c()==null) || 
             (this.capMan__FundTerm__c!=null &&
              this.capMan__FundTerm__c.equals(other.getCapMan__FundTerm__c()))) &&
            ((this.capMan__FundType__c==null && other.getCapMan__FundType__c()==null) || 
             (this.capMan__FundType__c!=null &&
              this.capMan__FundType__c.equals(other.getCapMan__FundType__c()))) &&
            ((this.capMan__GPPrincipalLiability__c==null && other.getCapMan__GPPrincipalLiability__c()==null) || 
             (this.capMan__GPPrincipalLiability__c!=null &&
              this.capMan__GPPrincipalLiability__c.equals(other.getCapMan__GPPrincipalLiability__c()))) &&
            ((this.capMan__GP_Principal_Payout_Order__c==null && other.getCapMan__GP_Principal_Payout_Order__c()==null) || 
             (this.capMan__GP_Principal_Payout_Order__c!=null &&
              this.capMan__GP_Principal_Payout_Order__c.equals(other.getCapMan__GP_Principal_Payout_Order__c()))) &&
            ((this.capMan__Has_First_Carry__c==null && other.getCapMan__Has_First_Carry__c()==null) || 
             (this.capMan__Has_First_Carry__c!=null &&
              this.capMan__Has_First_Carry__c.equals(other.getCapMan__Has_First_Carry__c()))) &&
            ((this.capMan__Has_Second_Carry__c==null && other.getCapMan__Has_Second_Carry__c()==null) || 
             (this.capMan__Has_Second_Carry__c!=null &&
              this.capMan__Has_Second_Carry__c.equals(other.getCapMan__Has_Second_Carry__c()))) &&
            ((this.capMan__Industry__c==null && other.getCapMan__Industry__c()==null) || 
             (this.capMan__Industry__c!=null &&
              this.capMan__Industry__c.equals(other.getCapMan__Industry__c()))) &&
            ((this.capMan__InitialCapitalCall__c==null && other.getCapMan__InitialCapitalCall__c()==null) || 
             (this.capMan__InitialCapitalCall__c!=null &&
              this.capMan__InitialCapitalCall__c.equals(other.getCapMan__InitialCapitalCall__c()))) &&
            ((this.capMan__KeyManProvision__c==null && other.getCapMan__KeyManProvision__c()==null) || 
             (this.capMan__KeyManProvision__c!=null &&
              this.capMan__KeyManProvision__c.equals(other.getCapMan__KeyManProvision__c()))) &&
            ((this.capMan__LPPrincipalLiability__c==null && other.getCapMan__LPPrincipalLiability__c()==null) || 
             (this.capMan__LPPrincipalLiability__c!=null &&
              this.capMan__LPPrincipalLiability__c.equals(other.getCapMan__LPPrincipalLiability__c()))) &&
            ((this.capMan__LP_Principal_Payout_Order__c==null && other.getCapMan__LP_Principal_Payout_Order__c()==null) || 
             (this.capMan__LP_Principal_Payout_Order__c!=null &&
              this.capMan__LP_Principal_Payout_Order__c.equals(other.getCapMan__LP_Principal_Payout_Order__c()))) &&
            ((this.capMan__Last_Distribution_GP_Pct__c==null && other.getCapMan__Last_Distribution_GP_Pct__c()==null) || 
             (this.capMan__Last_Distribution_GP_Pct__c!=null &&
              this.capMan__Last_Distribution_GP_Pct__c.equals(other.getCapMan__Last_Distribution_GP_Pct__c()))) &&
            ((this.capMan__LegalName__c==null && other.getCapMan__LegalName__c()==null) || 
             (this.capMan__LegalName__c!=null &&
              this.capMan__LegalName__c.equals(other.getCapMan__LegalName__c()))) &&
            ((this.capMan__ManagementFee__c==null && other.getCapMan__ManagementFee__c()==null) || 
             (this.capMan__ManagementFee__c!=null &&
              this.capMan__ManagementFee__c.equals(other.getCapMan__ManagementFee__c()))) &&
            ((this.capMan__Management_Fee_Frequency__c==null && other.getCapMan__Management_Fee_Frequency__c()==null) || 
             (this.capMan__Management_Fee_Frequency__c!=null &&
              this.capMan__Management_Fee_Frequency__c.equals(other.getCapMan__Management_Fee_Frequency__c()))) &&
            ((this.capMan__Management_Fee_Payout_Order__c==null && other.getCapMan__Management_Fee_Payout_Order__c()==null) || 
             (this.capMan__Management_Fee_Payout_Order__c!=null &&
              this.capMan__Management_Fee_Payout_Order__c.equals(other.getCapMan__Management_Fee_Payout_Order__c()))) &&
            ((this.capMan__MaximumFundSize__c==null && other.getCapMan__MaximumFundSize__c()==null) || 
             (this.capMan__MaximumFundSize__c!=null &&
              this.capMan__MaximumFundSize__c.equals(other.getCapMan__MaximumFundSize__c()))) &&
            ((this.capMan__PartnersContribution__c==null && other.getCapMan__PartnersContribution__c()==null) || 
             (this.capMan__PartnersContribution__c!=null &&
              this.capMan__PartnersContribution__c.equals(other.getCapMan__PartnersContribution__c()))) &&
            ((this.capMan__PayoutDefined__c==null && other.getCapMan__PayoutDefined__c()==null) || 
             (this.capMan__PayoutDefined__c!=null &&
              this.capMan__PayoutDefined__c.equals(other.getCapMan__PayoutDefined__c()))) &&
            ((this.capMan__PreferredDividendLiability__c==null && other.getCapMan__PreferredDividendLiability__c()==null) || 
             (this.capMan__PreferredDividendLiability__c!=null &&
              this.capMan__PreferredDividendLiability__c.equals(other.getCapMan__PreferredDividendLiability__c()))) &&
            ((this.capMan__Preferred_Dividend__c==null && other.getCapMan__Preferred_Dividend__c()==null) || 
             (this.capMan__Preferred_Dividend__c!=null &&
              this.capMan__Preferred_Dividend__c.equals(other.getCapMan__Preferred_Dividend__c()))) &&
            ((this.capMan__Registered_Investor__c==null && other.getCapMan__Registered_Investor__c()==null) || 
             (this.capMan__Registered_Investor__c!=null &&
              this.capMan__Registered_Investor__c.equals(other.getCapMan__Registered_Investor__c()))) &&
            ((this.capMan__Registered_Investor__r==null && other.getCapMan__Registered_Investor__r()==null) || 
             (this.capMan__Registered_Investor__r!=null &&
              this.capMan__Registered_Investor__r.equals(other.getCapMan__Registered_Investor__r()))) &&
            ((this.capMan__Report_Date__c==null && other.getCapMan__Report_Date__c()==null) || 
             (this.capMan__Report_Date__c!=null &&
              this.capMan__Report_Date__c.equals(other.getCapMan__Report_Date__c()))) &&
            ((this.capMan__RollUpAccount__c==null && other.getCapMan__RollUpAccount__c()==null) || 
             (this.capMan__RollUpAccount__c!=null &&
              this.capMan__RollUpAccount__c.equals(other.getCapMan__RollUpAccount__c()))) &&
            ((this.capMan__SecondCarryGPPct__c==null && other.getCapMan__SecondCarryGPPct__c()==null) || 
             (this.capMan__SecondCarryGPPct__c!=null &&
              this.capMan__SecondCarryGPPct__c.equals(other.getCapMan__SecondCarryGPPct__c()))) &&
            ((this.capMan__Second_Carry__c==null && other.getCapMan__Second_Carry__c()==null) || 
             (this.capMan__Second_Carry__c!=null &&
              this.capMan__Second_Carry__c.equals(other.getCapMan__Second_Carry__c()))) &&
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
        if (getCapMan__AccountName__c() != null) {
            _hashCode += getCapMan__AccountName__c().hashCode();
        }
        if (getCapMan__AccountNumber__c() != null) {
            _hashCode += getCapMan__AccountNumber__c().hashCode();
        }
        if (getCapMan__AccountType__c() != null) {
            _hashCode += getCapMan__AccountType__c().hashCode();
        }
        if (getCapMan__Account_Value__c() != null) {
            _hashCode += getCapMan__Account_Value__c().hashCode();
        }
        if (getCapMan__AccruedManagementFee__c() != null) {
            _hashCode += getCapMan__AccruedManagementFee__c().hashCode();
        }
        if (getCapMan__Attribution_Analytics_Tracks__r() != null) {
            _hashCode += getCapMan__Attribution_Analytics_Tracks__r().hashCode();
        }
        if (getCapMan__CapitalCalls__c() != null) {
            _hashCode += getCapMan__CapitalCalls__c().hashCode();
        }
        if (getCapMan__CapitalContributions__c() != null) {
            _hashCode += getCapMan__CapitalContributions__c().hashCode();
        }
        if (getCapMan__Catchup__c() != null) {
            _hashCode += getCapMan__Catchup__c().hashCode();
        }
        if (getCapMan__ClawbackAmount__c() != null) {
            _hashCode += getCapMan__ClawbackAmount__c().hashCode();
        }
        if (getCapMan__ClawbackFrequency__c() != null) {
            _hashCode += getCapMan__ClawbackFrequency__c().hashCode();
        }
        if (getCapMan__Clawback__c() != null) {
            _hashCode += getCapMan__Clawback__c().hashCode();
        }
        if (getCapMan__ContingencyLoss__c() != null) {
            _hashCode += getCapMan__ContingencyLoss__c().hashCode();
        }
        if (getCapMan__Description__c() != null) {
            _hashCode += getCapMan__Description__c().hashCode();
        }
        if (getCapMan__Dividend_Frequency__c() != null) {
            _hashCode += getCapMan__Dividend_Frequency__c().hashCode();
        }
        if (getCapMan__Dividend_Payout_Order__c() != null) {
            _hashCode += getCapMan__Dividend_Payout_Order__c().hashCode();
        }
        if (getCapMan__FinalCarry__c() != null) {
            _hashCode += getCapMan__FinalCarry__c().hashCode();
        }
        if (getCapMan__FirstCarryGPPct__c() != null) {
            _hashCode += getCapMan__FirstCarryGPPct__c().hashCode();
        }
        if (getCapMan__First_Carry__c() != null) {
            _hashCode += getCapMan__First_Carry__c().hashCode();
        }
        if (getCapMan__FiscalYearEnd__c() != null) {
            _hashCode += getCapMan__FiscalYearEnd__c().hashCode();
        }
        if (getCapMan__FundCloseDate__c() != null) {
            _hashCode += getCapMan__FundCloseDate__c().hashCode();
        }
        if (getCapMan__FundDisolutionDate__c() != null) {
            _hashCode += getCapMan__FundDisolutionDate__c().hashCode();
        }
        if (getCapMan__FundName__c() != null) {
            _hashCode += getCapMan__FundName__c().hashCode();
        }
        if (getCapMan__FundSize__c() != null) {
            _hashCode += getCapMan__FundSize__c().hashCode();
        }
        if (getCapMan__FundTerm__c() != null) {
            _hashCode += getCapMan__FundTerm__c().hashCode();
        }
        if (getCapMan__FundType__c() != null) {
            _hashCode += getCapMan__FundType__c().hashCode();
        }
        if (getCapMan__GPPrincipalLiability__c() != null) {
            _hashCode += getCapMan__GPPrincipalLiability__c().hashCode();
        }
        if (getCapMan__GP_Principal_Payout_Order__c() != null) {
            _hashCode += getCapMan__GP_Principal_Payout_Order__c().hashCode();
        }
        if (getCapMan__Has_First_Carry__c() != null) {
            _hashCode += getCapMan__Has_First_Carry__c().hashCode();
        }
        if (getCapMan__Has_Second_Carry__c() != null) {
            _hashCode += getCapMan__Has_Second_Carry__c().hashCode();
        }
        if (getCapMan__Industry__c() != null) {
            _hashCode += getCapMan__Industry__c().hashCode();
        }
        if (getCapMan__InitialCapitalCall__c() != null) {
            _hashCode += getCapMan__InitialCapitalCall__c().hashCode();
        }
        if (getCapMan__KeyManProvision__c() != null) {
            _hashCode += getCapMan__KeyManProvision__c().hashCode();
        }
        if (getCapMan__LPPrincipalLiability__c() != null) {
            _hashCode += getCapMan__LPPrincipalLiability__c().hashCode();
        }
        if (getCapMan__LP_Principal_Payout_Order__c() != null) {
            _hashCode += getCapMan__LP_Principal_Payout_Order__c().hashCode();
        }
        if (getCapMan__Last_Distribution_GP_Pct__c() != null) {
            _hashCode += getCapMan__Last_Distribution_GP_Pct__c().hashCode();
        }
        if (getCapMan__LegalName__c() != null) {
            _hashCode += getCapMan__LegalName__c().hashCode();
        }
        if (getCapMan__ManagementFee__c() != null) {
            _hashCode += getCapMan__ManagementFee__c().hashCode();
        }
        if (getCapMan__Management_Fee_Frequency__c() != null) {
            _hashCode += getCapMan__Management_Fee_Frequency__c().hashCode();
        }
        if (getCapMan__Management_Fee_Payout_Order__c() != null) {
            _hashCode += getCapMan__Management_Fee_Payout_Order__c().hashCode();
        }
        if (getCapMan__MaximumFundSize__c() != null) {
            _hashCode += getCapMan__MaximumFundSize__c().hashCode();
        }
        if (getCapMan__PartnersContribution__c() != null) {
            _hashCode += getCapMan__PartnersContribution__c().hashCode();
        }
        if (getCapMan__PayoutDefined__c() != null) {
            _hashCode += getCapMan__PayoutDefined__c().hashCode();
        }
        if (getCapMan__PreferredDividendLiability__c() != null) {
            _hashCode += getCapMan__PreferredDividendLiability__c().hashCode();
        }
        if (getCapMan__Preferred_Dividend__c() != null) {
            _hashCode += getCapMan__Preferred_Dividend__c().hashCode();
        }
        if (getCapMan__Registered_Investor__c() != null) {
            _hashCode += getCapMan__Registered_Investor__c().hashCode();
        }
        if (getCapMan__Registered_Investor__r() != null) {
            _hashCode += getCapMan__Registered_Investor__r().hashCode();
        }
        if (getCapMan__Report_Date__c() != null) {
            _hashCode += getCapMan__Report_Date__c().hashCode();
        }
        if (getCapMan__RollUpAccount__c() != null) {
            _hashCode += getCapMan__RollUpAccount__c().hashCode();
        }
        if (getCapMan__SecondCarryGPPct__c() != null) {
            _hashCode += getCapMan__SecondCarryGPPct__c().hashCode();
        }
        if (getCapMan__Second_Carry__c() != null) {
            _hashCode += getCapMan__Second_Carry__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Fund__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fund__c"));
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
        elemField.setFieldName("capMan__AccountName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccountName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AccountNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccountNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AccountType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccountType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Account_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Account_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AccruedManagementFee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccruedManagementFee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Attribution_Analytics_Tracks__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Attribution_Analytics_Tracks__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CapitalCalls__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CapitalCalls__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CapitalContributions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CapitalContributions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Catchup__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Catchup__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ClawbackAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ClawbackAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ClawbackFrequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ClawbackFrequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Clawback__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Clawback__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ContingencyLoss__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ContingencyLoss__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Dividend_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Dividend_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Dividend_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Dividend_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FinalCarry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FinalCarry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FirstCarryGPPct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FirstCarryGPPct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__First_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__First_Carry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FiscalYearEnd__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FiscalYearEnd__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FundCloseDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FundCloseDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FundDisolutionDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FundDisolutionDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FundName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FundName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FundSize__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FundSize__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FundTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FundTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FundType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FundType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__GPPrincipalLiability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__GPPrincipalLiability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__GP_Principal_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__GP_Principal_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Has_First_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Has_First_Carry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Has_Second_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Has_Second_Carry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("capMan__InitialCapitalCall__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__InitialCapitalCall__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__KeyManProvision__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__KeyManProvision__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LPPrincipalLiability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LPPrincipalLiability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LP_Principal_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LP_Principal_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Last_Distribution_GP_Pct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Last_Distribution_GP_Pct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LegalName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LegalName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ManagementFee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ManagementFee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Management_Fee_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Management_Fee_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Management_Fee_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Management_Fee_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__MaximumFundSize__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__MaximumFundSize__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PartnersContribution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PartnersContribution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PayoutDefined__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PayoutDefined__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PreferredDividendLiability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PreferredDividendLiability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Preferred_Dividend__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Preferred_Dividend__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Registered_Investor__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registered_Investor__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Report_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Report_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RollUpAccount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RollUpAccount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SecondCarryGPPct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecondCarryGPPct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Second_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Second_Carry__c"));
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
