package com.shs.opps;

public class AirtelSimCard implements SimCard {

	@Override
	public void dialCall() {
		// TODO Auto-generated method stub
		System.out.println("Calling through AirtelSimCard....");
	}

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS through AirtelSimCard....");
	}

}
