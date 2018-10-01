/**
 * CapMan__Capitalization__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Capitalization__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__Acquire_Common_Stock_Price__c;

    private java.lang.String capMan__Acquirer__c;

    private com.sforce.soap.enterprise.sobject.Account capMan__Acquirer__r;

    private java.util.Date capMan__Acquisition_Date__c;

    private java.lang.Double capMan__AsConvertedOptionsAvailable__c;

    private java.lang.Double capMan__As_Converted_Debt__c;

    private java.lang.Double capMan__As_Converted_Shares__c;

    private java.lang.Double capMan__As_Converted_Warrants__c;

    private java.lang.Double capMan__AuthorizedShares__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Balances__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Board_Meetings__r;

    private java.lang.Double capMan__Cash_Distribution__c;

    private java.lang.String capMan__Company__c;

    private com.sforce.soap.enterprise.sobject.Account capMan__Company__r;

    private java.lang.String capMan__Currency_Type__c;

    private java.lang.Double capMan__DebtAuthorized__c;

    private java.lang.Double capMan__DebtIssued__c;

    private java.lang.Double capMan__DilutedMinusConvertable__c;

    private java.lang.String capMan__EquityType__c;

    private java.util.Date capMan__Exit_Date__c;

    private java.lang.Double capMan__Exit_Price__c;

    private java.lang.Double capMan__Exit_Valuation__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Financial_Datas__r;

    private java.lang.Double capMan__Fully_Diluted_Shares__c;

    private java.lang.Double capMan__Fully_Diluted_as_Converted__c;

    private java.lang.Boolean capMan__Immediate_Investor_Stock_Distribution__c;

    private java.lang.String capMan__Incorporation_State__c;

    private java.lang.String capMan__Industry__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Issuances__r;

    private java.lang.Double capMan__IssuedShares__c;

    private java.lang.String capMan__Issuer__c;

    private java.util.Date capMan__LastUpdate__c;

    private java.util.Date capMan__Latest_Expense_Date__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Analytics__r;

    private java.lang.String capMan__Liquidity_Status__c;

    private java.lang.String capMan__LogoAddress__c;

    private java.lang.String capMan__NameAutoNumber__c;

    private java.lang.Double capMan__Number_of_Steps__c;

    private java.lang.String capMan__Option_Calculation_Type__c;

    private java.lang.String capMan__Option_Expense_Type__c;

    private java.lang.Double capMan__Options_Available__c;

    private java.lang.String capMan__Options_Expense_Amortization_Type__c;

    private java.util.Date capMan__Options_Expense_Begin_Date__c;

    private java.util.Date capMan__Options_Expense_End_Date__c;

    private java.lang.String capMan__Options_Expensing_Frequency__c;

    private java.lang.Double capMan__Options_Outstanding__c;

    private java.lang.String capMan__Options_Vesting_Frequency__c;

    private java.lang.String capMan__Options__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Options__r;

    private java.lang.Double capMan__Payout_Fully_Diluted_Shares__c;

    private java.util.Date capMan__Report_Date__c;

    private java.lang.Double capMan__Risk_Free_Rate__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Securities1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__SecurityTransactions__r;

    private java.lang.Double capMan__Stock_Distribution__c;

    private java.lang.String capMan__Stock_Splits__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Stock_Splits__r;

    private java.lang.String capMan__Sub_Industry__c;

    private java.lang.Double capMan__TaxRate__c;

    private java.lang.Double capMan__TotCommonAsConv__c;

    private java.lang.Double capMan__TotConvDebtAsConv__c;

    private java.lang.Double capMan__TotOptionsAvailableAsConv__c;

    private java.lang.Double capMan__TotOptsAsConv__c;

    private java.lang.Double capMan__TotSerAasConv__c;

    private java.lang.Double capMan__TotSerBasConv__c;

    private java.lang.Double capMan__TotSerCasConv__c;

    private java.lang.Double capMan__TotSerDasConv__c;

    private java.lang.Double capMan__TotSerEasConv__c;

    private java.lang.Double capMan__TotWarAsConv__c;

    private java.lang.Double capMan__TotalIssuedOptions__c;

    private java.lang.Double capMan__TotalWarCommonAsConv__c;

    private java.lang.Double capMan__Total_Authorized_Shares__c;

    private java.lang.Double capMan__Total_Common__c;

    private java.lang.Double capMan__Total_Issued_Shares__c;

    private java.lang.Double capMan__Total_Issued_Warrants__c;

    private java.lang.Double capMan__Total_Preferred__c;

    private java.lang.Double capMan__TotalsAsConv__c;

    private java.lang.Double capMan__TotalsAsConvertedConvertible__c;

    private java.lang.Double capMan__Volatility__c;

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

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Calendar systemModstamp;

    public CapMan__Capitalization__c() {
    }

    public CapMan__Capitalization__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__Acquire_Common_Stock_Price__c,
           java.lang.String capMan__Acquirer__c,
           com.sforce.soap.enterprise.sobject.Account capMan__Acquirer__r,
           java.util.Date capMan__Acquisition_Date__c,
           java.lang.Double capMan__AsConvertedOptionsAvailable__c,
           java.lang.Double capMan__As_Converted_Debt__c,
           java.lang.Double capMan__As_Converted_Shares__c,
           java.lang.Double capMan__As_Converted_Warrants__c,
           java.lang.Double capMan__AuthorizedShares__c,
           com.sforce.soap.enterprise.QueryResult capMan__Balances__r,
           com.sforce.soap.enterprise.QueryResult capMan__Board_Meetings__r,
           java.lang.Double capMan__Cash_Distribution__c,
           java.lang.String capMan__Company__c,
           com.sforce.soap.enterprise.sobject.Account capMan__Company__r,
           java.lang.String capMan__Currency_Type__c,
           java.lang.Double capMan__DebtAuthorized__c,
           java.lang.Double capMan__DebtIssued__c,
           java.lang.Double capMan__DilutedMinusConvertable__c,
           java.lang.String capMan__EquityType__c,
           java.util.Date capMan__Exit_Date__c,
           java.lang.Double capMan__Exit_Price__c,
           java.lang.Double capMan__Exit_Valuation__c,
           com.sforce.soap.enterprise.QueryResult capMan__Financial_Datas__r,
           java.lang.Double capMan__Fully_Diluted_Shares__c,
           java.lang.Double capMan__Fully_Diluted_as_Converted__c,
           java.lang.Boolean capMan__Immediate_Investor_Stock_Distribution__c,
           java.lang.String capMan__Incorporation_State__c,
           java.lang.String capMan__Industry__c,
           com.sforce.soap.enterprise.QueryResult capMan__Issuances__r,
           java.lang.Double capMan__IssuedShares__c,
           java.lang.String capMan__Issuer__c,
           java.util.Date capMan__LastUpdate__c,
           java.util.Date capMan__Latest_Expense_Date__c,
           com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Analytics__r,
           java.lang.String capMan__Liquidity_Status__c,
           java.lang.String capMan__LogoAddress__c,
           java.lang.String capMan__NameAutoNumber__c,
           java.lang.Double capMan__Number_of_Steps__c,
           java.lang.String capMan__Option_Calculation_Type__c,
           java.lang.String capMan__Option_Expense_Type__c,
           java.lang.Double capMan__Options_Available__c,
           java.lang.String capMan__Options_Expense_Amortization_Type__c,
           java.util.Date capMan__Options_Expense_Begin_Date__c,
           java.util.Date capMan__Options_Expense_End_Date__c,
           java.lang.String capMan__Options_Expensing_Frequency__c,
           java.lang.Double capMan__Options_Outstanding__c,
           java.lang.String capMan__Options_Vesting_Frequency__c,
           java.lang.String capMan__Options__c,
           com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Options__r,
           java.lang.Double capMan__Payout_Fully_Diluted_Shares__c,
           java.util.Date capMan__Report_Date__c,
           java.lang.Double capMan__Risk_Free_Rate__c,
           com.sforce.soap.enterprise.QueryResult capMan__Securities1__r,
           com.sforce.soap.enterprise.QueryResult capMan__SecurityTransactions__r,
           java.lang.Double capMan__Stock_Distribution__c,
           java.lang.String capMan__Stock_Splits__c,
           com.sforce.soap.enterprise.QueryResult capMan__Stock_Splits__r,
           java.lang.String capMan__Sub_Industry__c,
           java.lang.Double capMan__TaxRate__c,
           java.lang.Double capMan__TotCommonAsConv__c,
           java.lang.Double capMan__TotConvDebtAsConv__c,
           java.lang.Double capMan__TotOptionsAvailableAsConv__c,
           java.lang.Double capMan__TotOptsAsConv__c,
           java.lang.Double capMan__TotSerAasConv__c,
           java.lang.Double capMan__TotSerBasConv__c,
           java.lang.Double capMan__TotSerCasConv__c,
           java.lang.Double capMan__TotSerDasConv__c,
           java.lang.Double capMan__TotSerEasConv__c,
           java.lang.Double capMan__TotWarAsConv__c,
           java.lang.Double capMan__TotalIssuedOptions__c,
           java.lang.Double capMan__TotalWarCommonAsConv__c,
           java.lang.Double capMan__Total_Authorized_Shares__c,
           java.lang.Double capMan__Total_Common__c,
           java.lang.Double capMan__Total_Issued_Shares__c,
           java.lang.Double capMan__Total_Issued_Warrants__c,
           java.lang.Double capMan__Total_Preferred__c,
           java.lang.Double capMan__TotalsAsConv__c,
           java.lang.Double capMan__TotalsAsConvertedConvertible__c,
           java.lang.Double capMan__Volatility__c,
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
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.capMan__Acquire_Common_Stock_Price__c = capMan__Acquire_Common_Stock_Price__c;
        this.capMan__Acquirer__c = capMan__Acquirer__c;
        this.capMan__Acquirer__r = capMan__Acquirer__r;
        this.capMan__Acquisition_Date__c = capMan__Acquisition_Date__c;
        this.capMan__AsConvertedOptionsAvailable__c = capMan__AsConvertedOptionsAvailable__c;
        this.capMan__As_Converted_Debt__c = capMan__As_Converted_Debt__c;
        this.capMan__As_Converted_Shares__c = capMan__As_Converted_Shares__c;
        this.capMan__As_Converted_Warrants__c = capMan__As_Converted_Warrants__c;
        this.capMan__AuthorizedShares__c = capMan__AuthorizedShares__c;
        this.capMan__Balances__r = capMan__Balances__r;
        this.capMan__Board_Meetings__r = capMan__Board_Meetings__r;
        this.capMan__Cash_Distribution__c = capMan__Cash_Distribution__c;
        this.capMan__Company__c = capMan__Company__c;
        this.capMan__Company__r = capMan__Company__r;
        this.capMan__Currency_Type__c = capMan__Currency_Type__c;
        this.capMan__DebtAuthorized__c = capMan__DebtAuthorized__c;
        this.capMan__DebtIssued__c = capMan__DebtIssued__c;
        this.capMan__DilutedMinusConvertable__c = capMan__DilutedMinusConvertable__c;
        this.capMan__EquityType__c = capMan__EquityType__c;
        this.capMan__Exit_Date__c = capMan__Exit_Date__c;
        this.capMan__Exit_Price__c = capMan__Exit_Price__c;
        this.capMan__Exit_Valuation__c = capMan__Exit_Valuation__c;
        this.capMan__Financial_Datas__r = capMan__Financial_Datas__r;
        this.capMan__Fully_Diluted_Shares__c = capMan__Fully_Diluted_Shares__c;
        this.capMan__Fully_Diluted_as_Converted__c = capMan__Fully_Diluted_as_Converted__c;
        this.capMan__Immediate_Investor_Stock_Distribution__c = capMan__Immediate_Investor_Stock_Distribution__c;
        this.capMan__Incorporation_State__c = capMan__Incorporation_State__c;
        this.capMan__Industry__c = capMan__Industry__c;
        this.capMan__Issuances__r = capMan__Issuances__r;
        this.capMan__IssuedShares__c = capMan__IssuedShares__c;
        this.capMan__Issuer__c = capMan__Issuer__c;
        this.capMan__LastUpdate__c = capMan__LastUpdate__c;
        this.capMan__Latest_Expense_Date__c = capMan__Latest_Expense_Date__c;
        this.capMan__Liquidation_Analytics__r = capMan__Liquidation_Analytics__r;
        this.capMan__Liquidity_Status__c = capMan__Liquidity_Status__c;
        this.capMan__LogoAddress__c = capMan__LogoAddress__c;
        this.capMan__NameAutoNumber__c = capMan__NameAutoNumber__c;
        this.capMan__Number_of_Steps__c = capMan__Number_of_Steps__c;
        this.capMan__Option_Calculation_Type__c = capMan__Option_Calculation_Type__c;
        this.capMan__Option_Expense_Type__c = capMan__Option_Expense_Type__c;
        this.capMan__Options_Available__c = capMan__Options_Available__c;
        this.capMan__Options_Expense_Amortization_Type__c = capMan__Options_Expense_Amortization_Type__c;
        this.capMan__Options_Expense_Begin_Date__c = capMan__Options_Expense_Begin_Date__c;
        this.capMan__Options_Expense_End_Date__c = capMan__Options_Expense_End_Date__c;
        this.capMan__Options_Expensing_Frequency__c = capMan__Options_Expensing_Frequency__c;
        this.capMan__Options_Outstanding__c = capMan__Options_Outstanding__c;
        this.capMan__Options_Vesting_Frequency__c = capMan__Options_Vesting_Frequency__c;
        this.capMan__Options__c = capMan__Options__c;
        this.capMan__Options__r = capMan__Options__r;
        this.capMan__Payout_Fully_Diluted_Shares__c = capMan__Payout_Fully_Diluted_Shares__c;
        this.capMan__Report_Date__c = capMan__Report_Date__c;
        this.capMan__Risk_Free_Rate__c = capMan__Risk_Free_Rate__c;
        this.capMan__Securities1__r = capMan__Securities1__r;
        this.capMan__SecurityTransactions__r = capMan__SecurityTransactions__r;
        this.capMan__Stock_Distribution__c = capMan__Stock_Distribution__c;
        this.capMan__Stock_Splits__c = capMan__Stock_Splits__c;
        this.capMan__Stock_Splits__r = capMan__Stock_Splits__r;
        this.capMan__Sub_Industry__c = capMan__Sub_Industry__c;
        this.capMan__TaxRate__c = capMan__TaxRate__c;
        this.capMan__TotCommonAsConv__c = capMan__TotCommonAsConv__c;
        this.capMan__TotConvDebtAsConv__c = capMan__TotConvDebtAsConv__c;
        this.capMan__TotOptionsAvailableAsConv__c = capMan__TotOptionsAvailableAsConv__c;
        this.capMan__TotOptsAsConv__c = capMan__TotOptsAsConv__c;
        this.capMan__TotSerAasConv__c = capMan__TotSerAasConv__c;
        this.capMan__TotSerBasConv__c = capMan__TotSerBasConv__c;
        this.capMan__TotSerCasConv__c = capMan__TotSerCasConv__c;
        this.capMan__TotSerDasConv__c = capMan__TotSerDasConv__c;
        this.capMan__TotSerEasConv__c = capMan__TotSerEasConv__c;
        this.capMan__TotWarAsConv__c = capMan__TotWarAsConv__c;
        this.capMan__TotalIssuedOptions__c = capMan__TotalIssuedOptions__c;
        this.capMan__TotalWarCommonAsConv__c = capMan__TotalWarCommonAsConv__c;
        this.capMan__Total_Authorized_Shares__c = capMan__Total_Authorized_Shares__c;
        this.capMan__Total_Common__c = capMan__Total_Common__c;
        this.capMan__Total_Issued_Shares__c = capMan__Total_Issued_Shares__c;
        this.capMan__Total_Issued_Warrants__c = capMan__Total_Issued_Warrants__c;
        this.capMan__Total_Preferred__c = capMan__Total_Preferred__c;
        this.capMan__TotalsAsConv__c = capMan__TotalsAsConv__c;
        this.capMan__TotalsAsConvertedConvertible__c = capMan__TotalsAsConvertedConvertible__c;
        this.capMan__Volatility__c = capMan__Volatility__c;
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
        this.shares = shares;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the attachments value for this CapMan__Capitalization__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Capitalization__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Acquire_Common_Stock_Price__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Acquire_Common_Stock_Price__c
     */
    public java.lang.Double getCapMan__Acquire_Common_Stock_Price__c() {
        return capMan__Acquire_Common_Stock_Price__c;
    }


    /**
     * Sets the capMan__Acquire_Common_Stock_Price__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Acquire_Common_Stock_Price__c
     */
    public void setCapMan__Acquire_Common_Stock_Price__c(java.lang.Double capMan__Acquire_Common_Stock_Price__c) {
        this.capMan__Acquire_Common_Stock_Price__c = capMan__Acquire_Common_Stock_Price__c;
    }


    /**
     * Gets the capMan__Acquirer__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Acquirer__c
     */
    public java.lang.String getCapMan__Acquirer__c() {
        return capMan__Acquirer__c;
    }


    /**
     * Sets the capMan__Acquirer__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Acquirer__c
     */
    public void setCapMan__Acquirer__c(java.lang.String capMan__Acquirer__c) {
        this.capMan__Acquirer__c = capMan__Acquirer__c;
    }


    /**
     * Gets the capMan__Acquirer__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Acquirer__r
     */
    public com.sforce.soap.enterprise.sobject.Account getCapMan__Acquirer__r() {
        return capMan__Acquirer__r;
    }


    /**
     * Sets the capMan__Acquirer__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Acquirer__r
     */
    public void setCapMan__Acquirer__r(com.sforce.soap.enterprise.sobject.Account capMan__Acquirer__r) {
        this.capMan__Acquirer__r = capMan__Acquirer__r;
    }


    /**
     * Gets the capMan__Acquisition_Date__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Acquisition_Date__c
     */
    public java.util.Date getCapMan__Acquisition_Date__c() {
        return capMan__Acquisition_Date__c;
    }


    /**
     * Sets the capMan__Acquisition_Date__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Acquisition_Date__c
     */
    public void setCapMan__Acquisition_Date__c(java.util.Date capMan__Acquisition_Date__c) {
        this.capMan__Acquisition_Date__c = capMan__Acquisition_Date__c;
    }


    /**
     * Gets the capMan__AsConvertedOptionsAvailable__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__AsConvertedOptionsAvailable__c
     */
    public java.lang.Double getCapMan__AsConvertedOptionsAvailable__c() {
        return capMan__AsConvertedOptionsAvailable__c;
    }


    /**
     * Sets the capMan__AsConvertedOptionsAvailable__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__AsConvertedOptionsAvailable__c
     */
    public void setCapMan__AsConvertedOptionsAvailable__c(java.lang.Double capMan__AsConvertedOptionsAvailable__c) {
        this.capMan__AsConvertedOptionsAvailable__c = capMan__AsConvertedOptionsAvailable__c;
    }


    /**
     * Gets the capMan__As_Converted_Debt__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__As_Converted_Debt__c
     */
    public java.lang.Double getCapMan__As_Converted_Debt__c() {
        return capMan__As_Converted_Debt__c;
    }


    /**
     * Sets the capMan__As_Converted_Debt__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__As_Converted_Debt__c
     */
    public void setCapMan__As_Converted_Debt__c(java.lang.Double capMan__As_Converted_Debt__c) {
        this.capMan__As_Converted_Debt__c = capMan__As_Converted_Debt__c;
    }


    /**
     * Gets the capMan__As_Converted_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__As_Converted_Shares__c
     */
    public java.lang.Double getCapMan__As_Converted_Shares__c() {
        return capMan__As_Converted_Shares__c;
    }


    /**
     * Sets the capMan__As_Converted_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__As_Converted_Shares__c
     */
    public void setCapMan__As_Converted_Shares__c(java.lang.Double capMan__As_Converted_Shares__c) {
        this.capMan__As_Converted_Shares__c = capMan__As_Converted_Shares__c;
    }


    /**
     * Gets the capMan__As_Converted_Warrants__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__As_Converted_Warrants__c
     */
    public java.lang.Double getCapMan__As_Converted_Warrants__c() {
        return capMan__As_Converted_Warrants__c;
    }


    /**
     * Sets the capMan__As_Converted_Warrants__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__As_Converted_Warrants__c
     */
    public void setCapMan__As_Converted_Warrants__c(java.lang.Double capMan__As_Converted_Warrants__c) {
        this.capMan__As_Converted_Warrants__c = capMan__As_Converted_Warrants__c;
    }


    /**
     * Gets the capMan__AuthorizedShares__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__AuthorizedShares__c
     */
    public java.lang.Double getCapMan__AuthorizedShares__c() {
        return capMan__AuthorizedShares__c;
    }


    /**
     * Sets the capMan__AuthorizedShares__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__AuthorizedShares__c
     */
    public void setCapMan__AuthorizedShares__c(java.lang.Double capMan__AuthorizedShares__c) {
        this.capMan__AuthorizedShares__c = capMan__AuthorizedShares__c;
    }


    /**
     * Gets the capMan__Balances__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Balances__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Balances__r() {
        return capMan__Balances__r;
    }


    /**
     * Sets the capMan__Balances__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Balances__r
     */
    public void setCapMan__Balances__r(com.sforce.soap.enterprise.QueryResult capMan__Balances__r) {
        this.capMan__Balances__r = capMan__Balances__r;
    }


    /**
     * Gets the capMan__Board_Meetings__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Board_Meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Board_Meetings__r() {
        return capMan__Board_Meetings__r;
    }


    /**
     * Sets the capMan__Board_Meetings__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Board_Meetings__r
     */
    public void setCapMan__Board_Meetings__r(com.sforce.soap.enterprise.QueryResult capMan__Board_Meetings__r) {
        this.capMan__Board_Meetings__r = capMan__Board_Meetings__r;
    }


    /**
     * Gets the capMan__Cash_Distribution__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Cash_Distribution__c
     */
    public java.lang.Double getCapMan__Cash_Distribution__c() {
        return capMan__Cash_Distribution__c;
    }


    /**
     * Sets the capMan__Cash_Distribution__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Cash_Distribution__c
     */
    public void setCapMan__Cash_Distribution__c(java.lang.Double capMan__Cash_Distribution__c) {
        this.capMan__Cash_Distribution__c = capMan__Cash_Distribution__c;
    }


    /**
     * Gets the capMan__Company__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Company__c
     */
    public java.lang.String getCapMan__Company__c() {
        return capMan__Company__c;
    }


    /**
     * Sets the capMan__Company__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Company__c
     */
    public void setCapMan__Company__c(java.lang.String capMan__Company__c) {
        this.capMan__Company__c = capMan__Company__c;
    }


    /**
     * Gets the capMan__Company__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Company__r
     */
    public com.sforce.soap.enterprise.sobject.Account getCapMan__Company__r() {
        return capMan__Company__r;
    }


    /**
     * Sets the capMan__Company__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Company__r
     */
    public void setCapMan__Company__r(com.sforce.soap.enterprise.sobject.Account capMan__Company__r) {
        this.capMan__Company__r = capMan__Company__r;
    }


    /**
     * Gets the capMan__Currency_Type__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Currency_Type__c
     */
    public java.lang.String getCapMan__Currency_Type__c() {
        return capMan__Currency_Type__c;
    }


    /**
     * Sets the capMan__Currency_Type__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Currency_Type__c
     */
    public void setCapMan__Currency_Type__c(java.lang.String capMan__Currency_Type__c) {
        this.capMan__Currency_Type__c = capMan__Currency_Type__c;
    }


    /**
     * Gets the capMan__DebtAuthorized__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__DebtAuthorized__c
     */
    public java.lang.Double getCapMan__DebtAuthorized__c() {
        return capMan__DebtAuthorized__c;
    }


    /**
     * Sets the capMan__DebtAuthorized__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__DebtAuthorized__c
     */
    public void setCapMan__DebtAuthorized__c(java.lang.Double capMan__DebtAuthorized__c) {
        this.capMan__DebtAuthorized__c = capMan__DebtAuthorized__c;
    }


    /**
     * Gets the capMan__DebtIssued__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__DebtIssued__c
     */
    public java.lang.Double getCapMan__DebtIssued__c() {
        return capMan__DebtIssued__c;
    }


    /**
     * Sets the capMan__DebtIssued__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__DebtIssued__c
     */
    public void setCapMan__DebtIssued__c(java.lang.Double capMan__DebtIssued__c) {
        this.capMan__DebtIssued__c = capMan__DebtIssued__c;
    }


    /**
     * Gets the capMan__DilutedMinusConvertable__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__DilutedMinusConvertable__c
     */
    public java.lang.Double getCapMan__DilutedMinusConvertable__c() {
        return capMan__DilutedMinusConvertable__c;
    }


    /**
     * Sets the capMan__DilutedMinusConvertable__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__DilutedMinusConvertable__c
     */
    public void setCapMan__DilutedMinusConvertable__c(java.lang.Double capMan__DilutedMinusConvertable__c) {
        this.capMan__DilutedMinusConvertable__c = capMan__DilutedMinusConvertable__c;
    }


    /**
     * Gets the capMan__EquityType__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__EquityType__c
     */
    public java.lang.String getCapMan__EquityType__c() {
        return capMan__EquityType__c;
    }


    /**
     * Sets the capMan__EquityType__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__EquityType__c
     */
    public void setCapMan__EquityType__c(java.lang.String capMan__EquityType__c) {
        this.capMan__EquityType__c = capMan__EquityType__c;
    }


    /**
     * Gets the capMan__Exit_Date__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Exit_Date__c
     */
    public java.util.Date getCapMan__Exit_Date__c() {
        return capMan__Exit_Date__c;
    }


    /**
     * Sets the capMan__Exit_Date__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Exit_Date__c
     */
    public void setCapMan__Exit_Date__c(java.util.Date capMan__Exit_Date__c) {
        this.capMan__Exit_Date__c = capMan__Exit_Date__c;
    }


    /**
     * Gets the capMan__Exit_Price__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Exit_Price__c
     */
    public java.lang.Double getCapMan__Exit_Price__c() {
        return capMan__Exit_Price__c;
    }


    /**
     * Sets the capMan__Exit_Price__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Exit_Price__c
     */
    public void setCapMan__Exit_Price__c(java.lang.Double capMan__Exit_Price__c) {
        this.capMan__Exit_Price__c = capMan__Exit_Price__c;
    }


    /**
     * Gets the capMan__Exit_Valuation__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Exit_Valuation__c
     */
    public java.lang.Double getCapMan__Exit_Valuation__c() {
        return capMan__Exit_Valuation__c;
    }


    /**
     * Sets the capMan__Exit_Valuation__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Exit_Valuation__c
     */
    public void setCapMan__Exit_Valuation__c(java.lang.Double capMan__Exit_Valuation__c) {
        this.capMan__Exit_Valuation__c = capMan__Exit_Valuation__c;
    }


    /**
     * Gets the capMan__Financial_Datas__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Financial_Datas__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Financial_Datas__r() {
        return capMan__Financial_Datas__r;
    }


    /**
     * Sets the capMan__Financial_Datas__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Financial_Datas__r
     */
    public void setCapMan__Financial_Datas__r(com.sforce.soap.enterprise.QueryResult capMan__Financial_Datas__r) {
        this.capMan__Financial_Datas__r = capMan__Financial_Datas__r;
    }


    /**
     * Gets the capMan__Fully_Diluted_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Fully_Diluted_Shares__c
     */
    public java.lang.Double getCapMan__Fully_Diluted_Shares__c() {
        return capMan__Fully_Diluted_Shares__c;
    }


    /**
     * Sets the capMan__Fully_Diluted_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Fully_Diluted_Shares__c
     */
    public void setCapMan__Fully_Diluted_Shares__c(java.lang.Double capMan__Fully_Diluted_Shares__c) {
        this.capMan__Fully_Diluted_Shares__c = capMan__Fully_Diluted_Shares__c;
    }


    /**
     * Gets the capMan__Fully_Diluted_as_Converted__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Fully_Diluted_as_Converted__c
     */
    public java.lang.Double getCapMan__Fully_Diluted_as_Converted__c() {
        return capMan__Fully_Diluted_as_Converted__c;
    }


    /**
     * Sets the capMan__Fully_Diluted_as_Converted__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Fully_Diluted_as_Converted__c
     */
    public void setCapMan__Fully_Diluted_as_Converted__c(java.lang.Double capMan__Fully_Diluted_as_Converted__c) {
        this.capMan__Fully_Diluted_as_Converted__c = capMan__Fully_Diluted_as_Converted__c;
    }


    /**
     * Gets the capMan__Immediate_Investor_Stock_Distribution__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Immediate_Investor_Stock_Distribution__c
     */
    public java.lang.Boolean getCapMan__Immediate_Investor_Stock_Distribution__c() {
        return capMan__Immediate_Investor_Stock_Distribution__c;
    }


    /**
     * Sets the capMan__Immediate_Investor_Stock_Distribution__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Immediate_Investor_Stock_Distribution__c
     */
    public void setCapMan__Immediate_Investor_Stock_Distribution__c(java.lang.Boolean capMan__Immediate_Investor_Stock_Distribution__c) {
        this.capMan__Immediate_Investor_Stock_Distribution__c = capMan__Immediate_Investor_Stock_Distribution__c;
    }


    /**
     * Gets the capMan__Incorporation_State__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Incorporation_State__c
     */
    public java.lang.String getCapMan__Incorporation_State__c() {
        return capMan__Incorporation_State__c;
    }


    /**
     * Sets the capMan__Incorporation_State__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Incorporation_State__c
     */
    public void setCapMan__Incorporation_State__c(java.lang.String capMan__Incorporation_State__c) {
        this.capMan__Incorporation_State__c = capMan__Incorporation_State__c;
    }


    /**
     * Gets the capMan__Industry__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Industry__c
     */
    public java.lang.String getCapMan__Industry__c() {
        return capMan__Industry__c;
    }


    /**
     * Sets the capMan__Industry__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Industry__c
     */
    public void setCapMan__Industry__c(java.lang.String capMan__Industry__c) {
        this.capMan__Industry__c = capMan__Industry__c;
    }


    /**
     * Gets the capMan__Issuances__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Issuances__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Issuances__r() {
        return capMan__Issuances__r;
    }


    /**
     * Sets the capMan__Issuances__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Issuances__r
     */
    public void setCapMan__Issuances__r(com.sforce.soap.enterprise.QueryResult capMan__Issuances__r) {
        this.capMan__Issuances__r = capMan__Issuances__r;
    }


    /**
     * Gets the capMan__IssuedShares__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__IssuedShares__c
     */
    public java.lang.Double getCapMan__IssuedShares__c() {
        return capMan__IssuedShares__c;
    }


    /**
     * Sets the capMan__IssuedShares__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__IssuedShares__c
     */
    public void setCapMan__IssuedShares__c(java.lang.Double capMan__IssuedShares__c) {
        this.capMan__IssuedShares__c = capMan__IssuedShares__c;
    }


    /**
     * Gets the capMan__Issuer__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Issuer__c
     */
    public java.lang.String getCapMan__Issuer__c() {
        return capMan__Issuer__c;
    }


    /**
     * Sets the capMan__Issuer__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Issuer__c
     */
    public void setCapMan__Issuer__c(java.lang.String capMan__Issuer__c) {
        this.capMan__Issuer__c = capMan__Issuer__c;
    }


    /**
     * Gets the capMan__LastUpdate__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__LastUpdate__c
     */
    public java.util.Date getCapMan__LastUpdate__c() {
        return capMan__LastUpdate__c;
    }


    /**
     * Sets the capMan__LastUpdate__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__LastUpdate__c
     */
    public void setCapMan__LastUpdate__c(java.util.Date capMan__LastUpdate__c) {
        this.capMan__LastUpdate__c = capMan__LastUpdate__c;
    }


    /**
     * Gets the capMan__Latest_Expense_Date__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Latest_Expense_Date__c
     */
    public java.util.Date getCapMan__Latest_Expense_Date__c() {
        return capMan__Latest_Expense_Date__c;
    }


    /**
     * Sets the capMan__Latest_Expense_Date__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Latest_Expense_Date__c
     */
    public void setCapMan__Latest_Expense_Date__c(java.util.Date capMan__Latest_Expense_Date__c) {
        this.capMan__Latest_Expense_Date__c = capMan__Latest_Expense_Date__c;
    }


    /**
     * Gets the capMan__Liquidation_Analytics__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Liquidation_Analytics__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Liquidation_Analytics__r() {
        return capMan__Liquidation_Analytics__r;
    }


    /**
     * Sets the capMan__Liquidation_Analytics__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Liquidation_Analytics__r
     */
    public void setCapMan__Liquidation_Analytics__r(com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Analytics__r) {
        this.capMan__Liquidation_Analytics__r = capMan__Liquidation_Analytics__r;
    }


    /**
     * Gets the capMan__Liquidity_Status__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Liquidity_Status__c
     */
    public java.lang.String getCapMan__Liquidity_Status__c() {
        return capMan__Liquidity_Status__c;
    }


    /**
     * Sets the capMan__Liquidity_Status__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Liquidity_Status__c
     */
    public void setCapMan__Liquidity_Status__c(java.lang.String capMan__Liquidity_Status__c) {
        this.capMan__Liquidity_Status__c = capMan__Liquidity_Status__c;
    }


    /**
     * Gets the capMan__LogoAddress__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__LogoAddress__c
     */
    public java.lang.String getCapMan__LogoAddress__c() {
        return capMan__LogoAddress__c;
    }


    /**
     * Sets the capMan__LogoAddress__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__LogoAddress__c
     */
    public void setCapMan__LogoAddress__c(java.lang.String capMan__LogoAddress__c) {
        this.capMan__LogoAddress__c = capMan__LogoAddress__c;
    }


    /**
     * Gets the capMan__NameAutoNumber__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__NameAutoNumber__c
     */
    public java.lang.String getCapMan__NameAutoNumber__c() {
        return capMan__NameAutoNumber__c;
    }


    /**
     * Sets the capMan__NameAutoNumber__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__NameAutoNumber__c
     */
    public void setCapMan__NameAutoNumber__c(java.lang.String capMan__NameAutoNumber__c) {
        this.capMan__NameAutoNumber__c = capMan__NameAutoNumber__c;
    }


    /**
     * Gets the capMan__Number_of_Steps__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Number_of_Steps__c
     */
    public java.lang.Double getCapMan__Number_of_Steps__c() {
        return capMan__Number_of_Steps__c;
    }


    /**
     * Sets the capMan__Number_of_Steps__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Number_of_Steps__c
     */
    public void setCapMan__Number_of_Steps__c(java.lang.Double capMan__Number_of_Steps__c) {
        this.capMan__Number_of_Steps__c = capMan__Number_of_Steps__c;
    }


    /**
     * Gets the capMan__Option_Calculation_Type__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Option_Calculation_Type__c
     */
    public java.lang.String getCapMan__Option_Calculation_Type__c() {
        return capMan__Option_Calculation_Type__c;
    }


    /**
     * Sets the capMan__Option_Calculation_Type__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Option_Calculation_Type__c
     */
    public void setCapMan__Option_Calculation_Type__c(java.lang.String capMan__Option_Calculation_Type__c) {
        this.capMan__Option_Calculation_Type__c = capMan__Option_Calculation_Type__c;
    }


    /**
     * Gets the capMan__Option_Expense_Type__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Option_Expense_Type__c
     */
    public java.lang.String getCapMan__Option_Expense_Type__c() {
        return capMan__Option_Expense_Type__c;
    }


    /**
     * Sets the capMan__Option_Expense_Type__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Option_Expense_Type__c
     */
    public void setCapMan__Option_Expense_Type__c(java.lang.String capMan__Option_Expense_Type__c) {
        this.capMan__Option_Expense_Type__c = capMan__Option_Expense_Type__c;
    }


    /**
     * Gets the capMan__Options_Available__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options_Available__c
     */
    public java.lang.Double getCapMan__Options_Available__c() {
        return capMan__Options_Available__c;
    }


    /**
     * Sets the capMan__Options_Available__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options_Available__c
     */
    public void setCapMan__Options_Available__c(java.lang.Double capMan__Options_Available__c) {
        this.capMan__Options_Available__c = capMan__Options_Available__c;
    }


    /**
     * Gets the capMan__Options_Expense_Amortization_Type__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options_Expense_Amortization_Type__c
     */
    public java.lang.String getCapMan__Options_Expense_Amortization_Type__c() {
        return capMan__Options_Expense_Amortization_Type__c;
    }


    /**
     * Sets the capMan__Options_Expense_Amortization_Type__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options_Expense_Amortization_Type__c
     */
    public void setCapMan__Options_Expense_Amortization_Type__c(java.lang.String capMan__Options_Expense_Amortization_Type__c) {
        this.capMan__Options_Expense_Amortization_Type__c = capMan__Options_Expense_Amortization_Type__c;
    }


    /**
     * Gets the capMan__Options_Expense_Begin_Date__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options_Expense_Begin_Date__c
     */
    public java.util.Date getCapMan__Options_Expense_Begin_Date__c() {
        return capMan__Options_Expense_Begin_Date__c;
    }


    /**
     * Sets the capMan__Options_Expense_Begin_Date__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options_Expense_Begin_Date__c
     */
    public void setCapMan__Options_Expense_Begin_Date__c(java.util.Date capMan__Options_Expense_Begin_Date__c) {
        this.capMan__Options_Expense_Begin_Date__c = capMan__Options_Expense_Begin_Date__c;
    }


    /**
     * Gets the capMan__Options_Expense_End_Date__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options_Expense_End_Date__c
     */
    public java.util.Date getCapMan__Options_Expense_End_Date__c() {
        return capMan__Options_Expense_End_Date__c;
    }


    /**
     * Sets the capMan__Options_Expense_End_Date__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options_Expense_End_Date__c
     */
    public void setCapMan__Options_Expense_End_Date__c(java.util.Date capMan__Options_Expense_End_Date__c) {
        this.capMan__Options_Expense_End_Date__c = capMan__Options_Expense_End_Date__c;
    }


    /**
     * Gets the capMan__Options_Expensing_Frequency__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options_Expensing_Frequency__c
     */
    public java.lang.String getCapMan__Options_Expensing_Frequency__c() {
        return capMan__Options_Expensing_Frequency__c;
    }


    /**
     * Sets the capMan__Options_Expensing_Frequency__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options_Expensing_Frequency__c
     */
    public void setCapMan__Options_Expensing_Frequency__c(java.lang.String capMan__Options_Expensing_Frequency__c) {
        this.capMan__Options_Expensing_Frequency__c = capMan__Options_Expensing_Frequency__c;
    }


    /**
     * Gets the capMan__Options_Outstanding__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options_Outstanding__c
     */
    public java.lang.Double getCapMan__Options_Outstanding__c() {
        return capMan__Options_Outstanding__c;
    }


    /**
     * Sets the capMan__Options_Outstanding__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options_Outstanding__c
     */
    public void setCapMan__Options_Outstanding__c(java.lang.Double capMan__Options_Outstanding__c) {
        this.capMan__Options_Outstanding__c = capMan__Options_Outstanding__c;
    }


    /**
     * Gets the capMan__Options_Vesting_Frequency__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options_Vesting_Frequency__c
     */
    public java.lang.String getCapMan__Options_Vesting_Frequency__c() {
        return capMan__Options_Vesting_Frequency__c;
    }


    /**
     * Sets the capMan__Options_Vesting_Frequency__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options_Vesting_Frequency__c
     */
    public void setCapMan__Options_Vesting_Frequency__c(java.lang.String capMan__Options_Vesting_Frequency__c) {
        this.capMan__Options_Vesting_Frequency__c = capMan__Options_Vesting_Frequency__c;
    }


    /**
     * Gets the capMan__Options__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options__c
     */
    public java.lang.String getCapMan__Options__c() {
        return capMan__Options__c;
    }


    /**
     * Sets the capMan__Options__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options__c
     */
    public void setCapMan__Options__c(java.lang.String capMan__Options__c) {
        this.capMan__Options__c = capMan__Options__c;
    }


    /**
     * Gets the capMan__Options__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Options__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Security__c getCapMan__Options__r() {
        return capMan__Options__r;
    }


    /**
     * Sets the capMan__Options__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Options__r
     */
    public void setCapMan__Options__r(com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Options__r) {
        this.capMan__Options__r = capMan__Options__r;
    }


    /**
     * Gets the capMan__Payout_Fully_Diluted_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Payout_Fully_Diluted_Shares__c
     */
    public java.lang.Double getCapMan__Payout_Fully_Diluted_Shares__c() {
        return capMan__Payout_Fully_Diluted_Shares__c;
    }


    /**
     * Sets the capMan__Payout_Fully_Diluted_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Payout_Fully_Diluted_Shares__c
     */
    public void setCapMan__Payout_Fully_Diluted_Shares__c(java.lang.Double capMan__Payout_Fully_Diluted_Shares__c) {
        this.capMan__Payout_Fully_Diluted_Shares__c = capMan__Payout_Fully_Diluted_Shares__c;
    }


    /**
     * Gets the capMan__Report_Date__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Report_Date__c
     */
    public java.util.Date getCapMan__Report_Date__c() {
        return capMan__Report_Date__c;
    }


    /**
     * Sets the capMan__Report_Date__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Report_Date__c
     */
    public void setCapMan__Report_Date__c(java.util.Date capMan__Report_Date__c) {
        this.capMan__Report_Date__c = capMan__Report_Date__c;
    }


    /**
     * Gets the capMan__Risk_Free_Rate__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Risk_Free_Rate__c
     */
    public java.lang.Double getCapMan__Risk_Free_Rate__c() {
        return capMan__Risk_Free_Rate__c;
    }


    /**
     * Sets the capMan__Risk_Free_Rate__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Risk_Free_Rate__c
     */
    public void setCapMan__Risk_Free_Rate__c(java.lang.Double capMan__Risk_Free_Rate__c) {
        this.capMan__Risk_Free_Rate__c = capMan__Risk_Free_Rate__c;
    }


    /**
     * Gets the capMan__Securities1__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Securities1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Securities1__r() {
        return capMan__Securities1__r;
    }


    /**
     * Sets the capMan__Securities1__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Securities1__r
     */
    public void setCapMan__Securities1__r(com.sforce.soap.enterprise.QueryResult capMan__Securities1__r) {
        this.capMan__Securities1__r = capMan__Securities1__r;
    }


    /**
     * Gets the capMan__SecurityTransactions__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__SecurityTransactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__SecurityTransactions__r() {
        return capMan__SecurityTransactions__r;
    }


    /**
     * Sets the capMan__SecurityTransactions__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__SecurityTransactions__r
     */
    public void setCapMan__SecurityTransactions__r(com.sforce.soap.enterprise.QueryResult capMan__SecurityTransactions__r) {
        this.capMan__SecurityTransactions__r = capMan__SecurityTransactions__r;
    }


    /**
     * Gets the capMan__Stock_Distribution__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Stock_Distribution__c
     */
    public java.lang.Double getCapMan__Stock_Distribution__c() {
        return capMan__Stock_Distribution__c;
    }


    /**
     * Sets the capMan__Stock_Distribution__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Stock_Distribution__c
     */
    public void setCapMan__Stock_Distribution__c(java.lang.Double capMan__Stock_Distribution__c) {
        this.capMan__Stock_Distribution__c = capMan__Stock_Distribution__c;
    }


    /**
     * Gets the capMan__Stock_Splits__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Stock_Splits__c
     */
    public java.lang.String getCapMan__Stock_Splits__c() {
        return capMan__Stock_Splits__c;
    }


    /**
     * Sets the capMan__Stock_Splits__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Stock_Splits__c
     */
    public void setCapMan__Stock_Splits__c(java.lang.String capMan__Stock_Splits__c) {
        this.capMan__Stock_Splits__c = capMan__Stock_Splits__c;
    }


    /**
     * Gets the capMan__Stock_Splits__r value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Stock_Splits__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Stock_Splits__r() {
        return capMan__Stock_Splits__r;
    }


    /**
     * Sets the capMan__Stock_Splits__r value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Stock_Splits__r
     */
    public void setCapMan__Stock_Splits__r(com.sforce.soap.enterprise.QueryResult capMan__Stock_Splits__r) {
        this.capMan__Stock_Splits__r = capMan__Stock_Splits__r;
    }


    /**
     * Gets the capMan__Sub_Industry__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Sub_Industry__c
     */
    public java.lang.String getCapMan__Sub_Industry__c() {
        return capMan__Sub_Industry__c;
    }


    /**
     * Sets the capMan__Sub_Industry__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Sub_Industry__c
     */
    public void setCapMan__Sub_Industry__c(java.lang.String capMan__Sub_Industry__c) {
        this.capMan__Sub_Industry__c = capMan__Sub_Industry__c;
    }


    /**
     * Gets the capMan__TaxRate__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TaxRate__c
     */
    public java.lang.Double getCapMan__TaxRate__c() {
        return capMan__TaxRate__c;
    }


    /**
     * Sets the capMan__TaxRate__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TaxRate__c
     */
    public void setCapMan__TaxRate__c(java.lang.Double capMan__TaxRate__c) {
        this.capMan__TaxRate__c = capMan__TaxRate__c;
    }


    /**
     * Gets the capMan__TotCommonAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotCommonAsConv__c
     */
    public java.lang.Double getCapMan__TotCommonAsConv__c() {
        return capMan__TotCommonAsConv__c;
    }


    /**
     * Sets the capMan__TotCommonAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotCommonAsConv__c
     */
    public void setCapMan__TotCommonAsConv__c(java.lang.Double capMan__TotCommonAsConv__c) {
        this.capMan__TotCommonAsConv__c = capMan__TotCommonAsConv__c;
    }


    /**
     * Gets the capMan__TotConvDebtAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotConvDebtAsConv__c
     */
    public java.lang.Double getCapMan__TotConvDebtAsConv__c() {
        return capMan__TotConvDebtAsConv__c;
    }


    /**
     * Sets the capMan__TotConvDebtAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotConvDebtAsConv__c
     */
    public void setCapMan__TotConvDebtAsConv__c(java.lang.Double capMan__TotConvDebtAsConv__c) {
        this.capMan__TotConvDebtAsConv__c = capMan__TotConvDebtAsConv__c;
    }


    /**
     * Gets the capMan__TotOptionsAvailableAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotOptionsAvailableAsConv__c
     */
    public java.lang.Double getCapMan__TotOptionsAvailableAsConv__c() {
        return capMan__TotOptionsAvailableAsConv__c;
    }


    /**
     * Sets the capMan__TotOptionsAvailableAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotOptionsAvailableAsConv__c
     */
    public void setCapMan__TotOptionsAvailableAsConv__c(java.lang.Double capMan__TotOptionsAvailableAsConv__c) {
        this.capMan__TotOptionsAvailableAsConv__c = capMan__TotOptionsAvailableAsConv__c;
    }


    /**
     * Gets the capMan__TotOptsAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotOptsAsConv__c
     */
    public java.lang.Double getCapMan__TotOptsAsConv__c() {
        return capMan__TotOptsAsConv__c;
    }


    /**
     * Sets the capMan__TotOptsAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotOptsAsConv__c
     */
    public void setCapMan__TotOptsAsConv__c(java.lang.Double capMan__TotOptsAsConv__c) {
        this.capMan__TotOptsAsConv__c = capMan__TotOptsAsConv__c;
    }


    /**
     * Gets the capMan__TotSerAasConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotSerAasConv__c
     */
    public java.lang.Double getCapMan__TotSerAasConv__c() {
        return capMan__TotSerAasConv__c;
    }


    /**
     * Sets the capMan__TotSerAasConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotSerAasConv__c
     */
    public void setCapMan__TotSerAasConv__c(java.lang.Double capMan__TotSerAasConv__c) {
        this.capMan__TotSerAasConv__c = capMan__TotSerAasConv__c;
    }


    /**
     * Gets the capMan__TotSerBasConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotSerBasConv__c
     */
    public java.lang.Double getCapMan__TotSerBasConv__c() {
        return capMan__TotSerBasConv__c;
    }


    /**
     * Sets the capMan__TotSerBasConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotSerBasConv__c
     */
    public void setCapMan__TotSerBasConv__c(java.lang.Double capMan__TotSerBasConv__c) {
        this.capMan__TotSerBasConv__c = capMan__TotSerBasConv__c;
    }


    /**
     * Gets the capMan__TotSerCasConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotSerCasConv__c
     */
    public java.lang.Double getCapMan__TotSerCasConv__c() {
        return capMan__TotSerCasConv__c;
    }


    /**
     * Sets the capMan__TotSerCasConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotSerCasConv__c
     */
    public void setCapMan__TotSerCasConv__c(java.lang.Double capMan__TotSerCasConv__c) {
        this.capMan__TotSerCasConv__c = capMan__TotSerCasConv__c;
    }


    /**
     * Gets the capMan__TotSerDasConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotSerDasConv__c
     */
    public java.lang.Double getCapMan__TotSerDasConv__c() {
        return capMan__TotSerDasConv__c;
    }


    /**
     * Sets the capMan__TotSerDasConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotSerDasConv__c
     */
    public void setCapMan__TotSerDasConv__c(java.lang.Double capMan__TotSerDasConv__c) {
        this.capMan__TotSerDasConv__c = capMan__TotSerDasConv__c;
    }


    /**
     * Gets the capMan__TotSerEasConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotSerEasConv__c
     */
    public java.lang.Double getCapMan__TotSerEasConv__c() {
        return capMan__TotSerEasConv__c;
    }


    /**
     * Sets the capMan__TotSerEasConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotSerEasConv__c
     */
    public void setCapMan__TotSerEasConv__c(java.lang.Double capMan__TotSerEasConv__c) {
        this.capMan__TotSerEasConv__c = capMan__TotSerEasConv__c;
    }


    /**
     * Gets the capMan__TotWarAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotWarAsConv__c
     */
    public java.lang.Double getCapMan__TotWarAsConv__c() {
        return capMan__TotWarAsConv__c;
    }


    /**
     * Sets the capMan__TotWarAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotWarAsConv__c
     */
    public void setCapMan__TotWarAsConv__c(java.lang.Double capMan__TotWarAsConv__c) {
        this.capMan__TotWarAsConv__c = capMan__TotWarAsConv__c;
    }


    /**
     * Gets the capMan__TotalIssuedOptions__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotalIssuedOptions__c
     */
    public java.lang.Double getCapMan__TotalIssuedOptions__c() {
        return capMan__TotalIssuedOptions__c;
    }


    /**
     * Sets the capMan__TotalIssuedOptions__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotalIssuedOptions__c
     */
    public void setCapMan__TotalIssuedOptions__c(java.lang.Double capMan__TotalIssuedOptions__c) {
        this.capMan__TotalIssuedOptions__c = capMan__TotalIssuedOptions__c;
    }


    /**
     * Gets the capMan__TotalWarCommonAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotalWarCommonAsConv__c
     */
    public java.lang.Double getCapMan__TotalWarCommonAsConv__c() {
        return capMan__TotalWarCommonAsConv__c;
    }


    /**
     * Sets the capMan__TotalWarCommonAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotalWarCommonAsConv__c
     */
    public void setCapMan__TotalWarCommonAsConv__c(java.lang.Double capMan__TotalWarCommonAsConv__c) {
        this.capMan__TotalWarCommonAsConv__c = capMan__TotalWarCommonAsConv__c;
    }


    /**
     * Gets the capMan__Total_Authorized_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Total_Authorized_Shares__c
     */
    public java.lang.Double getCapMan__Total_Authorized_Shares__c() {
        return capMan__Total_Authorized_Shares__c;
    }


    /**
     * Sets the capMan__Total_Authorized_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Total_Authorized_Shares__c
     */
    public void setCapMan__Total_Authorized_Shares__c(java.lang.Double capMan__Total_Authorized_Shares__c) {
        this.capMan__Total_Authorized_Shares__c = capMan__Total_Authorized_Shares__c;
    }


    /**
     * Gets the capMan__Total_Common__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Total_Common__c
     */
    public java.lang.Double getCapMan__Total_Common__c() {
        return capMan__Total_Common__c;
    }


    /**
     * Sets the capMan__Total_Common__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Total_Common__c
     */
    public void setCapMan__Total_Common__c(java.lang.Double capMan__Total_Common__c) {
        this.capMan__Total_Common__c = capMan__Total_Common__c;
    }


    /**
     * Gets the capMan__Total_Issued_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Total_Issued_Shares__c
     */
    public java.lang.Double getCapMan__Total_Issued_Shares__c() {
        return capMan__Total_Issued_Shares__c;
    }


    /**
     * Sets the capMan__Total_Issued_Shares__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Total_Issued_Shares__c
     */
    public void setCapMan__Total_Issued_Shares__c(java.lang.Double capMan__Total_Issued_Shares__c) {
        this.capMan__Total_Issued_Shares__c = capMan__Total_Issued_Shares__c;
    }


    /**
     * Gets the capMan__Total_Issued_Warrants__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Total_Issued_Warrants__c
     */
    public java.lang.Double getCapMan__Total_Issued_Warrants__c() {
        return capMan__Total_Issued_Warrants__c;
    }


    /**
     * Sets the capMan__Total_Issued_Warrants__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Total_Issued_Warrants__c
     */
    public void setCapMan__Total_Issued_Warrants__c(java.lang.Double capMan__Total_Issued_Warrants__c) {
        this.capMan__Total_Issued_Warrants__c = capMan__Total_Issued_Warrants__c;
    }


    /**
     * Gets the capMan__Total_Preferred__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Total_Preferred__c
     */
    public java.lang.Double getCapMan__Total_Preferred__c() {
        return capMan__Total_Preferred__c;
    }


    /**
     * Sets the capMan__Total_Preferred__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Total_Preferred__c
     */
    public void setCapMan__Total_Preferred__c(java.lang.Double capMan__Total_Preferred__c) {
        this.capMan__Total_Preferred__c = capMan__Total_Preferred__c;
    }


    /**
     * Gets the capMan__TotalsAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotalsAsConv__c
     */
    public java.lang.Double getCapMan__TotalsAsConv__c() {
        return capMan__TotalsAsConv__c;
    }


    /**
     * Sets the capMan__TotalsAsConv__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotalsAsConv__c
     */
    public void setCapMan__TotalsAsConv__c(java.lang.Double capMan__TotalsAsConv__c) {
        this.capMan__TotalsAsConv__c = capMan__TotalsAsConv__c;
    }


    /**
     * Gets the capMan__TotalsAsConvertedConvertible__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__TotalsAsConvertedConvertible__c
     */
    public java.lang.Double getCapMan__TotalsAsConvertedConvertible__c() {
        return capMan__TotalsAsConvertedConvertible__c;
    }


    /**
     * Sets the capMan__TotalsAsConvertedConvertible__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__TotalsAsConvertedConvertible__c
     */
    public void setCapMan__TotalsAsConvertedConvertible__c(java.lang.Double capMan__TotalsAsConvertedConvertible__c) {
        this.capMan__TotalsAsConvertedConvertible__c = capMan__TotalsAsConvertedConvertible__c;
    }


    /**
     * Gets the capMan__Volatility__c value for this CapMan__Capitalization__c.
     * 
     * @return capMan__Volatility__c
     */
    public java.lang.Double getCapMan__Volatility__c() {
        return capMan__Volatility__c;
    }


    /**
     * Sets the capMan__Volatility__c value for this CapMan__Capitalization__c.
     * 
     * @param capMan__Volatility__c
     */
    public void setCapMan__Volatility__c(java.lang.Double capMan__Volatility__c) {
        this.capMan__Volatility__c = capMan__Volatility__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Capitalization__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Capitalization__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Capitalization__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Capitalization__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Capitalization__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Capitalization__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Capitalization__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Capitalization__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Capitalization__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Capitalization__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Capitalization__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Capitalization__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Capitalization__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Capitalization__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Capitalization__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Capitalization__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Capitalization__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Capitalization__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Capitalization__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Capitalization__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Capitalization__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Capitalization__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Capitalization__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Capitalization__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this CapMan__Capitalization__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__Capitalization__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__Capitalization__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__Capitalization__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__Capitalization__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Capitalization__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Capitalization__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Capitalization__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the shares value for this CapMan__Capitalization__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this CapMan__Capitalization__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Capitalization__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Capitalization__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Capitalization__c)) return false;
        CapMan__Capitalization__c other = (CapMan__Capitalization__c) obj;
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
            ((this.capMan__Acquire_Common_Stock_Price__c==null && other.getCapMan__Acquire_Common_Stock_Price__c()==null) || 
             (this.capMan__Acquire_Common_Stock_Price__c!=null &&
              this.capMan__Acquire_Common_Stock_Price__c.equals(other.getCapMan__Acquire_Common_Stock_Price__c()))) &&
            ((this.capMan__Acquirer__c==null && other.getCapMan__Acquirer__c()==null) || 
             (this.capMan__Acquirer__c!=null &&
              this.capMan__Acquirer__c.equals(other.getCapMan__Acquirer__c()))) &&
            ((this.capMan__Acquirer__r==null && other.getCapMan__Acquirer__r()==null) || 
             (this.capMan__Acquirer__r!=null &&
              this.capMan__Acquirer__r.equals(other.getCapMan__Acquirer__r()))) &&
            ((this.capMan__Acquisition_Date__c==null && other.getCapMan__Acquisition_Date__c()==null) || 
             (this.capMan__Acquisition_Date__c!=null &&
              this.capMan__Acquisition_Date__c.equals(other.getCapMan__Acquisition_Date__c()))) &&
            ((this.capMan__AsConvertedOptionsAvailable__c==null && other.getCapMan__AsConvertedOptionsAvailable__c()==null) || 
             (this.capMan__AsConvertedOptionsAvailable__c!=null &&
              this.capMan__AsConvertedOptionsAvailable__c.equals(other.getCapMan__AsConvertedOptionsAvailable__c()))) &&
            ((this.capMan__As_Converted_Debt__c==null && other.getCapMan__As_Converted_Debt__c()==null) || 
             (this.capMan__As_Converted_Debt__c!=null &&
              this.capMan__As_Converted_Debt__c.equals(other.getCapMan__As_Converted_Debt__c()))) &&
            ((this.capMan__As_Converted_Shares__c==null && other.getCapMan__As_Converted_Shares__c()==null) || 
             (this.capMan__As_Converted_Shares__c!=null &&
              this.capMan__As_Converted_Shares__c.equals(other.getCapMan__As_Converted_Shares__c()))) &&
            ((this.capMan__As_Converted_Warrants__c==null && other.getCapMan__As_Converted_Warrants__c()==null) || 
             (this.capMan__As_Converted_Warrants__c!=null &&
              this.capMan__As_Converted_Warrants__c.equals(other.getCapMan__As_Converted_Warrants__c()))) &&
            ((this.capMan__AuthorizedShares__c==null && other.getCapMan__AuthorizedShares__c()==null) || 
             (this.capMan__AuthorizedShares__c!=null &&
              this.capMan__AuthorizedShares__c.equals(other.getCapMan__AuthorizedShares__c()))) &&
            ((this.capMan__Balances__r==null && other.getCapMan__Balances__r()==null) || 
             (this.capMan__Balances__r!=null &&
              this.capMan__Balances__r.equals(other.getCapMan__Balances__r()))) &&
            ((this.capMan__Board_Meetings__r==null && other.getCapMan__Board_Meetings__r()==null) || 
             (this.capMan__Board_Meetings__r!=null &&
              this.capMan__Board_Meetings__r.equals(other.getCapMan__Board_Meetings__r()))) &&
            ((this.capMan__Cash_Distribution__c==null && other.getCapMan__Cash_Distribution__c()==null) || 
             (this.capMan__Cash_Distribution__c!=null &&
              this.capMan__Cash_Distribution__c.equals(other.getCapMan__Cash_Distribution__c()))) &&
            ((this.capMan__Company__c==null && other.getCapMan__Company__c()==null) || 
             (this.capMan__Company__c!=null &&
              this.capMan__Company__c.equals(other.getCapMan__Company__c()))) &&
            ((this.capMan__Company__r==null && other.getCapMan__Company__r()==null) || 
             (this.capMan__Company__r!=null &&
              this.capMan__Company__r.equals(other.getCapMan__Company__r()))) &&
            ((this.capMan__Currency_Type__c==null && other.getCapMan__Currency_Type__c()==null) || 
             (this.capMan__Currency_Type__c!=null &&
              this.capMan__Currency_Type__c.equals(other.getCapMan__Currency_Type__c()))) &&
            ((this.capMan__DebtAuthorized__c==null && other.getCapMan__DebtAuthorized__c()==null) || 
             (this.capMan__DebtAuthorized__c!=null &&
              this.capMan__DebtAuthorized__c.equals(other.getCapMan__DebtAuthorized__c()))) &&
            ((this.capMan__DebtIssued__c==null && other.getCapMan__DebtIssued__c()==null) || 
             (this.capMan__DebtIssued__c!=null &&
              this.capMan__DebtIssued__c.equals(other.getCapMan__DebtIssued__c()))) &&
            ((this.capMan__DilutedMinusConvertable__c==null && other.getCapMan__DilutedMinusConvertable__c()==null) || 
             (this.capMan__DilutedMinusConvertable__c!=null &&
              this.capMan__DilutedMinusConvertable__c.equals(other.getCapMan__DilutedMinusConvertable__c()))) &&
            ((this.capMan__EquityType__c==null && other.getCapMan__EquityType__c()==null) || 
             (this.capMan__EquityType__c!=null &&
              this.capMan__EquityType__c.equals(other.getCapMan__EquityType__c()))) &&
            ((this.capMan__Exit_Date__c==null && other.getCapMan__Exit_Date__c()==null) || 
             (this.capMan__Exit_Date__c!=null &&
              this.capMan__Exit_Date__c.equals(other.getCapMan__Exit_Date__c()))) &&
            ((this.capMan__Exit_Price__c==null && other.getCapMan__Exit_Price__c()==null) || 
             (this.capMan__Exit_Price__c!=null &&
              this.capMan__Exit_Price__c.equals(other.getCapMan__Exit_Price__c()))) &&
            ((this.capMan__Exit_Valuation__c==null && other.getCapMan__Exit_Valuation__c()==null) || 
             (this.capMan__Exit_Valuation__c!=null &&
              this.capMan__Exit_Valuation__c.equals(other.getCapMan__Exit_Valuation__c()))) &&
            ((this.capMan__Financial_Datas__r==null && other.getCapMan__Financial_Datas__r()==null) || 
             (this.capMan__Financial_Datas__r!=null &&
              this.capMan__Financial_Datas__r.equals(other.getCapMan__Financial_Datas__r()))) &&
            ((this.capMan__Fully_Diluted_Shares__c==null && other.getCapMan__Fully_Diluted_Shares__c()==null) || 
             (this.capMan__Fully_Diluted_Shares__c!=null &&
              this.capMan__Fully_Diluted_Shares__c.equals(other.getCapMan__Fully_Diluted_Shares__c()))) &&
            ((this.capMan__Fully_Diluted_as_Converted__c==null && other.getCapMan__Fully_Diluted_as_Converted__c()==null) || 
             (this.capMan__Fully_Diluted_as_Converted__c!=null &&
              this.capMan__Fully_Diluted_as_Converted__c.equals(other.getCapMan__Fully_Diluted_as_Converted__c()))) &&
            ((this.capMan__Immediate_Investor_Stock_Distribution__c==null && other.getCapMan__Immediate_Investor_Stock_Distribution__c()==null) || 
             (this.capMan__Immediate_Investor_Stock_Distribution__c!=null &&
              this.capMan__Immediate_Investor_Stock_Distribution__c.equals(other.getCapMan__Immediate_Investor_Stock_Distribution__c()))) &&
            ((this.capMan__Incorporation_State__c==null && other.getCapMan__Incorporation_State__c()==null) || 
             (this.capMan__Incorporation_State__c!=null &&
              this.capMan__Incorporation_State__c.equals(other.getCapMan__Incorporation_State__c()))) &&
            ((this.capMan__Industry__c==null && other.getCapMan__Industry__c()==null) || 
             (this.capMan__Industry__c!=null &&
              this.capMan__Industry__c.equals(other.getCapMan__Industry__c()))) &&
            ((this.capMan__Issuances__r==null && other.getCapMan__Issuances__r()==null) || 
             (this.capMan__Issuances__r!=null &&
              this.capMan__Issuances__r.equals(other.getCapMan__Issuances__r()))) &&
            ((this.capMan__IssuedShares__c==null && other.getCapMan__IssuedShares__c()==null) || 
             (this.capMan__IssuedShares__c!=null &&
              this.capMan__IssuedShares__c.equals(other.getCapMan__IssuedShares__c()))) &&
            ((this.capMan__Issuer__c==null && other.getCapMan__Issuer__c()==null) || 
             (this.capMan__Issuer__c!=null &&
              this.capMan__Issuer__c.equals(other.getCapMan__Issuer__c()))) &&
            ((this.capMan__LastUpdate__c==null && other.getCapMan__LastUpdate__c()==null) || 
             (this.capMan__LastUpdate__c!=null &&
              this.capMan__LastUpdate__c.equals(other.getCapMan__LastUpdate__c()))) &&
            ((this.capMan__Latest_Expense_Date__c==null && other.getCapMan__Latest_Expense_Date__c()==null) || 
             (this.capMan__Latest_Expense_Date__c!=null &&
              this.capMan__Latest_Expense_Date__c.equals(other.getCapMan__Latest_Expense_Date__c()))) &&
            ((this.capMan__Liquidation_Analytics__r==null && other.getCapMan__Liquidation_Analytics__r()==null) || 
             (this.capMan__Liquidation_Analytics__r!=null &&
              this.capMan__Liquidation_Analytics__r.equals(other.getCapMan__Liquidation_Analytics__r()))) &&
            ((this.capMan__Liquidity_Status__c==null && other.getCapMan__Liquidity_Status__c()==null) || 
             (this.capMan__Liquidity_Status__c!=null &&
              this.capMan__Liquidity_Status__c.equals(other.getCapMan__Liquidity_Status__c()))) &&
            ((this.capMan__LogoAddress__c==null && other.getCapMan__LogoAddress__c()==null) || 
             (this.capMan__LogoAddress__c!=null &&
              this.capMan__LogoAddress__c.equals(other.getCapMan__LogoAddress__c()))) &&
            ((this.capMan__NameAutoNumber__c==null && other.getCapMan__NameAutoNumber__c()==null) || 
             (this.capMan__NameAutoNumber__c!=null &&
              this.capMan__NameAutoNumber__c.equals(other.getCapMan__NameAutoNumber__c()))) &&
            ((this.capMan__Number_of_Steps__c==null && other.getCapMan__Number_of_Steps__c()==null) || 
             (this.capMan__Number_of_Steps__c!=null &&
              this.capMan__Number_of_Steps__c.equals(other.getCapMan__Number_of_Steps__c()))) &&
            ((this.capMan__Option_Calculation_Type__c==null && other.getCapMan__Option_Calculation_Type__c()==null) || 
             (this.capMan__Option_Calculation_Type__c!=null &&
              this.capMan__Option_Calculation_Type__c.equals(other.getCapMan__Option_Calculation_Type__c()))) &&
            ((this.capMan__Option_Expense_Type__c==null && other.getCapMan__Option_Expense_Type__c()==null) || 
             (this.capMan__Option_Expense_Type__c!=null &&
              this.capMan__Option_Expense_Type__c.equals(other.getCapMan__Option_Expense_Type__c()))) &&
            ((this.capMan__Options_Available__c==null && other.getCapMan__Options_Available__c()==null) || 
             (this.capMan__Options_Available__c!=null &&
              this.capMan__Options_Available__c.equals(other.getCapMan__Options_Available__c()))) &&
            ((this.capMan__Options_Expense_Amortization_Type__c==null && other.getCapMan__Options_Expense_Amortization_Type__c()==null) || 
             (this.capMan__Options_Expense_Amortization_Type__c!=null &&
              this.capMan__Options_Expense_Amortization_Type__c.equals(other.getCapMan__Options_Expense_Amortization_Type__c()))) &&
            ((this.capMan__Options_Expense_Begin_Date__c==null && other.getCapMan__Options_Expense_Begin_Date__c()==null) || 
             (this.capMan__Options_Expense_Begin_Date__c!=null &&
              this.capMan__Options_Expense_Begin_Date__c.equals(other.getCapMan__Options_Expense_Begin_Date__c()))) &&
            ((this.capMan__Options_Expense_End_Date__c==null && other.getCapMan__Options_Expense_End_Date__c()==null) || 
             (this.capMan__Options_Expense_End_Date__c!=null &&
              this.capMan__Options_Expense_End_Date__c.equals(other.getCapMan__Options_Expense_End_Date__c()))) &&
            ((this.capMan__Options_Expensing_Frequency__c==null && other.getCapMan__Options_Expensing_Frequency__c()==null) || 
             (this.capMan__Options_Expensing_Frequency__c!=null &&
              this.capMan__Options_Expensing_Frequency__c.equals(other.getCapMan__Options_Expensing_Frequency__c()))) &&
            ((this.capMan__Options_Outstanding__c==null && other.getCapMan__Options_Outstanding__c()==null) || 
             (this.capMan__Options_Outstanding__c!=null &&
              this.capMan__Options_Outstanding__c.equals(other.getCapMan__Options_Outstanding__c()))) &&
            ((this.capMan__Options_Vesting_Frequency__c==null && other.getCapMan__Options_Vesting_Frequency__c()==null) || 
             (this.capMan__Options_Vesting_Frequency__c!=null &&
              this.capMan__Options_Vesting_Frequency__c.equals(other.getCapMan__Options_Vesting_Frequency__c()))) &&
            ((this.capMan__Options__c==null && other.getCapMan__Options__c()==null) || 
             (this.capMan__Options__c!=null &&
              this.capMan__Options__c.equals(other.getCapMan__Options__c()))) &&
            ((this.capMan__Options__r==null && other.getCapMan__Options__r()==null) || 
             (this.capMan__Options__r!=null &&
              this.capMan__Options__r.equals(other.getCapMan__Options__r()))) &&
            ((this.capMan__Payout_Fully_Diluted_Shares__c==null && other.getCapMan__Payout_Fully_Diluted_Shares__c()==null) || 
             (this.capMan__Payout_Fully_Diluted_Shares__c!=null &&
              this.capMan__Payout_Fully_Diluted_Shares__c.equals(other.getCapMan__Payout_Fully_Diluted_Shares__c()))) &&
            ((this.capMan__Report_Date__c==null && other.getCapMan__Report_Date__c()==null) || 
             (this.capMan__Report_Date__c!=null &&
              this.capMan__Report_Date__c.equals(other.getCapMan__Report_Date__c()))) &&
            ((this.capMan__Risk_Free_Rate__c==null && other.getCapMan__Risk_Free_Rate__c()==null) || 
             (this.capMan__Risk_Free_Rate__c!=null &&
              this.capMan__Risk_Free_Rate__c.equals(other.getCapMan__Risk_Free_Rate__c()))) &&
            ((this.capMan__Securities1__r==null && other.getCapMan__Securities1__r()==null) || 
             (this.capMan__Securities1__r!=null &&
              this.capMan__Securities1__r.equals(other.getCapMan__Securities1__r()))) &&
            ((this.capMan__SecurityTransactions__r==null && other.getCapMan__SecurityTransactions__r()==null) || 
             (this.capMan__SecurityTransactions__r!=null &&
              this.capMan__SecurityTransactions__r.equals(other.getCapMan__SecurityTransactions__r()))) &&
            ((this.capMan__Stock_Distribution__c==null && other.getCapMan__Stock_Distribution__c()==null) || 
             (this.capMan__Stock_Distribution__c!=null &&
              this.capMan__Stock_Distribution__c.equals(other.getCapMan__Stock_Distribution__c()))) &&
            ((this.capMan__Stock_Splits__c==null && other.getCapMan__Stock_Splits__c()==null) || 
             (this.capMan__Stock_Splits__c!=null &&
              this.capMan__Stock_Splits__c.equals(other.getCapMan__Stock_Splits__c()))) &&
            ((this.capMan__Stock_Splits__r==null && other.getCapMan__Stock_Splits__r()==null) || 
             (this.capMan__Stock_Splits__r!=null &&
              this.capMan__Stock_Splits__r.equals(other.getCapMan__Stock_Splits__r()))) &&
            ((this.capMan__Sub_Industry__c==null && other.getCapMan__Sub_Industry__c()==null) || 
             (this.capMan__Sub_Industry__c!=null &&
              this.capMan__Sub_Industry__c.equals(other.getCapMan__Sub_Industry__c()))) &&
            ((this.capMan__TaxRate__c==null && other.getCapMan__TaxRate__c()==null) || 
             (this.capMan__TaxRate__c!=null &&
              this.capMan__TaxRate__c.equals(other.getCapMan__TaxRate__c()))) &&
            ((this.capMan__TotCommonAsConv__c==null && other.getCapMan__TotCommonAsConv__c()==null) || 
             (this.capMan__TotCommonAsConv__c!=null &&
              this.capMan__TotCommonAsConv__c.equals(other.getCapMan__TotCommonAsConv__c()))) &&
            ((this.capMan__TotConvDebtAsConv__c==null && other.getCapMan__TotConvDebtAsConv__c()==null) || 
             (this.capMan__TotConvDebtAsConv__c!=null &&
              this.capMan__TotConvDebtAsConv__c.equals(other.getCapMan__TotConvDebtAsConv__c()))) &&
            ((this.capMan__TotOptionsAvailableAsConv__c==null && other.getCapMan__TotOptionsAvailableAsConv__c()==null) || 
             (this.capMan__TotOptionsAvailableAsConv__c!=null &&
              this.capMan__TotOptionsAvailableAsConv__c.equals(other.getCapMan__TotOptionsAvailableAsConv__c()))) &&
            ((this.capMan__TotOptsAsConv__c==null && other.getCapMan__TotOptsAsConv__c()==null) || 
             (this.capMan__TotOptsAsConv__c!=null &&
              this.capMan__TotOptsAsConv__c.equals(other.getCapMan__TotOptsAsConv__c()))) &&
            ((this.capMan__TotSerAasConv__c==null && other.getCapMan__TotSerAasConv__c()==null) || 
             (this.capMan__TotSerAasConv__c!=null &&
              this.capMan__TotSerAasConv__c.equals(other.getCapMan__TotSerAasConv__c()))) &&
            ((this.capMan__TotSerBasConv__c==null && other.getCapMan__TotSerBasConv__c()==null) || 
             (this.capMan__TotSerBasConv__c!=null &&
              this.capMan__TotSerBasConv__c.equals(other.getCapMan__TotSerBasConv__c()))) &&
            ((this.capMan__TotSerCasConv__c==null && other.getCapMan__TotSerCasConv__c()==null) || 
             (this.capMan__TotSerCasConv__c!=null &&
              this.capMan__TotSerCasConv__c.equals(other.getCapMan__TotSerCasConv__c()))) &&
            ((this.capMan__TotSerDasConv__c==null && other.getCapMan__TotSerDasConv__c()==null) || 
             (this.capMan__TotSerDasConv__c!=null &&
              this.capMan__TotSerDasConv__c.equals(other.getCapMan__TotSerDasConv__c()))) &&
            ((this.capMan__TotSerEasConv__c==null && other.getCapMan__TotSerEasConv__c()==null) || 
             (this.capMan__TotSerEasConv__c!=null &&
              this.capMan__TotSerEasConv__c.equals(other.getCapMan__TotSerEasConv__c()))) &&
            ((this.capMan__TotWarAsConv__c==null && other.getCapMan__TotWarAsConv__c()==null) || 
             (this.capMan__TotWarAsConv__c!=null &&
              this.capMan__TotWarAsConv__c.equals(other.getCapMan__TotWarAsConv__c()))) &&
            ((this.capMan__TotalIssuedOptions__c==null && other.getCapMan__TotalIssuedOptions__c()==null) || 
             (this.capMan__TotalIssuedOptions__c!=null &&
              this.capMan__TotalIssuedOptions__c.equals(other.getCapMan__TotalIssuedOptions__c()))) &&
            ((this.capMan__TotalWarCommonAsConv__c==null && other.getCapMan__TotalWarCommonAsConv__c()==null) || 
             (this.capMan__TotalWarCommonAsConv__c!=null &&
              this.capMan__TotalWarCommonAsConv__c.equals(other.getCapMan__TotalWarCommonAsConv__c()))) &&
            ((this.capMan__Total_Authorized_Shares__c==null && other.getCapMan__Total_Authorized_Shares__c()==null) || 
             (this.capMan__Total_Authorized_Shares__c!=null &&
              this.capMan__Total_Authorized_Shares__c.equals(other.getCapMan__Total_Authorized_Shares__c()))) &&
            ((this.capMan__Total_Common__c==null && other.getCapMan__Total_Common__c()==null) || 
             (this.capMan__Total_Common__c!=null &&
              this.capMan__Total_Common__c.equals(other.getCapMan__Total_Common__c()))) &&
            ((this.capMan__Total_Issued_Shares__c==null && other.getCapMan__Total_Issued_Shares__c()==null) || 
             (this.capMan__Total_Issued_Shares__c!=null &&
              this.capMan__Total_Issued_Shares__c.equals(other.getCapMan__Total_Issued_Shares__c()))) &&
            ((this.capMan__Total_Issued_Warrants__c==null && other.getCapMan__Total_Issued_Warrants__c()==null) || 
             (this.capMan__Total_Issued_Warrants__c!=null &&
              this.capMan__Total_Issued_Warrants__c.equals(other.getCapMan__Total_Issued_Warrants__c()))) &&
            ((this.capMan__Total_Preferred__c==null && other.getCapMan__Total_Preferred__c()==null) || 
             (this.capMan__Total_Preferred__c!=null &&
              this.capMan__Total_Preferred__c.equals(other.getCapMan__Total_Preferred__c()))) &&
            ((this.capMan__TotalsAsConv__c==null && other.getCapMan__TotalsAsConv__c()==null) || 
             (this.capMan__TotalsAsConv__c!=null &&
              this.capMan__TotalsAsConv__c.equals(other.getCapMan__TotalsAsConv__c()))) &&
            ((this.capMan__TotalsAsConvertedConvertible__c==null && other.getCapMan__TotalsAsConvertedConvertible__c()==null) || 
             (this.capMan__TotalsAsConvertedConvertible__c!=null &&
              this.capMan__TotalsAsConvertedConvertible__c.equals(other.getCapMan__TotalsAsConvertedConvertible__c()))) &&
            ((this.capMan__Volatility__c==null && other.getCapMan__Volatility__c()==null) || 
             (this.capMan__Volatility__c!=null &&
              this.capMan__Volatility__c.equals(other.getCapMan__Volatility__c()))) &&
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
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
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
        if (getCapMan__Acquire_Common_Stock_Price__c() != null) {
            _hashCode += getCapMan__Acquire_Common_Stock_Price__c().hashCode();
        }
        if (getCapMan__Acquirer__c() != null) {
            _hashCode += getCapMan__Acquirer__c().hashCode();
        }
        if (getCapMan__Acquirer__r() != null) {
            _hashCode += getCapMan__Acquirer__r().hashCode();
        }
        if (getCapMan__Acquisition_Date__c() != null) {
            _hashCode += getCapMan__Acquisition_Date__c().hashCode();
        }
        if (getCapMan__AsConvertedOptionsAvailable__c() != null) {
            _hashCode += getCapMan__AsConvertedOptionsAvailable__c().hashCode();
        }
        if (getCapMan__As_Converted_Debt__c() != null) {
            _hashCode += getCapMan__As_Converted_Debt__c().hashCode();
        }
        if (getCapMan__As_Converted_Shares__c() != null) {
            _hashCode += getCapMan__As_Converted_Shares__c().hashCode();
        }
        if (getCapMan__As_Converted_Warrants__c() != null) {
            _hashCode += getCapMan__As_Converted_Warrants__c().hashCode();
        }
        if (getCapMan__AuthorizedShares__c() != null) {
            _hashCode += getCapMan__AuthorizedShares__c().hashCode();
        }
        if (getCapMan__Balances__r() != null) {
            _hashCode += getCapMan__Balances__r().hashCode();
        }
        if (getCapMan__Board_Meetings__r() != null) {
            _hashCode += getCapMan__Board_Meetings__r().hashCode();
        }
        if (getCapMan__Cash_Distribution__c() != null) {
            _hashCode += getCapMan__Cash_Distribution__c().hashCode();
        }
        if (getCapMan__Company__c() != null) {
            _hashCode += getCapMan__Company__c().hashCode();
        }
        if (getCapMan__Company__r() != null) {
            _hashCode += getCapMan__Company__r().hashCode();
        }
        if (getCapMan__Currency_Type__c() != null) {
            _hashCode += getCapMan__Currency_Type__c().hashCode();
        }
        if (getCapMan__DebtAuthorized__c() != null) {
            _hashCode += getCapMan__DebtAuthorized__c().hashCode();
        }
        if (getCapMan__DebtIssued__c() != null) {
            _hashCode += getCapMan__DebtIssued__c().hashCode();
        }
        if (getCapMan__DilutedMinusConvertable__c() != null) {
            _hashCode += getCapMan__DilutedMinusConvertable__c().hashCode();
        }
        if (getCapMan__EquityType__c() != null) {
            _hashCode += getCapMan__EquityType__c().hashCode();
        }
        if (getCapMan__Exit_Date__c() != null) {
            _hashCode += getCapMan__Exit_Date__c().hashCode();
        }
        if (getCapMan__Exit_Price__c() != null) {
            _hashCode += getCapMan__Exit_Price__c().hashCode();
        }
        if (getCapMan__Exit_Valuation__c() != null) {
            _hashCode += getCapMan__Exit_Valuation__c().hashCode();
        }
        if (getCapMan__Financial_Datas__r() != null) {
            _hashCode += getCapMan__Financial_Datas__r().hashCode();
        }
        if (getCapMan__Fully_Diluted_Shares__c() != null) {
            _hashCode += getCapMan__Fully_Diluted_Shares__c().hashCode();
        }
        if (getCapMan__Fully_Diluted_as_Converted__c() != null) {
            _hashCode += getCapMan__Fully_Diluted_as_Converted__c().hashCode();
        }
        if (getCapMan__Immediate_Investor_Stock_Distribution__c() != null) {
            _hashCode += getCapMan__Immediate_Investor_Stock_Distribution__c().hashCode();
        }
        if (getCapMan__Incorporation_State__c() != null) {
            _hashCode += getCapMan__Incorporation_State__c().hashCode();
        }
        if (getCapMan__Industry__c() != null) {
            _hashCode += getCapMan__Industry__c().hashCode();
        }
        if (getCapMan__Issuances__r() != null) {
            _hashCode += getCapMan__Issuances__r().hashCode();
        }
        if (getCapMan__IssuedShares__c() != null) {
            _hashCode += getCapMan__IssuedShares__c().hashCode();
        }
        if (getCapMan__Issuer__c() != null) {
            _hashCode += getCapMan__Issuer__c().hashCode();
        }
        if (getCapMan__LastUpdate__c() != null) {
            _hashCode += getCapMan__LastUpdate__c().hashCode();
        }
        if (getCapMan__Latest_Expense_Date__c() != null) {
            _hashCode += getCapMan__Latest_Expense_Date__c().hashCode();
        }
        if (getCapMan__Liquidation_Analytics__r() != null) {
            _hashCode += getCapMan__Liquidation_Analytics__r().hashCode();
        }
        if (getCapMan__Liquidity_Status__c() != null) {
            _hashCode += getCapMan__Liquidity_Status__c().hashCode();
        }
        if (getCapMan__LogoAddress__c() != null) {
            _hashCode += getCapMan__LogoAddress__c().hashCode();
        }
        if (getCapMan__NameAutoNumber__c() != null) {
            _hashCode += getCapMan__NameAutoNumber__c().hashCode();
        }
        if (getCapMan__Number_of_Steps__c() != null) {
            _hashCode += getCapMan__Number_of_Steps__c().hashCode();
        }
        if (getCapMan__Option_Calculation_Type__c() != null) {
            _hashCode += getCapMan__Option_Calculation_Type__c().hashCode();
        }
        if (getCapMan__Option_Expense_Type__c() != null) {
            _hashCode += getCapMan__Option_Expense_Type__c().hashCode();
        }
        if (getCapMan__Options_Available__c() != null) {
            _hashCode += getCapMan__Options_Available__c().hashCode();
        }
        if (getCapMan__Options_Expense_Amortization_Type__c() != null) {
            _hashCode += getCapMan__Options_Expense_Amortization_Type__c().hashCode();
        }
        if (getCapMan__Options_Expense_Begin_Date__c() != null) {
            _hashCode += getCapMan__Options_Expense_Begin_Date__c().hashCode();
        }
        if (getCapMan__Options_Expense_End_Date__c() != null) {
            _hashCode += getCapMan__Options_Expense_End_Date__c().hashCode();
        }
        if (getCapMan__Options_Expensing_Frequency__c() != null) {
            _hashCode += getCapMan__Options_Expensing_Frequency__c().hashCode();
        }
        if (getCapMan__Options_Outstanding__c() != null) {
            _hashCode += getCapMan__Options_Outstanding__c().hashCode();
        }
        if (getCapMan__Options_Vesting_Frequency__c() != null) {
            _hashCode += getCapMan__Options_Vesting_Frequency__c().hashCode();
        }
        if (getCapMan__Options__c() != null) {
            _hashCode += getCapMan__Options__c().hashCode();
        }
        if (getCapMan__Options__r() != null) {
            _hashCode += getCapMan__Options__r().hashCode();
        }
        if (getCapMan__Payout_Fully_Diluted_Shares__c() != null) {
            _hashCode += getCapMan__Payout_Fully_Diluted_Shares__c().hashCode();
        }
        if (getCapMan__Report_Date__c() != null) {
            _hashCode += getCapMan__Report_Date__c().hashCode();
        }
        if (getCapMan__Risk_Free_Rate__c() != null) {
            _hashCode += getCapMan__Risk_Free_Rate__c().hashCode();
        }
        if (getCapMan__Securities1__r() != null) {
            _hashCode += getCapMan__Securities1__r().hashCode();
        }
        if (getCapMan__SecurityTransactions__r() != null) {
            _hashCode += getCapMan__SecurityTransactions__r().hashCode();
        }
        if (getCapMan__Stock_Distribution__c() != null) {
            _hashCode += getCapMan__Stock_Distribution__c().hashCode();
        }
        if (getCapMan__Stock_Splits__c() != null) {
            _hashCode += getCapMan__Stock_Splits__c().hashCode();
        }
        if (getCapMan__Stock_Splits__r() != null) {
            _hashCode += getCapMan__Stock_Splits__r().hashCode();
        }
        if (getCapMan__Sub_Industry__c() != null) {
            _hashCode += getCapMan__Sub_Industry__c().hashCode();
        }
        if (getCapMan__TaxRate__c() != null) {
            _hashCode += getCapMan__TaxRate__c().hashCode();
        }
        if (getCapMan__TotCommonAsConv__c() != null) {
            _hashCode += getCapMan__TotCommonAsConv__c().hashCode();
        }
        if (getCapMan__TotConvDebtAsConv__c() != null) {
            _hashCode += getCapMan__TotConvDebtAsConv__c().hashCode();
        }
        if (getCapMan__TotOptionsAvailableAsConv__c() != null) {
            _hashCode += getCapMan__TotOptionsAvailableAsConv__c().hashCode();
        }
        if (getCapMan__TotOptsAsConv__c() != null) {
            _hashCode += getCapMan__TotOptsAsConv__c().hashCode();
        }
        if (getCapMan__TotSerAasConv__c() != null) {
            _hashCode += getCapMan__TotSerAasConv__c().hashCode();
        }
        if (getCapMan__TotSerBasConv__c() != null) {
            _hashCode += getCapMan__TotSerBasConv__c().hashCode();
        }
        if (getCapMan__TotSerCasConv__c() != null) {
            _hashCode += getCapMan__TotSerCasConv__c().hashCode();
        }
        if (getCapMan__TotSerDasConv__c() != null) {
            _hashCode += getCapMan__TotSerDasConv__c().hashCode();
        }
        if (getCapMan__TotSerEasConv__c() != null) {
            _hashCode += getCapMan__TotSerEasConv__c().hashCode();
        }
        if (getCapMan__TotWarAsConv__c() != null) {
            _hashCode += getCapMan__TotWarAsConv__c().hashCode();
        }
        if (getCapMan__TotalIssuedOptions__c() != null) {
            _hashCode += getCapMan__TotalIssuedOptions__c().hashCode();
        }
        if (getCapMan__TotalWarCommonAsConv__c() != null) {
            _hashCode += getCapMan__TotalWarCommonAsConv__c().hashCode();
        }
        if (getCapMan__Total_Authorized_Shares__c() != null) {
            _hashCode += getCapMan__Total_Authorized_Shares__c().hashCode();
        }
        if (getCapMan__Total_Common__c() != null) {
            _hashCode += getCapMan__Total_Common__c().hashCode();
        }
        if (getCapMan__Total_Issued_Shares__c() != null) {
            _hashCode += getCapMan__Total_Issued_Shares__c().hashCode();
        }
        if (getCapMan__Total_Issued_Warrants__c() != null) {
            _hashCode += getCapMan__Total_Issued_Warrants__c().hashCode();
        }
        if (getCapMan__Total_Preferred__c() != null) {
            _hashCode += getCapMan__Total_Preferred__c().hashCode();
        }
        if (getCapMan__TotalsAsConv__c() != null) {
            _hashCode += getCapMan__TotalsAsConv__c().hashCode();
        }
        if (getCapMan__TotalsAsConvertedConvertible__c() != null) {
            _hashCode += getCapMan__TotalsAsConvertedConvertible__c().hashCode();
        }
        if (getCapMan__Volatility__c() != null) {
            _hashCode += getCapMan__Volatility__c().hashCode();
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
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMan__Capitalization__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Capitalization__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Acquire_Common_Stock_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Acquire_Common_Stock_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Acquirer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Acquirer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Acquirer__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Acquirer__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Acquisition_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Acquisition_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AsConvertedOptionsAvailable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AsConvertedOptionsAvailable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__As_Converted_Debt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__As_Converted_Debt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__As_Converted_Warrants__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__As_Converted_Warrants__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AuthorizedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AuthorizedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Balances__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Balances__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Board_Meetings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Board_Meetings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Cash_Distribution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Cash_Distribution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Company__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Company__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Currency_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Currency_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DebtAuthorized__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtAuthorized__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DebtIssued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtIssued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DilutedMinusConvertable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DilutedMinusConvertable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EquityType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EquityType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Exit_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exit_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Exit_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exit_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Exit_Valuation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exit_Valuation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Financial_Datas__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Financial_Datas__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fully_Diluted_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fully_Diluted_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Fully_Diluted_as_Converted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Fully_Diluted_as_Converted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Immediate_Investor_Stock_Distribution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Immediate_Investor_Stock_Distribution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Incorporation_State__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Incorporation_State__c"));
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
        elemField.setFieldName("capMan__Issuances__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuances__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__IssuedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__IssuedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__LastUpdate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LastUpdate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Latest_Expense_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Latest_Expense_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidation_Analytics__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Analytics__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Liquidity_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidity_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LogoAddress__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LogoAddress__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__NameAutoNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__NameAutoNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Number_of_Steps__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Number_of_Steps__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Option_Calculation_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Option_Calculation_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Option_Expense_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Option_Expense_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Available__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Available__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Expense_Amortization_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Expense_Amortization_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Expense_Begin_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Expense_Begin_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Expense_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Expense_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Expensing_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Expensing_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Outstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Outstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Vesting_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Vesting_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Payout_Fully_Diluted_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Payout_Fully_Diluted_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Risk_Free_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Risk_Free_Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Securities1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Securities1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SecurityTransactions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityTransactions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Stock_Distribution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Stock_Distribution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Stock_Splits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Stock_Splits__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Stock_Splits__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Stock_Splits__r"));
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
        elemField.setFieldName("capMan__TaxRate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TaxRate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotCommonAsConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotCommonAsConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotConvDebtAsConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotConvDebtAsConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotOptionsAvailableAsConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotOptionsAvailableAsConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotOptsAsConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotOptsAsConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotSerAasConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotSerAasConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotSerBasConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotSerBasConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotSerCasConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotSerCasConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotSerDasConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotSerDasConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotSerEasConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotSerEasConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotWarAsConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotWarAsConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotalIssuedOptions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotalIssuedOptions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotalWarCommonAsConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotalWarCommonAsConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Total_Authorized_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Total_Authorized_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Total_Common__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Total_Common__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Total_Issued_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Total_Issued_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Total_Issued_Warrants__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Total_Issued_Warrants__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Total_Preferred__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Total_Preferred__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotalsAsConv__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotalsAsConv__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotalsAsConvertedConvertible__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotalsAsConvertedConvertible__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Volatility__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Volatility__c"));
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
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
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
