package com.traveltripper.automation.exception;

public class NullCheckException extends Exception {
	/**
	@author Challapalli Srikanth
	*/
	private static final long serialVersionUID = 1L;
	private String message;
	
	public NullCheckException() {
		// TODO Auto-generated constructor stub
	}
	public NullCheckException(String message) {
		super(message);
		this.message =message;
	}
}
