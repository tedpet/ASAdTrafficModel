// DO NOT EDIT.  Make changes to StudioNumber.java instead.
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
public abstract class _StudioNumber extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "StudioNumber";

  // Attribute Keys
  public static final ERXKey<String> DESCRIPTION = new ERXKey<String>("description");
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  public static final ERXKey<String> STUDIO_TITLE = new ERXKey<String>("studioTitle");
  // Relationship Keys
  public static final ERXKey<com.as.model.Client> CLIENT = new ERXKey<com.as.model.Client>("client");

  // Attributes
  public static final String DESCRIPTION_KEY = DESCRIPTION.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  public static final String STUDIO_TITLE_KEY = STUDIO_TITLE.key();
  // Relationships
  public static final String CLIENT_KEY = CLIENT.key();

  private static Logger LOG = Logger.getLogger(_StudioNumber.class);

  public StudioNumber localInstanceIn(EOEditingContext editingContext) {
    StudioNumber localInstance = (StudioNumber)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String description() {
    return (String) storedValueForKey(_StudioNumber.DESCRIPTION_KEY);
  }

  public void setDescription(String value) {
    if (_StudioNumber.LOG.isDebugEnabled()) {
    	_StudioNumber.LOG.debug( "updating description from " + description() + " to " + value);
    }
    takeStoredValueForKey(value, _StudioNumber.DESCRIPTION_KEY);
  }

  public Boolean isActive() {
    return (Boolean) storedValueForKey(_StudioNumber.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    if (_StudioNumber.LOG.isDebugEnabled()) {
    	_StudioNumber.LOG.debug( "updating isActive from " + isActive() + " to " + value);
    }
    takeStoredValueForKey(value, _StudioNumber.IS_ACTIVE_KEY);
  }

  public String studioTitle() {
    return (String) storedValueForKey(_StudioNumber.STUDIO_TITLE_KEY);
  }

  public void setStudioTitle(String value) {
    if (_StudioNumber.LOG.isDebugEnabled()) {
    	_StudioNumber.LOG.debug( "updating studioTitle from " + studioTitle() + " to " + value);
    }
    takeStoredValueForKey(value, _StudioNumber.STUDIO_TITLE_KEY);
  }

  public com.as.model.Client client() {
    return (com.as.model.Client)storedValueForKey(_StudioNumber.CLIENT_KEY);
  }
  
  public void setClient(com.as.model.Client value) {
    takeStoredValueForKey(value, _StudioNumber.CLIENT_KEY);
  }

  public void setClientRelationship(com.as.model.Client value) {
    if (_StudioNumber.LOG.isDebugEnabled()) {
      _StudioNumber.LOG.debug("updating client from " + client() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setClient(value);
    }
    else if (value == null) {
    	com.as.model.Client oldValue = client();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _StudioNumber.CLIENT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _StudioNumber.CLIENT_KEY);
    }
  }
  

  public static StudioNumber createStudioNumber(EOEditingContext editingContext, Boolean isActive
, String studioTitle
, com.as.model.Client client) {
    StudioNumber eo = (StudioNumber) EOUtilities.createAndInsertInstance(editingContext, _StudioNumber.ENTITY_NAME);    
		eo.setIsActive(isActive);
		eo.setStudioTitle(studioTitle);
    eo.setClientRelationship(client);
    return eo;
  }

  public static ERXFetchSpecification<StudioNumber> fetchSpec() {
    return new ERXFetchSpecification<StudioNumber>(_StudioNumber.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<StudioNumber> fetchAllStudioNumbers(EOEditingContext editingContext) {
    return _StudioNumber.fetchAllStudioNumbers(editingContext, null);
  }

  public static NSArray<StudioNumber> fetchAllStudioNumbers(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _StudioNumber.fetchStudioNumbers(editingContext, null, sortOrderings);
  }

  public static NSArray<StudioNumber> fetchStudioNumbers(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<StudioNumber> fetchSpec = new ERXFetchSpecification<StudioNumber>(_StudioNumber.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<StudioNumber> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static StudioNumber fetchStudioNumber(EOEditingContext editingContext, String keyName, Object value) {
    return _StudioNumber.fetchStudioNumber(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static StudioNumber fetchStudioNumber(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<StudioNumber> eoObjects = _StudioNumber.fetchStudioNumbers(editingContext, qualifier, null);
    StudioNumber eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one StudioNumber that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static StudioNumber fetchRequiredStudioNumber(EOEditingContext editingContext, String keyName, Object value) {
    return _StudioNumber.fetchRequiredStudioNumber(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static StudioNumber fetchRequiredStudioNumber(EOEditingContext editingContext, EOQualifier qualifier) {
    StudioNumber eoObject = _StudioNumber.fetchStudioNumber(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no StudioNumber that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static StudioNumber localInstanceIn(EOEditingContext editingContext, StudioNumber eo) {
    StudioNumber localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
