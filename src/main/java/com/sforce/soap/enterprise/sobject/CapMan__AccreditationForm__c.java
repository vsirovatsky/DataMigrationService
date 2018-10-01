/**
 * CapMan__AccreditationForm__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__AccreditationForm__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__AccreditedEntityAnswer__c;

    private java.lang.String capMan__AccreditedEntityDescription__c;

    private java.lang.String capMan__AdditionalStepsAnswer__c;

    private java.lang.String capMan__AdditionalStepsDescription__c;

    private java.lang.String capMan__AnnualEarningsOne__c;

    private java.lang.String capMan__AnnualEarningsThree__c;

    private java.lang.String capMan__AnnualEarningsTwo__c;

    private java.lang.String capMan__AnnualIncome__c;

    private java.lang.String capMan__CanAffordRiskAnswer__c;

    private java.lang.String capMan__CanAffordRiskDescription2__c;

    private java.lang.String capMan__CanAffordRiskDescription__c;

    private java.lang.String capMan__DisclaimerDescription__c;

    private java.lang.String capMan__DueDiligenceAnswer__c;

    private java.lang.String capMan__DueDiligenceDescription__c;

    private java.lang.String capMan__EntityDescriptions__c;

    private java.lang.String capMan__IndividualDescriptions__c;

    private java.lang.String capMan__RegisteredName__c;

    private com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__RegisteredName__r;

    private java.lang.String capMan__SignatureAnswer__c;

    private java.lang.String capMan__SignatureDescription__c;

    private java.lang.String capMan__USPersonAnswer__c;

    private java.lang.String capMan__USPersonDescription__c;

    private java.lang.Boolean capMan__isEntity__c;

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

    public CapMan__AccreditationForm__c() {
    }

    public CapMan__AccreditationForm__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__AccreditedEntityAnswer__c,
           java.lang.String capMan__AccreditedEntityDescription__c,
           java.lang.String capMan__AdditionalStepsAnswer__c,
           java.lang.String capMan__AdditionalStepsDescription__c,
           java.lang.String capMan__AnnualEarningsOne__c,
           java.lang.String capMan__AnnualEarningsThree__c,
           java.lang.String capMan__AnnualEarningsTwo__c,
           java.lang.String capMan__AnnualIncome__c,
           java.lang.String capMan__CanAffordRiskAnswer__c,
           java.lang.String capMan__CanAffordRiskDescription2__c,
           java.lang.String capMan__CanAffordRiskDescription__c,
           java.lang.String capMan__DisclaimerDescription__c,
           java.lang.String capMan__DueDiligenceAnswer__c,
           java.lang.String capMan__DueDiligenceDescription__c,
           java.lang.String capMan__EntityDescriptions__c,
           java.lang.String capMan__IndividualDescriptions__c,
           java.lang.String capMan__RegisteredName__c,
           com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__RegisteredName__r,
           java.lang.String capMan__SignatureAnswer__c,
           java.lang.String capMan__SignatureDescription__c,
           java.lang.String capMan__USPersonAnswer__c,
           java.lang.String capMan__USPersonDescription__c,
           java.lang.Boolean capMan__isEntity__c,
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
        this.capMan__AccreditedEntityAnswer__c = capMan__AccreditedEntityAnswer__c;
        this.capMan__AccreditedEntityDescription__c = capMan__AccreditedEntityDescription__c;
        this.capMan__AdditionalStepsAnswer__c = capMan__AdditionalStepsAnswer__c;
        this.capMan__AdditionalStepsDescription__c = capMan__AdditionalStepsDescription__c;
        this.capMan__AnnualEarningsOne__c = capMan__AnnualEarningsOne__c;
        this.capMan__AnnualEarningsThree__c = capMan__AnnualEarningsThree__c;
        this.capMan__AnnualEarningsTwo__c = capMan__AnnualEarningsTwo__c;
        this.capMan__AnnualIncome__c = capMan__AnnualIncome__c;
        this.capMan__CanAffordRiskAnswer__c = capMan__CanAffordRiskAnswer__c;
        this.capMan__CanAffordRiskDescription2__c = capMan__CanAffordRiskDescription2__c;
        this.capMan__CanAffordRiskDescription__c = capMan__CanAffordRiskDescription__c;
        this.capMan__DisclaimerDescription__c = capMan__DisclaimerDescription__c;
        this.capMan__DueDiligenceAnswer__c = capMan__DueDiligenceAnswer__c;
        this.capMan__DueDiligenceDescription__c = capMan__DueDiligenceDescription__c;
        this.capMan__EntityDescriptions__c = capMan__EntityDescriptions__c;
        this.capMan__IndividualDescriptions__c = capMan__IndividualDescriptions__c;
        this.capMan__RegisteredName__c = capMan__RegisteredName__c;
        this.capMan__RegisteredName__r = capMan__RegisteredName__r;
        this.capMan__SignatureAnswer__c = capMan__SignatureAnswer__c;
        this.capMan__SignatureDescription__c = capMan__SignatureDescription__c;
        this.capMan__USPersonAnswer__c = capMan__USPersonAnswer__c;
        this.capMan__USPersonDescription__c = capMan__USPersonDescription__c;
        this.capMan__isEntity__c = capMan__isEntity__c;
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
     * Gets the attachments value for this CapMan__AccreditationForm__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__AccreditationForm__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__AccreditedEntityAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AccreditedEntityAnswer__c
     */
    public java.lang.String getCapMan__AccreditedEntityAnswer__c() {
        return capMan__AccreditedEntityAnswer__c;
    }


    /**
     * Sets the capMan__AccreditedEntityAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AccreditedEntityAnswer__c
     */
    public void setCapMan__AccreditedEntityAnswer__c(java.lang.String capMan__AccreditedEntityAnswer__c) {
        this.capMan__AccreditedEntityAnswer__c = capMan__AccreditedEntityAnswer__c;
    }


    /**
     * Gets the capMan__AccreditedEntityDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AccreditedEntityDescription__c
     */
    public java.lang.String getCapMan__AccreditedEntityDescription__c() {
        return capMan__AccreditedEntityDescription__c;
    }


    /**
     * Sets the capMan__AccreditedEntityDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AccreditedEntityDescription__c
     */
    public void setCapMan__AccreditedEntityDescription__c(java.lang.String capMan__AccreditedEntityDescription__c) {
        this.capMan__AccreditedEntityDescription__c = capMan__AccreditedEntityDescription__c;
    }


    /**
     * Gets the capMan__AdditionalStepsAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AdditionalStepsAnswer__c
     */
    public java.lang.String getCapMan__AdditionalStepsAnswer__c() {
        return capMan__AdditionalStepsAnswer__c;
    }


    /**
     * Sets the capMan__AdditionalStepsAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AdditionalStepsAnswer__c
     */
    public void setCapMan__AdditionalStepsAnswer__c(java.lang.String capMan__AdditionalStepsAnswer__c) {
        this.capMan__AdditionalStepsAnswer__c = capMan__AdditionalStepsAnswer__c;
    }


    /**
     * Gets the capMan__AdditionalStepsDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AdditionalStepsDescription__c
     */
    public java.lang.String getCapMan__AdditionalStepsDescription__c() {
        return capMan__AdditionalStepsDescription__c;
    }


    /**
     * Sets the capMan__AdditionalStepsDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AdditionalStepsDescription__c
     */
    public void setCapMan__AdditionalStepsDescription__c(java.lang.String capMan__AdditionalStepsDescription__c) {
        this.capMan__AdditionalStepsDescription__c = capMan__AdditionalStepsDescription__c;
    }


    /**
     * Gets the capMan__AnnualEarningsOne__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AnnualEarningsOne__c
     */
    public java.lang.String getCapMan__AnnualEarningsOne__c() {
        return capMan__AnnualEarningsOne__c;
    }


    /**
     * Sets the capMan__AnnualEarningsOne__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AnnualEarningsOne__c
     */
    public void setCapMan__AnnualEarningsOne__c(java.lang.String capMan__AnnualEarningsOne__c) {
        this.capMan__AnnualEarningsOne__c = capMan__AnnualEarningsOne__c;
    }


    /**
     * Gets the capMan__AnnualEarningsThree__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AnnualEarningsThree__c
     */
    public java.lang.String getCapMan__AnnualEarningsThree__c() {
        return capMan__AnnualEarningsThree__c;
    }


    /**
     * Sets the capMan__AnnualEarningsThree__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AnnualEarningsThree__c
     */
    public void setCapMan__AnnualEarningsThree__c(java.lang.String capMan__AnnualEarningsThree__c) {
        this.capMan__AnnualEarningsThree__c = capMan__AnnualEarningsThree__c;
    }


    /**
     * Gets the capMan__AnnualEarningsTwo__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AnnualEarningsTwo__c
     */
    public java.lang.String getCapMan__AnnualEarningsTwo__c() {
        return capMan__AnnualEarningsTwo__c;
    }


    /**
     * Sets the capMan__AnnualEarningsTwo__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AnnualEarningsTwo__c
     */
    public void setCapMan__AnnualEarningsTwo__c(java.lang.String capMan__AnnualEarningsTwo__c) {
        this.capMan__AnnualEarningsTwo__c = capMan__AnnualEarningsTwo__c;
    }


    /**
     * Gets the capMan__AnnualIncome__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__AnnualIncome__c
     */
    public java.lang.String getCapMan__AnnualIncome__c() {
        return capMan__AnnualIncome__c;
    }


    /**
     * Sets the capMan__AnnualIncome__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__AnnualIncome__c
     */
    public void setCapMan__AnnualIncome__c(java.lang.String capMan__AnnualIncome__c) {
        this.capMan__AnnualIncome__c = capMan__AnnualIncome__c;
    }


    /**
     * Gets the capMan__CanAffordRiskAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__CanAffordRiskAnswer__c
     */
    public java.lang.String getCapMan__CanAffordRiskAnswer__c() {
        return capMan__CanAffordRiskAnswer__c;
    }


    /**
     * Sets the capMan__CanAffordRiskAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__CanAffordRiskAnswer__c
     */
    public void setCapMan__CanAffordRiskAnswer__c(java.lang.String capMan__CanAffordRiskAnswer__c) {
        this.capMan__CanAffordRiskAnswer__c = capMan__CanAffordRiskAnswer__c;
    }


    /**
     * Gets the capMan__CanAffordRiskDescription2__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__CanAffordRiskDescription2__c
     */
    public java.lang.String getCapMan__CanAffordRiskDescription2__c() {
        return capMan__CanAffordRiskDescription2__c;
    }


    /**
     * Sets the capMan__CanAffordRiskDescription2__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__CanAffordRiskDescription2__c
     */
    public void setCapMan__CanAffordRiskDescription2__c(java.lang.String capMan__CanAffordRiskDescription2__c) {
        this.capMan__CanAffordRiskDescription2__c = capMan__CanAffordRiskDescription2__c;
    }


    /**
     * Gets the capMan__CanAffordRiskDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__CanAffordRiskDescription__c
     */
    public java.lang.String getCapMan__CanAffordRiskDescription__c() {
        return capMan__CanAffordRiskDescription__c;
    }


    /**
     * Sets the capMan__CanAffordRiskDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__CanAffordRiskDescription__c
     */
    public void setCapMan__CanAffordRiskDescription__c(java.lang.String capMan__CanAffordRiskDescription__c) {
        this.capMan__CanAffordRiskDescription__c = capMan__CanAffordRiskDescription__c;
    }


    /**
     * Gets the capMan__DisclaimerDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__DisclaimerDescription__c
     */
    public java.lang.String getCapMan__DisclaimerDescription__c() {
        return capMan__DisclaimerDescription__c;
    }


    /**
     * Sets the capMan__DisclaimerDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__DisclaimerDescription__c
     */
    public void setCapMan__DisclaimerDescription__c(java.lang.String capMan__DisclaimerDescription__c) {
        this.capMan__DisclaimerDescription__c = capMan__DisclaimerDescription__c;
    }


    /**
     * Gets the capMan__DueDiligenceAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__DueDiligenceAnswer__c
     */
    public java.lang.String getCapMan__DueDiligenceAnswer__c() {
        return capMan__DueDiligenceAnswer__c;
    }


    /**
     * Sets the capMan__DueDiligenceAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__DueDiligenceAnswer__c
     */
    public void setCapMan__DueDiligenceAnswer__c(java.lang.String capMan__DueDiligenceAnswer__c) {
        this.capMan__DueDiligenceAnswer__c = capMan__DueDiligenceAnswer__c;
    }


    /**
     * Gets the capMan__DueDiligenceDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__DueDiligenceDescription__c
     */
    public java.lang.String getCapMan__DueDiligenceDescription__c() {
        return capMan__DueDiligenceDescription__c;
    }


    /**
     * Sets the capMan__DueDiligenceDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__DueDiligenceDescription__c
     */
    public void setCapMan__DueDiligenceDescription__c(java.lang.String capMan__DueDiligenceDescription__c) {
        this.capMan__DueDiligenceDescription__c = capMan__DueDiligenceDescription__c;
    }


    /**
     * Gets the capMan__EntityDescriptions__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__EntityDescriptions__c
     */
    public java.lang.String getCapMan__EntityDescriptions__c() {
        return capMan__EntityDescriptions__c;
    }


    /**
     * Sets the capMan__EntityDescriptions__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__EntityDescriptions__c
     */
    public void setCapMan__EntityDescriptions__c(java.lang.String capMan__EntityDescriptions__c) {
        this.capMan__EntityDescriptions__c = capMan__EntityDescriptions__c;
    }


    /**
     * Gets the capMan__IndividualDescriptions__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__IndividualDescriptions__c
     */
    public java.lang.String getCapMan__IndividualDescriptions__c() {
        return capMan__IndividualDescriptions__c;
    }


    /**
     * Sets the capMan__IndividualDescriptions__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__IndividualDescriptions__c
     */
    public void setCapMan__IndividualDescriptions__c(java.lang.String capMan__IndividualDescriptions__c) {
        this.capMan__IndividualDescriptions__c = capMan__IndividualDescriptions__c;
    }


    /**
     * Gets the capMan__RegisteredName__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__RegisteredName__c
     */
    public java.lang.String getCapMan__RegisteredName__c() {
        return capMan__RegisteredName__c;
    }


    /**
     * Sets the capMan__RegisteredName__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__RegisteredName__c
     */
    public void setCapMan__RegisteredName__c(java.lang.String capMan__RegisteredName__c) {
        this.capMan__RegisteredName__c = capMan__RegisteredName__c;
    }


    /**
     * Gets the capMan__RegisteredName__r value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__RegisteredName__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c getCapMan__RegisteredName__r() {
        return capMan__RegisteredName__r;
    }


    /**
     * Sets the capMan__RegisteredName__r value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__RegisteredName__r
     */
    public void setCapMan__RegisteredName__r(com.sforce.soap.enterprise.sobject.CapMan__RegisteredName__c capMan__RegisteredName__r) {
        this.capMan__RegisteredName__r = capMan__RegisteredName__r;
    }


    /**
     * Gets the capMan__SignatureAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__SignatureAnswer__c
     */
    public java.lang.String getCapMan__SignatureAnswer__c() {
        return capMan__SignatureAnswer__c;
    }


    /**
     * Sets the capMan__SignatureAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__SignatureAnswer__c
     */
    public void setCapMan__SignatureAnswer__c(java.lang.String capMan__SignatureAnswer__c) {
        this.capMan__SignatureAnswer__c = capMan__SignatureAnswer__c;
    }


    /**
     * Gets the capMan__SignatureDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__SignatureDescription__c
     */
    public java.lang.String getCapMan__SignatureDescription__c() {
        return capMan__SignatureDescription__c;
    }


    /**
     * Sets the capMan__SignatureDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__SignatureDescription__c
     */
    public void setCapMan__SignatureDescription__c(java.lang.String capMan__SignatureDescription__c) {
        this.capMan__SignatureDescription__c = capMan__SignatureDescription__c;
    }


    /**
     * Gets the capMan__USPersonAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__USPersonAnswer__c
     */
    public java.lang.String getCapMan__USPersonAnswer__c() {
        return capMan__USPersonAnswer__c;
    }


    /**
     * Sets the capMan__USPersonAnswer__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__USPersonAnswer__c
     */
    public void setCapMan__USPersonAnswer__c(java.lang.String capMan__USPersonAnswer__c) {
        this.capMan__USPersonAnswer__c = capMan__USPersonAnswer__c;
    }


    /**
     * Gets the capMan__USPersonDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__USPersonDescription__c
     */
    public java.lang.String getCapMan__USPersonDescription__c() {
        return capMan__USPersonDescription__c;
    }


    /**
     * Sets the capMan__USPersonDescription__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__USPersonDescription__c
     */
    public void setCapMan__USPersonDescription__c(java.lang.String capMan__USPersonDescription__c) {
        this.capMan__USPersonDescription__c = capMan__USPersonDescription__c;
    }


    /**
     * Gets the capMan__isEntity__c value for this CapMan__AccreditationForm__c.
     * 
     * @return capMan__isEntity__c
     */
    public java.lang.Boolean getCapMan__isEntity__c() {
        return capMan__isEntity__c;
    }


    /**
     * Sets the capMan__isEntity__c value for this CapMan__AccreditationForm__c.
     * 
     * @param capMan__isEntity__c
     */
    public void setCapMan__isEntity__c(java.lang.Boolean capMan__isEntity__c) {
        this.capMan__isEntity__c = capMan__isEntity__c;
    }


    /**
     * Gets the createdBy value for this CapMan__AccreditationForm__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__AccreditationForm__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__AccreditationForm__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__AccreditationForm__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__AccreditationForm__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__AccreditationForm__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__AccreditationForm__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__AccreditationForm__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__AccreditationForm__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__AccreditationForm__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__AccreditationForm__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__AccreditationForm__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__AccreditationForm__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__AccreditationForm__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__AccreditationForm__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__AccreditationForm__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__AccreditationForm__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__AccreditationForm__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__AccreditationForm__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__AccreditationForm__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__AccreditationForm__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__AccreditationForm__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__AccreditationForm__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__AccreditationForm__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this CapMan__AccreditationForm__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__AccreditationForm__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__AccreditationForm__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__AccreditationForm__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__AccreditationForm__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__AccreditationForm__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__AccreditationForm__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__AccreditationForm__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__AccreditationForm__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__AccreditationForm__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__AccreditationForm__c)) return false;
        CapMan__AccreditationForm__c other = (CapMan__AccreditationForm__c) obj;
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
            ((this.capMan__AccreditedEntityAnswer__c==null && other.getCapMan__AccreditedEntityAnswer__c()==null) || 
             (this.capMan__AccreditedEntityAnswer__c!=null &&
              this.capMan__AccreditedEntityAnswer__c.equals(other.getCapMan__AccreditedEntityAnswer__c()))) &&
            ((this.capMan__AccreditedEntityDescription__c==null && other.getCapMan__AccreditedEntityDescription__c()==null) || 
             (this.capMan__AccreditedEntityDescription__c!=null &&
              this.capMan__AccreditedEntityDescription__c.equals(other.getCapMan__AccreditedEntityDescription__c()))) &&
            ((this.capMan__AdditionalStepsAnswer__c==null && other.getCapMan__AdditionalStepsAnswer__c()==null) || 
             (this.capMan__AdditionalStepsAnswer__c!=null &&
              this.capMan__AdditionalStepsAnswer__c.equals(other.getCapMan__AdditionalStepsAnswer__c()))) &&
            ((this.capMan__AdditionalStepsDescription__c==null && other.getCapMan__AdditionalStepsDescription__c()==null) || 
             (this.capMan__AdditionalStepsDescription__c!=null &&
              this.capMan__AdditionalStepsDescription__c.equals(other.getCapMan__AdditionalStepsDescription__c()))) &&
            ((this.capMan__AnnualEarningsOne__c==null && other.getCapMan__AnnualEarningsOne__c()==null) || 
             (this.capMan__AnnualEarningsOne__c!=null &&
              this.capMan__AnnualEarningsOne__c.equals(other.getCapMan__AnnualEarningsOne__c()))) &&
            ((this.capMan__AnnualEarningsThree__c==null && other.getCapMan__AnnualEarningsThree__c()==null) || 
             (this.capMan__AnnualEarningsThree__c!=null &&
              this.capMan__AnnualEarningsThree__c.equals(other.getCapMan__AnnualEarningsThree__c()))) &&
            ((this.capMan__AnnualEarningsTwo__c==null && other.getCapMan__AnnualEarningsTwo__c()==null) || 
             (this.capMan__AnnualEarningsTwo__c!=null &&
              this.capMan__AnnualEarningsTwo__c.equals(other.getCapMan__AnnualEarningsTwo__c()))) &&
            ((this.capMan__AnnualIncome__c==null && other.getCapMan__AnnualIncome__c()==null) || 
             (this.capMan__AnnualIncome__c!=null &&
              this.capMan__AnnualIncome__c.equals(other.getCapMan__AnnualIncome__c()))) &&
            ((this.capMan__CanAffordRiskAnswer__c==null && other.getCapMan__CanAffordRiskAnswer__c()==null) || 
             (this.capMan__CanAffordRiskAnswer__c!=null &&
              this.capMan__CanAffordRiskAnswer__c.equals(other.getCapMan__CanAffordRiskAnswer__c()))) &&
            ((this.capMan__CanAffordRiskDescription2__c==null && other.getCapMan__CanAffordRiskDescription2__c()==null) || 
             (this.capMan__CanAffordRiskDescription2__c!=null &&
              this.capMan__CanAffordRiskDescription2__c.equals(other.getCapMan__CanAffordRiskDescription2__c()))) &&
            ((this.capMan__CanAffordRiskDescription__c==null && other.getCapMan__CanAffordRiskDescription__c()==null) || 
             (this.capMan__CanAffordRiskDescription__c!=null &&
              this.capMan__CanAffordRiskDescription__c.equals(other.getCapMan__CanAffordRiskDescription__c()))) &&
            ((this.capMan__DisclaimerDescription__c==null && other.getCapMan__DisclaimerDescription__c()==null) || 
             (this.capMan__DisclaimerDescription__c!=null &&
              this.capMan__DisclaimerDescription__c.equals(other.getCapMan__DisclaimerDescription__c()))) &&
            ((this.capMan__DueDiligenceAnswer__c==null && other.getCapMan__DueDiligenceAnswer__c()==null) || 
             (this.capMan__DueDiligenceAnswer__c!=null &&
              this.capMan__DueDiligenceAnswer__c.equals(other.getCapMan__DueDiligenceAnswer__c()))) &&
            ((this.capMan__DueDiligenceDescription__c==null && other.getCapMan__DueDiligenceDescription__c()==null) || 
             (this.capMan__DueDiligenceDescription__c!=null &&
              this.capMan__DueDiligenceDescription__c.equals(other.getCapMan__DueDiligenceDescription__c()))) &&
            ((this.capMan__EntityDescriptions__c==null && other.getCapMan__EntityDescriptions__c()==null) || 
             (this.capMan__EntityDescriptions__c!=null &&
              this.capMan__EntityDescriptions__c.equals(other.getCapMan__EntityDescriptions__c()))) &&
            ((this.capMan__IndividualDescriptions__c==null && other.getCapMan__IndividualDescriptions__c()==null) || 
             (this.capMan__IndividualDescriptions__c!=null &&
              this.capMan__IndividualDescriptions__c.equals(other.getCapMan__IndividualDescriptions__c()))) &&
            ((this.capMan__RegisteredName__c==null && other.getCapMan__RegisteredName__c()==null) || 
             (this.capMan__RegisteredName__c!=null &&
              this.capMan__RegisteredName__c.equals(other.getCapMan__RegisteredName__c()))) &&
            ((this.capMan__RegisteredName__r==null && other.getCapMan__RegisteredName__r()==null) || 
             (this.capMan__RegisteredName__r!=null &&
              this.capMan__RegisteredName__r.equals(other.getCapMan__RegisteredName__r()))) &&
            ((this.capMan__SignatureAnswer__c==null && other.getCapMan__SignatureAnswer__c()==null) || 
             (this.capMan__SignatureAnswer__c!=null &&
              this.capMan__SignatureAnswer__c.equals(other.getCapMan__SignatureAnswer__c()))) &&
            ((this.capMan__SignatureDescription__c==null && other.getCapMan__SignatureDescription__c()==null) || 
             (this.capMan__SignatureDescription__c!=null &&
              this.capMan__SignatureDescription__c.equals(other.getCapMan__SignatureDescription__c()))) &&
            ((this.capMan__USPersonAnswer__c==null && other.getCapMan__USPersonAnswer__c()==null) || 
             (this.capMan__USPersonAnswer__c!=null &&
              this.capMan__USPersonAnswer__c.equals(other.getCapMan__USPersonAnswer__c()))) &&
            ((this.capMan__USPersonDescription__c==null && other.getCapMan__USPersonDescription__c()==null) || 
             (this.capMan__USPersonDescription__c!=null &&
              this.capMan__USPersonDescription__c.equals(other.getCapMan__USPersonDescription__c()))) &&
            ((this.capMan__isEntity__c==null && other.getCapMan__isEntity__c()==null) || 
             (this.capMan__isEntity__c!=null &&
              this.capMan__isEntity__c.equals(other.getCapMan__isEntity__c()))) &&
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
        if (getCapMan__AccreditedEntityAnswer__c() != null) {
            _hashCode += getCapMan__AccreditedEntityAnswer__c().hashCode();
        }
        if (getCapMan__AccreditedEntityDescription__c() != null) {
            _hashCode += getCapMan__AccreditedEntityDescription__c().hashCode();
        }
        if (getCapMan__AdditionalStepsAnswer__c() != null) {
            _hashCode += getCapMan__AdditionalStepsAnswer__c().hashCode();
        }
        if (getCapMan__AdditionalStepsDescription__c() != null) {
            _hashCode += getCapMan__AdditionalStepsDescription__c().hashCode();
        }
        if (getCapMan__AnnualEarningsOne__c() != null) {
            _hashCode += getCapMan__AnnualEarningsOne__c().hashCode();
        }
        if (getCapMan__AnnualEarningsThree__c() != null) {
            _hashCode += getCapMan__AnnualEarningsThree__c().hashCode();
        }
        if (getCapMan__AnnualEarningsTwo__c() != null) {
            _hashCode += getCapMan__AnnualEarningsTwo__c().hashCode();
        }
        if (getCapMan__AnnualIncome__c() != null) {
            _hashCode += getCapMan__AnnualIncome__c().hashCode();
        }
        if (getCapMan__CanAffordRiskAnswer__c() != null) {
            _hashCode += getCapMan__CanAffordRiskAnswer__c().hashCode();
        }
        if (getCapMan__CanAffordRiskDescription2__c() != null) {
            _hashCode += getCapMan__CanAffordRiskDescription2__c().hashCode();
        }
        if (getCapMan__CanAffordRiskDescription__c() != null) {
            _hashCode += getCapMan__CanAffordRiskDescription__c().hashCode();
        }
        if (getCapMan__DisclaimerDescription__c() != null) {
            _hashCode += getCapMan__DisclaimerDescription__c().hashCode();
        }
        if (getCapMan__DueDiligenceAnswer__c() != null) {
            _hashCode += getCapMan__DueDiligenceAnswer__c().hashCode();
        }
        if (getCapMan__DueDiligenceDescription__c() != null) {
            _hashCode += getCapMan__DueDiligenceDescription__c().hashCode();
        }
        if (getCapMan__EntityDescriptions__c() != null) {
            _hashCode += getCapMan__EntityDescriptions__c().hashCode();
        }
        if (getCapMan__IndividualDescriptions__c() != null) {
            _hashCode += getCapMan__IndividualDescriptions__c().hashCode();
        }
        if (getCapMan__RegisteredName__c() != null) {
            _hashCode += getCapMan__RegisteredName__c().hashCode();
        }
        if (getCapMan__RegisteredName__r() != null) {
            _hashCode += getCapMan__RegisteredName__r().hashCode();
        }
        if (getCapMan__SignatureAnswer__c() != null) {
            _hashCode += getCapMan__SignatureAnswer__c().hashCode();
        }
        if (getCapMan__SignatureDescription__c() != null) {
            _hashCode += getCapMan__SignatureDescription__c().hashCode();
        }
        if (getCapMan__USPersonAnswer__c() != null) {
            _hashCode += getCapMan__USPersonAnswer__c().hashCode();
        }
        if (getCapMan__USPersonDescription__c() != null) {
            _hashCode += getCapMan__USPersonDescription__c().hashCode();
        }
        if (getCapMan__isEntity__c() != null) {
            _hashCode += getCapMan__isEntity__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__AccreditationForm__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccreditationForm__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AccreditedEntityAnswer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccreditedEntityAnswer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AccreditedEntityDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccreditedEntityDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AdditionalStepsAnswer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AdditionalStepsAnswer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AdditionalStepsDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AdditionalStepsDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AnnualEarningsOne__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AnnualEarningsOne__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AnnualEarningsThree__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AnnualEarningsThree__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AnnualEarningsTwo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AnnualEarningsTwo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AnnualIncome__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AnnualIncome__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CanAffordRiskAnswer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CanAffordRiskAnswer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CanAffordRiskDescription2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CanAffordRiskDescription2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CanAffordRiskDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CanAffordRiskDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DisclaimerDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DisclaimerDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DueDiligenceAnswer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DueDiligenceAnswer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__DueDiligenceDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__DueDiligenceDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EntityDescriptions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EntityDescriptions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__IndividualDescriptions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__IndividualDescriptions__c"));
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
        elemField.setFieldName("capMan__SignatureAnswer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SignatureAnswer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__SignatureDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SignatureDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__USPersonAnswer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__USPersonAnswer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__USPersonDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__USPersonDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__isEntity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__isEntity__c"));
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
