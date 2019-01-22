package com.shs.opps;

public class CovariantReturnTypeB extends CovariantReturnTypeA {
	CovariantReturnTypeB get() {
		return this;
	}
	//display message
	void message() {
		System.out.println("Welcome to covariant Return type..");
	}
	
	public static void main(String[] args) {
		new CovariantReturnTypeB().get().message();
		
	}
}
