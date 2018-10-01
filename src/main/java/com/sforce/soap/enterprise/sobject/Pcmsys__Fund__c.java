/**
 * Pcmsys__Fund__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Pcmsys__Fund__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

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

    private java.lang.String pcmsys__AccountName__c;

    private java.lang.String pcmsys__AccountNumber__c;

    private java.lang.String pcmsys__AccountType__c;

    private java.lang.String pcmsys__Account_Number__c;

    private java.lang.Double pcmsys__Account_Value__c;

    private java.lang.String pcmsys__Account__c;

    private java.lang.Double pcmsys__AccruedManagementFee__c;

    private java.lang.String pcmsys__Allocation_Method__c;

    private java.lang.String pcmsys__Bank_Name__c;

    private java.lang.String pcmsys__CapManRegisteredName__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r;

    private java.lang.Double pcmsys__CapitalCalls__c;

    private java.lang.Double pcmsys__CapitalContributions__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Calls_And_Commitments1__r;

    private java.lang.Double pcmsys__Catchup__c;

    private java.lang.Double pcmsys__ClawbackAmount__c;

    private java.lang.String pcmsys__ClawbackFrequency__c;

    private java.lang.Double pcmsys__Clawback__c;

    private java.lang.Double pcmsys__ContingencyLoss__c;

    private java.lang.Double pcmsys__Contributed_Capital__c;

    private java.lang.String pcmsys__Currency_Type__c;

    private java.lang.String pcmsys__Description__c;

    private java.lang.String pcmsys__Dividend_Frequency__c;

    private java.lang.Double pcmsys__Dividend_Payout_Order__c;

    private java.lang.Double pcmsys__FinalCarry__c;

    private java.lang.Double pcmsys__FirstCarryGPPct__c;

    private java.lang.Double pcmsys__First_Carry__c;

    private java.util.Date pcmsys__FiscalYearEnd__c;

    private java.util.Date pcmsys__FundCloseDate__c;

    private java.util.Date pcmsys__FundDisolutionDate__c;

    private java.lang.String pcmsys__FundName__c;

    private java.lang.Double pcmsys__FundSize__c;

    private java.lang.Double pcmsys__FundTerm__c;

    private java.lang.String pcmsys__FundType__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Funds__r;

    private java.lang.Double pcmsys__GPPrincipalLiability__c;

    private java.lang.Double pcmsys__GP_Principal_Payout_Order__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__General_Partners__r;

    private java.lang.Boolean pcmsys__Has_First_Carry__c;

    private java.lang.Boolean pcmsys__Has_Second_Carry__c;

    private java.lang.String pcmsys__Industry__c;

    private java.lang.Double pcmsys__InitialCapitalCall__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entries__r;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r;

    private java.lang.Boolean pcmsys__KeyManProvision__c;

    private java.lang.Double pcmsys__LPPrincipalLiability__c;

    private java.lang.Double pcmsys__LP_Principal_Payout_Order__c;

    private java.lang.Double pcmsys__Last_Distribution_GP_Pct__c;

    private java.lang.String pcmsys__LegalName__c;

    private java.lang.Double pcmsys__ManagementFee__c;

    private java.lang.String pcmsys__Management_Fee_Frequency__c;

    private java.lang.Double pcmsys__Management_Fee_Payout_Order__c;

    private java.lang.Double pcmsys__MaximumFundSize__c;

    private java.lang.String pcmsys__Parent_Fund__c;

    private com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Parent_Fund__r;

    private java.lang.Double pcmsys__PartnersContribution__c;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Partnership_Fundraisings__r;

    private java.lang.Double pcmsys__PayoutDefined__c;

    private java.lang.Double pcmsys__PreferredDividendLiability__c;

    private java.lang.Double pcmsys__Preferred_Dividend__c;

    private java.util.Date pcmsys__Report_Date__c;

    private java.lang.String pcmsys__RollUpAccount__c;

    private java.lang.String pcmsys__SWIFT_Code__c;

    private java.lang.Double pcmsys__SecondCarryGPPct__c;

    private java.lang.Double pcmsys__Second_Carry__c;

    private java.lang.String pcmsys__Sub_Account_Number__c;

    private java.lang.String pcmsys__Sub_Account__c;

    private java.lang.Double pcmsys__Total_Capital_Calls__c;

    private java.lang.Double pcmsys__Total_Capital_Commitments__c;

    private java.lang.String pcmsys__Unrealized_Gain__c;

    public Pcmsys__Fund__c() {
    }

    public Pcmsys__Fund__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
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
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String pcmsys__AccountName__c,
           java.lang.String pcmsys__AccountNumber__c,
           java.lang.String pcmsys__AccountType__c,
           java.lang.String pcmsys__Account_Number__c,
           java.lang.Double pcmsys__Account_Value__c,
           java.lang.String pcmsys__Account__c,
           java.lang.Double pcmsys__AccruedManagementFee__c,
           java.lang.String pcmsys__Allocation_Method__c,
           java.lang.String pcmsys__Bank_Name__c,
           java.lang.String pcmsys__CapManRegisteredName__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r,
           java.lang.Double pcmsys__CapitalCalls__c,
           java.lang.Double pcmsys__CapitalContributions__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Calls_And_Commitments1__r,
           java.lang.Double pcmsys__Catchup__c,
           java.lang.Double pcmsys__ClawbackAmount__c,
           java.lang.String pcmsys__ClawbackFrequency__c,
           java.lang.Double pcmsys__Clawback__c,
           java.lang.Double pcmsys__ContingencyLoss__c,
           java.lang.Double pcmsys__Contributed_Capital__c,
           java.lang.String pcmsys__Currency_Type__c,
           java.lang.String pcmsys__Description__c,
           java.lang.String pcmsys__Dividend_Frequency__c,
           java.lang.Double pcmsys__Dividend_Payout_Order__c,
           java.lang.Double pcmsys__FinalCarry__c,
           java.lang.Double pcmsys__FirstCarryGPPct__c,
           java.lang.Double pcmsys__First_Carry__c,
           java.util.Date pcmsys__FiscalYearEnd__c,
           java.util.Date pcmsys__FundCloseDate__c,
           java.util.Date pcmsys__FundDisolutionDate__c,
           java.lang.String pcmsys__FundName__c,
           java.lang.Double pcmsys__FundSize__c,
           java.lang.Double pcmsys__FundTerm__c,
           java.lang.String pcmsys__FundType__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__Funds__r,
           java.lang.Double pcmsys__GPPrincipalLiability__c,
           java.lang.Double pcmsys__GP_Principal_Payout_Order__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__General_Partners__r,
           java.lang.Boolean pcmsys__Has_First_Carry__c,
           java.lang.Boolean pcmsys__Has_Second_Carry__c,
           java.lang.String pcmsys__Industry__c,
           java.lang.Double pcmsys__InitialCapitalCall__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entries__r,
           com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r,
           java.lang.Boolean pcmsys__KeyManProvision__c,
           java.lang.Double pcmsys__LPPrincipalLiability__c,
           java.lang.Double pcmsys__LP_Principal_Payout_Order__c,
           java.lang.Double pcmsys__Last_Distribution_GP_Pct__c,
           java.lang.String pcmsys__LegalName__c,
           java.lang.Double pcmsys__ManagementFee__c,
           java.lang.String pcmsys__Management_Fee_Frequency__c,
           java.lang.Double pcmsys__Management_Fee_Payout_Order__c,
           java.lang.Double pcmsys__MaximumFundSize__c,
           java.lang.String pcmsys__Parent_Fund__c,
           com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Parent_Fund__r,
           java.lang.Double pcmsys__PartnersContribution__c,
           com.sforce.soap.enterprise.QueryResult pcmsys__Partnership_Fundraisings__r,
           java.lang.Double pcmsys__PayoutDefined__c,
           java.lang.Double pcmsys__PreferredDividendLiability__c,
           java.lang.Double pcmsys__Preferred_Dividend__c,
           java.util.Date pcmsys__Report_Date__c,
           java.lang.String pcmsys__RollUpAccount__c,
           java.lang.String pcmsys__SWIFT_Code__c,
           java.lang.Double pcmsys__SecondCarryGPPct__c,
           java.lang.Double pcmsys__Second_Carry__c,
           java.lang.String pcmsys__Sub_Account_Number__c,
           java.lang.String pcmsys__Sub_Account__c,
           java.lang.Double pcmsys__Total_Capital_Calls__c,
           java.lang.Double pcmsys__Total_Capital_Commitments__c,
           java.lang.String pcmsys__Unrealized_Gain__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
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
        this.pcmsys__AccountName__c = pcmsys__AccountName__c;
        this.pcmsys__AccountNumber__c = pcmsys__AccountNumber__c;
        this.pcmsys__AccountType__c = pcmsys__AccountType__c;
        this.pcmsys__Account_Number__c = pcmsys__Account_Number__c;
        this.pcmsys__Account_Value__c = pcmsys__Account_Value__c;
        this.pcmsys__Account__c = pcmsys__Account__c;
        this.pcmsys__AccruedManagementFee__c = pcmsys__AccruedManagementFee__c;
        this.pcmsys__Allocation_Method__c = pcmsys__Allocation_Method__c;
        this.pcmsys__Bank_Name__c = pcmsys__Bank_Name__c;
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
        this.pcmsys__CapitalCalls__c = pcmsys__CapitalCalls__c;
        this.pcmsys__CapitalContributions__c = pcmsys__CapitalContributions__c;
        this.pcmsys__Capital_Calls_And_Commitments1__r = pcmsys__Capital_Calls_And_Commitments1__r;
        this.pcmsys__Catchup__c = pcmsys__Catchup__c;
        this.pcmsys__ClawbackAmount__c = pcmsys__ClawbackAmount__c;
        this.pcmsys__ClawbackFrequency__c = pcmsys__ClawbackFrequency__c;
        this.pcmsys__Clawback__c = pcmsys__Clawback__c;
        this.pcmsys__ContingencyLoss__c = pcmsys__ContingencyLoss__c;
        this.pcmsys__Contributed_Capital__c = pcmsys__Contributed_Capital__c;
        this.pcmsys__Currency_Type__c = pcmsys__Currency_Type__c;
        this.pcmsys__Description__c = pcmsys__Description__c;
        this.pcmsys__Dividend_Frequency__c = pcmsys__Dividend_Frequency__c;
        this.pcmsys__Dividend_Payout_Order__c = pcmsys__Dividend_Payout_Order__c;
        this.pcmsys__FinalCarry__c = pcmsys__FinalCarry__c;
        this.pcmsys__FirstCarryGPPct__c = pcmsys__FirstCarryGPPct__c;
        this.pcmsys__First_Carry__c = pcmsys__First_Carry__c;
        this.pcmsys__FiscalYearEnd__c = pcmsys__FiscalYearEnd__c;
        this.pcmsys__FundCloseDate__c = pcmsys__FundCloseDate__c;
        this.pcmsys__FundDisolutionDate__c = pcmsys__FundDisolutionDate__c;
        this.pcmsys__FundName__c = pcmsys__FundName__c;
        this.pcmsys__FundSize__c = pcmsys__FundSize__c;
        this.pcmsys__FundTerm__c = pcmsys__FundTerm__c;
        this.pcmsys__FundType__c = pcmsys__FundType__c;
        this.pcmsys__Funds__r = pcmsys__Funds__r;
        this.pcmsys__GPPrincipalLiability__c = pcmsys__GPPrincipalLiability__c;
        this.pcmsys__GP_Principal_Payout_Order__c = pcmsys__GP_Principal_Payout_Order__c;
        this.pcmsys__General_Partners__r = pcmsys__General_Partners__r;
        this.pcmsys__Has_First_Carry__c = pcmsys__Has_First_Carry__c;
        this.pcmsys__Has_Second_Carry__c = pcmsys__Has_Second_Carry__c;
        this.pcmsys__Industry__c = pcmsys__Industry__c;
        this.pcmsys__InitialCapitalCall__c = pcmsys__InitialCapitalCall__c;
        this.pcmsys__Journal_Entries__r = pcmsys__Journal_Entries__r;
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
        this.pcmsys__KeyManProvision__c = pcmsys__KeyManProvision__c;
        this.pcmsys__LPPrincipalLiability__c = pcmsys__LPPrincipalLiability__c;
        this.pcmsys__LP_Principal_Payout_Order__c = pcmsys__LP_Principal_Payout_Order__c;
        this.pcmsys__Last_Distribution_GP_Pct__c = pcmsys__Last_Distribution_GP_Pct__c;
        this.pcmsys__LegalName__c = pcmsys__LegalName__c;
        this.pcmsys__ManagementFee__c = pcmsys__ManagementFee__c;
        this.pcmsys__Management_Fee_Frequency__c = pcmsys__Management_Fee_Frequency__c;
        this.pcmsys__Management_Fee_Payout_Order__c = pcmsys__Management_Fee_Payout_Order__c;
        this.pcmsys__MaximumFundSize__c = pcmsys__MaximumFundSize__c;
        this.pcmsys__Parent_Fund__c = pcmsys__Parent_Fund__c;
        this.pcmsys__Parent_Fund__r = pcmsys__Parent_Fund__r;
        this.pcmsys__PartnersContribution__c = pcmsys__PartnersContribution__c;
        this.pcmsys__Partnership_Fundraisings__r = pcmsys__Partnership_Fundraisings__r;
        this.pcmsys__PayoutDefined__c = pcmsys__PayoutDefined__c;
        this.pcmsys__PreferredDividendLiability__c = pcmsys__PreferredDividendLiability__c;
        this.pcmsys__Preferred_Dividend__c = pcmsys__Preferred_Dividend__c;
        this.pcmsys__Report_Date__c = pcmsys__Report_Date__c;
        this.pcmsys__RollUpAccount__c = pcmsys__RollUpAccount__c;
        this.pcmsys__SWIFT_Code__c = pcmsys__SWIFT_Code__c;
        this.pcmsys__SecondCarryGPPct__c = pcmsys__SecondCarryGPPct__c;
        this.pcmsys__Second_Carry__c = pcmsys__Second_Carry__c;
        this.pcmsys__Sub_Account_Number__c = pcmsys__Sub_Account_Number__c;
        this.pcmsys__Sub_Account__c = pcmsys__Sub_Account__c;
        this.pcmsys__Total_Capital_Calls__c = pcmsys__Total_Capital_Calls__c;
        this.pcmsys__Total_Capital_Commitments__c = pcmsys__Total_Capital_Commitments__c;
        this.pcmsys__Unrealized_Gain__c = pcmsys__Unrealized_Gain__c;
    }


    /**
     * Gets the activityHistories value for this Pcmsys__Fund__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Pcmsys__Fund__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Pcmsys__Fund__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Pcmsys__Fund__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Pcmsys__Fund__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Pcmsys__Fund__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Pcmsys__Fund__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Pcmsys__Fund__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Pcmsys__Fund__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Pcmsys__Fund__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this Pcmsys__Fund__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this Pcmsys__Fund__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this Pcmsys__Fund__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Pcmsys__Fund__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Pcmsys__Fund__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Pcmsys__Fund__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Pcmsys__Fund__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Pcmsys__Fund__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Pcmsys__Fund__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Pcmsys__Fund__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Pcmsys__Fund__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Pcmsys__Fund__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Pcmsys__Fund__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Pcmsys__Fund__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Pcmsys__Fund__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Pcmsys__Fund__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Pcmsys__Fund__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Pcmsys__Fund__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Pcmsys__Fund__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Pcmsys__Fund__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Pcmsys__Fund__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Pcmsys__Fund__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Pcmsys__Fund__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Pcmsys__Fund__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Pcmsys__Fund__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Pcmsys__Fund__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Pcmsys__Fund__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Pcmsys__Fund__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Pcmsys__Fund__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Pcmsys__Fund__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Pcmsys__Fund__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Pcmsys__Fund__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Pcmsys__Fund__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Pcmsys__Fund__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Pcmsys__Fund__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Pcmsys__Fund__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Pcmsys__Fund__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Pcmsys__Fund__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the pcmsys__AccountName__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__AccountName__c
     */
    public java.lang.String getPcmsys__AccountName__c() {
        return pcmsys__AccountName__c;
    }


    /**
     * Sets the pcmsys__AccountName__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__AccountName__c
     */
    public void setPcmsys__AccountName__c(java.lang.String pcmsys__AccountName__c) {
        this.pcmsys__AccountName__c = pcmsys__AccountName__c;
    }


    /**
     * Gets the pcmsys__AccountNumber__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__AccountNumber__c
     */
    public java.lang.String getPcmsys__AccountNumber__c() {
        return pcmsys__AccountNumber__c;
    }


    /**
     * Sets the pcmsys__AccountNumber__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__AccountNumber__c
     */
    public void setPcmsys__AccountNumber__c(java.lang.String pcmsys__AccountNumber__c) {
        this.pcmsys__AccountNumber__c = pcmsys__AccountNumber__c;
    }


    /**
     * Gets the pcmsys__AccountType__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__AccountType__c
     */
    public java.lang.String getPcmsys__AccountType__c() {
        return pcmsys__AccountType__c;
    }


    /**
     * Sets the pcmsys__AccountType__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__AccountType__c
     */
    public void setPcmsys__AccountType__c(java.lang.String pcmsys__AccountType__c) {
        this.pcmsys__AccountType__c = pcmsys__AccountType__c;
    }


    /**
     * Gets the pcmsys__Account_Number__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Account_Number__c
     */
    public java.lang.String getPcmsys__Account_Number__c() {
        return pcmsys__Account_Number__c;
    }


    /**
     * Sets the pcmsys__Account_Number__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Account_Number__c
     */
    public void setPcmsys__Account_Number__c(java.lang.String pcmsys__Account_Number__c) {
        this.pcmsys__Account_Number__c = pcmsys__Account_Number__c;
    }


    /**
     * Gets the pcmsys__Account_Value__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Account_Value__c
     */
    public java.lang.Double getPcmsys__Account_Value__c() {
        return pcmsys__Account_Value__c;
    }


    /**
     * Sets the pcmsys__Account_Value__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Account_Value__c
     */
    public void setPcmsys__Account_Value__c(java.lang.Double pcmsys__Account_Value__c) {
        this.pcmsys__Account_Value__c = pcmsys__Account_Value__c;
    }


    /**
     * Gets the pcmsys__Account__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Account__c
     */
    public java.lang.String getPcmsys__Account__c() {
        return pcmsys__Account__c;
    }


    /**
     * Sets the pcmsys__Account__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Account__c
     */
    public void setPcmsys__Account__c(java.lang.String pcmsys__Account__c) {
        this.pcmsys__Account__c = pcmsys__Account__c;
    }


    /**
     * Gets the pcmsys__AccruedManagementFee__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__AccruedManagementFee__c
     */
    public java.lang.Double getPcmsys__AccruedManagementFee__c() {
        return pcmsys__AccruedManagementFee__c;
    }


    /**
     * Sets the pcmsys__AccruedManagementFee__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__AccruedManagementFee__c
     */
    public void setPcmsys__AccruedManagementFee__c(java.lang.Double pcmsys__AccruedManagementFee__c) {
        this.pcmsys__AccruedManagementFee__c = pcmsys__AccruedManagementFee__c;
    }


    /**
     * Gets the pcmsys__Allocation_Method__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Allocation_Method__c
     */
    public java.lang.String getPcmsys__Allocation_Method__c() {
        return pcmsys__Allocation_Method__c;
    }


    /**
     * Sets the pcmsys__Allocation_Method__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Allocation_Method__c
     */
    public void setPcmsys__Allocation_Method__c(java.lang.String pcmsys__Allocation_Method__c) {
        this.pcmsys__Allocation_Method__c = pcmsys__Allocation_Method__c;
    }


    /**
     * Gets the pcmsys__Bank_Name__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Bank_Name__c
     */
    public java.lang.String getPcmsys__Bank_Name__c() {
        return pcmsys__Bank_Name__c;
    }


    /**
     * Sets the pcmsys__Bank_Name__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Bank_Name__c
     */
    public void setPcmsys__Bank_Name__c(java.lang.String pcmsys__Bank_Name__c) {
        this.pcmsys__Bank_Name__c = pcmsys__Bank_Name__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__CapManRegisteredName__c
     */
    public java.lang.String getPcmsys__CapManRegisteredName__c() {
        return pcmsys__CapManRegisteredName__c;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__CapManRegisteredName__c
     */
    public void setPcmsys__CapManRegisteredName__c(java.lang.String pcmsys__CapManRegisteredName__c) {
        this.pcmsys__CapManRegisteredName__c = pcmsys__CapManRegisteredName__c;
    }


    /**
     * Gets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__CapManRegisteredName__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getPcmsys__CapManRegisteredName__r() {
        return pcmsys__CapManRegisteredName__r;
    }


    /**
     * Sets the pcmsys__CapManRegisteredName__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__CapManRegisteredName__r
     */
    public void setPcmsys__CapManRegisteredName__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c pcmsys__CapManRegisteredName__r) {
        this.pcmsys__CapManRegisteredName__r = pcmsys__CapManRegisteredName__r;
    }


    /**
     * Gets the pcmsys__CapitalCalls__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__CapitalCalls__c
     */
    public java.lang.Double getPcmsys__CapitalCalls__c() {
        return pcmsys__CapitalCalls__c;
    }


    /**
     * Sets the pcmsys__CapitalCalls__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__CapitalCalls__c
     */
    public void setPcmsys__CapitalCalls__c(java.lang.Double pcmsys__CapitalCalls__c) {
        this.pcmsys__CapitalCalls__c = pcmsys__CapitalCalls__c;
    }


    /**
     * Gets the pcmsys__CapitalContributions__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__CapitalContributions__c
     */
    public java.lang.Double getPcmsys__CapitalContributions__c() {
        return pcmsys__CapitalContributions__c;
    }


    /**
     * Sets the pcmsys__CapitalContributions__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__CapitalContributions__c
     */
    public void setPcmsys__CapitalContributions__c(java.lang.Double pcmsys__CapitalContributions__c) {
        this.pcmsys__CapitalContributions__c = pcmsys__CapitalContributions__c;
    }


    /**
     * Gets the pcmsys__Capital_Calls_And_Commitments1__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Capital_Calls_And_Commitments1__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Capital_Calls_And_Commitments1__r() {
        return pcmsys__Capital_Calls_And_Commitments1__r;
    }


    /**
     * Sets the pcmsys__Capital_Calls_And_Commitments1__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Capital_Calls_And_Commitments1__r
     */
    public void setPcmsys__Capital_Calls_And_Commitments1__r(com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Calls_And_Commitments1__r) {
        this.pcmsys__Capital_Calls_And_Commitments1__r = pcmsys__Capital_Calls_And_Commitments1__r;
    }


    /**
     * Gets the pcmsys__Catchup__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Catchup__c
     */
    public java.lang.Double getPcmsys__Catchup__c() {
        return pcmsys__Catchup__c;
    }


    /**
     * Sets the pcmsys__Catchup__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Catchup__c
     */
    public void setPcmsys__Catchup__c(java.lang.Double pcmsys__Catchup__c) {
        this.pcmsys__Catchup__c = pcmsys__Catchup__c;
    }


    /**
     * Gets the pcmsys__ClawbackAmount__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__ClawbackAmount__c
     */
    public java.lang.Double getPcmsys__ClawbackAmount__c() {
        return pcmsys__ClawbackAmount__c;
    }


    /**
     * Sets the pcmsys__ClawbackAmount__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__ClawbackAmount__c
     */
    public void setPcmsys__ClawbackAmount__c(java.lang.Double pcmsys__ClawbackAmount__c) {
        this.pcmsys__ClawbackAmount__c = pcmsys__ClawbackAmount__c;
    }


    /**
     * Gets the pcmsys__ClawbackFrequency__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__ClawbackFrequency__c
     */
    public java.lang.String getPcmsys__ClawbackFrequency__c() {
        return pcmsys__ClawbackFrequency__c;
    }


    /**
     * Sets the pcmsys__ClawbackFrequency__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__ClawbackFrequency__c
     */
    public void setPcmsys__ClawbackFrequency__c(java.lang.String pcmsys__ClawbackFrequency__c) {
        this.pcmsys__ClawbackFrequency__c = pcmsys__ClawbackFrequency__c;
    }


    /**
     * Gets the pcmsys__Clawback__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Clawback__c
     */
    public java.lang.Double getPcmsys__Clawback__c() {
        return pcmsys__Clawback__c;
    }


    /**
     * Sets the pcmsys__Clawback__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Clawback__c
     */
    public void setPcmsys__Clawback__c(java.lang.Double pcmsys__Clawback__c) {
        this.pcmsys__Clawback__c = pcmsys__Clawback__c;
    }


    /**
     * Gets the pcmsys__ContingencyLoss__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__ContingencyLoss__c
     */
    public java.lang.Double getPcmsys__ContingencyLoss__c() {
        return pcmsys__ContingencyLoss__c;
    }


    /**
     * Sets the pcmsys__ContingencyLoss__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__ContingencyLoss__c
     */
    public void setPcmsys__ContingencyLoss__c(java.lang.Double pcmsys__ContingencyLoss__c) {
        this.pcmsys__ContingencyLoss__c = pcmsys__ContingencyLoss__c;
    }


    /**
     * Gets the pcmsys__Contributed_Capital__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Contributed_Capital__c
     */
    public java.lang.Double getPcmsys__Contributed_Capital__c() {
        return pcmsys__Contributed_Capital__c;
    }


    /**
     * Sets the pcmsys__Contributed_Capital__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Contributed_Capital__c
     */
    public void setPcmsys__Contributed_Capital__c(java.lang.Double pcmsys__Contributed_Capital__c) {
        this.pcmsys__Contributed_Capital__c = pcmsys__Contributed_Capital__c;
    }


    /**
     * Gets the pcmsys__Currency_Type__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Currency_Type__c
     */
    public java.lang.String getPcmsys__Currency_Type__c() {
        return pcmsys__Currency_Type__c;
    }


    /**
     * Sets the pcmsys__Currency_Type__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Currency_Type__c
     */
    public void setPcmsys__Currency_Type__c(java.lang.String pcmsys__Currency_Type__c) {
        this.pcmsys__Currency_Type__c = pcmsys__Currency_Type__c;
    }


    /**
     * Gets the pcmsys__Description__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Description__c
     */
    public java.lang.String getPcmsys__Description__c() {
        return pcmsys__Description__c;
    }


    /**
     * Sets the pcmsys__Description__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Description__c
     */
    public void setPcmsys__Description__c(java.lang.String pcmsys__Description__c) {
        this.pcmsys__Description__c = pcmsys__Description__c;
    }


    /**
     * Gets the pcmsys__Dividend_Frequency__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Dividend_Frequency__c
     */
    public java.lang.String getPcmsys__Dividend_Frequency__c() {
        return pcmsys__Dividend_Frequency__c;
    }


    /**
     * Sets the pcmsys__Dividend_Frequency__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Dividend_Frequency__c
     */
    public void setPcmsys__Dividend_Frequency__c(java.lang.String pcmsys__Dividend_Frequency__c) {
        this.pcmsys__Dividend_Frequency__c = pcmsys__Dividend_Frequency__c;
    }


    /**
     * Gets the pcmsys__Dividend_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Dividend_Payout_Order__c
     */
    public java.lang.Double getPcmsys__Dividend_Payout_Order__c() {
        return pcmsys__Dividend_Payout_Order__c;
    }


    /**
     * Sets the pcmsys__Dividend_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Dividend_Payout_Order__c
     */
    public void setPcmsys__Dividend_Payout_Order__c(java.lang.Double pcmsys__Dividend_Payout_Order__c) {
        this.pcmsys__Dividend_Payout_Order__c = pcmsys__Dividend_Payout_Order__c;
    }


    /**
     * Gets the pcmsys__FinalCarry__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FinalCarry__c
     */
    public java.lang.Double getPcmsys__FinalCarry__c() {
        return pcmsys__FinalCarry__c;
    }


    /**
     * Sets the pcmsys__FinalCarry__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FinalCarry__c
     */
    public void setPcmsys__FinalCarry__c(java.lang.Double pcmsys__FinalCarry__c) {
        this.pcmsys__FinalCarry__c = pcmsys__FinalCarry__c;
    }


    /**
     * Gets the pcmsys__FirstCarryGPPct__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FirstCarryGPPct__c
     */
    public java.lang.Double getPcmsys__FirstCarryGPPct__c() {
        return pcmsys__FirstCarryGPPct__c;
    }


    /**
     * Sets the pcmsys__FirstCarryGPPct__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FirstCarryGPPct__c
     */
    public void setPcmsys__FirstCarryGPPct__c(java.lang.Double pcmsys__FirstCarryGPPct__c) {
        this.pcmsys__FirstCarryGPPct__c = pcmsys__FirstCarryGPPct__c;
    }


    /**
     * Gets the pcmsys__First_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__First_Carry__c
     */
    public java.lang.Double getPcmsys__First_Carry__c() {
        return pcmsys__First_Carry__c;
    }


    /**
     * Sets the pcmsys__First_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__First_Carry__c
     */
    public void setPcmsys__First_Carry__c(java.lang.Double pcmsys__First_Carry__c) {
        this.pcmsys__First_Carry__c = pcmsys__First_Carry__c;
    }


    /**
     * Gets the pcmsys__FiscalYearEnd__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FiscalYearEnd__c
     */
    public java.util.Date getPcmsys__FiscalYearEnd__c() {
        return pcmsys__FiscalYearEnd__c;
    }


    /**
     * Sets the pcmsys__FiscalYearEnd__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FiscalYearEnd__c
     */
    public void setPcmsys__FiscalYearEnd__c(java.util.Date pcmsys__FiscalYearEnd__c) {
        this.pcmsys__FiscalYearEnd__c = pcmsys__FiscalYearEnd__c;
    }


    /**
     * Gets the pcmsys__FundCloseDate__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FundCloseDate__c
     */
    public java.util.Date getPcmsys__FundCloseDate__c() {
        return pcmsys__FundCloseDate__c;
    }


    /**
     * Sets the pcmsys__FundCloseDate__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FundCloseDate__c
     */
    public void setPcmsys__FundCloseDate__c(java.util.Date pcmsys__FundCloseDate__c) {
        this.pcmsys__FundCloseDate__c = pcmsys__FundCloseDate__c;
    }


    /**
     * Gets the pcmsys__FundDisolutionDate__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FundDisolutionDate__c
     */
    public java.util.Date getPcmsys__FundDisolutionDate__c() {
        return pcmsys__FundDisolutionDate__c;
    }


    /**
     * Sets the pcmsys__FundDisolutionDate__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FundDisolutionDate__c
     */
    public void setPcmsys__FundDisolutionDate__c(java.util.Date pcmsys__FundDisolutionDate__c) {
        this.pcmsys__FundDisolutionDate__c = pcmsys__FundDisolutionDate__c;
    }


    /**
     * Gets the pcmsys__FundName__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FundName__c
     */
    public java.lang.String getPcmsys__FundName__c() {
        return pcmsys__FundName__c;
    }


    /**
     * Sets the pcmsys__FundName__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FundName__c
     */
    public void setPcmsys__FundName__c(java.lang.String pcmsys__FundName__c) {
        this.pcmsys__FundName__c = pcmsys__FundName__c;
    }


    /**
     * Gets the pcmsys__FundSize__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FundSize__c
     */
    public java.lang.Double getPcmsys__FundSize__c() {
        return pcmsys__FundSize__c;
    }


    /**
     * Sets the pcmsys__FundSize__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FundSize__c
     */
    public void setPcmsys__FundSize__c(java.lang.Double pcmsys__FundSize__c) {
        this.pcmsys__FundSize__c = pcmsys__FundSize__c;
    }


    /**
     * Gets the pcmsys__FundTerm__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FundTerm__c
     */
    public java.lang.Double getPcmsys__FundTerm__c() {
        return pcmsys__FundTerm__c;
    }


    /**
     * Sets the pcmsys__FundTerm__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FundTerm__c
     */
    public void setPcmsys__FundTerm__c(java.lang.Double pcmsys__FundTerm__c) {
        this.pcmsys__FundTerm__c = pcmsys__FundTerm__c;
    }


    /**
     * Gets the pcmsys__FundType__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__FundType__c
     */
    public java.lang.String getPcmsys__FundType__c() {
        return pcmsys__FundType__c;
    }


    /**
     * Sets the pcmsys__FundType__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__FundType__c
     */
    public void setPcmsys__FundType__c(java.lang.String pcmsys__FundType__c) {
        this.pcmsys__FundType__c = pcmsys__FundType__c;
    }


    /**
     * Gets the pcmsys__Funds__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Funds__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Funds__r() {
        return pcmsys__Funds__r;
    }


    /**
     * Sets the pcmsys__Funds__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Funds__r
     */
    public void setPcmsys__Funds__r(com.sforce.soap.enterprise.QueryResult pcmsys__Funds__r) {
        this.pcmsys__Funds__r = pcmsys__Funds__r;
    }


    /**
     * Gets the pcmsys__GPPrincipalLiability__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__GPPrincipalLiability__c
     */
    public java.lang.Double getPcmsys__GPPrincipalLiability__c() {
        return pcmsys__GPPrincipalLiability__c;
    }


    /**
     * Sets the pcmsys__GPPrincipalLiability__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__GPPrincipalLiability__c
     */
    public void setPcmsys__GPPrincipalLiability__c(java.lang.Double pcmsys__GPPrincipalLiability__c) {
        this.pcmsys__GPPrincipalLiability__c = pcmsys__GPPrincipalLiability__c;
    }


    /**
     * Gets the pcmsys__GP_Principal_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__GP_Principal_Payout_Order__c
     */
    public java.lang.Double getPcmsys__GP_Principal_Payout_Order__c() {
        return pcmsys__GP_Principal_Payout_Order__c;
    }


    /**
     * Sets the pcmsys__GP_Principal_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__GP_Principal_Payout_Order__c
     */
    public void setPcmsys__GP_Principal_Payout_Order__c(java.lang.Double pcmsys__GP_Principal_Payout_Order__c) {
        this.pcmsys__GP_Principal_Payout_Order__c = pcmsys__GP_Principal_Payout_Order__c;
    }


    /**
     * Gets the pcmsys__General_Partners__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__General_Partners__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__General_Partners__r() {
        return pcmsys__General_Partners__r;
    }


    /**
     * Sets the pcmsys__General_Partners__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__General_Partners__r
     */
    public void setPcmsys__General_Partners__r(com.sforce.soap.enterprise.QueryResult pcmsys__General_Partners__r) {
        this.pcmsys__General_Partners__r = pcmsys__General_Partners__r;
    }


    /**
     * Gets the pcmsys__Has_First_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Has_First_Carry__c
     */
    public java.lang.Boolean getPcmsys__Has_First_Carry__c() {
        return pcmsys__Has_First_Carry__c;
    }


    /**
     * Sets the pcmsys__Has_First_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Has_First_Carry__c
     */
    public void setPcmsys__Has_First_Carry__c(java.lang.Boolean pcmsys__Has_First_Carry__c) {
        this.pcmsys__Has_First_Carry__c = pcmsys__Has_First_Carry__c;
    }


    /**
     * Gets the pcmsys__Has_Second_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Has_Second_Carry__c
     */
    public java.lang.Boolean getPcmsys__Has_Second_Carry__c() {
        return pcmsys__Has_Second_Carry__c;
    }


    /**
     * Sets the pcmsys__Has_Second_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Has_Second_Carry__c
     */
    public void setPcmsys__Has_Second_Carry__c(java.lang.Boolean pcmsys__Has_Second_Carry__c) {
        this.pcmsys__Has_Second_Carry__c = pcmsys__Has_Second_Carry__c;
    }


    /**
     * Gets the pcmsys__Industry__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Industry__c
     */
    public java.lang.String getPcmsys__Industry__c() {
        return pcmsys__Industry__c;
    }


    /**
     * Sets the pcmsys__Industry__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Industry__c
     */
    public void setPcmsys__Industry__c(java.lang.String pcmsys__Industry__c) {
        this.pcmsys__Industry__c = pcmsys__Industry__c;
    }


    /**
     * Gets the pcmsys__InitialCapitalCall__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__InitialCapitalCall__c
     */
    public java.lang.Double getPcmsys__InitialCapitalCall__c() {
        return pcmsys__InitialCapitalCall__c;
    }


    /**
     * Sets the pcmsys__InitialCapitalCall__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__InitialCapitalCall__c
     */
    public void setPcmsys__InitialCapitalCall__c(java.lang.Double pcmsys__InitialCapitalCall__c) {
        this.pcmsys__InitialCapitalCall__c = pcmsys__InitialCapitalCall__c;
    }


    /**
     * Gets the pcmsys__Journal_Entries__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Journal_Entries__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Journal_Entries__r() {
        return pcmsys__Journal_Entries__r;
    }


    /**
     * Sets the pcmsys__Journal_Entries__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Journal_Entries__r
     */
    public void setPcmsys__Journal_Entries__r(com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entries__r) {
        this.pcmsys__Journal_Entries__r = pcmsys__Journal_Entries__r;
    }


    /**
     * Gets the pcmsys__Journal_Entry_Items__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Journal_Entry_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Journal_Entry_Items__r() {
        return pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Sets the pcmsys__Journal_Entry_Items__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Journal_Entry_Items__r
     */
    public void setPcmsys__Journal_Entry_Items__r(com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r) {
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Gets the pcmsys__KeyManProvision__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__KeyManProvision__c
     */
    public java.lang.Boolean getPcmsys__KeyManProvision__c() {
        return pcmsys__KeyManProvision__c;
    }


    /**
     * Sets the pcmsys__KeyManProvision__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__KeyManProvision__c
     */
    public void setPcmsys__KeyManProvision__c(java.lang.Boolean pcmsys__KeyManProvision__c) {
        this.pcmsys__KeyManProvision__c = pcmsys__KeyManProvision__c;
    }


    /**
     * Gets the pcmsys__LPPrincipalLiability__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__LPPrincipalLiability__c
     */
    public java.lang.Double getPcmsys__LPPrincipalLiability__c() {
        return pcmsys__LPPrincipalLiability__c;
    }


    /**
     * Sets the pcmsys__LPPrincipalLiability__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__LPPrincipalLiability__c
     */
    public void setPcmsys__LPPrincipalLiability__c(java.lang.Double pcmsys__LPPrincipalLiability__c) {
        this.pcmsys__LPPrincipalLiability__c = pcmsys__LPPrincipalLiability__c;
    }


    /**
     * Gets the pcmsys__LP_Principal_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__LP_Principal_Payout_Order__c
     */
    public java.lang.Double getPcmsys__LP_Principal_Payout_Order__c() {
        return pcmsys__LP_Principal_Payout_Order__c;
    }


    /**
     * Sets the pcmsys__LP_Principal_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__LP_Principal_Payout_Order__c
     */
    public void setPcmsys__LP_Principal_Payout_Order__c(java.lang.Double pcmsys__LP_Principal_Payout_Order__c) {
        this.pcmsys__LP_Principal_Payout_Order__c = pcmsys__LP_Principal_Payout_Order__c;
    }


    /**
     * Gets the pcmsys__Last_Distribution_GP_Pct__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Last_Distribution_GP_Pct__c
     */
    public java.lang.Double getPcmsys__Last_Distribution_GP_Pct__c() {
        return pcmsys__Last_Distribution_GP_Pct__c;
    }


    /**
     * Sets the pcmsys__Last_Distribution_GP_Pct__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Last_Distribution_GP_Pct__c
     */
    public void setPcmsys__Last_Distribution_GP_Pct__c(java.lang.Double pcmsys__Last_Distribution_GP_Pct__c) {
        this.pcmsys__Last_Distribution_GP_Pct__c = pcmsys__Last_Distribution_GP_Pct__c;
    }


    /**
     * Gets the pcmsys__LegalName__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__LegalName__c
     */
    public java.lang.String getPcmsys__LegalName__c() {
        return pcmsys__LegalName__c;
    }


    /**
     * Sets the pcmsys__LegalName__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__LegalName__c
     */
    public void setPcmsys__LegalName__c(java.lang.String pcmsys__LegalName__c) {
        this.pcmsys__LegalName__c = pcmsys__LegalName__c;
    }


    /**
     * Gets the pcmsys__ManagementFee__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__ManagementFee__c
     */
    public java.lang.Double getPcmsys__ManagementFee__c() {
        return pcmsys__ManagementFee__c;
    }


    /**
     * Sets the pcmsys__ManagementFee__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__ManagementFee__c
     */
    public void setPcmsys__ManagementFee__c(java.lang.Double pcmsys__ManagementFee__c) {
        this.pcmsys__ManagementFee__c = pcmsys__ManagementFee__c;
    }


    /**
     * Gets the pcmsys__Management_Fee_Frequency__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Management_Fee_Frequency__c
     */
    public java.lang.String getPcmsys__Management_Fee_Frequency__c() {
        return pcmsys__Management_Fee_Frequency__c;
    }


    /**
     * Sets the pcmsys__Management_Fee_Frequency__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Management_Fee_Frequency__c
     */
    public void setPcmsys__Management_Fee_Frequency__c(java.lang.String pcmsys__Management_Fee_Frequency__c) {
        this.pcmsys__Management_Fee_Frequency__c = pcmsys__Management_Fee_Frequency__c;
    }


    /**
     * Gets the pcmsys__Management_Fee_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Management_Fee_Payout_Order__c
     */
    public java.lang.Double getPcmsys__Management_Fee_Payout_Order__c() {
        return pcmsys__Management_Fee_Payout_Order__c;
    }


    /**
     * Sets the pcmsys__Management_Fee_Payout_Order__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Management_Fee_Payout_Order__c
     */
    public void setPcmsys__Management_Fee_Payout_Order__c(java.lang.Double pcmsys__Management_Fee_Payout_Order__c) {
        this.pcmsys__Management_Fee_Payout_Order__c = pcmsys__Management_Fee_Payout_Order__c;
    }


    /**
     * Gets the pcmsys__MaximumFundSize__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__MaximumFundSize__c
     */
    public java.lang.Double getPcmsys__MaximumFundSize__c() {
        return pcmsys__MaximumFundSize__c;
    }


    /**
     * Sets the pcmsys__MaximumFundSize__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__MaximumFundSize__c
     */
    public void setPcmsys__MaximumFundSize__c(java.lang.Double pcmsys__MaximumFundSize__c) {
        this.pcmsys__MaximumFundSize__c = pcmsys__MaximumFundSize__c;
    }


    /**
     * Gets the pcmsys__Parent_Fund__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Parent_Fund__c
     */
    public java.lang.String getPcmsys__Parent_Fund__c() {
        return pcmsys__Parent_Fund__c;
    }


    /**
     * Sets the pcmsys__Parent_Fund__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Parent_Fund__c
     */
    public void setPcmsys__Parent_Fund__c(java.lang.String pcmsys__Parent_Fund__c) {
        this.pcmsys__Parent_Fund__c = pcmsys__Parent_Fund__c;
    }


    /**
     * Gets the pcmsys__Parent_Fund__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Parent_Fund__r
     */
    public com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c getPcmsys__Parent_Fund__r() {
        return pcmsys__Parent_Fund__r;
    }


    /**
     * Sets the pcmsys__Parent_Fund__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Parent_Fund__r
     */
    public void setPcmsys__Parent_Fund__r(com.sforce.soap.enterprise.sobject.Pcmsys__Fund__c pcmsys__Parent_Fund__r) {
        this.pcmsys__Parent_Fund__r = pcmsys__Parent_Fund__r;
    }


    /**
     * Gets the pcmsys__PartnersContribution__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__PartnersContribution__c
     */
    public java.lang.Double getPcmsys__PartnersContribution__c() {
        return pcmsys__PartnersContribution__c;
    }


    /**
     * Sets the pcmsys__PartnersContribution__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__PartnersContribution__c
     */
    public void setPcmsys__PartnersContribution__c(java.lang.Double pcmsys__PartnersContribution__c) {
        this.pcmsys__PartnersContribution__c = pcmsys__PartnersContribution__c;
    }


    /**
     * Gets the pcmsys__Partnership_Fundraisings__r value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Partnership_Fundraisings__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Partnership_Fundraisings__r() {
        return pcmsys__Partnership_Fundraisings__r;
    }


    /**
     * Sets the pcmsys__Partnership_Fundraisings__r value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Partnership_Fundraisings__r
     */
    public void setPcmsys__Partnership_Fundraisings__r(com.sforce.soap.enterprise.QueryResult pcmsys__Partnership_Fundraisings__r) {
        this.pcmsys__Partnership_Fundraisings__r = pcmsys__Partnership_Fundraisings__r;
    }


    /**
     * Gets the pcmsys__PayoutDefined__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__PayoutDefined__c
     */
    public java.lang.Double getPcmsys__PayoutDefined__c() {
        return pcmsys__PayoutDefined__c;
    }


    /**
     * Sets the pcmsys__PayoutDefined__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__PayoutDefined__c
     */
    public void setPcmsys__PayoutDefined__c(java.lang.Double pcmsys__PayoutDefined__c) {
        this.pcmsys__PayoutDefined__c = pcmsys__PayoutDefined__c;
    }


    /**
     * Gets the pcmsys__PreferredDividendLiability__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__PreferredDividendLiability__c
     */
    public java.lang.Double getPcmsys__PreferredDividendLiability__c() {
        return pcmsys__PreferredDividendLiability__c;
    }


    /**
     * Sets the pcmsys__PreferredDividendLiability__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__PreferredDividendLiability__c
     */
    public void setPcmsys__PreferredDividendLiability__c(java.lang.Double pcmsys__PreferredDividendLiability__c) {
        this.pcmsys__PreferredDividendLiability__c = pcmsys__PreferredDividendLiability__c;
    }


    /**
     * Gets the pcmsys__Preferred_Dividend__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Preferred_Dividend__c
     */
    public java.lang.Double getPcmsys__Preferred_Dividend__c() {
        return pcmsys__Preferred_Dividend__c;
    }


    /**
     * Sets the pcmsys__Preferred_Dividend__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Preferred_Dividend__c
     */
    public void setPcmsys__Preferred_Dividend__c(java.lang.Double pcmsys__Preferred_Dividend__c) {
        this.pcmsys__Preferred_Dividend__c = pcmsys__Preferred_Dividend__c;
    }


    /**
     * Gets the pcmsys__Report_Date__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Report_Date__c
     */
    public java.util.Date getPcmsys__Report_Date__c() {
        return pcmsys__Report_Date__c;
    }


    /**
     * Sets the pcmsys__Report_Date__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Report_Date__c
     */
    public void setPcmsys__Report_Date__c(java.util.Date pcmsys__Report_Date__c) {
        this.pcmsys__Report_Date__c = pcmsys__Report_Date__c;
    }


    /**
     * Gets the pcmsys__RollUpAccount__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__RollUpAccount__c
     */
    public java.lang.String getPcmsys__RollUpAccount__c() {
        return pcmsys__RollUpAccount__c;
    }


    /**
     * Sets the pcmsys__RollUpAccount__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__RollUpAccount__c
     */
    public void setPcmsys__RollUpAccount__c(java.lang.String pcmsys__RollUpAccount__c) {
        this.pcmsys__RollUpAccount__c = pcmsys__RollUpAccount__c;
    }


    /**
     * Gets the pcmsys__SWIFT_Code__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__SWIFT_Code__c
     */
    public java.lang.String getPcmsys__SWIFT_Code__c() {
        return pcmsys__SWIFT_Code__c;
    }


    /**
     * Sets the pcmsys__SWIFT_Code__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__SWIFT_Code__c
     */
    public void setPcmsys__SWIFT_Code__c(java.lang.String pcmsys__SWIFT_Code__c) {
        this.pcmsys__SWIFT_Code__c = pcmsys__SWIFT_Code__c;
    }


    /**
     * Gets the pcmsys__SecondCarryGPPct__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__SecondCarryGPPct__c
     */
    public java.lang.Double getPcmsys__SecondCarryGPPct__c() {
        return pcmsys__SecondCarryGPPct__c;
    }


    /**
     * Sets the pcmsys__SecondCarryGPPct__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__SecondCarryGPPct__c
     */
    public void setPcmsys__SecondCarryGPPct__c(java.lang.Double pcmsys__SecondCarryGPPct__c) {
        this.pcmsys__SecondCarryGPPct__c = pcmsys__SecondCarryGPPct__c;
    }


    /**
     * Gets the pcmsys__Second_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Second_Carry__c
     */
    public java.lang.Double getPcmsys__Second_Carry__c() {
        return pcmsys__Second_Carry__c;
    }


    /**
     * Sets the pcmsys__Second_Carry__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Second_Carry__c
     */
    public void setPcmsys__Second_Carry__c(java.lang.Double pcmsys__Second_Carry__c) {
        this.pcmsys__Second_Carry__c = pcmsys__Second_Carry__c;
    }


    /**
     * Gets the pcmsys__Sub_Account_Number__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Sub_Account_Number__c
     */
    public java.lang.String getPcmsys__Sub_Account_Number__c() {
        return pcmsys__Sub_Account_Number__c;
    }


    /**
     * Sets the pcmsys__Sub_Account_Number__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Sub_Account_Number__c
     */
    public void setPcmsys__Sub_Account_Number__c(java.lang.String pcmsys__Sub_Account_Number__c) {
        this.pcmsys__Sub_Account_Number__c = pcmsys__Sub_Account_Number__c;
    }


    /**
     * Gets the pcmsys__Sub_Account__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Sub_Account__c
     */
    public java.lang.String getPcmsys__Sub_Account__c() {
        return pcmsys__Sub_Account__c;
    }


    /**
     * Sets the pcmsys__Sub_Account__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Sub_Account__c
     */
    public void setPcmsys__Sub_Account__c(java.lang.String pcmsys__Sub_Account__c) {
        this.pcmsys__Sub_Account__c = pcmsys__Sub_Account__c;
    }


    /**
     * Gets the pcmsys__Total_Capital_Calls__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Total_Capital_Calls__c
     */
    public java.lang.Double getPcmsys__Total_Capital_Calls__c() {
        return pcmsys__Total_Capital_Calls__c;
    }


    /**
     * Sets the pcmsys__Total_Capital_Calls__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Total_Capital_Calls__c
     */
    public void setPcmsys__Total_Capital_Calls__c(java.lang.Double pcmsys__Total_Capital_Calls__c) {
        this.pcmsys__Total_Capital_Calls__c = pcmsys__Total_Capital_Calls__c;
    }


    /**
     * Gets the pcmsys__Total_Capital_Commitments__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Total_Capital_Commitments__c
     */
    public java.lang.Double getPcmsys__Total_Capital_Commitments__c() {
        return pcmsys__Total_Capital_Commitments__c;
    }


    /**
     * Sets the pcmsys__Total_Capital_Commitments__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Total_Capital_Commitments__c
     */
    public void setPcmsys__Total_Capital_Commitments__c(java.lang.Double pcmsys__Total_Capital_Commitments__c) {
        this.pcmsys__Total_Capital_Commitments__c = pcmsys__Total_Capital_Commitments__c;
    }


    /**
     * Gets the pcmsys__Unrealized_Gain__c value for this Pcmsys__Fund__c.
     * 
     * @return pcmsys__Unrealized_Gain__c
     */
    public java.lang.String getPcmsys__Unrealized_Gain__c() {
        return pcmsys__Unrealized_Gain__c;
    }


    /**
     * Sets the pcmsys__Unrealized_Gain__c value for this Pcmsys__Fund__c.
     * 
     * @param pcmsys__Unrealized_Gain__c
     */
    public void setPcmsys__Unrealized_Gain__c(java.lang.String pcmsys__Unrealized_Gain__c) {
        this.pcmsys__Unrealized_Gain__c = pcmsys__Unrealized_Gain__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pcmsys__Fund__c)) return false;
        Pcmsys__Fund__c other = (Pcmsys__Fund__c) obj;
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
              this.tasks.equals(other.getTasks()))) &&
            ((this.pcmsys__AccountName__c==null && other.getPcmsys__AccountName__c()==null) || 
             (this.pcmsys__AccountName__c!=null &&
              this.pcmsys__AccountName__c.equals(other.getPcmsys__AccountName__c()))) &&
            ((this.pcmsys__AccountNumber__c==null && other.getPcmsys__AccountNumber__c()==null) || 
             (this.pcmsys__AccountNumber__c!=null &&
              this.pcmsys__AccountNumber__c.equals(other.getPcmsys__AccountNumber__c()))) &&
            ((this.pcmsys__AccountType__c==null && other.getPcmsys__AccountType__c()==null) || 
             (this.pcmsys__AccountType__c!=null &&
              this.pcmsys__AccountType__c.equals(other.getPcmsys__AccountType__c()))) &&
            ((this.pcmsys__Account_Number__c==null && other.getPcmsys__Account_Number__c()==null) || 
             (this.pcmsys__Account_Number__c!=null &&
              this.pcmsys__Account_Number__c.equals(other.getPcmsys__Account_Number__c()))) &&
            ((this.pcmsys__Account_Value__c==null && other.getPcmsys__Account_Value__c()==null) || 
             (this.pcmsys__Account_Value__c!=null &&
              this.pcmsys__Account_Value__c.equals(other.getPcmsys__Account_Value__c()))) &&
            ((this.pcmsys__Account__c==null && other.getPcmsys__Account__c()==null) || 
             (this.pcmsys__Account__c!=null &&
              this.pcmsys__Account__c.equals(other.getPcmsys__Account__c()))) &&
            ((this.pcmsys__AccruedManagementFee__c==null && other.getPcmsys__AccruedManagementFee__c()==null) || 
             (this.pcmsys__AccruedManagementFee__c!=null &&
              this.pcmsys__AccruedManagementFee__c.equals(other.getPcmsys__AccruedManagementFee__c()))) &&
            ((this.pcmsys__Allocation_Method__c==null && other.getPcmsys__Allocation_Method__c()==null) || 
             (this.pcmsys__Allocation_Method__c!=null &&
              this.pcmsys__Allocation_Method__c.equals(other.getPcmsys__Allocation_Method__c()))) &&
            ((this.pcmsys__Bank_Name__c==null && other.getPcmsys__Bank_Name__c()==null) || 
             (this.pcmsys__Bank_Name__c!=null &&
              this.pcmsys__Bank_Name__c.equals(other.getPcmsys__Bank_Name__c()))) &&
            ((this.pcmsys__CapManRegisteredName__c==null && other.getPcmsys__CapManRegisteredName__c()==null) || 
             (this.pcmsys__CapManRegisteredName__c!=null &&
              this.pcmsys__CapManRegisteredName__c.equals(other.getPcmsys__CapManRegisteredName__c()))) &&
            ((this.pcmsys__CapManRegisteredName__r==null && other.getPcmsys__CapManRegisteredName__r()==null) || 
             (this.pcmsys__CapManRegisteredName__r!=null &&
              this.pcmsys__CapManRegisteredName__r.equals(other.getPcmsys__CapManRegisteredName__r()))) &&
            ((this.pcmsys__CapitalCalls__c==null && other.getPcmsys__CapitalCalls__c()==null) || 
             (this.pcmsys__CapitalCalls__c!=null &&
              this.pcmsys__CapitalCalls__c.equals(other.getPcmsys__CapitalCalls__c()))) &&
            ((this.pcmsys__CapitalContributions__c==null && other.getPcmsys__CapitalContributions__c()==null) || 
             (this.pcmsys__CapitalContributions__c!=null &&
              this.pcmsys__CapitalContributions__c.equals(other.getPcmsys__CapitalContributions__c()))) &&
            ((this.pcmsys__Capital_Calls_And_Commitments1__r==null && other.getPcmsys__Capital_Calls_And_Commitments1__r()==null) || 
             (this.pcmsys__Capital_Calls_And_Commitments1__r!=null &&
              this.pcmsys__Capital_Calls_And_Commitments1__r.equals(other.getPcmsys__Capital_Calls_And_Commitments1__r()))) &&
            ((this.pcmsys__Catchup__c==null && other.getPcmsys__Catchup__c()==null) || 
             (this.pcmsys__Catchup__c!=null &&
              this.pcmsys__Catchup__c.equals(other.getPcmsys__Catchup__c()))) &&
            ((this.pcmsys__ClawbackAmount__c==null && other.getPcmsys__ClawbackAmount__c()==null) || 
             (this.pcmsys__ClawbackAmount__c!=null &&
              this.pcmsys__ClawbackAmount__c.equals(other.getPcmsys__ClawbackAmount__c()))) &&
            ((this.pcmsys__ClawbackFrequency__c==null && other.getPcmsys__ClawbackFrequency__c()==null) || 
             (this.pcmsys__ClawbackFrequency__c!=null &&
              this.pcmsys__ClawbackFrequency__c.equals(other.getPcmsys__ClawbackFrequency__c()))) &&
            ((this.pcmsys__Clawback__c==null && other.getPcmsys__Clawback__c()==null) || 
             (this.pcmsys__Clawback__c!=null &&
              this.pcmsys__Clawback__c.equals(other.getPcmsys__Clawback__c()))) &&
            ((this.pcmsys__ContingencyLoss__c==null && other.getPcmsys__ContingencyLoss__c()==null) || 
             (this.pcmsys__ContingencyLoss__c!=null &&
              this.pcmsys__ContingencyLoss__c.equals(other.getPcmsys__ContingencyLoss__c()))) &&
            ((this.pcmsys__Contributed_Capital__c==null && other.getPcmsys__Contributed_Capital__c()==null) || 
             (this.pcmsys__Contributed_Capital__c!=null &&
              this.pcmsys__Contributed_Capital__c.equals(other.getPcmsys__Contributed_Capital__c()))) &&
            ((this.pcmsys__Currency_Type__c==null && other.getPcmsys__Currency_Type__c()==null) || 
             (this.pcmsys__Currency_Type__c!=null &&
              this.pcmsys__Currency_Type__c.equals(other.getPcmsys__Currency_Type__c()))) &&
            ((this.pcmsys__Description__c==null && other.getPcmsys__Description__c()==null) || 
             (this.pcmsys__Description__c!=null &&
              this.pcmsys__Description__c.equals(other.getPcmsys__Description__c()))) &&
            ((this.pcmsys__Dividend_Frequency__c==null && other.getPcmsys__Dividend_Frequency__c()==null) || 
             (this.pcmsys__Dividend_Frequency__c!=null &&
              this.pcmsys__Dividend_Frequency__c.equals(other.getPcmsys__Dividend_Frequency__c()))) &&
            ((this.pcmsys__Dividend_Payout_Order__c==null && other.getPcmsys__Dividend_Payout_Order__c()==null) || 
             (this.pcmsys__Dividend_Payout_Order__c!=null &&
              this.pcmsys__Dividend_Payout_Order__c.equals(other.getPcmsys__Dividend_Payout_Order__c()))) &&
            ((this.pcmsys__FinalCarry__c==null && other.getPcmsys__FinalCarry__c()==null) || 
             (this.pcmsys__FinalCarry__c!=null &&
              this.pcmsys__FinalCarry__c.equals(other.getPcmsys__FinalCarry__c()))) &&
            ((this.pcmsys__FirstCarryGPPct__c==null && other.getPcmsys__FirstCarryGPPct__c()==null) || 
             (this.pcmsys__FirstCarryGPPct__c!=null &&
              this.pcmsys__FirstCarryGPPct__c.equals(other.getPcmsys__FirstCarryGPPct__c()))) &&
            ((this.pcmsys__First_Carry__c==null && other.getPcmsys__First_Carry__c()==null) || 
             (this.pcmsys__First_Carry__c!=null &&
              this.pcmsys__First_Carry__c.equals(other.getPcmsys__First_Carry__c()))) &&
            ((this.pcmsys__FiscalYearEnd__c==null && other.getPcmsys__FiscalYearEnd__c()==null) || 
             (this.pcmsys__FiscalYearEnd__c!=null &&
              this.pcmsys__FiscalYearEnd__c.equals(other.getPcmsys__FiscalYearEnd__c()))) &&
            ((this.pcmsys__FundCloseDate__c==null && other.getPcmsys__FundCloseDate__c()==null) || 
             (this.pcmsys__FundCloseDate__c!=null &&
              this.pcmsys__FundCloseDate__c.equals(other.getPcmsys__FundCloseDate__c()))) &&
            ((this.pcmsys__FundDisolutionDate__c==null && other.getPcmsys__FundDisolutionDate__c()==null) || 
             (this.pcmsys__FundDisolutionDate__c!=null &&
              this.pcmsys__FundDisolutionDate__c.equals(other.getPcmsys__FundDisolutionDate__c()))) &&
            ((this.pcmsys__FundName__c==null && other.getPcmsys__FundName__c()==null) || 
             (this.pcmsys__FundName__c!=null &&
              this.pcmsys__FundName__c.equals(other.getPcmsys__FundName__c()))) &&
            ((this.pcmsys__FundSize__c==null && other.getPcmsys__FundSize__c()==null) || 
             (this.pcmsys__FundSize__c!=null &&
              this.pcmsys__FundSize__c.equals(other.getPcmsys__FundSize__c()))) &&
            ((this.pcmsys__FundTerm__c==null && other.getPcmsys__FundTerm__c()==null) || 
             (this.pcmsys__FundTerm__c!=null &&
              this.pcmsys__FundTerm__c.equals(other.getPcmsys__FundTerm__c()))) &&
            ((this.pcmsys__FundType__c==null && other.getPcmsys__FundType__c()==null) || 
             (this.pcmsys__FundType__c!=null &&
              this.pcmsys__FundType__c.equals(other.getPcmsys__FundType__c()))) &&
            ((this.pcmsys__Funds__r==null && other.getPcmsys__Funds__r()==null) || 
             (this.pcmsys__Funds__r!=null &&
              this.pcmsys__Funds__r.equals(other.getPcmsys__Funds__r()))) &&
            ((this.pcmsys__GPPrincipalLiability__c==null && other.getPcmsys__GPPrincipalLiability__c()==null) || 
             (this.pcmsys__GPPrincipalLiability__c!=null &&
              this.pcmsys__GPPrincipalLiability__c.equals(other.getPcmsys__GPPrincipalLiability__c()))) &&
            ((this.pcmsys__GP_Principal_Payout_Order__c==null && other.getPcmsys__GP_Principal_Payout_Order__c()==null) || 
             (this.pcmsys__GP_Principal_Payout_Order__c!=null &&
              this.pcmsys__GP_Principal_Payout_Order__c.equals(other.getPcmsys__GP_Principal_Payout_Order__c()))) &&
            ((this.pcmsys__General_Partners__r==null && other.getPcmsys__General_Partners__r()==null) || 
             (this.pcmsys__General_Partners__r!=null &&
              this.pcmsys__General_Partners__r.equals(other.getPcmsys__General_Partners__r()))) &&
            ((this.pcmsys__Has_First_Carry__c==null && other.getPcmsys__Has_First_Carry__c()==null) || 
             (this.pcmsys__Has_First_Carry__c!=null &&
              this.pcmsys__Has_First_Carry__c.equals(other.getPcmsys__Has_First_Carry__c()))) &&
            ((this.pcmsys__Has_Second_Carry__c==null && other.getPcmsys__Has_Second_Carry__c()==null) || 
             (this.pcmsys__Has_Second_Carry__c!=null &&
              this.pcmsys__Has_Second_Carry__c.equals(other.getPcmsys__Has_Second_Carry__c()))) &&
            ((this.pcmsys__Industry__c==null && other.getPcmsys__Industry__c()==null) || 
             (this.pcmsys__Industry__c!=null &&
              this.pcmsys__Industry__c.equals(other.getPcmsys__Industry__c()))) &&
            ((this.pcmsys__InitialCapitalCall__c==null && other.getPcmsys__InitialCapitalCall__c()==null) || 
             (this.pcmsys__InitialCapitalCall__c!=null &&
              this.pcmsys__InitialCapitalCall__c.equals(other.getPcmsys__InitialCapitalCall__c()))) &&
            ((this.pcmsys__Journal_Entries__r==null && other.getPcmsys__Journal_Entries__r()==null) || 
             (this.pcmsys__Journal_Entries__r!=null &&
              this.pcmsys__Journal_Entries__r.equals(other.getPcmsys__Journal_Entries__r()))) &&
            ((this.pcmsys__Journal_Entry_Items__r==null && other.getPcmsys__Journal_Entry_Items__r()==null) || 
             (this.pcmsys__Journal_Entry_Items__r!=null &&
              this.pcmsys__Journal_Entry_Items__r.equals(other.getPcmsys__Journal_Entry_Items__r()))) &&
            ((this.pcmsys__KeyManProvision__c==null && other.getPcmsys__KeyManProvision__c()==null) || 
             (this.pcmsys__KeyManProvision__c!=null &&
              this.pcmsys__KeyManProvision__c.equals(other.getPcmsys__KeyManProvision__c()))) &&
            ((this.pcmsys__LPPrincipalLiability__c==null && other.getPcmsys__LPPrincipalLiability__c()==null) || 
             (this.pcmsys__LPPrincipalLiability__c!=null &&
              this.pcmsys__LPPrincipalLiability__c.equals(other.getPcmsys__LPPrincipalLiability__c()))) &&
            ((this.pcmsys__LP_Principal_Payout_Order__c==null && other.getPcmsys__LP_Principal_Payout_Order__c()==null) || 
             (this.pcmsys__LP_Principal_Payout_Order__c!=null &&
              this.pcmsys__LP_Principal_Payout_Order__c.equals(other.getPcmsys__LP_Principal_Payout_Order__c()))) &&
            ((this.pcmsys__Last_Distribution_GP_Pct__c==null && other.getPcmsys__Last_Distribution_GP_Pct__c()==null) || 
             (this.pcmsys__Last_Distribution_GP_Pct__c!=null &&
              this.pcmsys__Last_Distribution_GP_Pct__c.equals(other.getPcmsys__Last_Distribution_GP_Pct__c()))) &&
            ((this.pcmsys__LegalName__c==null && other.getPcmsys__LegalName__c()==null) || 
             (this.pcmsys__LegalName__c!=null &&
              this.pcmsys__LegalName__c.equals(other.getPcmsys__LegalName__c()))) &&
            ((this.pcmsys__ManagementFee__c==null && other.getPcmsys__ManagementFee__c()==null) || 
             (this.pcmsys__ManagementFee__c!=null &&
              this.pcmsys__ManagementFee__c.equals(other.getPcmsys__ManagementFee__c()))) &&
            ((this.pcmsys__Management_Fee_Frequency__c==null && other.getPcmsys__Management_Fee_Frequency__c()==null) || 
             (this.pcmsys__Management_Fee_Frequency__c!=null &&
              this.pcmsys__Management_Fee_Frequency__c.equals(other.getPcmsys__Management_Fee_Frequency__c()))) &&
            ((this.pcmsys__Management_Fee_Payout_Order__c==null && other.getPcmsys__Management_Fee_Payout_Order__c()==null) || 
             (this.pcmsys__Management_Fee_Payout_Order__c!=null &&
              this.pcmsys__Management_Fee_Payout_Order__c.equals(other.getPcmsys__Management_Fee_Payout_Order__c()))) &&
            ((this.pcmsys__MaximumFundSize__c==null && other.getPcmsys__MaximumFundSize__c()==null) || 
             (this.pcmsys__MaximumFundSize__c!=null &&
              this.pcmsys__MaximumFundSize__c.equals(other.getPcmsys__MaximumFundSize__c()))) &&
            ((this.pcmsys__Parent_Fund__c==null && other.getPcmsys__Parent_Fund__c()==null) || 
             (this.pcmsys__Parent_Fund__c!=null &&
              this.pcmsys__Parent_Fund__c.equals(other.getPcmsys__Parent_Fund__c()))) &&
            ((this.pcmsys__Parent_Fund__r==null && other.getPcmsys__Parent_Fund__r()==null) || 
             (this.pcmsys__Parent_Fund__r!=null &&
              this.pcmsys__Parent_Fund__r.equals(other.getPcmsys__Parent_Fund__r()))) &&
            ((this.pcmsys__PartnersContribution__c==null && other.getPcmsys__PartnersContribution__c()==null) || 
             (this.pcmsys__PartnersContribution__c!=null &&
              this.pcmsys__PartnersContribution__c.equals(other.getPcmsys__PartnersContribution__c()))) &&
            ((this.pcmsys__Partnership_Fundraisings__r==null && other.getPcmsys__Partnership_Fundraisings__r()==null) || 
             (this.pcmsys__Partnership_Fundraisings__r!=null &&
              this.pcmsys__Partnership_Fundraisings__r.equals(other.getPcmsys__Partnership_Fundraisings__r()))) &&
            ((this.pcmsys__PayoutDefined__c==null && other.getPcmsys__PayoutDefined__c()==null) || 
             (this.pcmsys__PayoutDefined__c!=null &&
              this.pcmsys__PayoutDefined__c.equals(other.getPcmsys__PayoutDefined__c()))) &&
            ((this.pcmsys__PreferredDividendLiability__c==null && other.getPcmsys__PreferredDividendLiability__c()==null) || 
             (this.pcmsys__PreferredDividendLiability__c!=null &&
              this.pcmsys__PreferredDividendLiability__c.equals(other.getPcmsys__PreferredDividendLiability__c()))) &&
            ((this.pcmsys__Preferred_Dividend__c==null && other.getPcmsys__Preferred_Dividend__c()==null) || 
             (this.pcmsys__Preferred_Dividend__c!=null &&
              this.pcmsys__Preferred_Dividend__c.equals(other.getPcmsys__Preferred_Dividend__c()))) &&
            ((this.pcmsys__Report_Date__c==null && other.getPcmsys__Report_Date__c()==null) || 
             (this.pcmsys__Report_Date__c!=null &&
              this.pcmsys__Report_Date__c.equals(other.getPcmsys__Report_Date__c()))) &&
            ((this.pcmsys__RollUpAccount__c==null && other.getPcmsys__RollUpAccount__c()==null) || 
             (this.pcmsys__RollUpAccount__c!=null &&
              this.pcmsys__RollUpAccount__c.equals(other.getPcmsys__RollUpAccount__c()))) &&
            ((this.pcmsys__SWIFT_Code__c==null && other.getPcmsys__SWIFT_Code__c()==null) || 
             (this.pcmsys__SWIFT_Code__c!=null &&
              this.pcmsys__SWIFT_Code__c.equals(other.getPcmsys__SWIFT_Code__c()))) &&
            ((this.pcmsys__SecondCarryGPPct__c==null && other.getPcmsys__SecondCarryGPPct__c()==null) || 
             (this.pcmsys__SecondCarryGPPct__c!=null &&
              this.pcmsys__SecondCarryGPPct__c.equals(other.getPcmsys__SecondCarryGPPct__c()))) &&
            ((this.pcmsys__Second_Carry__c==null && other.getPcmsys__Second_Carry__c()==null) || 
             (this.pcmsys__Second_Carry__c!=null &&
              this.pcmsys__Second_Carry__c.equals(other.getPcmsys__Second_Carry__c()))) &&
            ((this.pcmsys__Sub_Account_Number__c==null && other.getPcmsys__Sub_Account_Number__c()==null) || 
             (this.pcmsys__Sub_Account_Number__c!=null &&
              this.pcmsys__Sub_Account_Number__c.equals(other.getPcmsys__Sub_Account_Number__c()))) &&
            ((this.pcmsys__Sub_Account__c==null && other.getPcmsys__Sub_Account__c()==null) || 
             (this.pcmsys__Sub_Account__c!=null &&
              this.pcmsys__Sub_Account__c.equals(other.getPcmsys__Sub_Account__c()))) &&
            ((this.pcmsys__Total_Capital_Calls__c==null && other.getPcmsys__Total_Capital_Calls__c()==null) || 
             (this.pcmsys__Total_Capital_Calls__c!=null &&
              this.pcmsys__Total_Capital_Calls__c.equals(other.getPcmsys__Total_Capital_Calls__c()))) &&
            ((this.pcmsys__Total_Capital_Commitments__c==null && other.getPcmsys__Total_Capital_Commitments__c()==null) || 
             (this.pcmsys__Total_Capital_Commitments__c!=null &&
              this.pcmsys__Total_Capital_Commitments__c.equals(other.getPcmsys__Total_Capital_Commitments__c()))) &&
            ((this.pcmsys__Unrealized_Gain__c==null && other.getPcmsys__Unrealized_Gain__c()==null) || 
             (this.pcmsys__Unrealized_Gain__c!=null &&
              this.pcmsys__Unrealized_Gain__c.equals(other.getPcmsys__Unrealized_Gain__c())));
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
        if (getPcmsys__AccountName__c() != null) {
            _hashCode += getPcmsys__AccountName__c().hashCode();
        }
        if (getPcmsys__AccountNumber__c() != null) {
            _hashCode += getPcmsys__AccountNumber__c().hashCode();
        }
        if (getPcmsys__AccountType__c() != null) {
            _hashCode += getPcmsys__AccountType__c().hashCode();
        }
        if (getPcmsys__Account_Number__c() != null) {
            _hashCode += getPcmsys__Account_Number__c().hashCode();
        }
        if (getPcmsys__Account_Value__c() != null) {
            _hashCode += getPcmsys__Account_Value__c().hashCode();
        }
        if (getPcmsys__Account__c() != null) {
            _hashCode += getPcmsys__Account__c().hashCode();
        }
        if (getPcmsys__AccruedManagementFee__c() != null) {
            _hashCode += getPcmsys__AccruedManagementFee__c().hashCode();
        }
        if (getPcmsys__Allocation_Method__c() != null) {
            _hashCode += getPcmsys__Allocation_Method__c().hashCode();
        }
        if (getPcmsys__Bank_Name__c() != null) {
            _hashCode += getPcmsys__Bank_Name__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__c() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__c().hashCode();
        }
        if (getPcmsys__CapManRegisteredName__r() != null) {
            _hashCode += getPcmsys__CapManRegisteredName__r().hashCode();
        }
        if (getPcmsys__CapitalCalls__c() != null) {
            _hashCode += getPcmsys__CapitalCalls__c().hashCode();
        }
        if (getPcmsys__CapitalContributions__c() != null) {
            _hashCode += getPcmsys__CapitalContributions__c().hashCode();
        }
        if (getPcmsys__Capital_Calls_And_Commitments1__r() != null) {
            _hashCode += getPcmsys__Capital_Calls_And_Commitments1__r().hashCode();
        }
        if (getPcmsys__Catchup__c() != null) {
            _hashCode += getPcmsys__Catchup__c().hashCode();
        }
        if (getPcmsys__ClawbackAmount__c() != null) {
            _hashCode += getPcmsys__ClawbackAmount__c().hashCode();
        }
        if (getPcmsys__ClawbackFrequency__c() != null) {
            _hashCode += getPcmsys__ClawbackFrequency__c().hashCode();
        }
        if (getPcmsys__Clawback__c() != null) {
            _hashCode += getPcmsys__Clawback__c().hashCode();
        }
        if (getPcmsys__ContingencyLoss__c() != null) {
            _hashCode += getPcmsys__ContingencyLoss__c().hashCode();
        }
        if (getPcmsys__Contributed_Capital__c() != null) {
            _hashCode += getPcmsys__Contributed_Capital__c().hashCode();
        }
        if (getPcmsys__Currency_Type__c() != null) {
            _hashCode += getPcmsys__Currency_Type__c().hashCode();
        }
        if (getPcmsys__Description__c() != null) {
            _hashCode += getPcmsys__Description__c().hashCode();
        }
        if (getPcmsys__Dividend_Frequency__c() != null) {
            _hashCode += getPcmsys__Dividend_Frequency__c().hashCode();
        }
        if (getPcmsys__Dividend_Payout_Order__c() != null) {
            _hashCode += getPcmsys__Dividend_Payout_Order__c().hashCode();
        }
        if (getPcmsys__FinalCarry__c() != null) {
            _hashCode += getPcmsys__FinalCarry__c().hashCode();
        }
        if (getPcmsys__FirstCarryGPPct__c() != null) {
            _hashCode += getPcmsys__FirstCarryGPPct__c().hashCode();
        }
        if (getPcmsys__First_Carry__c() != null) {
            _hashCode += getPcmsys__First_Carry__c().hashCode();
        }
        if (getPcmsys__FiscalYearEnd__c() != null) {
            _hashCode += getPcmsys__FiscalYearEnd__c().hashCode();
        }
        if (getPcmsys__FundCloseDate__c() != null) {
            _hashCode += getPcmsys__FundCloseDate__c().hashCode();
        }
        if (getPcmsys__FundDisolutionDate__c() != null) {
            _hashCode += getPcmsys__FundDisolutionDate__c().hashCode();
        }
        if (getPcmsys__FundName__c() != null) {
            _hashCode += getPcmsys__FundName__c().hashCode();
        }
        if (getPcmsys__FundSize__c() != null) {
            _hashCode += getPcmsys__FundSize__c().hashCode();
        }
        if (getPcmsys__FundTerm__c() != null) {
            _hashCode += getPcmsys__FundTerm__c().hashCode();
        }
        if (getPcmsys__FundType__c() != null) {
            _hashCode += getPcmsys__FundType__c().hashCode();
        }
        if (getPcmsys__Funds__r() != null) {
            _hashCode += getPcmsys__Funds__r().hashCode();
        }
        if (getPcmsys__GPPrincipalLiability__c() != null) {
            _hashCode += getPcmsys__GPPrincipalLiability__c().hashCode();
        }
        if (getPcmsys__GP_Principal_Payout_Order__c() != null) {
            _hashCode += getPcmsys__GP_Principal_Payout_Order__c().hashCode();
        }
        if (getPcmsys__General_Partners__r() != null) {
            _hashCode += getPcmsys__General_Partners__r().hashCode();
        }
        if (getPcmsys__Has_First_Carry__c() != null) {
            _hashCode += getPcmsys__Has_First_Carry__c().hashCode();
        }
        if (getPcmsys__Has_Second_Carry__c() != null) {
            _hashCode += getPcmsys__Has_Second_Carry__c().hashCode();
        }
        if (getPcmsys__Industry__c() != null) {
            _hashCode += getPcmsys__Industry__c().hashCode();
        }
        if (getPcmsys__InitialCapitalCall__c() != null) {
            _hashCode += getPcmsys__InitialCapitalCall__c().hashCode();
        }
        if (getPcmsys__Journal_Entries__r() != null) {
            _hashCode += getPcmsys__Journal_Entries__r().hashCode();
        }
        if (getPcmsys__Journal_Entry_Items__r() != null) {
            _hashCode += getPcmsys__Journal_Entry_Items__r().hashCode();
        }
        if (getPcmsys__KeyManProvision__c() != null) {
            _hashCode += getPcmsys__KeyManProvision__c().hashCode();
        }
        if (getPcmsys__LPPrincipalLiability__c() != null) {
            _hashCode += getPcmsys__LPPrincipalLiability__c().hashCode();
        }
        if (getPcmsys__LP_Principal_Payout_Order__c() != null) {
            _hashCode += getPcmsys__LP_Principal_Payout_Order__c().hashCode();
        }
        if (getPcmsys__Last_Distribution_GP_Pct__c() != null) {
            _hashCode += getPcmsys__Last_Distribution_GP_Pct__c().hashCode();
        }
        if (getPcmsys__LegalName__c() != null) {
            _hashCode += getPcmsys__LegalName__c().hashCode();
        }
        if (getPcmsys__ManagementFee__c() != null) {
            _hashCode += getPcmsys__ManagementFee__c().hashCode();
        }
        if (getPcmsys__Management_Fee_Frequency__c() != null) {
            _hashCode += getPcmsys__Management_Fee_Frequency__c().hashCode();
        }
        if (getPcmsys__Management_Fee_Payout_Order__c() != null) {
            _hashCode += getPcmsys__Management_Fee_Payout_Order__c().hashCode();
        }
        if (getPcmsys__MaximumFundSize__c() != null) {
            _hashCode += getPcmsys__MaximumFundSize__c().hashCode();
        }
        if (getPcmsys__Parent_Fund__c() != null) {
            _hashCode += getPcmsys__Parent_Fund__c().hashCode();
        }
        if (getPcmsys__Parent_Fund__r() != null) {
            _hashCode += getPcmsys__Parent_Fund__r().hashCode();
        }
        if (getPcmsys__PartnersContribution__c() != null) {
            _hashCode += getPcmsys__PartnersContribution__c().hashCode();
        }
        if (getPcmsys__Partnership_Fundraisings__r() != null) {
            _hashCode += getPcmsys__Partnership_Fundraisings__r().hashCode();
        }
        if (getPcmsys__PayoutDefined__c() != null) {
            _hashCode += getPcmsys__PayoutDefined__c().hashCode();
        }
        if (getPcmsys__PreferredDividendLiability__c() != null) {
            _hashCode += getPcmsys__PreferredDividendLiability__c().hashCode();
        }
        if (getPcmsys__Preferred_Dividend__c() != null) {
            _hashCode += getPcmsys__Preferred_Dividend__c().hashCode();
        }
        if (getPcmsys__Report_Date__c() != null) {
            _hashCode += getPcmsys__Report_Date__c().hashCode();
        }
        if (getPcmsys__RollUpAccount__c() != null) {
            _hashCode += getPcmsys__RollUpAccount__c().hashCode();
        }
        if (getPcmsys__SWIFT_Code__c() != null) {
            _hashCode += getPcmsys__SWIFT_Code__c().hashCode();
        }
        if (getPcmsys__SecondCarryGPPct__c() != null) {
            _hashCode += getPcmsys__SecondCarryGPPct__c().hashCode();
        }
        if (getPcmsys__Second_Carry__c() != null) {
            _hashCode += getPcmsys__Second_Carry__c().hashCode();
        }
        if (getPcmsys__Sub_Account_Number__c() != null) {
            _hashCode += getPcmsys__Sub_Account_Number__c().hashCode();
        }
        if (getPcmsys__Sub_Account__c() != null) {
            _hashCode += getPcmsys__Sub_Account__c().hashCode();
        }
        if (getPcmsys__Total_Capital_Calls__c() != null) {
            _hashCode += getPcmsys__Total_Capital_Calls__c().hashCode();
        }
        if (getPcmsys__Total_Capital_Commitments__c() != null) {
            _hashCode += getPcmsys__Total_Capital_Commitments__c().hashCode();
        }
        if (getPcmsys__Unrealized_Gain__c() != null) {
            _hashCode += getPcmsys__Unrealized_Gain__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pcmsys__Fund__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Fund__c"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__AccountName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__AccountName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__AccountNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__AccountNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__AccountType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__AccountType__c"));
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
        elemField.setFieldName("pcmsys__Account_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Account_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__AccruedManagementFee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__AccruedManagementFee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Allocation_Method__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Allocation_Method__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Bank_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Bank_Name__c"));
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
        elemField.setFieldName("pcmsys__CapitalCalls__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__CapitalCalls__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__CapitalContributions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__CapitalContributions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Capital_Calls_And_Commitments1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Capital_Calls_And_Commitments1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Catchup__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Catchup__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__ClawbackAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__ClawbackAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__ClawbackFrequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__ClawbackFrequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Clawback__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Clawback__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__ContingencyLoss__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__ContingencyLoss__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Contributed_Capital__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Contributed_Capital__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Currency_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Currency_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pcmsys__Dividend_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Dividend_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Dividend_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Dividend_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FinalCarry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FinalCarry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FirstCarryGPPct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FirstCarryGPPct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__First_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__First_Carry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FiscalYearEnd__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FiscalYearEnd__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FundCloseDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FundCloseDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FundDisolutionDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FundDisolutionDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FundName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FundName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FundSize__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FundSize__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FundTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FundTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__FundType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__FundType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Funds__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Funds__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__GPPrincipalLiability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__GPPrincipalLiability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__GP_Principal_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__GP_Principal_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__General_Partners__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__General_Partners__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Has_First_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Has_First_Carry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Has_Second_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Has_Second_Carry__c"));
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
        elemField.setFieldName("pcmsys__InitialCapitalCall__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__InitialCapitalCall__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Journal_Entries__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Journal_Entries__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("pcmsys__KeyManProvision__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__KeyManProvision__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__LPPrincipalLiability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__LPPrincipalLiability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__LP_Principal_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__LP_Principal_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Last_Distribution_GP_Pct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Last_Distribution_GP_Pct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__LegalName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__LegalName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__ManagementFee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__ManagementFee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Management_Fee_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Management_Fee_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Management_Fee_Payout_Order__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Management_Fee_Payout_Order__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__MaximumFundSize__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__MaximumFundSize__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Parent_Fund__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Parent_Fund__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Parent_Fund__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Parent_Fund__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Fund__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__PartnersContribution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__PartnersContribution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Partnership_Fundraisings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Partnership_Fundraisings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__PayoutDefined__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__PayoutDefined__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__PreferredDividendLiability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__PreferredDividendLiability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Preferred_Dividend__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Preferred_Dividend__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Report_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Report_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__RollUpAccount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__RollUpAccount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__SWIFT_Code__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__SWIFT_Code__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__SecondCarryGPPct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__SecondCarryGPPct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Second_Carry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Second_Carry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Sub_Account_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Sub_Account_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Sub_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Sub_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Total_Capital_Calls__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Total_Capital_Calls__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Total_Capital_Commitments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Total_Capital_Commitments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Unrealized_Gain__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Unrealized_Gain__c"));
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
