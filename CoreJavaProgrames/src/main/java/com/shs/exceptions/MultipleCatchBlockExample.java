package com.shs.exceptions;

public class MultipleCatchBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];//array size is fixed
			a[5]=30/0;
		}
		catch(ArithmeticException ae) {System.out.println("task1 completed");}
		catch(ArrayIndexOutOfBoundsException aioobe) {System.out.println("task2 completed");}
		catch(Exception e) {System.out.println("common task completed");}
		System.out.println("rest of the code");
	}

}
