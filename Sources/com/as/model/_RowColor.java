// DO NOT EDIT.  Make changes to RowColor.java instead.
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
public abstract class _RowColor extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "RowColor";

  // Attribute Keys
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  public static final ERXKey<Integer> ORDERING_INT = new ERXKey<Integer>("orderingInt");
  public static final ERXKey<String> ROW_COLOR_NAME = new ERXKey<String>("rowColorName");
  // Relationship Keys
  public static final ERXKey<com.as.model.AdRelease> AD_RELEASES = new ERXKey<com.as.model.AdRelease>("adReleases");

  // Attributes
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  public static final String ORDERING_INT_KEY = ORDERING_INT.key();
  public static final String ROW_COLOR_NAME_KEY = ROW_COLOR_NAME.key();
  // Relationships
  public static final String AD_RELEASES_KEY = AD_RELEASES.key();

  private static Logger LOG = Logger.getLogger(_RowColor.class);

  public RowColor localInstanceIn(EOEditingContext editingContext) {
    RowColor localInstance = (RowColor)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean isActive() {
    return (Boolean) storedValueForKey(_RowColor.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    if (_RowColor.LOG.isDebugEnabled()) {
    	_RowColor.LOG.debug( "updating isActive from " + isActive() + " to " + value);
    }
    takeStoredValueForKey(value, _RowColor.IS_ACTIVE_KEY);
  }

  public Integer orderingInt() {
    return (Integer) storedValueForKey(_RowColor.ORDERING_INT_KEY);
  }

  public void setOrderingInt(Integer value) {
    if (_RowColor.LOG.isDebugEnabled()) {
    	_RowColor.LOG.debug( "updating orderingInt from " + orderingInt() + " to " + value);
    }
    takeStoredValueForKey(value, _RowColor.ORDERING_INT_KEY);
  }

  public String rowColorName() {
    return (String) storedValueForKey(_RowColor.ROW_COLOR_NAME_KEY);
  }

  public void setRowColorName(String value) {
    if (_RowColor.LOG.isDebugEnabled()) {
    	_RowColor.LOG.debug( "updating rowColorName from " + rowColorName() + " to " + value);
    }
    takeStoredValueForKey(value, _RowColor.ROW_COLOR_NAME_KEY);
  }

  public NSArray<com.as.model.AdRelease> adReleases() {
    return (NSArray<com.as.model.AdRelease>)storedValueForKey(_RowColor.AD_RELEASES_KEY);
  }

  public NSArray<com.as.model.AdRelease> adReleases(EOQualifier qualifier) {
    return adReleases(qualifier, null, false);
  }

  public NSArray<com.as.model.AdRelease> adReleases(EOQualifier qualifier, boolean fetch) {
    return adReleases(qualifier, null, fetch);
  }

  public NSArray<com.as.model.AdRelease> adReleases(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.AdRelease> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.AdRelease.ROW_COLOR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.AdRelease.fetchAdReleases(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = adReleases();
      if (qualifier != null) {
        results = (NSArray<com.as.model.AdRelease>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.AdRelease>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToAdReleases(com.as.model.AdRelease object) {
    includeObjectIntoPropertyWithKey(object, _RowColor.AD_RELEASES_KEY);
  }

  public void removeFromAdReleases(com.as.model.AdRelease object) {
    excludeObjectFromPropertyWithKey(object, _RowColor.AD_RELEASES_KEY);
  }

  public void addToAdReleasesRelationship(com.as.model.AdRelease object) {
    if (_RowColor.LOG.isDebugEnabled()) {
      _RowColor.LOG.debug("adding " + object + " to adReleases relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToAdReleases(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _RowColor.AD_RELEASES_KEY);
    }
  }

  public void removeFromAdReleasesRelationship(com.as.model.AdRelease object) {
    if (_RowColor.LOG.isDebugEnabled()) {
      _RowColor.LOG.debug("removing " + object + " from adReleases relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromAdReleases(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _RowColor.AD_RELEASES_KEY);
    }
  }

  public com.as.model.AdRelease createAdReleasesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.AdRelease.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _RowColor.AD_RELEASES_KEY);
    return (com.as.model.AdRelease) eo;
  }

  public void deleteAdReleasesRelationship(com.as.model.AdRelease object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _RowColor.AD_RELEASES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllAdReleasesRelationships() {
    Enumeration<com.as.model.AdRelease> objects = adReleases().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteAdReleasesRelationship(objects.nextElement());
    }
  }


  public static RowColor createRowColor(EOEditingContext editingContext, Boolean isActive
, String rowColorName
) {
    RowColor eo = (RowColor) EOUtilities.createAndInsertInstance(editingContext, _RowColor.ENTITY_NAME);    
		eo.setIsActive(isActive);
		eo.setRowColorName(rowColorName);
    return eo;
  }

  public static ERXFetchSpecification<RowColor> fetchSpec() {
    return new ERXFetchSpecification<RowColor>(_RowColor.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<RowColor> fetchAllRowColors(EOEditingContext editingContext) {
    return _RowColor.fetchAllRowColors(editingContext, null);
  }

  public static NSArray<RowColor> fetchAllRowColors(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _RowColor.fetchRowColors(editingContext, null, sortOrderings);
  }

  public static NSArray<RowColor> fetchRowColors(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<RowColor> fetchSpec = new ERXFetchSpecification<RowColor>(_RowColor.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<RowColor> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static RowColor fetchRowColor(EOEditingContext editingContext, String keyName, Object value) {
    return _RowColor.fetchRowColor(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RowColor fetchRowColor(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<RowColor> eoObjects = _RowColor.fetchRowColors(editingContext, qualifier, null);
    RowColor eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one RowColor that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RowColor fetchRequiredRowColor(EOEditingContext editingContext, String keyName, Object value) {
    return _RowColor.fetchRequiredRowColor(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RowColor fetchRequiredRowColor(EOEditingContext editingContext, EOQualifier qualifier) {
    RowColor eoObject = _RowColor.fetchRowColor(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no RowColor that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RowColor localInstanceIn(EOEditingContext editingContext, RowColor eo) {
    RowColor localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
