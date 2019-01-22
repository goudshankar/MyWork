package com.shs.dateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class LocalDateAndTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		//if(LocalDate.now()=="1/13/2019");
		//LocalDate yesterDay=date.minusDays(1);
		//LocalDate tomarrow=yesterDay.plusDays(2);
		System.out.println("Todays Date:"+date);
		
	}

}
