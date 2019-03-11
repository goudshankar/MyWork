package com.spring.exceptions;

public class DBException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DBException() {
		super();
	}

	DBException(String message) {
		super(message);
	}

	DBException(String message, Throwable cause) {
		super(message, cause);
	}

	DBException(Throwable cause) {
		super(cause);
	}
}
