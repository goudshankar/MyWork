package com.shs.exceptions;

public class ThrowTest {
	
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Your not elegibale for vote");
		}
		else {
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(18);
		System.out.println("rest of the code");
	}

}
