package com.shs.dateAndTime;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		System.out.println("The current date is:"+calendar.getTime());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15 Days ago:"+calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4 Months lagter:"+calendar.getTime());
		calendar.add(Calendar.YEAR,2);
		System.out.println("2 years later:"+calendar.getTime());
		System.out.println();
	}

}
