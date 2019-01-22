package com.shs.opps;
/*
 * MethodOverloadingExceptionCases
 * 
 * Rule1:If super class method doesn't declares an exception then subclass overriden method can't declare the checked
 * exception but can declare unchecked exception.
 * */
public class Parent {
	void msg(){
		System.out.println("Parent class method");
	}
}
