package com.shs.strings;

public class StaticMethodTest2 extends StaticMethodTest{

	public void dislCall() {
		System.out.println("calling through jio....");
	}
	public void sendSms() {
		System.out.println("sending sms through Jio...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodTest2 sm2=new StaticMethodTest2();
		//StaticMethodTest sm1=new StaticMethodTest();
		sm2.dialCall();
		//sm1.sendSms();
	}

}
