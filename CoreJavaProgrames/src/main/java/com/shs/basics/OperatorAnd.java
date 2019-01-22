package com.shs.basics;

public class OperatorAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=5;
		System.out.println(a<b&&a<c);	//if 1st condition is true then only check for 2nd condition other wise it won't check
		System.out.println(a<b&a<c);	//it checks both condition whether its true or false
	}

}
