package com.shs.dateAndTime;

import java.time.LocalDateTime;

public class LocalDateTime_MinusDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime1=LocalDateTime.of(2017, 2, 13, 10, 34);
		LocalDateTime dateTime2=dateTime1.minusDays(100);
		System.out.println("After subtracting the days from year:"+dateTime2);
	}

}
