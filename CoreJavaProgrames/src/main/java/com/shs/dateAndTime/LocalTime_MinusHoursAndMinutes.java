package com.shs.dateAndTime;

import java.time.LocalTime;

public class LocalTime_MinusHoursAndMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time1=LocalTime.of(10,43,12);
		System.out.println(time1);
		LocalTime time2=time1.minusHours(2);
		System.out.println(time2);
		LocalTime time3=time1.minusMinutes(9);
		System.out.println(time3);
		//plusHours and plusMinutes
		LocalTime time4=time1.plusHours(2);
		System.out.println(time4);
		LocalTime time5=time1.plusMinutes(17);
		System.out.println(time5);
	}

}
