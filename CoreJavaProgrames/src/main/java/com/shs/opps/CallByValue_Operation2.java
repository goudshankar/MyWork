package com.shs.opps;

public class CallByValue_Operation2 {
	
	int data=50;
	void change(CallByValue_Operation2 op2) {
		op2.data=op2.data+100;	//changes will be done in the instance variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue_Operation2 op2=new CallByValue_Operation2();
		System.out.println("Before change:"+op2.data);
		op2.change(op2);
		System.out.println("After change:"+op2.data);
	}

}
