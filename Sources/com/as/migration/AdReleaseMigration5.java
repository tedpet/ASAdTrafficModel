
package com.as.migration;
import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.jdbc.ERXSQLHelper.ColumnIndex;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationDatabase.Migration;
import er.extensions.migration.ERXMigrationIndex;
import er.extensions.migration.ERXMigrationTable;


public class AdReleaseMigration5 extends Migration {

	@Override
	public void downgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		
	  ERXMigrationTable studioNumberTable = database.newTableNamed("studionumber");
    studioNumberTable.newIntegerColumn("clientid", false);
    studioNumberTable.newLargeStringColumn("description", true);
    studioNumberTable.newIntegerColumn("id", false);
    studioNumberTable.newFlagBooleanColumn("isactive", false);
    studioNumberTable.newLargeStringColumn("studiotitle", false);
    studioNumberTable.create();
    studioNumberTable.setPrimaryKey("id");

    studioNumberTable.addForeignKey("clientid", "client", "id");


    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(),       
        "ALTER SEQUENCE studionumber_seq RESTART WITH 4377");

		
	}

}
