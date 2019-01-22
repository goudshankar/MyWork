package com.shs.dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/* find the difference between two timezones
 * */
public class LocalTime_ZoneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time1=LocalTime.now(zone1);
		LocalTime time2=LocalTime.now(zone2);
		//find the difference between two time zones in hours is
		long hours=ChronoUnit.HOURS.between(time1, time2);
		System.out.println("The difference between two time zones in Hours is:"+hours);
		//find the differencce Between tow time zones in minutes
		long minutes=ChronoUnit.MINUTES.between(time1, time2);
		System.out.println("The diffference between two time zones in minutes is:"+minutes);
	}

}
