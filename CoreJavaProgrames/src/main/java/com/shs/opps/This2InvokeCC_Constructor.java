package com.shs.opps;

public class This2InvokeCC_Constructor {
	//default constructor
	This2InvokeCC_Constructor(){
		System.out.println("Hello This is Default constructor..");
	}
	This2InvokeCC_Constructor(int x){
		this();	//calls current class default constructor
		System.out.println("The value of x is:"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This2InvokeCC_Constructor ticc=new This2InvokeCC_Constructor(5);
	}

}
