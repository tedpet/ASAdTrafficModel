// DO NOT EDIT.  Make changes to Project.java instead.
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
public abstract class _Project extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Project";

  // Attribute Keys
  public static final ERXKey<NSTimestamp> DUE_DATE = new ERXKey<NSTimestamp>("dueDate");
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  public static final ERXKey<Boolean> PRESENTATION = new ERXKey<Boolean>("presentation");
  public static final ERXKey<Boolean> PRIORITY = new ERXKey<Boolean>("priority");
  public static final ERXKey<String> PROJECT_DESCRIPTION = new ERXKey<String>("projectDescription");
  public static final ERXKey<String> PROJECT_TITLE = new ERXKey<String>("projectTitle");
  // Relationship Keys
  public static final ERXKey<com.as.model.Client> CLIENT = new ERXKey<com.as.model.Client>("client");
  public static final ERXKey<com.as.model.ProjectPerson> PROJECT_PERSONS = new ERXKey<com.as.model.ProjectPerson>("projectPersons");

  // Attributes
  public static final String DUE_DATE_KEY = DUE_DATE.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  public static final String PRESENTATION_KEY = PRESENTATION.key();
  public static final String PRIORITY_KEY = PRIORITY.key();
  public static final String PROJECT_DESCRIPTION_KEY = PROJECT_DESCRIPTION.key();
  public static final String PROJECT_TITLE_KEY = PROJECT_TITLE.key();
  // Relationships
  public static final String CLIENT_KEY = CLIENT.key();
  public static final String PROJECT_PERSONS_KEY = PROJECT_PERSONS.key();

  private static Logger LOG = Logger.getLogger(_Project.class);

  public Project localInstanceIn(EOEditingContext editingContext) {
    Project localInstance = (Project)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dueDate() {
    return (NSTimestamp) storedValueForKey(_Project.DUE_DATE_KEY);
  }

  public void setDueDate(NSTimestamp value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating dueDate from " + dueDate() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.DUE_DATE_KEY);
  }

  public Boolean isActive() {
    return (Boolean) storedValueForKey(_Project.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating isActive from " + isActive() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.IS_ACTIVE_KEY);
  }

  public Boolean presentation() {
    return (Boolean) storedValueForKey(_Project.PRESENTATION_KEY);
  }

  public void setPresentation(Boolean value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating presentation from " + presentation() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.PRESENTATION_KEY);
  }

  public Boolean priority() {
    return (Boolean) storedValueForKey(_Project.PRIORITY_KEY);
  }

  public void setPriority(Boolean value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating priority from " + priority() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.PRIORITY_KEY);
  }

  public String projectDescription() {
    return (String) storedValueForKey(_Project.PROJECT_DESCRIPTION_KEY);
  }

  public void setProjectDescription(String value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating projectDescription from " + projectDescription() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.PROJECT_DESCRIPTION_KEY);
  }

  public String projectTitle() {
    return (String) storedValueForKey(_Project.PROJECT_TITLE_KEY);
  }

  public void setProjectTitle(String value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating projectTitle from " + projectTitle() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.PROJECT_TITLE_KEY);
  }

  public com.as.model.Client client() {
    return (com.as.model.Client)storedValueForKey(_Project.CLIENT_KEY);
  }
  
  public void setClient(com.as.model.Client value) {
    takeStoredValueForKey(value, _Project.CLIENT_KEY);
  }

  public void setClientRelationship(com.as.model.Client value) {
    if (_Project.LOG.isDebugEnabled()) {
      _Project.LOG.debug("updating client from " + client() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setClient(value);
    }
    else if (value == null) {
    	com.as.model.Client oldValue = client();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Project.CLIENT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Project.CLIENT_KEY);
    }
  }
  
  public NSArray<com.as.model.ProjectPerson> projectPersons() {
    return (NSArray<com.as.model.ProjectPerson>)storedValueForKey(_Project.PROJECT_PERSONS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.ProjectPerson.PROJECT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _Project.PROJECT_PERSONS_KEY);
  }

  public void removeFromProjectPersons(com.as.model.ProjectPerson object) {
    excludeObjectFromPropertyWithKey(object, _Project.PROJECT_PERSONS_KEY);
  }

  public void addToProjectPersonsRelationship(com.as.model.ProjectPerson object) {
    if (_Project.LOG.isDebugEnabled()) {
      _Project.LOG.debug("adding " + object + " to projectPersons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProjectPersons(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Project.PROJECT_PERSONS_KEY);
    }
  }

  public void removeFromProjectPersonsRelationship(com.as.model.ProjectPerson object) {
    if (_Project.LOG.isDebugEnabled()) {
      _Project.LOG.debug("removing " + object + " from projectPersons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProjectPersons(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Project.PROJECT_PERSONS_KEY);
    }
  }

  public com.as.model.ProjectPerson createProjectPersonsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.ProjectPerson.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Project.PROJECT_PERSONS_KEY);
    return (com.as.model.ProjectPerson) eo;
  }

  public void deleteProjectPersonsRelationship(com.as.model.ProjectPerson object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Project.PROJECT_PERSONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProjectPersonsRelationships() {
    Enumeration<com.as.model.ProjectPerson> objects = projectPersons().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProjectPersonsRelationship(objects.nextElement());
    }
  }


  public static Project createProject(EOEditingContext editingContext, NSTimestamp dueDate
, Boolean isActive
, Boolean presentation
, Boolean priority
, String projectTitle
, com.as.model.Client client) {
    Project eo = (Project) EOUtilities.createAndInsertInstance(editingContext, _Project.ENTITY_NAME);    
		eo.setDueDate(dueDate);
		eo.setIsActive(isActive);
		eo.setPresentation(presentation);
		eo.setPriority(priority);
		eo.setProjectTitle(projectTitle);
    eo.setClientRelationship(client);
    return eo;
  }

  public static ERXFetchSpecification<Project> fetchSpec() {
    return new ERXFetchSpecification<Project>(_Project.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Project> fetchAllProjects(EOEditingContext editingContext) {
    return _Project.fetchAllProjects(editingContext, null);
  }

  public static NSArray<Project> fetchAllProjects(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Project.fetchProjects(editingContext, null, sortOrderings);
  }

  public static NSArray<Project> fetchProjects(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Project> fetchSpec = new ERXFetchSpecification<Project>(_Project.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Project> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Project fetchProject(EOEditingContext editingContext, String keyName, Object value) {
    return _Project.fetchProject(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Project fetchProject(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Project> eoObjects = _Project.fetchProjects(editingContext, qualifier, null);
    Project eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Project that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Project fetchRequiredProject(EOEditingContext editingContext, String keyName, Object value) {
    return _Project.fetchRequiredProject(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Project fetchRequiredProject(EOEditingContext editingContext, EOQualifier qualifier) {
    Project eoObject = _Project.fetchProject(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Project that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Project localInstanceIn(EOEditingContext editingContext, Project eo) {
    Project localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
