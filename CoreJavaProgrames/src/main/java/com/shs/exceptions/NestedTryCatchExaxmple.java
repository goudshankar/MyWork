package com.shs.exceptions;

public class NestedTryCatchExaxmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int b=30/0;
				}
			catch(ArithmeticException ae) {System.out.println(ae);}
			try {
				int a[]=new int[5];
				a[5]=4;
				}
			catch(ArrayIndexOutOfBoundsException aioobe) {System.out.println(aioobe);}
			System.out.println("other statement");
		}
		catch(Exception e) {System.out.println(e);}
		System.out.println("Rest of the code will be executed here");
	}

}
