/**
 * CapMan__Options_Expense__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__Options_Expense__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double capMan__ActualExpense__c;

    private java.lang.Double capMan__AdjustedUnamortizedExpense__c;

    private java.lang.Double capMan__CarryForward__c;

    private java.util.Date capMan__Date__c;

    private java.lang.Double capMan__ExpenseAdj__c;

    private java.lang.Double capMan__ExpenseAdjustment__c;

    private java.util.Date capMan__Expense_Date__c;

    private java.lang.String capMan__Grant_Number__c;

    private java.lang.Double capMan__OptionValue__c;

    private java.lang.String capMan__Optionee__c;

    private java.lang.Double capMan__Period_Expense__c;

    private java.lang.Double capMan__PriorAmortized__c;

    private java.lang.Double capMan__RegrantAmount__c;

    private java.util.Date capMan__RegrantDate__c;

    private java.lang.Double capMan__Shares_Granted__c;

    private java.lang.String capMan__Transaction__c;

    private com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Transaction__r;

    private java.lang.Double capMan__Unamortized_Expense__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currencyIsoCode;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

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

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public CapMan__Options_Expense__c() {
    }

    public CapMan__Options_Expense__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double capMan__ActualExpense__c,
           java.lang.Double capMan__AdjustedUnamortizedExpense__c,
           java.lang.Double capMan__CarryForward__c,
           java.util.Date capMan__Date__c,
           java.lang.Double capMan__ExpenseAdj__c,
           java.lang.Double capMan__ExpenseAdjustment__c,
           java.util.Date capMan__Expense_Date__c,
           java.lang.String capMan__Grant_Number__c,
           java.lang.Double capMan__OptionValue__c,
           java.lang.String capMan__Optionee__c,
           java.lang.Double capMan__Period_Expense__c,
           java.lang.Double capMan__PriorAmortized__c,
           java.lang.Double capMan__RegrantAmount__c,
           java.util.Date capMan__RegrantDate__c,
           java.lang.Double capMan__Shares_Granted__c,
           java.lang.String capMan__Transaction__c,
           com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Transaction__r,
           java.lang.Double capMan__Unamortized_Expense__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currencyIsoCode,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
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
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.capMan__ActualExpense__c = capMan__ActualExpense__c;
        this.capMan__AdjustedUnamortizedExpense__c = capMan__AdjustedUnamortizedExpense__c;
        this.capMan__CarryForward__c = capMan__CarryForward__c;
        this.capMan__Date__c = capMan__Date__c;
        this.capMan__ExpenseAdj__c = capMan__ExpenseAdj__c;
        this.capMan__ExpenseAdjustment__c = capMan__ExpenseAdjustment__c;
        this.capMan__Expense_Date__c = capMan__Expense_Date__c;
        this.capMan__Grant_Number__c = capMan__Grant_Number__c;
        this.capMan__OptionValue__c = capMan__OptionValue__c;
        this.capMan__Optionee__c = capMan__Optionee__c;
        this.capMan__Period_Expense__c = capMan__Period_Expense__c;
        this.capMan__PriorAmortized__c = capMan__PriorAmortized__c;
        this.capMan__RegrantAmount__c = capMan__RegrantAmount__c;
        this.capMan__RegrantDate__c = capMan__RegrantDate__c;
        this.capMan__Shares_Granted__c = capMan__Shares_Granted__c;
        this.capMan__Transaction__c = capMan__Transaction__c;
        this.capMan__Transaction__r = capMan__Transaction__r;
        this.capMan__Unamortized_Expense__c = capMan__Unamortized_Expense__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currencyIsoCode = currencyIsoCode;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
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
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this CapMan__Options_Expense__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__Options_Expense__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__Options_Expense__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__Options_Expense__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__ActualExpense__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__ActualExpense__c
     */
    public java.lang.Double getCapMan__ActualExpense__c() {
        return capMan__ActualExpense__c;
    }


    /**
     * Sets the capMan__ActualExpense__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__ActualExpense__c
     */
    public void setCapMan__ActualExpense__c(java.lang.Double capMan__ActualExpense__c) {
        this.capMan__ActualExpense__c = capMan__ActualExpense__c;
    }


    /**
     * Gets the capMan__AdjustedUnamortizedExpense__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__AdjustedUnamortizedExpense__c
     */
    public java.lang.Double getCapMan__AdjustedUnamortizedExpense__c() {
        return capMan__AdjustedUnamortizedExpense__c;
    }


    /**
     * Sets the capMan__AdjustedUnamortizedExpense__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__AdjustedUnamortizedExpense__c
     */
    public void setCapMan__AdjustedUnamortizedExpense__c(java.lang.Double capMan__AdjustedUnamortizedExpense__c) {
        this.capMan__AdjustedUnamortizedExpense__c = capMan__AdjustedUnamortizedExpense__c;
    }


    /**
     * Gets the capMan__CarryForward__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__CarryForward__c
     */
    public java.lang.Double getCapMan__CarryForward__c() {
        return capMan__CarryForward__c;
    }


    /**
     * Sets the capMan__CarryForward__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__CarryForward__c
     */
    public void setCapMan__CarryForward__c(java.lang.Double capMan__CarryForward__c) {
        this.capMan__CarryForward__c = capMan__CarryForward__c;
    }


    /**
     * Gets the capMan__Date__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Date__c
     */
    public java.util.Date getCapMan__Date__c() {
        return capMan__Date__c;
    }


    /**
     * Sets the capMan__Date__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Date__c
     */
    public void setCapMan__Date__c(java.util.Date capMan__Date__c) {
        this.capMan__Date__c = capMan__Date__c;
    }


    /**
     * Gets the capMan__ExpenseAdj__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__ExpenseAdj__c
     */
    public java.lang.Double getCapMan__ExpenseAdj__c() {
        return capMan__ExpenseAdj__c;
    }


    /**
     * Sets the capMan__ExpenseAdj__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__ExpenseAdj__c
     */
    public void setCapMan__ExpenseAdj__c(java.lang.Double capMan__ExpenseAdj__c) {
        this.capMan__ExpenseAdj__c = capMan__ExpenseAdj__c;
    }


    /**
     * Gets the capMan__ExpenseAdjustment__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__ExpenseAdjustment__c
     */
    public java.lang.Double getCapMan__ExpenseAdjustment__c() {
        return capMan__ExpenseAdjustment__c;
    }


    /**
     * Sets the capMan__ExpenseAdjustment__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__ExpenseAdjustment__c
     */
    public void setCapMan__ExpenseAdjustment__c(java.lang.Double capMan__ExpenseAdjustment__c) {
        this.capMan__ExpenseAdjustment__c = capMan__ExpenseAdjustment__c;
    }


    /**
     * Gets the capMan__Expense_Date__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Expense_Date__c
     */
    public java.util.Date getCapMan__Expense_Date__c() {
        return capMan__Expense_Date__c;
    }


    /**
     * Sets the capMan__Expense_Date__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Expense_Date__c
     */
    public void setCapMan__Expense_Date__c(java.util.Date capMan__Expense_Date__c) {
        this.capMan__Expense_Date__c = capMan__Expense_Date__c;
    }


    /**
     * Gets the capMan__Grant_Number__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Grant_Number__c
     */
    public java.lang.String getCapMan__Grant_Number__c() {
        return capMan__Grant_Number__c;
    }


    /**
     * Sets the capMan__Grant_Number__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Grant_Number__c
     */
    public void setCapMan__Grant_Number__c(java.lang.String capMan__Grant_Number__c) {
        this.capMan__Grant_Number__c = capMan__Grant_Number__c;
    }


    /**
     * Gets the capMan__OptionValue__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__OptionValue__c
     */
    public java.lang.Double getCapMan__OptionValue__c() {
        return capMan__OptionValue__c;
    }


    /**
     * Sets the capMan__OptionValue__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__OptionValue__c
     */
    public void setCapMan__OptionValue__c(java.lang.Double capMan__OptionValue__c) {
        this.capMan__OptionValue__c = capMan__OptionValue__c;
    }


    /**
     * Gets the capMan__Optionee__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Optionee__c
     */
    public java.lang.String getCapMan__Optionee__c() {
        return capMan__Optionee__c;
    }


    /**
     * Sets the capMan__Optionee__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Optionee__c
     */
    public void setCapMan__Optionee__c(java.lang.String capMan__Optionee__c) {
        this.capMan__Optionee__c = capMan__Optionee__c;
    }


    /**
     * Gets the capMan__Period_Expense__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Period_Expense__c
     */
    public java.lang.Double getCapMan__Period_Expense__c() {
        return capMan__Period_Expense__c;
    }


    /**
     * Sets the capMan__Period_Expense__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Period_Expense__c
     */
    public void setCapMan__Period_Expense__c(java.lang.Double capMan__Period_Expense__c) {
        this.capMan__Period_Expense__c = capMan__Period_Expense__c;
    }


    /**
     * Gets the capMan__PriorAmortized__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__PriorAmortized__c
     */
    public java.lang.Double getCapMan__PriorAmortized__c() {
        return capMan__PriorAmortized__c;
    }


    /**
     * Sets the capMan__PriorAmortized__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__PriorAmortized__c
     */
    public void setCapMan__PriorAmortized__c(java.lang.Double capMan__PriorAmortized__c) {
        this.capMan__PriorAmortized__c = capMan__PriorAmortized__c;
    }


    /**
     * Gets the capMan__RegrantAmount__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__RegrantAmount__c
     */
    public java.lang.Double getCapMan__RegrantAmount__c() {
        return capMan__RegrantAmount__c;
    }


    /**
     * Sets the capMan__RegrantAmount__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__RegrantAmount__c
     */
    public void setCapMan__RegrantAmount__c(java.lang.Double capMan__RegrantAmount__c) {
        this.capMan__RegrantAmount__c = capMan__RegrantAmount__c;
    }


    /**
     * Gets the capMan__RegrantDate__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__RegrantDate__c
     */
    public java.util.Date getCapMan__RegrantDate__c() {
        return capMan__RegrantDate__c;
    }


    /**
     * Sets the capMan__RegrantDate__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__RegrantDate__c
     */
    public void setCapMan__RegrantDate__c(java.util.Date capMan__RegrantDate__c) {
        this.capMan__RegrantDate__c = capMan__RegrantDate__c;
    }


    /**
     * Gets the capMan__Shares_Granted__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Shares_Granted__c
     */
    public java.lang.Double getCapMan__Shares_Granted__c() {
        return capMan__Shares_Granted__c;
    }


    /**
     * Sets the capMan__Shares_Granted__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Shares_Granted__c
     */
    public void setCapMan__Shares_Granted__c(java.lang.Double capMan__Shares_Granted__c) {
        this.capMan__Shares_Granted__c = capMan__Shares_Granted__c;
    }


    /**
     * Gets the capMan__Transaction__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Transaction__c
     */
    public java.lang.String getCapMan__Transaction__c() {
        return capMan__Transaction__c;
    }


    /**
     * Sets the capMan__Transaction__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Transaction__c
     */
    public void setCapMan__Transaction__c(java.lang.String capMan__Transaction__c) {
        this.capMan__Transaction__c = capMan__Transaction__c;
    }


    /**
     * Gets the capMan__Transaction__r value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Transaction__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c getCapMan__Transaction__r() {
        return capMan__Transaction__r;
    }


    /**
     * Sets the capMan__Transaction__r value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Transaction__r
     */
    public void setCapMan__Transaction__r(com.sforce.soap.enterprise.sobject.CapMan__SecurityTransaction__c capMan__Transaction__r) {
        this.capMan__Transaction__r = capMan__Transaction__r;
    }


    /**
     * Gets the capMan__Unamortized_Expense__c value for this CapMan__Options_Expense__c.
     * 
     * @return capMan__Unamortized_Expense__c
     */
    public java.lang.Double getCapMan__Unamortized_Expense__c() {
        return capMan__Unamortized_Expense__c;
    }


    /**
     * Sets the capMan__Unamortized_Expense__c value for this CapMan__Options_Expense__c.
     * 
     * @param capMan__Unamortized_Expense__c
     */
    public void setCapMan__Unamortized_Expense__c(java.lang.Double capMan__Unamortized_Expense__c) {
        this.capMan__Unamortized_Expense__c = capMan__Unamortized_Expense__c;
    }


    /**
     * Gets the createdBy value for this CapMan__Options_Expense__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__Options_Expense__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__Options_Expense__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__Options_Expense__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__Options_Expense__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__Options_Expense__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__Options_Expense__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__Options_Expense__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__Options_Expense__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__Options_Expense__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__Options_Expense__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__Options_Expense__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CapMan__Options_Expense__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__Options_Expense__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__Options_Expense__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__Options_Expense__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__Options_Expense__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__Options_Expense__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__Options_Expense__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__Options_Expense__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__Options_Expense__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__Options_Expense__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__Options_Expense__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__Options_Expense__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__Options_Expense__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__Options_Expense__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__Options_Expense__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__Options_Expense__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__Options_Expense__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__Options_Expense__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this CapMan__Options_Expense__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__Options_Expense__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__Options_Expense__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__Options_Expense__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__Options_Expense__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__Options_Expense__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__Options_Expense__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__Options_Expense__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__Options_Expense__c)) return false;
        CapMan__Options_Expense__c other = (CapMan__Options_Expense__c) obj;
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
            ((this.capMan__ActualExpense__c==null && other.getCapMan__ActualExpense__c()==null) || 
             (this.capMan__ActualExpense__c!=null &&
              this.capMan__ActualExpense__c.equals(other.getCapMan__ActualExpense__c()))) &&
            ((this.capMan__AdjustedUnamortizedExpense__c==null && other.getCapMan__AdjustedUnamortizedExpense__c()==null) || 
             (this.capMan__AdjustedUnamortizedExpense__c!=null &&
              this.capMan__AdjustedUnamortizedExpense__c.equals(other.getCapMan__AdjustedUnamortizedExpense__c()))) &&
            ((this.capMan__CarryForward__c==null && other.getCapMan__CarryForward__c()==null) || 
             (this.capMan__CarryForward__c!=null &&
              this.capMan__CarryForward__c.equals(other.getCapMan__CarryForward__c()))) &&
            ((this.capMan__Date__c==null && other.getCapMan__Date__c()==null) || 
             (this.capMan__Date__c!=null &&
              this.capMan__Date__c.equals(other.getCapMan__Date__c()))) &&
            ((this.capMan__ExpenseAdj__c==null && other.getCapMan__ExpenseAdj__c()==null) || 
             (this.capMan__ExpenseAdj__c!=null &&
              this.capMan__ExpenseAdj__c.equals(other.getCapMan__ExpenseAdj__c()))) &&
            ((this.capMan__ExpenseAdjustment__c==null && other.getCapMan__ExpenseAdjustment__c()==null) || 
             (this.capMan__ExpenseAdjustment__c!=null &&
              this.capMan__ExpenseAdjustment__c.equals(other.getCapMan__ExpenseAdjustment__c()))) &&
            ((this.capMan__Expense_Date__c==null && other.getCapMan__Expense_Date__c()==null) || 
             (this.capMan__Expense_Date__c!=null &&
              this.capMan__Expense_Date__c.equals(other.getCapMan__Expense_Date__c()))) &&
            ((this.capMan__Grant_Number__c==null && other.getCapMan__Grant_Number__c()==null) || 
             (this.capMan__Grant_Number__c!=null &&
              this.capMan__Grant_Number__c.equals(other.getCapMan__Grant_Number__c()))) &&
            ((this.capMan__OptionValue__c==null && other.getCapMan__OptionValue__c()==null) || 
             (this.capMan__OptionValue__c!=null &&
              this.capMan__OptionValue__c.equals(other.getCapMan__OptionValue__c()))) &&
            ((this.capMan__Optionee__c==null && other.getCapMan__Optionee__c()==null) || 
             (this.capMan__Optionee__c!=null &&
              this.capMan__Optionee__c.equals(other.getCapMan__Optionee__c()))) &&
            ((this.capMan__Period_Expense__c==null && other.getCapMan__Period_Expense__c()==null) || 
             (this.capMan__Period_Expense__c!=null &&
              this.capMan__Period_Expense__c.equals(other.getCapMan__Period_Expense__c()))) &&
            ((this.capMan__PriorAmortized__c==null && other.getCapMan__PriorAmortized__c()==null) || 
             (this.capMan__PriorAmortized__c!=null &&
              this.capMan__PriorAmortized__c.equals(other.getCapMan__PriorAmortized__c()))) &&
            ((this.capMan__RegrantAmount__c==null && other.getCapMan__RegrantAmount__c()==null) || 
             (this.capMan__RegrantAmount__c!=null &&
              this.capMan__RegrantAmount__c.equals(other.getCapMan__RegrantAmount__c()))) &&
            ((this.capMan__RegrantDate__c==null && other.getCapMan__RegrantDate__c()==null) || 
             (this.capMan__RegrantDate__c!=null &&
              this.capMan__RegrantDate__c.equals(other.getCapMan__RegrantDate__c()))) &&
            ((this.capMan__Shares_Granted__c==null && other.getCapMan__Shares_Granted__c()==null) || 
             (this.capMan__Shares_Granted__c!=null &&
              this.capMan__Shares_Granted__c.equals(other.getCapMan__Shares_Granted__c()))) &&
            ((this.capMan__Transaction__c==null && other.getCapMan__Transaction__c()==null) || 
             (this.capMan__Transaction__c!=null &&
              this.capMan__Transaction__c.equals(other.getCapMan__Transaction__c()))) &&
            ((this.capMan__Transaction__r==null && other.getCapMan__Transaction__r()==null) || 
             (this.capMan__Transaction__r!=null &&
              this.capMan__Transaction__r.equals(other.getCapMan__Transaction__r()))) &&
            ((this.capMan__Unamortized_Expense__c==null && other.getCapMan__Unamortized_Expense__c()==null) || 
             (this.capMan__Unamortized_Expense__c!=null &&
              this.capMan__Unamortized_Expense__c.equals(other.getCapMan__Unamortized_Expense__c()))) &&
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
        if (getCapMan__ActualExpense__c() != null) {
            _hashCode += getCapMan__ActualExpense__c().hashCode();
        }
        if (getCapMan__AdjustedUnamortizedExpense__c() != null) {
            _hashCode += getCapMan__AdjustedUnamortizedExpense__c().hashCode();
        }
        if (getCapMan__CarryForward__c() != null) {
            _hashCode += getCapMan__CarryForward__c().hashCode();
        }
        if (getCapMan__Date__c() != null) {
            _hashCode += getCapMan__Date__c().hashCode();
        }
        if (getCapMan__ExpenseAdj__c() != null) {
            _hashCode += getCapMan__ExpenseAdj__c().hashCode();
        }
        if (getCapMan__ExpenseAdjustment__c() != null) {
            _hashCode += getCapMan__ExpenseAdjustment__c().hashCode();
        }
        if (getCapMan__Expense_Date__c() != null) {
            _hashCode += getCapMan__Expense_Date__c().hashCode();
        }
        if (getCapMan__Grant_Number__c() != null) {
            _hashCode += getCapMan__Grant_Number__c().hashCode();
        }
        if (getCapMan__OptionValue__c() != null) {
            _hashCode += getCapMan__OptionValue__c().hashCode();
        }
        if (getCapMan__Optionee__c() != null) {
            _hashCode += getCapMan__Optionee__c().hashCode();
        }
        if (getCapMan__Period_Expense__c() != null) {
            _hashCode += getCapMan__Period_Expense__c().hashCode();
        }
        if (getCapMan__PriorAmortized__c() != null) {
            _hashCode += getCapMan__PriorAmortized__c().hashCode();
        }
        if (getCapMan__RegrantAmount__c() != null) {
            _hashCode += getCapMan__RegrantAmount__c().hashCode();
        }
        if (getCapMan__RegrantDate__c() != null) {
            _hashCode += getCapMan__RegrantDate__c().hashCode();
        }
        if (getCapMan__Shares_Granted__c() != null) {
            _hashCode += getCapMan__Shares_Granted__c().hashCode();
        }
        if (getCapMan__Transaction__c() != null) {
            _hashCode += getCapMan__Transaction__c().hashCode();
        }
        if (getCapMan__Transaction__r() != null) {
            _hashCode += getCapMan__Transaction__r().hashCode();
        }
        if (getCapMan__Unamortized_Expense__c() != null) {
            _hashCode += getCapMan__Unamortized_Expense__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(CapMan__Options_Expense__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Options_Expense__c"));
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
        elemField.setFieldName("capMan__ActualExpense__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ActualExpense__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__AdjustedUnamortizedExpense__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AdjustedUnamortizedExpense__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__CarryForward__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__CarryForward__c"));
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
        elemField.setFieldName("capMan__ExpenseAdj__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ExpenseAdj__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__ExpenseAdjustment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__ExpenseAdjustment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Expense_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Expense_Date__c"));
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
        elemField.setFieldName("capMan__OptionValue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__OptionValue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Optionee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Optionee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Period_Expense__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Period_Expense__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__PriorAmortized__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__PriorAmortized__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__RegrantAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegrantAmount__c"));
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
        elemField.setFieldName("capMan__Shares_Granted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Shares_Granted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Transaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Transaction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Transaction__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Transaction__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__SecurityTransaction__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Unamortized_Expense__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Unamortized_Expense__c"));
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
