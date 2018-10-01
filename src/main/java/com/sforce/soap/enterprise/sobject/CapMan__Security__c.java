/**
 * CapMan__Security__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Security__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Account_Address__c;

    private java.lang.Double capMan__Accrued_Interest__c;

    private java.lang.Double capMan__AfterTaxInterestPayable__c;

    private java.lang.String capMan__Anti_Dilution__c;

    private java.lang.Double capMan__AsConvertedOptions__c;

    private java.lang.Double capMan__AsConvertedShares__c;

    private java.lang.Double capMan__AsConvertedWarrants__c;

    private java.lang.Double capMan__As_Converted_Debt__c;

    private java.lang.String capMan__Asset_Class_Level__c;

    private java.lang.String capMan__Asset_Class__c;

    private java.util.Date capMan__Authorization_Date__c;

    private java.lang.Double capMan__AuthorizedSecurities__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Capitalizations__r;

    private java.lang.Double capMan__Class_Pct_Ownership__c;

    private java.lang.Double capMan__Class_Percentage__c;

    private java.lang.Boolean capMan__CoSaleAgreement__c;

    private java.lang.String capMan__Comment__c;

    private java.lang.Double capMan__ConversionPrice2__c;

    private java.lang.Double capMan__ConversionPrice__c;

    private java.lang.Double capMan__ConversionRatioInput2__c;

    private java.lang.Double capMan__ConversionRatioInput__c;

    private java.lang.Double capMan__ConversionThreshold__c;

    private java.lang.Double capMan__Conversion_Amount_Threshold__c;

    private java.lang.Double capMan__Conversion_Ratio__c;

    private com.sforce.soap.enterprise.QueryResult capMan__ConvertibleDebt_Securities1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__ConvertibleDebt_Securities__r;

    private java.lang.Boolean capMan__ConvertibleUponCertainEvents__c;

    private java.lang.Boolean capMan__ConvertibleUponMajorityElection__c;

    private java.lang.Double capMan__Converting_Amount__c;

    private java.util.Date capMan__Converting_Date__c;

    private java.lang.Double capMan__Cumulative_Dividends_Per_Share__c;

    private java.util.Date capMan__Date__c;

    private java.lang.Double capMan__DebtAuthorized__c;

    private java.lang.Double capMan__DebtConverted__c;

    private java.lang.Double capMan__DebtIssued__c;

    private java.lang.Double capMan__DebtParValue__c;

    private java.lang.Double capMan__DebtRatio__c;

    private java.lang.Double capMan__DebtRedeemed__c;

    private java.lang.Double capMan__DebtServiceCoverageRatio__c;

    private java.lang.Double capMan__DebtToEquityRatio__c;

    private java.lang.String capMan__DebtType__c;

    private java.lang.Double capMan__Debt_Outstanding__c;

    private java.lang.Boolean capMan__Declare_Dividend__c;

    private java.lang.Double capMan__Demand_Registration_Percent__c;

    private java.lang.Double capMan__Demand_Registration_Threshold__c;

    private java.util.Date capMan__Dividend_Termination_Date__c;

    private java.lang.String capMan__Dividend_Type__c;

    private java.lang.Boolean capMan__EarlyExercise__c;

    private java.lang.String capMan__EquityType__c;

    private java.lang.Double capMan__Exercise_Price2__c;

    private java.lang.Double capMan__Exercise_Price__c;

    private java.util.Date capMan__Expiration_Date__c;

    private java.lang.Double capMan__InterestCoverageRatio__c;

    private java.lang.Double capMan__InterestRate__c;

    private java.lang.String capMan__Interest_Payment_Frequency__c;

    private java.lang.Boolean capMan__IsConverted__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Issuances1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Issuances__r;

    private java.lang.Boolean capMan__Issued__c;

    private java.lang.String capMan__IssuerLink__c;

    private java.lang.String capMan__IssuerName__c;

    private java.lang.String capMan__Issuer__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r;

    private java.lang.Double capMan__LiquidationMultiple2__c;

    private java.lang.Double capMan__LiquidationMultiple__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Include_Derivatives__r;

    private java.lang.Double capMan__Liquidation_Preference__c;

    private java.lang.Double capMan__LongTermDebttoTotalAsset__c;

    private java.util.Date capMan__MandatoryConvertDate__c;

    private java.lang.Double capMan__MarketWeightedPrice2__c;

    private java.lang.Double capMan__MarketWeightedPrice__c;

    private java.util.Date capMan__MaturityDate__c;

    private java.lang.String capMan__Name__c;

    private java.lang.String capMan__Notes_for_Rights__c;

    private java.lang.Double capMan__NumberOfTransactions__c;

    private java.lang.Double capMan__OldAuthorized__c;

    private java.lang.Double capMan__OptionsAuthorized__c;

    private java.lang.Double capMan__OptionsCancelled__c;

    private java.lang.Double capMan__OptionsExercised__c;

    private java.lang.Double capMan__OptionsIssued__c;

    private java.lang.Boolean capMan__OptionsRecyclable__c;

    private java.lang.Double capMan__Options_Available_For_Grant__c;

    private java.lang.Double capMan__Options_Outstanding__c;

    private java.lang.Double capMan__Order_by_security_type__c;

    private java.lang.Double capMan__OtherLiquidationAmount__c;

    private java.lang.Double capMan__ParValue__c;

    private java.lang.String capMan__Participating_Text_for_Term_Sheet__c;

    private java.lang.Boolean capMan__Participating__c;

    private java.lang.Double capMan__ParticipationCap__c;

    private java.lang.Double capMan__Participation_Cap_New2__c;

    private java.lang.Double capMan__Participation_Cap_New__c;

    private java.lang.String capMan__Participation_Type__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Pay_to_Play_Links__r;

    private java.lang.Double capMan__PayoffRank_Conversion__c;

    private java.lang.Double capMan__PayoffRank__c;

    private java.lang.Double capMan__PctVotesforNewShares__c;

    private java.lang.Double capMan__PctVotestoAmend__c;

    private java.lang.Double capMan__Pct_to_change_control__c;

    private java.lang.Double capMan__PcttoIssueDebt__c;

    private java.lang.String capMan__Picklist__c;

    private java.lang.Boolean capMan__PreemptiveRights__c;

    private java.lang.Double capMan__PreferredDividendPct__c;

    private java.lang.Double capMan__PreferredDividend__c;

    private java.lang.String capMan__Preferred_Dividend_Unit__c;

    private java.lang.Double capMan__Price_Cap__c;

    private java.lang.Boolean capMan__Pro_Rata_Rights__c;

    private java.lang.Double capMan__Protective_Provision__c;

    private java.lang.String capMan__Rank_conversion__c;

    private java.lang.String capMan__Rank_participating__c;

    private java.lang.Boolean capMan__RecalcSecurity__c;

    private java.lang.Boolean capMan__Redeemable__c;

    private java.lang.Boolean capMan__Redemption_Rights__c;

    private java.lang.String capMan__ReferencedRankedSecurity__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__ReferencedRankedSecurity__r;

    private java.lang.String capMan__Referenced_Converted_Security__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Referenced_Converted_Security__r;

    private java.lang.Boolean capMan__RegistrationRights__c;

    private java.lang.Boolean capMan__RightofFirstRefusal__c;

    private java.lang.Boolean capMan__Rule144Restriction__c;

    private java.lang.Boolean capMan__Rule144__c;

    private java.lang.Boolean capMan__Rule701__c;

    private java.lang.Boolean capMan__Section83B__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Securities1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Securities3__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Securities_Trade_States__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Securities__r;

    private java.lang.String capMan__SecurityLink__c;

    private java.lang.String capMan__SecurityName__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Security_Price_History__r;

    private java.lang.String capMan__Security_Type__c;

    private java.util.Date capMan__SharePriceDate__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Share_Authorizations__r;

    private java.lang.Double capMan__Share_Price2__c;

    private java.lang.Double capMan__Share_Price_Current2__c;

    private java.lang.Double capMan__Share_Price_Current__c;

    private java.lang.Double capMan__Share_Price_Previous_Current2__c;

    private java.lang.Double capMan__Share_Price__c;

    private java.lang.Double capMan__SharesIssued__c;

    private java.lang.Double capMan__Shares__c;

    private java.lang.Double capMan__Sort_Param1__c;

    private java.lang.Double capMan__TotalRaised__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Transactions__r;

    private java.lang.String capMan__Underlying_Security__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Underlying_Security__r;

    private java.lang.Double capMan__Underlying_Shares_Outstanding__c;

    private java.lang.Double capMan__VotingRatio__c;

    private java.lang.String capMan__Voting_Notes__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Warrant_Schedule1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Warrant_Schedule__r;

    private java.lang.Double capMan__WarrantsAuthorized__c;

    private java.lang.Double capMan__WarrantsCancelled__c;

    private java.lang.Double capMan__WarrantsExercised__c;

    private java.lang.Double capMan__WarrantsIssued__c;

    private java.lang.Double capMan__WarrantsOutstanding__c;

    private java.lang.Double capMan__WeightedAverageOptions__c;

    private java.lang.Double capMan__payout_asconvertedoptions__c;

    private java.lang.Double capMan__payout_asconvertedshares__c;

    private java.lang.Double capMan__payout_asconvertedwarrants__c;

    private java.lang.Double capMan__payout_debt_outstanding__c;

    private java.lang.Double capMan__payout_debtissued__c;

    private java.lang.Double capMan__payout_options_outstanding__c;

    private java.lang.Double capMan__payout_optionsissued__c;

    private java.lang.Double capMan__payout_sharesissued__c;

    private java.lang.Boolean capMan__payout_transactionExisted__c;

    private java.lang.Double capMan__payout_warrantsissued__c;

    private java.lang.Double capMan__payout_warrantsoutstanding__c;

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

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public CapMan__Security__c() {
    }

    public CapMan__Security__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Account_Address__c,
           java.lang.Double capMan__Accrued_Interest__c,
           java.lang.Double capMan__AfterTaxInterestPayable__c,
           java.lang.String capMan__Anti_Dilution__c,
           java.lang.Double capMan__AsConvertedOptions__c,
           java.lang.Double capMan__AsConvertedShares__c,
           java.lang.Double capMan__AsConvertedWarrants__c,
           java.lang.Double capMan__As_Converted_Debt__c,
           java.lang.String capMan__Asset_Class_Level__c,
           java.lang.String capMan__Asset_Class__c,
           java.util.Date capMan__Authorization_Date__c,
           java.lang.Double capMan__AuthorizedSecurities__c,
           com.sforce.soap.enterprise.QueryResult capMan__Capitalizations__r,
           java.lang.Double capMan__Class_Pct_Ownership__c,
           java.lang.Double capMan__Class_Percentage__c,
           java.lang.Boolean capMan__CoSaleAgreement__c,
           java.lang.String capMan__Comment__c,
           java.lang.Double capMan__ConversionPrice2__c,
           java.lang.Double capMan__ConversionPrice__c,
           java.lang.Double capMan__ConversionRatioInput2__c,
           java.lang.Double capMan__ConversionRatioInput__c,
           java.lang.Double capMan__ConversionThreshold__c,
           java.lang.Double capMan__Conversion_Amount_Threshold__c,
           java.lang.Double capMan__Conversion_Ratio__c,
           com.sforce.soap.enterprise.QueryResult capMan__ConvertibleDebt_Securities1__r,
           com.sforce.soap.enterprise.QueryResult capMan__ConvertibleDebt_Securities__r,
           java.lang.Boolean capMan__ConvertibleUponCertainEvents__c,
           java.lang.Boolean capMan__ConvertibleUponMajorityElection__c,
           java.lang.Double capMan__Converting_Amount__c,
           java.util.Date capMan__Converting_Date__c,
           java.lang.Double capMan__Cumulative_Dividends_Per_Share__c,
           java.util.Date capMan__Date__c,
           java.lang.Double capMan__DebtAuthorized__c,
           java.lang.Double capMan__DebtConverted__c,
           java.lang.Double capMan__DebtIssued__c,
           java.lang.Double capMan__DebtParValue__c,
           java.lang.Double capMan__DebtRatio__c,
           java.lang.Double capMan__DebtRedeemed__c,
           java.lang.Double capMan__DebtServiceCoverageRatio__c,
           java.lang.Double capMan__DebtToEquityRatio__c,
           java.lang.String capMan__DebtType__c,
           java.lang.Double capMan__Debt_Outstanding__c,
           java.lang.Boolean capMan__Declare_Dividend__c,
           java.lang.Double capMan__Demand_Registration_Percent__c,
           java.lang.Double capMan__Demand_Registration_Threshold__c,
           java.util.Date capMan__Dividend_Termination_Date__c,
           java.lang.String capMan__Dividend_Type__c,
           java.lang.Boolean capMan__EarlyExercise__c,
           java.lang.String capMan__EquityType__c,
           java.lang.Double capMan__Exercise_Price2__c,
           java.lang.Double capMan__Exercise_Price__c,
           java.util.Date capMan__Expiration_Date__c,
           java.lang.Double capMan__InterestCoverageRatio__c,
           java.lang.Double capMan__InterestRate__c,
           java.lang.String capMan__Interest_Payment_Frequency__c,
           java.lang.Boolean capMan__IsConverted__c,
           com.sforce.soap.enterprise.QueryResult capMan__Issuances1__r,
           com.sforce.soap.enterprise.QueryResult capMan__Issuances__r,
           java.lang.Boolean capMan__Issued__c,
           java.lang.String capMan__IssuerLink__c,
           java.lang.String capMan__IssuerName__c,
           java.lang.String capMan__Issuer__c,
           com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r,
           java.lang.Double capMan__LiquidationMultiple2__c,
           java.lang.Double capMan__LiquidationMultiple__c,
           com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Include_Derivatives__r,
           java.lang.Double capMan__Liquidation_Preference__c,
           java.lang.Double capMan__LongTermDebttoTotalAsset__c,
           java.util.Date capMan__MandatoryConvertDate__c,
           java.lang.Double capMan__MarketWeightedPrice2__c,
           java.lang.Double capMan__MarketWeightedPrice__c,
           java.util.Date capMan__MaturityDate__c,
           java.lang.String capMan__Name__c,
           java.lang.String capMan__Notes_for_Rights__c,
           java.lang.Double capMan__NumberOfTransactions__c,
           java.lang.Double capMan__OldAuthorized__c,
           java.lang.Double capMan__OptionsAuthorized__c,
           java.lang.Double capMan__OptionsCancelled__c,
           java.lang.Double capMan__OptionsExercised__c,
           java.lang.Double capMan__OptionsIssued__c,
           java.lang.Boolean capMan__OptionsRecyclable__c,
           java.lang.Double capMan__Options_Available_For_Grant__c,
           java.lang.Double capMan__Options_Outstanding__c,
           java.lang.Double capMan__Order_by_security_type__c,
           java.lang.Double capMan__OtherLiquidationAmount__c,
           java.lang.Double capMan__ParValue__c,
           java.lang.String capMan__Participating_Text_for_Term_Sheet__c,
           java.lang.Boolean capMan__Participating__c,
           java.lang.Double capMan__ParticipationCap__c,
           java.lang.Double capMan__Participation_Cap_New2__c,
           java.lang.Double capMan__Participation_Cap_New__c,
           java.lang.String capMan__Participation_Type__c,
           com.sforce.soap.enterprise.QueryResult capMan__Pay_to_Play_Links__r,
           java.lang.Double capMan__PayoffRank_Conversion__c,
           java.lang.Double capMan__PayoffRank__c,
           java.lang.Double capMan__PctVotesforNewShares__c,
           java.lang.Double capMan__PctVotestoAmend__c,
           java.lang.Double capMan__Pct_to_change_control__c,
           java.lang.Double capMan__PcttoIssueDebt__c,
           java.lang.String capMan__Picklist__c,
           java.lang.Boolean capMan__PreemptiveRights__c,
           java.lang.Double capMan__PreferredDividendPct__c,
           java.lang.Double capMan__PreferredDividend__c,
           java.lang.String capMan__Preferred_Dividend_Unit__c,
           java.lang.Double capMan__Price_Cap__c,
           java.lang.Boolean capMan__Pro_Rata_Rights__c,
           java.lang.Double capMan__Protective_Provision__c,
           java.lang.String capMan__Rank_conversion__c,
           java.lang.String capMan__Rank_participating__c,
           java.lang.Boolean capMan__RecalcSecurity__c,
           java.lang.Boolean capMan__Redeemable__c,
           java.lang.Boolean capMan__Redemption_Rights__c,
           java.lang.String capMan__ReferencedRankedSecurity__c,
           com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__ReferencedRankedSecurity__r,
           java.lang.String capMan__Referenced_Converted_Security__c,
           com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Referenced_Converted_Security__r,
           java.lang.Boolean capMan__RegistrationRights__c,
           java.lang.Boolean capMan__RightofFirstRefusal__c,
           java.lang.Boolean capMan__Rule144Restriction__c,
           java.lang.Boolean capMan__Rule144__c,
           java.lang.Boolean capMan__Rule701__c,
           java.lang.Boolean capMan__Section83B__c,
           com.sforce.soap.enterprise.QueryResult capMan__Securities1__r,
           com.sforce.soap.enterprise.QueryResult capMan__Securities3__r,
           com.sforce.soap.enterprise.QueryResult capMan__Securities_Trade_States__r,
           com.sforce.soap.enterprise.QueryResult capMan__Securities__r,
           java.lang.String capMan__SecurityLink__c,
           java.lang.String capMan__SecurityName__c,
           com.sforce.soap.enterprise.QueryResult capMan__Security_Price_History__r,
           java.lang.String capMan__Security_Type__c,
           java.util.Date capMan__SharePriceDate__c,
           com.sforce.soap.enterprise.QueryResult capMan__Share_Authorizations__r,
           java.lang.Double capMan__Share_Price2__c,
           java.lang.Double capMan__Share_Price_Current2__c,
           java.lang.Double capMan__Share_Price_Current__c,
           java.lang.Double capMan__Share_Price_Previous_Current2__c,
           java.lang.Double capMan__Share_Price__c,
           java.lang.Double capMan__SharesIssued__c,
           java.lang.Double capMan__Shares__c,
           java.lang.Double capMan__Sort_Param1__c,
           java.lang.Double capMan__TotalRaised__c,
           com.sforce.soap.enterprise.QueryResult capMan__Transactions__r,
           java.lang.String capMan__Underlying_Security__c,
           com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Underlying_Security__r,
           java.lang.Double capMan__Underlying_Shares_Outstanding__c,
           java.lang.Double capMan__VotingRatio__c,
           java.lang.String capMan__Voting_Notes__c,
           com.sforce.soap.enterprise.QueryResult capMan__Warrant_Schedule1__r,
           com.sforce.soap.enterprise.QueryResult capMan__Warrant_Schedule__r,
           java.lang.Double capMan__WarrantsAuthorized__c,
           java.lang.Double capMan__WarrantsCancelled__c,
           java.lang.Double capMan__WarrantsExercised__c,
           java.lang.Double capMan__WarrantsIssued__c,
           java.lang.Double capMan__WarrantsOutstanding__c,
           java.lang.Double capMan__WeightedAverageOptions__c,
           java.lang.Double capMan__payout_asconvertedoptions__c,
           java.lang.Double capMan__payout_asconvertedshares__c,
           java.lang.Double capMan__payout_asconvertedwarrants__c,
           java.lang.Double capMan__payout_debt_outstanding__c,
           java.lang.Double capMan__payout_debtissued__c,
           java.lang.Double capMan__payout_options_outstanding__c,
           java.lang.Double capMan__payout_optionsissued__c,
           java.lang.Double capMan__payout_sharesissued__c,
           java.lang.Boolean capMan__payout_transactionExisted__c,
           java.lang.Double capMan__payout_warrantsissued__c,
           java.lang.Double capMan__payout_warrantsoutstanding__c,
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
        this.capMan__Accrued_Interest__c = capMan__Accrued_Interest__c;
        this.capMan__AfterTaxInterestPayable__c = capMan__AfterTaxInterestPayable__c;
        this.capMan__Anti_Dilution__c = capMan__Anti_Dilution__c;
        this.capMan__AsConvertedOptions__c = capMan__AsConvertedOptions__c;
        this.capMan__AsConvertedShares__c = capMan__AsConvertedShares__c;
        this.capMan__AsConvertedWarrants__c = capMan__AsConvertedWarrants__c;
        this.capMan__As_Converted_Debt__c = capMan__As_Converted_Debt__c;
        this.capMan__Asset_Class_Level__c = capMan__Asset_Class_Level__c;
        this.capMan__Asset_Class__c = capMan__Asset_Class__c;
        this.capMan__Authorization_Date__c = capMan__Authorization_Date__c;
        this.capMan__AuthorizedSecurities__c = capMan__AuthorizedSecurities__c;
        this.capMan__Capitalizations__r = capMan__Capitalizations__r;
        this.capMan__Class_Pct_Ownership__c = capMan__Class_Pct_Ownership__c;
        this.capMan__Class_Percentage__c = capMan__Class_Percentage__c;
        this.capMan__CoSaleAgreement__c = capMan__CoSaleAgreement__c;
        this.capMan__Comment__c = capMan__Comment__c;
        this.capMan__ConversionPrice2__c = capMan__ConversionPrice2__c;
        this.capMan__ConversionPrice__c = capMan__ConversionPrice__c;
        this.capMan__ConversionRatioInput2__c = capMan__ConversionRatioInput2__c;
        this.capMan__ConversionRatioInput__c = capMan__ConversionRatioInput__c;
        this.capMan__ConversionThreshold__c = capMan__ConversionThreshold__c;
        this.capMan__Conversion_Amount_Threshold__c = capMan__Conversion_Amount_Threshold__c;
        this.capMan__Conversion_Ratio__c = capMan__Conversion_Ratio__c;
        this.capMan__ConvertibleDebt_Securities1__r = capMan__ConvertibleDebt_Securities1__r;
        this.capMan__ConvertibleDebt_Securities__r = capMan__ConvertibleDebt_Securities__r;
        this.capMan__ConvertibleUponCertainEvents__c = capMan__ConvertibleUponCertainEvents__c;
        this.capMan__ConvertibleUponMajorityElection__c = capMan__ConvertibleUponMajorityElection__c;
        this.capMan__Converting_Amount__c = capMan__Converting_Amount__c;
        this.capMan__Converting_Date__c = capMan__Converting_Date__c;
        this.capMan__Cumulative_Dividends_Per_Share__c = capMan__Cumulative_Dividends_Per_Share__c;
        this.capMan__Date__c = capMan__Date__c;
        this.capMan__DebtAuthorized__c = capMan__DebtAuthorized__c;
        this.capMan__DebtConverted__c = capMan__DebtConverted__c;
        this.capMan__DebtIssued__c = capMan__DebtIssued__c;
        this.capMan__DebtParValue__c = capMan__DebtParValue__c;
        this.capMan__DebtRatio__c = capMan__DebtRatio__c;
        this.capMan__DebtRedeemed__c = capMan__DebtRedeemed__c;
        this.capMan__DebtServiceCoverageRatio__c = capMan__DebtServiceCoverageRatio__c;
        this.capMan__DebtToEquityRatio__c = capMan__DebtToEquityRatio__c;
        this.capMan__DebtType__c = capMan__DebtType__c;
        this.capMan__Debt_Outstanding__c = capMan__Debt_Outstanding__c;
        this.capMan__Declare_Dividend__c = capMan__Declare_Dividend__c;
        this.capMan__Demand_Registration_Percent__c = capMan__Demand_Registration_Percent__c;
        this.capMan__Demand_Registration_Threshold__c = capMan__Demand_Registration_Threshold__c;
        this.capMan__Dividend_Termination_Date__c = capMan__Dividend_Termination_Date__c;
        this.capMan__Dividend_Type__c = capMan__Dividend_Type__c;
        this.capMan__EarlyExercise__c = capMan__EarlyExercise__c;
        this.capMan__EquityType__c = capMan__EquityType__c;
        this.capMan__Exercise_Price2__c = capMan__Exercise_Price2__c;
        this.capMan__Exercise_Price__c = capMan__Exercise_Price__c;
        this.capMan__Expiration_Date__c = capMan__Expiration_Date__c;
        this.capMan__InterestCoverageRatio__c = capMan__InterestCoverageRatio__c;
        this.capMan__InterestRate__c = capMan__InterestRate__c;
        this.capMan__Interest_Payment_Frequency__c = capMan__Interest_Payment_Frequency__c;
        this.capMan__IsConverted__c = capMan__IsConverted__c;
        this.capMan__Issuances1__r = capMan__Issuances1__r;
        this.capMan__Issuances__r = capMan__Issuances__r;
        this.capMan__Issued__c = capMan__Issued__c;
        this.capMan__IssuerLink__c = capMan__IssuerLink__c;
        this.capMan__IssuerName__c = capMan__IssuerName__c;
        this.capMan__Issuer__c = capMan__Issuer__c;
        this.capMan__Issuer__r = capMan__Issuer__r;
        this.capMan__LiquidationMultiple2__c = capMan__LiquidationMultiple2__c;
        this.capMan__LiquidationMultiple__c = capMan__LiquidationMultiple__c;
        this.capMan__Liquidation_Include_Derivatives__r = capMan__Liquidation_Include_Derivatives__r;
        this.capMan__Liquidation_Preference__c = capMan__Liquidation_Preference__c;
        this.capMan__LongTermDebttoTotalAsset__c = capMan__LongTermDebttoTotalAsset__c;
        this.capMan__MandatoryConvertDate__c = capMan__MandatoryConvertDate__c;
        this.capMan__MarketWeightedPrice2__c = capMan__MarketWeightedPrice2__c;
        this.capMan__MarketWeightedPrice__c = capMan__MarketWeightedPrice__c;
        this.capMan__MaturityDate__c = capMan__MaturityDate__c;
        this.capMan__Name__c = capMan__Name__c;
        this.capMan__Notes_for_Rights__c = capMan__Notes_for_Rights__c;
        this.capMan__NumberOfTransactions__c = capMan__NumberOfTransactions__c;
        this.capMan__OldAuthorized__c = capMan__OldAuthorized__c;
        this.capMan__OptionsAuthorized__c = capMan__OptionsAuthorized__c;
        this.capMan__OptionsCancelled__c = capMan__OptionsCancelled__c;
        this.capMan__OptionsExercised__c = capMan__OptionsExercised__c;
        this.capMan__OptionsIssued__c = capMan__OptionsIssued__c;
        this.capMan__OptionsRecyclable__c = capMan__OptionsRecyclable__c;
        this.capMan__Options_Available_For_Grant__c = capMan__Options_Available_For_Grant__c;
        this.capMan__Options_Outstanding__c = capMan__Options_Outstanding__c;
        this.capMan__Order_by_security_type__c = capMan__Order_by_security_type__c;
        this.capMan__OtherLiquidationAmount__c = capMan__OtherLiquidationAmount__c;
        this.capMan__ParValue__c = capMan__ParValue__c;
        this.capMan__Participating_Text_for_Term_Sheet__c = capMan__Participating_Text_for_Term_Sheet__c;
        this.capMan__Participating__c = capMan__Participating__c;
        this.capMan__ParticipationCap__c = capMan__ParticipationCap__c;
        this.capMan__Participation_Cap_New2__c = capMan__Participation_Cap_New2__c;
        this.capMan__Participation_Cap_New__c = capMan__Participation_Cap_New__c;
        this.capMan__Participation_Type__c = capMan__Participation_Type__c;
        this.capMan__Pay_to_Play_Links__r = capMan__Pay_to_Play_Links__r;
        this.capMan__PayoffRank_Conversion__c = capMan__PayoffRank_Conversion__c;
        this.capMan__PayoffRank__c = capMan__PayoffRank__c;
        this.capMan__PctVotesforNewShares__c = capMan__PctVotesforNewShares__c;
        this.capMan__PctVotestoAmend__c = capMan__PctVotestoAmend__c;
        this.capMan__Pct_to_change_control__c = capMan__Pct_to_change_control__c;
        this.capMan__PcttoIssueDebt__c = capMan__PcttoIssueDebt__c;
        this.capMan__Picklist__c = capMan__Picklist__c;
        this.capMan__PreemptiveRights__c = capMan__PreemptiveRights__c;
        this.capMan__PreferredDividendPct__c = capMan__PreferredDividendPct__c;
        this.capMan__PreferredDividend__c = capMan__PreferredDividend__c;
        this.capMan__Preferred_Dividend_Unit__c = capMan__Preferred_Dividend_Unit__c;
        this.capMan__Price_Cap__c = capMan__Price_Cap__c;
        this.capMan__Pro_Rata_Rights__c = capMan__Pro_Rata_Rights__c;
        this.capMan__Protective_Provision__c = capMan__Protective_Provision__c;
        this.capMan__Rank_conversion__c = capMan__Rank_conversion__c;
        this.capMan__Rank_participating__c = capMan__Rank_participating__c;
        this.capMan__RecalcSecurity__c = capMan__RecalcSecurity__c;
        this.capMan__Redeemable__c = capMan__Redeemable__c;
        this.capMan__Redemption_Rights__c = capMan__Redemption_Rights__c;
        this.capMan__ReferencedRankedSecurity__c = capMan__ReferencedRankedSecurity__c;
        this.capMan__ReferencedRankedSecurity__r = capMan__ReferencedRankedSecurity__r;
        this.capMan__Referenced_Converted_Security__c = capMan__Referenced_Converted_Security__c;
        this.capMan__Referenced_Converted_Security__r = capMan__Referenced_Converted_Security__r;
        this.capMan__RegistrationRights__c = capMan__RegistrationRights__c;
        this.capMan__RightofFirstRefusal__c = capMan__RightofFirstRefusal__c;
        this.capMan__Rule144Restriction__c = capMan__Rule144Restriction__c;
        this.capMan__Rule144__c = capMan__Rule144__c;
        this.capMan__Rule701__c = capMan__Rule701__c;
        this.capMan__Section83B__c = capMan__Section83B__c;
        this.capMan__Securities1__r = capMan__Securities1__r;
        this.capMan__Securities3__r = capMan__Securities3__r;
        this.capMan__Securities_Trade_States__r = capMan__Securities_Trade_States__r;
        this.capMan__Securities__r = capMan__Securities__r;
        this.capMan__SecurityLink__c = capMan__SecurityLink__c;
        this.capMan__SecurityName__c = capMan__SecurityName__c;
        this.capMan__Security_Price_History__r = capMan__Security_Price_History__r;
        this.capMan__Security_Type__c = capMan__Security_Type__c;
        this.capMan__SharePriceDate__c = capMan__SharePriceDate__c;
        this.capMan__Share_Authorizations__r = capMan__Share_Authorizations__r;
        this.capMan__Share_Price2__c = capMan__Share_Price2__c;
        this.capMan__Share_Price_Current2__c = capMan__Share_Price_Current2__c;
        this.capMan__Share_Price_Current__c = capMan__Share_Price_Current__c;
        this.capMan__Share_Price_Previous_Current2__c = capMan__Share_Price_Previous_Current2__c;
        this.capMan__Share_Price__c = capMan__Share_Price__c;
        this.capMan__SharesIssued__c = capMan__SharesIssued__c;
        this.capMan__Shares__c = capMan__Shares__c;
        this.capMan__Sort_Param1__c = capMan__Sort_Param1__c;
        this.capMan__TotalRaised__c = capMan__TotalRaised__c;
        this.capMan__Transactions__r = capMan__Transactions__r;
        this.capMan__Underlying_Security__c = capMan__Underlying_Security__c;
        this.capMan__Underlying_Security__r = capMan__Underlying_Security__r;
        this.capMan__Underlying_Shares_Outstanding__c = capMan__Underlying_Shares_Outstanding__c;
        this.capMan__VotingRatio__c = capMan__VotingRatio__c;
        this.capMan__Voting_Notes__c = capMan__Voting_Notes__c;
        this.capMan__Warrant_Schedule1__r = capMan__Warrant_Schedule1__r;
        this.capMan__Warrant_Schedule__r = capMan__Warrant_Schedule__r;
        this.capMan__WarrantsAuthorized__c = capMan__WarrantsAuthorized__c;
        this.capMan__WarrantsCancelled__c = capMan__WarrantsCancelled__c;
        this.capMan__WarrantsExercised__c = capMan__WarrantsExercised__c;
        this.capMan__WarrantsIssued__c = capMan__WarrantsIssued__c;
        this.capMan__WarrantsOutstanding__c = capMan__WarrantsOutstanding__c;
        this.capMan__WeightedAverageOptions__c = capMan__WeightedAverageOptions__c;
        this.capMan__payout_asconvertedoptions__c = capMan__payout_asconvertedoptions__c;
        this.capMan__payout_asconvertedshares__c = capMan__payout_asconvertedshares__c;
        this.capMan__payout_asconvertedwarrants__c = capMan__payout_asconvertedwarrants__c;
        this.capMan__payout_debt_outstanding__c = capMan__payout_debt_outstanding__c;
        this.capMan__payout_debtissued__c = capMan__payout_debtissued__c;
        this.capMan__payout_options_outstanding__c = capMan__payout_options_outstanding__c;
        this.capMan__payout_optionsissued__c = capMan__payout_optionsissued__c;
        this.capMan__payout_sharesissued__c = capMan__payout_sharesissued__c;
        this.capMan__payout_transactionExisted__c = capMan__payout_transactionExisted__c;
        this.capMan__payout_warrantsissued__c = capMan__payout_warrantsissued__c;
        this.capMan__payout_warrantsoutstanding__c = capMan__payout_warrantsoutstanding__c;
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
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this CapMan__Security__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__Security__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__Security__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Security__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Account_Address__c value for this CapMan__Security__c.
     * 
     * @return capMan__Account_Address__c
     */
    public java.lang.String getCapMan__Account_Address__c() {
        return capMan__Account_Address__c;
    }


    /**
     * Sets the capMan__Account_Address__c value for this CapMan__Security__c.
     * 
     * @param capMan__Account_Address__c
     */
    public void setCapMan__Account_Address__c(java.lang.String capMan__Account_Address__c) {
        this.capMan__Account_Address__c = capMan__Account_Address__c;
    }


    /**
     * Gets the capMan__Accrued_Interest__c value for this CapMan__Security__c.
     * 
     * @return capMan__Accrued_Interest__c
     */
    public java.lang.Double getCapMan__Accrued_Interest__c() {
        return capMan__Accrued_Interest__c;
    }


    /**
     * Sets the capMan__Accrued_Interest__c value for this CapMan__Security__c.
     * 
     * @param capMan__Accrued_Interest__c
     */
    public void setCapMan__Accrued_Interest__c(java.lang.Double capMan__Accrued_Interest__c) {
        this.capMan__Accrued_Interest__c = capMan__Accrued_Interest__c;
    }


    /**
     * Gets the capMan__AfterTaxInterestPayable__c value for this CapMan__Security__c.
     * 
     * @return capMan__AfterTaxInterestPayable__c
     */
    public java.lang.Double getCapMan__AfterTaxInterestPayable__c() {
        return capMan__AfterTaxInterestPayable__c;
    }


    /**
     * Sets the capMan__AfterTaxInterestPayable__c value for this CapMan__Security__c.
     * 
     * @param capMan__AfterTaxInterestPayable__c
     */
    public void setCapMan__AfterTaxInterestPayable__c(java.lang.Double capMan__AfterTaxInterestPayable__c) {
        this.capMan__AfterTaxInterestPayable__c = capMan__AfterTaxInterestPayable__c;
    }


    /**
     * Gets the capMan__Anti_Dilution__c value for this CapMan__Security__c.
     * 
     * @return capMan__Anti_Dilution__c
     */
    public java.lang.String getCapMan__Anti_Dilution__c() {
        return capMan__Anti_Dilution__c;
    }


    /**
     * Sets the capMan__Anti_Dilution__c value for this CapMan__Security__c.
     * 
     * @param capMan__Anti_Dilution__c
     */
    public void setCapMan__Anti_Dilution__c(java.lang.String capMan__Anti_Dilution__c) {
        this.capMan__Anti_Dilution__c = capMan__Anti_Dilution__c;
    }


    /**
     * Gets the capMan__AsConvertedOptions__c value for this CapMan__Security__c.
     * 
     * @return capMan__AsConvertedOptions__c
     */
    public java.lang.Double getCapMan__AsConvertedOptions__c() {
        return capMan__AsConvertedOptions__c;
    }


    /**
     * Sets the capMan__AsConvertedOptions__c value for this CapMan__Security__c.
     * 
     * @param capMan__AsConvertedOptions__c
     */
    public void setCapMan__AsConvertedOptions__c(java.lang.Double capMan__AsConvertedOptions__c) {
        this.capMan__AsConvertedOptions__c = capMan__AsConvertedOptions__c;
    }


    /**
     * Gets the capMan__AsConvertedShares__c value for this CapMan__Security__c.
     * 
     * @return capMan__AsConvertedShares__c
     */
    public java.lang.Double getCapMan__AsConvertedShares__c() {
        return capMan__AsConvertedShares__c;
    }


    /**
     * Sets the capMan__AsConvertedShares__c value for this CapMan__Security__c.
     * 
     * @param capMan__AsConvertedShares__c
     */
    public void setCapMan__AsConvertedShares__c(java.lang.Double capMan__AsConvertedShares__c) {
        this.capMan__AsConvertedShares__c = capMan__AsConvertedShares__c;
    }


    /**
     * Gets the capMan__AsConvertedWarrants__c value for this CapMan__Security__c.
     * 
     * @return capMan__AsConvertedWarrants__c
     */
    public java.lang.Double getCapMan__AsConvertedWarrants__c() {
        return capMan__AsConvertedWarrants__c;
    }


    /**
     * Sets the capMan__AsConvertedWarrants__c value for this CapMan__Security__c.
     * 
     * @param capMan__AsConvertedWarrants__c
     */
    public void setCapMan__AsConvertedWarrants__c(java.lang.Double capMan__AsConvertedWarrants__c) {
        this.capMan__AsConvertedWarrants__c = capMan__AsConvertedWarrants__c;
    }


    /**
     * Gets the capMan__As_Converted_Debt__c value for this CapMan__Security__c.
     * 
     * @return capMan__As_Converted_Debt__c
     */
    public java.lang.Double getCapMan__As_Converted_Debt__c() {
        return capMan__As_Converted_Debt__c;
    }


    /**
     * Sets the capMan__As_Converted_Debt__c value for this CapMan__Security__c.
     * 
     * @param capMan__As_Converted_Debt__c
     */
    public void setCapMan__As_Converted_Debt__c(java.lang.Double capMan__As_Converted_Debt__c) {
        this.capMan__As_Converted_Debt__c = capMan__As_Converted_Debt__c;
    }


    /**
     * Gets the capMan__Asset_Class_Level__c value for this CapMan__Security__c.
     * 
     * @return capMan__Asset_Class_Level__c
     */
    public java.lang.String getCapMan__Asset_Class_Level__c() {
        return capMan__Asset_Class_Level__c;
    }


    /**
     * Sets the capMan__Asset_Class_Level__c value for this CapMan__Security__c.
     * 
     * @param capMan__Asset_Class_Level__c
     */
    public void setCapMan__Asset_Class_Level__c(java.lang.String capMan__Asset_Class_Level__c) {
        this.capMan__Asset_Class_Level__c = capMan__Asset_Class_Level__c;
    }


    /**
     * Gets the capMan__Asset_Class__c value for this CapMan__Security__c.
     * 
     * @return capMan__Asset_Class__c
     */
    public java.lang.String getCapMan__Asset_Class__c() {
        return capMan__Asset_Class__c;
    }


    /**
     * Sets the capMan__Asset_Class__c value for this CapMan__Security__c.
     * 
     * @param capMan__Asset_Class__c
     */
    public void setCapMan__Asset_Class__c(java.lang.String capMan__Asset_Class__c) {
        this.capMan__Asset_Class__c = capMan__Asset_Class__c;
    }


    /**
     * Gets the capMan__Authorization_Date__c value for this CapMan__Security__c.
     * 
     * @return capMan__Authorization_Date__c
     */
    public java.util.Date getCapMan__Authorization_Date__c() {
        return capMan__Authorization_Date__c;
    }


    /**
     * Sets the capMan__Authorization_Date__c value for this CapMan__Security__c.
     * 
     * @param capMan__Authorization_Date__c
     */
    public void setCapMan__Authorization_Date__c(java.util.Date capMan__Authorization_Date__c) {
        this.capMan__Authorization_Date__c = capMan__Authorization_Date__c;
    }


    /**
     * Gets the capMan__AuthorizedSecurities__c value for this CapMan__Security__c.
     * 
     * @return capMan__AuthorizedSecurities__c
     */
    public java.lang.Double getCapMan__AuthorizedSecurities__c() {
        return capMan__AuthorizedSecurities__c;
    }


    /**
     * Sets the capMan__AuthorizedSecurities__c value for this CapMan__Security__c.
     * 
     * @param capMan__AuthorizedSecurities__c
     */
    public void setCapMan__AuthorizedSecurities__c(java.lang.Double capMan__AuthorizedSecurities__c) {
        this.capMan__AuthorizedSecurities__c = capMan__AuthorizedSecurities__c;
    }


    /**
     * Gets the capMan__Capitalizations__r value for this CapMan__Security__c.
     * 
     * @return capMan__Capitalizations__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Capitalizations__r() {
        return capMan__Capitalizations__r;
    }


    /**
     * Sets the capMan__Capitalizations__r value for this CapMan__Security__c.
     * 
     * @param capMan__Capitalizations__r
     */
    public void setCapMan__Capitalizations__r(com.sforce.soap.enterprise.QueryResult capMan__Capitalizations__r) {
        this.capMan__Capitalizations__r = capMan__Capitalizations__r;
    }


    /**
     * Gets the capMan__Class_Pct_Ownership__c value for this CapMan__Security__c.
     * 
     * @return capMan__Class_Pct_Ownership__c
     */
    public java.lang.Double getCapMan__Class_Pct_Ownership__c() {
        return capMan__Class_Pct_Ownership__c;
    }


    /**
     * Sets the capMan__Class_Pct_Ownership__c value for this CapMan__Security__c.
     * 
     * @param capMan__Class_Pct_Ownership__c
     */
    public void setCapMan__Class_Pct_Ownership__c(java.lang.Double capMan__Class_Pct_Ownership__c) {
        this.capMan__Class_Pct_Ownership__c = capMan__Class_Pct_Ownership__c;
    }


    /**
     * Gets the capMan__Class_Percentage__c value for this CapMan__Security__c.
     * 
     * @return capMan__Class_Percentage__c
     */
    public java.lang.Double getCapMan__Class_Percentage__c() {
        return capMan__Class_Percentage__c;
    }


    /**
     * Sets the capMan__Class_Percentage__c value for this CapMan__Security__c.
     * 
     * @param capMan__Class_Percentage__c
     */
    public void setCapMan__Class_Percentage__c(java.lang.Double capMan__Class_Percentage__c) {
        this.capMan__Class_Percentage__c = capMan__Class_Percentage__c;
    }


    /**
     * Gets the capMan__CoSaleAgreement__c value for this CapMan__Security__c.
     * 
     * @return capMan__CoSaleAgreement__c
     */
    public java.lang.Boolean getCapMan__CoSaleAgreement__c() {
        return capMan__CoSaleAgreement__c;
    }


    /**
     * Sets the capMan__CoSaleAgreement__c value for this CapMan__Security__c.
     * 
     * @param capMan__CoSaleAgreement__c
     */
    public void setCapMan__CoSaleAgreement__c(java.lang.Boolean capMan__CoSaleAgreement__c) {
        this.capMan__CoSaleAgreement__c = capMan__CoSaleAgreement__c;
    }


    /**
     * Gets the capMan__Comment__c value for this CapMan__Security__c.
     * 
     * @return capMan__Comment__c
     */
    public java.lang.String getCapMan__Comment__c() {
        return capMan__Comment__c;
    }


    /**
     * Sets the capMan__Comment__c value for this CapMan__Security__c.
     * 
     * @param capMan__Comment__c
     */
    public void setCapMan__Comment__c(java.lang.String capMan__Comment__c) {
        this.capMan__Comment__c = capMan__Comment__c;
    }


    /**
     * Gets the capMan__ConversionPrice2__c value for this CapMan__Security__c.
     * 
     * @return capMan__ConversionPrice2__c
     */
    public java.lang.Double getCapMan__ConversionPrice2__c() {
        return capMan__ConversionPrice2__c;
    }


    /**
     * Sets the capMan__ConversionPrice2__c value for this CapMan__Security__c.
     * 
     * @param capMan__ConversionPrice2__c
     */
    public void setCapMan__ConversionPrice2__c(java.lang.Double capMan__ConversionPrice2__c) {
        this.capMan__ConversionPrice2__c = capMan__ConversionPrice2__c;
    }


    /**
     * Gets the capMan__ConversionPrice__c value for this CapMan__Security__c.
     * 
     * @return capMan__ConversionPrice__c
     */
    public java.lang.Double getCapMan__ConversionPrice__c() {
        return capMan__ConversionPrice__c;
    }


    /**
     * Sets the capMan__ConversionPrice__c value for this CapMan__Security__c.
     * 
     * @param capMan__ConversionPrice__c
     */
    public void setCapMan__ConversionPrice__c(java.lang.Double capMan__ConversionPrice__c) {
        this.capMan__ConversionPrice__c = capMan__ConversionPrice__c;
    }


    /**
     * Gets the capMan__ConversionRatioInput2__c value for this CapMan__Security__c.
     * 
     * @return capMan__ConversionRatioInput2__c
     */
    public java.lang.Double getCapMan__ConversionRatioInput2__c() {
        return capMan__ConversionRatioInput2__c;
    }


    /**
     * Sets the capMan__ConversionRatioInput2__c value for this CapMan__Security__c.
     * 
     * @param capMan__ConversionRatioInput2__c
     */
    public void setCapMan__ConversionRatioInput2__c(java.lang.Double capMan__ConversionRatioInput2__c) {
        this.capMan__ConversionRatioInput2__c = capMan__ConversionRatioInput2__c;
    }


    /**
     * Gets the capMan__ConversionRatioInput__c value for this CapMan__Security__c.
     * 
     * @return capMan__ConversionRatioInput__c
     */
    public java.lang.Double getCapMan__ConversionRatioInput__c() {
        return capMan__ConversionRatioInput__c;
    }


    /**
     * Sets the capMan__ConversionRatioInput__c value for this CapMan__Security__c.
     * 
     * @param capMan__ConversionRatioInput__c
     */
    public void setCapMan__ConversionRatioInput__c(java.lang.Double capMan__ConversionRatioInput__c) {
        this.capMan__ConversionRatioInput__c = capMan__ConversionRatioInput__c;
    }


    /**
     * Gets the capMan__ConversionThreshold__c value for this CapMan__Security__c.
     * 
     * @return capMan__ConversionThreshold__c
     */
    public java.lang.Double getCapMan__ConversionThreshold__c() {
        return capMan__ConversionThreshold__c;
    }


    /**
     * Sets the capMan__ConversionThreshold__c value for this CapMan__Security__c.
     * 
     * @param capMan__ConversionThreshold__c
     */
    public void setCapMan__ConversionThreshold__c(java.lang.Double capMan__ConversionThreshold__c) {
        this.capMan__ConversionThreshold__c = capMan__ConversionThreshold__c;
    }


    /**
     * Gets the capMan__Conversion_Amount_Threshold__c value for this CapMan__Security__c.
     * 
     * @return capMan__Conversion_Amount_Threshold__c
     */
    public java.lang.Double getCapMan__Conversion_Amount_Threshold__c() {
        return capMan__Conversion_Amount_Threshold__c;
    }


    /**
     * Sets the capMan__Conversion_Amount_Threshold__c value for this CapMan__Security__c.
     * 
     * @param capMan__Conversion_Amount_Threshold__c
     */
    public void setCapMan__Conversion_Amount_Threshold__c(java.lang.Double capMan__Conversion_Amount_Threshold__c) {
        this.capMan__Conversion_Amount_Threshold__c = capMan__Conversion_Amount_Threshold__c;
    }


    /**
     * Gets the capMan__Conversion_Ratio__c value for this CapMan__Security__c.
     * 
     * @return capMan__Conversion_Ratio__c
     */
    public java.lang.Double getCapMan__Conversion_Ratio__c() {
        return capMan__Conversion_Ratio__c;
    }


    /**
     * Sets the capMan__Conversion_Ratio__c value for this CapMan__Security__c.
     * 
     * @param capMan__Conversion_Ratio__c
     */
    public void setCapMan__Conversion_Ratio__c(java.lang.Double capMan__Conversion_Ratio__c) {
        this.capMan__Conversion_Ratio__c = capMan__Conversion_Ratio__c;
    }


    /**
     * Gets the capMan__ConvertibleDebt_Securities1__r value for this CapMan__Security__c.
     * 
     * @return capMan__ConvertibleDebt_Securities1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__ConvertibleDebt_Securities1__r() {
        return capMan__ConvertibleDebt_Securities1__r;
    }


    /**
     * Sets the capMan__ConvertibleDebt_Securities1__r value for this CapMan__Security__c.
     * 
     * @param capMan__ConvertibleDebt_Securities1__r
     */
    public void setCapMan__ConvertibleDebt_Securities1__r(com.sforce.soap.enterprise.QueryResult capMan__ConvertibleDebt_Securities1__r) {
        this.capMan__ConvertibleDebt_Securities1__r = capMan__ConvertibleDebt_Securities1__r;
    }


    /**
     * Gets the capMan__ConvertibleDebt_Securities__r value for this CapMan__Security__c.
     * 
     * @return capMan__ConvertibleDebt_Securities__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__ConvertibleDebt_Securities__r() {
        return capMan__ConvertibleDebt_Securities__r;
    }


    /**
     * Sets the capMan__ConvertibleDebt_Securities__r value for this CapMan__Security__c.
     * 
     * @param capMan__ConvertibleDebt_Securities__r
     */
    public void setCapMan__ConvertibleDebt_Securities__r(com.sforce.soap.enterprise.QueryResult capMan__ConvertibleDebt_Securities__r) {
        this.capMan__ConvertibleDebt_Securities__r = capMan__ConvertibleDebt_Securities__r;
    }


    /**
     * Gets the capMan__ConvertibleUponCertainEvents__c value for this CapMan__Security__c.
     * 
     * @return capMan__ConvertibleUponCertainEvents__c
     */
    public java.lang.Boolean getCapMan__ConvertibleUponCertainEvents__c() {
        return capMan__ConvertibleUponCertainEvents__c;
    }


    /**
     * Sets the capMan__ConvertibleUponCertainEvents__c value for this CapMan__Security__c.
     * 
     * @param capMan__ConvertibleUponCertainEvents__c
     */
    public void setCapMan__ConvertibleUponCertainEvents__c(java.lang.Boolean capMan__ConvertibleUponCertainEvents__c) {
        this.capMan__ConvertibleUponCertainEvents__c = capMan__ConvertibleUponCertainEvents__c;
    }


    /**
     * Gets the capMan__ConvertibleUponMajorityElection__c value for this CapMan__Security__c.
     * 
     * @return capMan__ConvertibleUponMajorityElection__c
     */
    public java.lang.Boolean getCapMan__ConvertibleUponMajorityElection__c() {
        return capMan__ConvertibleUponMajorityElection__c;
    }


    /**
     * Sets the capMan__ConvertibleUponMajorityElection__c value for this CapMan__Security__c.
     * 
     * @param capMan__ConvertibleUponMajorityElection__c
     */
    public void setCapMan__ConvertibleUponMajorityElection__c(java.lang.Boolean capMan__ConvertibleUponMajorityElection__c) {
        this.capMan__ConvertibleUponMajorityElection__c = capMan__ConvertibleUponMajorityElection__c;
    }


    /**
     * Gets the capMan__Converting_Amount__c value for this CapMan__Security__c.
     * 
     * @return capMan__Converting_Amount__c
     */
    public java.lang.Double getCapMan__Converting_Amount__c() {
        return capMan__Converting_Amount__c;
    }


    /**
     * Sets the capMan__Converting_Amount__c value for this CapMan__Security__c.
     * 
     * @param capMan__Converting_Amount__c
     */
    public void setCapMan__Converting_Amount__c(java.lang.Double capMan__Converting_Amount__c) {
        this.capMan__Converting_Amount__c = capMan__Converting_Amount__c;
    }


    /**
     * Gets the capMan__Converting_Date__c value for this CapMan__Security__c.
     * 
     * @return capMan__Converting_Date__c
     */
    public java.util.Date getCapMan__Converting_Date__c() {
        return capMan__Converting_Date__c;
    }


    /**
     * Sets the capMan__Converting_Date__c value for this CapMan__Security__c.
     * 
     * @param capMan__Converting_Date__c
     */
    public void setCapMan__Converting_Date__c(java.util.Date capMan__Converting_Date__c) {
        this.capMan__Converting_Date__c = capMan__Converting_Date__c;
    }


    /**
     * Gets the capMan__Cumulative_Dividends_Per_Share__c value for this CapMan__Security__c.
     * 
     * @return capMan__Cumulative_Dividends_Per_Share__c
     */
    public java.lang.Double getCapMan__Cumulative_Dividends_Per_Share__c() {
        return capMan__Cumulative_Dividends_Per_Share__c;
    }


    /**
     * Sets the capMan__Cumulative_Dividends_Per_Share__c value for this CapMan__Security__c.
     * 
     * @param capMan__Cumulative_Dividends_Per_Share__c
     */
    public void setCapMan__Cumulative_Dividends_Per_Share__c(java.lang.Double capMan__Cumulative_Dividends_Per_Share__c) {
        this.capMan__Cumulative_Dividends_Per_Share__c = capMan__Cumulative_Dividends_Per_Share__c;
    }


    /**
     * Gets the capMan__Date__c value for this CapMan__Security__c.
     * 
     * @return capMan__Date__c
     */
    public java.util.Date getCapMan__Date__c() {
        return capMan__Date__c;
    }


    /**
     * Sets the capMan__Date__c value for this CapMan__Security__c.
     * 
     * @param capMan__Date__c
     */
    public void setCapMan__Date__c(java.util.Date capMan__Date__c) {
        this.capMan__Date__c = capMan__Date__c;
    }


    /**
     * Gets the capMan__DebtAuthorized__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtAuthorized__c
     */
    public java.lang.Double getCapMan__DebtAuthorized__c() {
        return capMan__DebtAuthorized__c;
    }


    /**
     * Sets the capMan__DebtAuthorized__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtAuthorized__c
     */
    public void setCapMan__DebtAuthorized__c(java.lang.Double capMan__DebtAuthorized__c) {
        this.capMan__DebtAuthorized__c = capMan__DebtAuthorized__c;
    }


    /**
     * Gets the capMan__DebtConverted__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtConverted__c
     */
    public java.lang.Double getCapMan__DebtConverted__c() {
        return capMan__DebtConverted__c;
    }


    /**
     * Sets the capMan__DebtConverted__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtConverted__c
     */
    public void setCapMan__DebtConverted__c(java.lang.Double capMan__DebtConverted__c) {
        this.capMan__DebtConverted__c = capMan__DebtConverted__c;
    }


    /**
     * Gets the capMan__DebtIssued__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtIssued__c
     */
    public java.lang.Double getCapMan__DebtIssued__c() {
        return capMan__DebtIssued__c;
    }


    /**
     * Sets the capMan__DebtIssued__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtIssued__c
     */
    public void setCapMan__DebtIssued__c(java.lang.Double capMan__DebtIssued__c) {
        this.capMan__DebtIssued__c = capMan__DebtIssued__c;
    }


    /**
     * Gets the capMan__DebtParValue__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtParValue__c
     */
    public java.lang.Double getCapMan__DebtParValue__c() {
        return capMan__DebtParValue__c;
    }


    /**
     * Sets the capMan__DebtParValue__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtParValue__c
     */
    public void setCapMan__DebtParValue__c(java.lang.Double capMan__DebtParValue__c) {
        this.capMan__DebtParValue__c = capMan__DebtParValue__c;
    }


    /**
     * Gets the capMan__DebtRatio__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtRatio__c
     */
    public java.lang.Double getCapMan__DebtRatio__c() {
        return capMan__DebtRatio__c;
    }


    /**
     * Sets the capMan__DebtRatio__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtRatio__c
     */
    public void setCapMan__DebtRatio__c(java.lang.Double capMan__DebtRatio__c) {
        this.capMan__DebtRatio__c = capMan__DebtRatio__c;
    }


    /**
     * Gets the capMan__DebtRedeemed__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtRedeemed__c
     */
    public java.lang.Double getCapMan__DebtRedeemed__c() {
        return capMan__DebtRedeemed__c;
    }


    /**
     * Sets the capMan__DebtRedeemed__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtRedeemed__c
     */
    public void setCapMan__DebtRedeemed__c(java.lang.Double capMan__DebtRedeemed__c) {
        this.capMan__DebtRedeemed__c = capMan__DebtRedeemed__c;
    }


    /**
     * Gets the capMan__DebtServiceCoverageRatio__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtServiceCoverageRatio__c
     */
    public java.lang.Double getCapMan__DebtServiceCoverageRatio__c() {
        return capMan__DebtServiceCoverageRatio__c;
    }


    /**
     * Sets the capMan__DebtServiceCoverageRatio__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtServiceCoverageRatio__c
     */
    public void setCapMan__DebtServiceCoverageRatio__c(java.lang.Double capMan__DebtServiceCoverageRatio__c) {
        this.capMan__DebtServiceCoverageRatio__c = capMan__DebtServiceCoverageRatio__c;
    }


    /**
     * Gets the capMan__DebtToEquityRatio__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtToEquityRatio__c
     */
    public java.lang.Double getCapMan__DebtToEquityRatio__c() {
        return capMan__DebtToEquityRatio__c;
    }


    /**
     * Sets the capMan__DebtToEquityRatio__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtToEquityRatio__c
     */
    public void setCapMan__DebtToEquityRatio__c(java.lang.Double capMan__DebtToEquityRatio__c) {
        this.capMan__DebtToEquityRatio__c = capMan__DebtToEquityRatio__c;
    }


    /**
     * Gets the capMan__DebtType__c value for this CapMan__Security__c.
     * 
     * @return capMan__DebtType__c
     */
    public java.lang.String getCapMan__DebtType__c() {
        return capMan__DebtType__c;
    }


    /**
     * Sets the capMan__DebtType__c value for this CapMan__Security__c.
     * 
     * @param capMan__DebtType__c
     */
    public void setCapMan__DebtType__c(java.lang.String capMan__DebtType__c) {
        this.capMan__DebtType__c = capMan__DebtType__c;
    }


    /**
     * Gets the capMan__Debt_Outstanding__c value for this CapMan__Security__c.
     * 
     * @return capMan__Debt_Outstanding__c
     */
    public java.lang.Double getCapMan__Debt_Outstanding__c() {
        return capMan__Debt_Outstanding__c;
    }


    /**
     * Sets the capMan__Debt_Outstanding__c value for this CapMan__Security__c.
     * 
     * @param capMan__Debt_Outstanding__c
     */
    public void setCapMan__Debt_Outstanding__c(java.lang.Double capMan__Debt_Outstanding__c) {
        this.capMan__Debt_Outstanding__c = capMan__Debt_Outstanding__c;
    }


    /**
     * Gets the capMan__Declare_Dividend__c value for this CapMan__Security__c.
     * 
     * @return capMan__Declare_Dividend__c
     */
    public java.lang.Boolean getCapMan__Declare_Dividend__c() {
        return capMan__Declare_Dividend__c;
    }


    /**
     * Sets the capMan__Declare_Dividend__c value for this CapMan__Security__c.
     * 
     * @param capMan__Declare_Dividend__c
     */
    public void setCapMan__Declare_Dividend__c(java.lang.Boolean capMan__Declare_Dividend__c) {
        this.capMan__Declare_Dividend__c = capMan__Declare_Dividend__c;
    }


    /**
     * Gets the capMan__Demand_Registration_Percent__c value for this CapMan__Security__c.
     * 
     * @return capMan__Demand_Registration_Percent__c
     */
    public java.lang.Double getCapMan__Demand_Registration_Percent__c() {
        return capMan__Demand_Registration_Percent__c;
    }


    /**
     * Sets the capMan__Demand_Registration_Percent__c value for this CapMan__Security__c.
     * 
     * @param capMan__Demand_Registration_Percent__c
     */
    public void setCapMan__Demand_Registration_Percent__c(java.lang.Double capMan__Demand_Registration_Percent__c) {
        this.capMan__Demand_Registration_Percent__c = capMan__Demand_Registration_Percent__c;
    }


    /**
     * Gets the capMan__Demand_Registration_Threshold__c value for this CapMan__Security__c.
     * 
     * @return capMan__Demand_Registration_Threshold__c
     */
    public java.lang.Double getCapMan__Demand_Registration_Threshold__c() {
        return capMan__Demand_Registration_Threshold__c;
    }


    /**
     * Sets the capMan__Demand_Registration_Threshold__c value for this CapMan__Security__c.
     * 
     * @param capMan__Demand_Registration_Threshold__c
     */
    public void setCapMan__Demand_Registration_Threshold__c(java.lang.Double capMan__Demand_Registration_Threshold__c) {
        this.capMan__Demand_Registration_Threshold__c = capMan__Demand_Registration_Threshold__c;
    }


    /**
     * Gets the capMan__Dividend_Termination_Date__c value for this CapMan__Security__c.
     * 
     * @return capMan__Dividend_Termination_Date__c
     */
    public java.util.Date getCapMan__Dividend_Termination_Date__c() {
        return capMan__Dividend_Termination_Date__c;
    }


    /**
     * Sets the capMan__Dividend_Termination_Date__c value for this CapMan__Security__c.
     * 
     * @param capMan__Dividend_Termination_Date__c
     */
    public void setCapMan__Dividend_Termination_Date__c(java.util.Date capMan__Dividend_Termination_Date__c) {
        this.capMan__Dividend_Termination_Date__c = capMan__Dividend_Termination_Date__c;
    }


    /**
     * Gets the capMan__Dividend_Type__c value for this CapMan__Security__c.
     * 
     * @return capMan__Dividend_Type__c
     */
    public java.lang.String getCapMan__Dividend_Type__c() {
        return capMan__Dividend_Type__c;
    }


    /**
     * Sets the capMan__Dividend_Type__c value for this CapMan__Security__c.
     * 
     * @param capMan__Dividend_Type__c
     */
    public void setCapMan__Dividend_Type__c(java.lang.String capMan__Dividend_Type__c) {
        this.capMan__Dividend_Type__c = capMan__Dividend_Type__c;
    }


    /**
     * Gets the capMan__EarlyExercise__c value for this CapMan__Security__c.
     * 
     * @return capMan__EarlyExercise__c
     */
    public java.lang.Boolean getCapMan__EarlyExercise__c() {
        return capMan__EarlyExercise__c;
    }


    /**
     * Sets the capMan__EarlyExercise__c value for this CapMan__Security__c.
     * 
     * @param capMan__EarlyExercise__c
     */
    public void setCapMan__EarlyExercise__c(java.lang.Boolean capMan__EarlyExercise__c) {
        this.capMan__EarlyExercise__c = capMan__EarlyExercise__c;
    }


    /**
     * Gets the capMan__EquityType__c value for this CapMan__Security__c.
     * 
     * @return capMan__EquityType__c
     */
    public java.lang.String getCapMan__EquityType__c() {
        return capMan__EquityType__c;
    }


    /**
     * Sets the capMan__EquityType__c value for this CapMan__Security__c.
     * 
     * @param capMan__EquityType__c
     */
    public void setCapMan__EquityType__c(java.lang.String capMan__EquityType__c) {
        this.capMan__EquityType__c = capMan__EquityType__c;
    }


    /**
     * Gets the capMan__Exercise_Price2__c value for this CapMan__Security__c.
     * 
     * @return capMan__Exercise_Price2__c
     */
    public java.lang.Double getCapMan__Exercise_Price2__c() {
        return capMan__Exercise_Price2__c;
    }


    /**
     * Sets the capMan__Exercise_Price2__c value for this CapMan__Security__c.
     * 
     * @param capMan__Exercise_Price2__c
     */
    public void setCapMan__Exercise_Price2__c(java.lang.Double capMan__Exercise_Price2__c) {
        this.capMan__Exercise_Price2__c = capMan__Exercise_Price2__c;
    }


    /**
     * Gets the capMan__Exercise_Price__c value for this CapMan__Security__c.
     * 
     * @return capMan__Exercise_Price__c
     */
    public java.lang.Double getCapMan__Exercise_Price__c() {
        return capMan__Exercise_Price__c;
    }


    /**
     * Sets the capMan__Exercise_Price__c value for this CapMan__Security__c.
     * 
     * @param capMan__Exercise_Price__c
     */
    public void setCapMan__Exercise_Price__c(java.lang.Double capMan__Exercise_Price__c) {
        this.capMan__Exercise_Price__c = capMan__Exercise_Price__c;
    }


    /**
     * Gets the capMan__Expiration_Date__c value for this CapMan__Security__c.
     * 
     * @return capMan__Expiration_Date__c
     */
    public java.util.Date getCapMan__Expiration_Date__c() {
        return capMan__Expiration_Date__c;
    }


    /**
     * Sets the capMan__Expiration_Date__c value for this CapMan__Security__c.
     * 
     * @param capMan__Expiration_Date__c
     */
    public void setCapMan__Expiration_Date__c(java.util.Date capMan__Expiration_Date__c) {
        this.capMan__Expiration_Date__c = capMan__Expiration_Date__c;
    }


    /**
     * Gets the capMan__InterestCoverageRatio__c value for this CapMan__Security__c.
     * 
     * @return capMan__InterestCoverageRatio__c
     */
    public java.lang.Double getCapMan__InterestCoverageRatio__c() {
        return capMan__InterestCoverageRatio__c;
    }


    /**
     * Sets the capMan__InterestCoverageRatio__c value for this CapMan__Security__c.
     * 
     * @param capMan__InterestCoverageRatio__c
     */
    public void setCapMan__InterestCoverageRatio__c(java.lang.Double capMan__InterestCoverageRatio__c) {
        this.capMan__InterestCoverageRatio__c = capMan__InterestCoverageRatio__c;
    }


    /**
     * Gets the capMan__InterestRate__c value for this CapMan__Security__c.
     * 
     * @return capMan__InterestRate__c
     */
    public java.lang.Double getCapMan__InterestRate__c() {
        return capMan__InterestRate__c;
    }


    /**
     * Sets the capMan__InterestRate__c value for this CapMan__Security__c.
     * 
     * @param capMan__InterestRate__c
     */
    public void setCapMan__InterestRate__c(java.lang.Double capMan__InterestRate__c) {
        this.capMan__InterestRate__c = capMan__InterestRate__c;
    }


    /**
     * Gets the capMan__Interest_Payment_Frequency__c value for this CapMan__Security__c.
     * 
     * @return capMan__Interest_Payment_Frequency__c
     */
    public java.lang.String getCapMan__Interest_Payment_Frequency__c() {
        return capMan__Interest_Payment_Frequency__c;
    }


    /**
     * Sets the capMan__Interest_Payment_Frequency__c value for this CapMan__Security__c.
     * 
     * @param capMan__Interest_Payment_Frequency__c
     */
    public void setCapMan__Interest_Payment_Frequency__c(java.lang.String capMan__Interest_Payment_Frequency__c) {
        this.capMan__Interest_Payment_Frequency__c = capMan__Interest_Payment_Frequency__c;
    }


    /**
     * Gets the capMan__IsConverted__c value for this CapMan__Security__c.
     * 
     * @return capMan__IsConverted__c
     */
    public java.lang.Boolean getCapMan__IsConverted__c() {
        return capMan__IsConverted__c;
    }


    /**
     * Sets the capMan__IsConverted__c value for this CapMan__Security__c.
     * 
     * @param capMan__IsConverted__c
     */
    public void setCapMan__IsConverted__c(java.lang.Boolean capMan__IsConverted__c) {
        this.capMan__IsConverted__c = capMan__IsConverted__c;
    }


    /**
     * Gets the capMan__Issuances1__r value for this CapMan__Security__c.
     * 
     * @return capMan__Issuances1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Issuances1__r() {
        return capMan__Issuances1__r;
    }


    /**
     * Sets the capMan__Issuances1__r value for this CapMan__Security__c.
     * 
     * @param capMan__Issuances1__r
     */
    public void setCapMan__Issuances1__r(com.sforce.soap.enterprise.QueryResult capMan__Issuances1__r) {
        this.capMan__Issuances1__r = capMan__Issuances1__r;
    }


    /**
     * Gets the capMan__Issuances__r value for this CapMan__Security__c.
     * 
     * @return capMan__Issuances__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Issuances__r() {
        return capMan__Issuances__r;
    }


    /**
     * Sets the capMan__Issuances__r value for this CapMan__Security__c.
     * 
     * @param capMan__Issuances__r
     */
    public void setCapMan__Issuances__r(com.sforce.soap.enterprise.QueryResult capMan__Issuances__r) {
        this.capMan__Issuances__r = capMan__Issuances__r;
    }


    /**
     * Gets the capMan__Issued__c value for this CapMan__Security__c.
     * 
     * @return capMan__Issued__c
     */
    public java.lang.Boolean getCapMan__Issued__c() {
        return capMan__Issued__c;
    }


    /**
     * Sets the capMan__Issued__c value for this CapMan__Security__c.
     * 
     * @param capMan__Issued__c
     */
    public void setCapMan__Issued__c(java.lang.Boolean capMan__Issued__c) {
        this.capMan__Issued__c = capMan__Issued__c;
    }


    /**
     * Gets the capMan__IssuerLink__c value for this CapMan__Security__c.
     * 
     * @return capMan__IssuerLink__c
     */
    public java.lang.String getCapMan__IssuerLink__c() {
        return capMan__IssuerLink__c;
    }


    /**
     * Sets the capMan__IssuerLink__c value for this CapMan__Security__c.
     * 
     * @param capMan__IssuerLink__c
     */
    public void setCapMan__IssuerLink__c(java.lang.String capMan__IssuerLink__c) {
        this.capMan__IssuerLink__c = capMan__IssuerLink__c;
    }


    /**
     * Gets the capMan__IssuerName__c value for this CapMan__Security__c.
     * 
     * @return capMan__IssuerName__c
     */
    public java.lang.String getCapMan__IssuerName__c() {
        return capMan__IssuerName__c;
    }


    /**
     * Sets the capMan__IssuerName__c value for this CapMan__Security__c.
     * 
     * @param capMan__IssuerName__c
     */
    public void setCapMan__IssuerName__c(java.lang.String capMan__IssuerName__c) {
        this.capMan__IssuerName__c = capMan__IssuerName__c;
    }


    /**
     * Gets the capMan__Issuer__c value for this CapMan__Security__c.
     * 
     * @return capMan__Issuer__c
     */
    public java.lang.String getCapMan__Issuer__c() {
        return capMan__Issuer__c;
    }


    /**
     * Sets the capMan__Issuer__c value for this CapMan__Security__c.
     * 
     * @param capMan__Issuer__c
     */
    public void setCapMan__Issuer__c(java.lang.String capMan__Issuer__c) {
        this.capMan__Issuer__c = capMan__Issuer__c;
    }


    /**
     * Gets the capMan__Issuer__r value for this CapMan__Security__c.
     * 
     * @return capMan__Issuer__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c getCapMan__Issuer__r() {
        return capMan__Issuer__r;
    }


    /**
     * Sets the capMan__Issuer__r value for this CapMan__Security__c.
     * 
     * @param capMan__Issuer__r
     */
    public void setCapMan__Issuer__r(com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r) {
        this.capMan__Issuer__r = capMan__Issuer__r;
    }


    /**
     * Gets the capMan__LiquidationMultiple2__c value for this CapMan__Security__c.
     * 
     * @return capMan__LiquidationMultiple2__c
     */
    public java.lang.Double getCapMan__LiquidationMultiple2__c() {
        return capMan__LiquidationMultiple2__c;
    }


    /**
     * Sets the capMan__LiquidationMultiple2__c value for this CapMan__Security__c.
     * 
     * @param capMan__LiquidationMultiple2__c
     */
    public void setCapMan__LiquidationMultiple2__c(java.lang.Double capMan__LiquidationMultiple2__c) {
        this.capMan__LiquidationMultiple2__c = capMan__LiquidationMultiple2__c;
    }


    /**
     * Gets the capMan__LiquidationMultiple__c value for this CapMan__Security__c.
     * 
     * @return capMan__LiquidationMultiple__c
     */
    public java.lang.Double getCapMan__LiquidationMultiple__c() {
        return capMan__LiquidationMultiple__c;
    }


    /**
     * Sets the capMan__LiquidationMultiple__c value for this CapMan__Security__c.
     * 
     * @param capMan__LiquidationMultiple__c
     */
    public void setCapMan__LiquidationMultiple__c(java.lang.Double capMan__LiquidationMultiple__c) {
        this.capMan__LiquidationMultiple__c = capMan__LiquidationMultiple__c;
    }


    /**
     * Gets the capMan__Liquidation_Include_Derivatives__r value for this CapMan__Security__c.
     * 
     * @return capMan__Liquidation_Include_Derivatives__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Liquidation_Include_Derivatives__r() {
        return capMan__Liquidation_Include_Derivatives__r;
    }


    /**
     * Sets the capMan__Liquidation_Include_Derivatives__r value for this CapMan__Security__c.
     * 
     * @param capMan__Liquidation_Include_Derivatives__r
     */
    public void setCapMan__Liquidation_Include_Derivatives__r(com.sforce.soap.enterprise.QueryResult capMan__Liquidation_Include_Derivatives__r) {
        this.capMan__Liquidation_Include_Derivatives__r = capMan__Liquidation_Include_Derivatives__r;
    }


    /**
     * Gets the capMan__Liquidation_Preference__c value for this CapMan__Security__c.
     * 
     * @return capMan__Liquidation_Preference__c
     */
    public java.lang.Double getCapMan__Liquidation_Preference__c() {
        return capMan__Liquidation_Preference__c;
    }


    /**
     * Sets the capMan__Liquidation_Preference__c value for this CapMan__Security__c.
     * 
     * @param capMan__Liquidation_Preference__c
     */
    public void setCapMan__Liquidation_Preference__c(java.lang.Double capMan__Liquidation_Preference__c) {
        this.capMan__Liquidation_Preference__c = capMan__Liquidation_Preference__c;
    }


    /**
     * Gets the capMan__LongTermDebttoTotalAsset__c value for this CapMan__Security__c.
     * 
     * @return capMan__LongTermDebttoTotalAsset__c
     */
    public java.lang.Double getCapMan__LongTermDebttoTotalAsset__c() {
        return capMan__LongTermDebttoTotalAsset__c;
    }


    /**
     * Sets the capMan__LongTermDebttoTotalAsset__c value for this CapMan__Security__c.
     * 
     * @param capMan__LongTermDebttoTotalAsset__c
     */
    public void setCapMan__LongTermDebttoTotalAsset__c(java.lang.Double capMan__LongTermDebttoTotalAsset__c) {
        this.capMan__LongTermDebttoTotalAsset__c = capMan__LongTermDebttoTotalAsset__c;
    }


    /**
     * Gets the capMan__MandatoryConvertDate__c value for this CapMan__Security__c.
     * 
     * @return capMan__MandatoryConvertDate__c
     */
    public java.util.Date getCapMan__MandatoryConvertDate__c() {
        return capMan__MandatoryConvertDate__c;
    }


    /**
     * Sets the capMan__MandatoryConvertDate__c value for this CapMan__Security__c.
     * 
     * @param capMan__MandatoryConvertDate__c
     */
    public void setCapMan__MandatoryConvertDate__c(java.util.Date capMan__MandatoryConvertDate__c) {
        this.capMan__MandatoryConvertDate__c = capMan__MandatoryConvertDate__c;
    }


    /**
     * Gets the capMan__MarketWeightedPrice2__c value for this CapMan__Security__c.
     * 
     * @return capMan__MarketWeightedPrice2__c
     */
    public java.lang.Double getCapMan__MarketWeightedPrice2__c() {
        return capMan__MarketWeightedPrice2__c;
    }


    /**
     * Sets the capMan__MarketWeightedPrice2__c value for this CapMan__Security__c.
     * 
     * @param capMan__MarketWeightedPrice2__c
     */
    public void setCapMan__MarketWeightedPrice2__c(java.lang.Double capMan__MarketWeightedPrice2__c) {
        this.capMan__MarketWeightedPrice2__c = capMan__MarketWeightedPrice2__c;
    }


    /**
     * Gets the capMan__MarketWeightedPrice__c value for this CapMan__Security__c.
     * 
     * @return capMan__MarketWeightedPrice__c
     */
    public java.lang.Double getCapMan__MarketWeightedPrice__c() {
        return capMan__MarketWeightedPrice__c;
    }


    /**
     * Sets the capMan__MarketWeightedPrice__c value for this CapMan__Security__c.
     * 
     * @param capMan__MarketWeightedPrice__c
     */
    public void setCapMan__MarketWeightedPrice__c(java.lang.Double capMan__MarketWeightedPrice__c) {
        this.capMan__MarketWeightedPrice__c = capMan__MarketWeightedPrice__c;
    }


    /**
     * Gets the capMan__MaturityDate__c value for this CapMan__Security__c.
     * 
     * @return capMan__MaturityDate__c
     */
    public java.util.Date getCapMan__MaturityDate__c() {
        return capMan__MaturityDate__c;
    }


    /**
     * Sets the capMan__MaturityDate__c value for this CapMan__Security__c.
     * 
     * @param capMan__MaturityDate__c
     */
    public void setCapMan__MaturityDate__c(java.util.Date capMan__MaturityDate__c) {
        this.capMan__MaturityDate__c = capMan__MaturityDate__c;
    }


    /**
     * Gets the capMan__Name__c value for this CapMan__Security__c.
     * 
     * @return capMan__Name__c
     */
    public java.lang.String getCapMan__Name__c() {
        return capMan__Name__c;
    }


    /**
     * Sets the capMan__Name__c value for this CapMan__Security__c.
     * 
     * @param capMan__Name__c
     */
    public void setCapMan__Name__c(java.lang.String capMan__Name__c) {
        this.capMan__Name__c = capMan__Name__c;
    }


    /**
     * Gets the capMan__Notes_for_Rights__c value for this CapMan__Security__c.
     * 
     * @return capMan__Notes_for_Rights__c
     */
    public java.lang.String getCapMan__Notes_for_Rights__c() {
        return capMan__Notes_for_Rights__c;
    }


    /**
     * Sets the capMan__Notes_for_Rights__c value for this CapMan__Security__c.
     * 
     * @param capMan__Notes_for_Rights__c
     */
    public void setCapMan__Notes_for_Rights__c(java.lang.String capMan__Notes_for_Rights__c) {
        this.capMan__Notes_for_Rights__c = capMan__Notes_for_Rights__c;
    }


    /**
     * Gets the capMan__NumberOfTransactions__c value for this CapMan__Security__c.
     * 
     * @return capMan__NumberOfTransactions__c
     */
    public java.lang.Double getCapMan__NumberOfTransactions__c() {
        return capMan__NumberOfTransactions__c;
    }


    /**
     * Sets the capMan__NumberOfTransactions__c value for this CapMan__Security__c.
     * 
     * @param capMan__NumberOfTransactions__c
     */
    public void setCapMan__NumberOfTransactions__c(java.lang.Double capMan__NumberOfTransactions__c) {
        this.capMan__NumberOfTransactions__c = capMan__NumberOfTransactions__c;
    }


    /**
     * Gets the capMan__OldAuthorized__c value for this CapMan__Security__c.
     * 
     * @return capMan__OldAuthorized__c
     */
    public java.lang.Double getCapMan__OldAuthorized__c() {
        return capMan__OldAuthorized__c;
    }


    /**
     * Sets the capMan__OldAuthorized__c value for this CapMan__Security__c.
     * 
     * @param capMan__OldAuthorized__c
     */
    public void setCapMan__OldAuthorized__c(java.lang.Double capMan__OldAuthorized__c) {
        this.capMan__OldAuthorized__c = capMan__OldAuthorized__c;
    }


    /**
     * Gets the capMan__OptionsAuthorized__c value for this CapMan__Security__c.
     * 
     * @return capMan__OptionsAuthorized__c
     */
    public java.lang.Double getCapMan__OptionsAuthorized__c() {
        return capMan__OptionsAuthorized__c;
    }


    /**
     * Sets the capMan__OptionsAuthorized__c value for this CapMan__Security__c.
     * 
     * @param capMan__OptionsAuthorized__c
     */
    public void setCapMan__OptionsAuthorized__c(java.lang.Double capMan__OptionsAuthorized__c) {
        this.capMan__OptionsAuthorized__c = capMan__OptionsAuthorized__c;
    }


    /**
     * Gets the capMan__OptionsCancelled__c value for this CapMan__Security__c.
     * 
     * @return capMan__OptionsCancelled__c
     */
    public java.lang.Double getCapMan__OptionsCancelled__c() {
        return capMan__OptionsCancelled__c;
    }


    /**
     * Sets the capMan__OptionsCancelled__c value for this CapMan__Security__c.
     * 
     * @param capMan__OptionsCancelled__c
     */
    public void setCapMan__OptionsCancelled__c(java.lang.Double capMan__OptionsCancelled__c) {
        this.capMan__OptionsCancelled__c = capMan__OptionsCancelled__c;
    }


    /**
     * Gets the capMan__OptionsExercised__c value for this CapMan__Security__c.
     * 
     * @return capMan__OptionsExercised__c
     */
    public java.lang.Double getCapMan__OptionsExercised__c() {
        return capMan__OptionsExercised__c;
    }


    /**
     * Sets the capMan__OptionsExercised__c value for this CapMan__Security__c.
     * 
     * @param capMan__OptionsExercised__c
     */
    public void setCapMan__OptionsExercised__c(java.lang.Double capMan__OptionsExercised__c) {
        this.capMan__OptionsExercised__c = capMan__OptionsExercised__c;
    }


    /**
     * Gets the capMan__OptionsIssued__c value for this CapMan__Security__c.
     * 
     * @return capMan__OptionsIssued__c
     */
    public java.lang.Double getCapMan__OptionsIssued__c() {
        return capMan__OptionsIssued__c;
    }


    /**
     * Sets the capMan__OptionsIssued__c value for this CapMan__Security__c.
     * 
     * @param capMan__OptionsIssued__c
     */
    public void setCapMan__OptionsIssued__c(java.lang.Double capMan__OptionsIssued__c) {
        this.capMan__OptionsIssued__c = capMan__OptionsIssued__c;
    }


    /**
     * Gets the capMan__OptionsRecyclable__c value for this CapMan__Security__c.
     * 
     * @return capMan__OptionsRecyclable__c
     */
    public java.lang.Boolean getCapMan__OptionsRecyclable__c() {
        return capMan__OptionsRecyclable__c;
    }


    /**
     * Sets the capMan__OptionsRecyclable__c value for this CapMan__Security__c.
     * 
     * @param capMan__OptionsRecyclable__c
     */
    public void setCapMan__OptionsRecyclable__c(java.lang.Boolean capMan__OptionsRecyclable__c) {
        this.capMan__OptionsRecyclable__c = capMan__OptionsRecyclable__c;
    }


    /**
     * Gets the capMan__Options_Available_For_Grant__c value for this CapMan__Security__c.
     * 
     * @return capMan__Options_Available_For_Grant__c
     */
    public java.lang.Double getCapMan__Options_Available_For_Grant__c() {
        return capMan__Options_Available_For_Grant__c;
    }


    /**
     * Sets the capMan__Options_Available_For_Grant__c value for this CapMan__Security__c.
     * 
     * @param capMan__Options_Available_For_Grant__c
     */
    public void setCapMan__Options_Available_For_Grant__c(java.lang.Double capMan__Options_Available_For_Grant__c) {
        this.capMan__Options_Available_For_Grant__c = capMan__Options_Available_For_Grant__c;
    }


    /**
     * Gets the capMan__Options_Outstanding__c value for this CapMan__Security__c.
     * 
     * @return capMan__Options_Outstanding__c
     */
    public java.lang.Double getCapMan__Options_Outstanding__c() {
        return capMan__Options_Outstanding__c;
    }


    /**
     * Sets the capMan__Options_Outstanding__c value for this CapMan__Security__c.
     * 
     * @param capMan__Options_Outstanding__c
     */
    public void setCapMan__Options_Outstanding__c(java.lang.Double capMan__Options_Outstanding__c) {
        this.capMan__Options_Outstanding__c = capMan__Options_Outstanding__c;
    }


    /**
     * Gets the capMan__Order_by_security_type__c value for this CapMan__Security__c.
     * 
     * @return capMan__Order_by_security_type__c
     */
    public java.lang.Double getCapMan__Order_by_security_type__c() {
        return capMan__Order_by_security_type__c;
    }


    /**
     * Sets the capMan__Order_by_security_type__c value for this CapMan__Security__c.
     * 
     * @param capMan__Order_by_security_type__c
     */
    public void setCapMan__Order_by_security_type__c(java.lang.Double capMan__Order_by_security_type__c) {
        this.capMan__Order_by_security_type__c = capMan__Order_by_security_type__c;
    }


    /**
     * Gets the capMan__OtherLiquidationAmount__c value for this CapMan__Security__c.
     * 
     * @return capMan__OtherLiquidationAmount__c
     */
    public java.lang.Double getCapMan__OtherLiquidationAmount__c() {
        return capMan__OtherLiquidationAmount__c;
    }


    /**
     * Sets the capMan__OtherLiquidationAmount__c value for this CapMan__Security__c.
     * 
     * @param capMan__OtherLiquidationAmount__c
     */
    public void setCapMan__OtherLiquidationAmount__c(java.lang.Double capMan__OtherLiquidationAmount__c) {
        this.capMan__OtherLiquidationAmount__c = capMan__OtherLiquidationAmount__c;
    }


    /**
     * Gets the capMan__ParValue__c value for this CapMan__Security__c.
     * 
     * @return capMan__ParValue__c
     */
    public java.lang.Double getCapMan__ParValue__c() {
        return capMan__ParValue__c;
    }


    /**
     * Sets the capMan__ParValue__c value for this CapMan__Security__c.
     * 
     * @param capMan__ParValue__c
     */
    public void setCapMan__ParValue__c(java.lang.Double capMan__ParValue__c) {
        this.capMan__ParValue__c = capMan__ParValue__c;
    }


    /**
     * Gets the capMan__Participating_Text_for_Term_Sheet__c value for this CapMan__Security__c.
     * 
     * @return capMan__Participating_Text_for_Term_Sheet__c
     */
    public java.lang.String getCapMan__Participating_Text_for_Term_Sheet__c() {
        return capMan__Participating_Text_for_Term_Sheet__c;
    }


    /**
     * Sets the capMan__Participating_Text_for_Term_Sheet__c value for this CapMan__Security__c.
     * 
     * @param capMan__Participating_Text_for_Term_Sheet__c
     */
    public void setCapMan__Participating_Text_for_Term_Sheet__c(java.lang.String capMan__Participating_Text_for_Term_Sheet__c) {
        this.capMan__Participating_Text_for_Term_Sheet__c = capMan__Participating_Text_for_Term_Sheet__c;
    }


    /**
     * Gets the capMan__Participating__c value for this CapMan__Security__c.
     * 
     * @return capMan__Participating__c
     */
    public java.lang.Boolean getCapMan__Participating__c() {
        return capMan__Participating__c;
    }


    /**
     * Sets the capMan__Participating__c value for this CapMan__Security__c.
     * 
     * @param capMan__Participating__c
     */
    public void setCapMan__Participating__c(java.lang.Boolean capMan__Participating__c) {
        this.capMan__Participating__c = capMan__Participating__c;
    }


    /**
     * Gets the capMan__ParticipationCap__c value for this CapMan__Security__c.
     * 
     * @return capMan__ParticipationCap__c
     */
    public java.lang.Double getCapMan__ParticipationCap__c() {
        return capMan__ParticipationCap__c;
    }


    /**
     * Sets the capMan__ParticipationCap__c value for this CapMan__Security__c.
     * 
     * @param capMan__ParticipationCap__c
     */
    public void setCapMan__ParticipationCap__c(java.lang.Double capMan__ParticipationCap__c) {
        this.capMan__ParticipationCap__c = capMan__ParticipationCap__c;
    }


    /**
     * Gets the capMan__Participation_Cap_New2__c value for this CapMan__Security__c.
     * 
     * @return capMan__Participation_Cap_New2__c
     */
    public java.lang.Double getCapMan__Participation_Cap_New2__c() {
        return capMan__Participation_Cap_New2__c;
    }


    /**
     * Sets the capMan__Participation_Cap_New2__c value for this CapMan__Security__c.
     * 
     * @param capMan__Participation_Cap_New2__c
     */
    public void setCapMan__Participation_Cap_New2__c(java.lang.Double capMan__Participation_Cap_New2__c) {
        this.capMan__Participation_Cap_New2__c = capMan__Participation_Cap_New2__c;
    }


    /**
     * Gets the capMan__Participation_Cap_New__c value for this CapMan__Security__c.
     * 
     * @return capMan__Participation_Cap_New__c
     */
    public java.lang.Double getCapMan__Participation_Cap_New__c() {
        return capMan__Participation_Cap_New__c;
    }


    /**
     * Sets the capMan__Participation_Cap_New__c value for this CapMan__Security__c.
     * 
     * @param capMan__Participation_Cap_New__c
     */
    public void setCapMan__Participation_Cap_New__c(java.lang.Double capMan__Participation_Cap_New__c) {
        this.capMan__Participation_Cap_New__c = capMan__Participation_Cap_New__c;
    }


    /**
     * Gets the capMan__Participation_Type__c value for this CapMan__Security__c.
     * 
     * @return capMan__Participation_Type__c
     */
    public java.lang.String getCapMan__Participation_Type__c() {
        return capMan__Participation_Type__c;
    }


    /**
     * Sets the capMan__Participation_Type__c value for this CapMan__Security__c.
     * 
     * @param capMan__Participation_Type__c
     */
    public void setCapMan__Participation_Type__c(java.lang.String capMan__Participation_Type__c) {
        this.capMan__Participation_Type__c = capMan__Participation_Type__c;
    }


    /**
     * Gets the capMan__Pay_to_Play_Links__r value for this CapMan__Security__c.
     * 
     * @return capMan__Pay_to_Play_Links__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Pay_to_Play_Links__r() {
        return capMan__Pay_to_Play_Links__r;
    }


    /**
     * Sets the capMan__Pay_to_Play_Links__r value for this CapMan__Security__c.
     * 
     * @param capMan__Pay_to_Play_Links__r
     */
    public void setCapMan__Pay_to_Play_Links__r(com.sforce.soap.enterprise.QueryResult capMan__Pay_to_Play_Links__r) {
        this.capMan__Pay_to_Play_Links__r = capMan__Pay_to_Play_Links__r;
    }


    /**
     * Gets the capMan__PayoffRank_Conversion__c value for this CapMan__Security__c.
     * 
     * @return capMan__PayoffRank_Conversion__c
     */
    public java.lang.Double getCapMan__PayoffRank_Conversion__c() {
        return capMan__PayoffRank_Conversion__c;
    }


    /**
     * Sets the capMan__PayoffRank_Conversion__c value for this CapMan__Security__c.
     * 
     * @param capMan__PayoffRank_Conversion__c
     */
    public void setCapMan__PayoffRank_Conversion__c(java.lang.Double capMan__PayoffRank_Conversion__c) {
        this.capMan__PayoffRank_Conversion__c = capMan__PayoffRank_Conversion__c;
    }


    /**
     * Gets the capMan__PayoffRank__c value for this CapMan__Security__c.
     * 
     * @return capMan__PayoffRank__c
     */
    public java.lang.Double getCapMan__PayoffRank__c() {
        return capMan__PayoffRank__c;
    }


    /**
     * Sets the capMan__PayoffRank__c value for this CapMan__Security__c.
     * 
     * @param capMan__PayoffRank__c
     */
    public void setCapMan__PayoffRank__c(java.lang.Double capMan__PayoffRank__c) {
        this.capMan__PayoffRank__c = capMan__PayoffRank__c;
    }


    /**
     * Gets the capMan__PctVotesforNewShares__c value for this CapMan__Security__c.
     * 
     * @return capMan__PctVotesforNewShares__c
     */
    public java.lang.Double getCapMan__PctVotesforNewShares__c() {
        return capMan__PctVotesforNewShares__c;
    }


    /**
     * Sets the capMan__PctVotesforNewShares__c value for this CapMan__Security__c.
     * 
     * @param capMan__PctVotesforNewShares__c
     */
    public void setCapMan__PctVotesforNewShares__c(java.lang.Double capMan__PctVotesforNewShares__c) {
        this.capMan__PctVotesforNewShares__c = capMan__PctVotesforNewShares__c;
    }


    /**
     * Gets the capMan__PctVotestoAmend__c value for this CapMan__Security__c.
     * 
     * @return capMan__PctVotestoAmend__c
     */
    public java.lang.Double getCapMan__PctVotestoAmend__c() {
        return capMan__PctVotestoAmend__c;
    }


    /**
     * Sets the capMan__PctVotestoAmend__c value for this CapMan__Security__c.
     * 
     * @param capMan__PctVotestoAmend__c
     */
    public void setCapMan__PctVotestoAmend__c(java.lang.Double capMan__PctVotestoAmend__c) {
        this.capMan__PctVotestoAmend__c = capMan__PctVotestoAmend__c;
    }


    /**
     * Gets the capMan__Pct_to_change_control__c value for this CapMan__Security__c.
     * 
     * @return capMan__Pct_to_change_control__c
     */
    public java.lang.Double getCapMan__Pct_to_change_control__c() {
        return capMan__Pct_to_change_control__c;
    }


    /**
     * Sets the capMan__Pct_to_change_control__c value for this CapMan__Security__c.
     * 
     * @param capMan__Pct_to_change_control__c
     */
    public void setCapMan__Pct_to_change_control__c(java.lang.Double capMan__Pct_to_change_control__c) {
        this.capMan__Pct_to_change_control__c = capMan__Pct_to_change_control__c;
    }


    /**
     * Gets the capMan__PcttoIssueDebt__c value for this CapMan__Security__c.
     * 
     * @return capMan__PcttoIssueDebt__c
     */
    public java.lang.Double getCapMan__PcttoIssueDebt__c() {
        return capMan__PcttoIssueDebt__c;
    }


    /**
     * Sets the capMan__PcttoIssueDebt__c value for this CapMan__Security__c.
     * 
     * @param capMan__PcttoIssueDebt__c
     */
    public void setCapMan__PcttoIssueDebt__c(java.lang.Double capMan__PcttoIssueDebt__c) {
        this.capMan__PcttoIssueDebt__c = capMan__PcttoIssueDebt__c;
    }


    /**
     * Gets the capMan__Picklist__c value for this CapMan__Security__c.
     * 
     * @return capMan__Picklist__c
     */
    public java.lang.String getCapMan__Picklist__c() {
        return capMan__Picklist__c;
    }


    /**
     * Sets the capMan__Picklist__c value for this CapMan__Security__c.
     * 
     * @param capMan__Picklist__c
     */
    public void setCapMan__Picklist__c(java.lang.String capMan__Picklist__c) {
        this.capMan__Picklist__c = capMan__Picklist__c;
    }


    /**
     * Gets the capMan__PreemptiveRights__c value for this CapMan__Security__c.
     * 
     * @return capMan__PreemptiveRights__c
     */
    public java.lang.Boolean getCapMan__PreemptiveRights__c() {
        return capMan__PreemptiveRights__c;
    }


    /**
     * Sets the capMan__PreemptiveRights__c value for this CapMan__Security__c.
     * 
     * @param capMan__PreemptiveRights__c
     */
    public void setCapMan__PreemptiveRights__c(java.lang.Boolean capMan__PreemptiveRights__c) {
        this.capMan__PreemptiveRights__c = capMan__PreemptiveRights__c;
    }


    /**
     * Gets the capMan__PreferredDividendPct__c value for this CapMan__Security__c.
     * 
     * @return capMan__PreferredDividendPct__c
     */
    public java.lang.Double getCapMan__PreferredDividendPct__c() {
        return capMan__PreferredDividendPct__c;
    }


    /**
     * Sets the capMan__PreferredDividendPct__c value for this CapMan__Security__c.
     * 
     * @param capMan__PreferredDividendPct__c
     */
    public void setCapMan__PreferredDividendPct__c(java.lang.Double capMan__PreferredDividendPct__c) {
        this.capMan__PreferredDividendPct__c = capMan__PreferredDividendPct__c;
    }


    /**
     * Gets the capMan__PreferredDividend__c value for this CapMan__Security__c.
     * 
     * @return capMan__PreferredDividend__c
     */
    public java.lang.Double getCapMan__PreferredDividend__c() {
        return capMan__PreferredDividend__c;
    }


    /**
     * Sets the capMan__PreferredDividend__c value for this CapMan__Security__c.
     * 
     * @param capMan__PreferredDividend__c
     */
    public void setCapMan__PreferredDividend__c(java.lang.Double capMan__PreferredDividend__c) {
        this.capMan__PreferredDividend__c = capMan__PreferredDividend__c;
    }


    /**
     * Gets the capMan__Preferred_Dividend_Unit__c value for this CapMan__Security__c.
     * 
     * @return capMan__Preferred_Dividend_Unit__c
     */
    public java.lang.String getCapMan__Preferred_Dividend_Unit__c() {
        return capMan__Preferred_Dividend_Unit__c;
    }


    /**
     * Sets the capMan__Preferred_Dividend_Unit__c value for this CapMan__Security__c.
     * 
     * @param capMan__Preferred_Dividend_Unit__c
     */
    public void setCapMan__Preferred_Dividend_Unit__c(java.lang.String capMan__Preferred_Dividend_Unit__c) {
        this.capMan__Preferred_Dividend_Unit__c = capMan__Preferred_Dividend_Unit__c;
    }


    /**
     * Gets the capMan__Price_Cap__c value for this CapMan__Security__c.
     * 
     * @return capMan__Price_Cap__c
     */
    public java.lang.Double getCapMan__Price_Cap__c() {
        return capMan__Price_Cap__c;
    }


    /**
     * Sets the capMan__Price_Cap__c value for this CapMan__Security__c.
     * 
     * @param capMan__Price_Cap__c
     */
    public void setCapMan__Price_Cap__c(java.lang.Double capMan__Price_Cap__c) {
        this.capMan__Price_Cap__c = capMan__Price_Cap__c;
    }


    /**
     * Gets the capMan__Pro_Rata_Rights__c value for this CapMan__Security__c.
     * 
     * @return capMan__Pro_Rata_Rights__c
     */
    public java.lang.Boolean getCapMan__Pro_Rata_Rights__c() {
        return capMan__Pro_Rata_Rights__c;
    }


    /**
     * Sets the capMan__Pro_Rata_Rights__c value for this CapMan__Security__c.
     * 
     * @param capMan__Pro_Rata_Rights__c
     */
    public void setCapMan__Pro_Rata_Rights__c(java.lang.Boolean capMan__Pro_Rata_Rights__c) {
        this.capMan__Pro_Rata_Rights__c = capMan__Pro_Rata_Rights__c;
    }


    /**
     * Gets the capMan__Protective_Provision__c value for this CapMan__Security__c.
     * 
     * @return capMan__Protective_Provision__c
     */
    public java.lang.Double getCapMan__Protective_Provision__c() {
        return capMan__Protective_Provision__c;
    }


    /**
     * Sets the capMan__Protective_Provision__c value for this CapMan__Security__c.
     * 
     * @param capMan__Protective_Provision__c
     */
    public void setCapMan__Protective_Provision__c(java.lang.Double capMan__Protective_Provision__c) {
        this.capMan__Protective_Provision__c = capMan__Protective_Provision__c;
    }


    /**
     * Gets the capMan__Rank_conversion__c value for this CapMan__Security__c.
     * 
     * @return capMan__Rank_conversion__c
     */
    public java.lang.String getCapMan__Rank_conversion__c() {
        return capMan__Rank_conversion__c;
    }


    /**
     * Sets the capMan__Rank_conversion__c value for this CapMan__Security__c.
     * 
     * @param capMan__Rank_conversion__c
     */
    public void setCapMan__Rank_conversion__c(java.lang.String capMan__Rank_conversion__c) {
        this.capMan__Rank_conversion__c = capMan__Rank_conversion__c;
    }


    /**
     * Gets the capMan__Rank_participating__c value for this CapMan__Security__c.
     * 
     * @return capMan__Rank_participating__c
     */
    public java.lang.String getCapMan__Rank_participating__c() {
        return capMan__Rank_participating__c;
    }


    /**
     * Sets the capMan__Rank_participating__c value for this CapMan__Security__c.
     * 
     * @param capMan__Rank_participating__c
     */
    public void setCapMan__Rank_participating__c(java.lang.String capMan__Rank_participating__c) {
        this.capMan__Rank_participating__c = capMan__Rank_participating__c;
    }


    /**
     * Gets the capMan__RecalcSecurity__c value for this CapMan__Security__c.
     * 
     * @return capMan__RecalcSecurity__c
     */
    public java.lang.Boolean getCapMan__RecalcSecurity__c() {
        return capMan__RecalcSecurity__c;
    }


    /**
     * Sets the capMan__RecalcSecurity__c value for this CapMan__Security__c.
     * 
     * @param capMan__RecalcSecurity__c
     */
    public void setCapMan__RecalcSecurity__c(java.lang.Boolean capMan__RecalcSecurity__c) {
        this.capMan__RecalcSecurity__c = capMan__RecalcSecurity__c;
    }


    /**
     * Gets the capMan__Redeemable__c value for this CapMan__Security__c.
     * 
     * @return capMan__Redeemable__c
     */
    public java.lang.Boolean getCapMan__Redeemable__c() {
        return capMan__Redeemable__c;
    }


    /**
     * Sets the capMan__Redeemable__c value for this CapMan__Security__c.
     * 
     * @param capMan__Redeemable__c
     */
    public void setCapMan__Redeemable__c(java.lang.Boolean capMan__Redeemable__c) {
        this.capMan__Redeemable__c = capMan__Redeemable__c;
    }


    /**
     * Gets the capMan__Redemption_Rights__c value for this CapMan__Security__c.
     * 
     * @return capMan__Redemption_Rights__c
     */
    public java.lang.Boolean getCapMan__Redemption_Rights__c() {
        return capMan__Redemption_Rights__c;
    }


    /**
     * Sets the capMan__Redemption_Rights__c value for this CapMan__Security__c.
     * 
     * @param capMan__Redemption_Rights__c
     */
    public void setCapMan__Redemption_Rights__c(java.lang.Boolean capMan__Redemption_Rights__c) {
        this.capMan__Redemption_Rights__c = capMan__Redemption_Rights__c;
    }


    /**
     * Gets the capMan__ReferencedRankedSecurity__c value for this CapMan__Security__c.
     * 
     * @return capMan__ReferencedRankedSecurity__c
     */
    public java.lang.String getCapMan__ReferencedRankedSecurity__c() {
        return capMan__ReferencedRankedSecurity__c;
    }


    /**
     * Sets the capMan__ReferencedRankedSecurity__c value for this CapMan__Security__c.
     * 
     * @param capMan__ReferencedRankedSecurity__c
     */
    public void setCapMan__ReferencedRankedSecurity__c(java.lang.String capMan__ReferencedRankedSecurity__c) {
        this.capMan__ReferencedRankedSecurity__c = capMan__ReferencedRankedSecurity__c;
    }


    /**
     * Gets the capMan__ReferencedRankedSecurity__r value for this CapMan__Security__c.
     * 
     * @return capMan__ReferencedRankedSecurity__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Security__c getCapMan__ReferencedRankedSecurity__r() {
        return capMan__ReferencedRankedSecurity__r;
    }


    /**
     * Sets the capMan__ReferencedRankedSecurity__r value for this CapMan__Security__c.
     * 
     * @param capMan__ReferencedRankedSecurity__r
     */
    public void setCapMan__ReferencedRankedSecurity__r(com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__ReferencedRankedSecurity__r) {
        this.capMan__ReferencedRankedSecurity__r = capMan__ReferencedRankedSecurity__r;
    }


    /**
     * Gets the capMan__Referenced_Converted_Security__c value for this CapMan__Security__c.
     * 
     * @return capMan__Referenced_Converted_Security__c
     */
    public java.lang.String getCapMan__Referenced_Converted_Security__c() {
        return capMan__Referenced_Converted_Security__c;
    }


    /**
     * Sets the capMan__Referenced_Converted_Security__c value for this CapMan__Security__c.
     * 
     * @param capMan__Referenced_Converted_Security__c
     */
    public void setCapMan__Referenced_Converted_Security__c(java.lang.String capMan__Referenced_Converted_Security__c) {
        this.capMan__Referenced_Converted_Security__c = capMan__Referenced_Converted_Security__c;
    }


    /**
     * Gets the capMan__Referenced_Converted_Security__r value for this CapMan__Security__c.
     * 
     * @return capMan__Referenced_Converted_Security__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Security__c getCapMan__Referenced_Converted_Security__r() {
        return capMan__Referenced_Converted_Security__r;
    }


    /**
     * Sets the capMan__Referenced_Converted_Security__r value for this CapMan__Security__c.
     * 
     * @param capMan__Referenced_Converted_Security__r
     */
    public void setCapMan__Referenced_Converted_Security__r(com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Referenced_Converted_Security__r) {
        this.capMan__Referenced_Converted_Security__r = capMan__Referenced_Converted_Security__r;
    }


    /**
     * Gets the capMan__RegistrationRights__c value for this CapMan__Security__c.
     * 
     * @return capMan__RegistrationRights__c
     */
    public java.lang.Boolean getCapMan__RegistrationRights__c() {
        return capMan__RegistrationRights__c;
    }


    /**
     * Sets the capMan__RegistrationRights__c value for this CapMan__Security__c.
     * 
     * @param capMan__RegistrationRights__c
     */
    public void setCapMan__RegistrationRights__c(java.lang.Boolean capMan__RegistrationRights__c) {
        this.capMan__RegistrationRights__c = capMan__RegistrationRights__c;
    }


    /**
     * Gets the capMan__RightofFirstRefusal__c value for this CapMan__Security__c.
     * 
     * @return capMan__RightofFirstRefusal__c
     */
    public java.lang.Boolean getCapMan__RightofFirstRefusal__c() {
        return capMan__RightofFirstRefusal__c;
    }


    /**
     * Sets the capMan__RightofFirstRefusal__c value for this CapMan__Security__c.
     * 
     * @param capMan__RightofFirstRefusal__c
     */
    public void setCapMan__RightofFirstRefusal__c(java.lang.Boolean capMan__RightofFirstRefusal__c) {
        this.capMan__RightofFirstRefusal__c = capMan__RightofFirstRefusal__c;
    }


    /**
     * Gets the capMan__Rule144Restriction__c value for this CapMan__Security__c.
     * 
     * @return capMan__Rule144Restriction__c
     */
    public java.lang.Boolean getCapMan__Rule144Restriction__c() {
        return capMan__Rule144Restriction__c;
    }


    /**
     * Sets the capMan__Rule144Restriction__c value for this CapMan__Security__c.
     * 
     * @param capMan__Rule144Restriction__c
     */
    public void setCapMan__Rule144Restriction__c(java.lang.Boolean capMan__Rule144Restriction__c) {
        this.capMan__Rule144Restriction__c = capMan__Rule144Restriction__c;
    }


    /**
     * Gets the capMan__Rule144__c value for this CapMan__Security__c.
     * 
     * @return capMan__Rule144__c
     */
    public java.lang.Boolean getCapMan__Rule144__c() {
        return capMan__Rule144__c;
    }


    /**
     * Sets the capMan__Rule144__c value for this CapMan__Security__c.
     * 
     * @param capMan__Rule144__c
     */
    public void setCapMan__Rule144__c(java.lang.Boolean capMan__Rule144__c) {
        this.capMan__Rule144__c = capMan__Rule144__c;
    }


    /**
     * Gets the capMan__Rule701__c value for this CapMan__Security__c.
     * 
     * @return capMan__Rule701__c
     */
    public java.lang.Boolean getCapMan__Rule701__c() {
        return capMan__Rule701__c;
    }


    /**
     * Sets the capMan__Rule701__c value for this CapMan__Security__c.
     * 
     * @param capMan__Rule701__c
     */
    public void setCapMan__Rule701__c(java.lang.Boolean capMan__Rule701__c) {
        this.capMan__Rule701__c = capMan__Rule701__c;
    }


    /**
     * Gets the capMan__Section83B__c value for this CapMan__Security__c.
     * 
     * @return capMan__Section83B__c
     */
    public java.lang.Boolean getCapMan__Section83B__c() {
        return capMan__Section83B__c;
    }


    /**
     * Sets the capMan__Section83B__c value for this CapMan__Security__c.
     * 
     * @param capMan__Section83B__c
     */
    public void setCapMan__Section83B__c(java.lang.Boolean capMan__Section83B__c) {
        this.capMan__Section83B__c = capMan__Section83B__c;
    }


    /**
     * Gets the capMan__Securities1__r value for this CapMan__Security__c.
     * 
     * @return capMan__Securities1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Securities1__r() {
        return capMan__Securities1__r;
    }


    /**
     * Sets the capMan__Securities1__r value for this CapMan__Security__c.
     * 
     * @param capMan__Securities1__r
     */
    public void setCapMan__Securities1__r(com.sforce.soap.enterprise.QueryResult capMan__Securities1__r) {
        this.capMan__Securities1__r = capMan__Securities1__r;
    }


    /**
     * Gets the capMan__Securities3__r value for this CapMan__Security__c.
     * 
     * @return capMan__Securities3__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Securities3__r() {
        return capMan__Securities3__r;
    }


    /**
     * Sets the capMan__Securities3__r value for this CapMan__Security__c.
     * 
     * @param capMan__Securities3__r
     */
    public void setCapMan__Securities3__r(com.sforce.soap.enterprise.QueryResult capMan__Securities3__r) {
        this.capMan__Securities3__r = capMan__Securities3__r;
    }


    /**
     * Gets the capMan__Securities_Trade_States__r value for this CapMan__Security__c.
     * 
     * @return capMan__Securities_Trade_States__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Securities_Trade_States__r() {
        return capMan__Securities_Trade_States__r;
    }


    /**
     * Sets the capMan__Securities_Trade_States__r value for this CapMan__Security__c.
     * 
     * @param capMan__Securities_Trade_States__r
     */
    public void setCapMan__Securities_Trade_States__r(com.sforce.soap.enterprise.QueryResult capMan__Securities_Trade_States__r) {
        this.capMan__Securities_Trade_States__r = capMan__Securities_Trade_States__r;
    }


    /**
     * Gets the capMan__Securities__r value for this CapMan__Security__c.
     * 
     * @return capMan__Securities__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Securities__r() {
        return capMan__Securities__r;
    }


    /**
     * Sets the capMan__Securities__r value for this CapMan__Security__c.
     * 
     * @param capMan__Securities__r
     */
    public void setCapMan__Securities__r(com.sforce.soap.enterprise.QueryResult capMan__Securities__r) {
        this.capMan__Securities__r = capMan__Securities__r;
    }


    /**
     * Gets the capMan__SecurityLink__c value for this CapMan__Security__c.
     * 
     * @return capMan__SecurityLink__c
     */
    public java.lang.String getCapMan__SecurityLink__c() {
        return capMan__SecurityLink__c;
    }


    /**
     * Sets the capMan__SecurityLink__c value for this CapMan__Security__c.
     * 
     * @param capMan__SecurityLink__c
     */
    public void setCapMan__SecurityLink__c(java.lang.String capMan__SecurityLink__c) {
        this.capMan__SecurityLink__c = capMan__SecurityLink__c;
    }


    /**
     * Gets the capMan__SecurityName__c value for this CapMan__Security__c.
     * 
     * @return capMan__SecurityName__c
     */
    public java.lang.String getCapMan__SecurityName__c() {
        return capMan__SecurityName__c;
    }


    /**
     * Sets the capMan__SecurityName__c value for this CapMan__Security__c.
     * 
     * @param capMan__SecurityName__c
     */
    public void setCapMan__SecurityName__c(java.lang.String capMan__SecurityName__c) {
        this.capMan__SecurityName__c = capMan__SecurityName__c;
    }


    /**
     * Gets the capMan__Security_Price_History__r value for this CapMan__Security__c.
     * 
     * @return capMan__Security_Price_History__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Security_Price_History__r() {
        return capMan__Security_Price_History__r;
    }


    /**
     * Sets the capMan__Security_Price_History__r value for this CapMan__Security__c.
     * 
     * @param capMan__Security_Price_History__r
     */
    public void setCapMan__Security_Price_History__r(com.sforce.soap.enterprise.QueryResult capMan__Security_Price_History__r) {
        this.capMan__Security_Price_History__r = capMan__Security_Price_History__r;
    }


    /**
     * Gets the capMan__Security_Type__c value for this CapMan__Security__c.
     * 
     * @return capMan__Security_Type__c
     */
    public java.lang.String getCapMan__Security_Type__c() {
        return capMan__Security_Type__c;
    }


    /**
     * Sets the capMan__Security_Type__c value for this CapMan__Security__c.
     * 
     * @param capMan__Security_Type__c
     */
    public void setCapMan__Security_Type__c(java.lang.String capMan__Security_Type__c) {
        this.capMan__Security_Type__c = capMan__Security_Type__c;
    }


    /**
     * Gets the capMan__SharePriceDate__c value for this CapMan__Security__c.
     * 
     * @return capMan__SharePriceDate__c
     */
    public java.util.Date getCapMan__SharePriceDate__c() {
        return capMan__SharePriceDate__c;
    }


    /**
     * Sets the capMan__SharePriceDate__c value for this CapMan__Security__c.
     * 
     * @param capMan__SharePriceDate__c
     */
    public void setCapMan__SharePriceDate__c(java.util.Date capMan__SharePriceDate__c) {
        this.capMan__SharePriceDate__c = capMan__SharePriceDate__c;
    }


    /**
     * Gets the capMan__Share_Authorizations__r value for this CapMan__Security__c.
     * 
     * @return capMan__Share_Authorizations__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Share_Authorizations__r() {
        return capMan__Share_Authorizations__r;
    }


    /**
     * Sets the capMan__Share_Authorizations__r value for this CapMan__Security__c.
     * 
     * @param capMan__Share_Authorizations__r
     */
    public void setCapMan__Share_Authorizations__r(com.sforce.soap.enterprise.QueryResult capMan__Share_Authorizations__r) {
        this.capMan__Share_Authorizations__r = capMan__Share_Authorizations__r;
    }


    /**
     * Gets the capMan__Share_Price2__c value for this CapMan__Security__c.
     * 
     * @return capMan__Share_Price2__c
     */
    public java.lang.Double getCapMan__Share_Price2__c() {
        return capMan__Share_Price2__c;
    }


    /**
     * Sets the capMan__Share_Price2__c value for this CapMan__Security__c.
     * 
     * @param capMan__Share_Price2__c
     */
    public void setCapMan__Share_Price2__c(java.lang.Double capMan__Share_Price2__c) {
        this.capMan__Share_Price2__c = capMan__Share_Price2__c;
    }


    /**
     * Gets the capMan__Share_Price_Current2__c value for this CapMan__Security__c.
     * 
     * @return capMan__Share_Price_Current2__c
     */
    public java.lang.Double getCapMan__Share_Price_Current2__c() {
        return capMan__Share_Price_Current2__c;
    }


    /**
     * Sets the capMan__Share_Price_Current2__c value for this CapMan__Security__c.
     * 
     * @param capMan__Share_Price_Current2__c
     */
    public void setCapMan__Share_Price_Current2__c(java.lang.Double capMan__Share_Price_Current2__c) {
        this.capMan__Share_Price_Current2__c = capMan__Share_Price_Current2__c;
    }


    /**
     * Gets the capMan__Share_Price_Current__c value for this CapMan__Security__c.
     * 
     * @return capMan__Share_Price_Current__c
     */
    public java.lang.Double getCapMan__Share_Price_Current__c() {
        return capMan__Share_Price_Current__c;
    }


    /**
     * Sets the capMan__Share_Price_Current__c value for this CapMan__Security__c.
     * 
     * @param capMan__Share_Price_Current__c
     */
    public void setCapMan__Share_Price_Current__c(java.lang.Double capMan__Share_Price_Current__c) {
        this.capMan__Share_Price_Current__c = capMan__Share_Price_Current__c;
    }


    /**
     * Gets the capMan__Share_Price_Previous_Current2__c value for this CapMan__Security__c.
     * 
     * @return capMan__Share_Price_Previous_Current2__c
     */
    public java.lang.Double getCapMan__Share_Price_Previous_Current2__c() {
        return capMan__Share_Price_Previous_Current2__c;
    }


    /**
     * Sets the capMan__Share_Price_Previous_Current2__c value for this CapMan__Security__c.
     * 
     * @param capMan__Share_Price_Previous_Current2__c
     */
    public void setCapMan__Share_Price_Previous_Current2__c(java.lang.Double capMan__Share_Price_Previous_Current2__c) {
        this.capMan__Share_Price_Previous_Current2__c = capMan__Share_Price_Previous_Current2__c;
    }


    /**
     * Gets the capMan__Share_Price__c value for this CapMan__Security__c.
     * 
     * @return capMan__Share_Price__c
     */
    public java.lang.Double getCapMan__Share_Price__c() {
        return capMan__Share_Price__c;
    }


    /**
     * Sets the capMan__Share_Price__c value for this CapMan__Security__c.
     * 
     * @param capMan__Share_Price__c
     */
    public void setCapMan__Share_Price__c(java.lang.Double capMan__Share_Price__c) {
        this.capMan__Share_Price__c = capMan__Share_Price__c;
    }


    /**
     * Gets the capMan__SharesIssued__c value for this CapMan__Security__c.
     * 
     * @return capMan__SharesIssued__c
     */
    public java.lang.Double getCapMan__SharesIssued__c() {
        return capMan__SharesIssued__c;
    }


    /**
     * Sets the capMan__SharesIssued__c value for this CapMan__Security__c.
     * 
     * @param capMan__SharesIssued__c
     */
    public void setCapMan__SharesIssued__c(java.lang.Double capMan__SharesIssued__c) {
        this.capMan__SharesIssued__c = capMan__SharesIssued__c;
    }


    /**
     * Gets the capMan__Shares__c value for this CapMan__Security__c.
     * 
     * @return capMan__Shares__c
     */
    public java.lang.Double getCapMan__Shares__c() {
        return capMan__Shares__c;
    }


    /**
     * Sets the capMan__Shares__c value for this CapMan__Security__c.
     * 
     * @param capMan__Shares__c
     */
    public void setCapMan__Shares__c(java.lang.Double capMan__Shares__c) {
        this.capMan__Shares__c = capMan__Shares__c;
    }


    /**
     * Gets the capMan__Sort_Param1__c value for this CapMan__Security__c.
     * 
     * @return capMan__Sort_Param1__c
     */
    public java.lang.Double getCapMan__Sort_Param1__c() {
        return capMan__Sort_Param1__c;
    }


    /**
     * Sets the capMan__Sort_Param1__c value for this CapMan__Security__c.
     * 
     * @param capMan__Sort_Param1__c
     */
    public void setCapMan__Sort_Param1__c(java.lang.Double capMan__Sort_Param1__c) {
        this.capMan__Sort_Param1__c = capMan__Sort_Param1__c;
    }


    /**
     * Gets the capMan__TotalRaised__c value for this CapMan__Security__c.
     * 
     * @return capMan__TotalRaised__c
     */
    public java.lang.Double getCapMan__TotalRaised__c() {
        return capMan__TotalRaised__c;
    }


    /**
     * Sets the capMan__TotalRaised__c value for this CapMan__Security__c.
     * 
     * @param capMan__TotalRaised__c
     */
    public void setCapMan__TotalRaised__c(java.lang.Double capMan__TotalRaised__c) {
        this.capMan__TotalRaised__c = capMan__TotalRaised__c;
    }


    /**
     * Gets the capMan__Transactions__r value for this CapMan__Security__c.
     * 
     * @return capMan__Transactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Transactions__r() {
        return capMan__Transactions__r;
    }


    /**
     * Sets the capMan__Transactions__r value for this CapMan__Security__c.
     * 
     * @param capMan__Transactions__r
     */
    public void setCapMan__Transactions__r(com.sforce.soap.enterprise.QueryResult capMan__Transactions__r) {
        this.capMan__Transactions__r = capMan__Transactions__r;
    }


    /**
     * Gets the capMan__Underlying_Security__c value for this CapMan__Security__c.
     * 
     * @return capMan__Underlying_Security__c
     */
    public java.lang.String getCapMan__Underlying_Security__c() {
        return capMan__Underlying_Security__c;
    }


    /**
     * Sets the capMan__Underlying_Security__c value for this CapMan__Security__c.
     * 
     * @param capMan__Underlying_Security__c
     */
    public void setCapMan__Underlying_Security__c(java.lang.String capMan__Underlying_Security__c) {
        this.capMan__Underlying_Security__c = capMan__Underlying_Security__c;
    }


    /**
     * Gets the capMan__Underlying_Security__r value for this CapMan__Security__c.
     * 
     * @return capMan__Underlying_Security__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Security__c getCapMan__Underlying_Security__r() {
        return capMan__Underlying_Security__r;
    }


    /**
     * Sets the capMan__Underlying_Security__r value for this CapMan__Security__c.
     * 
     * @param capMan__Underlying_Security__r
     */
    public void setCapMan__Underlying_Security__r(com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Underlying_Security__r) {
        this.capMan__Underlying_Security__r = capMan__Underlying_Security__r;
    }


    /**
     * Gets the capMan__Underlying_Shares_Outstanding__c value for this CapMan__Security__c.
     * 
     * @return capMan__Underlying_Shares_Outstanding__c
     */
    public java.lang.Double getCapMan__Underlying_Shares_Outstanding__c() {
        return capMan__Underlying_Shares_Outstanding__c;
    }


    /**
     * Sets the capMan__Underlying_Shares_Outstanding__c value for this CapMan__Security__c.
     * 
     * @param capMan__Underlying_Shares_Outstanding__c
     */
    public void setCapMan__Underlying_Shares_Outstanding__c(java.lang.Double capMan__Underlying_Shares_Outstanding__c) {
        this.capMan__Underlying_Shares_Outstanding__c = capMan__Underlying_Shares_Outstanding__c;
    }


    /**
     * Gets the capMan__VotingRatio__c value for this CapMan__Security__c.
     * 
     * @return capMan__VotingRatio__c
     */
    public java.lang.Double getCapMan__VotingRatio__c() {
        return capMan__VotingRatio__c;
    }


    /**
     * Sets the capMan__VotingRatio__c value for this CapMan__Security__c.
     * 
     * @param capMan__VotingRatio__c
     */
    public void setCapMan__VotingRatio__c(java.lang.Double capMan__VotingRatio__c) {
        this.capMan__VotingRatio__c = capMan__VotingRatio__c;
    }


    /**
     * Gets the capMan__Voting_Notes__c value for this CapMan__Security__c.
     * 
     * @return capMan__Voting_Notes__c
     */
    public java.lang.String getCapMan__Voting_Notes__c() {
        return capMan__Voting_Notes__c;
    }


    /**
     * Sets the capMan__Voting_Notes__c value for this CapMan__Security__c.
     * 
     * @param capMan__Voting_Notes__c
     */
    public void setCapMan__Voting_Notes__c(java.lang.String capMan__Voting_Notes__c) {
        this.capMan__Voting_Notes__c = capMan__Voting_Notes__c;
    }


    /**
     * Gets the capMan__Warrant_Schedule1__r value for this CapMan__Security__c.
     * 
     * @return capMan__Warrant_Schedule1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Warrant_Schedule1__r() {
        return capMan__Warrant_Schedule1__r;
    }


    /**
     * Sets the capMan__Warrant_Schedule1__r value for this CapMan__Security__c.
     * 
     * @param capMan__Warrant_Schedule1__r
     */
    public void setCapMan__Warrant_Schedule1__r(com.sforce.soap.enterprise.QueryResult capMan__Warrant_Schedule1__r) {
        this.capMan__Warrant_Schedule1__r = capMan__Warrant_Schedule1__r;
    }


    /**
     * Gets the capMan__Warrant_Schedule__r value for this CapMan__Security__c.
     * 
     * @return capMan__Warrant_Schedule__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Warrant_Schedule__r() {
        return capMan__Warrant_Schedule__r;
    }


    /**
     * Sets the capMan__Warrant_Schedule__r value for this CapMan__Security__c.
     * 
     * @param capMan__Warrant_Schedule__r
     */
    public void setCapMan__Warrant_Schedule__r(com.sforce.soap.enterprise.QueryResult capMan__Warrant_Schedule__r) {
        this.capMan__Warrant_Schedule__r = capMan__Warrant_Schedule__r;
    }


    /**
     * Gets the capMan__WarrantsAuthorized__c value for this CapMan__Security__c.
     * 
     * @return capMan__WarrantsAuthorized__c
     */
    public java.lang.Double getCapMan__WarrantsAuthorized__c() {
        return capMan__WarrantsAuthorized__c;
    }


    /**
     * Sets the capMan__WarrantsAuthorized__c value for this CapMan__Security__c.
     * 
     * @param capMan__WarrantsAuthorized__c
     */
    public void setCapMan__WarrantsAuthorized__c(java.lang.Double capMan__WarrantsAuthorized__c) {
        this.capMan__WarrantsAuthorized__c = capMan__WarrantsAuthorized__c;
    }


    /**
     * Gets the capMan__WarrantsCancelled__c value for this CapMan__Security__c.
     * 
     * @return capMan__WarrantsCancelled__c
     */
    public java.lang.Double getCapMan__WarrantsCancelled__c() {
        return capMan__WarrantsCancelled__c;
    }


    /**
     * Sets the capMan__WarrantsCancelled__c value for this CapMan__Security__c.
     * 
     * @param capMan__WarrantsCancelled__c
     */
    public void setCapMan__WarrantsCancelled__c(java.lang.Double capMan__WarrantsCancelled__c) {
        this.capMan__WarrantsCancelled__c = capMan__WarrantsCancelled__c;
    }


    /**
     * Gets the capMan__WarrantsExercised__c value for this CapMan__Security__c.
     * 
     * @return capMan__WarrantsExercised__c
     */
    public java.lang.Double getCapMan__WarrantsExercised__c() {
        return capMan__WarrantsExercised__c;
    }


    /**
     * Sets the capMan__WarrantsExercised__c value for this CapMan__Security__c.
     * 
     * @param capMan__WarrantsExercised__c
     */
    public void setCapMan__WarrantsExercised__c(java.lang.Double capMan__WarrantsExercised__c) {
        this.capMan__WarrantsExercised__c = capMan__WarrantsExercised__c;
    }


    /**
     * Gets the capMan__WarrantsIssued__c value for this CapMan__Security__c.
     * 
     * @return capMan__WarrantsIssued__c
     */
    public java.lang.Double getCapMan__WarrantsIssued__c() {
        return capMan__WarrantsIssued__c;
    }


    /**
     * Sets the capMan__WarrantsIssued__c value for this CapMan__Security__c.
     * 
     * @param capMan__WarrantsIssued__c
     */
    public void setCapMan__WarrantsIssued__c(java.lang.Double capMan__WarrantsIssued__c) {
        this.capMan__WarrantsIssued__c = capMan__WarrantsIssued__c;
    }


    /**
     * Gets the capMan__WarrantsOutstanding__c value for this CapMan__Security__c.
     * 
     * @return capMan__WarrantsOutstanding__c
     */
    public java.lang.Double getCapMan__WarrantsOutstanding__c() {
        return capMan__WarrantsOutstanding__c;
    }


    /**
     * Sets the capMan__WarrantsOutstanding__c value for this CapMan__Security__c.
     * 
     * @param capMan__WarrantsOutstanding__c
     */
    public void setCapMan__WarrantsOutstanding__c(java.lang.Double capMan__WarrantsOutstanding__c) {
        this.capMan__WarrantsOutstanding__c = capMan__WarrantsOutstanding__c;
    }


    /**
     * Gets the capMan__WeightedAverageOptions__c value for this CapMan__Security__c.
     * 
     * @return capMan__WeightedAverageOptions__c
     */
    public java.lang.Double getCapMan__WeightedAverageOptions__c() {
        return capMan__WeightedAverageOptions__c;
    }


    /**
     * Sets the capMan__WeightedAverageOptions__c value for this CapMan__Security__c.
     * 
     * @param capMan__WeightedAverageOptions__c
     */
    public void setCapMan__WeightedAverageOptions__c(java.lang.Double capMan__WeightedAverageOptions__c) {
        this.capMan__WeightedAverageOptions__c = capMan__WeightedAverageOptions__c;
    }


    /**
     * Gets the capMan__payout_asconvertedoptions__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_asconvertedoptions__c
     */
    public java.lang.Double getCapMan__payout_asconvertedoptions__c() {
        return capMan__payout_asconvertedoptions__c;
    }


    /**
     * Sets the capMan__payout_asconvertedoptions__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_asconvertedoptions__c
     */
    public void setCapMan__payout_asconvertedoptions__c(java.lang.Double capMan__payout_asconvertedoptions__c) {
        this.capMan__payout_asconvertedoptions__c = capMan__payout_asconvertedoptions__c;
    }


    /**
     * Gets the capMan__payout_asconvertedshares__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_asconvertedshares__c
     */
    public java.lang.Double getCapMan__payout_asconvertedshares__c() {
        return capMan__payout_asconvertedshares__c;
    }


    /**
     * Sets the capMan__payout_asconvertedshares__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_asconvertedshares__c
     */
    public void setCapMan__payout_asconvertedshares__c(java.lang.Double capMan__payout_asconvertedshares__c) {
        this.capMan__payout_asconvertedshares__c = capMan__payout_asconvertedshares__c;
    }


    /**
     * Gets the capMan__payout_asconvertedwarrants__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_asconvertedwarrants__c
     */
    public java.lang.Double getCapMan__payout_asconvertedwarrants__c() {
        return capMan__payout_asconvertedwarrants__c;
    }


    /**
     * Sets the capMan__payout_asconvertedwarrants__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_asconvertedwarrants__c
     */
    public void setCapMan__payout_asconvertedwarrants__c(java.lang.Double capMan__payout_asconvertedwarrants__c) {
        this.capMan__payout_asconvertedwarrants__c = capMan__payout_asconvertedwarrants__c;
    }


    /**
     * Gets the capMan__payout_debt_outstanding__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_debt_outstanding__c
     */
    public java.lang.Double getCapMan__payout_debt_outstanding__c() {
        return capMan__payout_debt_outstanding__c;
    }


    /**
     * Sets the capMan__payout_debt_outstanding__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_debt_outstanding__c
     */
    public void setCapMan__payout_debt_outstanding__c(java.lang.Double capMan__payout_debt_outstanding__c) {
        this.capMan__payout_debt_outstanding__c = capMan__payout_debt_outstanding__c;
    }


    /**
     * Gets the capMan__payout_debtissued__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_debtissued__c
     */
    public java.lang.Double getCapMan__payout_debtissued__c() {
        return capMan__payout_debtissued__c;
    }


    /**
     * Sets the capMan__payout_debtissued__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_debtissued__c
     */
    public void setCapMan__payout_debtissued__c(java.lang.Double capMan__payout_debtissued__c) {
        this.capMan__payout_debtissued__c = capMan__payout_debtissued__c;
    }


    /**
     * Gets the capMan__payout_options_outstanding__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_options_outstanding__c
     */
    public java.lang.Double getCapMan__payout_options_outstanding__c() {
        return capMan__payout_options_outstanding__c;
    }


    /**
     * Sets the capMan__payout_options_outstanding__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_options_outstanding__c
     */
    public void setCapMan__payout_options_outstanding__c(java.lang.Double capMan__payout_options_outstanding__c) {
        this.capMan__payout_options_outstanding__c = capMan__payout_options_outstanding__c;
    }


    /**
     * Gets the capMan__payout_optionsissued__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_optionsissued__c
     */
    public java.lang.Double getCapMan__payout_optionsissued__c() {
        return capMan__payout_optionsissued__c;
    }


    /**
     * Sets the capMan__payout_optionsissued__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_optionsissued__c
     */
    public void setCapMan__payout_optionsissued__c(java.lang.Double capMan__payout_optionsissued__c) {
        this.capMan__payout_optionsissued__c = capMan__payout_optionsissued__c;
    }


    /**
     * Gets the capMan__payout_sharesissued__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_sharesissued__c
     */
    public java.lang.Double getCapMan__payout_sharesissued__c() {
        return capMan__payout_sharesissued__c;
    }


    /**
     * Sets the capMan__payout_sharesissued__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_sharesissued__c
     */
    public void setCapMan__payout_sharesissued__c(java.lang.Double capMan__payout_sharesissued__c) {
        this.capMan__payout_sharesissued__c = capMan__payout_sharesissued__c;
    }


    /**
     * Gets the capMan__payout_transactionExisted__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_transactionExisted__c
     */
    public java.lang.Boolean getCapMan__payout_transactionExisted__c() {
        return capMan__payout_transactionExisted__c;
    }


    /**
     * Sets the capMan__payout_transactionExisted__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_transactionExisted__c
     */
    public void setCapMan__payout_transactionExisted__c(java.lang.Boolean capMan__payout_transactionExisted__c) {
        this.capMan__payout_transactionExisted__c = capMan__payout_transactionExisted__c;
    }


    /**
     * Gets the capMan__payout_warrantsissued__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_warrantsissued__c
     */
    public java.lang.Double getCapMan__payout_warrantsissued__c() {
        return capMan__payout_warrantsissued__c;
    }


    /**
     * Sets the capMan__payout_warrantsissued__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_warrantsissued__c
     */
    public void setCapMan__payout_warrantsissued__c(java.lang.Double capMan__payout_warrantsissued__c) {
        this.capMan__payout_warrantsissued__c = capMan__payout_warrantsissued__c;
    }


    /**
     * Gets the capMan__payout_warrantsoutstanding__c value for this CapMan__Security__c.
     * 
     * @return capMan__payout_warrantsoutstanding__c
     */
    public java.lang.Double getCapMan__payout_warrantsoutstanding__c() {
        return capMan__payout_warrantsoutstanding__c;
    }


    /**
     * Sets the capMan__payout_warrantsoutstanding__c value for this CapMan__Security__c.
     * 
     * @param capMan__payout_warrantsoutstanding__c
     */
    public void setCapMan__payout_warrantsoutstanding__c(java.lang.Double capMan__payout_warrantsoutstanding__c) {
        this.capMan__payout_warrantsoutstanding__c = capMan__payout_warrantsoutstanding__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Security__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Security__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Security__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Security__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Security__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Security__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Security__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Security__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__Security__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__Security__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Security__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Security__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CapMan__Security__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__Security__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__Security__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Security__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__Security__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__Security__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Security__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Security__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Security__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Security__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Security__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Security__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Security__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Security__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Security__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Security__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Security__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Security__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__Security__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__Security__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this CapMan__Security__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Security__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Security__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Security__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this CapMan__Security__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this CapMan__Security__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this CapMan__Security__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this CapMan__Security__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Security__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Security__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__Security__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__Security__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Security__c)) return false;
        CapMan__Security__c other = (CapMan__Security__c) obj;
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
            ((this.capMan__Accrued_Interest__c==null && other.getCapMan__Accrued_Interest__c()==null) || 
             (this.capMan__Accrued_Interest__c!=null &&
              this.capMan__Accrued_Interest__c.equals(other.getCapMan__Accrued_Interest__c()))) &&
            ((this.capMan__AfterTaxInterestPayable__c==null && other.getCapMan__AfterTaxInterestPayable__c()==null) || 
             (this.capMan__AfterTaxInterestPayable__c!=null &&
              this.capMan__AfterTaxInterestPayable__c.equals(other.getCapMan__AfterTaxInterestPayable__c()))) &&
            ((this.capMan__Anti_Dilution__c==null && other.getCapMan__Anti_Dilution__c()==null) || 
             (this.capMan__Anti_Dilution__c!=null &&
              this.capMan__Anti_Dilution__c.equals(other.getCapMan__Anti_Dilution__c()))) &&
            ((this.capMan__AsConvertedOptions__c==null && other.getCapMan__AsConvertedOptions__c()==null) || 
             (this.capMan__AsConvertedOptions__c!=null &&
              this.capMan__AsConvertedOptions__c.equals(other.getCapMan__AsConvertedOptions__c()))) &&
            ((this.capMan__AsConvertedShares__c==null && other.getCapMan__AsConvertedShares__c()==null) || 
             (this.capMan__AsConvertedShares__c!=null &&
              this.capMan__AsConvertedShares__c.equals(other.getCapMan__AsConvertedShares__c()))) &&
            ((this.capMan__AsConvertedWarrants__c==null && other.getCapMan__AsConvertedWarrants__c()==null) || 
             (this.capMan__AsConvertedWarrants__c!=null &&
              this.capMan__AsConvertedWarrants__c.equals(other.getCapMan__AsConvertedWarrants__c()))) &&
            ((this.capMan__As_Converted_Debt__c==null && other.getCapMan__As_Converted_Debt__c()==null) || 
             (this.capMan__As_Converted_Debt__c!=null &&
              this.capMan__As_Converted_Debt__c.equals(other.getCapMan__As_Converted_Debt__c()))) &&
            ((this.capMan__Asset_Class_Level__c==null && other.getCapMan__Asset_Class_Level__c()==null) || 
             (this.capMan__Asset_Class_Level__c!=null &&
              this.capMan__Asset_Class_Level__c.equals(other.getCapMan__Asset_Class_Level__c()))) &&
            ((this.capMan__Asset_Class__c==null && other.getCapMan__Asset_Class__c()==null) || 
             (this.capMan__Asset_Class__c!=null &&
              this.capMan__Asset_Class__c.equals(other.getCapMan__Asset_Class__c()))) &&
            ((this.capMan__Authorization_Date__c==null && other.getCapMan__Authorization_Date__c()==null) || 
             (this.capMan__Authorization_Date__c!=null &&
              this.capMan__Authorization_Date__c.equals(other.getCapMan__Authorization_Date__c()))) &&
            ((this.capMan__AuthorizedSecurities__c==null && other.getCapMan__AuthorizedSecurities__c()==null) || 
             (this.capMan__AuthorizedSecurities__c!=null &&
              this.capMan__AuthorizedSecurities__c.equals(other.getCapMan__AuthorizedSecurities__c()))) &&
            ((this.capMan__Capitalizations__r==null && other.getCapMan__Capitalizations__r()==null) || 
             (this.capMan__Capitalizations__r!=null &&
              this.capMan__Capitalizations__r.equals(other.getCapMan__Capitalizations__r()))) &&
            ((this.capMan__Class_Pct_Ownership__c==null && other.getCapMan__Class_Pct_Ownership__c()==null) || 
             (this.capMan__Class_Pct_Ownership__c!=null &&
              this.capMan__Class_Pct_Ownership__c.equals(other.getCapMan__Class_Pct_Ownership__c()))) &&
            ((this.capMan__Class_Percentage__c==null && other.getCapMan__Class_Percentage__c()==null) || 
             (this.capMan__Class_Percentage__c!=null &&
              this.capMan__Class_Percentage__c.equals(other.getCapMan__Class_Percentage__c()))) &&
            ((this.capMan__CoSaleAgreement__c==null && other.getCapMan__CoSaleAgreement__c()==null) || 
             (this.capMan__CoSaleAgreement__c!=null &&
              this.capMan__CoSaleAgreement__c.equals(other.getCapMan__CoSaleAgreement__c()))) &&
            ((this.capMan__Comment__c==null && other.getCapMan__Comment__c()==null) || 
             (this.capMan__Comment__c!=null &&
              this.capMan__Comment__c.equals(other.getCapMan__Comment__c()))) &&
            ((this.capMan__ConversionPrice2__c==null && other.getCapMan__ConversionPrice2__c()==null) || 
             (this.capMan__ConversionPrice2__c!=null &&
              this.capMan__ConversionPrice2__c.equals(other.getCapMan__ConversionPrice2__c()))) &&
            ((this.capMan__ConversionPrice__c==null && other.getCapMan__ConversionPrice__c()==null) || 
             (this.capMan__ConversionPrice__c!=null &&
              this.capMan__ConversionPrice__c.equals(other.getCapMan__ConversionPrice__c()))) &&
            ((this.capMan__ConversionRatioInput2__c==null && other.getCapMan__ConversionRatioInput2__c()==null) || 
             (this.capMan__ConversionRatioInput2__c!=null &&
              this.capMan__ConversionRatioInput2__c.equals(other.getCapMan__ConversionRatioInput2__c()))) &&
            ((this.capMan__ConversionRatioInput__c==null && other.getCapMan__ConversionRatioInput__c()==null) || 
             (this.capMan__ConversionRatioInput__c!=null &&
              this.capMan__ConversionRatioInput__c.equals(other.getCapMan__ConversionRatioInput__c()))) &&
            ((this.capMan__ConversionThreshold__c==null && other.getCapMan__ConversionThreshold__c()==null) || 
             (this.capMan__ConversionThreshold__c!=null &&
              this.capMan__ConversionThreshold__c.equals(other.getCapMan__ConversionThreshold__c()))) &&
            ((this.capMan__Conversion_Amount_Threshold__c==null && other.getCapMan__Conversion_Amount_Threshold__c()==null) || 
             (this.capMan__Conversion_Amount_Threshold__c!=null &&
              this.capMan__Conversion_Amount_Threshold__c.equals(other.getCapMan__Conversion_Amount_Threshold__c()))) &&
            ((this.capMan__Conversion_Ratio__c==null && other.getCapMan__Conversion_Ratio__c()==null) || 
             (this.capMan__Conversion_Ratio__c!=null &&
              this.capMan__Conversion_Ratio__c.equals(other.getCapMan__Conversion_Ratio__c()))) &&
            ((this.capMan__ConvertibleDebt_Securities1__r==null && other.getCapMan__ConvertibleDebt_Securities1__r()==null) || 
             (this.capMan__ConvertibleDebt_Securities1__r!=null &&
              this.capMan__ConvertibleDebt_Securities1__r.equals(other.getCapMan__ConvertibleDebt_Securities1__r()))) &&
            ((this.capMan__ConvertibleDebt_Securities__r==null && other.getCapMan__ConvertibleDebt_Securities__r()==null) || 
             (this.capMan__ConvertibleDebt_Securities__r!=null &&
              this.capMan__ConvertibleDebt_Securities__r.equals(other.getCapMan__ConvertibleDebt_Securities__r()))) &&
            ((this.capMan__ConvertibleUponCertainEvents__c==null && other.getCapMan__ConvertibleUponCertainEvents__c()==null) || 
             (this.capMan__ConvertibleUponCertainEvents__c!=null &&
              this.capMan__ConvertibleUponCertainEvents__c.equals(other.getCapMan__ConvertibleUponCertainEvents__c()))) &&
            ((this.capMan__ConvertibleUponMajorityElection__c==null && other.getCapMan__ConvertibleUponMajorityElection__c()==null) || 
             (this.capMan__ConvertibleUponMajorityElection__c!=null &&
              this.capMan__ConvertibleUponMajorityElection__c.equals(other.getCapMan__ConvertibleUponMajorityElection__c()))) &&
            ((this.capMan__Converting_Amount__c==null && other.getCapMan__Converting_Amount__c()==null) || 
             (this.capMan__Converting_Amount__c!=null &&
              this.capMan__Converting_Amount__c.equals(other.getCapMan__Converting_Amount__c()))) &&
            ((this.capMan__Converting_Date__c==null && other.getCapMan__Converting_Date__c()==null) || 
             (this.capMan__Converting_Date__c!=null &&
              this.capMan__Converting_Date__c.equals(other.getCapMan__Converting_Date__c()))) &&
            ((this.capMan__Cumulative_Dividends_Per_Share__c==null && other.getCapMan__Cumulative_Dividends_Per_Share__c()==null) || 
             (this.capMan__Cumulative_Dividends_Per_Share__c!=null &&
              this.capMan__Cumulative_Dividends_Per_Share__c.equals(other.getCapMan__Cumulative_Dividends_Per_Share__c()))) &&
            ((this.capMan__Date__c==null && other.getCapMan__Date__c()==null) || 
             (this.capMan__Date__c!=null &&
              this.capMan__Date__c.equals(other.getCapMan__Date__c()))) &&
            ((this.capMan__DebtAuthorized__c==null && other.getCapMan__DebtAuthorized__c()==null) || 
             (this.capMan__DebtAuthorized__c!=null &&
              this.capMan__DebtAuthorized__c.equals(other.getCapMan__DebtAuthorized__c()))) &&
            ((this.capMan__DebtConverted__c==null && other.getCapMan__DebtConverted__c()==null) || 
             (this.capMan__DebtConverted__c!=null &&
              this.capMan__DebtConverted__c.equals(other.getCapMan__DebtConverted__c()))) &&
            ((this.capMan__DebtIssued__c==null && other.getCapMan__DebtIssued__c()==null) || 
             (this.capMan__DebtIssued__c!=null &&
              this.capMan__DebtIssued__c.equals(other.getCapMan__DebtIssued__c()))) &&
            ((this.capMan__DebtParValue__c==null && other.getCapMan__DebtParValue__c()==null) || 
             (this.capMan__DebtParValue__c!=null &&
              this.capMan__DebtParValue__c.equals(other.getCapMan__DebtParValue__c()))) &&
            ((this.capMan__DebtRatio__c==null && other.getCapMan__DebtRatio__c()==null) || 
             (this.capMan__DebtRatio__c!=null &&
              this.capMan__DebtRatio__c.equals(other.getCapMan__DebtRatio__c()))) &&
            ((this.capMan__DebtRedeemed__c==null && other.getCapMan__DebtRedeemed__c()==null) || 
             (this.capMan__DebtRedeemed__c!=null &&
              this.capMan__DebtRedeemed__c.equals(other.getCapMan__DebtRedeemed__c()))) &&
            ((this.capMan__DebtServiceCoverageRatio__c==null && other.getCapMan__DebtServiceCoverageRatio__c()==null) || 
             (this.capMan__DebtServiceCoverageRatio__c!=null &&
              this.capMan__DebtServiceCoverageRatio__c.equals(other.getCapMan__DebtServiceCoverageRatio__c()))) &&
            ((this.capMan__DebtToEquityRatio__c==null && other.getCapMan__DebtToEquityRatio__c()==null) || 
             (this.capMan__DebtToEquityRatio__c!=null &&
              this.capMan__DebtToEquityRatio__c.equals(other.getCapMan__DebtToEquityRatio__c()))) &&
            ((this.capMan__DebtType__c==null && other.getCapMan__DebtType__c()==null) || 
             (this.capMan__DebtType__c!=null &&
              this.capMan__DebtType__c.equals(other.getCapMan__DebtType__c()))) &&
            ((this.capMan__Debt_Outstanding__c==null && other.getCapMan__Debt_Outstanding__c()==null) || 
             (this.capMan__Debt_Outstanding__c!=null &&
              this.capMan__Debt_Outstanding__c.equals(other.getCapMan__Debt_Outstanding__c()))) &&
            ((this.capMan__Declare_Dividend__c==null && other.getCapMan__Declare_Dividend__c()==null) || 
             (this.capMan__Declare_Dividend__c!=null &&
              this.capMan__Declare_Dividend__c.equals(other.getCapMan__Declare_Dividend__c()))) &&
            ((this.capMan__Demand_Registration_Percent__c==null && other.getCapMan__Demand_Registration_Percent__c()==null) || 
             (this.capMan__Demand_Registration_Percent__c!=null &&
              this.capMan__Demand_Registration_Percent__c.equals(other.getCapMan__Demand_Registration_Percent__c()))) &&
            ((this.capMan__Demand_Registration_Threshold__c==null && other.getCapMan__Demand_Registration_Threshold__c()==null) || 
             (this.capMan__Demand_Registration_Threshold__c!=null &&
              this.capMan__Demand_Registration_Threshold__c.equals(other.getCapMan__Demand_Registration_Threshold__c()))) &&
            ((this.capMan__Dividend_Termination_Date__c==null && other.getCapMan__Dividend_Termination_Date__c()==null) || 
             (this.capMan__Dividend_Termination_Date__c!=null &&
              this.capMan__Dividend_Termination_Date__c.equals(other.getCapMan__Dividend_Termination_Date__c()))) &&
            ((this.capMan__Dividend_Type__c==null && other.getCapMan__Dividend_Type__c()==null) || 
             (this.capMan__Dividend_Type__c!=null &&
              this.capMan__Dividend_Type__c.equals(other.getCapMan__Dividend_Type__c()))) &&
            ((this.capMan__EarlyExercise__c==null && other.getCapMan__EarlyExercise__c()==null) || 
             (this.capMan__EarlyExercise__c!=null &&
              this.capMan__EarlyExercise__c.equals(other.getCapMan__EarlyExercise__c()))) &&
            ((this.capMan__EquityType__c==null && other.getCapMan__EquityType__c()==null) || 
             (this.capMan__EquityType__c!=null &&
              this.capMan__EquityType__c.equals(other.getCapMan__EquityType__c()))) &&
            ((this.capMan__Exercise_Price2__c==null && other.getCapMan__Exercise_Price2__c()==null) || 
             (this.capMan__Exercise_Price2__c!=null &&
              this.capMan__Exercise_Price2__c.equals(other.getCapMan__Exercise_Price2__c()))) &&
            ((this.capMan__Exercise_Price__c==null && other.getCapMan__Exercise_Price__c()==null) || 
             (this.capMan__Exercise_Price__c!=null &&
              this.capMan__Exercise_Price__c.equals(other.getCapMan__Exercise_Price__c()))) &&
            ((this.capMan__Expiration_Date__c==null && other.getCapMan__Expiration_Date__c()==null) || 
             (this.capMan__Expiration_Date__c!=null &&
              this.capMan__Expiration_Date__c.equals(other.getCapMan__Expiration_Date__c()))) &&
            ((this.capMan__InterestCoverageRatio__c==null && other.getCapMan__InterestCoverageRatio__c()==null) || 
             (this.capMan__InterestCoverageRatio__c!=null &&
              this.capMan__InterestCoverageRatio__c.equals(other.getCapMan__InterestCoverageRatio__c()))) &&
            ((this.capMan__InterestRate__c==null && other.getCapMan__InterestRate__c()==null) || 
             (this.capMan__InterestRate__c!=null &&
              this.capMan__InterestRate__c.equals(other.getCapMan__InterestRate__c()))) &&
            ((this.capMan__Interest_Payment_Frequency__c==null && other.getCapMan__Interest_Payment_Frequency__c()==null) || 
             (this.capMan__Interest_Payment_Frequency__c!=null &&
              this.capMan__Interest_Payment_Frequency__c.equals(other.getCapMan__Interest_Payment_Frequency__c()))) &&
            ((this.capMan__IsConverted__c==null && other.getCapMan__IsConverted__c()==null) || 
             (this.capMan__IsConverted__c!=null &&
              this.capMan__IsConverted__c.equals(other.getCapMan__IsConverted__c()))) &&
            ((this.capMan__Issuances1__r==null && other.getCapMan__Issuances1__r()==null) || 
             (this.capMan__Issuances1__r!=null &&
              this.capMan__Issuances1__r.equals(other.getCapMan__Issuances1__r()))) &&
            ((this.capMan__Issuances__r==null && other.getCapMan__Issuances__r()==null) || 
             (this.capMan__Issuances__r!=null &&
              this.capMan__Issuances__r.equals(other.getCapMan__Issuances__r()))) &&
            ((this.capMan__Issued__c==null && other.getCapMan__Issued__c()==null) || 
             (this.capMan__Issued__c!=null &&
              this.capMan__Issued__c.equals(other.getCapMan__Issued__c()))) &&
            ((this.capMan__IssuerLink__c==null && other.getCapMan__IssuerLink__c()==null) || 
             (this.capMan__IssuerLink__c!=null &&
              this.capMan__IssuerLink__c.equals(other.getCapMan__IssuerLink__c()))) &&
            ((this.capMan__IssuerName__c==null && other.getCapMan__IssuerName__c()==null) || 
             (this.capMan__IssuerName__c!=null &&
              this.capMan__IssuerName__c.equals(other.getCapMan__IssuerName__c()))) &&
            ((this.capMan__Issuer__c==null && other.getCapMan__Issuer__c()==null) || 
             (this.capMan__Issuer__c!=null &&
              this.capMan__Issuer__c.equals(other.getCapMan__Issuer__c()))) &&
            ((this.capMan__Issuer__r==null && other.getCapMan__Issuer__r()==null) || 
             (this.capMan__Issuer__r!=null &&
              this.capMan__Issuer__r.equals(other.getCapMan__Issuer__r()))) &&
            ((this.capMan__LiquidationMultiple2__c==null && other.getCapMan__LiquidationMultiple2__c()==null) || 
             (this.capMan__LiquidationMultiple2__c!=null &&
              this.capMan__LiquidationMultiple2__c.equals(other.getCapMan__LiquidationMultiple2__c()))) &&
            ((this.capMan__LiquidationMultiple__c==null && other.getCapMan__LiquidationMultiple__c()==null) || 
             (this.capMan__LiquidationMultiple__c!=null &&
              this.capMan__LiquidationMultiple__c.equals(other.getCapMan__LiquidationMultiple__c()))) &&
            ((this.capMan__Liquidation_Include_Derivatives__r==null && other.getCapMan__Liquidation_Include_Derivatives__r()==null) || 
             (this.capMan__Liquidation_Include_Derivatives__r!=null &&
              this.capMan__Liquidation_Include_Derivatives__r.equals(other.getCapMan__Liquidation_Include_Derivatives__r()))) &&
            ((this.capMan__Liquidation_Preference__c==null && other.getCapMan__Liquidation_Preference__c()==null) || 
             (this.capMan__Liquidation_Preference__c!=null &&
              this.capMan__Liquidation_Preference__c.equals(other.getCapMan__Liquidation_Preference__c()))) &&
            ((this.capMan__LongTermDebttoTotalAsset__c==null && other.getCapMan__LongTermDebttoTotalAsset__c()==null) || 
             (this.capMan__LongTermDebttoTotalAsset__c!=null &&
              this.capMan__LongTermDebttoTotalAsset__c.equals(other.getCapMan__LongTermDebttoTotalAsset__c()))) &&
            ((this.capMan__MandatoryConvertDate__c==null && other.getCapMan__MandatoryConvertDate__c()==null) || 
             (this.capMan__MandatoryConvertDate__c!=null &&
              this.capMan__MandatoryConvertDate__c.equals(other.getCapMan__MandatoryConvertDate__c()))) &&
            ((this.capMan__MarketWeightedPrice2__c==null && other.getCapMan__MarketWeightedPrice2__c()==null) || 
             (this.capMan__MarketWeightedPrice2__c!=null &&
              this.capMan__MarketWeightedPrice2__c.equals(other.getCapMan__MarketWeightedPrice2__c()))) &&
            ((this.capMan__MarketWeightedPrice__c==null && other.getCapMan__MarketWeightedPrice__c()==null) || 
             (this.capMan__MarketWeightedPrice__c!=null &&
              this.capMan__MarketWeightedPrice__c.equals(other.getCapMan__MarketWeightedPrice__c()))) &&
            ((this.capMan__MaturityDate__c==null && other.getCapMan__MaturityDate__c()==null) || 
             (this.capMan__MaturityDate__c!=null &&
              this.capMan__MaturityDate__c.equals(other.getCapMan__MaturityDate__c()))) &&
            ((this.capMan__Name__c==null && other.getCapMan__Name__c()==null) || 
             (this.capMan__Name__c!=null &&
              this.capMan__Name__c.equals(other.getCapMan__Name__c()))) &&
            ((this.capMan__Notes_for_Rights__c==null && other.getCapMan__Notes_for_Rights__c()==null) || 
             (this.capMan__Notes_for_Rights__c!=null &&
              this.capMan__Notes_for_Rights__c.equals(other.getCapMan__Notes_for_Rights__c()))) &&
            ((this.capMan__NumberOfTransactions__c==null && other.getCapMan__NumberOfTransactions__c()==null) || 
             (this.capMan__NumberOfTransactions__c!=null &&
              this.capMan__NumberOfTransactions__c.equals(other.getCapMan__NumberOfTransactions__c()))) &&
            ((this.capMan__OldAuthorized__c==null && other.getCapMan__OldAuthorized__c()==null) || 
             (this.capMan__OldAuthorized__c!=null &&
              this.capMan__OldAuthorized__c.equals(other.getCapMan__OldAuthorized__c()))) &&
            ((this.capMan__OptionsAuthorized__c==null && other.getCapMan__OptionsAuthorized__c()==null) || 
             (this.capMan__OptionsAuthorized__c!=null &&
              this.capMan__OptionsAuthorized__c.equals(other.getCapMan__OptionsAuthorized__c()))) &&
            ((this.capMan__OptionsCancelled__c==null && other.getCapMan__OptionsCancelled__c()==null) || 
             (this.capMan__OptionsCancelled__c!=null &&
              this.capMan__OptionsCancelled__c.equals(other.getCapMan__OptionsCancelled__c()))) &&
            ((this.capMan__OptionsExercised__c==null && other.getCapMan__OptionsExercised__c()==null) || 
             (this.capMan__OptionsExercised__c!=null &&
              this.capMan__OptionsExercised__c.equals(other.getCapMan__OptionsExercised__c()))) &&
            ((this.capMan__OptionsIssued__c==null && other.getCapMan__OptionsIssued__c()==null) || 
             (this.capMan__OptionsIssued__c!=null &&
              this.capMan__OptionsIssued__c.equals(other.getCapMan__OptionsIssued__c()))) &&
            ((this.capMan__OptionsRecyclable__c==null && other.getCapMan__OptionsRecyclable__c()==null) || 
             (this.capMan__OptionsRecyclable__c!=null &&
              this.capMan__OptionsRecyclable__c.equals(other.getCapMan__OptionsRecyclable__c()))) &&
            ((this.capMan__Options_Available_For_Grant__c==null && other.getCapMan__Options_Available_For_Grant__c()==null) || 
             (this.capMan__Options_Available_For_Grant__c!=null &&
              this.capMan__Options_Available_For_Grant__c.equals(other.getCapMan__Options_Available_For_Grant__c()))) &&
            ((this.capMan__Options_Outstanding__c==null && other.getCapMan__Options_Outstanding__c()==null) || 
             (this.capMan__Options_Outstanding__c!=null &&
              this.capMan__Options_Outstanding__c.equals(other.getCapMan__Options_Outstanding__c()))) &&
            ((this.capMan__Order_by_security_type__c==null && other.getCapMan__Order_by_security_type__c()==null) || 
             (this.capMan__Order_by_security_type__c!=null &&
              this.capMan__Order_by_security_type__c.equals(other.getCapMan__Order_by_security_type__c()))) &&
            ((this.capMan__OtherLiquidationAmount__c==null && other.getCapMan__OtherLiquidationAmount__c()==null) || 
             (this.capMan__OtherLiquidationAmount__c!=null &&
              this.capMan__OtherLiquidationAmount__c.equals(other.getCapMan__OtherLiquidationAmount__c()))) &&
            ((this.capMan__ParValue__c==null && other.getCapMan__ParValue__c()==null) || 
             (this.capMan__ParValue__c!=null &&
              this.capMan__ParValue__c.equals(other.getCapMan__ParValue__c()))) &&
            ((this.capMan__Participating_Text_for_Term_Sheet__c==null && other.getCapMan__Participating_Text_for_Term_Sheet__c()==null) || 
             (this.capMan__Participating_Text_for_Term_Sheet__c!=null &&
              this.capMan__Participating_Text_for_Term_Sheet__c.equals(other.getCapMan__Participating_Text_for_Term_Sheet__c()))) &&
            ((this.capMan__Participating__c==null && other.getCapMan__Participating__c()==null) || 
             (this.capMan__Participating__c!=null &&
              this.capMan__Participating__c.equals(other.getCapMan__Participating__c()))) &&
            ((this.capMan__ParticipationCap__c==null && other.getCapMan__ParticipationCap__c()==null) || 
             (this.capMan__ParticipationCap__c!=null &&
              this.capMan__ParticipationCap__c.equals(other.getCapMan__ParticipationCap__c()))) &&
            ((this.capMan__Participation_Cap_New2__c==null && other.getCapMan__Participation_Cap_New2__c()==null) || 
             (this.capMan__Participation_Cap_New2__c!=null &&
              this.capMan__Participation_Cap_New2__c.equals(other.getCapMan__Participation_Cap_New2__c()))) &&
            ((this.capMan__Participation_Cap_New__c==null && other.getCapMan__Participation_Cap_New__c()==null) || 
             (this.capMan__Participation_Cap_New__c!=null &&
              this.capMan__Participation_Cap_New__c.equals(other.getCapMan__Participation_Cap_New__c()))) &&
            ((this.capMan__Participation_Type__c==null && other.getCapMan__Participation_Type__c()==null) || 
             (this.capMan__Participation_Type__c!=null &&
              this.capMan__Participation_Type__c.equals(other.getCapMan__Participation_Type__c()))) &&
            ((this.capMan__Pay_to_Play_Links__r==null && other.getCapMan__Pay_to_Play_Links__r()==null) || 
             (this.capMan__Pay_to_Play_Links__r!=null &&
              this.capMan__Pay_to_Play_Links__r.equals(other.getCapMan__Pay_to_Play_Links__r()))) &&
            ((this.capMan__PayoffRank_Conversion__c==null && other.getCapMan__PayoffRank_Conversion__c()==null) || 
             (this.capMan__PayoffRank_Conversion__c!=null &&
              this.capMan__PayoffRank_Conversion__c.equals(other.getCapMan__PayoffRank_Conversion__c()))) &&
            ((this.capMan__PayoffRank__c==null && other.getCapMan__PayoffRank__c()==null) || 
             (this.capMan__PayoffRank__c!=null &&
              this.capMan__PayoffRank__c.equals(other.getCapMan__PayoffRank__c()))) &&
            ((this.capMan__PctVotesforNewShares__c==null && other.getCapMan__PctVotesforNewShares__c()==null) || 
             (this.capMan__PctVotesforNewShares__c!=null &&
              this.capMan__PctVotesforNewShares__c.equals(other.getCapMan__PctVotesforNewShares__c()))) &&
            ((this.capMan__PctVotestoAmend__c==null && other.getCapMan__PctVotestoAmend__c()==null) || 
             (this.capMan__PctVotestoAmend__c!=null &&
              this.capMan__PctVotestoAmend__c.equals(other.getCapMan__PctVotestoAmend__c()))) &&
            ((this.capMan__Pct_to_change_control__c==null && other.getCapMan__Pct_to_change_control__c()==null) || 
             (this.capMan__Pct_to_change_control__c!=null &&
              this.capMan__Pct_to_change_control__c.equals(other.getCapMan__Pct_to_change_control__c()))) &&
            ((this.capMan__PcttoIssueDebt__c==null && other.getCapMan__PcttoIssueDebt__c()==null) || 
             (this.capMan__PcttoIssueDebt__c!=null &&
              this.capMan__PcttoIssueDebt__c.equals(other.getCapMan__PcttoIssueDebt__c()))) &&
            ((this.capMan__Picklist__c==null && other.getCapMan__Picklist__c()==null) || 
             (this.capMan__Picklist__c!=null &&
              this.capMan__Picklist__c.equals(other.getCapMan__Picklist__c()))) &&
            ((this.capMan__PreemptiveRights__c==null && other.getCapMan__PreemptiveRights__c()==null) || 
             (this.capMan__PreemptiveRights__c!=null &&
              this.capMan__PreemptiveRights__c.equals(other.getCapMan__PreemptiveRights__c()))) &&
            ((this.capMan__PreferredDividendPct__c==null && other.getCapMan__PreferredDividendPct__c()==null) || 
             (this.capMan__PreferredDividendPct__c!=null &&
              this.capMan__PreferredDividendPct__c.equals(other.getCapMan__PreferredDividendPct__c()))) &&
            ((this.capMan__PreferredDividend__c==null && other.getCapMan__PreferredDividend__c()==null) || 
             (this.capMan__PreferredDividend__c!=null &&
              this.capMan__PreferredDividend__c.equals(other.getCapMan__PreferredDividend__c()))) &&
            ((this.capMan__Preferred_Dividend_Unit__c==null && other.getCapMan__Preferred_Dividend_Unit__c()==null) || 
             (this.capMan__Preferred_Dividend_Unit__c!=null &&
              this.capMan__Preferred_Dividend_Unit__c.equals(other.getCapMan__Preferred_Dividend_Unit__c()))) &&
            ((this.capMan__Price_Cap__c==null && other.getCapMan__Price_Cap__c()==null) || 
             (this.capMan__Price_Cap__c!=null &&
              this.capMan__Price_Cap__c.equals(other.getCapMan__Price_Cap__c()))) &&
            ((this.capMan__Pro_Rata_Rights__c==null && other.getCapMan__Pro_Rata_Rights__c()==null) || 
             (this.capMan__Pro_Rata_Rights__c!=null &&
              this.capMan__Pro_Rata_Rights__c.equals(other.getCapMan__Pro_Rata_Rights__c()))) &&
            ((this.capMan__Protective_Provision__c==null && other.getCapMan__Protective_Provision__c()==null) || 
             (this.capMan__Protective_Provision__c!=null &&
              this.capMan__Protective_Provision__c.equals(other.getCapMan__Protective_Provision__c()))) &&
            ((this.capMan__Rank_conversion__c==null && other.getCapMan__Rank_conversion__c()==null) || 
             (this.capMan__Rank_conversion__c!=null &&
              this.capMan__Rank_conversion__c.equals(other.getCapMan__Rank_conversion__c()))) &&
            ((this.capMan__Rank_participating__c==null && other.getCapMan__Rank_participating__c()==null) || 
             (this.capMan__Rank_participating__c!=null &&
              this.capMan__Rank_participating__c.equals(other.getCapMan__Rank_participating__c()))) &&
            ((this.capMan__RecalcSecurity__c==null && other.getCapMan__RecalcSecurity__c()==null) || 
             (this.capMan__RecalcSecurity__c!=null &&
              this.capMan__RecalcSecurity__c.equals(other.getCapMan__RecalcSecurity__c()))) &&
            ((this.capMan__Redeemable__c==null && other.getCapMan__Redeemable__c()==null) || 
             (this.capMan__Redeemable__c!=null &&
              this.capMan__Redeemable__c.equals(other.getCapMan__Redeemable__c()))) &&
            ((this.capMan__Redemption_Rights__c==null && other.getCapMan__Redemption_Rights__c()==null) || 
             (this.capMan__Redemption_Rights__c!=null &&
              this.capMan__Redemption_Rights__c.equals(other.getCapMan__Redemption_Rights__c()))) &&
            ((this.capMan__ReferencedRankedSecurity__c==null && other.getCapMan__ReferencedRankedSecurity__c()==null) || 
             (this.capMan__ReferencedRankedSecurity__c!=null &&
              this.capMan__ReferencedRankedSecurity__c.equals(other.getCapMan__ReferencedRankedSecurity__c()))) &&
            ((this.capMan__ReferencedRankedSecurity__r==null && other.getCapMan__ReferencedRankedSecurity__r()==null) || 
             (this.capMan__ReferencedRankedSecurity__r!=null &&
              this.capMan__ReferencedRankedSecurity__r.equals(other.getCapMan__ReferencedRankedSecurity__r()))) &&
            ((this.capMan__Referenced_Converted_Security__c==null && other.getCapMan__Referenced_Converted_Security__c()==null) || 
             (this.capMan__Referenced_Converted_Security__c!=null &&
              this.capMan__Referenced_Converted_Security__c.equals(other.getCapMan__Referenced_Converted_Security__c()))) &&
            ((this.capMan__Referenced_Converted_Security__r==null && other.getCapMan__Referenced_Converted_Security__r()==null) || 
             (this.capMan__Referenced_Converted_Security__r!=null &&
              this.capMan__Referenced_Converted_Security__r.equals(other.getCapMan__Referenced_Converted_Security__r()))) &&
            ((this.capMan__RegistrationRights__c==null && other.getCapMan__RegistrationRights__c()==null) || 
             (this.capMan__RegistrationRights__c!=null &&
              this.capMan__RegistrationRights__c.equals(other.getCapMan__RegistrationRights__c()))) &&
            ((this.capMan__RightofFirstRefusal__c==null && other.getCapMan__RightofFirstRefusal__c()==null) || 
             (this.capMan__RightofFirstRefusal__c!=null &&
              this.capMan__RightofFirstRefusal__c.equals(other.getCapMan__RightofFirstRefusal__c()))) &&
            ((this.capMan__Rule144Restriction__c==null && other.getCapMan__Rule144Restriction__c()==null) || 
             (this.capMan__Rule144Restriction__c!=null &&
              this.capMan__Rule144Restriction__c.equals(other.getCapMan__Rule144Restriction__c()))) &&
            ((this.capMan__Rule144__c==null && other.getCapMan__Rule144__c()==null) || 
             (this.capMan__Rule144__c!=null &&
              this.capMan__Rule144__c.equals(other.getCapMan__Rule144__c()))) &&
            ((this.capMan__Rule701__c==null && other.getCapMan__Rule701__c()==null) || 
             (this.capMan__Rule701__c!=null &&
              this.capMan__Rule701__c.equals(other.getCapMan__Rule701__c()))) &&
            ((this.capMan__Section83B__c==null && other.getCapMan__Section83B__c()==null) || 
             (this.capMan__Section83B__c!=null &&
              this.capMan__Section83B__c.equals(other.getCapMan__Section83B__c()))) &&
            ((this.capMan__Securities1__r==null && other.getCapMan__Securities1__r()==null) || 
             (this.capMan__Securities1__r!=null &&
              this.capMan__Securities1__r.equals(other.getCapMan__Securities1__r()))) &&
            ((this.capMan__Securities3__r==null && other.getCapMan__Securities3__r()==null) || 
             (this.capMan__Securities3__r!=null &&
              this.capMan__Securities3__r.equals(other.getCapMan__Securities3__r()))) &&
            ((this.capMan__Securities_Trade_States__r==null && other.getCapMan__Securities_Trade_States__r()==null) || 
             (this.capMan__Securities_Trade_States__r!=null &&
              this.capMan__Securities_Trade_States__r.equals(other.getCapMan__Securities_Trade_States__r()))) &&
            ((this.capMan__Securities__r==null && other.getCapMan__Securities__r()==null) || 
             (this.capMan__Securities__r!=null &&
              this.capMan__Securities__r.equals(other.getCapMan__Securities__r()))) &&
            ((this.capMan__SecurityLink__c==null && other.getCapMan__SecurityLink__c()==null) || 
             (this.capMan__SecurityLink__c!=null &&
              this.capMan__SecurityLink__c.equals(other.getCapMan__SecurityLink__c()))) &&
            ((this.capMan__SecurityName__c==null && other.getCapMan__SecurityName__c()==null) || 
             (this.capMan__SecurityName__c!=null &&
              this.capMan__SecurityName__c.equals(other.getCapMan__SecurityName__c()))) &&
            ((this.capMan__Security_Price_History__r==null && other.getCapMan__Security_Price_History__r()==null) || 
             (this.capMan__Security_Price_History__r!=null &&
              this.capMan__Security_Price_History__r.equals(other.getCapMan__Security_Price_History__r()))) &&
            ((this.capMan__Security_Type__c==null && other.getCapMan__Security_Type__c()==null) || 
             (this.capMan__Security_Type__c!=null &&
              this.capMan__Security_Type__c.equals(other.getCapMan__Security_Type__c()))) &&
            ((this.capMan__SharePriceDate__c==null && other.getCapMan__SharePriceDate__c()==null) || 
             (this.capMan__SharePriceDate__c!=null &&
              this.capMan__SharePriceDate__c.equals(other.getCapMan__SharePriceDate__c()))) &&
            ((this.capMan__Share_Authorizations__r==null && other.getCapMan__Share_Authorizations__r()==null) || 
             (this.capMan__Share_Authorizations__r!=null &&
              this.capMan__Share_Authorizations__r.equals(other.getCapMan__Share_Authorizations__r()))) &&
            ((this.capMan__Share_Price2__c==null && other.getCapMan__Share_Price2__c()==null) || 
             (this.capMan__Share_Price2__c!=null &&
              this.capMan__Share_Price2__c.equals(other.getCapMan__Share_Price2__c()))) &&
            ((this.capMan__Share_Price_Current2__c==null && other.getCapMan__Share_Price_Current2__c()==null) || 
             (this.capMan__Share_Price_Current2__c!=null &&
              this.capMan__Share_Price_Current2__c.equals(other.getCapMan__Share_Price_Current2__c()))) &&
            ((this.capMan__Share_Price_Current__c==null && other.getCapMan__Share_Price_Current__c()==null) || 
             (this.capMan__Share_Price_Current__c!=null &&
              this.capMan__Share_Price_Current__c.equals(other.getCapMan__Share_Price_Current__c()))) &&
            ((this.capMan__Share_Price_Previous_Current2__c==null && other.getCapMan__Share_Price_Previous_Current2__c()==null) || 
             (this.capMan__Share_Price_Previous_Current2__c!=null &&
              this.capMan__Share_Price_Previous_Current2__c.equals(other.getCapMan__Share_Price_Previous_Current2__c()))) &&
            ((this.capMan__Share_Price__c==null && other.getCapMan__Share_Price__c()==null) || 
             (this.capMan__Share_Price__c!=null &&
              this.capMan__Share_Price__c.equals(other.getCapMan__Share_Price__c()))) &&
            ((this.capMan__SharesIssued__c==null && other.getCapMan__SharesIssued__c()==null) || 
             (this.capMan__SharesIssued__c!=null &&
              this.capMan__SharesIssued__c.equals(other.getCapMan__SharesIssued__c()))) &&
            ((this.capMan__Shares__c==null && other.getCapMan__Shares__c()==null) || 
             (this.capMan__Shares__c!=null &&
              this.capMan__Shares__c.equals(other.getCapMan__Shares__c()))) &&
            ((this.capMan__Sort_Param1__c==null && other.getCapMan__Sort_Param1__c()==null) || 
             (this.capMan__Sort_Param1__c!=null &&
              this.capMan__Sort_Param1__c.equals(other.getCapMan__Sort_Param1__c()))) &&
            ((this.capMan__TotalRaised__c==null && other.getCapMan__TotalRaised__c()==null) || 
             (this.capMan__TotalRaised__c!=null &&
              this.capMan__TotalRaised__c.equals(other.getCapMan__TotalRaised__c()))) &&
            ((this.capMan__Transactions__r==null && other.getCapMan__Transactions__r()==null) || 
             (this.capMan__Transactions__r!=null &&
              this.capMan__Transactions__r.equals(other.getCapMan__Transactions__r()))) &&
            ((this.capMan__Underlying_Security__c==null && other.getCapMan__Underlying_Security__c()==null) || 
             (this.capMan__Underlying_Security__c!=null &&
              this.capMan__Underlying_Security__c.equals(other.getCapMan__Underlying_Security__c()))) &&
            ((this.capMan__Underlying_Security__r==null && other.getCapMan__Underlying_Security__r()==null) || 
             (this.capMan__Underlying_Security__r!=null &&
              this.capMan__Underlying_Security__r.equals(other.getCapMan__Underlying_Security__r()))) &&
            ((this.capMan__Underlying_Shares_Outstanding__c==null && other.getCapMan__Underlying_Shares_Outstanding__c()==null) || 
             (this.capMan__Underlying_Shares_Outstanding__c!=null &&
              this.capMan__Underlying_Shares_Outstanding__c.equals(other.getCapMan__Underlying_Shares_Outstanding__c()))) &&
            ((this.capMan__VotingRatio__c==null && other.getCapMan__VotingRatio__c()==null) || 
             (this.capMan__VotingRatio__c!=null &&
              this.capMan__VotingRatio__c.equals(other.getCapMan__VotingRatio__c()))) &&
            ((this.capMan__Voting_Notes__c==null && other.getCapMan__Voting_Notes__c()==null) || 
             (this.capMan__Voting_Notes__c!=null &&
              this.capMan__Voting_Notes__c.equals(other.getCapMan__Voting_Notes__c()))) &&
            ((this.capMan__Warrant_Schedule1__r==null && other.getCapMan__Warrant_Schedule1__r()==null) || 
             (this.capMan__Warrant_Schedule1__r!=null &&
              this.capMan__Warrant_Schedule1__r.equals(other.getCapMan__Warrant_Schedule1__r()))) &&
            ((this.capMan__Warrant_Schedule__r==null && other.getCapMan__Warrant_Schedule__r()==null) || 
             (this.capMan__Warrant_Schedule__r!=null &&
              this.capMan__Warrant_Schedule__r.equals(other.getCapMan__Warrant_Schedule__r()))) &&
            ((this.capMan__WarrantsAuthorized__c==null && other.getCapMan__WarrantsAuthorized__c()==null) || 
             (this.capMan__WarrantsAuthorized__c!=null &&
              this.capMan__WarrantsAuthorized__c.equals(other.getCapMan__WarrantsAuthorized__c()))) &&
            ((this.capMan__WarrantsCancelled__c==null && other.getCapMan__WarrantsCancelled__c()==null) || 
             (this.capMan__WarrantsCancelled__c!=null &&
              this.capMan__WarrantsCancelled__c.equals(other.getCapMan__WarrantsCancelled__c()))) &&
            ((this.capMan__WarrantsExercised__c==null && other.getCapMan__WarrantsExercised__c()==null) || 
             (this.capMan__WarrantsExercised__c!=null &&
              this.capMan__WarrantsExercised__c.equals(other.getCapMan__WarrantsExercised__c()))) &&
            ((this.capMan__WarrantsIssued__c==null && other.getCapMan__WarrantsIssued__c()==null) || 
             (this.capMan__WarrantsIssued__c!=null &&
              this.capMan__WarrantsIssued__c.equals(other.getCapMan__WarrantsIssued__c()))) &&
            ((this.capMan__WarrantsOutstanding__c==null && other.getCapMan__WarrantsOutstanding__c()==null) || 
             (this.capMan__WarrantsOutstanding__c!=null &&
              this.capMan__WarrantsOutstanding__c.equals(other.getCapMan__WarrantsOutstanding__c()))) &&
            ((this.capMan__WeightedAverageOptions__c==null && other.getCapMan__WeightedAverageOptions__c()==null) || 
             (this.capMan__WeightedAverageOptions__c!=null &&
              this.capMan__WeightedAverageOptions__c.equals(other.getCapMan__WeightedAverageOptions__c()))) &&
            ((this.capMan__payout_asconvertedoptions__c==null && other.getCapMan__payout_asconvertedoptions__c()==null) || 
             (this.capMan__payout_asconvertedoptions__c!=null &&
              this.capMan__payout_asconvertedoptions__c.equals(other.getCapMan__payout_asconvertedoptions__c()))) &&
            ((this.capMan__payout_asconvertedshares__c==null && other.getCapMan__payout_asconvertedshares__c()==null) || 
             (this.capMan__payout_asconvertedshares__c!=null &&
              this.capMan__payout_asconvertedshares__c.equals(other.getCapMan__payout_asconvertedshares__c()))) &&
            ((this.capMan__payout_asconvertedwarrants__c==null && other.getCapMan__payout_asconvertedwarrants__c()==null) || 
             (this.capMan__payout_asconvertedwarrants__c!=null &&
              this.capMan__payout_asconvertedwarrants__c.equals(other.getCapMan__payout_asconvertedwarrants__c()))) &&
            ((this.capMan__payout_debt_outstanding__c==null && other.getCapMan__payout_debt_outstanding__c()==null) || 
             (this.capMan__payout_debt_outstanding__c!=null &&
              this.capMan__payout_debt_outstanding__c.equals(other.getCapMan__payout_debt_outstanding__c()))) &&
            ((this.capMan__payout_debtissued__c==null && other.getCapMan__payout_debtissued__c()==null) || 
             (this.capMan__payout_debtissued__c!=null &&
              this.capMan__payout_debtissued__c.equals(other.getCapMan__payout_debtissued__c()))) &&
            ((this.capMan__payout_options_outstanding__c==null && other.getCapMan__payout_options_outstanding__c()==null) || 
             (this.capMan__payout_options_outstanding__c!=null &&
              this.capMan__payout_options_outstanding__c.equals(other.getCapMan__payout_options_outstanding__c()))) &&
            ((this.capMan__payout_optionsissued__c==null && other.getCapMan__payout_optionsissued__c()==null) || 
             (this.capMan__payout_optionsissued__c!=null &&
              this.capMan__payout_optionsissued__c.equals(other.getCapMan__payout_optionsissued__c()))) &&
            ((this.capMan__payout_sharesissued__c==null && other.getCapMan__payout_sharesissued__c()==null) || 
             (this.capMan__payout_sharesissued__c!=null &&
              this.capMan__payout_sharesissued__c.equals(other.getCapMan__payout_sharesissued__c()))) &&
            ((this.capMan__payout_transactionExisted__c==null && other.getCapMan__payout_transactionExisted__c()==null) || 
             (this.capMan__payout_transactionExisted__c!=null &&
              this.capMan__payout_transactionExisted__c.equals(other.getCapMan__payout_transactionExisted__c()))) &&
            ((this.capMan__payout_warrantsissued__c==null && other.getCapMan__payout_warrantsissued__c()==null) || 
             (this.capMan__payout_warrantsissued__c!=null &&
              this.capMan__payout_warrantsissued__c.equals(other.getCapMan__payout_warrantsissued__c()))) &&
            ((this.capMan__payout_warrantsoutstanding__c==null && other.getCapMan__payout_warrantsoutstanding__c()==null) || 
             (this.capMan__payout_warrantsoutstanding__c!=null &&
              this.capMan__payout_warrantsoutstanding__c.equals(other.getCapMan__payout_warrantsoutstanding__c()))) &&
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
        if (getCapMan__Accrued_Interest__c() != null) {
            _hashCode += getCapMan__Accrued_Interest__c().hashCode();
        }
        if (getCapMan__AfterTaxInterestPayable__c() != null) {
            _hashCode += getCapMan__AfterTaxInterestPayable__c().hashCode();
        }
        if (getCapMan__Anti_Dilution__c() != null) {
            _hashCode += getCapMan__Anti_Dilution__c().hashCode();
        }
        if (getCapMan__AsConvertedOptions__c() != null) {
            _hashCode += getCapMan__AsConvertedOptions__c().hashCode();
        }
        if (getCapMan__AsConvertedShares__c() != null) {
            _hashCode += getCapMan__AsConvertedShares__c().hashCode();
        }
        if (getCapMan__AsConvertedWarrants__c() != null) {
            _hashCode += getCapMan__AsConvertedWarrants__c().hashCode();
        }
        if (getCapMan__As_Converted_Debt__c() != null) {
            _hashCode += getCapMan__As_Converted_Debt__c().hashCode();
        }
        if (getCapMan__Asset_Class_Level__c() != null) {
            _hashCode += getCapMan__Asset_Class_Level__c().hashCode();
        }
        if (getCapMan__Asset_Class__c() != null) {
            _hashCode += getCapMan__Asset_Class__c().hashCode();
        }
        if (getCapMan__Authorization_Date__c() != null) {
            _hashCode += getCapMan__Authorization_Date__c().hashCode();
        }
        if (getCapMan__AuthorizedSecurities__c() != null) {
            _hashCode += getCapMan__AuthorizedSecurities__c().hashCode();
        }
        if (getCapMan__Capitalizations__r() != null) {
            _hashCode += getCapMan__Capitalizations__r().hashCode();
        }
        if (getCapMan__Class_Pct_Ownership__c() != null) {
            _hashCode += getCapMan__Class_Pct_Ownership__c().hashCode();
        }
        if (getCapMan__Class_Percentage__c() != null) {
            _hashCode += getCapMan__Class_Percentage__c().hashCode();
        }
        if (getCapMan__CoSaleAgreement__c() != null) {
            _hashCode += getCapMan__CoSaleAgreement__c().hashCode();
        }
        if (getCapMan__Comment__c() != null) {
            _hashCode += getCapMan__Comment__c().hashCode();
        }
        if (getCapMan__ConversionPrice2__c() != null) {
            _hashCode += getCapMan__ConversionPrice2__c().hashCode();
        }
        if (getCapMan__ConversionPrice__c() != null) {
            _hashCode += getCapMan__ConversionPrice__c().hashCode();
        }
        if (getCapMan__ConversionRatioInput2__c() != null) {
            _hashCode += getCapMan__ConversionRatioInput2__c().hashCode();
        }
        if (getCapMan__ConversionRatioInput__c() != null) {
            _hashCode += getCapMan__ConversionRatioInput__c().hashCode();
        }
        if (getCapMan__ConversionThreshold__c() != null) {
            _hashCode += getCapMan__ConversionThreshold__c().hashCode();
        }
        if (getCapMan__Conversion_Amount_Threshold__c() != null) {
            _hashCode += getCapMan__Conversion_Amount_Threshold__c().hashCode();
        }
        if (getCapMan__Conversion_Ratio__c() != null) {
            _hashCode += getCapMan__Conversion_Ratio__c().hashCode();
        }
        if (getCapMan__ConvertibleDebt_Securities1__r() != null) {
            _hashCode += getCapMan__ConvertibleDebt_Securities1__r().hashCode();
        }
        if (getCapMan__ConvertibleDebt_Securities__r() != null) {
            _hashCode += getCapMan__ConvertibleDebt_Securities__r().hashCode();
        }
        if (getCapMan__ConvertibleUponCertainEvents__c() != null) {
            _hashCode += getCapMan__ConvertibleUponCertainEvents__c().hashCode();
        }
        if (getCapMan__ConvertibleUponMajorityElection__c() != null) {
            _hashCode += getCapMan__ConvertibleUponMajorityElection__c().hashCode();
        }
        if (getCapMan__Converting_Amount__c() != null) {
            _hashCode += getCapMan__Converting_Amount__c().hashCode();
        }
        if (getCapMan__Converting_Date__c() != null) {
            _hashCode += getCapMan__Converting_Date__c().hashCode();
        }
        if (getCapMan__Cumulative_Dividends_Per_Share__c() != null) {
            _hashCode += getCapMan__Cumulative_Dividends_Per_Share__c().hashCode();
        }
        if (getCapMan__Date__c() != null) {
            _hashCode += getCapMan__Date__c().hashCode();
        }
        if (getCapMan__DebtAuthorized__c() != null) {
            _hashCode += getCapMan__DebtAuthorized__c().hashCode();
        }
        if (getCapMan__DebtConverted__c() != null) {
            _hashCode += getCapMan__DebtConverted__c().hashCode();
        }
        if (getCapMan__DebtIssued__c() != null) {
            _hashCode += getCapMan__DebtIssued__c().hashCode();
        }
        if (getCapMan__DebtParValue__c() != null) {
            _hashCode += getCapMan__DebtParValue__c().hashCode();
        }
        if (getCapMan__DebtRatio__c() != null) {
            _hashCode += getCapMan__DebtRatio__c().hashCode();
        }
        if (getCapMan__DebtRedeemed__c() != null) {
            _hashCode += getCapMan__DebtRedeemed__c().hashCode();
        }
        if (getCapMan__DebtServiceCoverageRatio__c() != null) {
            _hashCode += getCapMan__DebtServiceCoverageRatio__c().hashCode();
        }
        if (getCapMan__DebtToEquityRatio__c() != null) {
            _hashCode += getCapMan__DebtToEquityRatio__c().hashCode();
        }
        if (getCapMan__DebtType__c() != null) {
            _hashCode += getCapMan__DebtType__c().hashCode();
        }
        if (getCapMan__Debt_Outstanding__c() != null) {
            _hashCode += getCapMan__Debt_Outstanding__c().hashCode();
        }
        if (getCapMan__Declare_Dividend__c() != null) {
            _hashCode += getCapMan__Declare_Dividend__c().hashCode();
        }
        if (getCapMan__Demand_Registration_Percent__c() != null) {
            _hashCode += getCapMan__Demand_Registration_Percent__c().hashCode();
        }
        if (getCapMan__Demand_Registration_Threshold__c() != null) {
            _hashCode += getCapMan__Demand_Registration_Threshold__c().hashCode();
        }
        if (getCapMan__Dividend_Termination_Date__c() != null) {
            _hashCode += getCapMan__Dividend_Termination_Date__c().hashCode();
        }
        if (getCapMan__Dividend_Type__c() != null) {
            _hashCode += getCapMan__Dividend_Type__c().hashCode();
        }
        if (getCapMan__EarlyExercise__c() != null) {
            _hashCode += getCapMan__EarlyExercise__c().hashCode();
        }
        if (getCapMan__EquityType__c() != null) {
            _hashCode += getCapMan__EquityType__c().hashCode();
        }
        if (getCapMan__Exercise_Price2__c() != null) {
            _hashCode += getCapMan__Exercise_Price2__c().hashCode();
        }
        if (getCapMan__Exercise_Price__c() != null) {
            _hashCode += getCapMan__Exercise_Price__c().hashCode();
        }
        if (getCapMan__Expiration_Date__c() != null) {
            _hashCode += getCapMan__Expiration_Date__c().hashCode();
        }
        if (getCapMan__InterestCoverageRatio__c() != null) {
            _hashCode += getCapMan__InterestCoverageRatio__c().hashCode();
        }
        if (getCapMan__InterestRate__c() != null) {
            _hashCode += getCapMan__InterestRate__c().hashCode();
        }
        if (getCapMan__Interest_Payment_Frequency__c() != null) {
            _hashCode += getCapMan__Interest_Payment_Frequency__c().hashCode();
        }
        if (getCapMan__IsConverted__c() != null) {
            _hashCode += getCapMan__IsConverted__c().hashCode();
        }
        if (getCapMan__Issuances1__r() != null) {
            _hashCode += getCapMan__Issuances1__r().hashCode();
        }
        if (getCapMan__Issuances__r() != null) {
            _hashCode += getCapMan__Issuances__r().hashCode();
        }
        if (getCapMan__Issued__c() != null) {
            _hashCode += getCapMan__Issued__c().hashCode();
        }
        if (getCapMan__IssuerLink__c() != null) {
            _hashCode += getCapMan__IssuerLink__c().hashCode();
        }
        if (getCapMan__IssuerName__c() != null) {
            _hashCode += getCapMan__IssuerName__c().hashCode();
        }
        if (getCapMan__Issuer__c() != null) {
            _hashCode += getCapMan__Issuer__c().hashCode();
        }
        if (getCapMan__Issuer__r() != null) {
            _hashCode += getCapMan__Issuer__r().hashCode();
        }
        if (getCapMan__LiquidationMultiple2__c() != null) {
            _hashCode += getCapMan__LiquidationMultiple2__c().hashCode();
        }
        if (getCapMan__LiquidationMultiple__c() != null) {
            _hashCode += getCapMan__LiquidationMultiple__c().hashCode();
        }
        if (getCapMan__Liquidation_Include_Derivatives__r() != null) {
            _hashCode += getCapMan__Liquidation_Include_Derivatives__r().hashCode();
        }
        if (getCapMan__Liquidation_Preference__c() != null) {
            _hashCode += getCapMan__Liquidation_Preference__c().hashCode();
        }
        if (getCapMan__LongTermDebttoTotalAsset__c() != null) {
            _hashCode += getCapMan__LongTermDebttoTotalAsset__c().hashCode();
        }
        if (getCapMan__MandatoryConvertDate__c() != null) {
            _hashCode += getCapMan__MandatoryConvertDate__c().hashCode();
        }
        if (getCapMan__MarketWeightedPrice2__c() != null) {
            _hashCode += getCapMan__MarketWeightedPrice2__c().hashCode();
        }
        if (getCapMan__MarketWeightedPrice__c() != null) {
            _hashCode += getCapMan__MarketWeightedPrice__c().hashCode();
        }
        if (getCapMan__MaturityDate__c() != null) {
            _hashCode += getCapMan__MaturityDate__c().hashCode();
        }
        if (getCapMan__Name__c() != null) {
            _hashCode += getCapMan__Name__c().hashCode();
        }
        if (getCapMan__Notes_for_Rights__c() != null) {
            _hashCode += getCapMan__Notes_for_Rights__c().hashCode();
        }
        if (getCapMan__NumberOfTransactions__c() != null) {
            _hashCode += getCapMan__NumberOfTransactions__c().hashCode();
        }
        if (getCapMan__OldAuthorized__c() != null) {
            _hashCode += getCapMan__OldAuthorized__c().hashCode();
        }
        if (getCapMan__OptionsAuthorized__c() != null) {
            _hashCode += getCapMan__OptionsAuthorized__c().hashCode();
        }
        if (getCapMan__OptionsCancelled__c() != null) {
            _hashCode += getCapMan__OptionsCancelled__c().hashCode();
        }
        if (getCapMan__OptionsExercised__c() != null) {
            _hashCode += getCapMan__OptionsExercised__c().hashCode();
        }
        if (getCapMan__OptionsIssued__c() != null) {
            _hashCode += getCapMan__OptionsIssued__c().hashCode();
        }
        if (getCapMan__OptionsRecyclable__c() != null) {
            _hashCode += getCapMan__OptionsRecyclable__c().hashCode();
        }
        if (getCapMan__Options_Available_For_Grant__c() != null) {
            _hashCode += getCapMan__Options_Available_For_Grant__c().hashCode();
        }
        if (getCapMan__Options_Outstanding__c() != null) {
            _hashCode += getCapMan__Options_Outstanding__c().hashCode();
        }
        if (getCapMan__Order_by_security_type__c() != null) {
            _hashCode += getCapMan__Order_by_security_type__c().hashCode();
        }
        if (getCapMan__OtherLiquidationAmount__c() != null) {
            _hashCode += getCapMan__OtherLiquidationAmount__c().hashCode();
        }
        if (getCapMan__ParValue__c() != null) {
            _hashCode += getCapMan__ParValue__c().hashCode();
        }
        if (getCapMan__Participating_Text_for_Term_Sheet__c() != null) {
            _hashCode += getCapMan__Participating_Text_for_Term_Sheet__c().hashCode();
        }
        if (getCapMan__Participating__c() != null) {
            _hashCode += getCapMan__Participating__c().hashCode();
        }
        if (getCapMan__ParticipationCap__c() != null) {
            _hashCode += getCapMan__ParticipationCap__c().hashCode();
        }
        if (getCapMan__Participation_Cap_New2__c() != null) {
            _hashCode += getCapMan__Participation_Cap_New2__c().hashCode();
        }
        if (getCapMan__Participation_Cap_New__c() != null) {
            _hashCode += getCapMan__Participation_Cap_New__c().hashCode();
        }
        if (getCapMan__Participation_Type__c() != null) {
            _hashCode += getCapMan__Participation_Type__c().hashCode();
        }
        if (getCapMan__Pay_to_Play_Links__r() != null) {
            _hashCode += getCapMan__Pay_to_Play_Links__r().hashCode();
        }
        if (getCapMan__PayoffRank_Conversion__c() != null) {
            _hashCode += getCapMan__PayoffRank_Conversion__c().hashCode();
        }
        if (getCapMan__PayoffRank__c() != null) {
            _hashCode += getCapMan__PayoffRank__c().hashCode();
        }
        if (getCapMan__PctVotesforNewShares__c() != null) {
            _hashCode += getCapMan__PctVotesforNewShares__c().hashCode();
        }
        if (getCapMan__PctVotestoAmend__c() != null) {
            _hashCode += getCapMan__PctVotestoAmend__c().hashCode();
        }
        if (getCapMan__Pct_to_change_control__c() != null) {
            _hashCode += getCapMan__Pct_to_change_control__c().hashCode();
        }
        if (getCapMan__PcttoIssueDebt__c() != null) {
            _hashCode += getCapMan__PcttoIssueDebt__c().hashCode();
        }
        if (getCapMan__Picklist__c() != null) {
            _hashCode += getCapMan__Picklist__c().hashCode();
        }
        if (getCapMan__PreemptiveRights__c() != null) {
            _hashCode += getCapMan__PreemptiveRights__c().hashCode();
        }
        if (getCapMan__PreferredDividendPct__c() != null) {
            _hashCode += getCapMan__PreferredDividendPct__c().hashCode();
        }
        if (getCapMan__PreferredDividend__c() != null) {
            _hashCode += getCapMan__PreferredDividend__c().hashCode();
        }
        if (getCapMan__Preferred_Dividend_Unit__c() != null) {
            _hashCode += getCapMan__Preferred_Dividend_Unit__c().hashCode();
        }
        if (getCapMan__Price_Cap__c() != null) {
            _hashCode += getCapMan__Price_Cap__c().hashCode();
        }
        if (getCapMan__Pro_Rata_Rights__c() != null) {
            _hashCode += getCapMan__Pro_Rata_Rights__c().hashCode();
        }
        if (getCapMan__Protective_Provision__c() != null) {
            _hashCode += getCapMan__Protective_Provision__c().hashCode();
        }
        if (getCapMan__Rank_conversion__c() != null) {
            _hashCode += getCapMan__Rank_conversion__c().hashCode();
        }
        if (getCapMan__Rank_participating__c() != null) {
            _hashCode += getCapMan__Rank_participating__c().hashCode();
        }
        if (getCapMan__RecalcSecurity__c() != null) {
            _hashCode += getCapMan__RecalcSecurity__c().hashCode();
        }
        if (getCapMan__Redeemable__c() != null) {
            _hashCode += getCapMan__Redeemable__c().hashCode();
        }
        if (getCapMan__Redemption_Rights__c() != null) {
            _hashCode += getCapMan__Redemption_Rights__c().hashCode();
        }
        if (getCapMan__ReferencedRankedSecurity__c() != null) {
            _hashCode += getCapMan__ReferencedRankedSecurity__c().hashCode();
        }
        if (getCapMan__ReferencedRankedSecurity__r() != null) {
            _hashCode += getCapMan__ReferencedRankedSecurity__r().hashCode();
        }
        if (getCapMan__Referenced_Converted_Security__c() != null) {
            _hashCode += getCapMan__Referenced_Converted_Security__c().hashCode();
        }
        if (getCapMan__Referenced_Converted_Security__r() != null) {
            _hashCode += getCapMan__Referenced_Converted_Security__r().hashCode();
        }
        if (getCapMan__RegistrationRights__c() != null) {
            _hashCode += getCapMan__RegistrationRights__c().hashCode();
        }
        if (getCapMan__RightofFirstRefusal__c() != null) {
            _hashCode += getCapMan__RightofFirstRefusal__c().hashCode();
        }
        if (getCapMan__Rule144Restriction__c() != null) {
            _hashCode += getCapMan__Rule144Restriction__c().hashCode();
        }
        if (getCapMan__Rule144__c() != null) {
            _hashCode += getCapMan__Rule144__c().hashCode();
        }
        if (getCapMan__Rule701__c() != null) {
            _hashCode += getCapMan__Rule701__c().hashCode();
        }
        if (getCapMan__Section83B__c() != null) {
            _hashCode += getCapMan__Section83B__c().hashCode();
        }
        if (getCapMan__Securities1__r() != null) {
            _hashCode += getCapMan__Securities1__r().hashCode();
        }
        if (getCapMan__Securities3__r() != null) {
            _hashCode += getCapMan__Securities3__r().hashCode();
        }
        if (getCapMan__Securities_Trade_States__r() != null) {
            _hashCode += getCapMan__Securities_Trade_States__r().hashCode();
        }
        if (getCapMan__Securities__r() != null) {
            _hashCode += getCapMan__Securities__r().hashCode();
        }
        if (getCapMan__SecurityLink__c() != null) {
            _hashCode += getCapMan__SecurityLink__c().hashCode();
        }
        if (getCapMan__SecurityName__c() != null) {
            _hashCode += getCapMan__SecurityName__c().hashCode();
        }
        if (getCapMan__Security_Price_History__r() != null) {
            _hashCode += getCapMan__Security_Price_History__r().hashCode();
        }
        if (getCapMan__Security_Type__c() != null) {
            _hashCode += getCapMan__Security_Type__c().hashCode();
        }
        if (getCapMan__SharePriceDate__c() != null) {
            _hashCode += getCapMan__SharePriceDate__c().hashCode();
        }
        if (getCapMan__Share_Authorizations__r() != null) {
            _hashCode += getCapMan__Share_Authorizations__r().hashCode();
        }
        if (getCapMan__Share_Price2__c() != null) {
            _hashCode += getCapMan__Share_Price2__c().hashCode();
        }
        if (getCapMan__Share_Price_Current2__c() != null) {
            _hashCode += getCapMan__Share_Price_Current2__c().hashCode();
        }
        if (getCapMan__Share_Price_Current__c() != null) {
            _hashCode += getCapMan__Share_Price_Current__c().hashCode();
        }
        if (getCapMan__Share_Price_Previous_Current2__c() != null) {
            _hashCode += getCapMan__Share_Price_Previous_Current2__c().hashCode();
        }
        if (getCapMan__Share_Price__c() != null) {
            _hashCode += getCapMan__Share_Price__c().hashCode();
        }
        if (getCapMan__SharesIssued__c() != null) {
            _hashCode += getCapMan__SharesIssued__c().hashCode();
        }
        if (getCapMan__Shares__c() != null) {
            _hashCode += getCapMan__Shares__c().hashCode();
        }
        if (getCapMan__Sort_Param1__c() != null) {
            _hashCode += getCapMan__Sort_Param1__c().hashCode();
        }
        if (getCapMan__TotalRaised__c() != null) {
            _hashCode += getCapMan__TotalRaised__c().hashCode();
        }
        if (getCapMan__Transactions__r() != null) {
            _hashCode += getCapMan__Transactions__r().hashCode();
        }
        if (getCapMan__Underlying_Security__c() != null) {
            _hashCode += getCapMan__Underlying_Security__c().hashCode();
        }
        if (getCapMan__Underlying_Security__r() != null) {
            _hashCode += getCapMan__Underlying_Security__r().hashCode();
        }
        if (getCapMan__Underlying_Shares_Outstanding__c() != null) {
            _hashCode += getCapMan__Underlying_Shares_Outstanding__c().hashCode();
        }
        if (getCapMan__VotingRatio__c() != null) {
            _hashCode += getCapMan__VotingRatio__c().hashCode();
        }
        if (getCapMan__Voting_Notes__c() != null) {
            _hashCode += getCapMan__Voting_Notes__c().hashCode();
        }
        if (getCapMan__Warrant_Schedule1__r() != null) {
            _hashCode += getCapMan__Warrant_Schedule1__r().hashCode();
        }
        if (getCapMan__Warrant_Schedule__r() != null) {
            _hashCode += getCapMan__Warrant_Schedule__r().hashCode();
        }
        if (getCapMan__WarrantsAuthorized__c() != null) {
            _hashCode += getCapMan__WarrantsAuthorized__c().hashCode();
        }
        if (getCapMan__WarrantsCancelled__c() != null) {
            _hashCode += getCapMan__WarrantsCancelled__c().hashCode();
        }
        if (getCapMan__WarrantsExercised__c() != null) {
            _hashCode += getCapMan__WarrantsExercised__c().hashCode();
        }
        if (getCapMan__WarrantsIssued__c() != null) {
            _hashCode += getCapMan__WarrantsIssued__c().hashCode();
        }
        if (getCapMan__WarrantsOutstanding__c() != null) {
            _hashCode += getCapMan__WarrantsOutstanding__c().hashCode();
        }
        if (getCapMan__WeightedAverageOptions__c() != null) {
            _hashCode += getCapMan__WeightedAverageOptions__c().hashCode();
        }
        if (getCapMan__payout_asconvertedoptions__c() != null) {
            _hashCode += getCapMan__payout_asconvertedoptions__c().hashCode();
        }
        if (getCapMan__payout_asconvertedshares__c() != null) {
            _hashCode += getCapMan__payout_asconvertedshares__c().hashCode();
        }
        if (getCapMan__payout_asconvertedwarrants__c() != null) {
            _hashCode += getCapMan__payout_asconvertedwarrants__c().hashCode();
        }
        if (getCapMan__payout_debt_outstanding__c() != null) {
            _hashCode += getCapMan__payout_debt_outstanding__c().hashCode();
        }
        if (getCapMan__payout_debtissued__c() != null) {
            _hashCode += getCapMan__payout_debtissued__c().hashCode();
        }
        if (getCapMan__payout_options_outstanding__c() != null) {
            _hashCode += getCapMan__payout_options_outstanding__c().hashCode();
        }
        if (getCapMan__payout_optionsissued__c() != null) {
            _hashCode += getCapMan__payout_optionsissued__c().hashCode();
        }
        if (getCapMan__payout_sharesissued__c() != null) {
            _hashCode += getCapMan__payout_sharesissued__c().hashCode();
        }
        if (getCapMan__payout_transactionExisted__c() != null) {
            _hashCode += getCapMan__payout_transactionExisted__c().hashCode();
        }
        if (getCapMan__payout_warrantsissued__c() != null) {
            _hashCode += getCapMan__payout_warrantsissued__c().hashCode();
        }
        if (getCapMan__payout_warrantsoutstanding__c() != null) {
            _hashCode += getCapMan__payout_warrantsoutstanding__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Security__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
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
        elemField.setFieldName("capMan__Accrued_Interest__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Accrued_Interest__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AfterTaxInterestPayable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AfterTaxInterestPayable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Anti_Dilution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Anti_Dilution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AsConvertedOptions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AsConvertedOptions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AsConvertedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AsConvertedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AsConvertedWarrants__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AsConvertedWarrants__c"));
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
        elemField.setFieldName("capMan__Asset_Class_Level__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Asset_Class_Level__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Asset_Class__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Asset_Class__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Authorization_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Authorization_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AuthorizedSecurities__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AuthorizedSecurities__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Capitalizations__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Capitalizations__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Class_Pct_Ownership__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Class_Pct_Ownership__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Class_Percentage__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Class_Percentage__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CoSaleAgreement__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CoSaleAgreement__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConversionPrice2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConversionPrice2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConversionPrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConversionPrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConversionRatioInput2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConversionRatioInput2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConversionRatioInput__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConversionRatioInput__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConversionThreshold__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConversionThreshold__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Conversion_Amount_Threshold__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Conversion_Amount_Threshold__c"));
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
        elemField.setFieldName("capMan__ConvertibleDebt_Securities1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertibleDebt_Securities1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConvertibleDebt_Securities__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertibleDebt_Securities__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConvertibleUponCertainEvents__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertibleUponCertainEvents__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ConvertibleUponMajorityElection__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertibleUponMajorityElection__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Converting_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Converting_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Converting_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Converting_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Cumulative_Dividends_Per_Share__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Cumulative_Dividends_Per_Share__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("capMan__DebtConverted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtConverted__c"));
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
        elemField.setFieldName("capMan__DebtParValue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtParValue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DebtRatio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtRatio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DebtRedeemed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtRedeemed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DebtServiceCoverageRatio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtServiceCoverageRatio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DebtToEquityRatio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtToEquityRatio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DebtType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DebtType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Debt_Outstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Debt_Outstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Declare_Dividend__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Declare_Dividend__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("capMan__Dividend_Termination_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Dividend_Termination_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Dividend_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Dividend_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EarlyExercise__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EarlyExercise__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("capMan__Exercise_Price2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exercise_Price2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Exercise_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exercise_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__InterestCoverageRatio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__InterestCoverageRatio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__InterestRate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__InterestRate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Interest_Payment_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Interest_Payment_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__IsConverted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__IsConverted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Issuances1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuances1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("capMan__Issued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__IssuerLink__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__IssuerLink__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__IssuerName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__IssuerName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__LiquidationMultiple2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LiquidationMultiple2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LiquidationMultiple__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LiquidationMultiple__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Liquidation_Preference__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Liquidation_Preference__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LongTermDebttoTotalAsset__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LongTermDebttoTotalAsset__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__MandatoryConvertDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__MandatoryConvertDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__MarketWeightedPrice2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__MarketWeightedPrice2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__MarketWeightedPrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__MarketWeightedPrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__MaturityDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__MaturityDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Notes_for_Rights__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Notes_for_Rights__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__NumberOfTransactions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__NumberOfTransactions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OldAuthorized__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OldAuthorized__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsAuthorized__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsAuthorized__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsCancelled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsCancelled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsExercised__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsExercised__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsIssued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsIssued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsRecyclable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsRecyclable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Options_Available_For_Grant__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Available_For_Grant__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Order_by_security_type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Order_by_security_type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OtherLiquidationAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OtherLiquidationAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ParValue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ParValue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Participating_Text_for_Term_Sheet__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Participating_Text_for_Term_Sheet__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Participating__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Participating__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ParticipationCap__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ParticipationCap__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Participation_Cap_New2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Participation_Cap_New2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Participation_Cap_New__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Participation_Cap_New__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Participation_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Participation_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__PayoffRank_Conversion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PayoffRank_Conversion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PayoffRank__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PayoffRank__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PctVotesforNewShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PctVotesforNewShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PctVotestoAmend__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PctVotestoAmend__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pct_to_change_control__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pct_to_change_control__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PcttoIssueDebt__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PcttoIssueDebt__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Picklist__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Picklist__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PreemptiveRights__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PreemptiveRights__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PreferredDividendPct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PreferredDividendPct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PreferredDividend__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PreferredDividend__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Preferred_Dividend_Unit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Preferred_Dividend_Unit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Price_Cap__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Price_Cap__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pro_Rata_Rights__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pro_Rata_Rights__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Protective_Provision__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Protective_Provision__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Rank_conversion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Rank_conversion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Rank_participating__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Rank_participating__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RecalcSecurity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RecalcSecurity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Redeemable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Redeemable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Redemption_Rights__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Redemption_Rights__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ReferencedRankedSecurity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ReferencedRankedSecurity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ReferencedRankedSecurity__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ReferencedRankedSecurity__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Referenced_Converted_Security__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Referenced_Converted_Security__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Referenced_Converted_Security__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Referenced_Converted_Security__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RegistrationRights__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegistrationRights__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RightofFirstRefusal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RightofFirstRefusal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Rule144Restriction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Rule144Restriction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Rule144__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Rule144__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Rule701__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Rule701__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Section83B__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Section83b__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("capMan__Securities3__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Securities3__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Securities_Trade_States__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Securities_Trade_States__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Securities__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Securities__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SecurityLink__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityLink__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SecurityName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Price_History__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Price_History__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("capMan__SharePriceDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SharePriceDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Share_Authorizations__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Share_Authorizations__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("capMan__Share_Price_Current2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Share_Price_Current2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Share_Price_Current__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Share_Price_Current__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Share_Price_Previous_Current2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Share_Price_Previous_Current2__c"));
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
        elemField.setFieldName("capMan__Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Sort_Param1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Sort_Param1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotalRaised__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotalRaised__c"));
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
        elemField.setFieldName("capMan__Underlying_Security__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Underlying_Security__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Underlying_Security__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Underlying_Security__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Underlying_Shares_Outstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Underlying_Shares_Outstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__VotingRatio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__VotingRatio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Voting_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Voting_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Warrant_Schedule1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Warrant_Schedule1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Warrant_Schedule__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Warrant_Schedule__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__WarrantsAuthorized__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__WarrantsAuthorized__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__WarrantsCancelled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__WarrantsCancelled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__WarrantsExercised__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__WarrantsExercised__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__WarrantsIssued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__WarrantsIssued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__WarrantsOutstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__WarrantsOutstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__WeightedAverageOptions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__WeightedAverageOptions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_asconvertedoptions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_asconvertedoptions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_asconvertedshares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_asconvertedshares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_asconvertedwarrants__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_asconvertedwarrants__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_debt_outstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_debt_outstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_debtissued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_debtissued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_options_outstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_options_outstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_optionsissued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_optionsissued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_sharesissued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_sharesissued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_transactionExisted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_transactionExisted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_warrantsissued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_warrantsissued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__payout_warrantsoutstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__payout_warrantsoutstanding__c"));
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
