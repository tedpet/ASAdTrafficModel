package com.as.migration;

import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationDatabase.Migration;
import er.extensions.migration.ERXMigrationTable;

public class AdReleaseMigration7 extends Migration {

  @Override
  public void downgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
    // TODO Auto-generated method stub

  }

  @Override
  public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
    
    ERXMigrationTable projectTable = database.newTableNamed("project");
    projectTable.newIntegerColumn("clientid", false);
    projectTable.newDateColumn("duedate", false);
    projectTable.newIntegerColumn("id", false);
    projectTable.newFlagBooleanColumn("isactive", false);
    projectTable.newFlagBooleanColumn("presentation", false);
    projectTable.newFlagBooleanColumn("priority", false);
    projectTable.newLargeStringColumn("projectdescription", true);
    projectTable.newLargeStringColumn("projecttitle", false);
    projectTable.create();
    projectTable.setPrimaryKey("id");

    
    ERXMigrationTable projectPersonTable = database.newTableNamed("projectperson");
    projectPersonTable.newFlagBooleanColumn("complete", false);
    projectPersonTable.newDateColumn("duedate", true);
    projectPersonTable.newIntegerColumn("id", false);
    projectPersonTable.newIntegerColumn("personid", false);
    projectPersonTable.newLargeStringColumn("personstep", false);
    projectPersonTable.newIntegerColumn("projectid", false);
    projectPersonTable.create();
    projectPersonTable.setPrimaryKey("id");


    projectPersonTable.addForeignKey("personid", "Person", "id");
    projectPersonTable.addForeignKey("projectid", "project", "id");

    
    ERXMigrationTable securityTable = database.existingTableNamed("security");
    securityTable.newFlagBooleanColumn("canseeprojects", true);
    securityTable.newFlagBooleanColumn("caneditprojects", true);
    securityTable.newFlagBooleanColumn("isincludedinprojects", true);
    
    
    /* Person needs a title
     * this  is for the project tracker
     */
    ERXMigrationTable personTable = database.existingTableNamed("person");
    personTable.newLargeStringColumn("title", true);


    /*
     * Fix the canseeprojects and caneditprojects booleans
     */
     ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "UPDATE security set canseeprojects = false");
     ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "UPDATE security set caneditprojects = false");
    
     securityTable.existingColumnNamed("canseeprojects").setAllowsNull(false);

     ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "UPDATE security set canseeprojects = true where id = 1");
     ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "UPDATE security set caneditprojects = true where id = 1");
    
    /*
     * Fix the isincludedinprojects boolean
     */
     ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "UPDATE security set isincludedinprojects = false");
    
     securityTable.existingColumnNamed("isincludedinprojects").setAllowsNull(false);
 
     ERXJDBCUtilities.executeUpdate(database.adaptorChannel(), "UPDATE security set isincludedinprojects = true where id = 1");
 
  }

}
