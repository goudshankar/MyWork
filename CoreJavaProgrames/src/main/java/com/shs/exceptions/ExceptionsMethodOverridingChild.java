package com.shs.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsMethodOverridingChild extends ExceptionsMethodOverridingParent{

	public void sendSms() throws NullPointerException{System.out.println("Sending Sms through Idea");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
