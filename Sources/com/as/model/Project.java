package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

public class Project extends _Project {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Project.class);
	
	@Override
  public void awakeFromInsertion (EOEditingContext editingContext) {
    super.awakeFromInsertion (editingContext);

    //    NSLog.out.appendln("*** awakeFromInsertion");
    //    this.setCreative("creative");

    /*
     * set the default complete status to false
     */

    this.setIsActive(true);
    
  }
	
	public NSArray<ProjectPerson> getProjectPersons() {
	  return this.projectPersons();
	}
	
	public String getProjectTitle() {
	  return this.projectTitle();
	}
}
