package com.shs.innerClasses;

public class AnonymousInnerInterfaceTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MsgService service=new MsgService() {
			
			@Override
			public void sendSms() {
				// TODO Auto-generated method stub
				System.out.println("sending msg through mobile.....");
			}
		};
		service.sendSms();
	}

	
}
