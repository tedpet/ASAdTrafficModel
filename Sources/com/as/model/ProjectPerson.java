package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;

public class ProjectPerson extends _ProjectPerson {
	/**
   * 
   */
  private static final long serialVersionUID = 1L;
  @SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(ProjectPerson.class);
	
	
	
  @Override
  public void awakeFromInsertion (EOEditingContext editingContext) {
    super.awakeFromInsertion (editingContext);

    //    NSLog.out.appendln("*** awakeFromInsertion");
    //    this.setCreative("creative");

    /*
     * set the default complete status to false
     */

    this.setComplete(false);
    
  }
  
  public Person getPerson() {
    return this.person();
  }
}
