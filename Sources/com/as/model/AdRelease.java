package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSValidation;

public class AdRelease extends _AdRelease {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(AdRelease.class);

	public void awakeFromInsertion (EOEditingContext editingContext) {
		super.awakeFromInsertion (editingContext);

//		NSLog.out.appendln("*** awakeFromInsertion");
//		this.setCreative("creative");
		this.setIsClosed(false);
		
		/*
		 * set the default row color to none and ad type
		 */

		this.setAdType("P"); //we are not using this anymore but the ad type is mandatory so we must keep it until we kill the column!
		
		this.setRowColor(RowColor.fetchRequiredRowColor(editingContext, RowColor.ROW_COLOR_NAME.eq("None")));
		
		this.setPhoneNumber("---");
		this.setPubContact("---");
		this.setEMail("---");
		this.setComments("---");
		this.setIsBillboard(false);
		this.setIsDigital(false);
	}
	
	
	
	public NSArray<Client> currentClients() {
		
	    NSArray<Client> clientList = Client.fetchClients(editingContext(), Client.IS_ACTIVE.eq(true), null);
	   
	    return clientList;
	}
	
	public NSArray<RowColor> currentRowColors() {

		NSArray<RowColor> rowColorList = RowColor.fetchRowColors(editingContext(), RowColor.IS_ACTIVE.eq(true), RowColor.ORDERING_INT.ascs());

		return rowColorList;
	}



  public Object validatePhoneNumber(Object value) throws NSValidation.ValidationException {
    return value == null ? "---" : value;
  }
  
  public Object validateEMail(Object value) throws NSValidation.ValidationException {
    return value == null ? "---" : value;
  }
  
  public Object validatePubContact(Object value) throws NSValidation.ValidationException {
    return value == null ? "---" : value;
  }
  
  public Object validateComments(Object value) throws NSValidation.ValidationException {
    return value == null ? "---" : value;
  }
  

}
