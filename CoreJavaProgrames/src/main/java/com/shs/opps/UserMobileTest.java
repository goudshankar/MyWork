package com.shs.opps;

public class UserMobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimCard simCard=new VodaPhoneSimCard();
		//mobile class object
		MobilePhone mobilePhone=new MobilePhone();
		mobilePhone.insertSim(simCard);
		
	}

}
