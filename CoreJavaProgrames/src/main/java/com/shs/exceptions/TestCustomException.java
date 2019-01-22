package com.shs.exceptions;

public class TestCustomException {
	public static void validate(int age) throws InvalidAgeException_CustomerException{
		if(age<18)
			throw new InvalidAgeException_CustomerException("not valid age");
		else
			System.out.println("Your eligible for vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		validate(13);
		}
		catch(Exception m) {System.out.println("Exception occured:"+m);}
		System.out.println("rest of the code");
	}
}
