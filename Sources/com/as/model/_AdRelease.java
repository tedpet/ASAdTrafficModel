// DO NOT EDIT.  Make changes to AdRelease.java instead.
package com.as.model;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _AdRelease extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "AdRelease";

  // Attribute Keys
  public static final ERXKey<String> AD_TYPE = new ERXKey<String>("adType");
  public static final ERXKey<String> COMMENTS = new ERXKey<String>("comments");
  public static final ERXKey<String> CREATIVE = new ERXKey<String>("creative");
  public static final ERXKey<NSTimestamp> DUE_DATE = new ERXKey<NSTimestamp>("dueDate");
  public static final ERXKey<String> E_MAIL = new ERXKey<String>("eMail");
  public static final ERXKey<String> EXT_STAT = new ERXKey<String>("extStat");
  public static final ERXKey<Boolean> IS_BILLBOARD = new ERXKey<Boolean>("isBillboard");
  public static final ERXKey<Boolean> IS_CLOSED = new ERXKey<Boolean>("isClosed");
  public static final ERXKey<Boolean> IS_DIGITAL = new ERXKey<Boolean>("isDigital");
  public static final ERXKey<String> ISSUE_DATE = new ERXKey<String>("issueDate");
  public static final ERXKey<String> JOB_NUMBER = new ERXKey<String>("jobNumber");
  public static final ERXKey<String> PHONE_NUMBER = new ERXKey<String>("phoneNumber");
  public static final ERXKey<String> PUB_CONTACT = new ERXKey<String>("pubContact");
  public static final ERXKey<String> PUBLICATION = new ERXKey<String>("publication");
  public static final ERXKey<String> STATUS = new ERXKey<String>("status");
  public static final ERXKey<String> UNIT = new ERXKey<String>("unit");
  // Relationship Keys
  public static final ERXKey<com.as.model.Client> CLIENT = new ERXKey<com.as.model.Client>("client");
  public static final ERXKey<com.as.model.RowColor> ROW_COLOR = new ERXKey<com.as.model.RowColor>("rowColor");

  // Attributes
  public static final String AD_TYPE_KEY = AD_TYPE.key();
  public static final String COMMENTS_KEY = COMMENTS.key();
  public static final String CREATIVE_KEY = CREATIVE.key();
  public static final String DUE_DATE_KEY = DUE_DATE.key();
  public static final String E_MAIL_KEY = E_MAIL.key();
  public static final String EXT_STAT_KEY = EXT_STAT.key();
  public static final String IS_BILLBOARD_KEY = IS_BILLBOARD.key();
  public static final String IS_CLOSED_KEY = IS_CLOSED.key();
  public static final String IS_DIGITAL_KEY = IS_DIGITAL.key();
  public static final String ISSUE_DATE_KEY = ISSUE_DATE.key();
  public static final String JOB_NUMBER_KEY = JOB_NUMBER.key();
  public static final String PHONE_NUMBER_KEY = PHONE_NUMBER.key();
  public static final String PUB_CONTACT_KEY = PUB_CONTACT.key();
  public static final String PUBLICATION_KEY = PUBLICATION.key();
  public static final String STATUS_KEY = STATUS.key();
  public static final String UNIT_KEY = UNIT.key();
  // Relationships
  public static final String CLIENT_KEY = CLIENT.key();
  public static final String ROW_COLOR_KEY = ROW_COLOR.key();

  private static Logger LOG = Logger.getLogger(_AdRelease.class);

  public AdRelease localInstanceIn(EOEditingContext editingContext) {
    AdRelease localInstance = (AdRelease)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String adType() {
    return (String) storedValueForKey(_AdRelease.AD_TYPE_KEY);
  }

  public void setAdType(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating adType from " + adType() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.AD_TYPE_KEY);
  }

  public String comments() {
    return (String) storedValueForKey(_AdRelease.COMMENTS_KEY);
  }

  public void setComments(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating comments from " + comments() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.COMMENTS_KEY);
  }

  public String creative() {
    return (String) storedValueForKey(_AdRelease.CREATIVE_KEY);
  }

  public void setCreative(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating creative from " + creative() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.CREATIVE_KEY);
  }

  public NSTimestamp dueDate() {
    return (NSTimestamp) storedValueForKey(_AdRelease.DUE_DATE_KEY);
  }

  public void setDueDate(NSTimestamp value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating dueDate from " + dueDate() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.DUE_DATE_KEY);
  }

  public String eMail() {
    return (String) storedValueForKey(_AdRelease.E_MAIL_KEY);
  }

  public void setEMail(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating eMail from " + eMail() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.E_MAIL_KEY);
  }

  public String extStat() {
    return (String) storedValueForKey(_AdRelease.EXT_STAT_KEY);
  }

  public void setExtStat(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating extStat from " + extStat() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.EXT_STAT_KEY);
  }

  public Boolean isBillboard() {
    return (Boolean) storedValueForKey(_AdRelease.IS_BILLBOARD_KEY);
  }

  public void setIsBillboard(Boolean value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating isBillboard from " + isBillboard() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.IS_BILLBOARD_KEY);
  }

  public Boolean isClosed() {
    return (Boolean) storedValueForKey(_AdRelease.IS_CLOSED_KEY);
  }

  public void setIsClosed(Boolean value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating isClosed from " + isClosed() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.IS_CLOSED_KEY);
  }

  public Boolean isDigital() {
    return (Boolean) storedValueForKey(_AdRelease.IS_DIGITAL_KEY);
  }

  public void setIsDigital(Boolean value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating isDigital from " + isDigital() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.IS_DIGITAL_KEY);
  }

  public String issueDate() {
    return (String) storedValueForKey(_AdRelease.ISSUE_DATE_KEY);
  }

  public void setIssueDate(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating issueDate from " + issueDate() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.ISSUE_DATE_KEY);
  }

  public String jobNumber() {
    return (String) storedValueForKey(_AdRelease.JOB_NUMBER_KEY);
  }

  public void setJobNumber(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating jobNumber from " + jobNumber() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.JOB_NUMBER_KEY);
  }

  public String phoneNumber() {
    return (String) storedValueForKey(_AdRelease.PHONE_NUMBER_KEY);
  }

  public void setPhoneNumber(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating phoneNumber from " + phoneNumber() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.PHONE_NUMBER_KEY);
  }

  public String pubContact() {
    return (String) storedValueForKey(_AdRelease.PUB_CONTACT_KEY);
  }

  public void setPubContact(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating pubContact from " + pubContact() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.PUB_CONTACT_KEY);
  }

  public String publication() {
    return (String) storedValueForKey(_AdRelease.PUBLICATION_KEY);
  }

  public void setPublication(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating publication from " + publication() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.PUBLICATION_KEY);
  }

  public String status() {
    return (String) storedValueForKey(_AdRelease.STATUS_KEY);
  }

  public void setStatus(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating status from " + status() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.STATUS_KEY);
  }

  public String unit() {
    return (String) storedValueForKey(_AdRelease.UNIT_KEY);
  }

  public void setUnit(String value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
    	_AdRelease.LOG.debug( "updating unit from " + unit() + " to " + value);
    }
    takeStoredValueForKey(value, _AdRelease.UNIT_KEY);
  }

  public com.as.model.Client client() {
    return (com.as.model.Client)storedValueForKey(_AdRelease.CLIENT_KEY);
  }
  
  public void setClient(com.as.model.Client value) {
    takeStoredValueForKey(value, _AdRelease.CLIENT_KEY);
  }

  public void setClientRelationship(com.as.model.Client value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
      _AdRelease.LOG.debug("updating client from " + client() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setClient(value);
    }
    else if (value == null) {
    	com.as.model.Client oldValue = client();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _AdRelease.CLIENT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _AdRelease.CLIENT_KEY);
    }
  }
  
  public com.as.model.RowColor rowColor() {
    return (com.as.model.RowColor)storedValueForKey(_AdRelease.ROW_COLOR_KEY);
  }
  
  public void setRowColor(com.as.model.RowColor value) {
    takeStoredValueForKey(value, _AdRelease.ROW_COLOR_KEY);
  }

  public void setRowColorRelationship(com.as.model.RowColor value) {
    if (_AdRelease.LOG.isDebugEnabled()) {
      _AdRelease.LOG.debug("updating rowColor from " + rowColor() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRowColor(value);
    }
    else if (value == null) {
    	com.as.model.RowColor oldValue = rowColor();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _AdRelease.ROW_COLOR_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _AdRelease.ROW_COLOR_KEY);
    }
  }
  

  public static AdRelease createAdRelease(EOEditingContext editingContext, String adType
, NSTimestamp dueDate
, Boolean isBillboard
, Boolean isClosed
, Boolean isDigital
, String issueDate
, String jobNumber
, String publication
, com.as.model.Client client, com.as.model.RowColor rowColor) {
    AdRelease eo = (AdRelease) EOUtilities.createAndInsertInstance(editingContext, _AdRelease.ENTITY_NAME);    
		eo.setAdType(adType);
		eo.setDueDate(dueDate);
		eo.setIsBillboard(isBillboard);
		eo.setIsClosed(isClosed);
		eo.setIsDigital(isDigital);
		eo.setIssueDate(issueDate);
		eo.setJobNumber(jobNumber);
		eo.setPublication(publication);
    eo.setClientRelationship(client);
    eo.setRowColorRelationship(rowColor);
    return eo;
  }

  public static ERXFetchSpecification<AdRelease> fetchSpec() {
    return new ERXFetchSpecification<AdRelease>(_AdRelease.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<AdRelease> fetchAllAdReleases(EOEditingContext editingContext) {
    return _AdRelease.fetchAllAdReleases(editingContext, null);
  }

  public static NSArray<AdRelease> fetchAllAdReleases(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _AdRelease.fetchAdReleases(editingContext, null, sortOrderings);
  }

  public static NSArray<AdRelease> fetchAdReleases(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<AdRelease> fetchSpec = new ERXFetchSpecification<AdRelease>(_AdRelease.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<AdRelease> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static AdRelease fetchAdRelease(EOEditingContext editingContext, String keyName, Object value) {
    return _AdRelease.fetchAdRelease(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static AdRelease fetchAdRelease(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<AdRelease> eoObjects = _AdRelease.fetchAdReleases(editingContext, qualifier, null);
    AdRelease eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one AdRelease that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static AdRelease fetchRequiredAdRelease(EOEditingContext editingContext, String keyName, Object value) {
    return _AdRelease.fetchRequiredAdRelease(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static AdRelease fetchRequiredAdRelease(EOEditingContext editingContext, EOQualifier qualifier) {
    AdRelease eoObject = _AdRelease.fetchAdRelease(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no AdRelease that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static AdRelease localInstanceIn(EOEditingContext editingContext, AdRelease eo) {
    AdRelease localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
