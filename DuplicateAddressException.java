package com.addressbook;

public class DuplicateAddressException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public DuplicateAddressException(String errorMessage) {
	super(errorMessage);
}
}
