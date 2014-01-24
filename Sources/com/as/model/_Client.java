// DO NOT EDIT.  Make changes to Client.java instead.
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
public abstract class _Client extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Client";

  // Attribute Keys
  public static final ERXKey<String> CLIENT_ABBREVIATION = new ERXKey<String>("clientAbbreviation");
  public static final ERXKey<String> CLIENT_NAME = new ERXKey<String>("clientName");
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  // Relationship Keys
  public static final ERXKey<com.as.model.AdRelease> AD_RELEASES = new ERXKey<com.as.model.AdRelease>("adReleases");

  // Attributes
  public static final String CLIENT_ABBREVIATION_KEY = CLIENT_ABBREVIATION.key();
  public static final String CLIENT_NAME_KEY = CLIENT_NAME.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  // Relationships
  public static final String AD_RELEASES_KEY = AD_RELEASES.key();

  private static Logger LOG = Logger.getLogger(_Client.class);

  public Client localInstanceIn(EOEditingContext editingContext) {
    Client localInstance = (Client)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String clientAbbreviation() {
    return (String) storedValueForKey(_Client.CLIENT_ABBREVIATION_KEY);
  }

  public void setClientAbbreviation(String value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating clientAbbreviation from " + clientAbbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.CLIENT_ABBREVIATION_KEY);
  }

  public String clientName() {
    return (String) storedValueForKey(_Client.CLIENT_NAME_KEY);
  }

  public void setClientName(String value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating clientName from " + clientName() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.CLIENT_NAME_KEY);
  }

  public Boolean isActive() {
    return (Boolean) storedValueForKey(_Client.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating isActive from " + isActive() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.IS_ACTIVE_KEY);
  }

  public NSArray<com.as.model.AdRelease> adReleases() {
    return (NSArray<com.as.model.AdRelease>)storedValueForKey(_Client.AD_RELEASES_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.AdRelease.CLIENT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _Client.AD_RELEASES_KEY);
  }

  public void removeFromAdReleases(com.as.model.AdRelease object) {
    excludeObjectFromPropertyWithKey(object, _Client.AD_RELEASES_KEY);
  }

  public void addToAdReleasesRelationship(com.as.model.AdRelease object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("adding " + object + " to adReleases relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToAdReleases(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Client.AD_RELEASES_KEY);
    }
  }

  public void removeFromAdReleasesRelationship(com.as.model.AdRelease object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("removing " + object + " from adReleases relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromAdReleases(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.AD_RELEASES_KEY);
    }
  }

  public com.as.model.AdRelease createAdReleasesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.AdRelease.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Client.AD_RELEASES_KEY);
    return (com.as.model.AdRelease) eo;
  }

  public void deleteAdReleasesRelationship(com.as.model.AdRelease object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.AD_RELEASES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllAdReleasesRelationships() {
    Enumeration<com.as.model.AdRelease> objects = adReleases().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteAdReleasesRelationship(objects.nextElement());
    }
  }


  public static Client createClient(EOEditingContext editingContext, String clientAbbreviation
, String clientName
, Boolean isActive
) {
    Client eo = (Client) EOUtilities.createAndInsertInstance(editingContext, _Client.ENTITY_NAME);    
		eo.setClientAbbreviation(clientAbbreviation);
		eo.setClientName(clientName);
		eo.setIsActive(isActive);
    return eo;
  }

  public static ERXFetchSpecification<Client> fetchSpec() {
    return new ERXFetchSpecification<Client>(_Client.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Client> fetchAllClients(EOEditingContext editingContext) {
    return _Client.fetchAllClients(editingContext, null);
  }

  public static NSArray<Client> fetchAllClients(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Client.fetchClients(editingContext, null, sortOrderings);
  }

  public static NSArray<Client> fetchClients(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Client> fetchSpec = new ERXFetchSpecification<Client>(_Client.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Client> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Client fetchClient(EOEditingContext editingContext, String keyName, Object value) {
    return _Client.fetchClient(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Client fetchClient(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Client> eoObjects = _Client.fetchClients(editingContext, qualifier, null);
    Client eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Client that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Client fetchRequiredClient(EOEditingContext editingContext, String keyName, Object value) {
    return _Client.fetchRequiredClient(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Client fetchRequiredClient(EOEditingContext editingContext, EOQualifier qualifier) {
    Client eoObject = _Client.fetchClient(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Client that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Client localInstanceIn(EOEditingContext editingContext, Client eo) {
    Client localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
