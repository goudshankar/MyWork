package com.shs.dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("The currnet time zone in India is:"+time1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("The current time zone in Japan is:"+time2);
		System.out.println(time2);
		
	}

}
