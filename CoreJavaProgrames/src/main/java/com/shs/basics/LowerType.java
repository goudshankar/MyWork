package com.shs.basics;

public class LowerType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		byte b=20;
		//byte c=a+b;
		byte c=(byte)(a+b);//type casting(narrowing) to bigger type variable to small type value 
		System.out.println(c);
	}

}
