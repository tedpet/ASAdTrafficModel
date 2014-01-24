
package com.as.migration;
import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationDatabase.Migration;
import er.extensions.migration.ERXMigrationTable;


public class AdReleaseMigration2 extends Migration {

	@Override
	public void downgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		
	   ERXJDBCUtilities.executeUpdate(database.adaptorChannel(),       
	        "INSERT INTO rowcolor (rowcolorname, isactive, orderingint) VALUES ('Light Blue', true, 5)");

		
	}

}
