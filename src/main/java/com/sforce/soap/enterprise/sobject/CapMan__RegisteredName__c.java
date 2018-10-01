/**
 * CapMan__RegisteredName__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CapMan__RegisteredName__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String capMan__Account_Name__c;

    private java.lang.String capMan__Account__c;

    private com.sforce.soap.enterprise.sobject.Account capMan__Account__r;

    private com.sforce.soap.enterprise.QueryResult capMan__AccreditationForms__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Attendees__r;

    private java.lang.String capMan__Company_Overview__c;

    private com.sforce.soap.enterprise.sobject.CapMan__Company_Overview__c capMan__Company_Overview__r;

    private java.lang.String capMan__Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact capMan__Contact__r;

    private java.lang.String capMan__EIN_Tax_Id__c;

    private java.lang.String capMan__FirstLastImport__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Funds__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Investor_Booking__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Investor_Roles__r;

    private java.lang.String capMan__Investor_Type__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Listings__r;

    private java.lang.String capMan__NameText__c;

    private com.sforce.soap.enterprise.QueryResult capMan__Registered_Investor_Links1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Registered_Investor_Links__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Securities_Trade_States__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Security_Trade_State_Records__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Security_Transactions1__r;

    private com.sforce.soap.enterprise.QueryResult capMan__Security_Transactions__r;

    private java.lang.String capMan__User__c;

    private com.sforce.soap.enterprise.sobject.User capMan__User__r;

    private java.lang.Boolean capMan__isAccredited__c;

    private java.lang.Boolean capMan__isEntity__c;

    private java.lang.Boolean capMan__isInvestor__c;

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

    private com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Accounts__r;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Calls_And_Commitments__r;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Chart_of_Accounts__r;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Funds__r;

    private com.sforce.soap.enterprise.QueryResult pcmsys__General_Partners__r;

    private com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r;

    private java.lang.String pcmsys__User_Name__c;

    public CapMan__RegisteredName__c() {
    }

    public CapMan__RegisteredName__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String capMan__Account_Name__c,
           java.lang.String capMan__Account__c,
           com.sforce.soap.enterprise.sobject.Account capMan__Account__r,
           com.sforce.soap.enterprise.QueryResult capMan__AccreditationForms__r,
           com.sforce.soap.enterprise.QueryResult capMan__Attendees__r,
           java.lang.String capMan__Company_Overview__c,
           com.sforce.soap.enterprise.sobject.CapMan__Company_Overview__c capMan__Company_Overview__r,
           java.lang.String capMan__Contact__c,
           com.sforce.soap.enterprise.sobject.Contact capMan__Contact__r,
           java.lang.String capMan__EIN_Tax_Id__c,
           java.lang.String capMan__FirstLastImport__c,
           com.sforce.soap.enterprise.QueryResult capMan__Funds__r,
           com.sforce.soap.enterprise.QueryResult capMan__Investor_Booking__r,
           com.sforce.soap.enterprise.QueryResult capMan__Investor_Roles__r,
           java.lang.String capMan__Investor_Type__c,
           com.sforce.soap.enterprise.QueryResult capMan__Listings__r,
           java.lang.String capMan__NameText__c,
           com.sforce.soap.enterprise.QueryResult capMan__Registered_Investor_Links1__r,
           com.sforce.soap.enterprise.QueryResult capMan__Registered_Investor_Links__r,
           com.sforce.soap.enterprise.QueryResult capMan__Securities_Trade_States__r,
           com.sforce.soap.enterprise.QueryResult capMan__Security_Trade_State_Records__r,
           com.sforce.soap.enterprise.QueryResult capMan__Security_Transactions1__r,
           com.sforce.soap.enterprise.QueryResult capMan__Security_Transactions__r,
           java.lang.String capMan__User__c,
           com.sforce.soap.enterprise.sobject.User capMan__User__r,
           java.lang.Boolean capMan__isAccredited__c,
           java.lang.Boolean capMan__isEntity__c,
           java.lang.Boolean capMan__isInvestor__c,
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
           com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Accounts__r,
           com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Calls_And_Commitments__r,
           com.sforce.soap.enterprise.QueryResult pcmsys__Chart_of_Accounts__r,
           com.sforce.soap.enterprise.QueryResult pcmsys__Funds__r,
           com.sforce.soap.enterprise.QueryResult pcmsys__General_Partners__r,
           com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r,
           java.lang.String pcmsys__User_Name__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.capMan__Account_Name__c = capMan__Account_Name__c;
        this.capMan__Account__c = capMan__Account__c;
        this.capMan__Account__r = capMan__Account__r;
        this.capMan__AccreditationForms__r = capMan__AccreditationForms__r;
        this.capMan__Attendees__r = capMan__Attendees__r;
        this.capMan__Company_Overview__c = capMan__Company_Overview__c;
        this.capMan__Company_Overview__r = capMan__Company_Overview__r;
        this.capMan__Contact__c = capMan__Contact__c;
        this.capMan__Contact__r = capMan__Contact__r;
        this.capMan__EIN_Tax_Id__c = capMan__EIN_Tax_Id__c;
        this.capMan__FirstLastImport__c = capMan__FirstLastImport__c;
        this.capMan__Funds__r = capMan__Funds__r;
        this.capMan__Investor_Booking__r = capMan__Investor_Booking__r;
        this.capMan__Investor_Roles__r = capMan__Investor_Roles__r;
        this.capMan__Investor_Type__c = capMan__Investor_Type__c;
        this.capMan__Listings__r = capMan__Listings__r;
        this.capMan__NameText__c = capMan__NameText__c;
        this.capMan__Registered_Investor_Links1__r = capMan__Registered_Investor_Links1__r;
        this.capMan__Registered_Investor_Links__r = capMan__Registered_Investor_Links__r;
        this.capMan__Securities_Trade_States__r = capMan__Securities_Trade_States__r;
        this.capMan__Security_Trade_State_Records__r = capMan__Security_Trade_State_Records__r;
        this.capMan__Security_Transactions1__r = capMan__Security_Transactions1__r;
        this.capMan__Security_Transactions__r = capMan__Security_Transactions__r;
        this.capMan__User__c = capMan__User__c;
        this.capMan__User__r = capMan__User__r;
        this.capMan__isAccredited__c = capMan__isAccredited__c;
        this.capMan__isEntity__c = capMan__isEntity__c;
        this.capMan__isInvestor__c = capMan__isInvestor__c;
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
        this.pcmsys__Capital_Accounts__r = pcmsys__Capital_Accounts__r;
        this.pcmsys__Capital_Calls_And_Commitments__r = pcmsys__Capital_Calls_And_Commitments__r;
        this.pcmsys__Chart_of_Accounts__r = pcmsys__Chart_of_Accounts__r;
        this.pcmsys__Funds__r = pcmsys__Funds__r;
        this.pcmsys__General_Partners__r = pcmsys__General_Partners__r;
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
        this.pcmsys__User_Name__c = pcmsys__User_Name__c;
    }


    /**
     * Gets the activityHistories value for this CapMan__RegisteredName__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CapMan__RegisteredName__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this CapMan__RegisteredName__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CapMan__RegisteredName__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the capMan__Account_Name__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Account_Name__c
     */
    public java.lang.String getCapMan__Account_Name__c() {
        return capMan__Account_Name__c;
    }


    /**
     * Sets the capMan__Account_Name__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Account_Name__c
     */
    public void setCapMan__Account_Name__c(java.lang.String capMan__Account_Name__c) {
        this.capMan__Account_Name__c = capMan__Account_Name__c;
    }


    /**
     * Gets the capMan__Account__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Account__c
     */
    public java.lang.String getCapMan__Account__c() {
        return capMan__Account__c;
    }


    /**
     * Sets the capMan__Account__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Account__c
     */
    public void setCapMan__Account__c(java.lang.String capMan__Account__c) {
        this.capMan__Account__c = capMan__Account__c;
    }


    /**
     * Gets the capMan__Account__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getCapMan__Account__r() {
        return capMan__Account__r;
    }


    /**
     * Sets the capMan__Account__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Account__r
     */
    public void setCapMan__Account__r(com.sforce.soap.enterprise.sobject.Account capMan__Account__r) {
        this.capMan__Account__r = capMan__Account__r;
    }


    /**
     * Gets the capMan__AccreditationForms__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__AccreditationForms__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__AccreditationForms__r() {
        return capMan__AccreditationForms__r;
    }


    /**
     * Sets the capMan__AccreditationForms__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__AccreditationForms__r
     */
    public void setCapMan__AccreditationForms__r(com.sforce.soap.enterprise.QueryResult capMan__AccreditationForms__r) {
        this.capMan__AccreditationForms__r = capMan__AccreditationForms__r;
    }


    /**
     * Gets the capMan__Attendees__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Attendees__r() {
        return capMan__Attendees__r;
    }


    /**
     * Sets the capMan__Attendees__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Attendees__r
     */
    public void setCapMan__Attendees__r(com.sforce.soap.enterprise.QueryResult capMan__Attendees__r) {
        this.capMan__Attendees__r = capMan__Attendees__r;
    }


    /**
     * Gets the capMan__Company_Overview__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Company_Overview__c
     */
    public java.lang.String getCapMan__Company_Overview__c() {
        return capMan__Company_Overview__c;
    }


    /**
     * Sets the capMan__Company_Overview__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Company_Overview__c
     */
    public void setCapMan__Company_Overview__c(java.lang.String capMan__Company_Overview__c) {
        this.capMan__Company_Overview__c = capMan__Company_Overview__c;
    }


    /**
     * Gets the capMan__Company_Overview__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Company_Overview__r
     */
    public com.sforce.soap.enterprise.sobject.CapMan__Company_Overview__c getCapMan__Company_Overview__r() {
        return capMan__Company_Overview__r;
    }


    /**
     * Sets the capMan__Company_Overview__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Company_Overview__r
     */
    public void setCapMan__Company_Overview__r(com.sforce.soap.enterprise.sobject.CapMan__Company_Overview__c capMan__Company_Overview__r) {
        this.capMan__Company_Overview__r = capMan__Company_Overview__r;
    }


    /**
     * Gets the capMan__Contact__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Contact__c
     */
    public java.lang.String getCapMan__Contact__c() {
        return capMan__Contact__c;
    }


    /**
     * Sets the capMan__Contact__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Contact__c
     */
    public void setCapMan__Contact__c(java.lang.String capMan__Contact__c) {
        this.capMan__Contact__c = capMan__Contact__c;
    }


    /**
     * Gets the capMan__Contact__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCapMan__Contact__r() {
        return capMan__Contact__r;
    }


    /**
     * Sets the capMan__Contact__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Contact__r
     */
    public void setCapMan__Contact__r(com.sforce.soap.enterprise.sobject.Contact capMan__Contact__r) {
        this.capMan__Contact__r = capMan__Contact__r;
    }


    /**
     * Gets the capMan__EIN_Tax_Id__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__EIN_Tax_Id__c
     */
    public java.lang.String getCapMan__EIN_Tax_Id__c() {
        return capMan__EIN_Tax_Id__c;
    }


    /**
     * Sets the capMan__EIN_Tax_Id__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__EIN_Tax_Id__c
     */
    public void setCapMan__EIN_Tax_Id__c(java.lang.String capMan__EIN_Tax_Id__c) {
        this.capMan__EIN_Tax_Id__c = capMan__EIN_Tax_Id__c;
    }


    /**
     * Gets the capMan__FirstLastImport__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__FirstLastImport__c
     */
    public java.lang.String getCapMan__FirstLastImport__c() {
        return capMan__FirstLastImport__c;
    }


    /**
     * Sets the capMan__FirstLastImport__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__FirstLastImport__c
     */
    public void setCapMan__FirstLastImport__c(java.lang.String capMan__FirstLastImport__c) {
        this.capMan__FirstLastImport__c = capMan__FirstLastImport__c;
    }


    /**
     * Gets the capMan__Funds__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Funds__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Funds__r() {
        return capMan__Funds__r;
    }


    /**
     * Sets the capMan__Funds__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Funds__r
     */
    public void setCapMan__Funds__r(com.sforce.soap.enterprise.QueryResult capMan__Funds__r) {
        this.capMan__Funds__r = capMan__Funds__r;
    }


    /**
     * Gets the capMan__Investor_Booking__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Investor_Booking__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Investor_Booking__r() {
        return capMan__Investor_Booking__r;
    }


    /**
     * Sets the capMan__Investor_Booking__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Investor_Booking__r
     */
    public void setCapMan__Investor_Booking__r(com.sforce.soap.enterprise.QueryResult capMan__Investor_Booking__r) {
        this.capMan__Investor_Booking__r = capMan__Investor_Booking__r;
    }


    /**
     * Gets the capMan__Investor_Roles__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Investor_Roles__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Investor_Roles__r() {
        return capMan__Investor_Roles__r;
    }


    /**
     * Sets the capMan__Investor_Roles__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Investor_Roles__r
     */
    public void setCapMan__Investor_Roles__r(com.sforce.soap.enterprise.QueryResult capMan__Investor_Roles__r) {
        this.capMan__Investor_Roles__r = capMan__Investor_Roles__r;
    }


    /**
     * Gets the capMan__Investor_Type__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Investor_Type__c
     */
    public java.lang.String getCapMan__Investor_Type__c() {
        return capMan__Investor_Type__c;
    }


    /**
     * Sets the capMan__Investor_Type__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Investor_Type__c
     */
    public void setCapMan__Investor_Type__c(java.lang.String capMan__Investor_Type__c) {
        this.capMan__Investor_Type__c = capMan__Investor_Type__c;
    }


    /**
     * Gets the capMan__Listings__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Listings__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Listings__r() {
        return capMan__Listings__r;
    }


    /**
     * Sets the capMan__Listings__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Listings__r
     */
    public void setCapMan__Listings__r(com.sforce.soap.enterprise.QueryResult capMan__Listings__r) {
        this.capMan__Listings__r = capMan__Listings__r;
    }


    /**
     * Gets the capMan__NameText__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__NameText__c
     */
    public java.lang.String getCapMan__NameText__c() {
        return capMan__NameText__c;
    }


    /**
     * Sets the capMan__NameText__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__NameText__c
     */
    public void setCapMan__NameText__c(java.lang.String capMan__NameText__c) {
        this.capMan__NameText__c = capMan__NameText__c;
    }


    /**
     * Gets the capMan__Registered_Investor_Links1__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Registered_Investor_Links1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Registered_Investor_Links1__r() {
        return capMan__Registered_Investor_Links1__r;
    }


    /**
     * Sets the capMan__Registered_Investor_Links1__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Registered_Investor_Links1__r
     */
    public void setCapMan__Registered_Investor_Links1__r(com.sforce.soap.enterprise.QueryResult capMan__Registered_Investor_Links1__r) {
        this.capMan__Registered_Investor_Links1__r = capMan__Registered_Investor_Links1__r;
    }


    /**
     * Gets the capMan__Registered_Investor_Links__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Registered_Investor_Links__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Registered_Investor_Links__r() {
        return capMan__Registered_Investor_Links__r;
    }


    /**
     * Sets the capMan__Registered_Investor_Links__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Registered_Investor_Links__r
     */
    public void setCapMan__Registered_Investor_Links__r(com.sforce.soap.enterprise.QueryResult capMan__Registered_Investor_Links__r) {
        this.capMan__Registered_Investor_Links__r = capMan__Registered_Investor_Links__r;
    }


    /**
     * Gets the capMan__Securities_Trade_States__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Securities_Trade_States__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Securities_Trade_States__r() {
        return capMan__Securities_Trade_States__r;
    }


    /**
     * Sets the capMan__Securities_Trade_States__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Securities_Trade_States__r
     */
    public void setCapMan__Securities_Trade_States__r(com.sforce.soap.enterprise.QueryResult capMan__Securities_Trade_States__r) {
        this.capMan__Securities_Trade_States__r = capMan__Securities_Trade_States__r;
    }


    /**
     * Gets the capMan__Security_Trade_State_Records__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Security_Trade_State_Records__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Security_Trade_State_Records__r() {
        return capMan__Security_Trade_State_Records__r;
    }


    /**
     * Sets the capMan__Security_Trade_State_Records__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Security_Trade_State_Records__r
     */
    public void setCapMan__Security_Trade_State_Records__r(com.sforce.soap.enterprise.QueryResult capMan__Security_Trade_State_Records__r) {
        this.capMan__Security_Trade_State_Records__r = capMan__Security_Trade_State_Records__r;
    }


    /**
     * Gets the capMan__Security_Transactions1__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Security_Transactions1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Security_Transactions1__r() {
        return capMan__Security_Transactions1__r;
    }


    /**
     * Sets the capMan__Security_Transactions1__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Security_Transactions1__r
     */
    public void setCapMan__Security_Transactions1__r(com.sforce.soap.enterprise.QueryResult capMan__Security_Transactions1__r) {
        this.capMan__Security_Transactions1__r = capMan__Security_Transactions1__r;
    }


    /**
     * Gets the capMan__Security_Transactions__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__Security_Transactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getCapMan__Security_Transactions__r() {
        return capMan__Security_Transactions__r;
    }


    /**
     * Sets the capMan__Security_Transactions__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__Security_Transactions__r
     */
    public void setCapMan__Security_Transactions__r(com.sforce.soap.enterprise.QueryResult capMan__Security_Transactions__r) {
        this.capMan__Security_Transactions__r = capMan__Security_Transactions__r;
    }


    /**
     * Gets the capMan__User__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__User__c
     */
    public java.lang.String getCapMan__User__c() {
        return capMan__User__c;
    }


    /**
     * Sets the capMan__User__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__User__c
     */
    public void setCapMan__User__c(java.lang.String capMan__User__c) {
        this.capMan__User__c = capMan__User__c;
    }


    /**
     * Gets the capMan__User__r value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__User__r
     */
    public com.sforce.soap.enterprise.sobject.User getCapMan__User__r() {
        return capMan__User__r;
    }


    /**
     * Sets the capMan__User__r value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__User__r
     */
    public void setCapMan__User__r(com.sforce.soap.enterprise.sobject.User capMan__User__r) {
        this.capMan__User__r = capMan__User__r;
    }


    /**
     * Gets the capMan__isAccredited__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__isAccredited__c
     */
    public java.lang.Boolean getCapMan__isAccredited__c() {
        return capMan__isAccredited__c;
    }


    /**
     * Sets the capMan__isAccredited__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__isAccredited__c
     */
    public void setCapMan__isAccredited__c(java.lang.Boolean capMan__isAccredited__c) {
        this.capMan__isAccredited__c = capMan__isAccredited__c;
    }


    /**
     * Gets the capMan__isEntity__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__isEntity__c
     */
    public java.lang.Boolean getCapMan__isEntity__c() {
        return capMan__isEntity__c;
    }


    /**
     * Sets the capMan__isEntity__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__isEntity__c
     */
    public void setCapMan__isEntity__c(java.lang.Boolean capMan__isEntity__c) {
        this.capMan__isEntity__c = capMan__isEntity__c;
    }


    /**
     * Gets the capMan__isInvestor__c value for this CapMan__RegisteredName__c.
     * 
     * @return capMan__isInvestor__c
     */
    public java.lang.Boolean getCapMan__isInvestor__c() {
        return capMan__isInvestor__c;
    }


    /**
     * Sets the capMan__isInvestor__c value for this CapMan__RegisteredName__c.
     * 
     * @param capMan__isInvestor__c
     */
    public void setCapMan__isInvestor__c(java.lang.Boolean capMan__isInvestor__c) {
        this.capMan__isInvestor__c = capMan__isInvestor__c;
    }


    /**
     * Gets the createdBy value for this CapMan__RegisteredName__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CapMan__RegisteredName__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CapMan__RegisteredName__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CapMan__RegisteredName__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CapMan__RegisteredName__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CapMan__RegisteredName__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this CapMan__RegisteredName__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this CapMan__RegisteredName__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the events value for this CapMan__RegisteredName__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CapMan__RegisteredName__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CapMan__RegisteredName__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CapMan__RegisteredName__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CapMan__RegisteredName__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CapMan__RegisteredName__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CapMan__RegisteredName__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CapMan__RegisteredName__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CapMan__RegisteredName__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CapMan__RegisteredName__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CapMan__RegisteredName__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CapMan__RegisteredName__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CapMan__RegisteredName__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CapMan__RegisteredName__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CapMan__RegisteredName__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CapMan__RegisteredName__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CapMan__RegisteredName__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CapMan__RegisteredName__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CapMan__RegisteredName__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CapMan__RegisteredName__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CapMan__RegisteredName__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CapMan__RegisteredName__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CapMan__RegisteredName__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CapMan__RegisteredName__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this CapMan__RegisteredName__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CapMan__RegisteredName__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CapMan__RegisteredName__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CapMan__RegisteredName__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CapMan__RegisteredName__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CapMan__RegisteredName__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CapMan__RegisteredName__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CapMan__RegisteredName__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this CapMan__RegisteredName__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CapMan__RegisteredName__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CapMan__RegisteredName__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CapMan__RegisteredName__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the pcmsys__Capital_Accounts__r value for this CapMan__RegisteredName__c.
     * 
     * @return pcmsys__Capital_Accounts__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Capital_Accounts__r() {
        return pcmsys__Capital_Accounts__r;
    }


    /**
     * Sets the pcmsys__Capital_Accounts__r value for this CapMan__RegisteredName__c.
     * 
     * @param pcmsys__Capital_Accounts__r
     */
    public void setPcmsys__Capital_Accounts__r(com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Accounts__r) {
        this.pcmsys__Capital_Accounts__r = pcmsys__Capital_Accounts__r;
    }


    /**
     * Gets the pcmsys__Capital_Calls_And_Commitments__r value for this CapMan__RegisteredName__c.
     * 
     * @return pcmsys__Capital_Calls_And_Commitments__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Capital_Calls_And_Commitments__r() {
        return pcmsys__Capital_Calls_And_Commitments__r;
    }


    /**
     * Sets the pcmsys__Capital_Calls_And_Commitments__r value for this CapMan__RegisteredName__c.
     * 
     * @param pcmsys__Capital_Calls_And_Commitments__r
     */
    public void setPcmsys__Capital_Calls_And_Commitments__r(com.sforce.soap.enterprise.QueryResult pcmsys__Capital_Calls_And_Commitments__r) {
        this.pcmsys__Capital_Calls_And_Commitments__r = pcmsys__Capital_Calls_And_Commitments__r;
    }


    /**
     * Gets the pcmsys__Chart_of_Accounts__r value for this CapMan__RegisteredName__c.
     * 
     * @return pcmsys__Chart_of_Accounts__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Chart_of_Accounts__r() {
        return pcmsys__Chart_of_Accounts__r;
    }


    /**
     * Sets the pcmsys__Chart_of_Accounts__r value for this CapMan__RegisteredName__c.
     * 
     * @param pcmsys__Chart_of_Accounts__r
     */
    public void setPcmsys__Chart_of_Accounts__r(com.sforce.soap.enterprise.QueryResult pcmsys__Chart_of_Accounts__r) {
        this.pcmsys__Chart_of_Accounts__r = pcmsys__Chart_of_Accounts__r;
    }


    /**
     * Gets the pcmsys__Funds__r value for this CapMan__RegisteredName__c.
     * 
     * @return pcmsys__Funds__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Funds__r() {
        return pcmsys__Funds__r;
    }


    /**
     * Sets the pcmsys__Funds__r value for this CapMan__RegisteredName__c.
     * 
     * @param pcmsys__Funds__r
     */
    public void setPcmsys__Funds__r(com.sforce.soap.enterprise.QueryResult pcmsys__Funds__r) {
        this.pcmsys__Funds__r = pcmsys__Funds__r;
    }


    /**
     * Gets the pcmsys__General_Partners__r value for this CapMan__RegisteredName__c.
     * 
     * @return pcmsys__General_Partners__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__General_Partners__r() {
        return pcmsys__General_Partners__r;
    }


    /**
     * Sets the pcmsys__General_Partners__r value for this CapMan__RegisteredName__c.
     * 
     * @param pcmsys__General_Partners__r
     */
    public void setPcmsys__General_Partners__r(com.sforce.soap.enterprise.QueryResult pcmsys__General_Partners__r) {
        this.pcmsys__General_Partners__r = pcmsys__General_Partners__r;
    }


    /**
     * Gets the pcmsys__Journal_Entry_Items__r value for this CapMan__RegisteredName__c.
     * 
     * @return pcmsys__Journal_Entry_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getPcmsys__Journal_Entry_Items__r() {
        return pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Sets the pcmsys__Journal_Entry_Items__r value for this CapMan__RegisteredName__c.
     * 
     * @param pcmsys__Journal_Entry_Items__r
     */
    public void setPcmsys__Journal_Entry_Items__r(com.sforce.soap.enterprise.QueryResult pcmsys__Journal_Entry_Items__r) {
        this.pcmsys__Journal_Entry_Items__r = pcmsys__Journal_Entry_Items__r;
    }


    /**
     * Gets the pcmsys__User_Name__c value for this CapMan__RegisteredName__c.
     * 
     * @return pcmsys__User_Name__c
     */
    public java.lang.String getPcmsys__User_Name__c() {
        return pcmsys__User_Name__c;
    }


    /**
     * Sets the pcmsys__User_Name__c value for this CapMan__RegisteredName__c.
     * 
     * @param pcmsys__User_Name__c
     */
    public void setPcmsys__User_Name__c(java.lang.String pcmsys__User_Name__c) {
        this.pcmsys__User_Name__c = pcmsys__User_Name__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMan__RegisteredName__c)) return false;
        CapMan__RegisteredName__c other = (CapMan__RegisteredName__c) obj;
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
            ((this.capMan__Account_Name__c==null && other.getCapMan__Account_Name__c()==null) || 
             (this.capMan__Account_Name__c!=null &&
              this.capMan__Account_Name__c.equals(other.getCapMan__Account_Name__c()))) &&
            ((this.capMan__Account__c==null && other.getCapMan__Account__c()==null) || 
             (this.capMan__Account__c!=null &&
              this.capMan__Account__c.equals(other.getCapMan__Account__c()))) &&
            ((this.capMan__Account__r==null && other.getCapMan__Account__r()==null) || 
             (this.capMan__Account__r!=null &&
              this.capMan__Account__r.equals(other.getCapMan__Account__r()))) &&
            ((this.capMan__AccreditationForms__r==null && other.getCapMan__AccreditationForms__r()==null) || 
             (this.capMan__AccreditationForms__r!=null &&
              this.capMan__AccreditationForms__r.equals(other.getCapMan__AccreditationForms__r()))) &&
            ((this.capMan__Attendees__r==null && other.getCapMan__Attendees__r()==null) || 
             (this.capMan__Attendees__r!=null &&
              this.capMan__Attendees__r.equals(other.getCapMan__Attendees__r()))) &&
            ((this.capMan__Company_Overview__c==null && other.getCapMan__Company_Overview__c()==null) || 
             (this.capMan__Company_Overview__c!=null &&
              this.capMan__Company_Overview__c.equals(other.getCapMan__Company_Overview__c()))) &&
            ((this.capMan__Company_Overview__r==null && other.getCapMan__Company_Overview__r()==null) || 
             (this.capMan__Company_Overview__r!=null &&
              this.capMan__Company_Overview__r.equals(other.getCapMan__Company_Overview__r()))) &&
            ((this.capMan__Contact__c==null && other.getCapMan__Contact__c()==null) || 
             (this.capMan__Contact__c!=null &&
              this.capMan__Contact__c.equals(other.getCapMan__Contact__c()))) &&
            ((this.capMan__Contact__r==null && other.getCapMan__Contact__r()==null) || 
             (this.capMan__Contact__r!=null &&
              this.capMan__Contact__r.equals(other.getCapMan__Contact__r()))) &&
            ((this.capMan__EIN_Tax_Id__c==null && other.getCapMan__EIN_Tax_Id__c()==null) || 
             (this.capMan__EIN_Tax_Id__c!=null &&
              this.capMan__EIN_Tax_Id__c.equals(other.getCapMan__EIN_Tax_Id__c()))) &&
            ((this.capMan__FirstLastImport__c==null && other.getCapMan__FirstLastImport__c()==null) || 
             (this.capMan__FirstLastImport__c!=null &&
              this.capMan__FirstLastImport__c.equals(other.getCapMan__FirstLastImport__c()))) &&
            ((this.capMan__Funds__r==null && other.getCapMan__Funds__r()==null) || 
             (this.capMan__Funds__r!=null &&
              this.capMan__Funds__r.equals(other.getCapMan__Funds__r()))) &&
            ((this.capMan__Investor_Booking__r==null && other.getCapMan__Investor_Booking__r()==null) || 
             (this.capMan__Investor_Booking__r!=null &&
              this.capMan__Investor_Booking__r.equals(other.getCapMan__Investor_Booking__r()))) &&
            ((this.capMan__Investor_Roles__r==null && other.getCapMan__Investor_Roles__r()==null) || 
             (this.capMan__Investor_Roles__r!=null &&
              this.capMan__Investor_Roles__r.equals(other.getCapMan__Investor_Roles__r()))) &&
            ((this.capMan__Investor_Type__c==null && other.getCapMan__Investor_Type__c()==null) || 
             (this.capMan__Investor_Type__c!=null &&
              this.capMan__Investor_Type__c.equals(other.getCapMan__Investor_Type__c()))) &&
            ((this.capMan__Listings__r==null && other.getCapMan__Listings__r()==null) || 
             (this.capMan__Listings__r!=null &&
              this.capMan__Listings__r.equals(other.getCapMan__Listings__r()))) &&
            ((this.capMan__NameText__c==null && other.getCapMan__NameText__c()==null) || 
             (this.capMan__NameText__c!=null &&
              this.capMan__NameText__c.equals(other.getCapMan__NameText__c()))) &&
            ((this.capMan__Registered_Investor_Links1__r==null && other.getCapMan__Registered_Investor_Links1__r()==null) || 
             (this.capMan__Registered_Investor_Links1__r!=null &&
              this.capMan__Registered_Investor_Links1__r.equals(other.getCapMan__Registered_Investor_Links1__r()))) &&
            ((this.capMan__Registered_Investor_Links__r==null && other.getCapMan__Registered_Investor_Links__r()==null) || 
             (this.capMan__Registered_Investor_Links__r!=null &&
              this.capMan__Registered_Investor_Links__r.equals(other.getCapMan__Registered_Investor_Links__r()))) &&
            ((this.capMan__Securities_Trade_States__r==null && other.getCapMan__Securities_Trade_States__r()==null) || 
             (this.capMan__Securities_Trade_States__r!=null &&
              this.capMan__Securities_Trade_States__r.equals(other.getCapMan__Securities_Trade_States__r()))) &&
            ((this.capMan__Security_Trade_State_Records__r==null && other.getCapMan__Security_Trade_State_Records__r()==null) || 
             (this.capMan__Security_Trade_State_Records__r!=null &&
              this.capMan__Security_Trade_State_Records__r.equals(other.getCapMan__Security_Trade_State_Records__r()))) &&
            ((this.capMan__Security_Transactions1__r==null && other.getCapMan__Security_Transactions1__r()==null) || 
             (this.capMan__Security_Transactions1__r!=null &&
              this.capMan__Security_Transactions1__r.equals(other.getCapMan__Security_Transactions1__r()))) &&
            ((this.capMan__Security_Transactions__r==null && other.getCapMan__Security_Transactions__r()==null) || 
             (this.capMan__Security_Transactions__r!=null &&
              this.capMan__Security_Transactions__r.equals(other.getCapMan__Security_Transactions__r()))) &&
            ((this.capMan__User__c==null && other.getCapMan__User__c()==null) || 
             (this.capMan__User__c!=null &&
              this.capMan__User__c.equals(other.getCapMan__User__c()))) &&
            ((this.capMan__User__r==null && other.getCapMan__User__r()==null) || 
             (this.capMan__User__r!=null &&
              this.capMan__User__r.equals(other.getCapMan__User__r()))) &&
            ((this.capMan__isAccredited__c==null && other.getCapMan__isAccredited__c()==null) || 
             (this.capMan__isAccredited__c!=null &&
              this.capMan__isAccredited__c.equals(other.getCapMan__isAccredited__c()))) &&
            ((this.capMan__isEntity__c==null && other.getCapMan__isEntity__c()==null) || 
             (this.capMan__isEntity__c!=null &&
              this.capMan__isEntity__c.equals(other.getCapMan__isEntity__c()))) &&
            ((this.capMan__isInvestor__c==null && other.getCapMan__isInvestor__c()==null) || 
             (this.capMan__isInvestor__c!=null &&
              this.capMan__isInvestor__c.equals(other.getCapMan__isInvestor__c()))) &&
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
            ((this.pcmsys__Capital_Accounts__r==null && other.getPcmsys__Capital_Accounts__r()==null) || 
             (this.pcmsys__Capital_Accounts__r!=null &&
              this.pcmsys__Capital_Accounts__r.equals(other.getPcmsys__Capital_Accounts__r()))) &&
            ((this.pcmsys__Capital_Calls_And_Commitments__r==null && other.getPcmsys__Capital_Calls_And_Commitments__r()==null) || 
             (this.pcmsys__Capital_Calls_And_Commitments__r!=null &&
              this.pcmsys__Capital_Calls_And_Commitments__r.equals(other.getPcmsys__Capital_Calls_And_Commitments__r()))) &&
            ((this.pcmsys__Chart_of_Accounts__r==null && other.getPcmsys__Chart_of_Accounts__r()==null) || 
             (this.pcmsys__Chart_of_Accounts__r!=null &&
              this.pcmsys__Chart_of_Accounts__r.equals(other.getPcmsys__Chart_of_Accounts__r()))) &&
            ((this.pcmsys__Funds__r==null && other.getPcmsys__Funds__r()==null) || 
             (this.pcmsys__Funds__r!=null &&
              this.pcmsys__Funds__r.equals(other.getPcmsys__Funds__r()))) &&
            ((this.pcmsys__General_Partners__r==null && other.getPcmsys__General_Partners__r()==null) || 
             (this.pcmsys__General_Partners__r!=null &&
              this.pcmsys__General_Partners__r.equals(other.getPcmsys__General_Partners__r()))) &&
            ((this.pcmsys__Journal_Entry_Items__r==null && other.getPcmsys__Journal_Entry_Items__r()==null) || 
             (this.pcmsys__Journal_Entry_Items__r!=null &&
              this.pcmsys__Journal_Entry_Items__r.equals(other.getPcmsys__Journal_Entry_Items__r()))) &&
            ((this.pcmsys__User_Name__c==null && other.getPcmsys__User_Name__c()==null) || 
             (this.pcmsys__User_Name__c!=null &&
              this.pcmsys__User_Name__c.equals(other.getPcmsys__User_Name__c())));
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
        if (getCapMan__Account_Name__c() != null) {
            _hashCode += getCapMan__Account_Name__c().hashCode();
        }
        if (getCapMan__Account__c() != null) {
            _hashCode += getCapMan__Account__c().hashCode();
        }
        if (getCapMan__Account__r() != null) {
            _hashCode += getCapMan__Account__r().hashCode();
        }
        if (getCapMan__AccreditationForms__r() != null) {
            _hashCode += getCapMan__AccreditationForms__r().hashCode();
        }
        if (getCapMan__Attendees__r() != null) {
            _hashCode += getCapMan__Attendees__r().hashCode();
        }
        if (getCapMan__Company_Overview__c() != null) {
            _hashCode += getCapMan__Company_Overview__c().hashCode();
        }
        if (getCapMan__Company_Overview__r() != null) {
            _hashCode += getCapMan__Company_Overview__r().hashCode();
        }
        if (getCapMan__Contact__c() != null) {
            _hashCode += getCapMan__Contact__c().hashCode();
        }
        if (getCapMan__Contact__r() != null) {
            _hashCode += getCapMan__Contact__r().hashCode();
        }
        if (getCapMan__EIN_Tax_Id__c() != null) {
            _hashCode += getCapMan__EIN_Tax_Id__c().hashCode();
        }
        if (getCapMan__FirstLastImport__c() != null) {
            _hashCode += getCapMan__FirstLastImport__c().hashCode();
        }
        if (getCapMan__Funds__r() != null) {
            _hashCode += getCapMan__Funds__r().hashCode();
        }
        if (getCapMan__Investor_Booking__r() != null) {
            _hashCode += getCapMan__Investor_Booking__r().hashCode();
        }
        if (getCapMan__Investor_Roles__r() != null) {
            _hashCode += getCapMan__Investor_Roles__r().hashCode();
        }
        if (getCapMan__Investor_Type__c() != null) {
            _hashCode += getCapMan__Investor_Type__c().hashCode();
        }
        if (getCapMan__Listings__r() != null) {
            _hashCode += getCapMan__Listings__r().hashCode();
        }
        if (getCapMan__NameText__c() != null) {
            _hashCode += getCapMan__NameText__c().hashCode();
        }
        if (getCapMan__Registered_Investor_Links1__r() != null) {
            _hashCode += getCapMan__Registered_Investor_Links1__r().hashCode();
        }
        if (getCapMan__Registered_Investor_Links__r() != null) {
            _hashCode += getCapMan__Registered_Investor_Links__r().hashCode();
        }
        if (getCapMan__Securities_Trade_States__r() != null) {
            _hashCode += getCapMan__Securities_Trade_States__r().hashCode();
        }
        if (getCapMan__Security_Trade_State_Records__r() != null) {
            _hashCode += getCapMan__Security_Trade_State_Records__r().hashCode();
        }
        if (getCapMan__Security_Transactions1__r() != null) {
            _hashCode += getCapMan__Security_Transactions1__r().hashCode();
        }
        if (getCapMan__Security_Transactions__r() != null) {
            _hashCode += getCapMan__Security_Transactions__r().hashCode();
        }
        if (getCapMan__User__c() != null) {
            _hashCode += getCapMan__User__c().hashCode();
        }
        if (getCapMan__User__r() != null) {
            _hashCode += getCapMan__User__r().hashCode();
        }
        if (getCapMan__isAccredited__c() != null) {
            _hashCode += getCapMan__isAccredited__c().hashCode();
        }
        if (getCapMan__isEntity__c() != null) {
            _hashCode += getCapMan__isEntity__c().hashCode();
        }
        if (getCapMan__isInvestor__c() != null) {
            _hashCode += getCapMan__isInvestor__c().hashCode();
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
        if (getPcmsys__Capital_Accounts__r() != null) {
            _hashCode += getPcmsys__Capital_Accounts__r().hashCode();
        }
        if (getPcmsys__Capital_Calls_And_Commitments__r() != null) {
            _hashCode += getPcmsys__Capital_Calls_And_Commitments__r().hashCode();
        }
        if (getPcmsys__Chart_of_Accounts__r() != null) {
            _hashCode += getPcmsys__Chart_of_Accounts__r().hashCode();
        }
        if (getPcmsys__Funds__r() != null) {
            _hashCode += getPcmsys__Funds__r().hashCode();
        }
        if (getPcmsys__General_Partners__r() != null) {
            _hashCode += getPcmsys__General_Partners__r().hashCode();
        }
        if (getPcmsys__Journal_Entry_Items__r() != null) {
            _hashCode += getPcmsys__Journal_Entry_Items__r().hashCode();
        }
        if (getPcmsys__User_Name__c() != null) {
            _hashCode += getPcmsys__User_Name__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMan__RegisteredName__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__RegisteredName__c"));
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
        elemField.setFieldName("capMan__Account_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Account_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__AccreditationForms__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__AccreditationForms__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Company_Overview__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Company_Overview__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Company_Overview__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Company_Overview__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Company_Overview__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__EIN_Tax_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__EIN_Tax_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__FirstLastImport__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__FirstLastImport__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Funds__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Funds__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Investor_Booking__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Investor_Booking__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Investor_Roles__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Investor_Roles__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Investor_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Investor_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("capMan__NameText__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__NameText__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Registered_Investor_Links1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registered_Investor_Links1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Registered_Investor_Links__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Registered_Investor_Links__r"));
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
        elemField.setFieldName("capMan__Security_Trade_State_Records__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Trade_State_Records__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Transactions1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Transactions1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__Security_Transactions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__Security_Transactions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__User__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMan__isAccredited__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__isAccredited__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("capMan__isInvestor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CapMan__isInvestor__c"));
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
        elemField.setFieldName("pcmsys__Capital_Accounts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Capital_Accounts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Capital_Calls_And_Commitments__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Capital_Calls_And_Commitments__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__Chart_of_Accounts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__Chart_of_Accounts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("pcmsys__General_Partners__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__General_Partners__r"));
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
        elemField.setFieldName("pcmsys__User_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__User_Name__c"));
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
