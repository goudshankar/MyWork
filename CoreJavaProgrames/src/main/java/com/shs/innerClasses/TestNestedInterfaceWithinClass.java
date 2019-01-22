package com.shs.innerClasses;

public class TestNestedInterfaceWithinClass implements Mobile.SimCard{

	@Override
	public void dialCall() {
		// TODO Auto-generated method stub
		System.out.println("calling through simCard......");
	}

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("sending sms through simCard.......");
	}
	public static void main(String[] args) {
		Mobile.SimCard simCard=new TestNestedInterfaceWithinClass();
		simCard.dialCall();
		simCard.sendSms();
	}

}
