package com.shs.exceptions;

public class FinallyBlockTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=30/0;
			System.out.println(data);
		}
		catch(ArithmeticException ae) {System.out.println(ae);}
		finally {System.out.println("finally is executed...");}
		System.out.println("rest of the code");
	}

}
