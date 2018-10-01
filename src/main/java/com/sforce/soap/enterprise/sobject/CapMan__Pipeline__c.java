/**
 * CapMan__Pipeline__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Pipeline__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Account__c;

    private com.sforce.soap.enterprise.sobject.Account capMan__Account__r;

    private java.lang.String capMan__Balance_Sheet__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Balance_Sheet__c capMan__Balance_Sheet__r;

    private java.lang.String capMan__ChiefExecutiveOfficer__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__ChiefExecutiveOfficer__r;

    private java.lang.String capMan__City__c;

    private java.lang.String capMan__Comments__c;

    private java.lang.Boolean capMan__CountInSummary__c;

    private java.lang.String capMan__Country__c;

    private java.util.Date capMan__DateClosed__c;

    private java.util.Date capMan__DateReceived__c;

    private java.lang.String capMan__DealStatus__c;

    private java.lang.String capMan__Deal_Team_Leader__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Deal_Team_Leader__r;

    private java.lang.String capMan__Deal_Type__c;

    private java.lang.String capMan__FundStandalone__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Funding_Milestones__r;

    private java.lang.String capMan__Industry__c;

    private java.lang.String capMan__Internal_Source__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Internal_Source__r;

    private java.lang.Double capMan__InvestmentAmount__c;

    private java.lang.String capMan__InvestmentTheme__c;

    private java.util.Date capMan__LatestReceiveDate__c;

    private java.lang.String capMan__LenderContact__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__LenderContact__r;

    private java.lang.String capMan__Lender_Company__c;

    private java.lang.Double capMan__Loan_Amount__c;

    private java.lang.String capMan__LogoURL__c;

    private java.lang.String capMan__Logo__c;

    private java.lang.String capMan__Notes__c;

    private java.lang.Double capMan__OfferingSize__c;

    private java.lang.String capMan__Offering_Type__c;

    private java.lang.String capMan__OldDealTeamLeader__c;

    private java.lang.String capMan__OriginalLeader__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Pipeline_Event__r;

    private java.lang.Double capMan__PremoneyValuation__c;

    private java.lang.String capMan__Referral_Company__c;

    private java.lang.String capMan__Referred_From__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Referred_From__r;

    private java.lang.String capMan__RegionCopy__c;

    private java.lang.String capMan__Region__c;

    private java.lang.Double capMan__Score__c;

    private java.lang.String capMan__Secondary_Person__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Secondary_Person__r;

    private java.lang.String capMan__SecurityOffered__c;

    private java.lang.String capMan__Security_Type__c;

    private java.lang.String capMan__SourceType__c;

    private java.lang.String capMan__State__c;

    private java.lang.String capMan__Sub_Industry__c;

    private java.lang.String capMan__companyname__c;

    private java.util.Date capMan__oldDate__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currencyIsoCode;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

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

    public CapMan__Pipeline__c() {
    }

    public CapMan__Pipeline__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Account__c,
           com.sforce.soap.enterprise.sobject.Account capMan__Account__r,
           java.lang.String capMan__Balance_Sheet__c,
           com.sforce.soap.enterprise.sobject.CapMan__Balance_Sheet__c capMan__Balance_Sheet__r,
           java.lang.String capMan__ChiefExecutiveOfficer__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__ChiefExecutiveOfficer__r,
           java.lang.String capMan__City__c,
           java.lang.String capMan__Comments__c,
           java.lang.Boolean capMan__CountInSummary__c,
           java.lang.String capMan__Country__c,
           java.util.Date capMan__DateClosed__c,
           java.util.Date capMan__DateReceived__c,
           java.lang.String capMan__DealStatus__c,
           java.lang.String capMan__Deal_Team_Leader__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Deal_Team_Leader__r,
           java.lang.String capMan__Deal_Type__c,
           java.lang.String capMan__FundStandalone__c,
           com.sforce.soap.enterprise.QueryResult capMan__Funding_Milestones__r,
           java.lang.String capMan__Industry__c,
           java.lang.String capMan__Internal_Source__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Internal_Source__r,
           java.lang.Double capMan__InvestmentAmount__c,
           java.lang.String capMan__InvestmentTheme__c,
           java.util.Date capMan__LatestReceiveDate__c,
           java.lang.String capMan__LenderContact__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__LenderContact__r,
           java.lang.String capMan__Lender_Company__c,
           java.lang.Double capMan__Loan_Amount__c,
           java.lang.String capMan__LogoURL__c,
           java.lang.String capMan__Logo__c,
           java.lang.String capMan__Notes__c,
           java.lang.Double capMan__OfferingSize__c,
           java.lang.String capMan__Offering_Type__c,
           java.lang.String capMan__OldDealTeamLeader__c,
           java.lang.String capMan__OriginalLeader__c,
           com.sforce.soap.enterprise.QueryResult capMan__Pipeline_Event__r,
           java.lang.Double capMan__PremoneyValuation__c,
           java.lang.String capMan__Referral_Company__c,
           java.lang.String capMan__Referred_From__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Referred_From__r,
           java.lang.String capMan__RegionCopy__c,
           java.lang.String capMan__Region__c,
           java.lang.Double capMan__Score__c,
           java.lang.String capMan__Secondary_Person__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Secondary_Person__r,
           java.lang.String capMan__SecurityOffered__c,
           java.lang.String capMan__Security_Type__c,
           java.lang.String capMan__SourceType__c,
           java.lang.String capMan__State__c,
           java.lang.String capMan__Sub_Industry__c,
           java.lang.String capMan__companyname__c,
           java.util.Date capMan__oldDate__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currencyIsoCode,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
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
        this.capMan__Account__c = capMan__Account__c;
        this.capMan__Account__r = capMan__Account__r;
        this.capMan__Balance_Sheet__c = capMan__Balance_Sheet__c;
        this.capMan__Balance_Sheet__r = capMan__Balance_Sheet__r;
        this.capMan__ChiefExecutiveOfficer__c = capMan__ChiefExecutiveOfficer__c;
        this.capMan__ChiefExecutiveOfficer__r = capMan__ChiefExecutiveOfficer__r;
        this.capMan__City__c = capMan__City__c;
        this.capMan__Comments__c = capMan__Comments__c;
        this.capMan__CountInSummary__c = capMan__CountInSummary__c;
        this.capMan__Country__c = capMan__Country__c;
        this.capMan__DateClosed__c = capMan__DateClosed__c;
        this.capMan__DateReceived__c = capMan__DateReceived__c;
        this.capMan__DealStatus__c = capMan__DealStatus__c;
        this.capMan__Deal_Team_Leader__c = capMan__Deal_Team_Leader__c;
        this.capMan__Deal_Team_Leader__r = capMan__Deal_Team_Leader__r;
        this.capMan__Deal_Type__c = capMan__Deal_Type__c;
        this.capMan__FundStandalone__c = capMan__FundStandalone__c;
        this.capMan__Funding_Milestones__r = capMan__Funding_Milestones__r;
        this.capMan__Industry__c = capMan__Industry__c;
        this.capMan__Internal_Source__c = capMan__Internal_Source__c;
        this.capMan__Internal_Source__r = capMan__Internal_Source__r;
        this.capMan__InvestmentAmount__c = capMan__InvestmentAmount__c;
        this.capMan__InvestmentTheme__c = capMan__InvestmentTheme__c;
        this.capMan__LatestReceiveDate__c = capMan__LatestReceiveDate__c;
        this.capMan__LenderContact__c = capMan__LenderContact__c;
        this.capMan__LenderContact__r = capMan__LenderContact__r;
        this.capMan__Lender_Company__c = capMan__Lender_Company__c;
        this.capMan__Loan_Amount__c = capMan__Loan_Amount__c;
        this.capMan__LogoURL__c = capMan__LogoURL__c;
        this.capMan__Logo__c = capMan__Logo__c;
        this.capMan__Notes__c = capMan__Notes__c;
        this.capMan__OfferingSize__c = capMan__OfferingSize__c;
        this.capMan__Offering_Type__c = capMan__Offering_Type__c;
        this.capMan__OldDealTeamLeader__c = capMan__OldDealTeamLeader__c;
        this.capMan__OriginalLeader__c = capMan__OriginalLeader__c;
        this.capMan__Pipeline_Event__r = capMan__Pipeline_Event__r;
        this.capMan__PremoneyValuation__c = capMan__PremoneyValuation__c;
        this.capMan__Referral_Company__c = capMan__Referral_Company__c;
        this.capMan__Referred_From__c = capMan__Referred_From__c;
        this.capMan__Referred_From__r = capMan__Referred_From__r;
        this.capMan__RegionCopy__c = capMan__RegionCopy__c;
        this.capMan__Region__c = capMan__Region__c;
        this.capMan__Score__c = capMan__Score__c;
        this.capMan__Secondary_Person__c = capMan__Secondary_Person__c;
        this.capMan__Secondary_Person__r = capMan__Secondary_Person__r;
        this.capMan__SecurityOffered__c = capMan__SecurityOffered__c;
        this.capMan__Security_Type__c = capMan__Security_Type__c;
        this.capMan__SourceType__c = capMan__SourceType__c;
        this.capMan__State__c = capMan__State__c;
        this.capMan__Sub_Industry__c = capMan__Sub_Industry__c;
        this.capMan__companyname__c = capMan__companyname__c;
        this.capMan__oldDate__c = capMan__oldDate__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currencyIsoCode = currencyIsoCode;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
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
     * Gets the activityHistories value for this CapMan__Pipeline__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__Pipeline__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__Pipeline__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Pipeline__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Account__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Account__c
     */
    public java.lang.String getCapMan__Account__c() {
        return capMan__Account__c;
    }


    /**
     * Sets the capMan__Account__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Account__c
     */
    public void setCapMan__Account__c(java.lang.String capMan__Account__c) {
        this.capMan__Account__c = capMan__Account__c;
    }


    /**
     * Gets the capMan__Account__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getCapMan__Account__r() {
        return capMan__Account__r;
    }


    /**
     * Sets the capMan__Account__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Account__r
     */
    public void setCapMan__Account__r(com.sforce.soap.enterprise.sobject.Account capMan__Account__r) {
        this.capMan__Account__r = capMan__Account__r;
    }


    /**
     * Gets the capMan__Balance_Sheet__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Balance_Sheet__c
     */
    public java.lang.String getCapMan__Balance_Sheet__c() {
        return capMan__Balance_Sheet__c;
    }


    /**
     * Sets the capMan__Balance_Sheet__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Balance_Sheet__c
     */
    public void setCapMan__Balance_Sheet__c(java.lang.String capMan__Balance_Sheet__c) {
        this.capMan__Balance_Sheet__c = capMan__Balance_Sheet__c;
    }


    /**
     * Gets the capMan__Balance_Sheet__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Balance_Sheet__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Balance_Sheet__c getCapMan__Balance_Sheet__r() {
        return capMan__Balance_Sheet__r;
    }


    /**
     * Sets the capMan__Balance_Sheet__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Balance_Sheet__r
     */
    public void setCapMan__Balance_Sheet__r(com.sforce.soap.enterprise.sobject.CapMan__Balance_Sheet__c capMan__Balance_Sheet__r) {
        this.capMan__Balance_Sheet__r = capMan__Balance_Sheet__r;
    }


    /**
     * Gets the capMan__ChiefExecutiveOfficer__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__ChiefExecutiveOfficer__c
     */
    public java.lang.String getCapMan__ChiefExecutiveOfficer__c() {
        return capMan__ChiefExecutiveOfficer__c;
    }


    /**
     * Sets the capMan__ChiefExecutiveOfficer__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__ChiefExecutiveOfficer__c
     */
    public void setCapMan__ChiefExecutiveOfficer__c(java.lang.String capMan__ChiefExecutiveOfficer__c) {
        this.capMan__ChiefExecutiveOfficer__c = capMan__ChiefExecutiveOfficer__c;
    }


    /**
     * Gets the capMan__ChiefExecutiveOfficer__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__ChiefExecutiveOfficer__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__ChiefExecutiveOfficer__r() {
        return capMan__ChiefExecutiveOfficer__r;
    }


    /**
     * Sets the capMan__ChiefExecutiveOfficer__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__ChiefExecutiveOfficer__r
     */
    public void setCapMan__ChiefExecutiveOfficer__r(com.sforce.soap.enterprise.sobject.Contact capMan__ChiefExecutiveOfficer__r) {
        this.capMan__ChiefExecutiveOfficer__r = capMan__ChiefExecutiveOfficer__r;
    }


    /**
     * Gets the capMan__City__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__City__c
     */
    public java.lang.String getCapMan__City__c() {
        return capMan__City__c;
    }


    /**
     * Sets the capMan__City__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__City__c
     */
    public void setCapMan__City__c(java.lang.String capMan__City__c) {
        this.capMan__City__c = capMan__City__c;
    }


    /**
     * Gets the capMan__Comments__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Comments__c
     */
    public java.lang.String getCapMan__Comments__c() {
        return capMan__Comments__c;
    }


    /**
     * Sets the capMan__Comments__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Comments__c
     */
    public void setCapMan__Comments__c(java.lang.String capMan__Comments__c) {
        this.capMan__Comments__c = capMan__Comments__c;
    }


    /**
     * Gets the capMan__CountInSummary__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__CountInSummary__c
     */
    public java.lang.Boolean getCapMan__CountInSummary__c() {
        return capMan__CountInSummary__c;
    }


    /**
     * Sets the capMan__CountInSummary__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__CountInSummary__c
     */
    public void setCapMan__CountInSummary__c(java.lang.Boolean capMan__CountInSummary__c) {
        this.capMan__CountInSummary__c = capMan__CountInSummary__c;
    }


    /**
     * Gets the capMan__Country__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Country__c
     */
    public java.lang.String getCapMan__Country__c() {
        return capMan__Country__c;
    }


    /**
     * Sets the capMan__Country__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Country__c
     */
    public void setCapMan__Country__c(java.lang.String capMan__Country__c) {
        this.capMan__Country__c = capMan__Country__c;
    }


    /**
     * Gets the capMan__DateClosed__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__DateClosed__c
     */
    public java.util.Date getCapMan__DateClosed__c() {
        return capMan__DateClosed__c;
    }


    /**
     * Sets the capMan__DateClosed__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__DateClosed__c
     */
    public void setCapMan__DateClosed__c(java.util.Date capMan__DateClosed__c) {
        this.capMan__DateClosed__c = capMan__DateClosed__c;
    }


    /**
     * Gets the capMan__DateReceived__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__DateReceived__c
     */
    public java.util.Date getCapMan__DateReceived__c() {
        return capMan__DateReceived__c;
    }


    /**
     * Sets the capMan__DateReceived__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__DateReceived__c
     */
    public void setCapMan__DateReceived__c(java.util.Date capMan__DateReceived__c) {
        this.capMan__DateReceived__c = capMan__DateReceived__c;
    }


    /**
     * Gets the capMan__DealStatus__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__DealStatus__c
     */
    public java.lang.String getCapMan__DealStatus__c() {
        return capMan__DealStatus__c;
    }


    /**
     * Sets the capMan__DealStatus__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__DealStatus__c
     */
    public void setCapMan__DealStatus__c(java.lang.String capMan__DealStatus__c) {
        this.capMan__DealStatus__c = capMan__DealStatus__c;
    }


    /**
     * Gets the capMan__Deal_Team_Leader__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Deal_Team_Leader__c
     */
    public java.lang.String getCapMan__Deal_Team_Leader__c() {
        return capMan__Deal_Team_Leader__c;
    }


    /**
     * Sets the capMan__Deal_Team_Leader__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Deal_Team_Leader__c
     */
    public void setCapMan__Deal_Team_Leader__c(java.lang.String capMan__Deal_Team_Leader__c) {
        this.capMan__Deal_Team_Leader__c = capMan__Deal_Team_Leader__c;
    }


    /**
     * Gets the capMan__Deal_Team_Leader__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Deal_Team_Leader__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Deal_Team_Leader__r() {
        return capMan__Deal_Team_Leader__r;
    }


    /**
     * Sets the capMan__Deal_Team_Leader__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Deal_Team_Leader__r
     */
    public void setCapMan__Deal_Team_Leader__r(com.sforce.soap.enterprise.sobject.Contact capMan__Deal_Team_Leader__r) {
        this.capMan__Deal_Team_Leader__r = capMan__Deal_Team_Leader__r;
    }


    /**
     * Gets the capMan__Deal_Type__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Deal_Type__c
     */
    public java.lang.String getCapMan__Deal_Type__c() {
        return capMan__Deal_Type__c;
    }


    /**
     * Sets the capMan__Deal_Type__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Deal_Type__c
     */
    public void setCapMan__Deal_Type__c(java.lang.String capMan__Deal_Type__c) {
        this.capMan__Deal_Type__c = capMan__Deal_Type__c;
    }


    /**
     * Gets the capMan__FundStandalone__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__FundStandalone__c
     */
    public java.lang.String getCapMan__FundStandalone__c() {
        return capMan__FundStandalone__c;
    }


    /**
     * Sets the capMan__FundStandalone__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__FundStandalone__c
     */
    public void setCapMan__FundStandalone__c(java.lang.String capMan__FundStandalone__c) {
        this.capMan__FundStandalone__c = capMan__FundStandalone__c;
    }


    /**
     * Gets the capMan__Funding_Milestones__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Funding_Milestones__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Funding_Milestones__r() {
        return capMan__Funding_Milestones__r;
    }


    /**
     * Sets the capMan__Funding_Milestones__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Funding_Milestones__r
     */
    public void setCapMan__Funding_Milestones__r(com.sforce.soap.enterprise.QueryResult capMan__Funding_Milestones__r) {
        this.capMan__Funding_Milestones__r = capMan__Funding_Milestones__r;
    }


    /**
     * Gets the capMan__Industry__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Industry__c
     */
    public java.lang.String getCapMan__Industry__c() {
        return capMan__Industry__c;
    }


    /**
     * Sets the capMan__Industry__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Industry__c
     */
    public void setCapMan__Industry__c(java.lang.String capMan__Industry__c) {
        this.capMan__Industry__c = capMan__Industry__c;
    }


    /**
     * Gets the capMan__Internal_Source__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Internal_Source__c
     */
    public java.lang.String getCapMan__Internal_Source__c() {
        return capMan__Internal_Source__c;
    }


    /**
     * Sets the capMan__Internal_Source__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Internal_Source__c
     */
    public void setCapMan__Internal_Source__c(java.lang.String capMan__Internal_Source__c) {
        this.capMan__Internal_Source__c = capMan__Internal_Source__c;
    }


    /**
     * Gets the capMan__Internal_Source__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Internal_Source__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Internal_Source__r() {
        return capMan__Internal_Source__r;
    }


    /**
     * Sets the capMan__Internal_Source__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Internal_Source__r
     */
    public void setCapMan__Internal_Source__r(com.sforce.soap.enterprise.sobject.Contact capMan__Internal_Source__r) {
        this.capMan__Internal_Source__r = capMan__Internal_Source__r;
    }


    /**
     * Gets the capMan__InvestmentAmount__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__InvestmentAmount__c
     */
    public java.lang.Double getCapMan__InvestmentAmount__c() {
        return capMan__InvestmentAmount__c;
    }


    /**
     * Sets the capMan__InvestmentAmount__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__InvestmentAmount__c
     */
    public void setCapMan__InvestmentAmount__c(java.lang.Double capMan__InvestmentAmount__c) {
        this.capMan__InvestmentAmount__c = capMan__InvestmentAmount__c;
    }


    /**
     * Gets the capMan__InvestmentTheme__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__InvestmentTheme__c
     */
    public java.lang.String getCapMan__InvestmentTheme__c() {
        return capMan__InvestmentTheme__c;
    }


    /**
     * Sets the capMan__InvestmentTheme__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__InvestmentTheme__c
     */
    public void setCapMan__InvestmentTheme__c(java.lang.String capMan__InvestmentTheme__c) {
        this.capMan__InvestmentTheme__c = capMan__InvestmentTheme__c;
    }


    /**
     * Gets the capMan__LatestReceiveDate__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__LatestReceiveDate__c
     */
    public java.util.Date getCapMan__LatestReceiveDate__c() {
        return capMan__LatestReceiveDate__c;
    }


    /**
     * Sets the capMan__LatestReceiveDate__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__LatestReceiveDate__c
     */
    public void setCapMan__LatestReceiveDate__c(java.util.Date capMan__LatestReceiveDate__c) {
        this.capMan__LatestReceiveDate__c = capMan__LatestReceiveDate__c;
    }


    /**
     * Gets the capMan__LenderContact__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__LenderContact__c
     */
    public java.lang.String getCapMan__LenderContact__c() {
        return capMan__LenderContact__c;
    }


    /**
     * Sets the capMan__LenderContact__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__LenderContact__c
     */
    public void setCapMan__LenderContact__c(java.lang.String capMan__LenderContact__c) {
        this.capMan__LenderContact__c = capMan__LenderContact__c;
    }


    /**
     * Gets the capMan__LenderContact__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__LenderContact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__LenderContact__r() {
        return capMan__LenderContact__r;
    }


    /**
     * Sets the capMan__LenderContact__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__LenderContact__r
     */
    public void setCapMan__LenderContact__r(com.sforce.soap.enterprise.sobject.Contact capMan__LenderContact__r) {
        this.capMan__LenderContact__r = capMan__LenderContact__r;
    }


    /**
     * Gets the capMan__Lender_Company__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Lender_Company__c
     */
    public java.lang.String getCapMan__Lender_Company__c() {
        return capMan__Lender_Company__c;
    }


    /**
     * Sets the capMan__Lender_Company__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Lender_Company__c
     */
    public void setCapMan__Lender_Company__c(java.lang.String capMan__Lender_Company__c) {
        this.capMan__Lender_Company__c = capMan__Lender_Company__c;
    }


    /**
     * Gets the capMan__Loan_Amount__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Loan_Amount__c
     */
    public java.lang.Double getCapMan__Loan_Amount__c() {
        return capMan__Loan_Amount__c;
    }


    /**
     * Sets the capMan__Loan_Amount__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Loan_Amount__c
     */
    public void setCapMan__Loan_Amount__c(java.lang.Double capMan__Loan_Amount__c) {
        this.capMan__Loan_Amount__c = capMan__Loan_Amount__c;
    }


    /**
     * Gets the capMan__LogoURL__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__LogoURL__c
     */
    public java.lang.String getCapMan__LogoURL__c() {
        return capMan__LogoURL__c;
    }


    /**
     * Sets the capMan__LogoURL__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__LogoURL__c
     */
    public void setCapMan__LogoURL__c(java.lang.String capMan__LogoURL__c) {
        this.capMan__LogoURL__c = capMan__LogoURL__c;
    }


    /**
     * Gets the capMan__Logo__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Logo__c
     */
    public java.lang.String getCapMan__Logo__c() {
        return capMan__Logo__c;
    }


    /**
     * Sets the capMan__Logo__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Logo__c
     */
    public void setCapMan__Logo__c(java.lang.String capMan__Logo__c) {
        this.capMan__Logo__c = capMan__Logo__c;
    }


    /**
     * Gets the capMan__Notes__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Notes__c
     */
    public java.lang.String getCapMan__Notes__c() {
        return capMan__Notes__c;
    }


    /**
     * Sets the capMan__Notes__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Notes__c
     */
    public void setCapMan__Notes__c(java.lang.String capMan__Notes__c) {
        this.capMan__Notes__c = capMan__Notes__c;
    }


    /**
     * Gets the capMan__OfferingSize__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__OfferingSize__c
     */
    public java.lang.Double getCapMan__OfferingSize__c() {
        return capMan__OfferingSize__c;
    }


    /**
     * Sets the capMan__OfferingSize__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__OfferingSize__c
     */
    public void setCapMan__OfferingSize__c(java.lang.Double capMan__OfferingSize__c) {
        this.capMan__OfferingSize__c = capMan__OfferingSize__c;
    }


    /**
     * Gets the capMan__Offering_Type__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Offering_Type__c
     */
    public java.lang.String getCapMan__Offering_Type__c() {
        return capMan__Offering_Type__c;
    }


    /**
     * Sets the capMan__Offering_Type__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Offering_Type__c
     */
    public void setCapMan__Offering_Type__c(java.lang.String capMan__Offering_Type__c) {
        this.capMan__Offering_Type__c = capMan__Offering_Type__c;
    }


    /**
     * Gets the capMan__OldDealTeamLeader__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__OldDealTeamLeader__c
     */
    public java.lang.String getCapMan__OldDealTeamLeader__c() {
        return capMan__OldDealTeamLeader__c;
    }


    /**
     * Sets the capMan__OldDealTeamLeader__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__OldDealTeamLeader__c
     */
    public void setCapMan__OldDealTeamLeader__c(java.lang.String capMan__OldDealTeamLeader__c) {
        this.capMan__OldDealTeamLeader__c = capMan__OldDealTeamLeader__c;
    }


    /**
     * Gets the capMan__OriginalLeader__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__OriginalLeader__c
     */
    public java.lang.String getCapMan__OriginalLeader__c() {
        return capMan__OriginalLeader__c;
    }


    /**
     * Sets the capMan__OriginalLeader__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__OriginalLeader__c
     */
    public void setCapMan__OriginalLeader__c(java.lang.String capMan__OriginalLeader__c) {
        this.capMan__OriginalLeader__c = capMan__OriginalLeader__c;
    }


    /**
     * Gets the capMan__Pipeline_Event__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Pipeline_Event__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Pipeline_Event__r() {
        return capMan__Pipeline_Event__r;
    }


    /**
     * Sets the capMan__Pipeline_Event__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Pipeline_Event__r
     */
    public void setCapMan__Pipeline_Event__r(com.sforce.soap.enterprise.QueryResult capMan__Pipeline_Event__r) {
        this.capMan__Pipeline_Event__r = capMan__Pipeline_Event__r;
    }


    /**
     * Gets the capMan__PremoneyValuation__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__PremoneyValuation__c
     */
    public java.lang.Double getCapMan__PremoneyValuation__c() {
        return capMan__PremoneyValuation__c;
    }


    /**
     * Sets the capMan__PremoneyValuation__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__PremoneyValuation__c
     */
    public void setCapMan__PremoneyValuation__c(java.lang.Double capMan__PremoneyValuation__c) {
        this.capMan__PremoneyValuation__c = capMan__PremoneyValuation__c;
    }


    /**
     * Gets the capMan__Referral_Company__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Referral_Company__c
     */
    public java.lang.String getCapMan__Referral_Company__c() {
        return capMan__Referral_Company__c;
    }


    /**
     * Sets the capMan__Referral_Company__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Referral_Company__c
     */
    public void setCapMan__Referral_Company__c(java.lang.String capMan__Referral_Company__c) {
        this.capMan__Referral_Company__c = capMan__Referral_Company__c;
    }


    /**
     * Gets the capMan__Referred_From__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Referred_From__c
     */
    public java.lang.String getCapMan__Referred_From__c() {
        return capMan__Referred_From__c;
    }


    /**
     * Sets the capMan__Referred_From__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Referred_From__c
     */
    public void setCapMan__Referred_From__c(java.lang.String capMan__Referred_From__c) {
        this.capMan__Referred_From__c = capMan__Referred_From__c;
    }


    /**
     * Gets the capMan__Referred_From__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Referred_From__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Referred_From__r() {
        return capMan__Referred_From__r;
    }


    /**
     * Sets the capMan__Referred_From__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Referred_From__r
     */
    public void setCapMan__Referred_From__r(com.sforce.soap.enterprise.sobject.Contact capMan__Referred_From__r) {
        this.capMan__Referred_From__r = capMan__Referred_From__r;
    }


    /**
     * Gets the capMan__RegionCopy__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__RegionCopy__c
     */
    public java.lang.String getCapMan__RegionCopy__c() {
        return capMan__RegionCopy__c;
    }


    /**
     * Sets the capMan__RegionCopy__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__RegionCopy__c
     */
    public void setCapMan__RegionCopy__c(java.lang.String capMan__RegionCopy__c) {
        this.capMan__RegionCopy__c = capMan__RegionCopy__c;
    }


    /**
     * Gets the capMan__Region__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Region__c
     */
    public java.lang.String getCapMan__Region__c() {
        return capMan__Region__c;
    }


    /**
     * Sets the capMan__Region__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Region__c
     */
    public void setCapMan__Region__c(java.lang.String capMan__Region__c) {
        this.capMan__Region__c = capMan__Region__c;
    }


    /**
     * Gets the capMan__Score__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Score__c
     */
    public java.lang.Double getCapMan__Score__c() {
        return capMan__Score__c;
    }


    /**
     * Sets the capMan__Score__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Score__c
     */
    public void setCapMan__Score__c(java.lang.Double capMan__Score__c) {
        this.capMan__Score__c = capMan__Score__c;
    }


    /**
     * Gets the capMan__Secondary_Person__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Secondary_Person__c
     */
    public java.lang.String getCapMan__Secondary_Person__c() {
        return capMan__Secondary_Person__c;
    }


    /**
     * Sets the capMan__Secondary_Person__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Secondary_Person__c
     */
    public void setCapMan__Secondary_Person__c(java.lang.String capMan__Secondary_Person__c) {
        this.capMan__Secondary_Person__c = capMan__Secondary_Person__c;
    }


    /**
     * Gets the capMan__Secondary_Person__r value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Secondary_Person__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Secondary_Person__r() {
        return capMan__Secondary_Person__r;
    }


    /**
     * Sets the capMan__Secondary_Person__r value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Secondary_Person__r
     */
    public void setCapMan__Secondary_Person__r(com.sforce.soap.enterprise.sobject.Contact capMan__Secondary_Person__r) {
        this.capMan__Secondary_Person__r = capMan__Secondary_Person__r;
    }


    /**
     * Gets the capMan__SecurityOffered__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__SecurityOffered__c
     */
    public java.lang.String getCapMan__SecurityOffered__c() {
        return capMan__SecurityOffered__c;
    }


    /**
     * Sets the capMan__SecurityOffered__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__SecurityOffered__c
     */
    public void setCapMan__SecurityOffered__c(java.lang.String capMan__SecurityOffered__c) {
        this.capMan__SecurityOffered__c = capMan__SecurityOffered__c;
    }


    /**
     * Gets the capMan__Security_Type__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Security_Type__c
     */
    public java.lang.String getCapMan__Security_Type__c() {
        return capMan__Security_Type__c;
    }


    /**
     * Sets the capMan__Security_Type__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Security_Type__c
     */
    public void setCapMan__Security_Type__c(java.lang.String capMan__Security_Type__c) {
        this.capMan__Security_Type__c = capMan__Security_Type__c;
    }


    /**
     * Gets the capMan__SourceType__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__SourceType__c
     */
    public java.lang.String getCapMan__SourceType__c() {
        return capMan__SourceType__c;
    }


    /**
     * Sets the capMan__SourceType__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__SourceType__c
     */
    public void setCapMan__SourceType__c(java.lang.String capMan__SourceType__c) {
        this.capMan__SourceType__c = capMan__SourceType__c;
    }


    /**
     * Gets the capMan__State__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__State__c
     */
    public java.lang.String getCapMan__State__c() {
        return capMan__State__c;
    }


    /**
     * Sets the capMan__State__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__State__c
     */
    public void setCapMan__State__c(java.lang.String capMan__State__c) {
        this.capMan__State__c = capMan__State__c;
    }


    /**
     * Gets the capMan__Sub_Industry__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__Sub_Industry__c
     */
    public java.lang.String getCapMan__Sub_Industry__c() {
        return capMan__Sub_Industry__c;
    }


    /**
     * Sets the capMan__Sub_Industry__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__Sub_Industry__c
     */
    public void setCapMan__Sub_Industry__c(java.lang.String capMan__Sub_Industry__c) {
        this.capMan__Sub_Industry__c = capMan__Sub_Industry__c;
    }


    /**
     * Gets the capMan__companyname__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__companyname__c
     */
    public java.lang.String getCapMan__companyname__c() {
        return capMan__companyname__c;
    }


    /**
     * Sets the capMan__companyname__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__companyname__c
     */
    public void setCapMan__companyname__c(java.lang.String capMan__companyname__c) {
        this.capMan__companyname__c = capMan__companyname__c;
    }


    /**
     * Gets the capMan__oldDate__c value for this CapMan__Pipeline__c.
     * 
     * @return capMan__oldDate__c
     */
    public java.util.Date getCapMan__oldDate__c() {
        return capMan__oldDate__c;
    }


    /**
     * Sets the capMan__oldDate__c value for this CapMan__Pipeline__c.
     * 
     * @param capMan__oldDate__c
     */
    public void setCapMan__oldDate__c(java.util.Date capMan__oldDate__c) {
        this.capMan__oldDate__c = capMan__oldDate__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Pipeline__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Pipeline__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Pipeline__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Pipeline__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Pipeline__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Pipeline__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Pipeline__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Pipeline__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__Pipeline__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__Pipeline__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Pipeline__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Pipeline__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this CapMan__Pipeline__c.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this CapMan__Pipeline__c.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the histories value for this CapMan__Pipeline__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__Pipeline__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__Pipeline__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Pipeline__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__Pipeline__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__Pipeline__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Pipeline__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Pipeline__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Pipeline__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Pipeline__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Pipeline__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Pipeline__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Pipeline__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Pipeline__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Pipeline__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Pipeline__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Pipeline__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Pipeline__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__Pipeline__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__Pipeline__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this CapMan__Pipeline__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__Pipeline__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__Pipeline__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__Pipeline__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__Pipeline__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Pipeline__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Pipeline__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Pipeline__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Pipeline__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Pipeline__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__Pipeline__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__Pipeline__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Pipeline__c)) return false;
        CapMan__Pipeline__c other = (CapMan__Pipeline__c) obj;
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
            ((this.capMan__Account__c==null && other.getCapMan__Account__c()==null) || 
             (this.capMan__Account__c!=null &&
              this.capMan__Account__c.equals(other.getCapMan__Account__c()))) &&
            ((this.capMan__Account__r==null && other.getCapMan__Account__r()==null) || 
             (this.capMan__Account__r!=null &&
              this.capMan__Account__r.equals(other.getCapMan__Account__r()))) &&
            ((this.capMan__Balance_Sheet__c==null && other.getCapMan__Balance_Sheet__c()==null) || 
             (this.capMan__Balance_Sheet__c!=null &&
              this.capMan__Balance_Sheet__c.equals(other.getCapMan__Balance_Sheet__c()))) &&
            ((this.capMan__Balance_Sheet__r==null && other.getCapMan__Balance_Sheet__r()==null) || 
             (this.capMan__Balance_Sheet__r!=null &&
              this.capMan__Balance_Sheet__r.equals(other.getCapMan__Balance_Sheet__r()))) &&
            ((this.capMan__ChiefExecutiveOfficer__c==null && other.getCapMan__ChiefExecutiveOfficer__c()==null) || 
             (this.capMan__ChiefExecutiveOfficer__c!=null &&
              this.capMan__ChiefExecutiveOfficer__c.equals(other.getCapMan__ChiefExecutiveOfficer__c()))) &&
            ((this.capMan__ChiefExecutiveOfficer__r==null && other.getCapMan__ChiefExecutiveOfficer__r()==null) || 
             (this.capMan__ChiefExecutiveOfficer__r!=null &&
              this.capMan__ChiefExecutiveOfficer__r.equals(other.getCapMan__ChiefExecutiveOfficer__r()))) &&
            ((this.capMan__City__c==null && other.getCapMan__City__c()==null) || 
             (this.capMan__City__c!=null &&
              this.capMan__City__c.equals(other.getCapMan__City__c()))) &&
            ((this.capMan__Comments__c==null && other.getCapMan__Comments__c()==null) || 
             (this.capMan__Comments__c!=null &&
              this.capMan__Comments__c.equals(other.getCapMan__Comments__c()))) &&
            ((this.capMan__CountInSummary__c==null && other.getCapMan__CountInSummary__c()==null) || 
             (this.capMan__CountInSummary__c!=null &&
              this.capMan__CountInSummary__c.equals(other.getCapMan__CountInSummary__c()))) &&
            ((this.capMan__Country__c==null && other.getCapMan__Country__c()==null) || 
             (this.capMan__Country__c!=null &&
              this.capMan__Country__c.equals(other.getCapMan__Country__c()))) &&
            ((this.capMan__DateClosed__c==null && other.getCapMan__DateClosed__c()==null) || 
             (this.capMan__DateClosed__c!=null &&
              this.capMan__DateClosed__c.equals(other.getCapMan__DateClosed__c()))) &&
            ((this.capMan__DateReceived__c==null && other.getCapMan__DateReceived__c()==null) || 
             (this.capMan__DateReceived__c!=null &&
              this.capMan__DateReceived__c.equals(other.getCapMan__DateReceived__c()))) &&
            ((this.capMan__DealStatus__c==null && other.getCapMan__DealStatus__c()==null) || 
             (this.capMan__DealStatus__c!=null &&
              this.capMan__DealStatus__c.equals(other.getCapMan__DealStatus__c()))) &&
            ((this.capMan__Deal_Team_Leader__c==null && other.getCapMan__Deal_Team_Leader__c()==null) || 
             (this.capMan__Deal_Team_Leader__c!=null &&
              this.capMan__Deal_Team_Leader__c.equals(other.getCapMan__Deal_Team_Leader__c()))) &&
            ((this.capMan__Deal_Team_Leader__r==null && other.getCapMan__Deal_Team_Leader__r()==null) || 
             (this.capMan__Deal_Team_Leader__r!=null &&
              this.capMan__Deal_Team_Leader__r.equals(other.getCapMan__Deal_Team_Leader__r()))) &&
            ((this.capMan__Deal_Type__c==null && other.getCapMan__Deal_Type__c()==null) || 
             (this.capMan__Deal_Type__c!=null &&
              this.capMan__Deal_Type__c.equals(other.getCapMan__Deal_Type__c()))) &&
            ((this.capMan__FundStandalone__c==null && other.getCapMan__FundStandalone__c()==null) || 
             (this.capMan__FundStandalone__c!=null &&
              this.capMan__FundStandalone__c.equals(other.getCapMan__FundStandalone__c()))) &&
            ((this.capMan__Funding_Milestones__r==null && other.getCapMan__Funding_Milestones__r()==null) || 
             (this.capMan__Funding_Milestones__r!=null &&
              this.capMan__Funding_Milestones__r.equals(other.getCapMan__Funding_Milestones__r()))) &&
            ((this.capMan__Industry__c==null && other.getCapMan__Industry__c()==null) || 
             (this.capMan__Industry__c!=null &&
              this.capMan__Industry__c.equals(other.getCapMan__Industry__c()))) &&
            ((this.capMan__Internal_Source__c==null && other.getCapMan__Internal_Source__c()==null) || 
             (this.capMan__Internal_Source__c!=null &&
              this.capMan__Internal_Source__c.equals(other.getCapMan__Internal_Source__c()))) &&
            ((this.capMan__Internal_Source__r==null && other.getCapMan__Internal_Source__r()==null) || 
             (this.capMan__Internal_Source__r!=null &&
              this.capMan__Internal_Source__r.equals(other.getCapMan__Internal_Source__r()))) &&
            ((this.capMan__InvestmentAmount__c==null && other.getCapMan__InvestmentAmount__c()==null) || 
             (this.capMan__InvestmentAmount__c!=null &&
              this.capMan__InvestmentAmount__c.equals(other.getCapMan__InvestmentAmount__c()))) &&
            ((this.capMan__InvestmentTheme__c==null && other.getCapMan__InvestmentTheme__c()==null) || 
             (this.capMan__InvestmentTheme__c!=null &&
              this.capMan__InvestmentTheme__c.equals(other.getCapMan__InvestmentTheme__c()))) &&
            ((this.capMan__LatestReceiveDate__c==null && other.getCapMan__LatestReceiveDate__c()==null) || 
             (this.capMan__LatestReceiveDate__c!=null &&
              this.capMan__LatestReceiveDate__c.equals(other.getCapMan__LatestReceiveDate__c()))) &&
            ((this.capMan__LenderContact__c==null && other.getCapMan__LenderContact__c()==null) || 
             (this.capMan__LenderContact__c!=null &&
              this.capMan__LenderContact__c.equals(other.getCapMan__LenderContact__c()))) &&
            ((this.capMan__LenderContact__r==null && other.getCapMan__LenderContact__r()==null) || 
             (this.capMan__LenderContact__r!=null &&
              this.capMan__LenderContact__r.equals(other.getCapMan__LenderContact__r()))) &&
            ((this.capMan__Lender_Company__c==null && other.getCapMan__Lender_Company__c()==null) || 
             (this.capMan__Lender_Company__c!=null &&
              this.capMan__Lender_Company__c.equals(other.getCapMan__Lender_Company__c()))) &&
            ((this.capMan__Loan_Amount__c==null && other.getCapMan__Loan_Amount__c()==null) || 
             (this.capMan__Loan_Amount__c!=null &&
              this.capMan__Loan_Amount__c.equals(other.getCapMan__Loan_Amount__c()))) &&
            ((this.capMan__LogoURL__c==null && other.getCapMan__LogoURL__c()==null) || 
             (this.capMan__LogoURL__c!=null &&
              this.capMan__LogoURL__c.equals(other.getCapMan__LogoURL__c()))) &&
            ((this.capMan__Logo__c==null && other.getCapMan__Logo__c()==null) || 
             (this.capMan__Logo__c!=null &&
              this.capMan__Logo__c.equals(other.getCapMan__Logo__c()))) &&
            ((this.capMan__Notes__c==null && other.getCapMan__Notes__c()==null) || 
             (this.capMan__Notes__c!=null &&
              this.capMan__Notes__c.equals(other.getCapMan__Notes__c()))) &&
            ((this.capMan__OfferingSize__c==null && other.getCapMan__OfferingSize__c()==null) || 
             (this.capMan__OfferingSize__c!=null &&
              this.capMan__OfferingSize__c.equals(other.getCapMan__OfferingSize__c()))) &&
            ((this.capMan__Offering_Type__c==null && other.getCapMan__Offering_Type__c()==null) || 
             (this.capMan__Offering_Type__c!=null &&
              this.capMan__Offering_Type__c.equals(other.getCapMan__Offering_Type__c()))) &&
            ((this.capMan__OldDealTeamLeader__c==null && other.getCapMan__OldDealTeamLeader__c()==null) || 
             (this.capMan__OldDealTeamLeader__c!=null &&
              this.capMan__OldDealTeamLeader__c.equals(other.getCapMan__OldDealTeamLeader__c()))) &&
            ((this.capMan__OriginalLeader__c==null && other.getCapMan__OriginalLeader__c()==null) || 
             (this.capMan__OriginalLeader__c!=null &&
              this.capMan__OriginalLeader__c.equals(other.getCapMan__OriginalLeader__c()))) &&
            ((this.capMan__Pipeline_Event__r==null && other.getCapMan__Pipeline_Event__r()==null) || 
             (this.capMan__Pipeline_Event__r!=null &&
              this.capMan__Pipeline_Event__r.equals(other.getCapMan__Pipeline_Event__r()))) &&
            ((this.capMan__PremoneyValuation__c==null && other.getCapMan__PremoneyValuation__c()==null) || 
             (this.capMan__PremoneyValuation__c!=null &&
              this.capMan__PremoneyValuation__c.equals(other.getCapMan__PremoneyValuation__c()))) &&
            ((this.capMan__Referral_Company__c==null && other.getCapMan__Referral_Company__c()==null) || 
             (this.capMan__Referral_Company__c!=null &&
              this.capMan__Referral_Company__c.equals(other.getCapMan__Referral_Company__c()))) &&
            ((this.capMan__Referred_From__c==null && other.getCapMan__Referred_From__c()==null) || 
             (this.capMan__Referred_From__c!=null &&
              this.capMan__Referred_From__c.equals(other.getCapMan__Referred_From__c()))) &&
            ((this.capMan__Referred_From__r==null && other.getCapMan__Referred_From__r()==null) || 
             (this.capMan__Referred_From__r!=null &&
              this.capMan__Referred_From__r.equals(other.getCapMan__Referred_From__r()))) &&
            ((this.capMan__RegionCopy__c==null && other.getCapMan__RegionCopy__c()==null) || 
             (this.capMan__RegionCopy__c!=null &&
              this.capMan__RegionCopy__c.equals(other.getCapMan__RegionCopy__c()))) &&
            ((this.capMan__Region__c==null && other.getCapMan__Region__c()==null) || 
             (this.capMan__Region__c!=null &&
              this.capMan__Region__c.equals(other.getCapMan__Region__c()))) &&
            ((this.capMan__Score__c==null && other.getCapMan__Score__c()==null) || 
             (this.capMan__Score__c!=null &&
              this.capMan__Score__c.equals(other.getCapMan__Score__c()))) &&
            ((this.capMan__Secondary_Person__c==null && other.getCapMan__Secondary_Person__c()==null) || 
             (this.capMan__Secondary_Person__c!=null &&
              this.capMan__Secondary_Person__c.equals(other.getCapMan__Secondary_Person__c()))) &&
            ((this.capMan__Secondary_Person__r==null && other.getCapMan__Secondary_Person__r()==null) || 
             (this.capMan__Secondary_Person__r!=null &&
              this.capMan__Secondary_Person__r.equals(other.getCapMan__Secondary_Person__r()))) &&
            ((this.capMan__SecurityOffered__c==null && other.getCapMan__SecurityOffered__c()==null) || 
             (this.capMan__SecurityOffered__c!=null &&
              this.capMan__SecurityOffered__c.equals(other.getCapMan__SecurityOffered__c()))) &&
            ((this.capMan__Security_Type__c==null && other.getCapMan__Security_Type__c()==null) || 
             (this.capMan__Security_Type__c!=null &&
              this.capMan__Security_Type__c.equals(other.getCapMan__Security_Type__c()))) &&
            ((this.capMan__SourceType__c==null && other.getCapMan__SourceType__c()==null) || 
             (this.capMan__SourceType__c!=null &&
              this.capMan__SourceType__c.equals(other.getCapMan__SourceType__c()))) &&
            ((this.capMan__State__c==null && other.getCapMan__State__c()==null) || 
             (this.capMan__State__c!=null &&
              this.capMan__State__c.equals(other.getCapMan__State__c()))) &&
            ((this.capMan__Sub_Industry__c==null && other.getCapMan__Sub_Industry__c()==null) || 
             (this.capMan__Sub_Industry__c!=null &&
              this.capMan__Sub_Industry__c.equals(other.getCapMan__Sub_Industry__c()))) &&
            ((this.capMan__companyname__c==null && other.getCapMan__companyname__c()==null) || 
             (this.capMan__companyname__c!=null &&
              this.capMan__companyname__c.equals(other.getCapMan__companyname__c()))) &&
            ((this.capMan__oldDate__c==null && other.getCapMan__oldDate__c()==null) || 
             (this.capMan__oldDate__c!=null &&
              this.capMan__oldDate__c.equals(other.getCapMan__oldDate__c()))) &&
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
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
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
        if (getCapMan__Account__c() != null) {
            _hashCode += getCapMan__Account__c().hashCode();
        }
        if (getCapMan__Account__r() != null) {
            _hashCode += getCapMan__Account__r().hashCode();
        }
        if (getCapMan__Balance_Sheet__c() != null) {
            _hashCode += getCapMan__Balance_Sheet__c().hashCode();
        }
        if (getCapMan__Balance_Sheet__r() != null) {
            _hashCode += getCapMan__Balance_Sheet__r().hashCode();
        }
        if (getCapMan__ChiefExecutiveOfficer__c() != null) {
            _hashCode += getCapMan__ChiefExecutiveOfficer__c().hashCode();
        }
        if (getCapMan__ChiefExecutiveOfficer__r() != null) {
            _hashCode += getCapMan__ChiefExecutiveOfficer__r().hashCode();
        }
        if (getCapMan__City__c() != null) {
            _hashCode += getCapMan__City__c().hashCode();
        }
        if (getCapMan__Comments__c() != null) {
            _hashCode += getCapMan__Comments__c().hashCode();
        }
        if (getCapMan__CountInSummary__c() != null) {
            _hashCode += getCapMan__CountInSummary__c().hashCode();
        }
        if (getCapMan__Country__c() != null) {
            _hashCode += getCapMan__Country__c().hashCode();
        }
        if (getCapMan__DateClosed__c() != null) {
            _hashCode += getCapMan__DateClosed__c().hashCode();
        }
        if (getCapMan__DateReceived__c() != null) {
            _hashCode += getCapMan__DateReceived__c().hashCode();
        }
        if (getCapMan__DealStatus__c() != null) {
            _hashCode += getCapMan__DealStatus__c().hashCode();
        }
        if (getCapMan__Deal_Team_Leader__c() != null) {
            _hashCode += getCapMan__Deal_Team_Leader__c().hashCode();
        }
        if (getCapMan__Deal_Team_Leader__r() != null) {
            _hashCode += getCapMan__Deal_Team_Leader__r().hashCode();
        }
        if (getCapMan__Deal_Type__c() != null) {
            _hashCode += getCapMan__Deal_Type__c().hashCode();
        }
        if (getCapMan__FundStandalone__c() != null) {
            _hashCode += getCapMan__FundStandalone__c().hashCode();
        }
        if (getCapMan__Funding_Milestones__r() != null) {
            _hashCode += getCapMan__Funding_Milestones__r().hashCode();
        }
        if (getCapMan__Industry__c() != null) {
            _hashCode += getCapMan__Industry__c().hashCode();
        }
        if (getCapMan__Internal_Source__c() != null) {
            _hashCode += getCapMan__Internal_Source__c().hashCode();
        }
        if (getCapMan__Internal_Source__r() != null) {
            _hashCode += getCapMan__Internal_Source__r().hashCode();
        }
        if (getCapMan__InvestmentAmount__c() != null) {
            _hashCode += getCapMan__InvestmentAmount__c().hashCode();
        }
        if (getCapMan__InvestmentTheme__c() != null) {
            _hashCode += getCapMan__InvestmentTheme__c().hashCode();
        }
        if (getCapMan__LatestReceiveDate__c() != null) {
            _hashCode += getCapMan__LatestReceiveDate__c().hashCode();
        }
        if (getCapMan__LenderContact__c() != null) {
            _hashCode += getCapMan__LenderContact__c().hashCode();
        }
        if (getCapMan__LenderContact__r() != null) {
            _hashCode += getCapMan__LenderContact__r().hashCode();
        }
        if (getCapMan__Lender_Company__c() != null) {
            _hashCode += getCapMan__Lender_Company__c().hashCode();
        }
        if (getCapMan__Loan_Amount__c() != null) {
            _hashCode += getCapMan__Loan_Amount__c().hashCode();
        }
        if (getCapMan__LogoURL__c() != null) {
            _hashCode += getCapMan__LogoURL__c().hashCode();
        }
        if (getCapMan__Logo__c() != null) {
            _hashCode += getCapMan__Logo__c().hashCode();
        }
        if (getCapMan__Notes__c() != null) {
            _hashCode += getCapMan__Notes__c().hashCode();
        }
        if (getCapMan__OfferingSize__c() != null) {
            _hashCode += getCapMan__OfferingSize__c().hashCode();
        }
        if (getCapMan__Offering_Type__c() != null) {
            _hashCode += getCapMan__Offering_Type__c().hashCode();
        }
        if (getCapMan__OldDealTeamLeader__c() != null) {
            _hashCode += getCapMan__OldDealTeamLeader__c().hashCode();
        }
        if (getCapMan__OriginalLeader__c() != null) {
            _hashCode += getCapMan__OriginalLeader__c().hashCode();
        }
        if (getCapMan__Pipeline_Event__r() != null) {
            _hashCode += getCapMan__Pipeline_Event__r().hashCode();
        }
        if (getCapMan__PremoneyValuation__c() != null) {
            _hashCode += getCapMan__PremoneyValuation__c().hashCode();
        }
        if (getCapMan__Referral_Company__c() != null) {
            _hashCode += getCapMan__Referral_Company__c().hashCode();
        }
        if (getCapMan__Referred_From__c() != null) {
            _hashCode += getCapMan__Referred_From__c().hashCode();
        }
        if (getCapMan__Referred_From__r() != null) {
            _hashCode += getCapMan__Referred_From__r().hashCode();
        }
        if (getCapMan__RegionCopy__c() != null) {
            _hashCode += getCapMan__RegionCopy__c().hashCode();
        }
        if (getCapMan__Region__c() != null) {
            _hashCode += getCapMan__Region__c().hashCode();
        }
        if (getCapMan__Score__c() != null) {
            _hashCode += getCapMan__Score__c().hashCode();
        }
        if (getCapMan__Secondary_Person__c() != null) {
            _hashCode += getCapMan__Secondary_Person__c().hashCode();
        }
        if (getCapMan__Secondary_Person__r() != null) {
            _hashCode += getCapMan__Secondary_Person__r().hashCode();
        }
        if (getCapMan__SecurityOffered__c() != null) {
            _hashCode += getCapMan__SecurityOffered__c().hashCode();
        }
        if (getCapMan__Security_Type__c() != null) {
            _hashCode += getCapMan__Security_Type__c().hashCode();
        }
        if (getCapMan__SourceType__c() != null) {
            _hashCode += getCapMan__SourceType__c().hashCode();
        }
        if (getCapMan__State__c() != null) {
            _hashCode += getCapMan__State__c().hashCode();
        }
        if (getCapMan__Sub_Industry__c() != null) {
            _hashCode += getCapMan__Sub_Industry__c().hashCode();
        }
        if (getCapMan__companyname__c() != null) {
            _hashCode += getCapMan__companyname__c().hashCode();
        }
        if (getCapMan__oldDate__c() != null) {
            _hashCode += getCapMan__oldDate__c().hashCode();
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
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Pipeline__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pipeline__c"));
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
        elemField.setFieldName("capMan__Balance_Sheet__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Balance_Sheet__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Balance_Sheet__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Balance_Sheet__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Balance_Sheet__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ChiefExecutiveOfficer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ChiefExecutiveOfficer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ChiefExecutiveOfficer__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ChiefExecutiveOfficer__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__City__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__City__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CountInSummary__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CountInSummary__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Country__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Country__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DateClosed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DateClosed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DateReceived__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DateReceived__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DealStatus__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DealStatus__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Deal_Team_Leader__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Deal_Team_Leader__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Deal_Team_Leader__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Deal_Team_Leader__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Deal_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Deal_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FundStandalone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FundStandalone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Funding_Milestones__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Funding_Milestones__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("capMan__Internal_Source__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Internal_Source__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Internal_Source__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Internal_Source__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__InvestmentAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__InvestmentAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__InvestmentTheme__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__InvestmentTheme__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LatestReceiveDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LatestReceiveDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LenderContact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LenderContact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LenderContact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LenderContact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Lender_Company__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Lender_Company__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Loan_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Loan_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__LogoURL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__LogoURL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Logo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Logo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OfferingSize__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OfferingSize__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Offering_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Offering_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OldDealTeamLeader__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OldDealTeamLeader__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__OriginalLeader__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OriginalLeader__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Pipeline_Event__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Pipeline_Event__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PremoneyValuation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PremoneyValuation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Referral_Company__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Referral_Company__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Referred_From__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Referred_From__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Referred_From__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Referred_From__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RegionCopy__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegionCopy__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Region__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Region__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Secondary_Person__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Secondary_Person__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Secondary_Person__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Secondary_Person__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SecurityOffered__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityOffered__c"));
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
        elemField.setFieldName("capMan__SourceType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SourceType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__State__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__State__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__companyname__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__companyname__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__oldDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__oldDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
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
