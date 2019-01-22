package com.shs.innerClasses;

public class NestedInterfaceWithinInterface implements SimCard.Message{

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("sending sms through SimCard.....");
	}

	public static void main(String[] args) {
		SimCard.Message message=new NestedInterfaceWithinInterface();
		message.sendSms();
	}
	
	
}
