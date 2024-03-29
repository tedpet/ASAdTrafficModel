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
  public static final ERXKey<com.as.model.Project> PROJECTS = new ERXKey<com.as.model.Project>("projects");
  public static final ERXKey<com.as.model.StudioNumber> STUDIO_NUMBERS = new ERXKey<com.as.model.StudioNumber>("studioNumbers");

  // Attributes
  public static final String CLIENT_ABBREVIATION_KEY = CLIENT_ABBREVIATION.key();
  public static final String CLIENT_NAME_KEY = CLIENT_NAME.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  // Relationships
  public static final String AD_RELEASES_KEY = AD_RELEASES.key();
  public static final String PROJECTS_KEY = PROJECTS.key();
  public static final String STUDIO_NUMBERS_KEY = STUDIO_NUMBERS.key();

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

  public NSArray<com.as.model.Project> projects() {
    return (NSArray<com.as.model.Project>)storedValueForKey(_Client.PROJECTS_KEY);
  }

  public NSArray<com.as.model.Project> projects(EOQualifier qualifier) {
    return projects(qualifier, null, false);
  }

  public NSArray<com.as.model.Project> projects(EOQualifier qualifier, boolean fetch) {
    return projects(qualifier, null, fetch);
  }

  public NSArray<com.as.model.Project> projects(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.Project> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.Project.CLIENT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.Project.fetchProjects(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = projects();
      if (qualifier != null) {
        results = (NSArray<com.as.model.Project>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.Project>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProjects(com.as.model.Project object) {
    includeObjectIntoPropertyWithKey(object, _Client.PROJECTS_KEY);
  }

  public void removeFromProjects(com.as.model.Project object) {
    excludeObjectFromPropertyWithKey(object, _Client.PROJECTS_KEY);
  }

  public void addToProjectsRelationship(com.as.model.Project object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("adding " + object + " to projects relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProjects(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Client.PROJECTS_KEY);
    }
  }

  public void removeFromProjectsRelationship(com.as.model.Project object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("removing " + object + " from projects relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProjects(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.PROJECTS_KEY);
    }
  }

  public com.as.model.Project createProjectsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.Project.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Client.PROJECTS_KEY);
    return (com.as.model.Project) eo;
  }

  public void deleteProjectsRelationship(com.as.model.Project object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.PROJECTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProjectsRelationships() {
    Enumeration<com.as.model.Project> objects = projects().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProjectsRelationship(objects.nextElement());
    }
  }

  public NSArray<com.as.model.StudioNumber> studioNumbers() {
    return (NSArray<com.as.model.StudioNumber>)storedValueForKey(_Client.STUDIO_NUMBERS_KEY);
  }

  public NSArray<com.as.model.StudioNumber> studioNumbers(EOQualifier qualifier) {
    return studioNumbers(qualifier, null, false);
  }

  public NSArray<com.as.model.StudioNumber> studioNumbers(EOQualifier qualifier, boolean fetch) {
    return studioNumbers(qualifier, null, fetch);
  }

  public NSArray<com.as.model.StudioNumber> studioNumbers(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.StudioNumber> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.StudioNumber.CLIENT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.StudioNumber.fetchStudioNumbers(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = studioNumbers();
      if (qualifier != null) {
        results = (NSArray<com.as.model.StudioNumber>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.StudioNumber>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToStudioNumbers(com.as.model.StudioNumber object) {
    includeObjectIntoPropertyWithKey(object, _Client.STUDIO_NUMBERS_KEY);
  }

  public void removeFromStudioNumbers(com.as.model.StudioNumber object) {
    excludeObjectFromPropertyWithKey(object, _Client.STUDIO_NUMBERS_KEY);
  }

  public void addToStudioNumbersRelationship(com.as.model.StudioNumber object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("adding " + object + " to studioNumbers relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToStudioNumbers(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Client.STUDIO_NUMBERS_KEY);
    }
  }

  public void removeFromStudioNumbersRelationship(com.as.model.StudioNumber object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("removing " + object + " from studioNumbers relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromStudioNumbers(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.STUDIO_NUMBERS_KEY);
    }
  }

  public com.as.model.StudioNumber createStudioNumbersRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.StudioNumber.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Client.STUDIO_NUMBERS_KEY);
    return (com.as.model.StudioNumber) eo;
  }

  public void deleteStudioNumbersRelationship(com.as.model.StudioNumber object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.STUDIO_NUMBERS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllStudioNumbersRelationships() {
    Enumeration<com.as.model.StudioNumber> objects = studioNumbers().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteStudioNumbersRelationship(objects.nextElement());
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
  public static NSArray<com.as.model.Client> fetchActiveClients(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("activeClients", _Client.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<com.as.model.Client>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<com.as.model.Client> fetchActiveClients(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("activeClients", _Client.ENTITY_NAME);
    return (NSArray<com.as.model.Client>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<com.as.model.Client> fetchIsActive(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("isActive", _Client.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<com.as.model.Client>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<com.as.model.Client> fetchIsActive(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("isActive", _Client.ENTITY_NAME);
    return (NSArray<com.as.model.Client>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
