package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

public class Client extends _Client {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Client.class);

	public NSArray<Client> currentClients() {
		
	    NSArray<Client> clientList = Client.fetchClients(editingContext(), Client.IS_ACTIVE.eq(true), null);
	   
	    return clientList;
	}

  public void awakeFromInsertion (EOEditingContext editingContext) {
    super.awakeFromInsertion (editingContext);

    //    NSLog.out.appendln("*** awakeFromInsertion");

    /*
     * set the default isActive to true
     */

    this.setIsActive(true);
  }
}
