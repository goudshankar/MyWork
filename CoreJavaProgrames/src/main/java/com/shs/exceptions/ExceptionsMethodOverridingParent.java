package com.shs.exceptions;

import java.io.FileNotFoundException;

/* Rule1:If super class method doesn't declare an exception.
 * if superclass method doesn't throw an exception then subclass overriden method should not declare
 * checked exception.
 * */
public class ExceptionsMethodOverridingParent {
	public void sendSms() {
		System.out.println("sending msg throug Airtle...");
		
	}
	
}
