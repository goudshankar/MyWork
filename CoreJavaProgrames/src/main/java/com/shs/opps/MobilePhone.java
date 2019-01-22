package com.shs.opps;

public class MobilePhone {
	void insertSim(SimCard simCard) {	//==>upcasting passing simCardImpl class object to simCard interface reference variable
		if(simCard instanceof AirtelSimCard) {
			AirtelSimCard airtelSimCard=(AirtelSimCard)simCard;//DownCasting ==>checking simCard ref variable is pointing to one the SimCard impl class object
			airtelSimCard.dialCall();
			airtelSimCard.sendSms();
		}
		if(simCard instanceof VodaPhoneSimCard) {
			VodaPhoneSimCard vodaPhoneSimCard=(VodaPhoneSimCard)simCard;
			vodaPhoneSimCard.dialCall();
			vodaPhoneSimCard.sendSms();
		}
		
	}
}
