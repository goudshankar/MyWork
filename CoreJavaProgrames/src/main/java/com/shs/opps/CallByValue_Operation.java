package com.shs.opps;

public class CallByValue_Operation {
	int data=50;
	void change(int data) {
		data=data+100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue_Operation operation=new CallByValue_Operation();
		System.out.println("Before change:"+operation.data);
		operation.change(500);
		System.out.println("After change:"+operation.data);
	}

}
