package com.shs.exceptions;

public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//code that may raise an Exception
			int data=100/0;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		//rest of the code
		System.out.println("rest of the code...");
	}

}
