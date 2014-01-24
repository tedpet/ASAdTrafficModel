
package com.as.migration;
import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationDatabase.Migration;
import er.extensions.migration.ERXMigrationTable;


public class AdReleaseMigration0 extends Migration {

	@Override
	public void downgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void upgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
		

		ERXMigrationTable rowColorTable = database.newTableNamed("rowcolor");
		rowColorTable.newIntegerColumn("id", false);
		rowColorTable.newIntegerColumn("orderingint", true);
		rowColorTable.newFlagBooleanColumn("isactive", false);
		rowColorTable.newLargeStringColumn("rowcolorname", false);
		rowColorTable.create();
	 	rowColorTable.setPrimaryKey("id");

		ERXMigrationTable clientTable = database.newTableNamed("client");
		clientTable.newLargeStringColumn("clientabbreviation", false);
		clientTable.newLargeStringColumn("clientname", false);
		clientTable.newIntegerColumn("id", false);
		clientTable.newFlagBooleanColumn("isactive", false);
		clientTable.create();
	 	clientTable.setPrimaryKey("id");

	 	ERXMigrationTable securityTable = database.newTableNamed("security");
		securityTable.newFlagBooleanColumn("canaddnewrelease", false);
		securityTable.newFlagBooleanColumn("cancreateclient", false);
		securityTable.newFlagBooleanColumn("cancreateperson", false);
		securityTable.newFlagBooleanColumn("candeleteadrelease", false);
		securityTable.newFlagBooleanColumn("candeleteclient", false);
		securityTable.newFlagBooleanColumn("candeleteperson", false);
		securityTable.newFlagBooleanColumn("caneditadrelease", false);
		securityTable.newFlagBooleanColumn("caneditclient", false);
		securityTable.newFlagBooleanColumn("caneditperson", false);
		securityTable.newFlagBooleanColumn("canseeclients", false);
		securityTable.newFlagBooleanColumn("canseeperson", false);
		securityTable.newIntegerColumn("id", false);
		securityTable.create();
	 	securityTable.setPrimaryKey("id");

	 	ERXMigrationTable adReleaseTable = database.newTableNamed("adrelease");
		adReleaseTable.newLargeStringColumn("adtype", false);
		adReleaseTable.newIntegerColumn("clientid", false);
		adReleaseTable.newLargeStringColumn("comments", true);
		adReleaseTable.newLargeStringColumn("pubcontact", true);
		adReleaseTable.newLargeStringColumn("creative", true);
		adReleaseTable.newDateColumn("duedate", false);
		adReleaseTable.newLargeStringColumn("email", true);
		adReleaseTable.newLargeStringColumn("extstat", true);
		adReleaseTable.newIntegerColumn("id", false);
		adReleaseTable.newFlagBooleanColumn("isclosed", false);
		adReleaseTable.newLargeStringColumn("issuedate", false);
		adReleaseTable.newLargeStringColumn("jobnumber", false);
		adReleaseTable.newLargeStringColumn("phonenumber", true);
		adReleaseTable.newLargeStringColumn("publication", false);
		adReleaseTable.newIntegerColumn("rowcolorid", false);
		adReleaseTable.newLargeStringColumn("status", true);
		adReleaseTable.newLargeStringColumn("unit", true);
		adReleaseTable.create();
	 	adReleaseTable.setPrimaryKey("id");

	 	
		ERXMigrationTable personTable = database.newTableNamed("Person");
		personTable.newStringColumn("email", 255, true);
		personTable.newStringColumn("firstname", 255, true);
		personTable.newIntegerColumn("id", false);
		personTable.newFlagBooleanColumn("isactive", false);
		personTable.newStringColumn("lastname", 255, true);
		personTable.newStringColumn("login", 255, true);
		personTable.newStringColumn("password", 255, true);
		personTable.newIntegerColumn("securityid", false);
		personTable.newLargeStringColumn("preferences", true);
		personTable.create();
	 	personTable.setPrimaryKey("id");

		adReleaseTable.addForeignKey("clientid", "client", "id");
		adReleaseTable.addForeignKey("rowcolorid", "rowcolor", "id");
		personTable.addForeignKey("securityid", "security", "id");

	
	    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 
	    		"INSERT INTO security (caneditadrelease, caneditperson, canseeperson, canseeclients, caneditclient, cancreateclient, candeleteclient, " +
	    		"canaddnewrelease, candeleteadrelease, candeleteperson, cancreateperson, id) " +
	    		"VALUES (true, true, true, true, true, true, true, true, true, true, true, 1)");
	    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 
	    		"INSERT INTO security (caneditadrelease, caneditperson, canseeperson, canseeclients, caneditclient, cancreateclient, candeleteclient,  " +
	    		"canaddnewrelease, candeleteadrelease, candeleteperson, cancreateperson, id) " +
	    		"VALUES (true, false, false, false, false, false, false, false, false, false, false, 2)");

	    ERXJDBCUtilities.fetchRowSet(database.adaptorChannel(), "SELECT setval('security_seq', 2)");    

/*Clients*/
	    
	    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
	    		"INSERT INTO client (clientabbreviation, clientname, isactive) Values ('GC', 'Premium Outlets', true)");

	    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
	    		"INSERT INTO client (clientabbreviation, clientname, isactive) Values ('CB', 'Constellation Brands, Inc.', true)");

	    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
	    		"INSERT INTO client (clientabbreviation, clientname, isactive) Values ('CT', 'Cartier', true)");

	    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
	    		"INSERT INTO client (clientabbreviation, clientname, isactive) Values ('RW', 'Rosewood Hotels & Resorts', true)");

	    
	    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
				"INSERT INTO rowcolor (rowcolorname, isactive, orderingint) VALUES ('None', true, 0)");
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
				"INSERT INTO rowcolor (rowcolorname, isactive, orderingint) VALUES ('Yellow', true, 1)");
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
				"INSERT INTO rowcolor (rowcolorname, isactive, orderingint) VALUES ('Red', true, 2)");
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
				"INSERT INTO rowcolor (rowcolorname, isactive, orderingint) VALUES ('Blue', true, 3)");
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
				"INSERT INTO rowcolor (rowcolorname, isactive, orderingint) VALUES ('Green', true, 4)");

	
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
		"INSERT INTO adrelease (adtype, clientid, rowcolorid, creative, publication, jobnumber, issuedate, duedate, pubcontact, isclosed) " +
		"VALUES ('P', 1, 1,'Yellow Bird', 'Boston Herald', '1008765', 'February 12', '1-3-2012', 'Dale Evans', false)");

		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
		"INSERT INTO adrelease (adtype, clientid, rowcolorid, creative, publication, jobnumber, issuedate, duedate, pubcontact, isclosed) " +
		"VALUES ('P', 1, 1,'blue Dress on bicycle', 'NY Times', '1008765', 'March 12', '1-3-2012', 'Sally Ride', false)");

		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
		"INSERT INTO adrelease (adtype, clientid, rowcolorid, creative, publication, jobnumber, issuedate, duedate, pubcontact, isclosed) " +
		"VALUES ('D', 1, 1,'Flash Banner', 'NY Times Online', '1008768', 'March 16', '1-3-2012', 'Sammy Ride', false)");

		
		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), 			
				"INSERT INTO person (firstName, lastName, login, password, isActive, securityID) VALUES " +
				"('Ted', 'Petrosky', 't', 't', true, 1)");

		ERXJDBCUtilities.executeUpdate(database.adaptorChannel(),
				"INSERT INTO person (firstName, lastName, login, password, isActive, securityID) VALUES " +
				"('Billy', 'Bob', 'b', 'b', true, 2)");
	
	}

}
