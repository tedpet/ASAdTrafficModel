package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;

import er.corebusinesslogic.ERCoreUserInterface;
import er.extensions.eof.ERXEOControlUtilities;
import er.extensions.foundation.ERXThreadStorage;

public class Person extends _Person implements ERCoreUserInterface  {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Person.class);

	public static final String PreferencesKey = "preferences";

	public static Person currentUser() {
		return (Person) ERXThreadStorage.valueForKey("user");
	}

	public void awakeFromInsertion (EOEditingContext editingContext) {
		super.awakeFromInsertion (editingContext);

		//		NSLog.out.appendln("*** awakeFromInsertion");
		//		this.setCreative("creative");

		/*
		 * set the default isActive to true
		 */

		this.setIsActive(true);
		
		Security theSec = Security.createSecurity(editingContext, false, false, false, false, false, false, false, false, false, false, false, false);			
		
		this.setSecurity(theSec);
	
	}

	public static Person currentUser(EOEditingContext ec) {
		Person currentUser = currentUser();
		if (currentUser != null && currentUser.editingContext() != ec) {
			EOEditingContext currentUserEc = currentUser.editingContext();
			currentUserEc.lock();
			try {
				Person localUser = (Person) ERXEOControlUtilities.localInstanceOfObject(ec, currentUser);
				currentUser = localUser;
			}
			finally {
				currentUserEc.unlock();
			}
		}
		return currentUser;
	}

	public String fullName() {
		return this.firstName() + " " + this.lastName();
	}

	public static Person validateLogin(EOEditingContext editingContext, String username, String password) {
		EOQualifier qual = Person.LOGIN.eq(username).and(Person.PASSWORD.eq(password));
		Person user = Person.fetchRequiredPerson(editingContext, qual);

		NSLog.out.appendln("The user (validateLogin()) is " + user.fullName());

		return user;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public NSArray preferences() {
		return (NSArray)storedValueForKey(PreferencesKey);	
	}

	@SuppressWarnings("rawtypes")
	@Override 
	public void setPreferences (NSArray array) {
		takeStoredValueForKey(array.mutableClone(), PreferencesKey);
	}


	public void newPrefernces(EOEnterpriseObject pref) {
		addObjectToBothSidesOfRelationshipWithKey(pref, PreferencesKey);
	}


	@Override
	public void newPreference(EOEnterpriseObject pref) {
		// TODO Auto-generated method stub

	}

}
