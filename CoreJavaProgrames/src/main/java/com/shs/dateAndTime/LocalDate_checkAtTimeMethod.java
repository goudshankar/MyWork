package com.shs.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDate_checkAtTimeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.of(2017,1,13);
		LocalDateTime dateTime=date.atTime(1, 50, 9);
		System.out.println(dateTime);
	}

}
