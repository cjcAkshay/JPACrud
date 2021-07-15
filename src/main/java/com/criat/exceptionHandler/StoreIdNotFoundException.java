package com.criat.exceptionHandler;

public class StoreIdNotFoundException extends RuntimeException {

	//private static final long serialVersionUID = 1L;

	public StoreIdNotFoundException(String message) {
		super(message);
	}

}
