
package com.as.migration;
import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationDatabase.Migration;
import er.extensions.migration.ERXMigrationTable;


public class AdReleaseMigration3 extends Migration {

	@Override
	public void downgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		
	  ERXMigrationTable adReleaseTable = database.existingTableNamed("adrelease");
    adReleaseTable.newFlagBooleanColumn("isbillboard", false, false);
    adReleaseTable.newFlagBooleanColumn("isdigital", false, false);
    
    ERXJDBCUtilities.executeUpdate(database.adaptorChannel(),       
        "UPDATE adrelease SET isbillboard = false, isdigital = false");

		
	}

}
