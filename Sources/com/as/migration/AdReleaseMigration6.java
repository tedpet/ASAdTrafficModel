package com.as.migration;

import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationTable;
import er.extensions.migration.ERXMigrationDatabase.Migration;

public class AdReleaseMigration6 extends Migration {

  @Override
  public void downgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
    // TODO Auto-generated method stub

  }

  @Override
  public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {

    ERXMigrationTable securityTable = database.existingTableNamed("security");
    securityTable.newFlagBooleanColumn("canseestudionumbers", true);


  }

}
