// DO NOT EDIT.  Make changes to ProjectPerson.java instead.
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
public abstract class _ProjectPerson extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "ProjectPerson";

  // Attribute Keys
  public static final ERXKey<Boolean> COMPLETE = new ERXKey<Boolean>("complete");
  public static final ERXKey<NSTimestamp> DUE_DATE = new ERXKey<NSTimestamp>("dueDate");
  public static final ERXKey<String> PERSON_STEP = new ERXKey<String>("personStep");
  // Relationship Keys
  public static final ERXKey<com.as.model.Person> PERSON = new ERXKey<com.as.model.Person>("person");
  public static final ERXKey<com.as.model.Project> PROJECT = new ERXKey<com.as.model.Project>("project");

  // Attributes
  public static final String COMPLETE_KEY = COMPLETE.key();
  public static final String DUE_DATE_KEY = DUE_DATE.key();
  public static final String PERSON_STEP_KEY = PERSON_STEP.key();
  // Relationships
  public static final String PERSON_KEY = PERSON.key();
  public static final String PROJECT_KEY = PROJECT.key();

  private static Logger LOG = Logger.getLogger(_ProjectPerson.class);

  public ProjectPerson localInstanceIn(EOEditingContext editingContext) {
    ProjectPerson localInstance = (ProjectPerson)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean complete() {
    return (Boolean) storedValueForKey(_ProjectPerson.COMPLETE_KEY);
  }

  public void setComplete(Boolean value) {
    if (_ProjectPerson.LOG.isDebugEnabled()) {
    	_ProjectPerson.LOG.debug( "updating complete from " + complete() + " to " + value);
    }
    takeStoredValueForKey(value, _ProjectPerson.COMPLETE_KEY);
  }

  public NSTimestamp dueDate() {
    return (NSTimestamp) storedValueForKey(_ProjectPerson.DUE_DATE_KEY);
  }

  public void setDueDate(NSTimestamp value) {
    if (_ProjectPerson.LOG.isDebugEnabled()) {
    	_ProjectPerson.LOG.debug( "updating dueDate from " + dueDate() + " to " + value);
    }
    takeStoredValueForKey(value, _ProjectPerson.DUE_DATE_KEY);
  }

  public String personStep() {
    return (String) storedValueForKey(_ProjectPerson.PERSON_STEP_KEY);
  }

  public void setPersonStep(String value) {
    if (_ProjectPerson.LOG.isDebugEnabled()) {
    	_ProjectPerson.LOG.debug( "updating personStep from " + personStep() + " to " + value);
    }
    takeStoredValueForKey(value, _ProjectPerson.PERSON_STEP_KEY);
  }

  public com.as.model.Person person() {
    return (com.as.model.Person)storedValueForKey(_ProjectPerson.PERSON_KEY);
  }
  
  public void setPerson(com.as.model.Person value) {
    takeStoredValueForKey(value, _ProjectPerson.PERSON_KEY);
  }

  public void setPersonRelationship(com.as.model.Person value) {
    if (_ProjectPerson.LOG.isDebugEnabled()) {
      _ProjectPerson.LOG.debug("updating person from " + person() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setPerson(value);
    }
    else if (value == null) {
    	com.as.model.Person oldValue = person();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ProjectPerson.PERSON_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _ProjectPerson.PERSON_KEY);
    }
  }
  
  public com.as.model.Project project() {
    return (com.as.model.Project)storedValueForKey(_ProjectPerson.PROJECT_KEY);
  }
  
  public void setProject(com.as.model.Project value) {
    takeStoredValueForKey(value, _ProjectPerson.PROJECT_KEY);
  }

  public void setProjectRelationship(com.as.model.Project value) {
    if (_ProjectPerson.LOG.isDebugEnabled()) {
      _ProjectPerson.LOG.debug("updating project from " + project() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setProject(value);
    }
    else if (value == null) {
    	com.as.model.Project oldValue = project();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ProjectPerson.PROJECT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _ProjectPerson.PROJECT_KEY);
    }
  }
  

  public static ProjectPerson createProjectPerson(EOEditingContext editingContext, Boolean complete
, String personStep
, com.as.model.Person person, com.as.model.Project project) {
    ProjectPerson eo = (ProjectPerson) EOUtilities.createAndInsertInstance(editingContext, _ProjectPerson.ENTITY_NAME);    
		eo.setComplete(complete);
		eo.setPersonStep(personStep);
    eo.setPersonRelationship(person);
    eo.setProjectRelationship(project);
    return eo;
  }

  public static ERXFetchSpecification<ProjectPerson> fetchSpec() {
    return new ERXFetchSpecification<ProjectPerson>(_ProjectPerson.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<ProjectPerson> fetchAllProjectPersons(EOEditingContext editingContext) {
    return _ProjectPerson.fetchAllProjectPersons(editingContext, null);
  }

  public static NSArray<ProjectPerson> fetchAllProjectPersons(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ProjectPerson.fetchProjectPersons(editingContext, null, sortOrderings);
  }

  public static NSArray<ProjectPerson> fetchProjectPersons(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<ProjectPerson> fetchSpec = new ERXFetchSpecification<ProjectPerson>(_ProjectPerson.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ProjectPerson> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static ProjectPerson fetchProjectPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _ProjectPerson.fetchProjectPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ProjectPerson fetchProjectPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ProjectPerson> eoObjects = _ProjectPerson.fetchProjectPersons(editingContext, qualifier, null);
    ProjectPerson eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ProjectPerson that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ProjectPerson fetchRequiredProjectPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _ProjectPerson.fetchRequiredProjectPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ProjectPerson fetchRequiredProjectPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    ProjectPerson eoObject = _ProjectPerson.fetchProjectPerson(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ProjectPerson that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ProjectPerson localInstanceIn(EOEditingContext editingContext, ProjectPerson eo) {
    ProjectPerson localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
