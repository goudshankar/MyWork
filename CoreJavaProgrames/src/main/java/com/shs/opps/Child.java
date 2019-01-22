package com.shs.opps;

import java.io.IOException;

public class Child extends Parent {

	void msg() throws ArithmeticException{	//here IOException is not allowed becoz super class doen't throwing any exception
											//but unchecked exceptions are allowed
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.msg();
	}
}
