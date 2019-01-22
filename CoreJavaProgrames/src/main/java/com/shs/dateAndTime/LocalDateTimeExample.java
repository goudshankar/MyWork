package com.shs.dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now=LocalDateTime.now();
		System.out.println("Before formating DateTime:"+now);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM:SS");
		String formatDateTime=now.format(format);
		System.out.println("After formating DateTime:"+formatDateTime);
	}

}
