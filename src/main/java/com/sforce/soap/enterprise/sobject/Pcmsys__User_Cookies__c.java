/**
 * Pcmsys__User_Cookies__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Pcmsys__User_Cookies__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

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

    private java.lang.String pcmsys__User__c;

    private com.sforce.soap.enterprise.sobject.User pcmsys__User__r;

    private java.lang.String pcmsys__record1__c;

    private java.lang.String pcmsys__record2__c;

    private java.lang.String pcmsys__record3__c;

    private java.lang.String pcmsys__record4__c;

    private java.lang.String pcmsys__record5__c;

    private java.lang.String pcmsys__record6__c;

    public Pcmsys__User_Cookies__c() {
    }

    public Pcmsys__User_Cookies__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
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
           java.util.Calendar systemModstamp,
           java.lang.String pcmsys__User__c,
           com.sforce.soap.enterprise.sobject.User pcmsys__User__r,
           java.lang.String pcmsys__record1__c,
           java.lang.String pcmsys__record2__c,
           java.lang.String pcmsys__record3__c,
           java.lang.String pcmsys__record4__c,
           java.lang.String pcmsys__record5__c,
           java.lang.String pcmsys__record6__c) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
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
        this.pcmsys__User__c = pcmsys__User__c;
        this.pcmsys__User__r = pcmsys__User__r;
        this.pcmsys__record1__c = pcmsys__record1__c;
        this.pcmsys__record2__c = pcmsys__record2__c;
        this.pcmsys__record3__c = pcmsys__record3__c;
        this.pcmsys__record4__c = pcmsys__record4__c;
        this.pcmsys__record5__c = pcmsys__record5__c;
        this.pcmsys__record6__c = pcmsys__record6__c;
    }


    /**
     * Gets the attachments value for this Pcmsys__User_Cookies__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Pcmsys__User_Cookies__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Pcmsys__User_Cookies__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Pcmsys__User_Cookies__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Pcmsys__User_Cookies__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Pcmsys__User_Cookies__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Pcmsys__User_Cookies__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Pcmsys__User_Cookies__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currencyIsoCode value for this Pcmsys__User_Cookies__c.
     * 
     * @return currencyIsoCode
     */
    public java.lang.String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this Pcmsys__User_Cookies__c.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(java.lang.String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Pcmsys__User_Cookies__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Pcmsys__User_Cookies__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Pcmsys__User_Cookies__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Pcmsys__User_Cookies__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Pcmsys__User_Cookies__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Pcmsys__User_Cookies__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Pcmsys__User_Cookies__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Pcmsys__User_Cookies__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Pcmsys__User_Cookies__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Pcmsys__User_Cookies__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Pcmsys__User_Cookies__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Pcmsys__User_Cookies__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Pcmsys__User_Cookies__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Pcmsys__User_Cookies__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Pcmsys__User_Cookies__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Pcmsys__User_Cookies__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Pcmsys__User_Cookies__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Pcmsys__User_Cookies__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Pcmsys__User_Cookies__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Pcmsys__User_Cookies__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Pcmsys__User_Cookies__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Pcmsys__User_Cookies__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Pcmsys__User_Cookies__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Pcmsys__User_Cookies__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Pcmsys__User_Cookies__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Pcmsys__User_Cookies__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the pcmsys__User__c value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__User__c
     */
    public java.lang.String getPcmsys__User__c() {
        return pcmsys__User__c;
    }


    /**
     * Sets the pcmsys__User__c value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__User__c
     */
    public void setPcmsys__User__c(java.lang.String pcmsys__User__c) {
        this.pcmsys__User__c = pcmsys__User__c;
    }


    /**
     * Gets the pcmsys__User__r value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__User__r
     */
    public com.sforce.soap.enterprise.sobject.User getPcmsys__User__r() {
        return pcmsys__User__r;
    }


    /**
     * Sets the pcmsys__User__r value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__User__r
     */
    public void setPcmsys__User__r(com.sforce.soap.enterprise.sobject.User pcmsys__User__r) {
        this.pcmsys__User__r = pcmsys__User__r;
    }


    /**
     * Gets the pcmsys__record1__c value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__record1__c
     */
    public java.lang.String getPcmsys__record1__c() {
        return pcmsys__record1__c;
    }


    /**
     * Sets the pcmsys__record1__c value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__record1__c
     */
    public void setPcmsys__record1__c(java.lang.String pcmsys__record1__c) {
        this.pcmsys__record1__c = pcmsys__record1__c;
    }


    /**
     * Gets the pcmsys__record2__c value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__record2__c
     */
    public java.lang.String getPcmsys__record2__c() {
        return pcmsys__record2__c;
    }


    /**
     * Sets the pcmsys__record2__c value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__record2__c
     */
    public void setPcmsys__record2__c(java.lang.String pcmsys__record2__c) {
        this.pcmsys__record2__c = pcmsys__record2__c;
    }


    /**
     * Gets the pcmsys__record3__c value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__record3__c
     */
    public java.lang.String getPcmsys__record3__c() {
        return pcmsys__record3__c;
    }


    /**
     * Sets the pcmsys__record3__c value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__record3__c
     */
    public void setPcmsys__record3__c(java.lang.String pcmsys__record3__c) {
        this.pcmsys__record3__c = pcmsys__record3__c;
    }


    /**
     * Gets the pcmsys__record4__c value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__record4__c
     */
    public java.lang.String getPcmsys__record4__c() {
        return pcmsys__record4__c;
    }


    /**
     * Sets the pcmsys__record4__c value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__record4__c
     */
    public void setPcmsys__record4__c(java.lang.String pcmsys__record4__c) {
        this.pcmsys__record4__c = pcmsys__record4__c;
    }


    /**
     * Gets the pcmsys__record5__c value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__record5__c
     */
    public java.lang.String getPcmsys__record5__c() {
        return pcmsys__record5__c;
    }


    /**
     * Sets the pcmsys__record5__c value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__record5__c
     */
    public void setPcmsys__record5__c(java.lang.String pcmsys__record5__c) {
        this.pcmsys__record5__c = pcmsys__record5__c;
    }


    /**
     * Gets the pcmsys__record6__c value for this Pcmsys__User_Cookies__c.
     * 
     * @return pcmsys__record6__c
     */
    public java.lang.String getPcmsys__record6__c() {
        return pcmsys__record6__c;
    }


    /**
     * Sets the pcmsys__record6__c value for this Pcmsys__User_Cookies__c.
     * 
     * @param pcmsys__record6__c
     */
    public void setPcmsys__record6__c(java.lang.String pcmsys__record6__c) {
        this.pcmsys__record6__c = pcmsys__record6__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pcmsys__User_Cookies__c)) return false;
        Pcmsys__User_Cookies__c other = (Pcmsys__User_Cookies__c) obj;
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
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.pcmsys__User__c==null && other.getPcmsys__User__c()==null) || 
             (this.pcmsys__User__c!=null &&
              this.pcmsys__User__c.equals(other.getPcmsys__User__c()))) &&
            ((this.pcmsys__User__r==null && other.getPcmsys__User__r()==null) || 
             (this.pcmsys__User__r!=null &&
              this.pcmsys__User__r.equals(other.getPcmsys__User__r()))) &&
            ((this.pcmsys__record1__c==null && other.getPcmsys__record1__c()==null) || 
             (this.pcmsys__record1__c!=null &&
              this.pcmsys__record1__c.equals(other.getPcmsys__record1__c()))) &&
            ((this.pcmsys__record2__c==null && other.getPcmsys__record2__c()==null) || 
             (this.pcmsys__record2__c!=null &&
              this.pcmsys__record2__c.equals(other.getPcmsys__record2__c()))) &&
            ((this.pcmsys__record3__c==null && other.getPcmsys__record3__c()==null) || 
             (this.pcmsys__record3__c!=null &&
              this.pcmsys__record3__c.equals(other.getPcmsys__record3__c()))) &&
            ((this.pcmsys__record4__c==null && other.getPcmsys__record4__c()==null) || 
             (this.pcmsys__record4__c!=null &&
              this.pcmsys__record4__c.equals(other.getPcmsys__record4__c()))) &&
            ((this.pcmsys__record5__c==null && other.getPcmsys__record5__c()==null) || 
             (this.pcmsys__record5__c!=null &&
              this.pcmsys__record5__c.equals(other.getPcmsys__record5__c()))) &&
            ((this.pcmsys__record6__c==null && other.getPcmsys__record6__c()==null) || 
             (this.pcmsys__record6__c!=null &&
              this.pcmsys__record6__c.equals(other.getPcmsys__record6__c())));
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
        if (getPcmsys__User__c() != null) {
            _hashCode += getPcmsys__User__c().hashCode();
        }
        if (getPcmsys__User__r() != null) {
            _hashCode += getPcmsys__User__r().hashCode();
        }
        if (getPcmsys__record1__c() != null) {
            _hashCode += getPcmsys__record1__c().hashCode();
        }
        if (getPcmsys__record2__c() != null) {
            _hashCode += getPcmsys__record2__c().hashCode();
        }
        if (getPcmsys__record3__c() != null) {
            _hashCode += getPcmsys__record3__c().hashCode();
        }
        if (getPcmsys__record4__c() != null) {
            _hashCode += getPcmsys__record4__c().hashCode();
        }
        if (getPcmsys__record5__c() != null) {
            _hashCode += getPcmsys__record5__c().hashCode();
        }
        if (getPcmsys__record6__c() != null) {
            _hashCode += getPcmsys__record6__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pcmsys__User_Cookies__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__User_Cookies__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__User__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__record1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__record1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__record2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__record2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__record3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__record3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__record4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__record4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__record5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__record5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmsys__record6__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "pcmsys__record6__c"));
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