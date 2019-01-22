package com.shs.exceptions;

public class FinallyBlockTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=30/5;
			System.out.println(data);
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		finally {System.out.println("Finally block is executed");}
		System.out.println("rest of the code");
	}

}
