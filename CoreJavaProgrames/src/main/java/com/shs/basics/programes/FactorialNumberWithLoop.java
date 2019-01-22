package com.shs.basics.programes;

public class FactorialNumberWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int num=4;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of Number::"+num+":is:"+fact);
	}

}
