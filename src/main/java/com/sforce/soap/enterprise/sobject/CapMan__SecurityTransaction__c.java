/**
 * CapMan__SecurityTransaction__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__SecurityTransaction__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__Accrued_Interest__c;

    private java.lang.String capMan__Action__c;

    private java.lang.Double capMan__AfterTaxInterestPayable__c;

    private java.lang.Double capMan__Amount_Converted__c;

    private java.lang.Double capMan__Amount_Redeemed__c;

    private java.lang.Double capMan__Amount_Remaining__c;

    private java.lang.Double capMan__Amount__c;

    private java.lang.Double capMan__AvailableSharesToVest__c;

    private java.lang.Double capMan__BinomialValue__c;

    private java.lang.Double capMan__Cancelled_Derivatives__c;

    private java.lang.String capMan__CaptureRepriceExpense__c;

    private java.util.Date capMan__Carry_Forward_Date__c;

    private java.lang.String capMan__Certificate__c;

    private java.lang.Double capMan__CliffLength__c;

    private java.lang.Double capMan__Cliff_Length_Calc__c;

    private java.lang.Boolean capMan__ControlChangeAccel__c;

    private java.util.Date capMan__Conversion_Date__c;

    private java.lang.Double capMan__Conversion_Price2__c;

    private java.lang.Double capMan__Conversion_Price__c;

    private java.lang.Double capMan__ConvertedShares__c;

    private java.lang.String capMan__CounterpartyInvestor__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__CounterpartyInvestor__r;

    private java.lang.Double capMan__Current_Value__c;

    private java.lang.Double capMan__Date_Diff__c;

    private java.util.Date capMan__Date__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Debt_Transaction_Lots__r;

    private java.lang.String capMan__Debt_Type__c;

    private com.sforce.soap.enterprise.QueryResult capMan__DerivativeTransactionLots__r;

    private java.lang.Double capMan__Due_Diligence_Fees__c;

    private java.lang.Boolean capMan__EarlyExercise__c;

    private java.lang.String capMan__Equity_Type__c;

    private java.lang.Double capMan__Exercisable_Shares__c;

    private java.lang.Double capMan__ExercisePrice2__c;

    private java.lang.Double capMan__ExercisePrice__c;

    private java.lang.Double capMan__Exercised_Derivatives__c;

    private java.util.Date capMan__Expiration_Date__c;

    private java.lang.Double capMan__ExpiredDerivatives__c;

    private java.util.Date capMan__GrantDate__c;

    private java.lang.String capMan__Grant_Number__c;

    private java.lang.Double capMan__ImmediateVesting__c;

    private java.lang.Double capMan__Immediate_Shares__c;

    private java.lang.Double capMan__InitialAsConvertedShares__c;

    private java.lang.Double capMan__InterestAmount__c;

    private java.lang.String capMan__IssuanceName__c;

    private java.lang.String capMan__Issuance__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Issuance__c capMan__Issuance__r;

    private java.lang.String capMan__Issue_Status__c;

    private java.lang.String capMan__Issuer__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r;

    private java.lang.String capMan__Issuer_name__c;

    private java.lang.Double capMan__LActExp__c;

    private java.lang.Double capMan__LAdjUnamExp__c;

    private java.lang.Double capMan__LExpAdj__c;

    private java.lang.Double capMan__LOptionValue__c;

    private java.lang.Double capMan__LPeriodExp__c;

    private java.lang.Double capMan__LPriorAmtExp__c;

    private java.lang.Double capMan__LRegrantCF__c;

    private java.lang.Double capMan__LUnamExp__c;

    private java.util.Date capMan__LatestTransactionDate__c;

    private java.lang.Double capMan__Legal_Fees__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Listings__r;

    private java.util.Date capMan__MandatoryConvertDate__c;

    private java.lang.String capMan__Milestone_Driver__c;

    private java.lang.Double capMan__Milestone_Shares__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Milestone_Vesting__r;

    private java.lang.Double capMan__MonthsOfInterest__c;

    private java.lang.Boolean capMan__NoPricePerShareCheck__c;

    private java.lang.String capMan__Note__c;

    private java.lang.Double capMan__NumberofTimeSteps__c;

    private java.lang.Double capMan__OldAmount__c;

    private java.lang.String capMan__OptionType__c;

    private java.lang.String capMan__Option_Calculation_Type__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Option_Expenses__r;

    private java.lang.Double capMan__OptionsExpRecord__c;

    private java.lang.Double capMan__Outstanding__c;

    private java.lang.Double capMan__Parent_Exercise_Price__c;

    private java.lang.String capMan__Parent_For_Repriced_Transaction__c;

    private com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Parent_For_Repriced_Transaction__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Parent_For_Repriced_Transactions__r;

    private java.util.Date capMan__Parent_GrantDate__c;

    private java.lang.String capMan__Parent_GrantNumber__c;

    private java.lang.Double capMan__Parent_Shares__c;

    private java.util.Date capMan__Paretn_VestingStartDate__c;

    private java.lang.Double capMan__Payoffrank__c;

    private java.lang.Double capMan__PctImmediateVestingCalc__c;

    private java.lang.Double capMan__Price2__c;

    private java.lang.Double capMan__Price__c;

    private java.lang.Double capMan__PriorRegrantCarryForward__c;

    private java.lang.String capMan__RN_Lookup__c;

    private java.lang.Double capMan__Ratio_Vested__c;

    private java.lang.String capMan__Register_Investor_Name__c;

    private java.lang.String capMan__RegisteredName__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__RegisteredName__r;

    private java.lang.String capMan__Registered_Investor_ID__c;

    private java.lang.Double capMan__Registration_Fees__c;

    private java.util.Date capMan__RegrantDate__c;

    private java.lang.Double capMan__Regrant_Amount__c;

    private java.lang.Double capMan__Remaining_As_Converted__c;

    private java.lang.Double capMan__Remaining_Life__c;

    private java.lang.Double capMan__Remaining_Shares__c;

    private java.lang.Double capMan__RepurchasedShares__c;

    private java.lang.Double capMan__RiskFreeRate__c;

    private java.util.Date capMan__Rule144StartDate__c;

    private java.lang.Double capMan__SchedVestingMonths__c;

    private java.lang.Double capMan__Scheduled_Shares__c;

    private java.lang.String capMan__SecurityName__c;

    private java.lang.String capMan__SecurityType__c;

    private java.lang.String capMan__Security_ID__c;

    private java.lang.String capMan__Security_Issued__c;

    private java.lang.String capMan__Security_Type_Import__c;

    private java.lang.String capMan__Security__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Security__r;

    private java.lang.Double capMan__SharePrice2__c;

    private java.lang.Double capMan__SharePrice__c;

    private java.lang.Double capMan__Shares__c;

    private java.util.Date capMan__StartDate__c;

    private java.lang.Double capMan__TotalConvertedShares__c;

    private java.lang.Double capMan__TotalRemovedShares__c;

    private java.util.Date capMan__TransactionDate__c;

    private java.lang.String capMan__Transaction_ID__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Transaction_Lots1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Transaction_Lots2__r;

    private java.lang.Double capMan__Transferred_Total__c;

    private java.lang.Boolean capMan__UpdateOnly__c;

    private java.lang.Double capMan__Vested_Shares__c;

    private java.lang.Double capMan__VestingLengthCalc__c;

    private java.lang.Double capMan__VestingPeriodLength__c;

    private java.lang.Double capMan__VestingPeriodUnitsCalc__c;

    private java.lang.String capMan__VestingPeriodUnits__c;

    private java.lang.String capMan__VestingSchedule__c;

    private java.util.Date capMan__VestingStartDate__c;

    private java.lang.Double capMan__Volatility__c;

    private java.lang.Double capMan__checksum__c;

    private java.lang.Boolean capMan__processed_by_payout__c;

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

    private com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r;

    public CapMan__SecurityTransaction__c() {
    }

    public CapMan__SecurityTransaction__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__Accrued_Interest__c,
           java.lang.String capMan__Action__c,
           java.lang.Double capMan__AfterTaxInterestPayable__c,
           java.lang.Double capMan__Amount_Converted__c,
           java.lang.Double capMan__Amount_Redeemed__c,
           java.lang.Double capMan__Amount_Remaining__c,
           java.lang.Double capMan__Amount__c,
           java.lang.Double capMan__AvailableSharesToVest__c,
           java.lang.Double capMan__BinomialValue__c,
           java.lang.Double capMan__Cancelled_Derivatives__c,
           java.lang.String capMan__CaptureRepriceExpense__c,
           java.util.Date capMan__Carry_Forward_Date__c,
           java.lang.String capMan__Certificate__c,
           java.lang.Double capMan__CliffLength__c,
           java.lang.Double capMan__Cliff_Length_Calc__c,
           java.lang.Boolean capMan__ControlChangeAccel__c,
           java.util.Date capMan__Conversion_Date__c,
           java.lang.Double capMan__Conversion_Price2__c,
           java.lang.Double capMan__Conversion_Price__c,
           java.lang.Double capMan__ConvertedShares__c,
           java.lang.String capMan__CounterpartyInvestor__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__CounterpartyInvestor__r,
           java.lang.Double capMan__Current_Value__c,
           java.lang.Double capMan__Date_Diff__c,
           java.util.Date capMan__Date__c,
           com.sforce.soap.enterprise.QueryResult capMan__Debt_Transaction_Lots__r,
           java.lang.String capMan__Debt_Type__c,
           com.sforce.soap.enterprise.QueryResult capMan__DerivativeTransactionLots__r,
           java.lang.Double capMan__Due_Diligence_Fees__c,
           java.lang.Boolean capMan__EarlyExercise__c,
           java.lang.String capMan__Equity_Type__c,
           java.lang.Double capMan__Exercisable_Shares__c,
           java.lang.Double capMan__ExercisePrice2__c,
           java.lang.Double capMan__ExercisePrice__c,
           java.lang.Double capMan__Exercised_Derivatives__c,
           java.util.Date capMan__Expiration_Date__c,
           java.lang.Double capMan__ExpiredDerivatives__c,
           java.util.Date capMan__GrantDate__c,
           java.lang.String capMan__Grant_Number__c,
           java.lang.Double capMan__ImmediateVesting__c,
           java.lang.Double capMan__Immediate_Shares__c,
           java.lang.Double capMan__InitialAsConvertedShares__c,
           java.lang.Double capMan__InterestAmount__c,
           java.lang.String capMan__IssuanceName__c,
           java.lang.String capMan__Issuance__c,
           com.sforce.soap.enterprise.sobject.CapMan__Issuance__c capMan__Issuance__r,
           java.lang.String capMan__Issue_Status__c,
           java.lang.String capMan__Issuer__c,
           com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r,
           java.lang.String capMan__Issuer_name__c,
           java.lang.Double capMan__LActExp__c,
           java.lang.Double capMan__LAdjUnamExp__c,
           java.lang.Double capMan__LExpAdj__c,
           java.lang.Double capMan__LOptionValue__c,
           java.lang.Double capMan__LPeriodExp__c,
           java.lang.Double capMan__LPriorAmtExp__c,
           java.lang.Double capMan__LRegrantCF__c,
           java.lang.Double capMan__LUnamExp__c,
           java.util.Date capMan__LatestTransactionDate__c,
           java.lang.Double capMan__Legal_Fees__c,
           com.sforce.soap.enterprise.QueryResult capMan__Listings__r,
           java.util.Date capMan__MandatoryConvertDate__c,
           java.lang.String capMan__Milestone_Driver__c,
           java.lang.Double capMan__Milestone_Shares__c,
           com.sforce.soap.enterprise.QueryResult capMan__Milestone_Vesting__r,
           java.lang.Double capMan__MonthsOfInterest__c,
           java.lang.Boolean capMan__NoPricePerShareCheck__c,
           java.lang.String capMan__Note__c,
           java.lang.Double capMan__NumberofTimeSteps__c,
           java.lang.Double capMan__OldAmount__c,
           java.lang.String capMan__OptionType__c,
           java.lang.String capMan__Option_Calculation_Type__c,
           com.sforce.soap.enterprise.QueryResult capMan__Option_Expenses__r,
           java.lang.Double capMan__OptionsExpRecord__c,
           java.lang.Double capMan__Outstanding__c,
           java.lang.Double capMan__Parent_Exercise_Price__c,
           java.lang.String capMan__Parent_For_Repriced_Transaction__c,
           com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Parent_For_Repriced_Transaction__r,
           com.sforce.soap.enterprise.QueryResult capMan__Parent_For_Repriced_Transactions__r,
           java.util.Date capMan__Parent_GrantDate__c,
           java.lang.String capMan__Parent_GrantNumber__c,
           java.lang.Double capMan__Parent_Shares__c,
           java.util.Date capMan__Paretn_VestingStartDate__c,
           java.lang.Double capMan__Payoffrank__c,
           java.lang.Double capMan__PctImmediateVestingCalc__c,
           java.lang.Double capMan__Price2__c,
           java.lang.Double capMan__Price__c,
           java.lang.Double capMan__PriorRegrantCarryForward__c,
           java.lang.String capMan__RN_Lookup__c,
           java.lang.Double capMan__Ratio_Vested__c,
           java.lang.String capMan__Register_Investor_Name__c,
           java.lang.String capMan__RegisteredName__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__RegisteredName__r,
           java.lang.String capMan__Registered_Investor_ID__c,
           java.lang.Double capMan__Registration_Fees__c,
           java.util.Date capMan__RegrantDate__c,
           java.lang.Double capMan__Regrant_Amount__c,
           java.lang.Double capMan__Remaining_As_Converted__c,
           java.lang.Double capMan__Remaining_Life__c,
           java.lang.Double capMan__Remaining_Shares__c,
           java.lang.Double capMan__RepurchasedShares__c,
           java.lang.Double capMan__RiskFreeRate__c,
           java.util.Date capMan__Rule144StartDate__c,
           java.lang.Double capMan__SchedVestingMonths__c,
           java.lang.Double capMan__Scheduled_Shares__c,
           java.lang.String capMan__SecurityName__c,
           java.lang.String capMan__SecurityType__c,
           java.lang.String capMan__Security_ID__c,
           java.lang.String capMan__Security_Issued__c,
           java.lang.String capMan__Security_Type_Import__c,
           java.lang.String capMan__Security__c,
           com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Security__r,
           java.lang.Double capMan__SharePrice2__c,
           java.lang.Double capMan__SharePrice__c,
           java.lang.Double capMan__Shares__c,
           java.util.Date capMan__StartDate__c,
           java.lang.Double capMan__TotalConvertedShares__c,
           java.lang.Double capMan__TotalRemovedShares__c,
           java.util.Date capMan__TransactionDate__c,
           java.lang.String capMan__Transaction_ID__c,
           com.sforce.soap.enterprise.QueryResult capMan__Transaction_Lots1__r,
           com.sforce.soap.enterprise.QueryResult capMan__Transaction_Lots2__r,
           java.lang.Double capMan__Transferred_Total__c,
           java.lang.Boolean capMan__UpdateOnly__c,
           java.lang.Double capMan__Vested_Shares__c,
           java.lang.Double capMan__VestingLengthCalc__c,
           java.lang.Double capMan__VestingPeriodLength__c,
           java.lang.Double capMan__VestingPeriodUnitsCalc__c,
           java.lang.String capMan__VestingPeriodUnits__c,
           java.lang.String capMan__VestingSchedule__c,
           java.util.Date capMan__VestingStartDate__c,
           java.lang.Double capMan__Volatility__c,
           java.lang.Double capMan__checksum__c,
           java.lang.Boolean capMan__processed_by_payout__c,
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
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.capMan__Accrued_Interest__c = capMan__Accrued_Interest__c;
        this.capMan__Action__c = capMan__Action__c;
        this.capMan__AfterTaxInterestPayable__c = capMan__AfterTaxInterestPayable__c;
        this.capMan__Amount_Converted__c = capMan__Amount_Converted__c;
        this.capMan__Amount_Redeemed__c = capMan__Amount_Redeemed__c;
        this.capMan__Amount_Remaining__c = capMan__Amount_Remaining__c;
        this.capMan__Amount__c = capMan__Amount__c;
        this.capMan__AvailableSharesToVest__c = capMan__AvailableSharesToVest__c;
        this.capMan__BinomialValue__c = capMan__BinomialValue__c;
        this.capMan__Cancelled_Derivatives__c = capMan__Cancelled_Derivatives__c;
        this.capMan__CaptureRepriceExpense__c = capMan__CaptureRepriceExpense__c;
        this.capMan__Carry_Forward_Date__c = capMan__Carry_Forward_Date__c;
        this.capMan__Certificate__c = capMan__Certificate__c;
        this.capMan__CliffLength__c = capMan__CliffLength__c;
        this.capMan__Cliff_Length_Calc__c = capMan__Cliff_Length_Calc__c;
        this.capMan__ControlChangeAccel__c = capMan__ControlChangeAccel__c;
        this.capMan__Conversion_Date__c = capMan__Conversion_Date__c;
        this.capMan__Conversion_Price2__c = capMan__Conversion_Price2__c;
        this.capMan__Conversion_Price__c = capMan__Conversion_Price__c;
        this.capMan__ConvertedShares__c = capMan__ConvertedShares__c;
        this.capMan__CounterpartyInvestor__c = capMan__CounterpartyInvestor__c;
        this.capMan__CounterpartyInvestor__r = capMan__CounterpartyInvestor__r;
        this.capMan__Current_Value__c = capMan__Current_Value__c;
        this.capMan__Date_Diff__c = capMan__Date_Diff__c;
        this.capMan__Date__c = capMan__Date__c;
        this.capMan__Debt_Transaction_Lots__r = capMan__Debt_Transaction_Lots__r;
        this.capMan__Debt_Type__c = capMan__Debt_Type__c;
        this.capMan__DerivativeTransactionLots__r = capMan__DerivativeTransactionLots__r;
        this.capMan__Due_Diligence_Fees__c = capMan__Due_Diligence_Fees__c;
        this.capMan__EarlyExercise__c = capMan__EarlyExercise__c;
        this.capMan__Equity_Type__c = capMan__Equity_Type__c;
        this.capMan__Exercisable_Shares__c = capMan__Exercisable_Shares__c;
        this.capMan__ExercisePrice2__c = capMan__ExercisePrice2__c;
        this.capMan__ExercisePrice__c = capMan__ExercisePrice__c;
        this.capMan__Exercised_Derivatives__c = capMan__Exercised_Derivatives__c;
        this.capMan__Expiration_Date__c = capMan__Expiration_Date__c;
        this.capMan__ExpiredDerivatives__c = capMan__ExpiredDerivatives__c;
        this.capMan__GrantDate__c = capMan__GrantDate__c;
        this.capMan__Grant_Number__c = capMan__Grant_Number__c;
        this.capMan__ImmediateVesting__c = capMan__ImmediateVesting__c;
        this.capMan__Immediate_Shares__c = capMan__Immediate_Shares__c;
        this.capMan__InitialAsConvertedShares__c = capMan__InitialAsConvertedShares__c;
        this.capMan__InterestAmount__c = capMan__InterestAmount__c;
        this.capMan__IssuanceName__c = capMan__IssuanceName__c;
        this.capMan__Issuance__c = capMan__Issuance__c;
        this.capMan__Issuance__r = capMan__Issuance__r;
        this.capMan__Issue_Status__c = capMan__Issue_Status__c;
        this.capMan__Issuer__c = capMan__Issuer__c;
        this.capMan__Issuer__r = capMan__Issuer__r;
        this.capMan__Issuer_name__c = capMan__Issuer_name__c;
        this.capMan__LActExp__c = capMan__LActExp__c;
        this.capMan__LAdjUnamExp__c = capMan__LAdjUnamExp__c;
        this.capMan__LExpAdj__c = capMan__LExpAdj__c;
        this.capMan__LOptionValue__c = capMan__LOptionValue__c;
        this.capMan__LPeriodExp__c = capMan__LPeriodExp__c;
        this.capMan__LPriorAmtExp__c = capMan__LPriorAmtExp__c;
        this.capMan__LRegrantCF__c = capMan__LRegrantCF__c;
        this.capMan__LUnamExp__c = capMan__LUnamExp__c;
        this.capMan__LatestTransactionDate__c = capMan__LatestTransactionDate__c;
        this.capMan__Legal_Fees__c = capMan__Legal_Fees__c;
        this.capMan__Listings__r = capMan__Listings__r;
        this.capMan__MandatoryConvertDate__c = capMan__MandatoryConvertDate__c;
        this.capMan__Milestone_Driver__c = capMan__Milestone_Driver__c;
        this.capMan__Milestone_Shares__c = capMan__Milestone_Shares__c;
        this.capMan__Milestone_Vesting__r = capMan__Milestone_Vesting__r;
        this.capMan__MonthsOfInterest__c = capMan__MonthsOfInterest__c;
        this.capMan__NoPricePerShareCheck__c = capMan__NoPricePerShareCheck__c;
        this.capMan__Note__c = capMan__Note__c;
        this.capMan__NumberofTimeSteps__c = capMan__NumberofTimeSteps__c;
        this.capMan__OldAmount__c = capMan__OldAmount__c;
        this.capMan__OptionType__c = capMan__OptionType__c;
        this.capMan__Option_Calculation_Type__c = capMan__Option_Calculation_Type__c;
        this.capMan__Option_Expenses__r = capMan__Option_Expenses__r;
        this.capMan__OptionsExpRecord__c = capMan__OptionsExpRecord__c;
        this.capMan__Outstanding__c = capMan__Outstanding__c;
        this.capMan__Parent_Exercise_Price__c = capMan__Parent_Exercise_Price__c;
        this.capMan__Parent_For_Repriced_Transaction__c = capMan__Parent_For_Repriced_Transaction__c;
        this.capMan__Parent_For_Repriced_Transaction__r = capMan__Parent_For_Repriced_Transaction__r;
        this.capMan__Parent_For_Repriced_Transactions__r = capMan__Parent_For_Repriced_Transactions__r;
        this.capMan__Parent_GrantDate__c = capMan__Parent_GrantDate__c;
        this.capMan__Parent_GrantNumber__c = capMan__Parent_GrantNumber__c;
        this.capMan__Parent_Shares__c = capMan__Parent_Shares__c;
        this.capMan__Paretn_VestingStartDate__c = capMan__Paretn_VestingStartDate__c;
        this.capMan__Payoffrank__c = capMan__Payoffrank__c;
        this.capMan__PctImmediateVestingCalc__c = capMan__PctImmediateVestingCalc__c;
        this.capMan__Price2__c = capMan__Price2__c;
        this.capMan__Price__c = capMan__Price__c;
        this.capMan__PriorRegrantCarryForward__c = capMan__PriorRegrantCarryForward__c;
        this.capMan__RN_Lookup__c = capMan__RN_Lookup__c;
        this.capMan__Ratio_Vested__c = capMan__Ratio_Vested__c;
        this.capMan__Register_Investor_Name__c = capMan__Register_Investor_Name__c;
        this.capMan__RegisteredName__c = capMan__RegisteredName__c;
        this.capMan__RegisteredName__r = capMan__RegisteredName__r;
        this.capMan__Registered_Investor_ID__c = capMan__Registered_Investor_ID__c;
        this.capMan__Registration_Fees__c = capMan__Registration_Fees__c;
        this.capMan__RegrantDate__c = capMan__RegrantDate__c;
        this.capMan__Regrant_Amount__c = capMan__Regrant_Amount__c;
        this.capMan__Remaining_As_Converted__c = capMan__Remaining_As_Converted__c;
        this.capMan__Remaining_Life__c = capMan__Remaining_Life__c;
        this.capMan__Remaining_Shares__c = capMan__Remaining_Shares__c;
        this.capMan__RepurchasedShares__c = capMan__RepurchasedShares__c;
        this.capMan__RiskFreeRate__c = capMan__RiskFreeRate__c;
        this.capMan__Rule144StartDate__c = capMan__Rule144StartDate__c;
        this.capMan__SchedVestingMonths__c = capMan__SchedVestingMonths__c;
        this.capMan__Scheduled_Shares__c = capMan__Scheduled_Shares__c;
        this.capMan__SecurityName__c = capMan__SecurityName__c;
        this.capMan__SecurityType__c = capMan__SecurityType__c;
        this.capMan__Security_ID__c = capMan__Security_ID__c;
        this.capMan__Security_Issued__c = capMan__Security_Issued__c;
        this.capMan__Security_Type_Import__c = capMan__Security_Type_Import__c;
        this.capMan__Security__c = capMan__Security__c;
        this.capMan__Security__r = capMan__Security__r;
        this.capMan__SharePrice2__c = capMan__SharePrice2__c;
        this.capMan__SharePrice__c = capMan__SharePrice__c;
        this.capMan__Shares__c = capMan__Shares__c;
        this.capMan__StartDate__c = capMan__StartDate__c;
        this.capMan__TotalConvertedShares__c = capMan__TotalConvertedShares__c;
        this.capMan__TotalRemovedShares__c = capMan__TotalRemovedShares__c;
        this.capMan__TransactionDate__c = capMan__TransactionDate__c;
        this.capMan__Transaction_ID__c = capMan__Transaction_ID__c;
        this.capMan__Transaction_Lots1__r = capMan__Transaction_Lots1__r;
        this.capMan__Transaction_Lots2__r = capMan__Transaction_Lots2__r;
        this.capMan__Transferred_Total__c = capMan__Transferred_Total__c;
        this.capMan__UpdateOnly__c = capMan__UpdateOnly__c;
        this.capMan__Vested_Shares__c = capMan__Vested_Shares__c;
        this.capMan__VestingLengthCalc__c = capMan__VestingLengthCalc__c;
        this.capMan__VestingPeriodLength__c = capMan__VestingPeriodLength__c;
        this.capMan__VestingPeriodUnitsCalc__c = capMan__VestingPeriodUnitsCalc__c;
        this.capMan__VestingPeriodUnits__c = capMan__VestingPeriodUnits__c;
        this.capMan__VestingSchedule__c = capMan__VestingSchedule__c;
        this.capMan__VestingStartDate__c = capMan__VestingStartDate__c;
        this.capMan__Volatility__c = capMan__Volatility__c;
        this.capMan__checksum__c = capMan__checksum__c;
        this.capMan__processed_by_payout__c = capMan__processed_by_payout__c;
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
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Gets the activityHistories value for this CapMan__SecurityTransaction__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__SecurityTransaction__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__SecurityTransaction__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__SecurityTransaction__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Accrued_Interest__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Accrued_Interest__c
     */
    public java.lang.Double getCapMan__Accrued_Interest__c() {
        return capMan__Accrued_Interest__c;
    }


    /**
     * Sets the capMan__Accrued_Interest__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Accrued_Interest__c
     */
    public void setCapMan__Accrued_Interest__c(java.lang.Double capMan__Accrued_Interest__c) {
        this.capMan__Accrued_Interest__c = capMan__Accrued_Interest__c;
    }


    /**
     * Gets the capMan__Action__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Action__c
     */
    public java.lang.String getCapMan__Action__c() {
        return capMan__Action__c;
    }


    /**
     * Sets the capMan__Action__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Action__c
     */
    public void setCapMan__Action__c(java.lang.String capMan__Action__c) {
        this.capMan__Action__c = capMan__Action__c;
    }


    /**
     * Gets the capMan__AfterTaxInterestPayable__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__AfterTaxInterestPayable__c
     */
    public java.lang.Double getCapMan__AfterTaxInterestPayable__c() {
        return capMan__AfterTaxInterestPayable__c;
    }


    /**
     * Sets the capMan__AfterTaxInterestPayable__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__AfterTaxInterestPayable__c
     */
    public void setCapMan__AfterTaxInterestPayable__c(java.lang.Double capMan__AfterTaxInterestPayable__c) {
        this.capMan__AfterTaxInterestPayable__c = capMan__AfterTaxInterestPayable__c;
    }


    /**
     * Gets the capMan__Amount_Converted__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Amount_Converted__c
     */
    public java.lang.Double getCapMan__Amount_Converted__c() {
        return capMan__Amount_Converted__c;
    }


    /**
     * Sets the capMan__Amount_Converted__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Amount_Converted__c
     */
    public void setCapMan__Amount_Converted__c(java.lang.Double capMan__Amount_Converted__c) {
        this.capMan__Amount_Converted__c = capMan__Amount_Converted__c;
    }


    /**
     * Gets the capMan__Amount_Redeemed__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Amount_Redeemed__c
     */
    public java.lang.Double getCapMan__Amount_Redeemed__c() {
        return capMan__Amount_Redeemed__c;
    }


    /**
     * Sets the capMan__Amount_Redeemed__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Amount_Redeemed__c
     */
    public void setCapMan__Amount_Redeemed__c(java.lang.Double capMan__Amount_Redeemed__c) {
        this.capMan__Amount_Redeemed__c = capMan__Amount_Redeemed__c;
    }


    /**
     * Gets the capMan__Amount_Remaining__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Amount_Remaining__c
     */
    public java.lang.Double getCapMan__Amount_Remaining__c() {
        return capMan__Amount_Remaining__c;
    }


    /**
     * Sets the capMan__Amount_Remaining__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Amount_Remaining__c
     */
    public void setCapMan__Amount_Remaining__c(java.lang.Double capMan__Amount_Remaining__c) {
        this.capMan__Amount_Remaining__c = capMan__Amount_Remaining__c;
    }


    /**
     * Gets the capMan__Amount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Amount__c
     */
    public java.lang.Double getCapMan__Amount__c() {
        return capMan__Amount__c;
    }


    /**
     * Sets the capMan__Amount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Amount__c
     */
    public void setCapMan__Amount__c(java.lang.Double capMan__Amount__c) {
        this.capMan__Amount__c = capMan__Amount__c;
    }


    /**
     * Gets the capMan__AvailableSharesToVest__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__AvailableSharesToVest__c
     */
    public java.lang.Double getCapMan__AvailableSharesToVest__c() {
        return capMan__AvailableSharesToVest__c;
    }


    /**
     * Sets the capMan__AvailableSharesToVest__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__AvailableSharesToVest__c
     */
    public void setCapMan__AvailableSharesToVest__c(java.lang.Double capMan__AvailableSharesToVest__c) {
        this.capMan__AvailableSharesToVest__c = capMan__AvailableSharesToVest__c;
    }


    /**
     * Gets the capMan__BinomialValue__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__BinomialValue__c
     */
    public java.lang.Double getCapMan__BinomialValue__c() {
        return capMan__BinomialValue__c;
    }


    /**
     * Sets the capMan__BinomialValue__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__BinomialValue__c
     */
    public void setCapMan__BinomialValue__c(java.lang.Double capMan__BinomialValue__c) {
        this.capMan__BinomialValue__c = capMan__BinomialValue__c;
    }


    /**
     * Gets the capMan__Cancelled_Derivatives__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Cancelled_Derivatives__c
     */
    public java.lang.Double getCapMan__Cancelled_Derivatives__c() {
        return capMan__Cancelled_Derivatives__c;
    }


    /**
     * Sets the capMan__Cancelled_Derivatives__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Cancelled_Derivatives__c
     */
    public void setCapMan__Cancelled_Derivatives__c(java.lang.Double capMan__Cancelled_Derivatives__c) {
        this.capMan__Cancelled_Derivatives__c = capMan__Cancelled_Derivatives__c;
    }


    /**
     * Gets the capMan__CaptureRepriceExpense__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__CaptureRepriceExpense__c
     */
    public java.lang.String getCapMan__CaptureRepriceExpense__c() {
        return capMan__CaptureRepriceExpense__c;
    }


    /**
     * Sets the capMan__CaptureRepriceExpense__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__CaptureRepriceExpense__c
     */
    public void setCapMan__CaptureRepriceExpense__c(java.lang.String capMan__CaptureRepriceExpense__c) {
        this.capMan__CaptureRepriceExpense__c = capMan__CaptureRepriceExpense__c;
    }


    /**
     * Gets the capMan__Carry_Forward_Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Carry_Forward_Date__c
     */
    public java.util.Date getCapMan__Carry_Forward_Date__c() {
        return capMan__Carry_Forward_Date__c;
    }


    /**
     * Sets the capMan__Carry_Forward_Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Carry_Forward_Date__c
     */
    public void setCapMan__Carry_Forward_Date__c(java.util.Date capMan__Carry_Forward_Date__c) {
        this.capMan__Carry_Forward_Date__c = capMan__Carry_Forward_Date__c;
    }


    /**
     * Gets the capMan__Certificate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Certificate__c
     */
    public java.lang.String getCapMan__Certificate__c() {
        return capMan__Certificate__c;
    }


    /**
     * Sets the capMan__Certificate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Certificate__c
     */
    public void setCapMan__Certificate__c(java.lang.String capMan__Certificate__c) {
        this.capMan__Certificate__c = capMan__Certificate__c;
    }


    /**
     * Gets the capMan__CliffLength__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__CliffLength__c
     */
    public java.lang.Double getCapMan__CliffLength__c() {
        return capMan__CliffLength__c;
    }


    /**
     * Sets the capMan__CliffLength__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__CliffLength__c
     */
    public void setCapMan__CliffLength__c(java.lang.Double capMan__CliffLength__c) {
        this.capMan__CliffLength__c = capMan__CliffLength__c;
    }


    /**
     * Gets the capMan__Cliff_Length_Calc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Cliff_Length_Calc__c
     */
    public java.lang.Double getCapMan__Cliff_Length_Calc__c() {
        return capMan__Cliff_Length_Calc__c;
    }


    /**
     * Sets the capMan__Cliff_Length_Calc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Cliff_Length_Calc__c
     */
    public void setCapMan__Cliff_Length_Calc__c(java.lang.Double capMan__Cliff_Length_Calc__c) {
        this.capMan__Cliff_Length_Calc__c = capMan__Cliff_Length_Calc__c;
    }


    /**
     * Gets the capMan__ControlChangeAccel__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__ControlChangeAccel__c
     */
    public java.lang.Boolean getCapMan__ControlChangeAccel__c() {
        return capMan__ControlChangeAccel__c;
    }


    /**
     * Sets the capMan__ControlChangeAccel__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__ControlChangeAccel__c
     */
    public void setCapMan__ControlChangeAccel__c(java.lang.Boolean capMan__ControlChangeAccel__c) {
        this.capMan__ControlChangeAccel__c = capMan__ControlChangeAccel__c;
    }


    /**
     * Gets the capMan__Conversion_Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Conversion_Date__c
     */
    public java.util.Date getCapMan__Conversion_Date__c() {
        return capMan__Conversion_Date__c;
    }


    /**
     * Sets the capMan__Conversion_Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Conversion_Date__c
     */
    public void setCapMan__Conversion_Date__c(java.util.Date capMan__Conversion_Date__c) {
        this.capMan__Conversion_Date__c = capMan__Conversion_Date__c;
    }


    /**
     * Gets the capMan__Conversion_Price2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Conversion_Price2__c
     */
    public java.lang.Double getCapMan__Conversion_Price2__c() {
        return capMan__Conversion_Price2__c;
    }


    /**
     * Sets the capMan__Conversion_Price2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Conversion_Price2__c
     */
    public void setCapMan__Conversion_Price2__c(java.lang.Double capMan__Conversion_Price2__c) {
        this.capMan__Conversion_Price2__c = capMan__Conversion_Price2__c;
    }


    /**
     * Gets the capMan__Conversion_Price__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Conversion_Price__c
     */
    public java.lang.Double getCapMan__Conversion_Price__c() {
        return capMan__Conversion_Price__c;
    }


    /**
     * Sets the capMan__Conversion_Price__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Conversion_Price__c
     */
    public void setCapMan__Conversion_Price__c(java.lang.Double capMan__Conversion_Price__c) {
        this.capMan__Conversion_Price__c = capMan__Conversion_Price__c;
    }


    /**
     * Gets the capMan__ConvertedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__ConvertedShares__c
     */
    public java.lang.Double getCapMan__ConvertedShares__c() {
        return capMan__ConvertedShares__c;
    }


    /**
     * Sets the capMan__ConvertedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__ConvertedShares__c
     */
    public void setCapMan__ConvertedShares__c(java.lang.Double capMan__ConvertedShares__c) {
        this.capMan__ConvertedShares__c = capMan__ConvertedShares__c;
    }


    /**
     * Gets the capMan__CounterpartyInvestor__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__CounterpartyInvestor__c
     */
    public java.lang.String getCapMan__CounterpartyInvestor__c() {
        return capMan__CounterpartyInvestor__c;
    }


    /**
     * Sets the capMan__CounterpartyInvestor__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__CounterpartyInvestor__c
     */
    public void setCapMan__CounterpartyInvestor__c(java.lang.String capMan__CounterpartyInvestor__c) {
        this.capMan__CounterpartyInvestor__c = capMan__CounterpartyInvestor__c;
    }


    /**
     * Gets the capMan__CounterpartyInvestor__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__CounterpartyInvestor__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getCapMan__CounterpartyInvestor__r() {
        return capMan__CounterpartyInvestor__r;
    }


    /**
     * Sets the capMan__CounterpartyInvestor__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__CounterpartyInvestor__r
     */
    public void setCapMan__CounterpartyInvestor__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__CounterpartyInvestor__r) {
        this.capMan__CounterpartyInvestor__r = capMan__CounterpartyInvestor__r;
    }


    /**
     * Gets the capMan__Current_Value__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Current_Value__c
     */
    public java.lang.Double getCapMan__Current_Value__c() {
        return capMan__Current_Value__c;
    }


    /**
     * Sets the capMan__Current_Value__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Current_Value__c
     */
    public void setCapMan__Current_Value__c(java.lang.Double capMan__Current_Value__c) {
        this.capMan__Current_Value__c = capMan__Current_Value__c;
    }


    /**
     * Gets the capMan__Date_Diff__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Date_Diff__c
     */
    public java.lang.Double getCapMan__Date_Diff__c() {
        return capMan__Date_Diff__c;
    }


    /**
     * Sets the capMan__Date_Diff__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Date_Diff__c
     */
    public void setCapMan__Date_Diff__c(java.lang.Double capMan__Date_Diff__c) {
        this.capMan__Date_Diff__c = capMan__Date_Diff__c;
    }


    /**
     * Gets the capMan__Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Date__c
     */
    public java.util.Date getCapMan__Date__c() {
        return capMan__Date__c;
    }


    /**
     * Sets the capMan__Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Date__c
     */
    public void setCapMan__Date__c(java.util.Date capMan__Date__c) {
        this.capMan__Date__c = capMan__Date__c;
    }


    /**
     * Gets the capMan__Debt_Transaction_Lots__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Debt_Transaction_Lots__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Debt_Transaction_Lots__r() {
        return capMan__Debt_Transaction_Lots__r;
    }


    /**
     * Sets the capMan__Debt_Transaction_Lots__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Debt_Transaction_Lots__r
     */
    public void setCapMan__Debt_Transaction_Lots__r(com.sforce.soap.enterprise.QueryResult capMan__Debt_Transaction_Lots__r) {
        this.capMan__Debt_Transaction_Lots__r = capMan__Debt_Transaction_Lots__r;
    }


    /**
     * Gets the capMan__Debt_Type__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Debt_Type__c
     */
    public java.lang.String getCapMan__Debt_Type__c() {
        return capMan__Debt_Type__c;
    }


    /**
     * Sets the capMan__Debt_Type__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Debt_Type__c
     */
    public void setCapMan__Debt_Type__c(java.lang.String capMan__Debt_Type__c) {
        this.capMan__Debt_Type__c = capMan__Debt_Type__c;
    }


    /**
     * Gets the capMan__DerivativeTransactionLots__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__DerivativeTransactionLots__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__DerivativeTransactionLots__r() {
        return capMan__DerivativeTransactionLots__r;
    }


    /**
     * Sets the capMan__DerivativeTransactionLots__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__DerivativeTransactionLots__r
     */
    public void setCapMan__DerivativeTransactionLots__r(com.sforce.soap.enterprise.QueryResult capMan__DerivativeTransactionLots__r) {
        this.capMan__DerivativeTransactionLots__r = capMan__DerivativeTransactionLots__r;
    }


    /**
     * Gets the capMan__Due_Diligence_Fees__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Due_Diligence_Fees__c
     */
    public java.lang.Double getCapMan__Due_Diligence_Fees__c() {
        return capMan__Due_Diligence_Fees__c;
    }


    /**
     * Sets the capMan__Due_Diligence_Fees__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Due_Diligence_Fees__c
     */
    public void setCapMan__Due_Diligence_Fees__c(java.lang.Double capMan__Due_Diligence_Fees__c) {
        this.capMan__Due_Diligence_Fees__c = capMan__Due_Diligence_Fees__c;
    }


    /**
     * Gets the capMan__EarlyExercise__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__EarlyExercise__c
     */
    public java.lang.Boolean getCapMan__EarlyExercise__c() {
        return capMan__EarlyExercise__c;
    }


    /**
     * Sets the capMan__EarlyExercise__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__EarlyExercise__c
     */
    public void setCapMan__EarlyExercise__c(java.lang.Boolean capMan__EarlyExercise__c) {
        this.capMan__EarlyExercise__c = capMan__EarlyExercise__c;
    }


    /**
     * Gets the capMan__Equity_Type__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Equity_Type__c
     */
    public java.lang.String getCapMan__Equity_Type__c() {
        return capMan__Equity_Type__c;
    }


    /**
     * Sets the capMan__Equity_Type__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Equity_Type__c
     */
    public void setCapMan__Equity_Type__c(java.lang.String capMan__Equity_Type__c) {
        this.capMan__Equity_Type__c = capMan__Equity_Type__c;
    }


    /**
     * Gets the capMan__Exercisable_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Exercisable_Shares__c
     */
    public java.lang.Double getCapMan__Exercisable_Shares__c() {
        return capMan__Exercisable_Shares__c;
    }


    /**
     * Sets the capMan__Exercisable_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Exercisable_Shares__c
     */
    public void setCapMan__Exercisable_Shares__c(java.lang.Double capMan__Exercisable_Shares__c) {
        this.capMan__Exercisable_Shares__c = capMan__Exercisable_Shares__c;
    }


    /**
     * Gets the capMan__ExercisePrice2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__ExercisePrice2__c
     */
    public java.lang.Double getCapMan__ExercisePrice2__c() {
        return capMan__ExercisePrice2__c;
    }


    /**
     * Sets the capMan__ExercisePrice2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__ExercisePrice2__c
     */
    public void setCapMan__ExercisePrice2__c(java.lang.Double capMan__ExercisePrice2__c) {
        this.capMan__ExercisePrice2__c = capMan__ExercisePrice2__c;
    }


    /**
     * Gets the capMan__ExercisePrice__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__ExercisePrice__c
     */
    public java.lang.Double getCapMan__ExercisePrice__c() {
        return capMan__ExercisePrice__c;
    }


    /**
     * Sets the capMan__ExercisePrice__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__ExercisePrice__c
     */
    public void setCapMan__ExercisePrice__c(java.lang.Double capMan__ExercisePrice__c) {
        this.capMan__ExercisePrice__c = capMan__ExercisePrice__c;
    }


    /**
     * Gets the capMan__Exercised_Derivatives__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Exercised_Derivatives__c
     */
    public java.lang.Double getCapMan__Exercised_Derivatives__c() {
        return capMan__Exercised_Derivatives__c;
    }


    /**
     * Sets the capMan__Exercised_Derivatives__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Exercised_Derivatives__c
     */
    public void setCapMan__Exercised_Derivatives__c(java.lang.Double capMan__Exercised_Derivatives__c) {
        this.capMan__Exercised_Derivatives__c = capMan__Exercised_Derivatives__c;
    }


    /**
     * Gets the capMan__Expiration_Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Expiration_Date__c
     */
    public java.util.Date getCapMan__Expiration_Date__c() {
        return capMan__Expiration_Date__c;
    }


    /**
     * Sets the capMan__Expiration_Date__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Expiration_Date__c
     */
    public void setCapMan__Expiration_Date__c(java.util.Date capMan__Expiration_Date__c) {
        this.capMan__Expiration_Date__c = capMan__Expiration_Date__c;
    }


    /**
     * Gets the capMan__ExpiredDerivatives__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__ExpiredDerivatives__c
     */
    public java.lang.Double getCapMan__ExpiredDerivatives__c() {
        return capMan__ExpiredDerivatives__c;
    }


    /**
     * Sets the capMan__ExpiredDerivatives__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__ExpiredDerivatives__c
     */
    public void setCapMan__ExpiredDerivatives__c(java.lang.Double capMan__ExpiredDerivatives__c) {
        this.capMan__ExpiredDerivatives__c = capMan__ExpiredDerivatives__c;
    }


    /**
     * Gets the capMan__GrantDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__GrantDate__c
     */
    public java.util.Date getCapMan__GrantDate__c() {
        return capMan__GrantDate__c;
    }


    /**
     * Sets the capMan__GrantDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__GrantDate__c
     */
    public void setCapMan__GrantDate__c(java.util.Date capMan__GrantDate__c) {
        this.capMan__GrantDate__c = capMan__GrantDate__c;
    }


    /**
     * Gets the capMan__Grant_Number__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Grant_Number__c
     */
    public java.lang.String getCapMan__Grant_Number__c() {
        return capMan__Grant_Number__c;
    }


    /**
     * Sets the capMan__Grant_Number__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Grant_Number__c
     */
    public void setCapMan__Grant_Number__c(java.lang.String capMan__Grant_Number__c) {
        this.capMan__Grant_Number__c = capMan__Grant_Number__c;
    }


    /**
     * Gets the capMan__ImmediateVesting__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__ImmediateVesting__c
     */
    public java.lang.Double getCapMan__ImmediateVesting__c() {
        return capMan__ImmediateVesting__c;
    }


    /**
     * Sets the capMan__ImmediateVesting__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__ImmediateVesting__c
     */
    public void setCapMan__ImmediateVesting__c(java.lang.Double capMan__ImmediateVesting__c) {
        this.capMan__ImmediateVesting__c = capMan__ImmediateVesting__c;
    }


    /**
     * Gets the capMan__Immediate_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Immediate_Shares__c
     */
    public java.lang.Double getCapMan__Immediate_Shares__c() {
        return capMan__Immediate_Shares__c;
    }


    /**
     * Sets the capMan__Immediate_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Immediate_Shares__c
     */
    public void setCapMan__Immediate_Shares__c(java.lang.Double capMan__Immediate_Shares__c) {
        this.capMan__Immediate_Shares__c = capMan__Immediate_Shares__c;
    }


    /**
     * Gets the capMan__InitialAsConvertedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__InitialAsConvertedShares__c
     */
    public java.lang.Double getCapMan__InitialAsConvertedShares__c() {
        return capMan__InitialAsConvertedShares__c;
    }


    /**
     * Sets the capMan__InitialAsConvertedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__InitialAsConvertedShares__c
     */
    public void setCapMan__InitialAsConvertedShares__c(java.lang.Double capMan__InitialAsConvertedShares__c) {
        this.capMan__InitialAsConvertedShares__c = capMan__InitialAsConvertedShares__c;
    }


    /**
     * Gets the capMan__InterestAmount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__InterestAmount__c
     */
    public java.lang.Double getCapMan__InterestAmount__c() {
        return capMan__InterestAmount__c;
    }


    /**
     * Sets the capMan__InterestAmount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__InterestAmount__c
     */
    public void setCapMan__InterestAmount__c(java.lang.Double capMan__InterestAmount__c) {
        this.capMan__InterestAmount__c = capMan__InterestAmount__c;
    }


    /**
     * Gets the capMan__IssuanceName__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__IssuanceName__c
     */
    public java.lang.String getCapMan__IssuanceName__c() {
        return capMan__IssuanceName__c;
    }


    /**
     * Sets the capMan__IssuanceName__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__IssuanceName__c
     */
    public void setCapMan__IssuanceName__c(java.lang.String capMan__IssuanceName__c) {
        this.capMan__IssuanceName__c = capMan__IssuanceName__c;
    }


    /**
     * Gets the capMan__Issuance__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Issuance__c
     */
    public java.lang.String getCapMan__Issuance__c() {
        return capMan__Issuance__c;
    }


    /**
     * Sets the capMan__Issuance__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Issuance__c
     */
    public void setCapMan__Issuance__c(java.lang.String capMan__Issuance__c) {
        this.capMan__Issuance__c = capMan__Issuance__c;
    }


    /**
     * Gets the capMan__Issuance__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Issuance__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Issuance__c getCapMan__Issuance__r() {
        return capMan__Issuance__r;
    }


    /**
     * Sets the capMan__Issuance__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Issuance__r
     */
    public void setCapMan__Issuance__r(com.sforce.soap.enterprise.sobject.CapMan__Issuance__c capMan__Issuance__r) {
        this.capMan__Issuance__r = capMan__Issuance__r;
    }


    /**
     * Gets the capMan__Issue_Status__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Issue_Status__c
     */
    public java.lang.String getCapMan__Issue_Status__c() {
        return capMan__Issue_Status__c;
    }


    /**
     * Sets the capMan__Issue_Status__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Issue_Status__c
     */
    public void setCapMan__Issue_Status__c(java.lang.String capMan__Issue_Status__c) {
        this.capMan__Issue_Status__c = capMan__Issue_Status__c;
    }


    /**
     * Gets the capMan__Issuer__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Issuer__c
     */
    public java.lang.String getCapMan__Issuer__c() {
        return capMan__Issuer__c;
    }


    /**
     * Sets the capMan__Issuer__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Issuer__c
     */
    public void setCapMan__Issuer__c(java.lang.String capMan__Issuer__c) {
        this.capMan__Issuer__c = capMan__Issuer__c;
    }


    /**
     * Gets the capMan__Issuer__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Issuer__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c getCapMan__Issuer__r() {
        return capMan__Issuer__r;
    }


    /**
     * Sets the capMan__Issuer__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Issuer__r
     */
    public void setCapMan__Issuer__r(com.sforce.soap.enterprise.sobject.CapMan__Capitalization__c capMan__Issuer__r) {
        this.capMan__Issuer__r = capMan__Issuer__r;
    }


    /**
     * Gets the capMan__Issuer_name__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Issuer_name__c
     */
    public java.lang.String getCapMan__Issuer_name__c() {
        return capMan__Issuer_name__c;
    }


    /**
     * Sets the capMan__Issuer_name__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Issuer_name__c
     */
    public void setCapMan__Issuer_name__c(java.lang.String capMan__Issuer_name__c) {
        this.capMan__Issuer_name__c = capMan__Issuer_name__c;
    }


    /**
     * Gets the capMan__LActExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LActExp__c
     */
    public java.lang.Double getCapMan__LActExp__c() {
        return capMan__LActExp__c;
    }


    /**
     * Sets the capMan__LActExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LActExp__c
     */
    public void setCapMan__LActExp__c(java.lang.Double capMan__LActExp__c) {
        this.capMan__LActExp__c = capMan__LActExp__c;
    }


    /**
     * Gets the capMan__LAdjUnamExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LAdjUnamExp__c
     */
    public java.lang.Double getCapMan__LAdjUnamExp__c() {
        return capMan__LAdjUnamExp__c;
    }


    /**
     * Sets the capMan__LAdjUnamExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LAdjUnamExp__c
     */
    public void setCapMan__LAdjUnamExp__c(java.lang.Double capMan__LAdjUnamExp__c) {
        this.capMan__LAdjUnamExp__c = capMan__LAdjUnamExp__c;
    }


    /**
     * Gets the capMan__LExpAdj__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LExpAdj__c
     */
    public java.lang.Double getCapMan__LExpAdj__c() {
        return capMan__LExpAdj__c;
    }


    /**
     * Sets the capMan__LExpAdj__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LExpAdj__c
     */
    public void setCapMan__LExpAdj__c(java.lang.Double capMan__LExpAdj__c) {
        this.capMan__LExpAdj__c = capMan__LExpAdj__c;
    }


    /**
     * Gets the capMan__LOptionValue__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LOptionValue__c
     */
    public java.lang.Double getCapMan__LOptionValue__c() {
        return capMan__LOptionValue__c;
    }


    /**
     * Sets the capMan__LOptionValue__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LOptionValue__c
     */
    public void setCapMan__LOptionValue__c(java.lang.Double capMan__LOptionValue__c) {
        this.capMan__LOptionValue__c = capMan__LOptionValue__c;
    }


    /**
     * Gets the capMan__LPeriodExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LPeriodExp__c
     */
    public java.lang.Double getCapMan__LPeriodExp__c() {
        return capMan__LPeriodExp__c;
    }


    /**
     * Sets the capMan__LPeriodExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LPeriodExp__c
     */
    public void setCapMan__LPeriodExp__c(java.lang.Double capMan__LPeriodExp__c) {
        this.capMan__LPeriodExp__c = capMan__LPeriodExp__c;
    }


    /**
     * Gets the capMan__LPriorAmtExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LPriorAmtExp__c
     */
    public java.lang.Double getCapMan__LPriorAmtExp__c() {
        return capMan__LPriorAmtExp__c;
    }


    /**
     * Sets the capMan__LPriorAmtExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LPriorAmtExp__c
     */
    public void setCapMan__LPriorAmtExp__c(java.lang.Double capMan__LPriorAmtExp__c) {
        this.capMan__LPriorAmtExp__c = capMan__LPriorAmtExp__c;
    }


    /**
     * Gets the capMan__LRegrantCF__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LRegrantCF__c
     */
    public java.lang.Double getCapMan__LRegrantCF__c() {
        return capMan__LRegrantCF__c;
    }


    /**
     * Sets the capMan__LRegrantCF__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LRegrantCF__c
     */
    public void setCapMan__LRegrantCF__c(java.lang.Double capMan__LRegrantCF__c) {
        this.capMan__LRegrantCF__c = capMan__LRegrantCF__c;
    }


    /**
     * Gets the capMan__LUnamExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LUnamExp__c
     */
    public java.lang.Double getCapMan__LUnamExp__c() {
        return capMan__LUnamExp__c;
    }


    /**
     * Sets the capMan__LUnamExp__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LUnamExp__c
     */
    public void setCapMan__LUnamExp__c(java.lang.Double capMan__LUnamExp__c) {
        this.capMan__LUnamExp__c = capMan__LUnamExp__c;
    }


    /**
     * Gets the capMan__LatestTransactionDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__LatestTransactionDate__c
     */
    public java.util.Date getCapMan__LatestTransactionDate__c() {
        return capMan__LatestTransactionDate__c;
    }


    /**
     * Sets the capMan__LatestTransactionDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__LatestTransactionDate__c
     */
    public void setCapMan__LatestTransactionDate__c(java.util.Date capMan__LatestTransactionDate__c) {
        this.capMan__LatestTransactionDate__c = capMan__LatestTransactionDate__c;
    }


    /**
     * Gets the capMan__Legal_Fees__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Legal_Fees__c
     */
    public java.lang.Double getCapMan__Legal_Fees__c() {
        return capMan__Legal_Fees__c;
    }


    /**
     * Sets the capMan__Legal_Fees__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Legal_Fees__c
     */
    public void setCapMan__Legal_Fees__c(java.lang.Double capMan__Legal_Fees__c) {
        this.capMan__Legal_Fees__c = capMan__Legal_Fees__c;
    }


    /**
     * Gets the capMan__Listings__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Listings__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Listings__r() {
        return capMan__Listings__r;
    }


    /**
     * Sets the capMan__Listings__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Listings__r
     */
    public void setCapMan__Listings__r(com.sforce.soap.enterprise.QueryResult capMan__Listings__r) {
        this.capMan__Listings__r = capMan__Listings__r;
    }


    /**
     * Gets the capMan__MandatoryConvertDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__MandatoryConvertDate__c
     */
    public java.util.Date getCapMan__MandatoryConvertDate__c() {
        return capMan__MandatoryConvertDate__c;
    }


    /**
     * Sets the capMan__MandatoryConvertDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__MandatoryConvertDate__c
     */
    public void setCapMan__MandatoryConvertDate__c(java.util.Date capMan__MandatoryConvertDate__c) {
        this.capMan__MandatoryConvertDate__c = capMan__MandatoryConvertDate__c;
    }


    /**
     * Gets the capMan__Milestone_Driver__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Milestone_Driver__c
     */
    public java.lang.String getCapMan__Milestone_Driver__c() {
        return capMan__Milestone_Driver__c;
    }


    /**
     * Sets the capMan__Milestone_Driver__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Milestone_Driver__c
     */
    public void setCapMan__Milestone_Driver__c(java.lang.String capMan__Milestone_Driver__c) {
        this.capMan__Milestone_Driver__c = capMan__Milestone_Driver__c;
    }


    /**
     * Gets the capMan__Milestone_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Milestone_Shares__c
     */
    public java.lang.Double getCapMan__Milestone_Shares__c() {
        return capMan__Milestone_Shares__c;
    }


    /**
     * Sets the capMan__Milestone_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Milestone_Shares__c
     */
    public void setCapMan__Milestone_Shares__c(java.lang.Double capMan__Milestone_Shares__c) {
        this.capMan__Milestone_Shares__c = capMan__Milestone_Shares__c;
    }


    /**
     * Gets the capMan__Milestone_Vesting__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Milestone_Vesting__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Milestone_Vesting__r() {
        return capMan__Milestone_Vesting__r;
    }


    /**
     * Sets the capMan__Milestone_Vesting__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Milestone_Vesting__r
     */
    public void setCapMan__Milestone_Vesting__r(com.sforce.soap.enterprise.QueryResult capMan__Milestone_Vesting__r) {
        this.capMan__Milestone_Vesting__r = capMan__Milestone_Vesting__r;
    }


    /**
     * Gets the capMan__MonthsOfInterest__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__MonthsOfInterest__c
     */
    public java.lang.Double getCapMan__MonthsOfInterest__c() {
        return capMan__MonthsOfInterest__c;
    }


    /**
     * Sets the capMan__MonthsOfInterest__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__MonthsOfInterest__c
     */
    public void setCapMan__MonthsOfInterest__c(java.lang.Double capMan__MonthsOfInterest__c) {
        this.capMan__MonthsOfInterest__c = capMan__MonthsOfInterest__c;
    }


    /**
     * Gets the capMan__NoPricePerShareCheck__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__NoPricePerShareCheck__c
     */
    public java.lang.Boolean getCapMan__NoPricePerShareCheck__c() {
        return capMan__NoPricePerShareCheck__c;
    }


    /**
     * Sets the capMan__NoPricePerShareCheck__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__NoPricePerShareCheck__c
     */
    public void setCapMan__NoPricePerShareCheck__c(java.lang.Boolean capMan__NoPricePerShareCheck__c) {
        this.capMan__NoPricePerShareCheck__c = capMan__NoPricePerShareCheck__c;
    }


    /**
     * Gets the capMan__Note__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Note__c
     */
    public java.lang.String getCapMan__Note__c() {
        return capMan__Note__c;
    }


    /**
     * Sets the capMan__Note__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Note__c
     */
    public void setCapMan__Note__c(java.lang.String capMan__Note__c) {
        this.capMan__Note__c = capMan__Note__c;
    }


    /**
     * Gets the capMan__NumberofTimeSteps__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__NumberofTimeSteps__c
     */
    public java.lang.Double getCapMan__NumberofTimeSteps__c() {
        return capMan__NumberofTimeSteps__c;
    }


    /**
     * Sets the capMan__NumberofTimeSteps__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__NumberofTimeSteps__c
     */
    public void setCapMan__NumberofTimeSteps__c(java.lang.Double capMan__NumberofTimeSteps__c) {
        this.capMan__NumberofTimeSteps__c = capMan__NumberofTimeSteps__c;
    }


    /**
     * Gets the capMan__OldAmount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__OldAmount__c
     */
    public java.lang.Double getCapMan__OldAmount__c() {
        return capMan__OldAmount__c;
    }


    /**
     * Sets the capMan__OldAmount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__OldAmount__c
     */
    public void setCapMan__OldAmount__c(java.lang.Double capMan__OldAmount__c) {
        this.capMan__OldAmount__c = capMan__OldAmount__c;
    }


    /**
     * Gets the capMan__OptionType__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__OptionType__c
     */
    public java.lang.String getCapMan__OptionType__c() {
        return capMan__OptionType__c;
    }


    /**
     * Sets the capMan__OptionType__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__OptionType__c
     */
    public void setCapMan__OptionType__c(java.lang.String capMan__OptionType__c) {
        this.capMan__OptionType__c = capMan__OptionType__c;
    }


    /**
     * Gets the capMan__Option_Calculation_Type__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Option_Calculation_Type__c
     */
    public java.lang.String getCapMan__Option_Calculation_Type__c() {
        return capMan__Option_Calculation_Type__c;
    }


    /**
     * Sets the capMan__Option_Calculation_Type__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Option_Calculation_Type__c
     */
    public void setCapMan__Option_Calculation_Type__c(java.lang.String capMan__Option_Calculation_Type__c) {
        this.capMan__Option_Calculation_Type__c = capMan__Option_Calculation_Type__c;
    }


    /**
     * Gets the capMan__Option_Expenses__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Option_Expenses__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Option_Expenses__r() {
        return capMan__Option_Expenses__r;
    }


    /**
     * Sets the capMan__Option_Expenses__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Option_Expenses__r
     */
    public void setCapMan__Option_Expenses__r(com.sforce.soap.enterprise.QueryResult capMan__Option_Expenses__r) {
        this.capMan__Option_Expenses__r = capMan__Option_Expenses__r;
    }


    /**
     * Gets the capMan__OptionsExpRecord__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__OptionsExpRecord__c
     */
    public java.lang.Double getCapMan__OptionsExpRecord__c() {
        return capMan__OptionsExpRecord__c;
    }


    /**
     * Sets the capMan__OptionsExpRecord__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__OptionsExpRecord__c
     */
    public void setCapMan__OptionsExpRecord__c(java.lang.Double capMan__OptionsExpRecord__c) {
        this.capMan__OptionsExpRecord__c = capMan__OptionsExpRecord__c;
    }


    /**
     * Gets the capMan__Outstanding__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Outstanding__c
     */
    public java.lang.Double getCapMan__Outstanding__c() {
        return capMan__Outstanding__c;
    }


    /**
     * Sets the capMan__Outstanding__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Outstanding__c
     */
    public void setCapMan__Outstanding__c(java.lang.Double capMan__Outstanding__c) {
        this.capMan__Outstanding__c = capMan__Outstanding__c;
    }


    /**
     * Gets the capMan__Parent_Exercise_Price__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Parent_Exercise_Price__c
     */
    public java.lang.Double getCapMan__Parent_Exercise_Price__c() {
        return capMan__Parent_Exercise_Price__c;
    }


    /**
     * Sets the capMan__Parent_Exercise_Price__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Parent_Exercise_Price__c
     */
    public void setCapMan__Parent_Exercise_Price__c(java.lang.Double capMan__Parent_Exercise_Price__c) {
        this.capMan__Parent_Exercise_Price__c = capMan__Parent_Exercise_Price__c;
    }


    /**
     * Gets the capMan__Parent_For_Repriced_Transaction__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Parent_For_Repriced_Transaction__c
     */
    public java.lang.String getCapMan__Parent_For_Repriced_Transaction__c() {
        return capMan__Parent_For_Repriced_Transaction__c;
    }


    /**
     * Sets the capMan__Parent_For_Repriced_Transaction__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Parent_For_Repriced_Transaction__c
     */
    public void setCapMan__Parent_For_Repriced_Transaction__c(java.lang.String capMan__Parent_For_Repriced_Transaction__c) {
        this.capMan__Parent_For_Repriced_Transaction__c = capMan__Parent_For_Repriced_Transaction__c;
    }


    /**
     * Gets the capMan__Parent_For_Repriced_Transaction__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Parent_For_Repriced_Transaction__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c getCapMan__Parent_For_Repriced_Transaction__r() {
        return capMan__Parent_For_Repriced_Transaction__r;
    }


    /**
     * Sets the capMan__Parent_For_Repriced_Transaction__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Parent_For_Repriced_Transaction__r
     */
    public void setCapMan__Parent_For_Repriced_Transaction__r(com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Parent_For_Repriced_Transaction__r) {
        this.capMan__Parent_For_Repriced_Transaction__r = capMan__Parent_For_Repriced_Transaction__r;
    }


    /**
     * Gets the capMan__Parent_For_Repriced_Transactions__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Parent_For_Repriced_Transactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Parent_For_Repriced_Transactions__r() {
        return capMan__Parent_For_Repriced_Transactions__r;
    }


    /**
     * Sets the capMan__Parent_For_Repriced_Transactions__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Parent_For_Repriced_Transactions__r
     */
    public void setCapMan__Parent_For_Repriced_Transactions__r(com.sforce.soap.enterprise.QueryResult capMan__Parent_For_Repriced_Transactions__r) {
        this.capMan__Parent_For_Repriced_Transactions__r = capMan__Parent_For_Repriced_Transactions__r;
    }


    /**
     * Gets the capMan__Parent_GrantDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Parent_GrantDate__c
     */
    public java.util.Date getCapMan__Parent_GrantDate__c() {
        return capMan__Parent_GrantDate__c;
    }


    /**
     * Sets the capMan__Parent_GrantDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Parent_GrantDate__c
     */
    public void setCapMan__Parent_GrantDate__c(java.util.Date capMan__Parent_GrantDate__c) {
        this.capMan__Parent_GrantDate__c = capMan__Parent_GrantDate__c;
    }


    /**
     * Gets the capMan__Parent_GrantNumber__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Parent_GrantNumber__c
     */
    public java.lang.String getCapMan__Parent_GrantNumber__c() {
        return capMan__Parent_GrantNumber__c;
    }


    /**
     * Sets the capMan__Parent_GrantNumber__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Parent_GrantNumber__c
     */
    public void setCapMan__Parent_GrantNumber__c(java.lang.String capMan__Parent_GrantNumber__c) {
        this.capMan__Parent_GrantNumber__c = capMan__Parent_GrantNumber__c;
    }


    /**
     * Gets the capMan__Parent_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Parent_Shares__c
     */
    public java.lang.Double getCapMan__Parent_Shares__c() {
        return capMan__Parent_Shares__c;
    }


    /**
     * Sets the capMan__Parent_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Parent_Shares__c
     */
    public void setCapMan__Parent_Shares__c(java.lang.Double capMan__Parent_Shares__c) {
        this.capMan__Parent_Shares__c = capMan__Parent_Shares__c;
    }


    /**
     * Gets the capMan__Paretn_VestingStartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Paretn_VestingStartDate__c
     */
    public java.util.Date getCapMan__Paretn_VestingStartDate__c() {
        return capMan__Paretn_VestingStartDate__c;
    }


    /**
     * Sets the capMan__Paretn_VestingStartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Paretn_VestingStartDate__c
     */
    public void setCapMan__Paretn_VestingStartDate__c(java.util.Date capMan__Paretn_VestingStartDate__c) {
        this.capMan__Paretn_VestingStartDate__c = capMan__Paretn_VestingStartDate__c;
    }


    /**
     * Gets the capMan__Payoffrank__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Payoffrank__c
     */
    public java.lang.Double getCapMan__Payoffrank__c() {
        return capMan__Payoffrank__c;
    }


    /**
     * Sets the capMan__Payoffrank__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Payoffrank__c
     */
    public void setCapMan__Payoffrank__c(java.lang.Double capMan__Payoffrank__c) {
        this.capMan__Payoffrank__c = capMan__Payoffrank__c;
    }


    /**
     * Gets the capMan__PctImmediateVestingCalc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__PctImmediateVestingCalc__c
     */
    public java.lang.Double getCapMan__PctImmediateVestingCalc__c() {
        return capMan__PctImmediateVestingCalc__c;
    }


    /**
     * Sets the capMan__PctImmediateVestingCalc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__PctImmediateVestingCalc__c
     */
    public void setCapMan__PctImmediateVestingCalc__c(java.lang.Double capMan__PctImmediateVestingCalc__c) {
        this.capMan__PctImmediateVestingCalc__c = capMan__PctImmediateVestingCalc__c;
    }


    /**
     * Gets the capMan__Price2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Price2__c
     */
    public java.lang.Double getCapMan__Price2__c() {
        return capMan__Price2__c;
    }


    /**
     * Sets the capMan__Price2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Price2__c
     */
    public void setCapMan__Price2__c(java.lang.Double capMan__Price2__c) {
        this.capMan__Price2__c = capMan__Price2__c;
    }


    /**
     * Gets the capMan__Price__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Price__c
     */
    public java.lang.Double getCapMan__Price__c() {
        return capMan__Price__c;
    }


    /**
     * Sets the capMan__Price__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Price__c
     */
    public void setCapMan__Price__c(java.lang.Double capMan__Price__c) {
        this.capMan__Price__c = capMan__Price__c;
    }


    /**
     * Gets the capMan__PriorRegrantCarryForward__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__PriorRegrantCarryForward__c
     */
    public java.lang.Double getCapMan__PriorRegrantCarryForward__c() {
        return capMan__PriorRegrantCarryForward__c;
    }


    /**
     * Sets the capMan__PriorRegrantCarryForward__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__PriorRegrantCarryForward__c
     */
    public void setCapMan__PriorRegrantCarryForward__c(java.lang.Double capMan__PriorRegrantCarryForward__c) {
        this.capMan__PriorRegrantCarryForward__c = capMan__PriorRegrantCarryForward__c;
    }


    /**
     * Gets the capMan__RN_Lookup__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__RN_Lookup__c
     */
    public java.lang.String getCapMan__RN_Lookup__c() {
        return capMan__RN_Lookup__c;
    }


    /**
     * Sets the capMan__RN_Lookup__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__RN_Lookup__c
     */
    public void setCapMan__RN_Lookup__c(java.lang.String capMan__RN_Lookup__c) {
        this.capMan__RN_Lookup__c = capMan__RN_Lookup__c;
    }


    /**
     * Gets the capMan__Ratio_Vested__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Ratio_Vested__c
     */
    public java.lang.Double getCapMan__Ratio_Vested__c() {
        return capMan__Ratio_Vested__c;
    }


    /**
     * Sets the capMan__Ratio_Vested__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Ratio_Vested__c
     */
    public void setCapMan__Ratio_Vested__c(java.lang.Double capMan__Ratio_Vested__c) {
        this.capMan__Ratio_Vested__c = capMan__Ratio_Vested__c;
    }


    /**
     * Gets the capMan__Register_Investor_Name__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Register_Investor_Name__c
     */
    public java.lang.String getCapMan__Register_Investor_Name__c() {
        return capMan__Register_Investor_Name__c;
    }


    /**
     * Sets the capMan__Register_Investor_Name__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Register_Investor_Name__c
     */
    public void setCapMan__Register_Investor_Name__c(java.lang.String capMan__Register_Investor_Name__c) {
        this.capMan__Register_Investor_Name__c = capMan__Register_Investor_Name__c;
    }


    /**
     * Gets the capMan__RegisteredName__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__RegisteredName__c
     */
    public java.lang.String getCapMan__RegisteredName__c() {
        return capMan__RegisteredName__c;
    }


    /**
     * Sets the capMan__RegisteredName__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__RegisteredName__c
     */
    public void setCapMan__RegisteredName__c(java.lang.String capMan__RegisteredName__c) {
        this.capMan__RegisteredName__c = capMan__RegisteredName__c;
    }


    /**
     * Gets the capMan__RegisteredName__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__RegisteredName__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getCapMan__RegisteredName__r() {
        return capMan__RegisteredName__r;
    }


    /**
     * Sets the capMan__RegisteredName__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__RegisteredName__r
     */
    public void setCapMan__RegisteredName__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__RegisteredName__r) {
        this.capMan__RegisteredName__r = capMan__RegisteredName__r;
    }


    /**
     * Gets the capMan__Registered_Investor_ID__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Registered_Investor_ID__c
     */
    public java.lang.String getCapMan__Registered_Investor_ID__c() {
        return capMan__Registered_Investor_ID__c;
    }


    /**
     * Sets the capMan__Registered_Investor_ID__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Registered_Investor_ID__c
     */
    public void setCapMan__Registered_Investor_ID__c(java.lang.String capMan__Registered_Investor_ID__c) {
        this.capMan__Registered_Investor_ID__c = capMan__Registered_Investor_ID__c;
    }


    /**
     * Gets the capMan__Registration_Fees__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Registration_Fees__c
     */
    public java.lang.Double getCapMan__Registration_Fees__c() {
        return capMan__Registration_Fees__c;
    }


    /**
     * Sets the capMan__Registration_Fees__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Registration_Fees__c
     */
    public void setCapMan__Registration_Fees__c(java.lang.Double capMan__Registration_Fees__c) {
        this.capMan__Registration_Fees__c = capMan__Registration_Fees__c;
    }


    /**
     * Gets the capMan__RegrantDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__RegrantDate__c
     */
    public java.util.Date getCapMan__RegrantDate__c() {
        return capMan__RegrantDate__c;
    }


    /**
     * Sets the capMan__RegrantDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__RegrantDate__c
     */
    public void setCapMan__RegrantDate__c(java.util.Date capMan__RegrantDate__c) {
        this.capMan__RegrantDate__c = capMan__RegrantDate__c;
    }


    /**
     * Gets the capMan__Regrant_Amount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Regrant_Amount__c
     */
    public java.lang.Double getCapMan__Regrant_Amount__c() {
        return capMan__Regrant_Amount__c;
    }


    /**
     * Sets the capMan__Regrant_Amount__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Regrant_Amount__c
     */
    public void setCapMan__Regrant_Amount__c(java.lang.Double capMan__Regrant_Amount__c) {
        this.capMan__Regrant_Amount__c = capMan__Regrant_Amount__c;
    }


    /**
     * Gets the capMan__Remaining_As_Converted__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Remaining_As_Converted__c
     */
    public java.lang.Double getCapMan__Remaining_As_Converted__c() {
        return capMan__Remaining_As_Converted__c;
    }


    /**
     * Sets the capMan__Remaining_As_Converted__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Remaining_As_Converted__c
     */
    public void setCapMan__Remaining_As_Converted__c(java.lang.Double capMan__Remaining_As_Converted__c) {
        this.capMan__Remaining_As_Converted__c = capMan__Remaining_As_Converted__c;
    }


    /**
     * Gets the capMan__Remaining_Life__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Remaining_Life__c
     */
    public java.lang.Double getCapMan__Remaining_Life__c() {
        return capMan__Remaining_Life__c;
    }


    /**
     * Sets the capMan__Remaining_Life__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Remaining_Life__c
     */
    public void setCapMan__Remaining_Life__c(java.lang.Double capMan__Remaining_Life__c) {
        this.capMan__Remaining_Life__c = capMan__Remaining_Life__c;
    }


    /**
     * Gets the capMan__Remaining_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Remaining_Shares__c
     */
    public java.lang.Double getCapMan__Remaining_Shares__c() {
        return capMan__Remaining_Shares__c;
    }


    /**
     * Sets the capMan__Remaining_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Remaining_Shares__c
     */
    public void setCapMan__Remaining_Shares__c(java.lang.Double capMan__Remaining_Shares__c) {
        this.capMan__Remaining_Shares__c = capMan__Remaining_Shares__c;
    }


    /**
     * Gets the capMan__RepurchasedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__RepurchasedShares__c
     */
    public java.lang.Double getCapMan__RepurchasedShares__c() {
        return capMan__RepurchasedShares__c;
    }


    /**
     * Sets the capMan__RepurchasedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__RepurchasedShares__c
     */
    public void setCapMan__RepurchasedShares__c(java.lang.Double capMan__RepurchasedShares__c) {
        this.capMan__RepurchasedShares__c = capMan__RepurchasedShares__c;
    }


    /**
     * Gets the capMan__RiskFreeRate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__RiskFreeRate__c
     */
    public java.lang.Double getCapMan__RiskFreeRate__c() {
        return capMan__RiskFreeRate__c;
    }


    /**
     * Sets the capMan__RiskFreeRate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__RiskFreeRate__c
     */
    public void setCapMan__RiskFreeRate__c(java.lang.Double capMan__RiskFreeRate__c) {
        this.capMan__RiskFreeRate__c = capMan__RiskFreeRate__c;
    }


    /**
     * Gets the capMan__Rule144StartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Rule144StartDate__c
     */
    public java.util.Date getCapMan__Rule144StartDate__c() {
        return capMan__Rule144StartDate__c;
    }


    /**
     * Sets the capMan__Rule144StartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Rule144StartDate__c
     */
    public void setCapMan__Rule144StartDate__c(java.util.Date capMan__Rule144StartDate__c) {
        this.capMan__Rule144StartDate__c = capMan__Rule144StartDate__c;
    }


    /**
     * Gets the capMan__SchedVestingMonths__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__SchedVestingMonths__c
     */
    public java.lang.Double getCapMan__SchedVestingMonths__c() {
        return capMan__SchedVestingMonths__c;
    }


    /**
     * Sets the capMan__SchedVestingMonths__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__SchedVestingMonths__c
     */
    public void setCapMan__SchedVestingMonths__c(java.lang.Double capMan__SchedVestingMonths__c) {
        this.capMan__SchedVestingMonths__c = capMan__SchedVestingMonths__c;
    }


    /**
     * Gets the capMan__Scheduled_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Scheduled_Shares__c
     */
    public java.lang.Double getCapMan__Scheduled_Shares__c() {
        return capMan__Scheduled_Shares__c;
    }


    /**
     * Sets the capMan__Scheduled_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Scheduled_Shares__c
     */
    public void setCapMan__Scheduled_Shares__c(java.lang.Double capMan__Scheduled_Shares__c) {
        this.capMan__Scheduled_Shares__c = capMan__Scheduled_Shares__c;
    }


    /**
     * Gets the capMan__SecurityName__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__SecurityName__c
     */
    public java.lang.String getCapMan__SecurityName__c() {
        return capMan__SecurityName__c;
    }


    /**
     * Sets the capMan__SecurityName__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__SecurityName__c
     */
    public void setCapMan__SecurityName__c(java.lang.String capMan__SecurityName__c) {
        this.capMan__SecurityName__c = capMan__SecurityName__c;
    }


    /**
     * Gets the capMan__SecurityType__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__SecurityType__c
     */
    public java.lang.String getCapMan__SecurityType__c() {
        return capMan__SecurityType__c;
    }


    /**
     * Sets the capMan__SecurityType__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__SecurityType__c
     */
    public void setCapMan__SecurityType__c(java.lang.String capMan__SecurityType__c) {
        this.capMan__SecurityType__c = capMan__SecurityType__c;
    }


    /**
     * Gets the capMan__Security_ID__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Security_ID__c
     */
    public java.lang.String getCapMan__Security_ID__c() {
        return capMan__Security_ID__c;
    }


    /**
     * Sets the capMan__Security_ID__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Security_ID__c
     */
    public void setCapMan__Security_ID__c(java.lang.String capMan__Security_ID__c) {
        this.capMan__Security_ID__c = capMan__Security_ID__c;
    }


    /**
     * Gets the capMan__Security_Issued__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Security_Issued__c
     */
    public java.lang.String getCapMan__Security_Issued__c() {
        return capMan__Security_Issued__c;
    }


    /**
     * Sets the capMan__Security_Issued__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Security_Issued__c
     */
    public void setCapMan__Security_Issued__c(java.lang.String capMan__Security_Issued__c) {
        this.capMan__Security_Issued__c = capMan__Security_Issued__c;
    }


    /**
     * Gets the capMan__Security_Type_Import__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Security_Type_Import__c
     */
    public java.lang.String getCapMan__Security_Type_Import__c() {
        return capMan__Security_Type_Import__c;
    }


    /**
     * Sets the capMan__Security_Type_Import__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Security_Type_Import__c
     */
    public void setCapMan__Security_Type_Import__c(java.lang.String capMan__Security_Type_Import__c) {
        this.capMan__Security_Type_Import__c = capMan__Security_Type_Import__c;
    }


    /**
     * Gets the capMan__Security__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Security__c
     */
    public java.lang.String getCapMan__Security__c() {
        return capMan__Security__c;
    }


    /**
     * Sets the capMan__Security__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Security__c
     */
    public void setCapMan__Security__c(java.lang.String capMan__Security__c) {
        this.capMan__Security__c = capMan__Security__c;
    }


    /**
     * Gets the capMan__Security__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Security__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Security__c getCapMan__Security__r() {
        return capMan__Security__r;
    }


    /**
     * Sets the capMan__Security__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Security__r
     */
    public void setCapMan__Security__r(com.sforce.soap.enterprise.sobject.CapMan__Security__c capMan__Security__r) {
        this.capMan__Security__r = capMan__Security__r;
    }


    /**
     * Gets the capMan__SharePrice2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__SharePrice2__c
     */
    public java.lang.Double getCapMan__SharePrice2__c() {
        return capMan__SharePrice2__c;
    }


    /**
     * Sets the capMan__SharePrice2__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__SharePrice2__c
     */
    public void setCapMan__SharePrice2__c(java.lang.Double capMan__SharePrice2__c) {
        this.capMan__SharePrice2__c = capMan__SharePrice2__c;
    }


    /**
     * Gets the capMan__SharePrice__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__SharePrice__c
     */
    public java.lang.Double getCapMan__SharePrice__c() {
        return capMan__SharePrice__c;
    }


    /**
     * Sets the capMan__SharePrice__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__SharePrice__c
     */
    public void setCapMan__SharePrice__c(java.lang.Double capMan__SharePrice__c) {
        this.capMan__SharePrice__c = capMan__SharePrice__c;
    }


    /**
     * Gets the capMan__Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Shares__c
     */
    public java.lang.Double getCapMan__Shares__c() {
        return capMan__Shares__c;
    }


    /**
     * Sets the capMan__Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Shares__c
     */
    public void setCapMan__Shares__c(java.lang.Double capMan__Shares__c) {
        this.capMan__Shares__c = capMan__Shares__c;
    }


    /**
     * Gets the capMan__StartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__StartDate__c
     */
    public java.util.Date getCapMan__StartDate__c() {
        return capMan__StartDate__c;
    }


    /**
     * Sets the capMan__StartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__StartDate__c
     */
    public void setCapMan__StartDate__c(java.util.Date capMan__StartDate__c) {
        this.capMan__StartDate__c = capMan__StartDate__c;
    }


    /**
     * Gets the capMan__TotalConvertedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__TotalConvertedShares__c
     */
    public java.lang.Double getCapMan__TotalConvertedShares__c() {
        return capMan__TotalConvertedShares__c;
    }


    /**
     * Sets the capMan__TotalConvertedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__TotalConvertedShares__c
     */
    public void setCapMan__TotalConvertedShares__c(java.lang.Double capMan__TotalConvertedShares__c) {
        this.capMan__TotalConvertedShares__c = capMan__TotalConvertedShares__c;
    }


    /**
     * Gets the capMan__TotalRemovedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__TotalRemovedShares__c
     */
    public java.lang.Double getCapMan__TotalRemovedShares__c() {
        return capMan__TotalRemovedShares__c;
    }


    /**
     * Sets the capMan__TotalRemovedShares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__TotalRemovedShares__c
     */
    public void setCapMan__TotalRemovedShares__c(java.lang.Double capMan__TotalRemovedShares__c) {
        this.capMan__TotalRemovedShares__c = capMan__TotalRemovedShares__c;
    }


    /**
     * Gets the capMan__TransactionDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__TransactionDate__c
     */
    public java.util.Date getCapMan__TransactionDate__c() {
        return capMan__TransactionDate__c;
    }


    /**
     * Sets the capMan__TransactionDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__TransactionDate__c
     */
    public void setCapMan__TransactionDate__c(java.util.Date capMan__TransactionDate__c) {
        this.capMan__TransactionDate__c = capMan__TransactionDate__c;
    }


    /**
     * Gets the capMan__Transaction_ID__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Transaction_ID__c
     */
    public java.lang.String getCapMan__Transaction_ID__c() {
        return capMan__Transaction_ID__c;
    }


    /**
     * Sets the capMan__Transaction_ID__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Transaction_ID__c
     */
    public void setCapMan__Transaction_ID__c(java.lang.String capMan__Transaction_ID__c) {
        this.capMan__Transaction_ID__c = capMan__Transaction_ID__c;
    }


    /**
     * Gets the capMan__Transaction_Lots1__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Transaction_Lots1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Transaction_Lots1__r() {
        return capMan__Transaction_Lots1__r;
    }


    /**
     * Sets the capMan__Transaction_Lots1__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Transaction_Lots1__r
     */
    public void setCapMan__Transaction_Lots1__r(com.sforce.soap.enterprise.QueryResult capMan__Transaction_Lots1__r) {
        this.capMan__Transaction_Lots1__r = capMan__Transaction_Lots1__r;
    }


    /**
     * Gets the capMan__Transaction_Lots2__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Transaction_Lots2__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Transaction_Lots2__r() {
        return capMan__Transaction_Lots2__r;
    }


    /**
     * Sets the capMan__Transaction_Lots2__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Transaction_Lots2__r
     */
    public void setCapMan__Transaction_Lots2__r(com.sforce.soap.enterprise.QueryResult capMan__Transaction_Lots2__r) {
        this.capMan__Transaction_Lots2__r = capMan__Transaction_Lots2__r;
    }


    /**
     * Gets the capMan__Transferred_Total__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Transferred_Total__c
     */
    public java.lang.Double getCapMan__Transferred_Total__c() {
        return capMan__Transferred_Total__c;
    }


    /**
     * Sets the capMan__Transferred_Total__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Transferred_Total__c
     */
    public void setCapMan__Transferred_Total__c(java.lang.Double capMan__Transferred_Total__c) {
        this.capMan__Transferred_Total__c = capMan__Transferred_Total__c;
    }


    /**
     * Gets the capMan__UpdateOnly__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__UpdateOnly__c
     */
    public java.lang.Boolean getCapMan__UpdateOnly__c() {
        return capMan__UpdateOnly__c;
    }


    /**
     * Sets the capMan__UpdateOnly__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__UpdateOnly__c
     */
    public void setCapMan__UpdateOnly__c(java.lang.Boolean capMan__UpdateOnly__c) {
        this.capMan__UpdateOnly__c = capMan__UpdateOnly__c;
    }


    /**
     * Gets the capMan__Vested_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Vested_Shares__c
     */
    public java.lang.Double getCapMan__Vested_Shares__c() {
        return capMan__Vested_Shares__c;
    }


    /**
     * Sets the capMan__Vested_Shares__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Vested_Shares__c
     */
    public void setCapMan__Vested_Shares__c(java.lang.Double capMan__Vested_Shares__c) {
        this.capMan__Vested_Shares__c = capMan__Vested_Shares__c;
    }


    /**
     * Gets the capMan__VestingLengthCalc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__VestingLengthCalc__c
     */
    public java.lang.Double getCapMan__VestingLengthCalc__c() {
        return capMan__VestingLengthCalc__c;
    }


    /**
     * Sets the capMan__VestingLengthCalc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__VestingLengthCalc__c
     */
    public void setCapMan__VestingLengthCalc__c(java.lang.Double capMan__VestingLengthCalc__c) {
        this.capMan__VestingLengthCalc__c = capMan__VestingLengthCalc__c;
    }


    /**
     * Gets the capMan__VestingPeriodLength__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__VestingPeriodLength__c
     */
    public java.lang.Double getCapMan__VestingPeriodLength__c() {
        return capMan__VestingPeriodLength__c;
    }


    /**
     * Sets the capMan__VestingPeriodLength__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__VestingPeriodLength__c
     */
    public void setCapMan__VestingPeriodLength__c(java.lang.Double capMan__VestingPeriodLength__c) {
        this.capMan__VestingPeriodLength__c = capMan__VestingPeriodLength__c;
    }


    /**
     * Gets the capMan__VestingPeriodUnitsCalc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__VestingPeriodUnitsCalc__c
     */
    public java.lang.Double getCapMan__VestingPeriodUnitsCalc__c() {
        return capMan__VestingPeriodUnitsCalc__c;
    }


    /**
     * Sets the capMan__VestingPeriodUnitsCalc__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__VestingPeriodUnitsCalc__c
     */
    public void setCapMan__VestingPeriodUnitsCalc__c(java.lang.Double capMan__VestingPeriodUnitsCalc__c) {
        this.capMan__VestingPeriodUnitsCalc__c = capMan__VestingPeriodUnitsCalc__c;
    }


    /**
     * Gets the capMan__VestingPeriodUnits__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__VestingPeriodUnits__c
     */
    public java.lang.String getCapMan__VestingPeriodUnits__c() {
        return capMan__VestingPeriodUnits__c;
    }


    /**
     * Sets the capMan__VestingPeriodUnits__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__VestingPeriodUnits__c
     */
    public void setCapMan__VestingPeriodUnits__c(java.lang.String capMan__VestingPeriodUnits__c) {
        this.capMan__VestingPeriodUnits__c = capMan__VestingPeriodUnits__c;
    }


    /**
     * Gets the capMan__VestingSchedule__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__VestingSchedule__c
     */
    public java.lang.String getCapMan__VestingSchedule__c() {
        return capMan__VestingSchedule__c;
    }


    /**
     * Sets the capMan__VestingSchedule__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__VestingSchedule__c
     */
    public void setCapMan__VestingSchedule__c(java.lang.String capMan__VestingSchedule__c) {
        this.capMan__VestingSchedule__c = capMan__VestingSchedule__c;
    }


    /**
     * Gets the capMan__VestingStartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__VestingStartDate__c
     */
    public java.util.Date getCapMan__VestingStartDate__c() {
        return capMan__VestingStartDate__c;
    }


    /**
     * Sets the capMan__VestingStartDate__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__VestingStartDate__c
     */
    public void setCapMan__VestingStartDate__c(java.util.Date capMan__VestingStartDate__c) {
        this.capMan__VestingStartDate__c = capMan__VestingStartDate__c;
    }


    /**
     * Gets the capMan__Volatility__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__Volatility__c
     */
    public java.lang.Double getCapMan__Volatility__c() {
        return capMan__Volatility__c;
    }


    /**
     * Sets the capMan__Volatility__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__Volatility__c
     */
    public void setCapMan__Volatility__c(java.lang.Double capMan__Volatility__c) {
        this.capMan__Volatility__c = capMan__Volatility__c;
    }


    /**
     * Gets the capMan__checksum__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__checksum__c
     */
    public java.lang.Double getCapMan__checksum__c() {
        return capMan__checksum__c;
    }


    /**
     * Sets the capMan__checksum__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__checksum__c
     */
    public void setCapMan__checksum__c(java.lang.Double capMan__checksum__c) {
        this.capMan__checksum__c = capMan__checksum__c;
    }


    /**
     * Gets the capMan__processed_by_payout__c value for this CapMan__SecurityTransaction__c.
     * 
     * @return capMan__processed_by_payout__c
     */
    public java.lang.Boolean getCapMan__processed_by_payout__c() {
        return capMan__processed_by_payout__c;
    }


    /**
     * Sets the capMan__processed_by_payout__c value for this CapMan__SecurityTransaction__c.
     * 
     * @param capMan__processed_by_payout__c
     */
    public void setCapMan__processed_by_payout__c(java.lang.Boolean capMan__processed_by_payout__c) {
        this.capMan__processed_by_payout__c = capMan__processed_by_payout__c;
    }


    /**
     * Gets the createdBy value for this CapMan__SecurityTransaction__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__SecurityTransaction__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__SecurityTransaction__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__SecurityTransaction__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__SecurityTransaction__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__SecurityTransaction__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__SecurityTransaction__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__SecurityTransaction__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__SecurityTransaction__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__SecurityTransaction__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__SecurityTransaction__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__SecurityTransaction__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CapMan__SecurityTransaction__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__SecurityTransaction__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__SecurityTransaction__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__SecurityTransaction__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__SecurityTransaction__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__SecurityTransaction__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__SecurityTransaction__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__SecurityTransaction__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__SecurityTransaction__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__SecurityTransaction__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__SecurityTransaction__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__SecurityTransaction__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__SecurityTransaction__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__SecurityTransaction__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__SecurityTransaction__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__SecurityTransaction__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__SecurityTransaction__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__SecurityTransaction__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__SecurityTransaction__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__SecurityTransaction__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this CapMan__SecurityTransaction__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__SecurityTransaction__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__SecurityTransaction__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__SecurityTransaction__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__SecurityTransaction__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__SecurityTransaction__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__SecurityTransaction__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__SecurityTransaction__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this CapMan__SecurityTransaction__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this CapMan__SecurityTransaction__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this CapMan__SecurityTransaction__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this CapMan__SecurityTransaction__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the systemModstamp value for this CapMan__SecurityTransaction__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__SecurityTransaction__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__SecurityTransaction__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__SecurityTransaction__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the pcmsys__Journal_Entry_Items__r value for this CapMan__SecurityTransaction__c.
     * 
     * @return pcmsys__Journal_Entry_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Journal_Entry_Items__r() {
        return pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Sets the pcmsys__Journal_Entry_Items__r value for this CapMan__SecurityTransaction__c.
     * 
     * @param pcmsys__Journal_Entry_Items__r
     */
    public void setPcmsys__Journal_Entry_Items__r(com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r) {
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__SecurityTransaction__c)) return false;
        CapMan__SecurityTransaction__c other = (CapMan__SecurityTransaction__c) obj;
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
            ((this.capMan__Accrued_Interest__c==null && other.getCapMan__Accrued_Interest__c()==null) || 
             (this.capMan__Accrued_Interest__c!=null &&
              this.capMan__Accrued_Interest__c.equals(other.getCapMan__Accrued_Interest__c()))) &&
            ((this.capMan__Action__c==null && other.getCapMan__Action__c()==null) || 
             (this.capMan__Action__c!=null &&
              this.capMan__Action__c.equals(other.getCapMan__Action__c()))) &&
            ((this.capMan__AfterTaxInterestPayable__c==null && other.getCapMan__AfterTaxInterestPayable__c()==null) || 
             (this.capMan__AfterTaxInterestPayable__c!=null &&
              this.capMan__AfterTaxInterestPayable__c.equals(other.getCapMan__AfterTaxInterestPayable__c()))) &&
            ((this.capMan__Amount_Converted__c==null && other.getCapMan__Amount_Converted__c()==null) || 
             (this.capMan__Amount_Converted__c!=null &&
              this.capMan__Amount_Converted__c.equals(other.getCapMan__Amount_Converted__c()))) &&
            ((this.capMan__Amount_Redeemed__c==null && other.getCapMan__Amount_Redeemed__c()==null) || 
             (this.capMan__Amount_Redeemed__c!=null &&
              this.capMan__Amount_Redeemed__c.equals(other.getCapMan__Amount_Redeemed__c()))) &&
            ((this.capMan__Amount_Remaining__c==null && other.getCapMan__Amount_Remaining__c()==null) || 
             (this.capMan__Amount_Remaining__c!=null &&
              this.capMan__Amount_Remaining__c.equals(other.getCapMan__Amount_Remaining__c()))) &&
            ((this.capMan__Amount__c==null && other.getCapMan__Amount__c()==null) || 
             (this.capMan__Amount__c!=null &&
              this.capMan__Amount__c.equals(other.getCapMan__Amount__c()))) &&
            ((this.capMan__AvailableSharesToVest__c==null && other.getCapMan__AvailableSharesToVest__c()==null) || 
             (this.capMan__AvailableSharesToVest__c!=null &&
              this.capMan__AvailableSharesToVest__c.equals(other.getCapMan__AvailableSharesToVest__c()))) &&
            ((this.capMan__BinomialValue__c==null && other.getCapMan__BinomialValue__c()==null) || 
             (this.capMan__BinomialValue__c!=null &&
              this.capMan__BinomialValue__c.equals(other.getCapMan__BinomialValue__c()))) &&
            ((this.capMan__Cancelled_Derivatives__c==null && other.getCapMan__Cancelled_Derivatives__c()==null) || 
             (this.capMan__Cancelled_Derivatives__c!=null &&
              this.capMan__Cancelled_Derivatives__c.equals(other.getCapMan__Cancelled_Derivatives__c()))) &&
            ((this.capMan__CaptureRepriceExpense__c==null && other.getCapMan__CaptureRepriceExpense__c()==null) || 
             (this.capMan__CaptureRepriceExpense__c!=null &&
              this.capMan__CaptureRepriceExpense__c.equals(other.getCapMan__CaptureRepriceExpense__c()))) &&
            ((this.capMan__Carry_Forward_Date__c==null && other.getCapMan__Carry_Forward_Date__c()==null) || 
             (this.capMan__Carry_Forward_Date__c!=null &&
              this.capMan__Carry_Forward_Date__c.equals(other.getCapMan__Carry_Forward_Date__c()))) &&
            ((this.capMan__Certificate__c==null && other.getCapMan__Certificate__c()==null) || 
             (this.capMan__Certificate__c!=null &&
              this.capMan__Certificate__c.equals(other.getCapMan__Certificate__c()))) &&
            ((this.capMan__CliffLength__c==null && other.getCapMan__CliffLength__c()==null) || 
             (this.capMan__CliffLength__c!=null &&
              this.capMan__CliffLength__c.equals(other.getCapMan__CliffLength__c()))) &&
            ((this.capMan__Cliff_Length_Calc__c==null && other.getCapMan__Cliff_Length_Calc__c()==null) || 
             (this.capMan__Cliff_Length_Calc__c!=null &&
              this.capMan__Cliff_Length_Calc__c.equals(other.getCapMan__Cliff_Length_Calc__c()))) &&
            ((this.capMan__ControlChangeAccel__c==null && other.getCapMan__ControlChangeAccel__c()==null) || 
             (this.capMan__ControlChangeAccel__c!=null &&
              this.capMan__ControlChangeAccel__c.equals(other.getCapMan__ControlChangeAccel__c()))) &&
            ((this.capMan__Conversion_Date__c==null && other.getCapMan__Conversion_Date__c()==null) || 
             (this.capMan__Conversion_Date__c!=null &&
              this.capMan__Conversion_Date__c.equals(other.getCapMan__Conversion_Date__c()))) &&
            ((this.capMan__Conversion_Price2__c==null && other.getCapMan__Conversion_Price2__c()==null) || 
             (this.capMan__Conversion_Price2__c!=null &&
              this.capMan__Conversion_Price2__c.equals(other.getCapMan__Conversion_Price2__c()))) &&
            ((this.capMan__Conversion_Price__c==null && other.getCapMan__Conversion_Price__c()==null) || 
             (this.capMan__Conversion_Price__c!=null &&
              this.capMan__Conversion_Price__c.equals(other.getCapMan__Conversion_Price__c()))) &&
            ((this.capMan__ConvertedShares__c==null && other.getCapMan__ConvertedShares__c()==null) || 
             (this.capMan__ConvertedShares__c!=null &&
              this.capMan__ConvertedShares__c.equals(other.getCapMan__ConvertedShares__c()))) &&
            ((this.capMan__CounterpartyInvestor__c==null && other.getCapMan__CounterpartyInvestor__c()==null) || 
             (this.capMan__CounterpartyInvestor__c!=null &&
              this.capMan__CounterpartyInvestor__c.equals(other.getCapMan__CounterpartyInvestor__c()))) &&
            ((this.capMan__CounterpartyInvestor__r==null && other.getCapMan__CounterpartyInvestor__r()==null) || 
             (this.capMan__CounterpartyInvestor__r!=null &&
              this.capMan__CounterpartyInvestor__r.equals(other.getCapMan__CounterpartyInvestor__r()))) &&
            ((this.capMan__Current_Value__c==null && other.getCapMan__Current_Value__c()==null) || 
             (this.capMan__Current_Value__c!=null &&
              this.capMan__Current_Value__c.equals(other.getCapMan__Current_Value__c()))) &&
            ((this.capMan__Date_Diff__c==null && other.getCapMan__Date_Diff__c()==null) || 
             (this.capMan__Date_Diff__c!=null &&
              this.capMan__Date_Diff__c.equals(other.getCapMan__Date_Diff__c()))) &&
            ((this.capMan__Date__c==null && other.getCapMan__Date__c()==null) || 
             (this.capMan__Date__c!=null &&
              this.capMan__Date__c.equals(other.getCapMan__Date__c()))) &&
            ((this.capMan__Debt_Transaction_Lots__r==null && other.getCapMan__Debt_Transaction_Lots__r()==null) || 
             (this.capMan__Debt_Transaction_Lots__r!=null &&
              this.capMan__Debt_Transaction_Lots__r.equals(other.getCapMan__Debt_Transaction_Lots__r()))) &&
            ((this.capMan__Debt_Type__c==null && other.getCapMan__Debt_Type__c()==null) || 
             (this.capMan__Debt_Type__c!=null &&
              this.capMan__Debt_Type__c.equals(other.getCapMan__Debt_Type__c()))) &&
            ((this.capMan__DerivativeTransactionLots__r==null && other.getCapMan__DerivativeTransactionLots__r()==null) || 
             (this.capMan__DerivativeTransactionLots__r!=null &&
              this.capMan__DerivativeTransactionLots__r.equals(other.getCapMan__DerivativeTransactionLots__r()))) &&
            ((this.capMan__Due_Diligence_Fees__c==null && other.getCapMan__Due_Diligence_Fees__c()==null) || 
             (this.capMan__Due_Diligence_Fees__c!=null &&
              this.capMan__Due_Diligence_Fees__c.equals(other.getCapMan__Due_Diligence_Fees__c()))) &&
            ((this.capMan__EarlyExercise__c==null && other.getCapMan__EarlyExercise__c()==null) || 
             (this.capMan__EarlyExercise__c!=null &&
              this.capMan__EarlyExercise__c.equals(other.getCapMan__EarlyExercise__c()))) &&
            ((this.capMan__Equity_Type__c==null && other.getCapMan__Equity_Type__c()==null) || 
             (this.capMan__Equity_Type__c!=null &&
              this.capMan__Equity_Type__c.equals(other.getCapMan__Equity_Type__c()))) &&
            ((this.capMan__Exercisable_Shares__c==null && other.getCapMan__Exercisable_Shares__c()==null) || 
             (this.capMan__Exercisable_Shares__c!=null &&
              this.capMan__Exercisable_Shares__c.equals(other.getCapMan__Exercisable_Shares__c()))) &&
            ((this.capMan__ExercisePrice2__c==null && other.getCapMan__ExercisePrice2__c()==null) || 
             (this.capMan__ExercisePrice2__c!=null &&
              this.capMan__ExercisePrice2__c.equals(other.getCapMan__ExercisePrice2__c()))) &&
            ((this.capMan__ExercisePrice__c==null && other.getCapMan__ExercisePrice__c()==null) || 
             (this.capMan__ExercisePrice__c!=null &&
              this.capMan__ExercisePrice__c.equals(other.getCapMan__ExercisePrice__c()))) &&
            ((this.capMan__Exercised_Derivatives__c==null && other.getCapMan__Exercised_Derivatives__c()==null) || 
             (this.capMan__Exercised_Derivatives__c!=null &&
              this.capMan__Exercised_Derivatives__c.equals(other.getCapMan__Exercised_Derivatives__c()))) &&
            ((this.capMan__Expiration_Date__c==null && other.getCapMan__Expiration_Date__c()==null) || 
             (this.capMan__Expiration_Date__c!=null &&
              this.capMan__Expiration_Date__c.equals(other.getCapMan__Expiration_Date__c()))) &&
            ((this.capMan__ExpiredDerivatives__c==null && other.getCapMan__ExpiredDerivatives__c()==null) || 
             (this.capMan__ExpiredDerivatives__c!=null &&
              this.capMan__ExpiredDerivatives__c.equals(other.getCapMan__ExpiredDerivatives__c()))) &&
            ((this.capMan__GrantDate__c==null && other.getCapMan__GrantDate__c()==null) || 
             (this.capMan__GrantDate__c!=null &&
              this.capMan__GrantDate__c.equals(other.getCapMan__GrantDate__c()))) &&
            ((this.capMan__Grant_Number__c==null && other.getCapMan__Grant_Number__c()==null) || 
             (this.capMan__Grant_Number__c!=null &&
              this.capMan__Grant_Number__c.equals(other.getCapMan__Grant_Number__c()))) &&
            ((this.capMan__ImmediateVesting__c==null && other.getCapMan__ImmediateVesting__c()==null) || 
             (this.capMan__ImmediateVesting__c!=null &&
              this.capMan__ImmediateVesting__c.equals(other.getCapMan__ImmediateVesting__c()))) &&
            ((this.capMan__Immediate_Shares__c==null && other.getCapMan__Immediate_Shares__c()==null) || 
             (this.capMan__Immediate_Shares__c!=null &&
              this.capMan__Immediate_Shares__c.equals(other.getCapMan__Immediate_Shares__c()))) &&
            ((this.capMan__InitialAsConvertedShares__c==null && other.getCapMan__InitialAsConvertedShares__c()==null) || 
             (this.capMan__InitialAsConvertedShares__c!=null &&
              this.capMan__InitialAsConvertedShares__c.equals(other.getCapMan__InitialAsConvertedShares__c()))) &&
            ((this.capMan__InterestAmount__c==null && other.getCapMan__InterestAmount__c()==null) || 
             (this.capMan__InterestAmount__c!=null &&
              this.capMan__InterestAmount__c.equals(other.getCapMan__InterestAmount__c()))) &&
            ((this.capMan__IssuanceName__c==null && other.getCapMan__IssuanceName__c()==null) || 
             (this.capMan__IssuanceName__c!=null &&
              this.capMan__IssuanceName__c.equals(other.getCapMan__IssuanceName__c()))) &&
            ((this.capMan__Issuance__c==null && other.getCapMan__Issuance__c()==null) || 
             (this.capMan__Issuance__c!=null &&
              this.capMan__Issuance__c.equals(other.getCapMan__Issuance__c()))) &&
            ((this.capMan__Issuance__r==null && other.getCapMan__Issuance__r()==null) || 
             (this.capMan__Issuance__r!=null &&
              this.capMan__Issuance__r.equals(other.getCapMan__Issuance__r()))) &&
            ((this.capMan__Issue_Status__c==null && other.getCapMan__Issue_Status__c()==null) || 
             (this.capMan__Issue_Status__c!=null &&
              this.capMan__Issue_Status__c.equals(other.getCapMan__Issue_Status__c()))) &&
            ((this.capMan__Issuer__c==null && other.getCapMan__Issuer__c()==null) || 
             (this.capMan__Issuer__c!=null &&
              this.capMan__Issuer__c.equals(other.getCapMan__Issuer__c()))) &&
            ((this.capMan__Issuer__r==null && other.getCapMan__Issuer__r()==null) || 
             (this.capMan__Issuer__r!=null &&
              this.capMan__Issuer__r.equals(other.getCapMan__Issuer__r()))) &&
            ((this.capMan__Issuer_name__c==null && other.getCapMan__Issuer_name__c()==null) || 
             (this.capMan__Issuer_name__c!=null &&
              this.capMan__Issuer_name__c.equals(other.getCapMan__Issuer_name__c()))) &&
            ((this.capMan__LActExp__c==null && other.getCapMan__LActExp__c()==null) || 
             (this.capMan__LActExp__c!=null &&
              this.capMan__LActExp__c.equals(other.getCapMan__LActExp__c()))) &&
            ((this.capMan__LAdjUnamExp__c==null && other.getCapMan__LAdjUnamExp__c()==null) || 
             (this.capMan__LAdjUnamExp__c!=null &&
              this.capMan__LAdjUnamExp__c.equals(other.getCapMan__LAdjUnamExp__c()))) &&
            ((this.capMan__LExpAdj__c==null && other.getCapMan__LExpAdj__c()==null) || 
             (this.capMan__LExpAdj__c!=null &&
              this.capMan__LExpAdj__c.equals(other.getCapMan__LExpAdj__c()))) &&
            ((this.capMan__LOptionValue__c==null && other.getCapMan__LOptionValue__c()==null) || 
             (this.capMan__LOptionValue__c!=null &&
              this.capMan__LOptionValue__c.equals(other.getCapMan__LOptionValue__c()))) &&
            ((this.capMan__LPeriodExp__c==null && other.getCapMan__LPeriodExp__c()==null) || 
             (this.capMan__LPeriodExp__c!=null &&
              this.capMan__LPeriodExp__c.equals(other.getCapMan__LPeriodExp__c()))) &&
            ((this.capMan__LPriorAmtExp__c==null && other.getCapMan__LPriorAmtExp__c()==null) || 
             (this.capMan__LPriorAmtExp__c!=null &&
              this.capMan__LPriorAmtExp__c.equals(other.getCapMan__LPriorAmtExp__c()))) &&
            ((this.capMan__LRegrantCF__c==null && other.getCapMan__LRegrantCF__c()==null) || 
             (this.capMan__LRegrantCF__c!=null &&
              this.capMan__LRegrantCF__c.equals(other.getCapMan__LRegrantCF__c()))) &&
            ((this.capMan__LUnamExp__c==null && other.getCapMan__LUnamExp__c()==null) || 
             (this.capMan__LUnamExp__c!=null &&
              this.capMan__LUnamExp__c.equals(other.getCapMan__LUnamExp__c()))) &&
            ((this.capMan__LatestTransactionDate__c==null && other.getCapMan__LatestTransactionDate__c()==null) || 
             (this.capMan__LatestTransactionDate__c!=null &&
              this.capMan__LatestTransactionDate__c.equals(other.getCapMan__LatestTransactionDate__c()))) &&
            ((this.capMan__Legal_Fees__c==null && other.getCapMan__Legal_Fees__c()==null) || 
             (this.capMan__Legal_Fees__c!=null &&
              this.capMan__Legal_Fees__c.equals(other.getCapMan__Legal_Fees__c()))) &&
            ((this.capMan__Listings__r==null && other.getCapMan__Listings__r()==null) || 
             (this.capMan__Listings__r!=null &&
              this.capMan__Listings__r.equals(other.getCapMan__Listings__r()))) &&
            ((this.capMan__MandatoryConvertDate__c==null && other.getCapMan__MandatoryConvertDate__c()==null) || 
             (this.capMan__MandatoryConvertDate__c!=null &&
              this.capMan__MandatoryConvertDate__c.equals(other.getCapMan__MandatoryConvertDate__c()))) &&
            ((this.capMan__Milestone_Driver__c==null && other.getCapMan__Milestone_Driver__c()==null) || 
             (this.capMan__Milestone_Driver__c!=null &&
              this.capMan__Milestone_Driver__c.equals(other.getCapMan__Milestone_Driver__c()))) &&
            ((this.capMan__Milestone_Shares__c==null && other.getCapMan__Milestone_Shares__c()==null) || 
             (this.capMan__Milestone_Shares__c!=null &&
              this.capMan__Milestone_Shares__c.equals(other.getCapMan__Milestone_Shares__c()))) &&
            ((this.capMan__Milestone_Vesting__r==null && other.getCapMan__Milestone_Vesting__r()==null) || 
             (this.capMan__Milestone_Vesting__r!=null &&
              this.capMan__Milestone_Vesting__r.equals(other.getCapMan__Milestone_Vesting__r()))) &&
            ((this.capMan__MonthsOfInterest__c==null && other.getCapMan__MonthsOfInterest__c()==null) || 
             (this.capMan__MonthsOfInterest__c!=null &&
              this.capMan__MonthsOfInterest__c.equals(other.getCapMan__MonthsOfInterest__c()))) &&
            ((this.capMan__NoPricePerShareCheck__c==null && other.getCapMan__NoPricePerShareCheck__c()==null) || 
             (this.capMan__NoPricePerShareCheck__c!=null &&
              this.capMan__NoPricePerShareCheck__c.equals(other.getCapMan__NoPricePerShareCheck__c()))) &&
            ((this.capMan__Note__c==null && other.getCapMan__Note__c()==null) || 
             (this.capMan__Note__c!=null &&
              this.capMan__Note__c.equals(other.getCapMan__Note__c()))) &&
            ((this.capMan__NumberofTimeSteps__c==null && other.getCapMan__NumberofTimeSteps__c()==null) || 
             (this.capMan__NumberofTimeSteps__c!=null &&
              this.capMan__NumberofTimeSteps__c.equals(other.getCapMan__NumberofTimeSteps__c()))) &&
            ((this.capMan__OldAmount__c==null && other.getCapMan__OldAmount__c()==null) || 
             (this.capMan__OldAmount__c!=null &&
              this.capMan__OldAmount__c.equals(other.getCapMan__OldAmount__c()))) &&
            ((this.capMan__OptionType__c==null && other.getCapMan__OptionType__c()==null) || 
             (this.capMan__OptionType__c!=null &&
              this.capMan__OptionType__c.equals(other.getCapMan__OptionType__c()))) &&
            ((this.capMan__Option_Calculation_Type__c==null && other.getCapMan__Option_Calculation_Type__c()==null) || 
             (this.capMan__Option_Calculation_Type__c!=null &&
              this.capMan__Option_Calculation_Type__c.equals(other.getCapMan__Option_Calculation_Type__c()))) &&
            ((this.capMan__Option_Expenses__r==null && other.getCapMan__Option_Expenses__r()==null) || 
             (this.capMan__Option_Expenses__r!=null &&
              this.capMan__Option_Expenses__r.equals(other.getCapMan__Option_Expenses__r()))) &&
            ((this.capMan__OptionsExpRecord__c==null && other.getCapMan__OptionsExpRecord__c()==null) || 
             (this.capMan__OptionsExpRecord__c!=null &&
              this.capMan__OptionsExpRecord__c.equals(other.getCapMan__OptionsExpRecord__c()))) &&
            ((this.capMan__Outstanding__c==null && other.getCapMan__Outstanding__c()==null) || 
             (this.capMan__Outstanding__c!=null &&
              this.capMan__Outstanding__c.equals(other.getCapMan__Outstanding__c()))) &&
            ((this.capMan__Parent_Exercise_Price__c==null && other.getCapMan__Parent_Exercise_Price__c()==null) || 
             (this.capMan__Parent_Exercise_Price__c!=null &&
              this.capMan__Parent_Exercise_Price__c.equals(other.getCapMan__Parent_Exercise_Price__c()))) &&
            ((this.capMan__Parent_For_Repriced_Transaction__c==null && other.getCapMan__Parent_For_Repriced_Transaction__c()==null) || 
             (this.capMan__Parent_For_Repriced_Transaction__c!=null &&
              this.capMan__Parent_For_Repriced_Transaction__c.equals(other.getCapMan__Parent_For_Repriced_Transaction__c()))) &&
            ((this.capMan__Parent_For_Repriced_Transaction__r==null && other.getCapMan__Parent_For_Repriced_Transaction__r()==null) || 
             (this.capMan__Parent_For_Repriced_Transaction__r!=null &&
              this.capMan__Parent_For_Repriced_Transaction__r.equals(other.getCapMan__Parent_For_Repriced_Transaction__r()))) &&
            ((this.capMan__Parent_For_Repriced_Transactions__r==null && other.getCapMan__Parent_For_Repriced_Transactions__r()==null) || 
             (this.capMan__Parent_For_Repriced_Transactions__r!=null &&
              this.capMan__Parent_For_Repriced_Transactions__r.equals(other.getCapMan__Parent_For_Repriced_Transactions__r()))) &&
            ((this.capMan__Parent_GrantDate__c==null && other.getCapMan__Parent_GrantDate__c()==null) || 
             (this.capMan__Parent_GrantDate__c!=null &&
              this.capMan__Parent_GrantDate__c.equals(other.getCapMan__Parent_GrantDate__c()))) &&
            ((this.capMan__Parent_GrantNumber__c==null && other.getCapMan__Parent_GrantNumber__c()==null) || 
             (this.capMan__Parent_GrantNumber__c!=null &&
              this.capMan__Parent_GrantNumber__c.equals(other.getCapMan__Parent_GrantNumber__c()))) &&
            ((this.capMan__Parent_Shares__c==null && other.getCapMan__Parent_Shares__c()==null) || 
             (this.capMan__Parent_Shares__c!=null &&
              this.capMan__Parent_Shares__c.equals(other.getCapMan__Parent_Shares__c()))) &&
            ((this.capMan__Paretn_VestingStartDate__c==null && other.getCapMan__Paretn_VestingStartDate__c()==null) || 
             (this.capMan__Paretn_VestingStartDate__c!=null &&
              this.capMan__Paretn_VestingStartDate__c.equals(other.getCapMan__Paretn_VestingStartDate__c()))) &&
            ((this.capMan__Payoffrank__c==null && other.getCapMan__Payoffrank__c()==null) || 
             (this.capMan__Payoffrank__c!=null &&
              this.capMan__Payoffrank__c.equals(other.getCapMan__Payoffrank__c()))) &&
            ((this.capMan__PctImmediateVestingCalc__c==null && other.getCapMan__PctImmediateVestingCalc__c()==null) || 
             (this.capMan__PctImmediateVestingCalc__c!=null &&
              this.capMan__PctImmediateVestingCalc__c.equals(other.getCapMan__PctImmediateVestingCalc__c()))) &&
            ((this.capMan__Price2__c==null && other.getCapMan__Price2__c()==null) || 
             (this.capMan__Price2__c!=null &&
              this.capMan__Price2__c.equals(other.getCapMan__Price2__c()))) &&
            ((this.capMan__Price__c==null && other.getCapMan__Price__c()==null) || 
             (this.capMan__Price__c!=null &&
              this.capMan__Price__c.equals(other.getCapMan__Price__c()))) &&
            ((this.capMan__PriorRegrantCarryForward__c==null && other.getCapMan__PriorRegrantCarryForward__c()==null) || 
             (this.capMan__PriorRegrantCarryForward__c!=null &&
              this.capMan__PriorRegrantCarryForward__c.equals(other.getCapMan__PriorRegrantCarryForward__c()))) &&
            ((this.capMan__RN_Lookup__c==null && other.getCapMan__RN_Lookup__c()==null) || 
             (this.capMan__RN_Lookup__c!=null &&
              this.capMan__RN_Lookup__c.equals(other.getCapMan__RN_Lookup__c()))) &&
            ((this.capMan__Ratio_Vested__c==null && other.getCapMan__Ratio_Vested__c()==null) || 
             (this.capMan__Ratio_Vested__c!=null &&
              this.capMan__Ratio_Vested__c.equals(other.getCapMan__Ratio_Vested__c()))) &&
            ((this.capMan__Register_Investor_Name__c==null && other.getCapMan__Register_Investor_Name__c()==null) || 
             (this.capMan__Register_Investor_Name__c!=null &&
              this.capMan__Register_Investor_Name__c.equals(other.getCapMan__Register_Investor_Name__c()))) &&
            ((this.capMan__RegisteredName__c==null && other.getCapMan__RegisteredName__c()==null) || 
             (this.capMan__RegisteredName__c!=null &&
              this.capMan__RegisteredName__c.equals(other.getCapMan__RegisteredName__c()))) &&
            ((this.capMan__RegisteredName__r==null && other.getCapMan__RegisteredName__r()==null) || 
             (this.capMan__RegisteredName__r!=null &&
              this.capMan__RegisteredName__r.equals(other.getCapMan__RegisteredName__r()))) &&
            ((this.capMan__Registered_Investor_ID__c==null && other.getCapMan__Registered_Investor_ID__c()==null) || 
             (this.capMan__Registered_Investor_ID__c!=null &&
              this.capMan__Registered_Investor_ID__c.equals(other.getCapMan__Registered_Investor_ID__c()))) &&
            ((this.capMan__Registration_Fees__c==null && other.getCapMan__Registration_Fees__c()==null) || 
             (this.capMan__Registration_Fees__c!=null &&
              this.capMan__Registration_Fees__c.equals(other.getCapMan__Registration_Fees__c()))) &&
            ((this.capMan__RegrantDate__c==null && other.getCapMan__RegrantDate__c()==null) || 
             (this.capMan__RegrantDate__c!=null &&
              this.capMan__RegrantDate__c.equals(other.getCapMan__RegrantDate__c()))) &&
            ((this.capMan__Regrant_Amount__c==null && other.getCapMan__Regrant_Amount__c()==null) || 
             (this.capMan__Regrant_Amount__c!=null &&
              this.capMan__Regrant_Amount__c.equals(other.getCapMan__Regrant_Amount__c()))) &&
            ((this.capMan__Remaining_As_Converted__c==null && other.getCapMan__Remaining_As_Converted__c()==null) || 
             (this.capMan__Remaining_As_Converted__c!=null &&
              this.capMan__Remaining_As_Converted__c.equals(other.getCapMan__Remaining_As_Converted__c()))) &&
            ((this.capMan__Remaining_Life__c==null && other.getCapMan__Remaining_Life__c()==null) || 
             (this.capMan__Remaining_Life__c!=null &&
              this.capMan__Remaining_Life__c.equals(other.getCapMan__Remaining_Life__c()))) &&
            ((this.capMan__Remaining_Shares__c==null && other.getCapMan__Remaining_Shares__c()==null) || 
             (this.capMan__Remaining_Shares__c!=null &&
              this.capMan__Remaining_Shares__c.equals(other.getCapMan__Remaining_Shares__c()))) &&
            ((this.capMan__RepurchasedShares__c==null && other.getCapMan__RepurchasedShares__c()==null) || 
             (this.capMan__RepurchasedShares__c!=null &&
              this.capMan__RepurchasedShares__c.equals(other.getCapMan__RepurchasedShares__c()))) &&
            ((this.capMan__RiskFreeRate__c==null && other.getCapMan__RiskFreeRate__c()==null) || 
             (this.capMan__RiskFreeRate__c!=null &&
              this.capMan__RiskFreeRate__c.equals(other.getCapMan__RiskFreeRate__c()))) &&
            ((this.capMan__Rule144StartDate__c==null && other.getCapMan__Rule144StartDate__c()==null) || 
             (this.capMan__Rule144StartDate__c!=null &&
              this.capMan__Rule144StartDate__c.equals(other.getCapMan__Rule144StartDate__c()))) &&
            ((this.capMan__SchedVestingMonths__c==null && other.getCapMan__SchedVestingMonths__c()==null) || 
             (this.capMan__SchedVestingMonths__c!=null &&
              this.capMan__SchedVestingMonths__c.equals(other.getCapMan__SchedVestingMonths__c()))) &&
            ((this.capMan__Scheduled_Shares__c==null && other.getCapMan__Scheduled_Shares__c()==null) || 
             (this.capMan__Scheduled_Shares__c!=null &&
              this.capMan__Scheduled_Shares__c.equals(other.getCapMan__Scheduled_Shares__c()))) &&
            ((this.capMan__SecurityName__c==null && other.getCapMan__SecurityName__c()==null) || 
             (this.capMan__SecurityName__c!=null &&
              this.capMan__SecurityName__c.equals(other.getCapMan__SecurityName__c()))) &&
            ((this.capMan__SecurityType__c==null && other.getCapMan__SecurityType__c()==null) || 
             (this.capMan__SecurityType__c!=null &&
              this.capMan__SecurityType__c.equals(other.getCapMan__SecurityType__c()))) &&
            ((this.capMan__Security_ID__c==null && other.getCapMan__Security_ID__c()==null) || 
             (this.capMan__Security_ID__c!=null &&
              this.capMan__Security_ID__c.equals(other.getCapMan__Security_ID__c()))) &&
            ((this.capMan__Security_Issued__c==null && other.getCapMan__Security_Issued__c()==null) || 
             (this.capMan__Security_Issued__c!=null &&
              this.capMan__Security_Issued__c.equals(other.getCapMan__Security_Issued__c()))) &&
            ((this.capMan__Security_Type_Import__c==null && other.getCapMan__Security_Type_Import__c()==null) || 
             (this.capMan__Security_Type_Import__c!=null &&
              this.capMan__Security_Type_Import__c.equals(other.getCapMan__Security_Type_Import__c()))) &&
            ((this.capMan__Security__c==null && other.getCapMan__Security__c()==null) || 
             (this.capMan__Security__c!=null &&
              this.capMan__Security__c.equals(other.getCapMan__Security__c()))) &&
            ((this.capMan__Security__r==null && other.getCapMan__Security__r()==null) || 
             (this.capMan__Security__r!=null &&
              this.capMan__Security__r.equals(other.getCapMan__Security__r()))) &&
            ((this.capMan__SharePrice2__c==null && other.getCapMan__SharePrice2__c()==null) || 
             (this.capMan__SharePrice2__c!=null &&
              this.capMan__SharePrice2__c.equals(other.getCapMan__SharePrice2__c()))) &&
            ((this.capMan__SharePrice__c==null && other.getCapMan__SharePrice__c()==null) || 
             (this.capMan__SharePrice__c!=null &&
              this.capMan__SharePrice__c.equals(other.getCapMan__SharePrice__c()))) &&
            ((this.capMan__Shares__c==null && other.getCapMan__Shares__c()==null) || 
             (this.capMan__Shares__c!=null &&
              this.capMan__Shares__c.equals(other.getCapMan__Shares__c()))) &&
            ((this.capMan__StartDate__c==null && other.getCapMan__StartDate__c()==null) || 
             (this.capMan__StartDate__c!=null &&
              this.capMan__StartDate__c.equals(other.getCapMan__StartDate__c()))) &&
            ((this.capMan__TotalConvertedShares__c==null && other.getCapMan__TotalConvertedShares__c()==null) || 
             (this.capMan__TotalConvertedShares__c!=null &&
              this.capMan__TotalConvertedShares__c.equals(other.getCapMan__TotalConvertedShares__c()))) &&
            ((this.capMan__TotalRemovedShares__c==null && other.getCapMan__TotalRemovedShares__c()==null) || 
             (this.capMan__TotalRemovedShares__c!=null &&
              this.capMan__TotalRemovedShares__c.equals(other.getCapMan__TotalRemovedShares__c()))) &&
            ((this.capMan__TransactionDate__c==null && other.getCapMan__TransactionDate__c()==null) || 
             (this.capMan__TransactionDate__c!=null &&
              this.capMan__TransactionDate__c.equals(other.getCapMan__TransactionDate__c()))) &&
            ((this.capMan__Transaction_ID__c==null && other.getCapMan__Transaction_ID__c()==null) || 
             (this.capMan__Transaction_ID__c!=null &&
              this.capMan__Transaction_ID__c.equals(other.getCapMan__Transaction_ID__c()))) &&
            ((this.capMan__Transaction_Lots1__r==null && other.getCapMan__Transaction_Lots1__r()==null) || 
             (this.capMan__Transaction_Lots1__r!=null &&
              this.capMan__Transaction_Lots1__r.equals(other.getCapMan__Transaction_Lots1__r()))) &&
            ((this.capMan__Transaction_Lots2__r==null && other.getCapMan__Transaction_Lots2__r()==null) || 
             (this.capMan__Transaction_Lots2__r!=null &&
              this.capMan__Transaction_Lots2__r.equals(other.getCapMan__Transaction_Lots2__r()))) &&
            ((this.capMan__Transferred_Total__c==null && other.getCapMan__Transferred_Total__c()==null) || 
             (this.capMan__Transferred_Total__c!=null &&
              this.capMan__Transferred_Total__c.equals(other.getCapMan__Transferred_Total__c()))) &&
            ((this.capMan__UpdateOnly__c==null && other.getCapMan__UpdateOnly__c()==null) || 
             (this.capMan__UpdateOnly__c!=null &&
              this.capMan__UpdateOnly__c.equals(other.getCapMan__UpdateOnly__c()))) &&
            ((this.capMan__Vested_Shares__c==null && other.getCapMan__Vested_Shares__c()==null) || 
             (this.capMan__Vested_Shares__c!=null &&
              this.capMan__Vested_Shares__c.equals(other.getCapMan__Vested_Shares__c()))) &&
            ((this.capMan__VestingLengthCalc__c==null && other.getCapMan__VestingLengthCalc__c()==null) || 
             (this.capMan__VestingLengthCalc__c!=null &&
              this.capMan__VestingLengthCalc__c.equals(other.getCapMan__VestingLengthCalc__c()))) &&
            ((this.capMan__VestingPeriodLength__c==null && other.getCapMan__VestingPeriodLength__c()==null) || 
             (this.capMan__VestingPeriodLength__c!=null &&
              this.capMan__VestingPeriodLength__c.equals(other.getCapMan__VestingPeriodLength__c()))) &&
            ((this.capMan__VestingPeriodUnitsCalc__c==null && other.getCapMan__VestingPeriodUnitsCalc__c()==null) || 
             (this.capMan__VestingPeriodUnitsCalc__c!=null &&
              this.capMan__VestingPeriodUnitsCalc__c.equals(other.getCapMan__VestingPeriodUnitsCalc__c()))) &&
            ((this.capMan__VestingPeriodUnits__c==null && other.getCapMan__VestingPeriodUnits__c()==null) || 
             (this.capMan__VestingPeriodUnits__c!=null &&
              this.capMan__VestingPeriodUnits__c.equals(other.getCapMan__VestingPeriodUnits__c()))) &&
            ((this.capMan__VestingSchedule__c==null && other.getCapMan__VestingSchedule__c()==null) || 
             (this.capMan__VestingSchedule__c!=null &&
              this.capMan__VestingSchedule__c.equals(other.getCapMan__VestingSchedule__c()))) &&
            ((this.capMan__VestingStartDate__c==null && other.getCapMan__VestingStartDate__c()==null) || 
             (this.capMan__VestingStartDate__c!=null &&
              this.capMan__VestingStartDate__c.equals(other.getCapMan__VestingStartDate__c()))) &&
            ((this.capMan__Volatility__c==null && other.getCapMan__Volatility__c()==null) || 
             (this.capMan__Volatility__c!=null &&
              this.capMan__Volatility__c.equals(other.getCapMan__Volatility__c()))) &&
            ((this.capMan__checksum__c==null && other.getCapMan__checksum__c()==null) || 
             (this.capMan__checksum__c!=null &&
              this.capMan__checksum__c.equals(other.getCapMan__checksum__c()))) &&
            ((this.capMan__processed_by_payout__c==null && other.getCapMan__processed_by_payout__c()==null) || 
             (this.capMan__processed_by_payout__c!=null &&
              this.capMan__processed_by_payout__c.equals(other.getCapMan__processed_by_payout__c()))) &&
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
              this.tasks.equals(other.getTasks()))) &&
            ((this.pcmsys__Journal_Entry_Items__r==null && other.getPcmsys__Journal_Entry_Items__r()==null) || 
             (this.pcmsys__Journal_Entry_Items__r!=null &&
              this.pcmsys__Journal_Entry_Items__r.equals(other.getPcmsys__Journal_Entry_Items__r())));
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
        if (getCapMan__Accrued_Interest__c() != null) {
            _hashCode += getCapMan__Accrued_Interest__c().hashCode();
        }
        if (getCapMan__Action__c() != null) {
            _hashCode += getCapMan__Action__c().hashCode();
        }
        if (getCapMan__AfterTaxInterestPayable__c() != null) {
            _hashCode += getCapMan__AfterTaxInterestPayable__c().hashCode();
        }
        if (getCapMan__Amount_Converted__c() != null) {
            _hashCode += getCapMan__Amount_Converted__c().hashCode();
        }
        if (getCapMan__Amount_Redeemed__c() != null) {
            _hashCode += getCapMan__Amount_Redeemed__c().hashCode();
        }
        if (getCapMan__Amount_Remaining__c() != null) {
            _hashCode += getCapMan__Amount_Remaining__c().hashCode();
        }
        if (getCapMan__Amount__c() != null) {
            _hashCode += getCapMan__Amount__c().hashCode();
        }
        if (getCapMan__AvailableSharesToVest__c() != null) {
            _hashCode += getCapMan__AvailableSharesToVest__c().hashCode();
        }
        if (getCapMan__BinomialValue__c() != null) {
            _hashCode += getCapMan__BinomialValue__c().hashCode();
        }
        if (getCapMan__Cancelled_Derivatives__c() != null) {
            _hashCode += getCapMan__Cancelled_Derivatives__c().hashCode();
        }
        if (getCapMan__CaptureRepriceExpense__c() != null) {
            _hashCode += getCapMan__CaptureRepriceExpense__c().hashCode();
        }
        if (getCapMan__Carry_Forward_Date__c() != null) {
            _hashCode += getCapMan__Carry_Forward_Date__c().hashCode();
        }
        if (getCapMan__Certificate__c() != null) {
            _hashCode += getCapMan__Certificate__c().hashCode();
        }
        if (getCapMan__CliffLength__c() != null) {
            _hashCode += getCapMan__CliffLength__c().hashCode();
        }
        if (getCapMan__Cliff_Length_Calc__c() != null) {
            _hashCode += getCapMan__Cliff_Length_Calc__c().hashCode();
        }
        if (getCapMan__ControlChangeAccel__c() != null) {
            _hashCode += getCapMan__ControlChangeAccel__c().hashCode();
        }
        if (getCapMan__Conversion_Date__c() != null) {
            _hashCode += getCapMan__Conversion_Date__c().hashCode();
        }
        if (getCapMan__Conversion_Price2__c() != null) {
            _hashCode += getCapMan__Conversion_Price2__c().hashCode();
        }
        if (getCapMan__Conversion_Price__c() != null) {
            _hashCode += getCapMan__Conversion_Price__c().hashCode();
        }
        if (getCapMan__ConvertedShares__c() != null) {
            _hashCode += getCapMan__ConvertedShares__c().hashCode();
        }
        if (getCapMan__CounterpartyInvestor__c() != null) {
            _hashCode += getCapMan__CounterpartyInvestor__c().hashCode();
        }
        if (getCapMan__CounterpartyInvestor__r() != null) {
            _hashCode += getCapMan__CounterpartyInvestor__r().hashCode();
        }
        if (getCapMan__Current_Value__c() != null) {
            _hashCode += getCapMan__Current_Value__c().hashCode();
        }
        if (getCapMan__Date_Diff__c() != null) {
            _hashCode += getCapMan__Date_Diff__c().hashCode();
        }
        if (getCapMan__Date__c() != null) {
            _hashCode += getCapMan__Date__c().hashCode();
        }
        if (getCapMan__Debt_Transaction_Lots__r() != null) {
            _hashCode += getCapMan__Debt_Transaction_Lots__r().hashCode();
        }
        if (getCapMan__Debt_Type__c() != null) {
            _hashCode += getCapMan__Debt_Type__c().hashCode();
        }
        if (getCapMan__DerivativeTransactionLots__r() != null) {
            _hashCode += getCapMan__DerivativeTransactionLots__r().hashCode();
        }
        if (getCapMan__Due_Diligence_Fees__c() != null) {
            _hashCode += getCapMan__Due_Diligence_Fees__c().hashCode();
        }
        if (getCapMan__EarlyExercise__c() != null) {
            _hashCode += getCapMan__EarlyExercise__c().hashCode();
        }
        if (getCapMan__Equity_Type__c() != null) {
            _hashCode += getCapMan__Equity_Type__c().hashCode();
        }
        if (getCapMan__Exercisable_Shares__c() != null) {
            _hashCode += getCapMan__Exercisable_Shares__c().hashCode();
        }
        if (getCapMan__ExercisePrice2__c() != null) {
            _hashCode += getCapMan__ExercisePrice2__c().hashCode();
        }
        if (getCapMan__ExercisePrice__c() != null) {
            _hashCode += getCapMan__ExercisePrice__c().hashCode();
        }
        if (getCapMan__Exercised_Derivatives__c() != null) {
            _hashCode += getCapMan__Exercised_Derivatives__c().hashCode();
        }
        if (getCapMan__Expiration_Date__c() != null) {
            _hashCode += getCapMan__Expiration_Date__c().hashCode();
        }
        if (getCapMan__ExpiredDerivatives__c() != null) {
            _hashCode += getCapMan__ExpiredDerivatives__c().hashCode();
        }
        if (getCapMan__GrantDate__c() != null) {
            _hashCode += getCapMan__GrantDate__c().hashCode();
        }
        if (getCapMan__Grant_Number__c() != null) {
            _hashCode += getCapMan__Grant_Number__c().hashCode();
        }
        if (getCapMan__ImmediateVesting__c() != null) {
            _hashCode += getCapMan__ImmediateVesting__c().hashCode();
        }
        if (getCapMan__Immediate_Shares__c() != null) {
            _hashCode += getCapMan__Immediate_Shares__c().hashCode();
        }
        if (getCapMan__InitialAsConvertedShares__c() != null) {
            _hashCode += getCapMan__InitialAsConvertedShares__c().hashCode();
        }
        if (getCapMan__InterestAmount__c() != null) {
            _hashCode += getCapMan__InterestAmount__c().hashCode();
        }
        if (getCapMan__IssuanceName__c() != null) {
            _hashCode += getCapMan__IssuanceName__c().hashCode();
        }
        if (getCapMan__Issuance__c() != null) {
            _hashCode += getCapMan__Issuance__c().hashCode();
        }
        if (getCapMan__Issuance__r() != null) {
            _hashCode += getCapMan__Issuance__r().hashCode();
        }
        if (getCapMan__Issue_Status__c() != null) {
            _hashCode += getCapMan__Issue_Status__c().hashCode();
        }
        if (getCapMan__Issuer__c() != null) {
            _hashCode += getCapMan__Issuer__c().hashCode();
        }
        if (getCapMan__Issuer__r() != null) {
            _hashCode += getCapMan__Issuer__r().hashCode();
        }
        if (getCapMan__Issuer_name__c() != null) {
            _hashCode += getCapMan__Issuer_name__c().hashCode();
        }
        if (getCapMan__LActExp__c() != null) {
            _hashCode += getCapMan__LActExp__c().hashCode();
        }
        if (getCapMan__LAdjUnamExp__c() != null) {
            _hashCode += getCapMan__LAdjUnamExp__c().hashCode();
        }
        if (getCapMan__LExpAdj__c() != null) {
            _hashCode += getCapMan__LExpAdj__c().hashCode();
        }
        if (getCapMan__LOptionValue__c() != null) {
            _hashCode += getCapMan__LOptionValue__c().hashCode();
        }
        if (getCapMan__LPeriodExp__c() != null) {
            _hashCode += getCapMan__LPeriodExp__c().hashCode();
        }
        if (getCapMan__LPriorAmtExp__c() != null) {
            _hashCode += getCapMan__LPriorAmtExp__c().hashCode();
        }
        if (getCapMan__LRegrantCF__c() != null) {
            _hashCode += getCapMan__LRegrantCF__c().hashCode();
        }
        if (getCapMan__LUnamExp__c() != null) {
            _hashCode += getCapMan__LUnamExp__c().hashCode();
        }
        if (getCapMan__LatestTransactionDate__c() != null) {
            _hashCode += getCapMan__LatestTransactionDate__c().hashCode();
        }
        if (getCapMan__Legal_Fees__c() != null) {
            _hashCode += getCapMan__Legal_Fees__c().hashCode();
        }
        if (getCapMan__Listings__r() != null) {
            _hashCode += getCapMan__Listings__r().hashCode();
        }
        if (getCapMan__MandatoryConvertDate__c() != null) {
            _hashCode += getCapMan__MandatoryConvertDate__c().hashCode();
        }
        if (getCapMan__Milestone_Driver__c() != null) {
            _hashCode += getCapMan__Milestone_Driver__c().hashCode();
        }
        if (getCapMan__Milestone_Shares__c() != null) {
            _hashCode += getCapMan__Milestone_Shares__c().hashCode();
        }
        if (getCapMan__Milestone_Vesting__r() != null) {
            _hashCode += getCapMan__Milestone_Vesting__r().hashCode();
        }
        if (getCapMan__MonthsOfInterest__c() != null) {
            _hashCode += getCapMan__MonthsOfInterest__c().hashCode();
        }
        if (getCapMan__NoPricePerShareCheck__c() != null) {
            _hashCode += getCapMan__NoPricePerShareCheck__c().hashCode();
        }
        if (getCapMan__Note__c() != null) {
            _hashCode += getCapMan__Note__c().hashCode();
        }
        if (getCapMan__NumberofTimeSteps__c() != null) {
            _hashCode += getCapMan__NumberofTimeSteps__c().hashCode();
        }
        if (getCapMan__OldAmount__c() != null) {
            _hashCode += getCapMan__OldAmount__c().hashCode();
        }
        if (getCapMan__OptionType__c() != null) {
            _hashCode += getCapMan__OptionType__c().hashCode();
        }
        if (getCapMan__Option_Calculation_Type__c() != null) {
            _hashCode += getCapMan__Option_Calculation_Type__c().hashCode();
        }
        if (getCapMan__Option_Expenses__r() != null) {
            _hashCode += getCapMan__Option_Expenses__r().hashCode();
        }
        if (getCapMan__OptionsExpRecord__c() != null) {
            _hashCode += getCapMan__OptionsExpRecord__c().hashCode();
        }
        if (getCapMan__Outstanding__c() != null) {
            _hashCode += getCapMan__Outstanding__c().hashCode();
        }
        if (getCapMan__Parent_Exercise_Price__c() != null) {
            _hashCode += getCapMan__Parent_Exercise_Price__c().hashCode();
        }
        if (getCapMan__Parent_For_Repriced_Transaction__c() != null) {
            _hashCode += getCapMan__Parent_For_Repriced_Transaction__c().hashCode();
        }
        if (getCapMan__Parent_For_Repriced_Transaction__r() != null) {
            _hashCode += getCapMan__Parent_For_Repriced_Transaction__r().hashCode();
        }
        if (getCapMan__Parent_For_Repriced_Transactions__r() != null) {
            _hashCode += getCapMan__Parent_For_Repriced_Transactions__r().hashCode();
        }
        if (getCapMan__Parent_GrantDate__c() != null) {
            _hashCode += getCapMan__Parent_GrantDate__c().hashCode();
        }
        if (getCapMan__Parent_GrantNumber__c() != null) {
            _hashCode += getCapMan__Parent_GrantNumber__c().hashCode();
        }
        if (getCapMan__Parent_Shares__c() != null) {
            _hashCode += getCapMan__Parent_Shares__c().hashCode();
        }
        if (getCapMan__Paretn_VestingStartDate__c() != null) {
            _hashCode += getCapMan__Paretn_VestingStartDate__c().hashCode();
        }
        if (getCapMan__Payoffrank__c() != null) {
            _hashCode += getCapMan__Payoffrank__c().hashCode();
        }
        if (getCapMan__PctImmediateVestingCalc__c() != null) {
            _hashCode += getCapMan__PctImmediateVestingCalc__c().hashCode();
        }
        if (getCapMan__Price2__c() != null) {
            _hashCode += getCapMan__Price2__c().hashCode();
        }
        if (getCapMan__Price__c() != null) {
            _hashCode += getCapMan__Price__c().hashCode();
        }
        if (getCapMan__PriorRegrantCarryForward__c() != null) {
            _hashCode += getCapMan__PriorRegrantCarryForward__c().hashCode();
        }
        if (getCapMan__RN_Lookup__c() != null) {
            _hashCode += getCapMan__RN_Lookup__c().hashCode();
        }
        if (getCapMan__Ratio_Vested__c() != null) {
            _hashCode += getCapMan__Ratio_Vested__c().hashCode();
        }
        if (getCapMan__Register_Investor_Name__c() != null) {
            _hashCode += getCapMan__Register_Investor_Name__c().hashCode();
        }
        if (getCapMan__RegisteredName__c() != null) {
            _hashCode += getCapMan__RegisteredName__c().hashCode();
        }
        if (getCapMan__RegisteredName__r() != null) {
            _hashCode += getCapMan__RegisteredName__r().hashCode();
        }
        if (getCapMan__Registered_Investor_ID__c() != null) {
            _hashCode += getCapMan__Registered_Investor_ID__c().hashCode();
        }
        if (getCapMan__Registration_Fees__c() != null) {
            _hashCode += getCapMan__Registration_Fees__c().hashCode();
        }
        if (getCapMan__RegrantDate__c() != null) {
            _hashCode += getCapMan__RegrantDate__c().hashCode();
        }
        if (getCapMan__Regrant_Amount__c() != null) {
            _hashCode += getCapMan__Regrant_Amount__c().hashCode();
        }
        if (getCapMan__Remaining_As_Converted__c() != null) {
            _hashCode += getCapMan__Remaining_As_Converted__c().hashCode();
        }
        if (getCapMan__Remaining_Life__c() != null) {
            _hashCode += getCapMan__Remaining_Life__c().hashCode();
        }
        if (getCapMan__Remaining_Shares__c() != null) {
            _hashCode += getCapMan__Remaining_Shares__c().hashCode();
        }
        if (getCapMan__RepurchasedShares__c() != null) {
            _hashCode += getCapMan__RepurchasedShares__c().hashCode();
        }
        if (getCapMan__RiskFreeRate__c() != null) {
            _hashCode += getCapMan__RiskFreeRate__c().hashCode();
        }
        if (getCapMan__Rule144StartDate__c() != null) {
            _hashCode += getCapMan__Rule144StartDate__c().hashCode();
        }
        if (getCapMan__SchedVestingMonths__c() != null) {
            _hashCode += getCapMan__SchedVestingMonths__c().hashCode();
        }
        if (getCapMan__Scheduled_Shares__c() != null) {
            _hashCode += getCapMan__Scheduled_Shares__c().hashCode();
        }
        if (getCapMan__SecurityName__c() != null) {
            _hashCode += getCapMan__SecurityName__c().hashCode();
        }
        if (getCapMan__SecurityType__c() != null) {
            _hashCode += getCapMan__SecurityType__c().hashCode();
        }
        if (getCapMan__Security_ID__c() != null) {
            _hashCode += getCapMan__Security_ID__c().hashCode();
        }
        if (getCapMan__Security_Issued__c() != null) {
            _hashCode += getCapMan__Security_Issued__c().hashCode();
        }
        if (getCapMan__Security_Type_Import__c() != null) {
            _hashCode += getCapMan__Security_Type_Import__c().hashCode();
        }
        if (getCapMan__Security__c() != null) {
            _hashCode += getCapMan__Security__c().hashCode();
        }
        if (getCapMan__Security__r() != null) {
            _hashCode += getCapMan__Security__r().hashCode();
        }
        if (getCapMan__SharePrice2__c() != null) {
            _hashCode += getCapMan__SharePrice2__c().hashCode();
        }
        if (getCapMan__SharePrice__c() != null) {
            _hashCode += getCapMan__SharePrice__c().hashCode();
        }
        if (getCapMan__Shares__c() != null) {
            _hashCode += getCapMan__Shares__c().hashCode();
        }
        if (getCapMan__StartDate__c() != null) {
            _hashCode += getCapMan__StartDate__c().hashCode();
        }
        if (getCapMan__TotalConvertedShares__c() != null) {
            _hashCode += getCapMan__TotalConvertedShares__c().hashCode();
        }
        if (getCapMan__TotalRemovedShares__c() != null) {
            _hashCode += getCapMan__TotalRemovedShares__c().hashCode();
        }
        if (getCapMan__TransactionDate__c() != null) {
            _hashCode += getCapMan__TransactionDate__c().hashCode();
        }
        if (getCapMan__Transaction_ID__c() != null) {
            _hashCode += getCapMan__Transaction_ID__c().hashCode();
        }
        if (getCapMan__Transaction_Lots1__r() != null) {
            _hashCode += getCapMan__Transaction_Lots1__r().hashCode();
        }
        if (getCapMan__Transaction_Lots2__r() != null) {
            _hashCode += getCapMan__Transaction_Lots2__r().hashCode();
        }
        if (getCapMan__Transferred_Total__c() != null) {
            _hashCode += getCapMan__Transferred_Total__c().hashCode();
        }
        if (getCapMan__UpdateOnly__c() != null) {
            _hashCode += getCapMan__UpdateOnly__c().hashCode();
        }
        if (getCapMan__Vested_Shares__c() != null) {
            _hashCode += getCapMan__Vested_Shares__c().hashCode();
        }
        if (getCapMan__VestingLengthCalc__c() != null) {
            _hashCode += getCapMan__VestingLengthCalc__c().hashCode();
        }
        if (getCapMan__VestingPeriodLength__c() != null) {
            _hashCode += getCapMan__VestingPeriodLength__c().hashCode();
        }
        if (getCapMan__VestingPeriodUnitsCalc__c() != null) {
            _hashCode += getCapMan__VestingPeriodUnitsCalc__c().hashCode();
        }
        if (getCapMan__VestingPeriodUnits__c() != null) {
            _hashCode += getCapMan__VestingPeriodUnits__c().hashCode();
        }
        if (getCapMan__VestingSchedule__c() != null) {
            _hashCode += getCapMan__VestingSchedule__c().hashCode();
        }
        if (getCapMan__VestingStartDate__c() != null) {
            _hashCode += getCapMan__VestingStartDate__c().hashCode();
        }
        if (getCapMan__Volatility__c() != null) {
            _hashCode += getCapMan__Volatility__c().hashCode();
        }
        if (getCapMan__checksum__c() != null) {
            _hashCode += getCapMan__checksum__c().hashCode();
        }
        if (getCapMan__processed_by_payout__c() != null) {
            _hashCode += getCapMan__processed_by_payout__c().hashCode();
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
        if (getPcmsys__Journal_Entry_Items__r() != null) {
            _hashCode += getPcmsys__Journal_Entry_Items__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMan__SecurityTransaction__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityTransaction__c"));
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
        elemField.setFieldName("capMan__Accrued_Interest__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Accrued_Interest__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Action__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Action__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__Amount_Converted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Amount_Converted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Amount_Redeemed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Amount_Redeemed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Amount_Remaining__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Amount_Remaining__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AvailableSharesToVest__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AvailableSharesToVest__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__BinomialValue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__BinomialValue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Cancelled_Derivatives__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Cancelled_Derivatives__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CaptureRepriceExpense__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CaptureRepriceExpense__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Carry_Forward_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Carry_Forward_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Certificate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Certificate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CliffLength__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CliffLength__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Cliff_Length_Calc__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Cliff_Length_Calc__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ControlChangeAccel__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ControlChangeAccel__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Conversion_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Conversion_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("capMan__ConvertedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ConvertedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CounterpartyInvestor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CounterpartyInvestor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CounterpartyInvestor__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CounterpartyInvestor__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Current_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Current_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Date_Diff__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Date_Diff__c"));
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
        elemField.setFieldName("capMan__Debt_Transaction_Lots__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Debt_Transaction_Lots__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Debt_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Debt_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DerivativeTransactionLots__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DerivativeTransactionLots__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Due_Diligence_Fees__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Due_Diligence_Fees__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Equity_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Equity_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Exercisable_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exercisable_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ExercisePrice2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ExercisePrice2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ExercisePrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ExercisePrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Exercised_Derivatives__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Exercised_Derivatives__c"));
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
        elemField.setFieldName("capMan__ExpiredDerivatives__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ExpiredDerivatives__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__GrantDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__GrantDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Grant_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Grant_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ImmediateVesting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ImmediateVesting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Immediate_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Immediate_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__InitialAsConvertedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__InitialAsConvertedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__InterestAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__InterestAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__IssuanceName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__IssuanceName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__Issue_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issue_Status__c"));
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
        elemField.setFieldName("capMan__Issuer_name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Issuer_name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LActExp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LActExp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LAdjUnamExp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LAdjUnamExp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LExpAdj__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LExpAdj__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LOptionValue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LOptionValue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LPeriodExp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LPeriodExp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LPriorAmtExp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LPriorAmtExp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LRegrantCF__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LRegrantCF__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LUnamExp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LUnamExp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LatestTransactionDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LatestTransactionDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Legal_Fees__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Legal_Fees__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Listings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Listings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("capMan__Milestone_Driver__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Milestone_Driver__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Milestone_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Milestone_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Milestone_Vesting__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Milestone_Vesting__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__MonthsOfInterest__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__MonthsOfInterest__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__NoPricePerShareCheck__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__NoPricePerShareCheck__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Note__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Note__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__NumberofTimeSteps__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__NumberofTimeSteps__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OldAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OldAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__Option_Expenses__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Option_Expenses__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OptionsExpRecord__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionsExpRecord__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Outstanding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Outstanding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Parent_Exercise_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Parent_Exercise_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Parent_For_Repriced_Transaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Parent_For_Repriced_Transaction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Parent_For_Repriced_Transaction__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Parent_For_Repriced_Transaction__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityTransaction__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Parent_For_Repriced_Transactions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Parent_For_Repriced_Transactions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Parent_GrantDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Parent_GrantDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Parent_GrantNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Parent_GrantNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Parent_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Parent_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Paretn_VestingStartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Paretn_VestingStartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("capMan__PctImmediateVestingCalc__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PctImmediateVestingCalc__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Price2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Price2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PriorRegrantCarryForward__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PriorRegrantCarryForward__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RN_Lookup__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RN_Lookup__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Ratio_Vested__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Ratio_Vested__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Register_Investor_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Register_Investor_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RegisteredName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RegisteredName__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Registered_Investor_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registered_Investor_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Registration_Fees__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registration_Fees__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RegrantDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegrantDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Regrant_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Regrant_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Remaining_As_Converted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Remaining_As_Converted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Remaining_Life__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Remaining_Life__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Remaining_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Remaining_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RepurchasedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RepurchasedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RiskFreeRate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RiskFreeRate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Rule144StartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Rule144StartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SchedVestingMonths__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SchedVestingMonths__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Scheduled_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Scheduled_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__SecurityType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Issued__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Issued__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Type_Import__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Type_Import__c"));
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
        elemField.setFieldName("capMan__SharePrice2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SharePrice2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SharePrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SharePrice__c"));
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
        elemField.setFieldName("capMan__StartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__StartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotalConvertedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotalConvertedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TotalRemovedShares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TotalRemovedShares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__TransactionDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__TransactionDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Transaction_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Transaction_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Transaction_Lots1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Transaction_Lots1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Transaction_Lots2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Transaction_Lots2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Transferred_Total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Transferred_Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("capMan__Vested_Shares__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Vested_Shares__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__VestingLengthCalc__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__VestingLengthCalc__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__VestingPeriodLength__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__VestingPeriodLength__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__VestingPeriodUnitsCalc__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__VestingPeriodUnitsCalc__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__VestingPeriodUnits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__VestingPeriodUnits__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__VestingSchedule__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__VestingSchedule__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__VestingStartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__VestingStartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("capMan__checksum__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__checksum__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__processed_by_payout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__processed_by_payout__c"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Journal_Entry_Items__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Journal_Entry_Items__r"));
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
