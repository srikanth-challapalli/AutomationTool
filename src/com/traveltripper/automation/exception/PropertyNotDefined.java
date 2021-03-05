package com.traveltripper.automation.exception;
/**
@author Challapalli Srikanth
*/
public class PropertyNotDefined extends Exception {
	
	private String message;
	
	public PropertyNotDefined() {
		// TODO Auto-generated constructor stub
	}
	public PropertyNotDefined(String message) {
		super(message);
		this.message =message;
	}

}
