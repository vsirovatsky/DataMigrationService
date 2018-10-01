/**
 * CapMan__Issuance__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Issuance__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Account_Address__c;

    private java.lang.String capMan__Account_Name__c;

    private java.lang.Double capMan__Accrued_Dividend__c;

    private java.lang.Double capMan__AmountIssued__c;

    private java.lang.Double capMan__AsConvertedDebt__c;

    private java.lang.String capMan__Board_Approvals__c;

    private java.lang.String capMan__Board_of_Directors__c;

    private java.lang.Double capMan__CalculatedSharePrice2__c;

    private java.lang.Double capMan__CalculatedSharePrice__c;

    private java.lang.String capMan__CalculatorType__c;

    private java.lang.String capMan__Capitalization__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Capitalization__r;

    private java.util.Date capMan__CloseDate__c;

    private java.lang.String capMan__Co_Sale_Agreement__c;

    private java.lang.Double capMan__Conversion_Ratio__c;

    private java.lang.Boolean capMan__ConvertConvertibleDebt__c;

    private java.lang.String capMan__ConvertToSecurity__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__ConvertToSecurity__r;

    private java.lang.Double capMan__Convert_Debt_Amount__c;

    private java.lang.Double capMan__Demand_Registration_Percent__c;

    private java.lang.Double capMan__Demand_Registration_Threshold__c;

    private java.lang.Double capMan__EnterSharePrice2__c;

    private java.lang.Double capMan__EnterSharePrice__c;

    private java.lang.Double capMan__Execution_days__c;

    private java.util.Date capMan__Expected_Close_Date__c;

    private java.lang.Double capMan__FullyDilutedCalc__c;

    private java.lang.Double capMan__FullyDilutedShares__c;

    private java.lang.Double capMan__FullyminusConvCalc__c;

    private java.lang.Double capMan__Fundraising_Maximum__c;

    private java.lang.Double capMan__Fundraising_Minimum__c;

    private java.lang.String capMan__Fundraising__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c capMan__Fundraising__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Fundraisings__r;

    private java.lang.Double capMan__ImputedNewShares__c;

    private java.lang.String capMan__Issuance_Name__c;

    private java.lang.String capMan__IssueStatus__c;

    private java.lang.Double capMan__Issue_Amount__c;

    private java.lang.String capMan__Key_Employee_Compensation__c;

    private java.lang.String capMan__Key_Employee_Severance__c;

    private java.util.Date capMan__LastUpdateTimestamp__c;

    private java.lang.String capMan__Lead_Investor_List__c;

    private java.lang.String capMan__Legal_Fees__c;

    private java.lang.Double capMan__NewPostMoneyShares__c;

    private java.util.Date capMan__NextFinancingDate__c;

    private java.lang.Boolean capMan__No_Shop__c;

    private java.lang.Double capMan__OptionBump__c;

    private java.lang.Double capMan__OptionPlanTargetPct__c;

    private java.lang.String capMan__OptionPlanTarget__c;

    private java.lang.Double capMan__OptionsAvailable__c;

    private java.lang.Double capMan__OptionsOutstanding__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Pay_to_Play_Links__r;

    private java.lang.Boolean capMan__Pay_to_play__c;

    private java.lang.Double capMan__Percent_to_Amend__c;

    private java.lang.Double capMan__PostMoneyShare__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Post_Capitalization_Table__r;

    private java.lang.Double capMan__PreMoneyShares__c;

    private java.lang.Double capMan__Proposed_Issue_Amount__c;

    private java.lang.Double capMan__Reserve_Capital__c;

    private java.lang.String capMan__Security_Name__c;

    private java.lang.String capMan__Security_Type__c;

    private java.lang.String capMan__Security__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Security__r;

    private java.lang.Double capMan__Security_pref_Percent__c;

    private java.lang.Double capMan__Share_Price2__c;

    private java.lang.Double capMan__Share_Price__c;

    private java.lang.Double capMan__SharesIssued__c;

    private java.util.Date capMan__Term_Sheet_Date__c;

    private java.util.Date capMan__Term_Sheet_Expiration__c;

    private java.lang.Double capMan__Total_Amount_Raised__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Transactions__r;

    private java.lang.Boolean capMan__UpdateOnly__c;

    private java.lang.String capMan__Use_of_Proceeds__c;

    private java.lang.String capMan__ValuationMethod__c;

    private java.lang.Double capMan__Valuation__c;

    private java.lang.Boolean capMan__Waive_All_Anti_Dilution__c;

    private java.lang.Boolean capMan__include_earlier_issuance__c;

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

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public CapMan__Issuance__c() {
    }

    public CapMan__Issuance__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Account_Address__c,
           java.lang.String capMan__Account_Name__c,
           java.lang.Double capMan__Accrued_Dividend__c,
           java.lang.Double capMan__AmountIssued__c,
           java.lang.Double capMan__AsConvertedDebt__c,
           java.lang.String capMan__Board_Approvals__c,
           java.lang.String capMan__Board_of_Directors__c,
           java.lang.Double capMan__CalculatedSharePrice2__c,
           java.lang.Double capMan__CalculatedSharePrice__c,
           java.lang.String capMan__CalculatorType__c,
           java.lang.String capMan__Capitalization__c,
           com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Capitalization__r,
           java.util.Date capMan__CloseDate__c,
           java.lang.String capMan__Co_Sale_Agreement__c,
           java.lang.Double capMan__Conversion_Ratio__c,
           java.lang.Boolean capMan__ConvertConvertibleDebt__c,
           java.lang.String capMan__ConvertToSecurity__c,
           com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__ConvertToSecurity__r,
           java.lang.Double capMan__Convert_Debt_Amount__c,
           java.lang.Double capMan__Demand_Registration_Percent__c,
           java.lang.Double capMan__Demand_Registration_Threshold__c,
           java.lang.Double capMan__EnterSharePrice2__c,
           java.lang.Double capMan__EnterSharePrice__c,
           java.lang.Double capMan__Execution_days__c,
           java.util.Date capMan__Expected_Close_Date__c,
           java.lang.Double capMan__FullyDilutedCalc__c,
           java.lang.Double capMan__FullyDilutedShares__c,
           java.lang.Double capMan__FullyminusConvCalc__c,
           java.lang.Double capMan__Fundraising_Maximum__c,
           java.lang.Double capMan__Fundraising_Minimum__c,
           java.lang.String capMan__Fundraising__c,
           com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c capMan__Fundraising__r,
           com.sforce.soap.enterprise.QueryResult capMan__Fundraisings__r,
           java.lang.Double capMan__ImputedNewShares__c,
           java.lang.String capMan__Issuance_Name__c,
           java.lang.String capMan__IssueStatus__c,
           java.lang.Double capMan__Issue_Amount__c,
           java.lang.String capMan__Key_Employee_Compensation__c,
           java.lang.String capMan__Key_Employee_Severance__c,
           java.util.Date capMan__LastUpdateTimestamp__c,
           java.lang.String capMan__Lead_Investor_List__c,
           java.lang.String capMan__Legal_Fees__c,
           java.lang.Double capMan__NewPostMoneyShares__c,
           java.util.Date capMan__NextFinancingDate__c,
           java.lang.Boolean capMan__No_Shop__c,
           java.lang.Double capMan__OptionBump__c,
           java.lang.Double capMan__OptionPlanTargetPct__c,
           java.lang.String capMan__OptionPlanTarget__c,
           java.lang.Double capMan__OptionsAvailable__c,
           java.lang.Double capMan__OptionsOutstanding__c,
           com.sforce.soap.enterprise.QueryResult capMan__Pay_to_Play_Links__r,
           java.lang.Boolean capMan__Pay_to_play__c,
           java.lang.Double capMan__Percent_to_Amend__c,
           java.lang.Double capMan__PostMoneyShare__c,
           com.sforce.soap.enterprise.QueryResult capMan__Post_Capitalization_Table__r,
           java.lang.Double capMan__PreMoneyShares__c,
           java.lang.Double capMan__Proposed_Issue_Amount__c,
           java.lang.Double capMan__Reserve_Capital__c,
           java.lang.String capMan__Security_Name__c,
           java.lang.String capMan__Security_Type__c,
           java.lang.String capMan__Security__c,
           com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Security__r,
           java.lang.Double capMan__Security_pref_Percent__c,
           java.lang.Double capMan__Share_Price2__c,
           java.lang.Double capMan__Share_Price__c,
           java.lang.Double capMan__SharesIssued__c,
           java.util.Date capMan__Term_Sheet_Date__c,
           java.util.Date capMan__Term_Sheet_Expiration__c,
           java.lang.Double capMan__Total_Amount_Raised__c,
           com.sforce.soap.enterprise.QueryResult capMan__Transactions__r,
           java.lang.Boolean capMan__UpdateOnly__c,
           java.lang.String capMan__Use_of_Proceeds__c,
           java.lang.String capMan__ValuationMethod__c,
           java.lang.Double capMan__Valuation__c,
           java.lang.Boolean capMan__Waive_All_Anti_Dilution__c,
           java.lang.Boolean capMan__include_earlier_issuance__c,
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
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.capMan__Account_Address__c = capMan__Account_Address__c;
        this.capMan__Account_Name__c = capMan__Account_Name__c;
        this.capMan__Accrued_Dividend__c = capMan__Accrued_Dividend__c;
        this.capMan__AmountIssued__c = capMan__AmountIssued__c;
        this.capMan__AsConvertedDebt__c = capMan__AsConvertedDebt__c;
        this.capMan__Board_Approvals__c = capMan__Board_Approvals__c;
        this.capMan__Board_of_Directors__c = capMan__Board_of_Directors__c;
        this.capMan__CalculatedSharePrice2__c = capMan__CalculatedSharePrice2__c;
        this.capMan__CalculatedSharePrice__c = capMan__CalculatedSharePrice__c;
        this.capMan__CalculatorType__c = capMan__CalculatorType__c;
        this.capMan__Capitalization__c = capMan__Capitalization__c;
        this.capMan__Capitalization__r = capMan__Capitalization__r;
        this.capMan__CloseDate__c = capMan__CloseDate__c;
        this.capMan__Co_Sale_Agreement__c = capMan__Co_Sale_Agreement__c;
        this.capMan__Conversion_Ratio__c = capMan__Conversion_Ratio__c;
        this.capMan__ConvertConvertibleDebt__c = capMan__ConvertConvertibleDebt__c;
        this.capMan__ConvertToSecurity__c = capMan__ConvertToSecurity__c;
        this.capMan__ConvertToSecurity__r = capMan__ConvertToSecurity__r;
        this.capMan__Convert_Debt_Amount__c = capMan__Convert_Debt_Amount__c;
        this.capMan__Demand_Registration_Percent__c = capMan__Demand_Registration_Percent__c;
        this.capMan__Demand_Registration_Threshold__c = capMan__Demand_Registration_Threshold__c;
        this.capMan__EnterSharePrice2__c = capMan__EnterSharePrice2__c;
        this.capMan__EnterSharePrice__c = capMan__EnterSharePrice__c;
        this.capMan__Execution_days__c = capMan__Execution_days__c;
        this.capMan__Expected_Close_Date__c = capMan__Expected_Close_Date__c;
        this.capMan__FullyDilutedCalc__c = capMan__FullyDilutedCalc__c;
        this.capMan__FullyDilutedShares__c = capMan__FullyDilutedShares__c;
        this.capMan__FullyminusConvCalc__c = capMan__FullyminusConvCalc__c;
        this.capMan__Fundraising_Maximum__c = capMan__Fundraising_Maximum__c;
        this.capMan__Fundraising_Minimum__c = capMan__Fundraising_Minimum__c;
        this.capMan__Fundraising__c = capMan__Fundraising__c;
        this.capMan__Fundraising__r = capMan__Fundraising__r;
        this.capMan__Fundraisings__r = capMan__Fundraisings__r;
        this.capMan__ImputedNewShares__c = capMan__ImputedNewShares__c;
        this.capMan__Issuance_Name__c = capMan__Issuance_Name__c;
        this.capMan__IssueStatus__c = capMan__IssueStatus__c;
        this.capMan__Issue_Amount__c = capMan__Issue_Amount__c;
        this.capMan__Key_Employee_Compensation__c = capMan__Key_Employee_Compensation__c;
        this.capMan__Key_Employee_Severance__c = capMan__Key_Employee_Severance__c;
        this.capMan__LastUpdateTimestamp__c = capMan__LastUpdateTimestamp__c;
        this.capMan__Lead_Investor_List__c = capMan__Lead_Investor_List__c;
        this.capMan__Legal_Fees__c = capMan__Legal_Fees__c;
        this.capMan__NewPostMoneyShares__c = capMan__NewPostMoneyShares__c;
        this.capMan__NextFinancingDate__c = capMan__NextFinancingDate__c;
        this.capMan__No_Shop__c = capMan__No_Shop__c;
        this.capMan__OptionBump__c = capMan__OptionBump__c;
        this.capMan__OptionPlanTargetPct__c = capMan__OptionPlanTargetPct__c;
        this.capMan__OptionPlanTarget__c = capMan__OptionPlanTarget__c;
        this.capMan__OptionsAvailable__c = capMan__OptionsAvailable__c;
        this.capMan__OptionsOutstanding__c = capMan__OptionsOutstanding__c;
        this.capMan__Pay_to_Play_Links__r = capMan__Pay_to_Play_Links__r;
        this.capMan__Pay_to_play__c = capMan__Pay_to_play__c;
        this.capMan__Percent_to_Amend__c = capMan__Percent_to_Amend__c;
        this.capMan__PostMoneyShare__c = capMan__PostMoneyShare__c;
        this.capMan__Post_Capitalization_Table__r = capMan__Post_Capitalization_Table__r;
        this.capMan__PreMoneyShares__c = capMan__PreMoneyShares__c;
        this.capMan__Proposed_Issue_Amount__c = capMan__Proposed_Issue_Amount__c;
        this.capMan__Reserve_Capital__c = capMan__Reserve_Capital__c;
        this.capMan__Security_Name__c = capMan__Security_Name__c;
        this.capMan__Security_Type__c = capMan__Security_Type__c;
        this.capMan__Security__c = capMan__Security__c;
        this.capMan__Security__r = capMan__Security__r;
        this.capMan__Security_pref_Percent__c = capMan__Security_pref_Percent__c;
        this.capMan__Share_Price2__c = capMan__Share_Price2__c;
        this.capMan__Share_Price__c = capMan__Share_Price__c;
        this.capMan__SharesIssued__c = capMan__SharesIssued__c;
        this.capMan__Term_Sheet_Date__c = capMan__Term_Sheet_Date__c;
        this.capMan__Term_Sheet_Expiration__c = capMan__Term_Sheet_Expiration__c;
        this.capMan__Total_Amount_Raised__c = capMan__Total_Amount_Raised__c;
        this.capMan__Transactions__r = capMan__Transactions__r;
        this.capMan__UpdateOnly__c = capMan__UpdateOnly__c;
        this.capMan__Use_of_Proceeds__c = capMan__Use_of_Proceeds__c;
        this.capMan__ValuationMethod__c = capMan__ValuationMethod__c;
        this.capMan__Valuation__c = capMan__Valuation__c;
        this.capMan__Waive_All_Anti_Dilution__c = capMan__Waive_All_Anti_Dilution__c;
        this.capMan__include_earlier_issuance__c = capMan__include_earlier_issuance__c;
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
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this CapMan__Issuance__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__Issuance__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__Issuance__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Issuance__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Account_Address__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Account_Address__c
     */
    public java.lang.String getCapMan__Account_Address__c() {
        return capMan__Account_Address__c;
    }


    /**
     * Sets the capMan__Account_Address__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Account_Address__c
     */
    public void setCapMan__Account_Address__c(java.lang.String capMan__Account_Address__c) {
        this.capMan__Account_Address__c = capMan__Account_Address__c;
    }


    /**
     * Gets the capMan__Account_Name__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Account_Name__c
     */
    public java.lang.String getCapMan__Account_Name__c() {
        return capMan__Account_Name__c;
    }


    /**
     * Sets the capMan__Account_Name__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Account_Name__c
     */
    public void setCapMan__Account_Name__c(java.lang.String capMan__Account_Name__c) {
        this.capMan__Account_Name__c = capMan__Account_Name__c;
    }


    /**
     * Gets the capMan__Accrued_Dividend__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Accrued_Dividend__c
     */
    public java.lang.Double getCapMan__Accrued_Dividend__c() {
        return capMan__Accrued_Dividend__c;
    }


    /**
     * Sets the capMan__Accrued_Dividend__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Accrued_Dividend__c
     */
    public void setCapMan__Accrued_Dividend__c(java.lang.Double capMan__Accrued_Dividend__c) {
        this.capMan__Accrued_Dividend__c = capMan__Accrued_Dividend__c;
    }


    /**
     * Gets the capMan__AmountIssued__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__AmountIssued__c
     */
    public java.lang.Double getCapMan__AmountIssued__c() {
        return capMan__AmountIssued__c;
    }


    /**
     * Sets the capMan__AmountIssued__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__AmountIssued__c
     */
    public void setCapMan__AmountIssued__c(java.lang.Double capMan__AmountIssued__c) {
        this.capMan__AmountIssued__c = capMan__AmountIssued__c;
    }


    /**
     * Gets the capMan__AsConvertedDebt__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__AsConvertedDebt__c
     */
    public java.lang.Double getCapMan__AsConvertedDebt__c() {
        return capMan__AsConvertedDebt__c;
    }


    /**
     * Sets the capMan__AsConvertedDebt__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__AsConvertedDebt__c
     */
    public void setCapMan__AsConvertedDebt__c(java.lang.Double capMan__AsConvertedDebt__c) {
        this.capMan__AsConvertedDebt__c = capMan__AsConvertedDebt__c;
    }


    /**
     * Gets the capMan__Board_Approvals__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Board_Approvals__c
     */
    public java.lang.String getCapMan__Board_Approvals__c() {
        return capMan__Board_Approvals__c;
    }


    /**
     * Sets the capMan__Board_Approvals__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Board_Approvals__c
     */
    public void setCapMan__Board_Approvals__c(java.lang.String capMan__Board_Approvals__c) {
        this.capMan__Board_Approvals__c = capMan__Board_Approvals__c;
    }


    /**
     * Gets the capMan__Board_of_Directors__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Board_of_Directors__c
     */
    public java.lang.String getCapMan__Board_of_Directors__c() {
        return capMan__Board_of_Directors__c;
    }


    /**
     * Sets the capMan__Board_of_Directors__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Board_of_Directors__c
     */
    public void setCapMan__Board_of_Directors__c(java.lang.String capMan__Board_of_Directors__c) {
        this.capMan__Board_of_Directors__c = capMan__Board_of_Directors__c;
    }


    /**
     * Gets the capMan__CalculatedSharePrice2__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__CalculatedSharePrice2__c
     */
    public java.lang.Double getCapMan__CalculatedSharePrice2__c() {
        return capMan__CalculatedSharePrice2__c;
    }


    /**
     * Sets the capMan__CalculatedSharePrice2__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__CalculatedSharePrice2__c
     */
    public void setCapMan__CalculatedSharePrice2__c(java.lang.Double capMan__CalculatedSharePrice2__c) {
        this.capMan__CalculatedSharePrice2__c = capMan__CalculatedSharePrice2__c;
    }


    /**
     * Gets the capMan__CalculatedSharePrice__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__CalculatedSharePrice__c
     */
    public java.lang.Double getCapMan__CalculatedSharePrice__c() {
        return capMan__CalculatedSharePrice__c;
    }


    /**
     * Sets the capMan__CalculatedSharePrice__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__CalculatedSharePrice__c
     */
    public void setCapMan__CalculatedSharePrice__c(java.lang.Double capMan__CalculatedSharePrice__c) {
        this.capMan__CalculatedSharePrice__c = capMan__CalculatedSharePrice__c;
    }


    /**
     * Gets the capMan__CalculatorType__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__CalculatorType__c
     */
    public java.lang.String getCapMan__CalculatorType__c() {
        return capMan__CalculatorType__c;
    }


    /**
     * Sets the capMan__CalculatorType__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__CalculatorType__c
     */
    public void setCapMan__CalculatorType__c(java.lang.String capMan__CalculatorType__c) {
        this.capMan__CalculatorType__c = capMan__CalculatorType__c;
    }


    /**
     * Gets the capMan__Capitalization__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Capitalization__c
     */
    public java.lang.String getCapMan__Capitalization__c() {
        return capMan__Capitalization__c;
    }


    /**
     * Sets the capMan__Capitalization__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Capitalization__c
     */
    public void setCapMan__Capitalization__c(java.lang.String capMan__Capitalization__c) {
        this.capMan__Capitalization__c = capMan__Capitalization__c;
    }


    /**
     * Gets the capMan__Capitalization__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__Capitalization__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c getCapMan__Capitalization__r() {
        return capMan__Capitalization__r;
    }


    /**
     * Sets the capMan__Capitalization__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__Capitalization__r
     */
    public void setCapMan__Capitalization__r(com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Capitalization__r) {
        this.capMan__Capitalization__r = capMan__Capitalization__r;
    }


    /**
     * Gets the capMan__CloseDate__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__CloseDate__c
     */
    public java.util.Date getCapMan__CloseDate__c() {
        return capMan__CloseDate__c;
    }


    /**
     * Sets the capMan__CloseDate__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__CloseDate__c
     */
    public void setCapMan__CloseDate__c(java.util.Date capMan__CloseDate__c) {
        this.capMan__CloseDate__c = capMan__CloseDate__c;
    }


    /**
     * Gets the capMan__Co_Sale_Agreement__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Co_Sale_Agreement__c
     */
    public java.lang.String getCapMan__Co_Sale_Agreement__c() {
        return capMan__Co_Sale_Agreement__c;
    }


    /**
     * Sets the capMan__Co_Sale_Agreement__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Co_Sale_Agreement__c
     */
    public void setCapMan__Co_Sale_Agreement__c(java.lang.String capMan__Co_Sale_Agreement__c) {
        this.capMan__Co_Sale_Agreement__c = capMan__Co_Sale_Agreement__c;
    }


    /**
     * Gets the capMan__Conversion_Ratio__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Conversion_Ratio__c
     */
    public java.lang.Double getCapMan__Conversion_Ratio__c() {
        return capMan__Conversion_Ratio__c;
    }


    /**
     * Sets the capMan__Conversion_Ratio__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Conversion_Ratio__c
     */
    public void setCapMan__Conversion_Ratio__c(java.lang.Double capMan__Conversion_Ratio__c) {
        this.capMan__Conversion_Ratio__c = capMan__Conversion_Ratio__c;
    }


    /**
     * Gets the capMan__ConvertConvertibleDebt__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__ConvertConvertibleDebt__c
     */
    public java.lang.Boolean getCapMan__ConvertConvertibleDebt__c() {
        return capMan__ConvertConvertibleDebt__c;
    }


    /**
     * Sets the capMan__ConvertConvertibleDebt__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__ConvertConvertibleDebt__c
     */
    public void setCapMan__ConvertConvertibleDebt__c(java.lang.Boolean capMan__ConvertConvertibleDebt__c) {
        this.capMan__ConvertConvertibleDebt__c = capMan__ConvertConvertibleDebt__c;
    }


    /**
     * Gets the capMan__ConvertToSecurity__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__ConvertToSecurity__c
     */
    public java.lang.String getCapMan__ConvertToSecurity__c() {
        return capMan__ConvertToSecurity__c;
    }


    /**
     * Sets the capMan__ConvertToSecurity__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__ConvertToSecurity__c
     */
    public void setCapMan__ConvertToSecurity__c(java.lang.String capMan__ConvertToSecurity__c) {
        this.capMan__ConvertToSecurity__c = capMan__ConvertToSecurity__c;
    }


    /**
     * Gets the capMan__ConvertToSecurity__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__ConvertToSecurity__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Security__c getCapMan__ConvertToSecurity__r() {
        return capMan__ConvertToSecurity__r;
    }


    /**
     * Sets the capMan__ConvertToSecurity__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__ConvertToSecurity__r
     */
    public void setCapMan__ConvertToSecurity__r(com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__ConvertToSecurity__r) {
        this.capMan__ConvertToSecurity__r = capMan__ConvertToSecurity__r;
    }


    /**
     * Gets the capMan__Convert_Debt_Amount__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Convert_Debt_Amount__c
     */
    public java.lang.Double getCapMan__Convert_Debt_Amount__c() {
        return capMan__Convert_Debt_Amount__c;
    }


    /**
     * Sets the capMan__Convert_Debt_Amount__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Convert_Debt_Amount__c
     */
    public void setCapMan__Convert_Debt_Amount__c(java.lang.Double capMan__Convert_Debt_Amount__c) {
        this.capMan__Convert_Debt_Amount__c = capMan__Convert_Debt_Amount__c;
    }


    /**
     * Gets the capMan__Demand_Registration_Percent__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Demand_Registration_Percent__c
     */
    public java.lang.Double getCapMan__Demand_Registration_Percent__c() {
        return capMan__Demand_Registration_Percent__c;
    }


    /**
     * Sets the capMan__Demand_Registration_Percent__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Demand_Registration_Percent__c
     */
    public void setCapMan__Demand_Registration_Percent__c(java.lang.Double capMan__Demand_Registration_Percent__c) {
        this.capMan__Demand_Registration_Percent__c = capMan__Demand_Registration_Percent__c;
    }


    /**
     * Gets the capMan__Demand_Registration_Threshold__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Demand_Registration_Threshold__c
     */
    public java.lang.Double getCapMan__Demand_Registration_Threshold__c() {
        return capMan__Demand_Registration_Threshold__c;
    }


    /**
     * Sets the capMan__Demand_Registration_Threshold__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Demand_Registration_Threshold__c
     */
    public void setCapMan__Demand_Registration_Threshold__c(java.lang.Double capMan__Demand_Registration_Threshold__c) {
        this.capMan__Demand_Registration_Threshold__c = capMan__Demand_Registration_Threshold__c;
    }


    /**
     * Gets the capMan__EnterSharePrice2__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__EnterSharePrice2__c
     */
    public java.lang.Double getCapMan__EnterSharePrice2__c() {
        return capMan__EnterSharePrice2__c;
    }


    /**
     * Sets the capMan__EnterSharePrice2__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__EnterSharePrice2__c
     */
    public void setCapMan__EnterSharePrice2__c(java.lang.Double capMan__EnterSharePrice2__c) {
        this.capMan__EnterSharePrice2__c = capMan__EnterSharePrice2__c;
    }


    /**
     * Gets the capMan__EnterSharePrice__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__EnterSharePrice__c
     */
    public java.lang.Double getCapMan__EnterSharePrice__c() {
        return capMan__EnterSharePrice__c;
    }


    /**
     * Sets the capMan__EnterSharePrice__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__EnterSharePrice__c
     */
    public void setCapMan__EnterSharePrice__c(java.lang.Double capMan__EnterSharePrice__c) {
        this.capMan__EnterSharePrice__c = capMan__EnterSharePrice__c;
    }


    /**
     * Gets the capMan__Execution_days__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Execution_days__c
     */
    public java.lang.Double getCapMan__Execution_days__c() {
        return capMan__Execution_days__c;
    }


    /**
     * Sets the capMan__Execution_days__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Execution_days__c
     */
    public void setCapMan__Execution_days__c(java.lang.Double capMan__Execution_days__c) {
        this.capMan__Execution_days__c = capMan__Execution_days__c;
    }


    /**
     * Gets the capMan__Expected_Close_Date__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Expected_Close_Date__c
     */
    public java.util.Date getCapMan__Expected_Close_Date__c() {
        return capMan__Expected_Close_Date__c;
    }


    /**
     * Sets the capMan__Expected_Close_Date__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Expected_Close_Date__c
     */
    public void setCapMan__Expected_Close_Date__c(java.util.Date capMan__Expected_Close_Date__c) {
        this.capMan__Expected_Close_Date__c = capMan__Expected_Close_Date__c;
    }


    /**
     * Gets the capMan__FullyDilutedCalc__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__FullyDilutedCalc__c
     */
    public java.lang.Double getCapMan__FullyDilutedCalc__c() {
        return capMan__FullyDilutedCalc__c;
    }


    /**
     * Sets the capMan__FullyDilutedCalc__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__FullyDilutedCalc__c
     */
    public void setCapMan__FullyDilutedCalc__c(java.lang.Double capMan__FullyDilutedCalc__c) {
        this.capMan__FullyDilutedCalc__c = capMan__FullyDilutedCalc__c;
    }


    /**
     * Gets the capMan__FullyDilutedShares__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__FullyDilutedShares__c
     */
    public java.lang.Double getCapMan__FullyDilutedShares__c() {
        return capMan__FullyDilutedShares__c;
    }


    /**
     * Sets the capMan__FullyDilutedShares__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__FullyDilutedShares__c
     */
    public void setCapMan__FullyDilutedShares__c(java.lang.Double capMan__FullyDilutedShares__c) {
        this.capMan__FullyDilutedShares__c = capMan__FullyDilutedShares__c;
    }


    /**
     * Gets the capMan__FullyminusConvCalc__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__FullyminusConvCalc__c
     */
    public java.lang.Double getCapMan__FullyminusConvCalc__c() {
        return capMan__FullyminusConvCalc__c;
    }


    /**
     * Sets the capMan__FullyminusConvCalc__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__FullyminusConvCalc__c
     */
    public void setCapMan__FullyminusConvCalc__c(java.lang.Double capMan__FullyminusConvCalc__c) {
        this.capMan__FullyminusConvCalc__c = capMan__FullyminusConvCalc__c;
    }


    /**
     * Gets the capMan__Fundraising_Maximum__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Fundraising_Maximum__c
     */
    public java.lang.Double getCapMan__Fundraising_Maximum__c() {
        return capMan__Fundraising_Maximum__c;
    }


    /**
     * Sets the capMan__Fundraising_Maximum__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Fundraising_Maximum__c
     */
    public void setCapMan__Fundraising_Maximum__c(java.lang.Double capMan__Fundraising_Maximum__c) {
        this.capMan__Fundraising_Maximum__c = capMan__Fundraising_Maximum__c;
    }


    /**
     * Gets the capMan__Fundraising_Minimum__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Fundraising_Minimum__c
     */
    public java.lang.Double getCapMan__Fundraising_Minimum__c() {
        return capMan__Fundraising_Minimum__c;
    }


    /**
     * Sets the capMan__Fundraising_Minimum__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Fundraising_Minimum__c
     */
    public void setCapMan__Fundraising_Minimum__c(java.lang.Double capMan__Fundraising_Minimum__c) {
        this.capMan__Fundraising_Minimum__c = capMan__Fundraising_Minimum__c;
    }


    /**
     * Gets the capMan__Fundraising__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Fundraising__c
     */
    public java.lang.String getCapMan__Fundraising__c() {
        return capMan__Fundraising__c;
    }


    /**
     * Sets the capMan__Fundraising__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Fundraising__c
     */
    public void setCapMan__Fundraising__c(java.lang.String capMan__Fundraising__c) {
        this.capMan__Fundraising__c = capMan__Fundraising__c;
    }


    /**
     * Gets the capMan__Fundraising__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__Fundraising__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c getCapMan__Fundraising__r() {
        return capMan__Fundraising__r;
    }


    /**
     * Sets the capMan__Fundraising__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__Fundraising__r
     */
    public void setCapMan__Fundraising__r(com.sforce.soap.enterprise.sobject.CapMan__Fundraising__c capMan__Fundraising__r) {
        this.capMan__Fundraising__r = capMan__Fundraising__r;
    }


    /**
     * Gets the capMan__Fundraisings__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__Fundraisings__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Fundraisings__r() {
        return capMan__Fundraisings__r;
    }


    /**
     * Sets the capMan__Fundraisings__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__Fundraisings__r
     */
    public void setCapMan__Fundraisings__r(com.sforce.soap.enterprise.QueryResult capMan__Fundraisings__r) {
        this.capMan__Fundraisings__r = capMan__Fundraisings__r;
    }


    /**
     * Gets the capMan__ImputedNewShares__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__ImputedNewShares__c
     */
    public java.lang.Double getCapMan__ImputedNewShares__c() {
        return capMan__ImputedNewShares__c;
    }


    /**
     * Sets the capMan__ImputedNewShares__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__ImputedNewShares__c
     */
    public void setCapMan__ImputedNewShares__c(java.lang.Double capMan__ImputedNewShares__c) {
        this.capMan__ImputedNewShares__c = capMan__ImputedNewShares__c;
    }


    /**
     * Gets the capMan__Issuance_Name__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Issuance_Name__c
     */
    public java.lang.String getCapMan__Issuance_Name__c() {
        return capMan__Issuance_Name__c;
    }


    /**
     * Sets the capMan__Issuance_Name__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Issuance_Name__c
     */
    public void setCapMan__Issuance_Name__c(java.lang.String capMan__Issuance_Name__c) {
        this.capMan__Issuance_Name__c = capMan__Issuance_Name__c;
    }


    /**
     * Gets the capMan__IssueStatus__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__IssueStatus__c
     */
    public java.lang.String getCapMan__IssueStatus__c() {
        return capMan__IssueStatus__c;
    }


    /**
     * Sets the capMan__IssueStatus__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__IssueStatus__c
     */
    public void setCapMan__IssueStatus__c(java.lang.String capMan__IssueStatus__c) {
        this.capMan__IssueStatus__c = capMan__IssueStatus__c;
    }


    /**
     * Gets the capMan__Issue_Amount__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Issue_Amount__c
     */
    public java.lang.Double getCapMan__Issue_Amount__c() {
        return capMan__Issue_Amount__c;
    }


    /**
     * Sets the capMan__Issue_Amount__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Issue_Amount__c
     */
    public void setCapMan__Issue_Amount__c(java.lang.Double capMan__Issue_Amount__c) {
        this.capMan__Issue_Amount__c = capMan__Issue_Amount__c;
    }


    /**
     * Gets the capMan__Key_Employee_Compensation__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Key_Employee_Compensation__c
     */
    public java.lang.String getCapMan__Key_Employee_Compensation__c() {
        return capMan__Key_Employee_Compensation__c;
    }


    /**
     * Sets the capMan__Key_Employee_Compensation__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Key_Employee_Compensation__c
     */
    public void setCapMan__Key_Employee_Compensation__c(java.lang.String capMan__Key_Employee_Compensation__c) {
        this.capMan__Key_Employee_Compensation__c = capMan__Key_Employee_Compensation__c;
    }


    /**
     * Gets the capMan__Key_Employee_Severance__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Key_Employee_Severance__c
     */
    public java.lang.String getCapMan__Key_Employee_Severance__c() {
        return capMan__Key_Employee_Severance__c;
    }


    /**
     * Sets the capMan__Key_Employee_Severance__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Key_Employee_Severance__c
     */
    public void setCapMan__Key_Employee_Severance__c(java.lang.String capMan__Key_Employee_Severance__c) {
        this.capMan__Key_Employee_Severance__c = capMan__Key_Employee_Severance__c;
    }


    /**
     * Gets the capMan__LastUpdateTimestamp__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__LastUpdateTimestamp__c
     */
    public java.util.Date getCapMan__LastUpdateTimestamp__c() {
        return capMan__LastUpdateTimestamp__c;
    }


    /**
     * Sets the capMan__LastUpdateTimestamp__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__LastUpdateTimestamp__c
     */
    public void setCapMan__LastUpdateTimestamp__c(java.util.Date capMan__LastUpdateTimestamp__c) {
        this.capMan__LastUpdateTimestamp__c = capMan__LastUpdateTimestamp__c;
    }


    /**
     * Gets the capMan__Lead_Investor_List__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Lead_Investor_List__c
     */
    public java.lang.String getCapMan__Lead_Investor_List__c() {
        return capMan__Lead_Investor_List__c;
    }


    /**
     * Sets the capMan__Lead_Investor_List__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Lead_Investor_List__c
     */
    public void setCapMan__Lead_Investor_List__c(java.lang.String capMan__Lead_Investor_List__c) {
        this.capMan__Lead_Investor_List__c = capMan__Lead_Investor_List__c;
    }


    /**
     * Gets the capMan__Legal_Fees__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Legal_Fees__c
     */
    public java.lang.String getCapMan__Legal_Fees__c() {
        return capMan__Legal_Fees__c;
    }


    /**
     * Sets the capMan__Legal_Fees__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Legal_Fees__c
     */
    public void setCapMan__Legal_Fees__c(java.lang.String capMan__Legal_Fees__c) {
        this.capMan__Legal_Fees__c = capMan__Legal_Fees__c;
    }


    /**
     * Gets the capMan__NewPostMoneyShares__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__NewPostMoneyShares__c
     */
    public java.lang.Double getCapMan__NewPostMoneyShares__c() {
        return capMan__NewPostMoneyShares__c;
    }


    /**
     * Sets the capMan__NewPostMoneyShares__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__NewPostMoneyShares__c
     */
    public void setCapMan__NewPostMoneyShares__c(java.lang.Double capMan__NewPostMoneyShares__c) {
        this.capMan__NewPostMoneyShares__c = capMan__NewPostMoneyShares__c;
    }


    /**
     * Gets the capMan__NextFinancingDate__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__NextFinancingDate__c
     */
    public java.util.Date getCapMan__NextFinancingDate__c() {
        return capMan__NextFinancingDate__c;
    }


    /**
     * Sets the capMan__NextFinancingDate__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__NextFinancingDate__c
     */
    public void setCapMan__NextFinancingDate__c(java.util.Date capMan__NextFinancingDate__c) {
        this.capMan__NextFinancingDate__c = capMan__NextFinancingDate__c;
    }


    /**
     * Gets the capMan__No_Shop__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__No_Shop__c
     */
    public java.lang.Boolean getCapMan__No_Shop__c() {
        return capMan__No_Shop__c;
    }


    /**
     * Sets the capMan__No_Shop__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__No_Shop__c
     */
    public void setCapMan__No_Shop__c(java.lang.Boolean capMan__No_Shop__c) {
        this.capMan__No_Shop__c = capMan__No_Shop__c;
    }


    /**
     * Gets the capMan__OptionBump__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__OptionBump__c
     */
    public java.lang.Double getCapMan__OptionBump__c() {
        return capMan__OptionBump__c;
    }


    /**
     * Sets the capMan__OptionBump__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__OptionBump__c
     */
    public void setCapMan__OptionBump__c(java.lang.Double capMan__OptionBump__c) {
        this.capMan__OptionBump__c = capMan__OptionBump__c;
    }


    /**
     * Gets the capMan__OptionPlanTargetPct__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__OptionPlanTargetPct__c
     */
    public java.lang.Double getCapMan__OptionPlanTargetPct__c() {
        return capMan__OptionPlanTargetPct__c;
    }


    /**
     * Sets the capMan__OptionPlanTargetPct__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__OptionPlanTargetPct__c
     */
    public void setCapMan__OptionPlanTargetPct__c(java.lang.Double capMan__OptionPlanTargetPct__c) {
        this.capMan__OptionPlanTargetPct__c = capMan__OptionPlanTargetPct__c;
    }


    /**
     * Gets the capMan__OptionPlanTarget__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__OptionPlanTarget__c
     */
    public java.lang.String getCapMan__OptionPlanTarget__c() {
        return capMan__OptionPlanTarget__c;
    }


    /**
     * Sets the capMan__OptionPlanTarget__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__OptionPlanTarget__c
     */
    public void setCapMan__OptionPlanTarget__c(java.lang.String capMan__OptionPlanTarget__c) {
        this.capMan__OptionPlanTarget__c = capMan__OptionPlanTarget__c;
    }


    /**
     * Gets the capMan__OptionsAvailable__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__OptionsAvailable__c
     */
    public java.lang.Double getCapMan__OptionsAvailable__c() {
        return capMan__OptionsAvailable__c;
    }


    /**
     * Sets the capMan__OptionsAvailable__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__OptionsAvailable__c
     */
    public void setCapMan__OptionsAvailable__c(java.lang.Double capMan__OptionsAvailable__c) {
        this.capMan__OptionsAvailable__c = capMan__OptionsAvailable__c;
    }


    /**
     * Gets the capMan__OptionsOutstanding__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__OptionsOutstanding__c
     */
    public java.lang.Double getCapMan__OptionsOutstanding__c() {
        return capMan__OptionsOutstanding__c;
    }


    /**
     * Sets the capMan__OptionsOutstanding__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__OptionsOutstanding__c
     */
    public void setCapMan__OptionsOutstanding__c(java.lang.Double capMan__OptionsOutstanding__c) {
        this.capMan__OptionsOutstanding__c = capMan__OptionsOutstanding__c;
    }


    /**
     * Gets the capMan__Pay_to_Play_Links__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__Pay_to_Play_Links__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Pay_to_Play_Links__r() {
        return capMan__Pay_to_Play_Links__r;
    }


    /**
     * Sets the capMan__Pay_to_Play_Links__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__Pay_to_Play_Links__r
     */
    public void setCapMan__Pay_to_Play_Links__r(com.sforce.soap.enterprise.QueryResult capMan__Pay_to_Play_Links__r) {
        this.capMan__Pay_to_Play_Links__r = capMan__Pay_to_Play_Links__r;
    }


    /**
     * Gets the capMan__Pay_to_play__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Pay_to_play__c
     */
    public java.lang.Boolean getCapMan__Pay_to_play__c() {
        return capMan__Pay_to_play__c;
    }


    /**
     * Sets the capMan__Pay_to_play__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Pay_to_play__c
     */
    public void setCapMan__Pay_to_play__c(java.lang.Boolean capMan__Pay_to_play__c) {
        this.capMan__Pay_to_play__c = capMan__Pay_to_play__c;
    }


    /**
     * Gets the capMan__Percent_to_Amend__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Percent_to_Amend__c
     */
    public java.lang.Double getCapMan__Percent_to_Amend__c() {
        return capMan__Percent_to_Amend__c;
    }


    /**
     * Sets the capMan__Percent_to_Amend__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Percent_to_Amend__c
     */
    public void setCapMan__Percent_to_Amend__c(java.lang.Double capMan__Percent_to_Amend__c) {
        this.capMan__Percent_to_Amend__c = capMan__Percent_to_Amend__c;
    }


    /**
     * Gets the capMan__PostMoneyShare__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__PostMoneyShare__c
     */
    public java.lang.Double getCapMan__PostMoneyShare__c() {
        return capMan__PostMoneyShare__c;
    }


    /**
     * Sets the capMan__PostMoneyShare__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__PostMoneyShare__c
     */
    public void setCapMan__PostMoneyShare__c(java.lang.Double capMan__PostMoneyShare__c) {
        this.capMan__PostMoneyShare__c = capMan__PostMoneyShare__c;
    }


    /**
     * Gets the capMan__Post_Capitalization_Table__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__Post_Capitalization_Table__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Post_Capitalization_Table__r() {
        return capMan__Post_Capitalization_Table__r;
    }


    /**
     * Sets the capMan__Post_Capitalization_Table__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__Post_Capitalization_Table__r
     */
    public void setCapMan__Post_Capitalization_Table__r(com.sforce.soap.enterprise.QueryResult capMan__Post_Capitalization_Table__r) {
        this.capMan__Post_Capitalization_Table__r = capMan__Post_Capitalization_Table__r;
    }


    /**
     * Gets the capMan__PreMoneyShares__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__PreMoneyShares__c
     */
    public java.lang.Double getCapMan__PreMoneyShares__c() {
        return capMan__PreMoneyShares__c;
    }


    /**
     * Sets the capMan__PreMoneyShares__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__PreMoneyShares__c
     */
    public void setCapMan__PreMoneyShares__c(java.lang.Double capMan__PreMoneyShares__c) {
        this.capMan__PreMoneyShares__c = capMan__PreMoneyShares__c;
    }


    /**
     * Gets the capMan__Proposed_Issue_Amount__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Proposed_Issue_Amount__c
     */
    public java.lang.Double getCapMan__Proposed_Issue_Amount__c() {
        return capMan__Proposed_Issue_Amount__c;
    }


    /**
     * Sets the capMan__Proposed_Issue_Amount__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Proposed_Issue_Amount__c
     */
    public void setCapMan__Proposed_Issue_Amount__c(java.lang.Double capMan__Proposed_Issue_Amount__c) {
        this.capMan__Proposed_Issue_Amount__c = capMan__Proposed_Issue_Amount__c;
    }


    /**
     * Gets the capMan__Reserve_Capital__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Reserve_Capital__c
     */
    public java.lang.Double getCapMan__Reserve_Capital__c() {
        return capMan__Reserve_Capital__c;
    }


    /**
     * Sets the capMan__Reserve_Capital__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Reserve_Capital__c
     */
    public void setCapMan__Reserve_Capital__c(java.lang.Double capMan__Reserve_Capital__c) {
        this.capMan__Reserve_Capital__c = capMan__Reserve_Capital__c;
    }


    /**
     * Gets the capMan__Security_Name__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Security_Name__c
     */
    public java.lang.String getCapMan__Security_Name__c() {
        return capMan__Security_Name__c;
    }


    /**
     * Sets the capMan__Security_Name__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Security_Name__c
     */
    public void setCapMan__Security_Name__c(java.lang.String capMan__Security_Name__c) {
        this.capMan__Security_Name__c = capMan__Security_Name__c;
    }


    /**
     * Gets the capMan__Security_Type__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Security_Type__c
     */
    public java.lang.String getCapMan__Security_Type__c() {
        return capMan__Security_Type__c;
    }


    /**
     * Sets the capMan__Security_Type__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Security_Type__c
     */
    public void setCapMan__Security_Type__c(java.lang.String capMan__Security_Type__c) {
        this.capMan__Security_Type__c = capMan__Security_Type__c;
    }


    /**
     * Gets the capMan__Security__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Security__c
     */
    public java.lang.String getCapMan__Security__c() {
        return capMan__Security__c;
    }


    /**
     * Sets the capMan__Security__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Security__c
     */
    public void setCapMan__Security__c(java.lang.String capMan__Security__c) {
        this.capMan__Security__c = capMan__Security__c;
    }


    /**
     * Gets the capMan__Security__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__Security__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Security__c getCapMan__Security__r() {
        return capMan__Security__r;
    }


    /**
     * Sets the capMan__Security__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__Security__r
     */
    public void setCapMan__Security__r(com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Security__r) {
        this.capMan__Security__r = capMan__Security__r;
    }


    /**
     * Gets the capMan__Security_pref_Percent__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Security_pref_Percent__c
     */
    public java.lang.Double getCapMan__Security_pref_Percent__c() {
        return capMan__Security_pref_Percent__c;
    }


    /**
     * Sets the capMan__Security_pref_Percent__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Security_pref_Percent__c
     */
    public void setCapMan__Security_pref_Percent__c(java.lang.Double capMan__Security_pref_Percent__c) {
        this.capMan__Security_pref_Percent__c = capMan__Security_pref_Percent__c;
    }


    /**
     * Gets the capMan__Share_Price2__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Share_Price2__c
     */
    public java.lang.Double getCapMan__Share_Price2__c() {
        return capMan__Share_Price2__c;
    }


    /**
     * Sets the capMan__Share_Price2__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Share_Price2__c
     */
    public void setCapMan__Share_Price2__c(java.lang.Double capMan__Share_Price2__c) {
        this.capMan__Share_Price2__c = capMan__Share_Price2__c;
    }


    /**
     * Gets the capMan__Share_Price__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Share_Price__c
     */
    public java.lang.Double getCapMan__Share_Price__c() {
        return capMan__Share_Price__c;
    }


    /**
     * Sets the capMan__Share_Price__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Share_Price__c
     */
    public void setCapMan__Share_Price__c(java.lang.Double capMan__Share_Price__c) {
        this.capMan__Share_Price__c = capMan__Share_Price__c;
    }


    /**
     * Gets the capMan__SharesIssued__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__SharesIssued__c
     */
    public java.lang.Double getCapMan__SharesIssued__c() {
        return capMan__SharesIssued__c;
    }


    /**
     * Sets the capMan__SharesIssued__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__SharesIssued__c
     */
    public void setCapMan__SharesIssued__c(java.lang.Double capMan__SharesIssued__c) {
        this.capMan__SharesIssued__c = capMan__SharesIssued__c;
    }


    /**
     * Gets the capMan__Term_Sheet_Date__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Term_Sheet_Date__c
     */
    public java.util.Date getCapMan__Term_Sheet_Date__c() {
        return capMan__Term_Sheet_Date__c;
    }


    /**
     * Sets the capMan__Term_Sheet_Date__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Term_Sheet_Date__c
     */
    public void setCapMan__Term_Sheet_Date__c(java.util.Date capMan__Term_Sheet_Date__c) {
        this.capMan__Term_Sheet_Date__c = capMan__Term_Sheet_Date__c;
    }


    /**
     * Gets the capMan__Term_Sheet_Expiration__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Term_Sheet_Expiration__c
     */
    public java.util.Date getCapMan__Term_Sheet_Expiration__c() {
        return capMan__Term_Sheet_Expiration__c;
    }


    /**
     * Sets the capMan__Term_Sheet_Expiration__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Term_Sheet_Expiration__c
     */
    public void setCapMan__Term_Sheet_Expiration__c(java.util.Date capMan__Term_Sheet_Expiration__c) {
        this.capMan__Term_Sheet_Expiration__c = capMan__Term_Sheet_Expiration__c;
    }


    /**
     * Gets the capMan__Total_Amount_Raised__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Total_Amount_Raised__c
     */
    public java.lang.Double getCapMan__Total_Amount_Raised__c() {
        return capMan__Total_Amount_Raised__c;
    }


    /**
     * Sets the capMan__Total_Amount_Raised__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Total_Amount_Raised__c
     */
    public void setCapMan__Total_Amount_Raised__c(java.lang.Double capMan__Total_Amount_Raised__c) {
        this.capMan__Total_Amount_Raised__c = capMan__Total_Amount_Raised__c;
    }


    /**
     * Gets the capMan__Transactions__r value for this CapMan__Issuance__c.
     * 
     * @return capMan__Transactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Transactions__r() {
        return capMan__Transactions__r;
    }


    /**
     * Sets the capMan__Transactions__r value for this CapMan__Issuance__c.
     * 
     * @param capMan__Transactions__r
     */
    public void setCapMan__Transactions__r(com.sforce.soap.enterprise.QueryResult capMan__Transactions__r) {
        this.capMan__Transactions__r = capMan__Transactions__r;
    }


    /**
     * Gets the capMan__UpdateOnly__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__UpdateOnly__c
     */
    public java.lang.Boolean getCapMan__UpdateOnly__c() {
        return capMan__UpdateOnly__c;
    }


    /**
     * Sets the capMan__UpdateOnly__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__UpdateOnly__c
     */
    public void setCapMan__UpdateOnly__c(java.lang.Boolean capMan__UpdateOnly__c) {
        this.capMan__UpdateOnly__c = capMan__UpdateOnly__c;
    }


    /**
     * Gets the capMan__Use_of_Proceeds__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Use_of_Proceeds__c
     */
    public java.lang.String getCapMan__Use_of_Proceeds__c() {
        return capMan__Use_of_Proceeds__c;
    }


    /**
     * Sets the capMan__Use_of_Proceeds__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Use_of_Proceeds__c
     */
    public void setCapMan__Use_of_Proceeds__c(java.lang.String capMan__Use_of_Proceeds__c) {
        this.capMan__Use_of_Proceeds__c = capMan__Use_of_Proceeds__c;
    }


    /**
     * Gets the capMan__ValuationMethod__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__ValuationMethod__c
     */
    public java.lang.String getCapMan__ValuationMethod__c() {
        return capMan__ValuationMethod__c;
    }


    /**
     * Sets the capMan__ValuationMethod__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__ValuationMethod__c
     */
    public void setCapMan__ValuationMethod__c(java.lang.String capMan__ValuationMethod__c) {
        this.capMan__ValuationMethod__c = capMan__ValuationMethod__c;
    }


    /**
     * Gets the capMan__Valuation__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Valuation__c
     */
    public java.lang.Double getCapMan__Valuation__c() {
        return capMan__Valuation__c;
    }


    /**
     * Sets the capMan__Valuation__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Valuation__c
     */
    public void setCapMan__Valuation__c(java.lang.Double capMan__Valuation__c) {
        this.capMan__Valuation__c = capMan__Valuation__c;
    }


    /**
     * Gets the capMan__Waive_All_Anti_Dilution__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__Waive_All_Anti_Dilution__c
     */
    public java.lang.Boolean getCapMan__Waive_All_Anti_Dilution__c() {
        return capMan__Waive_All_Anti_Dilution__c;
    }


    /**
     * Sets the capMan__Waive_All_Anti_Dilution__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__Waive_All_Anti_Dilution__c
     */
    public void setCapMan__Waive_All_Anti_Dilution__c(java.lang.Boolean capMan__Waive_All_Anti_Dilution__c) {
        this.capMan__Waive_All_Anti_Dilution__c = capMan__Waive_All_Anti_Dilution__c;
    }


    /**
     * Gets the capMan__include_earlier_issuance__c value for this CapMan__Issuance__c.
     * 
     * @return capMan__include_earlier_issuance__c
     */
    public java.lang.Boolean getCapMan__include_earlier_issuance__c() {
        return capMan__include_earlier_issuance__c;
    }


    /**
     * Sets the capMan__include_earlier_issuance__c value for this CapMan__Issuance__c.
     * 
     * @param capMan__include_earlier_issuance__c
     */
    public void setCapMan__include_earlier_issuance__c(java.lang.Boolean capMan__include_earlier_issuance__c) {
        this.capMan__include_earlier_issuance__c = capMan__include_earlier_issuance__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Issuance__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Issuance__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Issuance__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Issuance__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Issuance__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Issuance__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Issuance__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Issuance__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__Issuance__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__Issuance__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Issuance__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Issuance__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CapMan__Issuance__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__Issuance__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__Issuance__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Issuance__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__Issuance__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__Issuance__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Issuance__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Issuance__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Issuance__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Issuance__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Issuance__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Issuance__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Issuance__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Issuance__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Issuance__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Issuance__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Issuance__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Issuance__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__Issuance__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__Issuance__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this CapMan__Issuance__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__Issuance__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__Issuance__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__Issuance__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__Issuance__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Issuance__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Issuance__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Issuance__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this CapMan__Issuance__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this CapMan__Issuance__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this CapMan__Issuance__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this CapMan__Issuance__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Issuance__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Issuance__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__Issuance__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__Issuance__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Issuance__c)) return false;
        CapMan__Issuance__c other = (CapMan__Issuance__c) obj;
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
            ((this.capMan__Account_Address__c==null && other.getCapMan__Account_Address__c()==null) || 
             (this.capMan__Account_Address__c!=null &&
              this.capMan__Account_Address__c.equals(other.getCapMan__Account_Address__c()))) &&
            ((this.capMan__Account_Name__c==null && other.getCapMan__Account_Name__c()==null) || 
             (this.capMan__Account_Name__c!=null &&
              this.capMan__Account_Name__c.equals(other.getCapMan__Account_Name__c()))) &&
            ((this.capMan__Accrued_Dividend__c==null && other.getCapMan__Accrued_Dividend__c()==null) || 
             (this.capMan__Accrued_Dividend__c!=null &&
              this.capMan__Accrued_Dividend__c.equals(other.getCapMan__Accrued_Dividend__c()))) &&
            ((this.capMan__AmountIssued__c==null && other.getCapMan__AmountIssued__c()==null) || 
             (this.capMan__AmountIssued__c!=null &&
              this.capMan__AmountIssued__c.equals(other.getCapMan__AmountIssued__c()))) &&
            ((this.capMan__AsConvertedDebt__c==null && other.getCapMan__AsConvertedDebt__c()==null) || 
             (this.capMan__AsConvertedDebt__c!=null &&
              this.capMan__AsConvertedDebt__c.equals(other.getCapMan__AsConvertedDebt__c()))) &&
            ((this.capMan__Board_Approvals__c==null && other.getCapMan__Board_Approvals__c()==null) || 
             (this.capMan__Board_Approvals__c!=null &&
              this.capMan__Board_Approvals__c.equals(other.getCapMan__Board_Approvals__c()))) &&
            ((this.capMan__Board_of_Directors__c==null && other.getCapMan__Board_of_Directors__c()==null) || 
             (this.capMan__Board_of_Directors__c!=null &&
              this.capMan__Board_of_Directors__c.equals(other.getCapMan__Board_of_Directors__c()))) &&
            ((this.capMan__CalculatedSharePrice2__c==null && other.getCapMan__CalculatedSharePrice2__c()==null) || 
             (this.capMan__CalculatedSharePrice2__c!=null &&
              this.capMan__CalculatedSharePrice2__c.equals(other.getCapMan__CalculatedSharePrice2__c()))) &&
            ((this.capMan__CalculatedSharePrice__c==null && other.getCapMan__CalculatedSharePrice__c()==null) || 
             (this.capMan__CalculatedSharePrice__c!=null &&
              this.capMan__CalculatedSharePrice__c.equals(other.getCapMan__CalculatedSharePrice__c()))) &&
            ((this.capMan__CalculatorType__c==null && other.getCapMan__CalculatorType__c()==null) || 
             (this.capMan__CalculatorType__c!=null &&
              this.capMan__CalculatorType__c.equals(other.getCapMan__CalculatorType__c()))) &&
            ((this.capMan__Capitalization__c==null && other.getCapMan__Capitalization__c()==null) || 
             (this.capMan__Capitalization__c!=null &&
              this.capMan__Capitalization__c.equals(other.getCapMan__Capitalization__c()))) &&
            ((this.capMan__Capitalization__r==null && other.getCapMan__Capitalization__r()==null) || 
             (this.capMan__Capitalization__r!=null &&
              this.capMan__Capitalization__r.equals(other.getCapMan__Capitalization__r()))) &&
            ((this.capMan__CloseDate__c==null && other.getCapMan__CloseDate__c()==null) || 
             (this.capMan__CloseDate__c!=null &&
              this.capMan__CloseDate__c.equals(other.getCapMan__CloseDate__c()))) &&
            ((this.capMan__Co_Sale_Agreement__c==null && other.getCapMan__Co_Sale_Agreement__c()==null) || 
             (this.capMan__Co_Sale_Agreement__c!=null &&
              this.capMan__Co_Sale_Agreement__c.equals(other.getCapMan__Co_Sale_Agreement__c()))) &&
            ((this.capMan__Conversion_Ratio__c==null && other.getCapMan__Conversion_Ratio__c()==null) || 
             (this.capMan__Conversion_Ratio__c!=null &&
              this.capMan__Conversion_Ratio__c.equals(other.getCapMan__Conversion_Ratio__c()))) &&
            ((this.capMan__ConvertConvertibleDebt__c==null && other.getCapMan__ConvertConvertibleDebt__c()==null) || 
             (this.capMan__ConvertConvertibleDebt__c!=null &&
              this.capMan__ConvertConvertibleDebt__c.equals(other.getCapMan__ConvertConvertibleDebt__c()))) &&
            ((this.capMan__ConvertToSecurity__c==null && other.getCapMan__ConvertToSecurity__c()==null) || 
             (this.capMan__ConvertToSecurity__c!=null &&
              this.capMan__ConvertToSecurity__c.equals(other.getCapMan__ConvertToSecurity__c()))) &&
            ((this.capMan__ConvertToSecurity__r==null && other.getCapMan__ConvertToSecurity__r()==null) || 
             (this.capMan__ConvertToSecurity__r!=null &&
              this.capMan__ConvertToSecurity__r.equals(other.getCapMan__ConvertToSecurity__r()))) &&
            ((this.capMan__Convert_Debt_Amount__c==null && other.getCapMan__Convert_Debt_Amount__c()==null) || 
             (this.capMan__Convert_Debt_Amount__c!=null &&
              this.capMan__Convert_Debt_Amount__c.equals(other.getCapMan__Convert_Debt_Amount__c()))) &&
            ((this.capMan__Demand_Registration_Percent__c==null && other.getCapMan__Demand_Registration_Percent__c()==null) || 
             (this.capMan__Demand_Registration_Percent__c!=null &&
              this.capMan__Demand_Registration_Percent__c.equals(other.getCapMan__Demand_Registration_Percent__c()))) &&
            ((this.capMan__Demand_Registration_Threshold__c==null && other.getCapMan__Demand_Registration_Threshold__c()==null) || 
             (this.capMan__Demand_Registration_Threshold__c!=null &&
              this.capMan__Demand_Registration_Threshold__c.equals(other.getCapMan__Demand_Registration_Threshold__c()))) &&
            ((this.capMan__EnterSharePrice2__c==null && other.getCapMan__EnterSharePrice2__c()==null) || 
             (this.capMan__EnterSharePrice2__c!=null &&
              this.capMan__EnterSharePrice2__c.equals(other.getCapMan__EnterSharePrice2__c()))) &&
            ((this.capMan__EnterSharePrice__c==null && other.getCapMan__EnterSharePrice__c()==null) || 
             (this.capMan__EnterSharePrice__c!=null &&
              this.capMan__EnterSharePrice__c.equals(other.getCapMan__EnterSharePrice__c()))) &&
            ((this.capMan__Execution_days__c==null && other.getCapMan__Execution_days__c()==null) || 
             (this.capMan__Execution_days__c!=null &&
              this.capMan__Execution_days__c.equals(other.getCapMan__Execution_days__c()))) &&
            ((this.capMan__Expected_Close_Date__c==null && other.getCapMan__Expected_Close_Date__c()==null) || 
             (this.capMan__Expected_Close_Date__c!=null &&
              this.capMan__Expected_Close_Date__c.equals(other.getCapMan__Expected_Close_Date__c()))) &&
            ((this.capMan__FullyDilutedCalc__c==null && other.getCapMan__FullyDilutedCalc__c()==null) || 
             (this.capMan__FullyDilutedCalc__c!=null &&
              this.capMan__FullyDilutedCalc__c.equals(other.getCapMan__FullyDilutedCalc__c()))) &&
            ((this.capMan__FullyDilutedShares__c==null && other.getCapMan__FullyDilutedShares__c()==null) || 
             (this.capMan__FullyDilutedShares__c!=null &&
              this.capMan__FullyDilutedShares__c.equals(other.getCapMan__FullyDilutedShares__c()))) &&
            ((this.capMan__FullyminusConvCalc__c==null && other.getCapMan__FullyminusConvCalc__c()==null) || 
             (this.capMan__FullyminusConvCalc__c!=null &&
              this.capMan__FullyminusConvCalc__c.equals(other.getCapMan__FullyminusConvCalc__c()))) &&
            ((this.capMan__Fundraising_Maximum__c==null && other.getCapMan__Fundraising_Maximum__c()==null) || 
             (this.capMan__Fundraising_Maximum__c!=null &&
              this.capMan__Fundraising_Maximum__c.equals(other.getCapMan__Fundraising_Maximum__c()))) &&
            ((this.capMan__Fundraising_Minimum__c==null && other.getCapMan__Fundraising_Minimum__c()==null) || 
             (this.capMan__Fundraising_Minimum__c!=null &&
              this.capMan__Fundraising_Minimum__c.equals(other.getCapMan__Fundraising_Minimum__c()))) &&
            ((this.capMan__Fundraising__c==null && other.getCapMan__Fundraising__c()==null) || 
             (this.capMan__Fundraising__c!=null &&
              this.capMan__Fundraising__c.equals(other.getCapMan__Fundraising__c()))) &&
            ((this.capMan__Fundraising__r==null && other.getCapMan__Fundraising__r()==null) || 
             (this.capMan__Fundraising__r!=null &&
              this.capMan__Fundraising__r.equals(other.getCapMan__Fundraising__r()))) &&
            ((this.capMan__Fundraisings__r==null && other.getCapMan__Fundraisings__r()==null) || 
             (this.capMan__Fundraisings__r!=null &&
              this.capMan__Fundraisings__r.equals(other.getCapMan__Fundraisings__r()))) &&
            ((this.capMan__ImputedNewShares__c==null && other.getCapMan__ImputedNewShares__c()==null) || 
             (this.capMan__ImputedNewShares__c!=null &&
              this.capMan__ImputedNewShares__c.equals(other.getCapMan__ImputedNewShares__c()))) &&
            ((this.capMan__Issuance_Name__c==null && other.getCapMan__Issuance_Name__c()==null) || 
             (this.capMan__Issuance_Name__c!=null &&
              this.capMan__Issuance_Name__c.equals(other.getCapMan__Issuance_Name__c()))) &&
            ((this.capMan__IssueStatus__c==null && other.getCapMan__IssueStatus__c()==null) || 
             (this.capMan__IssueStatus__c!=null &&
              this.capMan__IssueStatus__c.equals(other.getCapMan__IssueStatus__c()))) &&
            ((this.capMan__Issue_Amount__c==null && other.getCapMan__Issue_Amount__c()==null) || 
             (this.capMan__Issue_Amount__c!=null &&
              this.capMan__Issue_Amount__c.equals(other.getCapMan__Issue_Amount__c()))) &&
            ((this.capMan__Key_Employee_Compensation__c==null && other.getCapMan__Key_Employee_Compensation__c()==null) || 
             (this.capMan__Key_Employee_Compensation__c!=null &&
              this.capMan__Key_Employee_Compensation__c.equals(other.getCapMan__Key_Employee_Compensation__c()))) &&
            ((this.capMan__Key_Employee_Severance__c==null && other.getCapMan__Key_Employee_Severance__c()==null) || 
             (this.capMan__Key_Employee_Severance__c!=null &&
              this.capMan__Key_Employee_Severance__c.equals(other.getCapMan__Key_Employee_Severance__c()))) &&
            ((this.capMan__LastUpdateTimestamp__c==null && other.getCapMan__LastUpdateTimestamp__c()==null) || 
             (this.capMan__LastUpdateTimestamp__c!=null &&
              this.capMan__LastUpdateTimestamp__c.equals(other.getCapMan__LastUpdateTimestamp__c()))) &&
            ((this.capMan__Lead_Investor_List__c==null && other.getCapMan__Lead_Investor_List__c()==null) || 
             (this.capMan__Lead_Investor_List__c!=null &&
              this.capMan__Lead_Investor_List__c.equals(other.getCapMan__Lead_Investor_List__c()))) &&
            ((this.capMan__Legal_Fees__c==null && other.getCapMan__Legal_Fees__c()==null) || 
             (this.capMan__Legal_Fees__c!=null &&
              this.capMan__Legal_Fees__c.equals(other.getCapMan__Legal_Fees__c()))) &&
            ((this.capMan__NewPostMoneyShares__c==null && other.getCapMan__NewPostMoneyShares__c()==null) || 
             (this.capMan__NewPostMoneyShares__c!=null &&
              this.capMan__NewPostMoneyShares__c.equals(other.getCapMan__NewPostMoneyShares__c()))) &&
            ((this.capMan__NextFinancingDate__c==null && other.getCapMan__NextFinancingDate__c()==null) || 
             (this.capMan__NextFinancingDate__c!=null &&
              this.capMan__NextFinancingDate__c.equals(other.getCapMan__NextFinancingDate__c()))) &&
            ((this.capMan__No_Shop__c==null && other.getCapMan__No_Shop__c()==null) || 
             (this.capMan__No_Shop__c!=null &&
              this.capMan__No_Shop__c.equals(other.getCapMan__No_Shop__c()))) &&
            ((this.capMan__OptionBump__c==null && other.getCapMan__OptionBump__c()==null) || 
             (this.capMan__OptionBump__c!=null &&
              this.capMan__OptionBump__c.equals(other.getCapMan__OptionBump__c()))) &&
            ((this.capMan__OptionPlanTargetPct__c==null && other.getCapMan__OptionPlanTargetPct__c()==null) || 
             (this.capMan__OptionPlanTargetPct__c!=null &&
              this.capMan__OptionPlanTargetPct__c.equals(other.getCapMan__OptionPlanTargetPct__c()))) &&
            ((this.capMan__OptionPlanTarget__c==null && other.getCapMan__OptionPlanTarget__c()==null) || 
             (this.capMan__OptionPlanTarget__c!=null &&
              this.capMan__OptionPlanTarget__c.equals(other.getCapMan__OptionPlanTarget__c()))) &&
            ((this.capMan__OptionsAvailable__c==null && other.getCapMan__OptionsAvailable__c()==null) || 
             (this.capMan__OptionsAvailable__c!=null &&
              this.capMan__OptionsAvailable__c.equals(other.getCapMan__OptionsAvailable__c()))) &&
            ((this.capMan__OptionsOutstanding__c==null && other.getCapMan__OptionsOutstanding__c()==null) || 
             (this.capMan__OptionsOutstanding__c!=null &&
              this.capMan__OptionsOutstanding__c.equals(other.getCapMan__OptionsOutstanding__c()))) &&
            ((this.capMan__Pay_to_Play_Links__r==null && other.getCapMan__Pay_to_Play_Links__r()==null) || 
             (this.capMan__Pay_to_Play_Links__r!=null &&
              this.capMan__Pay_to_Play_Links__r.equals(other.getCapMan__Pay_to_Play_Links__r()))) &&
            ((this.capMan__Pay_to_play__c==null && other.getCapMan__Pay_to_play__c()==null) || 
             (this.capMan__Pay_to_play__c!=null &&
              this.capMan__Pay_to_play__c.equals(other.getCapMan__Pay_to_play__c()))) &&
            ((this.capMan__Percent_to_Amend__c==null && other.getCapMan__Percent_to_Amend__c()==null) || 
             (this.capMan__Percent_to_Amend__c!=null &&
              this.capMan__Percent_to_Amend__c.equals(other.getCapMan__Percent_to_Amend__c()))) &&
            ((this.capMan__PostMoneyShare__c==null && other.getCapMan__PostMoneyShare__c()==null) || 
             (this.capMan__PostMoneyShare__c!=null &&
              this.capMan__PostMoneyShare__c.equals(other.getCapMan__PostMoneyShare__c()))) &&
            ((this.capMan__Post_Capitalization_Table__r==null && other.getCapMan__Post_Capitalization_Table__r()==null) || 
             (this.capMan__Post_Capitalization_Table__r!=null &&
              this.capMan__Post_Capitalization_Table__r.equals(other.getCapMan__Post_Capitalization_Table__r()))) &&
            ((this.capMan__PreMoneyShares__c==null && other.getCapMan__PreMoneyShares__c()==null) || 
             (this.capMan__PreMoneyShares__c!=null &&
              this.capMan__PreMoneyShares__c.equals(other.getCapMan__PreMoneyShares__c()))) &&
            ((this.capMan__Proposed_Issue_Amount__c==null && other.getCapMan__Proposed_Issue_Amount__c()==null) || 
             (this.capMan__Proposed_Issue_Amount__c!=null &&
              this.capMan__Proposed_Issue_Amount__c.equals(other.getCapMan__Proposed_Issue_Amount__c()))) &&
            ((this.capMan__Reserve_Capital__c==null && other.getCapMan__Reserve_Capital__c()==null) || 
             (this.capMan__Reserve_Capital__c!=null &&
              this.capMan__Reserve_Capital__c.equals(other.getCapMan__Reserve_Capital__c()))) &&
            ((this.capMan__Security_Name__c==null && other.getCapMan__Security_Name__c()==null) || 
             (this.capMan__Security_Name__c!=null &&
              this.capMan__Security_Name__c.equals(other.getCapMan__Security_Name__c()))) &&
            ((this.capMan__Security_Type__c==null && other.getCapMan__Security_Type__c()==null) || 
             (this.capMan__Security_Type__c!=null &&
              this.capMan__Security_Type__c.equals(other.getCapMan__Security_Type__c()))) &&
            ((this.capMan__Security__c==null && other.getCapMan__Security__c()==null) || 
             (this.capMan__Security__c!=null &&
              this.capMan__Security__c.equals(other.getCapMan__Security__c()))) &&
            ((this.capMan__Security__r==null && other.getCapMan__Security__r()==null) || 
             (this.capMan__Security__r!=null &&
              this.capMan__Security__r.equals(other.getCapMan__Security__r()))) &&
            ((this.capMan__Security_pref_Percent__c==null && other.getCapMan__Security_pref_Percent__c()==null) || 
             (this.capMan__Security_pref_Percent__c!=null &&
              this.capMan__Security_pref_Percent__c.equals(other.getCapMan__Security_pref_Percent__c()))) &&
            ((this.capMan__Share_Price2__c==null && other.getCapMan__Share_Price2__c()==null) || 
             (this.capMan__Share_Price2__c!=null &&
              this.capMan__Share_Price2__c.equals(other.getCapMan__Share_Price2__c()))) &&
            ((this.capMan__Share_Price__c==null && other.getCapMan__Share_Price__c()==null) || 
             (this.capMan__Share_Price__c!=null &&
              this.capMan__Share_Price__c.equals(other.getCapMan__Share_Price__c()))) &&
            ((this.capMan__SharesIssued__c==null && other.getCapMan__SharesIssued__c()==null) || 
             (this.capMan__SharesIssued__c!=null &&
              this.capMan__SharesIssued__c.equals(other.getCapMan__SharesIssued__c()))) &&
            ((this.capMan__Term_Sheet_Date__c==null && other.getCapMan__Term_Sheet_Date__c()==null) || 
             (this.capMan__Term_Sheet_Date__c!=null &&
              this.capMan__Term_Sheet_Date__c.equals(other.getCapMan__Term_Sheet_Date__c()))) &&
            ((this.capMan__Term_Sheet_Expiration__c==null && other.getCapMan__Term_Sheet_Expiration__c()==null) || 
             (this.capMan__Term_Sheet_Expiration__c!=null &&
              this.capMan__Term_Sheet_Expiration__c.equals(other.getCapMan__Term_Sheet_Expiration__c()))) &&
            ((this.capMan__Total_Amount_Raised__c==null && other.getCapMan__Total_Amount_Raised__c()==null) || 
             (this.capMan__Total_Amount_Raised__c!=null &&
              this.capMan__Total_Amount_Raised__c.equals(other.getCapMan__Total_Amount_Raised__c()))) &&
            ((this.capMan__Transactions__r==null && other.getCapMan__Transactions__r()==null) || 
             (this.capMan__Transactions__r!=null &&
              this.capMan__Transactions__r.equals(other.getCapMan__Transactions__r()))) &&
            ((this.capMan__UpdateOnly__c==null && other.getCapMan__UpdateOnly__c()==null) || 
             (this.capMan__UpdateOnly__c!=null &&
              this.capMan__UpdateOnly__c.equals(other.getCapMan__UpdateOnly__c()))) &&
            ((this.capMan__Use_of_Proceeds__c==null && other.getCapMan__Use_of_Proceeds__c()==null) || 
             (this.capMan__Use_of_Proceeds__c!=null &&
              this.capMan__Use_of_Proceeds__c.equals(other.getCapMan__Use_of_Proceeds__c()))) &&
            ((this.capMan__ValuationMethod__c==null && other.getCapMan__ValuationMethod__c()==null) || 
             (this.capMan__ValuationMethod__c!=null &&
              this.capMan__ValuationMethod__c.equals(other.getCapMan__ValuationMethod__c()))) &&
            ((this.capMan__Valuation__c==null && other.getCapMan__Valuation__c()==null) || 
             (this.capMan__Valuation__c!=null &&
              this.capMan__Valuation__c.equals(other.getCapMan__Valuation__c()))) &&
            ((this.capMan__Waive_All_Anti_Dilution__c==null && other.getCapMan__Waive_All_Anti_Dilution__c()==null) || 
             (this.capMan__Waive_All_Anti_Dilution__c!=null &&
              this.capMan__Waive_All_Anti_Dilution__c.equals(other.getCapMan__Waive_All_Anti_Dilution__c()))) &&
            ((this.capMan__include_earlier_issuance__c==null && other.getCapMan__include_earlier_issuance__c()==null) || 
             (this.capMan__include_earlier_issuance__c!=null &&
              this.capMan__include_earlier_issuance__c.equals(other.getCapMan__include_earlier_issuance__c()))) &&
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
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
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
        if (getCapMan__Account_Address__c() != null) {
            _hashCode += getCapMan__Account_Address__c().hashCode();
        }
        if (getCapMan__Account_Name__c() != null) {
            _hashCode += getCapMan__Account_Name__c().hashCode();
        }
        if (getCapMan__Accrued_Dividend__c() != null) {
            _hashCode += getCapMan__Accrued_Dividend__c().hashCode();
        }
        if (getCapMan__AmountIssued__c() != null) {
            _hashCode += getCapMan__AmountIssued__c().hashCode();
        }
        if (getCapMan__AsConvertedDebt__c() != null) {
            _hashCode += getCapMan__AsConvertedDebt__c().hashCode();
        }
        if (getCapMan__Board_Approvals__c() != null) {
            _hashCode += getCapMan__Board_Approvals__c().hashCode();
        }
        if (getCapMan__Board_of_Directors__c() != null) {
            _hashCode += getCapMan__Board_of_Directors__c().hashCode();
        }
        if (getCapMan__CalculatedSharePrice2__c() != null) {
            _hashCode += getCapMan__CalculatedSharePrice2__c().hashCode();
        }
        if (getCapMan__CalculatedSharePrice__c() != null) {
            _hashCode += getCapMan__CalculatedSharePrice__c().hashCode();
        }
        if (getCapMan__CalculatorType__c() != null) {
            _hashCode += getCapMan__CalculatorType__c().hashCode();
        }
        if (getCapMan__Capitalization__c() != null) {
            _hashCode += getCapMan__Capitalization__c().hashCode();
        }
        if (getCapMan__Capitalization__r() != null) {
            _hashCode += getCapMan__Capitalization__r().hashCode();
        }
        if (getCapMan__CloseDate__c() != null) {
            _hashCode += getCapMan__CloseDate__c().hashCode();
        }
        if (getCapMan__Co_Sale_Agreement__c() != null) {
            _hashCode += getCapMan__Co_Sale_Agreement__c().hashCode();
        }
        if (getCapMan__Conversion_Ratio__c() != null) {
            _hashCode += getCapMan__Conversion_Ratio__c().hashCode();
        }
        if (getCapMan__ConvertConvertibleDebt__c() != null) {
            _hashCode += getCapMan__ConvertConvertibleDebt__c().hashCode();
        }
        if (getCapMan__ConvertToSecurity__c() != null) {
            _hashCode += getCapMan__ConvertToSecurity__c().hashCode();
        }
        if (getCapMan__ConvertToSecurity__r() != null) {
            _hashCode += getCapMan__ConvertToSecurity__r().hashCode();
        }
        if (getCapMan__Convert_Debt_Amount__c() != null) {
            _hashCode += getCapMan__Convert_Debt_Amount__c().hashCode();
        }
        if (getCapMan__Demand_Registration_Percent__c() != null) {
            _hashCode += getCapMan__Demand_Registration_Percent__c().hashCode();
        }
        if (getCapMan__Demand_Registration_Threshold__c() != null) {
            _hashCode += getCapMan__Demand_Registration_Threshold__c().hashCode();
        }
        if (getCapMan__EnterSharePrice2__c() != null) {
            _hashCode += getCapMan__EnterSharePrice2__c().hashCode();
        }
        if (getCapMan__EnterSharePrice__c() != null) {
            _hashCode += getCapMan__EnterSharePrice__c().hashCode();
        }
        if (getCapMan__Execution_days__c() != null) {
            _hashCode += getCapMan__Execution_days__c().hashCode();
        }
        if (getCapMan__Expected_Close_Date__c() != null) {
            _hashCode += getCapMan__Expected_Close_Date__c().hashCode();
        }
        if (getCapMan__FullyDilutedCalc__c() != null) {
            _hashCode += getCapMan__FullyDilutedCalc__c().hashCode();
        }
        if (getCapMan__FullyDilutedShares__c() != null) {
            _hashCode += getCapMan__FullyDilutedShares__c().hashCode();
        }
        if (getCapMan__FullyminusConvCalc__c() != null) {
            _hashCode += getCapMan__FullyminusConvCalc__c().hashCode();
        }
        if (getCapMan__Fundraising_Maximum__c() != null) {
            _hashCode += getCapMan__Fundraising_Maximum__c().hashCode();
        }
        if (getCapMan__Fundraising_Minimum__c() != null) {
            _hashCode += getCapMan__Fundraising_Minimum__c().hashCode();
        }
        if (getCapMan__Fundraising__c() != null) {
            _hashCode += getCapMan__Fundraising__c().hashCode();
        }
        if (getCapMan__Fundraising__r() != null) {
            _hashCode += getCapMan__Fundraising__r().hashCode();
        }
        if (getCapMan__Fundraisings__r() != null) {
            _hashCode += getCapMan__Fundraisings__r().hashCode();
        }
        if (getCapMan__ImputedNewShares__c() != null) {
            _hashCode += getCapMan__ImputedNewShares__c().hashCode();
        }
        if (getCapMan__Issuance_Name__c() != null) {
            _hashCode += getCapMan__Issuance_Name__c().hashCode();
        }
        if (getCapMan__IssueStatus__c() != null) {
            _hashCode += getCapMan__IssueStatus__c().hashCode();
        }
        if (getCapMan__Issue_Amount__c() != null) {
            _hashCode += getCapMan__Issue_Amount__c().hashCode();
        }
        if (getCapMan__Key_Employee_Compensation__c() != null) {
            _hashCode += getCapMan__Key_Employee_Compensation__c().hashCode();
        }
        if (getCapMan__Key_Employee_Severance__c() != null) {
            _hashCode += getCapMan__Key_Employee_Severance__c().hashCode();
        }
        if (getCapMan__LastUpdateTimestamp__c() != null) {
            _hashCode += getCapMan__LastUpdateTimestamp__c().hashCode();
        }
        if (getCapMan__Lead_Investor_List__c() != null) {
            _hashCode += getCapMan__Lead_Investor_List__c().hashCode();
        }
        if (getCapMan__Legal_Fees__c() != null) {
            _hashCode += getCapMan__Legal_Fees__c().hashCode();
        }
        if (getCapMan__NewPostMoneyShares__c() != null) {
            _hashCode += getCapMan__NewPostMoneyShares__c().hashCode();
        }
        if (getCapMan__NextFinancingDate__c() != null) {
            _hashCode += getCapMan__NextFinancingDate__c().hashCode();
        }
        if (getCapMan__No_Shop__c() != null) {
            _hashCode += getCapMan__No_Shop__c().hashCode();
        }
        if (getCapMan__OptionBump__c() != null) {
            _hashCode += getCapMan__OptionBump__c().hashCode();
        }
        if (getCapMan__OptionPlanTargetPct__c() != null) {
            _hashCode += getCapMan__OptionPlanTargetPct__c().hashCode();
        }
        if (getCapMan__OptionPlanTarget__c() != null) {
            _hashCode += getCapMan__OptionPlanTarget__c().hashCode();
        }
        if (getCapMan__OptionsAvailable__c() != null) {
            _hashCode += getCapMan__OptionsAvailable__c().hashCode();
        }
        if (getCapMan__OptionsOutstanding__c() != null) {
            _hashCode += getCapMan__OptionsOutstanding__c().hashCode();
        }
        if (getCapMan__Pay_to_Play_Links__r() != null) {
            _hashCode += getCapMan__Pay_to_Play_Links__r().hashCode();
        }
        if (getCapMan__Pay_to_play__c() != null) {
            _hashCode += getCapMan__Pay_to_play__c().hashCode();
        }
        if (getCapMan__Percent_to_Amend__c() != null) {
            _hashCode += getCapMan__Percent_to_Amend__c().hashCode();
        }
        if (getCapMan__PostMoneyShare__c() != null) {
            _hashCode += getCapMan__PostMoneyShare__c().hashCode();
        }
        if (getCapMan__Post_Capitalization_Table__r() != null) {
            _hashCode += getCapMan__Post_Capitalization_Table__r().hashCode();
        }
        if (getCapMan__PreMoneyShares__c() != null) {
            _hashCode += getCapMan__PreMoneyShares__c().hashCode();
        }
        if (getCapMan__Proposed_Issue_Amount__c() != null) {
            _hashCode += getCapMan__Proposed_Issue_Amount__c().hashCode();
        }
        if (getCapMan__Reserve_Capital__c() != null) {
            _hashCode += getCapMan__Reserve_Capital__c().hashCode();
        }
        if (getCapMan__Security_Name__c() != null) {
            _hashCode += getCapMan__Security_Name__c().hashCode();
        }
        if (getCapMan__Security_Type__c() != null) {
            _hashCode += getCapMan__Security_Type__c().hashCode();
        }
        if (getCapMan__Security__c() != null) {
            _hashCode += getCapMan__Security__c().hashCode();
        }
        if (getCapMan__Security__r() != null) {
            _hashCode += getCapMan__Security__r().hashCode();
        }
        if (getCapMan__Security_pref_Percent__c() != null) {
            _hashCode += getCapMan__Security_pref_Percent__c().hashCode();
        }
        if (getCapMan__Share_Price2__c() != null) {
            _hashCode += getCapMan__Share_Price2__c().hashCode();
        }
        if (getCapMan__Share_Price__c() != null) {
            _hashCode += getCapMan__Share_Price__c().hashCode();
        }
        if (getCapMan__SharesIssued__c() != null) {
            _hashCode += getCapMan__SharesIssued__c().hashCode();
        }
        if (getCapMan__Term_Sheet_Date__c() != null) {
            _hashCode += getCapMan__Term_Sheet_Date__c().hashCode();
        }
        if (getCapMan__Term_Sheet_Expiration__c() != null) {
            _hashCode += getCapMan__Term_Sheet_Expiration__c().hashCode();
        }
        if (getCapMan__Total_Amount_Raised__c() != null) {
            _hashCode += getCapMan__Total_Amount_Raised__c().hashCode();
        }
        if (getCapMan__Transactions__r() != null) {
            _hashCode += getCapMan__Transactions__r().hashCode();
        }
        if (getCapMan__UpdateOnly__c() != null) {
            _hashCode += getCapMan__UpdateOnly__c().hashCode();
        }
        if (getCapMan__Use_of_Proceeds__c() != null) {
            _hashCode += getCapMan__Use_of_Proceeds__c().hashCode();
        }
        if (getCapMan__ValuationMethod__c() != null) {
            _hashCode += getCapMan__ValuationMethod__c().hashCode();
        }
        if (getCapMan__Valuation__c() != null) {
            _hashCode += getCapMan__Valuation__c().hashCode();
        }
        if (getCapMan__Waive_All_Anti_Dilution__c() != null) {
            _hashCode += getCapMan__Waive_All_Anti_Dilution__c().hashCode();
        }
        if (getCapMan__include_earlier_issuance__c() != null) {
            _hashCode += getCapMan__include_earlier_issuance__c().hashCode();
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
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Issuance__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuance__c"));
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
        elemField.setFieldName("capMan__Account_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Account_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Account_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Account_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Accrued_Dividend__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Accrued_Dividend__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AmountIssued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AmountIssued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AsConvertedDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AsConvertedDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Board_Approvals__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Board_Approvals__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Board_of_Directors__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Board_of_Directors__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CalculatedSharePrice2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CalculatedSharePrice2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CalculatedSharePrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CalculatedSharePrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CalculatorType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CalculatorType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__CloseDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CloseDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Co_Sale_Agreement__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Co_Sale_Agreement__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__ConvertConvertibleDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertConvertibleDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConvertToSecurity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertToSecurity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConvertToSecurity__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertToSecurity__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Convert_Debt_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Convert_Debt_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Demand_Registration_Percent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Demand_Registration_Percent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Demand_Registration_Threshold__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Demand_Registration_Threshold__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EnterSharePrice2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EnterSharePrice2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EnterSharePrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EnterSharePrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Execution_days__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Execution_days__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Expected_Close_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Expected_Close_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FullyDilutedCalc__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FullyDilutedCalc__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FullyDilutedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FullyDilutedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FullyminusConvCalc__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FullyminusConvCalc__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fundraising_Maximum__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising_Maximum__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fundraising_Minimum__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising_Minimum__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fundraising__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fundraising__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraising__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fundraisings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fundraisings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ImputedNewShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ImputedNewShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Issuance_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuance_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__IssueStatus__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__IssueStatus__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Issue_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issue_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_Compensation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_Compensation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Key_Employee_Severance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Key_Employee_Severance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LastUpdateTimestamp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LastUpdateTimestamp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Lead_Investor_List__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Lead_Investor_List__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Legal_Fees__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Legal_Fees__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__NewPostMoneyShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__NewPostMoneyShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__NextFinancingDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__NextFinancingDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__No_Shop__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__No_Shop__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionBump__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionBump__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionPlanTargetPct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionPlanTargetPct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionPlanTarget__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionPlanTarget__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsAvailable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsAvailable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsOutstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsOutstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pay_to_Play_Links__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pay_to_Play_Links__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pay_to_play__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pay_to_play__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Percent_to_Amend__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Percent_to_Amend__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PostMoneyShare__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PostMoneyShare__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Post_Capitalization_Table__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Post_Capitalization_Table__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PreMoneyShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PreMoneyShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Proposed_Issue_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Proposed_Issue_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Reserve_Capital__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Reserve_Capital__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Security_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__Security__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_pref_Percent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_pref_Percent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Share_Price2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Share_Price2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Share_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Share_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SharesIssued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SharesIssued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Term_Sheet_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Term_Sheet_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Term_Sheet_Expiration__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Term_Sheet_Expiration__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Total_Amount_Raised__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Total_Amount_Raised__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Transactions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Transactions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__UpdateOnly__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__UpdateOnly__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Use_of_Proceeds__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Use_of_Proceeds__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ValuationMethod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ValuationMethod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Valuation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Valuation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Waive_All_Anti_Dilution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Waive_All_Anti_Dilution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__include_earlier_issuance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__include_earlier_issuance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
