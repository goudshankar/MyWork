package com.shs.dateAndTime;

import java.time.LocalDate;

public class LocalDateTime_CheckIsLeapYear {
	static {
	LocalDate date=LocalDate.now();
	if(date==LocalDate.of(2019, 1, 13)) {
		System.out.println("Happy Birthday");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		/*LocalDate date2=LocalDate.of(2016, 9, 23);
		System.out.println(date2.isLeapYear());*/
	}
}

