package com.shs.dateAndTime;

import java.time.LocalTime;

public class LocalTime_NowMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println("Current Time is:"+time);
		LocalTime hours=LocalTime.of(9, 31,50);
		System.out.println(hours);
	}

}
