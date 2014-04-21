// DO NOT EDIT.  Make changes to Security.java instead.
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
public abstract class _Security extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Security";

  // Attribute Keys
  public static final ERXKey<Boolean> CAN_ADD_NEW_RELEASE = new ERXKey<Boolean>("canAddNewRelease");
  public static final ERXKey<Boolean> CAN_CREATE_CLIENT = new ERXKey<Boolean>("canCreateClient");
  public static final ERXKey<Boolean> CAN_CREATE_PERSON = new ERXKey<Boolean>("canCreatePerson");
  public static final ERXKey<Boolean> CAN_DELETE_AD_RELEASE = new ERXKey<Boolean>("canDeleteAdRelease");
  public static final ERXKey<Boolean> CAN_DELETE_CLIENT = new ERXKey<Boolean>("canDeleteClient");
  public static final ERXKey<Boolean> CAN_DELETE_PERSON = new ERXKey<Boolean>("canDeletePerson");
  public static final ERXKey<Boolean> CAN_EDIT_AD_RELEASE = new ERXKey<Boolean>("canEditAdRelease");
  public static final ERXKey<Boolean> CAN_EDIT_CLIENT = new ERXKey<Boolean>("canEditClient");
  public static final ERXKey<Boolean> CAN_EDIT_PERSON = new ERXKey<Boolean>("canEditPerson");
  public static final ERXKey<Boolean> CAN_EDIT_PROJECTS = new ERXKey<Boolean>("canEditProjects");
  public static final ERXKey<Boolean> CAN_SEE_CLIENTS = new ERXKey<Boolean>("canSeeClients");
  public static final ERXKey<Boolean> CAN_SEE_PERSON = new ERXKey<Boolean>("canSeePerson");
  public static final ERXKey<Boolean> CAN_SEE_PROJECTS = new ERXKey<Boolean>("canSeeProjects");
  public static final ERXKey<Boolean> CAN_SEE_STUDIO_NUMBERS = new ERXKey<Boolean>("canSeeStudioNumbers");
  public static final ERXKey<Boolean> IS_INCLUDED_IN_PROJECTS = new ERXKey<Boolean>("isIncludedInProjects");
  public static final ERXKey<Boolean> SEES_SHORT_LIST = new ERXKey<Boolean>("seesShortList");
  // Relationship Keys
  public static final ERXKey<com.as.model.Person> PERSONS = new ERXKey<com.as.model.Person>("persons");

  // Attributes
  public static final String CAN_ADD_NEW_RELEASE_KEY = CAN_ADD_NEW_RELEASE.key();
  public static final String CAN_CREATE_CLIENT_KEY = CAN_CREATE_CLIENT.key();
  public static final String CAN_CREATE_PERSON_KEY = CAN_CREATE_PERSON.key();
  public static final String CAN_DELETE_AD_RELEASE_KEY = CAN_DELETE_AD_RELEASE.key();
  public static final String CAN_DELETE_CLIENT_KEY = CAN_DELETE_CLIENT.key();
  public static final String CAN_DELETE_PERSON_KEY = CAN_DELETE_PERSON.key();
  public static final String CAN_EDIT_AD_RELEASE_KEY = CAN_EDIT_AD_RELEASE.key();
  public static final String CAN_EDIT_CLIENT_KEY = CAN_EDIT_CLIENT.key();
  public static final String CAN_EDIT_PERSON_KEY = CAN_EDIT_PERSON.key();
  public static final String CAN_EDIT_PROJECTS_KEY = CAN_EDIT_PROJECTS.key();
  public static final String CAN_SEE_CLIENTS_KEY = CAN_SEE_CLIENTS.key();
  public static final String CAN_SEE_PERSON_KEY = CAN_SEE_PERSON.key();
  public static final String CAN_SEE_PROJECTS_KEY = CAN_SEE_PROJECTS.key();
  public static final String CAN_SEE_STUDIO_NUMBERS_KEY = CAN_SEE_STUDIO_NUMBERS.key();
  public static final String IS_INCLUDED_IN_PROJECTS_KEY = IS_INCLUDED_IN_PROJECTS.key();
  public static final String SEES_SHORT_LIST_KEY = SEES_SHORT_LIST.key();
  // Relationships
  public static final String PERSONS_KEY = PERSONS.key();

  private static Logger LOG = Logger.getLogger(_Security.class);

  public Security localInstanceIn(EOEditingContext editingContext) {
    Security localInstance = (Security)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean canAddNewRelease() {
    return (Boolean) storedValueForKey(_Security.CAN_ADD_NEW_RELEASE_KEY);
  }

  public void setCanAddNewRelease(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canAddNewRelease from " + canAddNewRelease() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_ADD_NEW_RELEASE_KEY);
  }

  public Boolean canCreateClient() {
    return (Boolean) storedValueForKey(_Security.CAN_CREATE_CLIENT_KEY);
  }

  public void setCanCreateClient(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canCreateClient from " + canCreateClient() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_CREATE_CLIENT_KEY);
  }

  public Boolean canCreatePerson() {
    return (Boolean) storedValueForKey(_Security.CAN_CREATE_PERSON_KEY);
  }

  public void setCanCreatePerson(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canCreatePerson from " + canCreatePerson() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_CREATE_PERSON_KEY);
  }

  public Boolean canDeleteAdRelease() {
    return (Boolean) storedValueForKey(_Security.CAN_DELETE_AD_RELEASE_KEY);
  }

  public void setCanDeleteAdRelease(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canDeleteAdRelease from " + canDeleteAdRelease() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_DELETE_AD_RELEASE_KEY);
  }

  public Boolean canDeleteClient() {
    return (Boolean) storedValueForKey(_Security.CAN_DELETE_CLIENT_KEY);
  }

  public void setCanDeleteClient(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canDeleteClient from " + canDeleteClient() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_DELETE_CLIENT_KEY);
  }

  public Boolean canDeletePerson() {
    return (Boolean) storedValueForKey(_Security.CAN_DELETE_PERSON_KEY);
  }

  public void setCanDeletePerson(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canDeletePerson from " + canDeletePerson() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_DELETE_PERSON_KEY);
  }

  public Boolean canEditAdRelease() {
    return (Boolean) storedValueForKey(_Security.CAN_EDIT_AD_RELEASE_KEY);
  }

  public void setCanEditAdRelease(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canEditAdRelease from " + canEditAdRelease() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_EDIT_AD_RELEASE_KEY);
  }

  public Boolean canEditClient() {
    return (Boolean) storedValueForKey(_Security.CAN_EDIT_CLIENT_KEY);
  }

  public void setCanEditClient(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canEditClient from " + canEditClient() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_EDIT_CLIENT_KEY);
  }

  public Boolean canEditPerson() {
    return (Boolean) storedValueForKey(_Security.CAN_EDIT_PERSON_KEY);
  }

  public void setCanEditPerson(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canEditPerson from " + canEditPerson() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_EDIT_PERSON_KEY);
  }

  public Boolean canEditProjects() {
    return (Boolean) storedValueForKey(_Security.CAN_EDIT_PROJECTS_KEY);
  }

  public void setCanEditProjects(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canEditProjects from " + canEditProjects() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_EDIT_PROJECTS_KEY);
  }

  public Boolean canSeeClients() {
    return (Boolean) storedValueForKey(_Security.CAN_SEE_CLIENTS_KEY);
  }

  public void setCanSeeClients(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canSeeClients from " + canSeeClients() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_SEE_CLIENTS_KEY);
  }

  public Boolean canSeePerson() {
    return (Boolean) storedValueForKey(_Security.CAN_SEE_PERSON_KEY);
  }

  public void setCanSeePerson(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canSeePerson from " + canSeePerson() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_SEE_PERSON_KEY);
  }

  public Boolean canSeeProjects() {
    return (Boolean) storedValueForKey(_Security.CAN_SEE_PROJECTS_KEY);
  }

  public void setCanSeeProjects(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canSeeProjects from " + canSeeProjects() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_SEE_PROJECTS_KEY);
  }

  public Boolean canSeeStudioNumbers() {
    return (Boolean) storedValueForKey(_Security.CAN_SEE_STUDIO_NUMBERS_KEY);
  }

  public void setCanSeeStudioNumbers(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating canSeeStudioNumbers from " + canSeeStudioNumbers() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.CAN_SEE_STUDIO_NUMBERS_KEY);
  }

  public Boolean isIncludedInProjects() {
    return (Boolean) storedValueForKey(_Security.IS_INCLUDED_IN_PROJECTS_KEY);
  }

  public void setIsIncludedInProjects(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating isIncludedInProjects from " + isIncludedInProjects() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.IS_INCLUDED_IN_PROJECTS_KEY);
  }

  public Boolean seesShortList() {
    return (Boolean) storedValueForKey(_Security.SEES_SHORT_LIST_KEY);
  }

  public void setSeesShortList(Boolean value) {
    if (_Security.LOG.isDebugEnabled()) {
    	_Security.LOG.debug( "updating seesShortList from " + seesShortList() + " to " + value);
    }
    takeStoredValueForKey(value, _Security.SEES_SHORT_LIST_KEY);
  }

  public NSArray<com.as.model.Person> persons() {
    return (NSArray<com.as.model.Person>)storedValueForKey(_Security.PERSONS_KEY);
  }

  public NSArray<com.as.model.Person> persons(EOQualifier qualifier) {
    return persons(qualifier, null, false);
  }

  public NSArray<com.as.model.Person> persons(EOQualifier qualifier, boolean fetch) {
    return persons(qualifier, null, fetch);
  }

  public NSArray<com.as.model.Person> persons(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.Person> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.Person.SECURITY_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.Person.fetchPersons(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = persons();
      if (qualifier != null) {
        results = (NSArray<com.as.model.Person>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.Person>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPersons(com.as.model.Person object) {
    includeObjectIntoPropertyWithKey(object, _Security.PERSONS_KEY);
  }

  public void removeFromPersons(com.as.model.Person object) {
    excludeObjectFromPropertyWithKey(object, _Security.PERSONS_KEY);
  }

  public void addToPersonsRelationship(com.as.model.Person object) {
    if (_Security.LOG.isDebugEnabled()) {
      _Security.LOG.debug("adding " + object + " to persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToPersons(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Security.PERSONS_KEY);
    }
  }

  public void removeFromPersonsRelationship(com.as.model.Person object) {
    if (_Security.LOG.isDebugEnabled()) {
      _Security.LOG.debug("removing " + object + " from persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromPersons(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Security.PERSONS_KEY);
    }
  }

  public com.as.model.Person createPersonsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.Person.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Security.PERSONS_KEY);
    return (com.as.model.Person) eo;
  }

  public void deletePersonsRelationship(com.as.model.Person object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Security.PERSONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPersonsRelationships() {
    Enumeration<com.as.model.Person> objects = persons().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePersonsRelationship(objects.nextElement());
    }
  }


  public static Security createSecurity(EOEditingContext editingContext, Boolean canAddNewRelease
, Boolean canCreateClient
, Boolean canCreatePerson
, Boolean canDeleteAdRelease
, Boolean canDeleteClient
, Boolean canDeletePerson
, Boolean canEditAdRelease
, Boolean canEditClient
, Boolean canEditPerson
, Boolean canEditProjects
, Boolean canSeeClients
, Boolean canSeePerson
, Boolean canSeeProjects
, Boolean canSeeStudioNumbers
, Boolean isIncludedInProjects
, Boolean seesShortList
) {
    Security eo = (Security) EOUtilities.createAndInsertInstance(editingContext, _Security.ENTITY_NAME);    
		eo.setCanAddNewRelease(canAddNewRelease);
		eo.setCanCreateClient(canCreateClient);
		eo.setCanCreatePerson(canCreatePerson);
		eo.setCanDeleteAdRelease(canDeleteAdRelease);
		eo.setCanDeleteClient(canDeleteClient);
		eo.setCanDeletePerson(canDeletePerson);
		eo.setCanEditAdRelease(canEditAdRelease);
		eo.setCanEditClient(canEditClient);
		eo.setCanEditPerson(canEditPerson);
		eo.setCanEditProjects(canEditProjects);
		eo.setCanSeeClients(canSeeClients);
		eo.setCanSeePerson(canSeePerson);
		eo.setCanSeeProjects(canSeeProjects);
		eo.setCanSeeStudioNumbers(canSeeStudioNumbers);
		eo.setIsIncludedInProjects(isIncludedInProjects);
		eo.setSeesShortList(seesShortList);
    return eo;
  }

  public static ERXFetchSpecification<Security> fetchSpec() {
    return new ERXFetchSpecification<Security>(_Security.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Security> fetchAllSecurities(EOEditingContext editingContext) {
    return _Security.fetchAllSecurities(editingContext, null);
  }

  public static NSArray<Security> fetchAllSecurities(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Security.fetchSecurities(editingContext, null, sortOrderings);
  }

  public static NSArray<Security> fetchSecurities(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Security> fetchSpec = new ERXFetchSpecification<Security>(_Security.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Security> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Security fetchSecurity(EOEditingContext editingContext, String keyName, Object value) {
    return _Security.fetchSecurity(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Security fetchSecurity(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Security> eoObjects = _Security.fetchSecurities(editingContext, qualifier, null);
    Security eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Security that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Security fetchRequiredSecurity(EOEditingContext editingContext, String keyName, Object value) {
    return _Security.fetchRequiredSecurity(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Security fetchRequiredSecurity(EOEditingContext editingContext, EOQualifier qualifier) {
    Security eoObject = _Security.fetchSecurity(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Security that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Security localInstanceIn(EOEditingContext editingContext, Security eo) {
    Security localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
