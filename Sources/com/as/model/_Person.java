// DO NOT EDIT.  Make changes to Person.java instead.
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
public abstract class _Person extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Person";

  // Attribute Keys
  public static final ERXKey<String> EMAIL = new ERXKey<String>("email");
  public static final ERXKey<String> FIRST_NAME = new ERXKey<String>("firstName");
  public static final ERXKey<String> FULL_NAME = new ERXKey<String>("fullName");
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  public static final ERXKey<String> LAST_NAME = new ERXKey<String>("lastName");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<String> PASSWORD = new ERXKey<String>("password");
  public static final ERXKey<String> TITLE = new ERXKey<String>("title");
  // Relationship Keys
  public static final ERXKey<com.as.model.ProjectPerson> PROJECT_PERSONS = new ERXKey<com.as.model.ProjectPerson>("projectPersons");
  public static final ERXKey<com.as.model.Security> SECURITY = new ERXKey<com.as.model.Security>("security");

  // Attributes
  public static final String EMAIL_KEY = EMAIL.key();
  public static final String FIRST_NAME_KEY = FIRST_NAME.key();
  public static final String FULL_NAME_KEY = FULL_NAME.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  public static final String LAST_NAME_KEY = LAST_NAME.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String PASSWORD_KEY = PASSWORD.key();
  public static final String TITLE_KEY = TITLE.key();
  // Relationships
  public static final String PROJECT_PERSONS_KEY = PROJECT_PERSONS.key();
  public static final String SECURITY_KEY = SECURITY.key();

  private static Logger LOG = Logger.getLogger(_Person.class);

  public Person localInstanceIn(EOEditingContext editingContext) {
    Person localInstance = (Person)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String email() {
    return (String) storedValueForKey(_Person.EMAIL_KEY);
  }

  public void setEmail(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating email from " + email() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.EMAIL_KEY);
  }

  public String firstName() {
    return (String) storedValueForKey(_Person.FIRST_NAME_KEY);
  }

  public void setFirstName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating firstName from " + firstName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.FIRST_NAME_KEY);
  }

  public String fullName() {
    return (String) storedValueForKey(_Person.FULL_NAME_KEY);
  }

  public void setFullName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating fullName from " + fullName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.FULL_NAME_KEY);
  }

  public Boolean isActive() {
    return (Boolean) storedValueForKey(_Person.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating isActive from " + isActive() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.IS_ACTIVE_KEY);
  }

  public String lastName() {
    return (String) storedValueForKey(_Person.LAST_NAME_KEY);
  }

  public void setLastName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating lastName from " + lastName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LAST_NAME_KEY);
  }

  public String login() {
    return (String) storedValueForKey(_Person.LOGIN_KEY);
  }

  public void setLogin(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating login from " + login() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LOGIN_KEY);
  }

  public String password() {
    return (String) storedValueForKey(_Person.PASSWORD_KEY);
  }

  public void setPassword(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating password from " + password() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.PASSWORD_KEY);
  }

  public String title() {
    return (String) storedValueForKey(_Person.TITLE_KEY);
  }

  public void setTitle(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating title from " + title() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.TITLE_KEY);
  }

  public com.as.model.Security security() {
    return (com.as.model.Security)storedValueForKey(_Person.SECURITY_KEY);
  }
  
  public void setSecurity(com.as.model.Security value) {
    takeStoredValueForKey(value, _Person.SECURITY_KEY);
  }

  public void setSecurityRelationship(com.as.model.Security value) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("updating security from " + security() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setSecurity(value);
    }
    else if (value == null) {
    	com.as.model.Security oldValue = security();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Person.SECURITY_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Person.SECURITY_KEY);
    }
  }
  
  public NSArray<com.as.model.ProjectPerson> projectPersons() {
    return (NSArray<com.as.model.ProjectPerson>)storedValueForKey(_Person.PROJECT_PERSONS_KEY);
  }

  public NSArray<com.as.model.ProjectPerson> projectPersons(EOQualifier qualifier) {
    return projectPersons(qualifier, null, false);
  }

  public NSArray<com.as.model.ProjectPerson> projectPersons(EOQualifier qualifier, boolean fetch) {
    return projectPersons(qualifier, null, fetch);
  }

  public NSArray<com.as.model.ProjectPerson> projectPersons(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.ProjectPerson> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.ProjectPerson.PERSON_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.ProjectPerson.fetchProjectPersons(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = projectPersons();
      if (qualifier != null) {
        results = (NSArray<com.as.model.ProjectPerson>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.ProjectPerson>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProjectPersons(com.as.model.ProjectPerson object) {
    includeObjectIntoPropertyWithKey(object, _Person.PROJECT_PERSONS_KEY);
  }

  public void removeFromProjectPersons(com.as.model.ProjectPerson object) {
    excludeObjectFromPropertyWithKey(object, _Person.PROJECT_PERSONS_KEY);
  }

  public void addToProjectPersonsRelationship(com.as.model.ProjectPerson object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("adding " + object + " to projectPersons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProjectPersons(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Person.PROJECT_PERSONS_KEY);
    }
  }

  public void removeFromProjectPersonsRelationship(com.as.model.ProjectPerson object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("removing " + object + " from projectPersons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProjectPersons(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.PROJECT_PERSONS_KEY);
    }
  }

  public com.as.model.ProjectPerson createProjectPersonsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.ProjectPerson.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Person.PROJECT_PERSONS_KEY);
    return (com.as.model.ProjectPerson) eo;
  }

  public void deleteProjectPersonsRelationship(com.as.model.ProjectPerson object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.PROJECT_PERSONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProjectPersonsRelationships() {
    Enumeration<com.as.model.ProjectPerson> objects = projectPersons().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProjectPersonsRelationship(objects.nextElement());
    }
  }


  public static Person createPerson(EOEditingContext editingContext, String firstName
, String fullName
, Boolean isActive
, String login
, com.as.model.Security security) {
    Person eo = (Person) EOUtilities.createAndInsertInstance(editingContext, _Person.ENTITY_NAME);    
		eo.setFirstName(firstName);
		eo.setFullName(fullName);
		eo.setIsActive(isActive);
		eo.setLogin(login);
    eo.setSecurityRelationship(security);
    return eo;
  }

  public static ERXFetchSpecification<Person> fetchSpec() {
    return new ERXFetchSpecification<Person>(_Person.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Person> fetchAllPersons(EOEditingContext editingContext) {
    return _Person.fetchAllPersons(editingContext, null);
  }

  public static NSArray<Person> fetchAllPersons(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Person.fetchPersons(editingContext, null, sortOrderings);
  }

  public static NSArray<Person> fetchPersons(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Person> fetchSpec = new ERXFetchSpecification<Person>(_Person.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Person> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Person fetchPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Person fetchPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Person> eoObjects = _Person.fetchPersons(editingContext, qualifier, null);
    Person eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Person fetchRequiredPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchRequiredPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Person fetchRequiredPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    Person eoObject = _Person.fetchPerson(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Person localInstanceIn(EOEditingContext editingContext, Person eo) {
    Person localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<com.as.model.Person> fetchActiveUsers(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("activeUsers", _Person.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<com.as.model.Person>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<com.as.model.Person> fetchActiveUsers(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("activeUsers", _Person.ENTITY_NAME);
    return (NSArray<com.as.model.Person>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<com.as.model.Person> fetchIsIncludedInProjects(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("isIncludedInProjects", _Person.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<com.as.model.Person>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<com.as.model.Person> fetchIsIncludedInProjects(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("isIncludedInProjects", _Person.ENTITY_NAME);
    return (NSArray<com.as.model.Person>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
