package com.shs.opps;

public class InstanceBlock1 {
	int phoneNumber;
	//constructor
	InstanceBlock1(){
		System.out.println("Constructor is invoked");
	}
	//instarnce block
	{
		System.out.println("Instace Block is invoked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock1 b1=new InstanceBlock1();
	}

}
