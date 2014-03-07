package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;

public class StudioNumber extends _StudioNumber {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(StudioNumber.class);

	public void awakeFromInsertion (EOEditingContext editingContext) {
    super.awakeFromInsertion (editingContext);

    //    NSLog.out.appendln("*** awakeFromInsertion");

    /*
     * set the default isActive to true
     */

    this.setIsActive(true);
	}

}
