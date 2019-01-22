package com.shs.exceptions;

public class FinallyBlockTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=30/0;
			System.out.println(data);
		}
		catch(Exception npe) {System.out.println(npe);}
		finally {
			System.out.println("finally is executed always...");
		}
		System.out.println("rest of the code");
	}

}
