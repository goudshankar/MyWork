package com.shs.dateAndTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTime_DayOf_Week_Month_Year_Hour_Minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime a=LocalDateTime.of(1989,2 ,10, 11,56);
		//week,month and year of the Day
		System.out.println("Week of the Day:"+a.get(ChronoField.DAY_OF_WEEK));
		System.out.println("month of the Day:"+a.get(ChronoField.DAY_OF_MONTH));
		System.out.println("year of the Day:"+a.get(ChronoField.DAY_OF_YEAR));
		//Hour and minutes of the day
		System.out.println("Hour of the Day:"+a.get(ChronoField.HOUR_OF_DAY));
		System.out.println("Minutes of the Day:"+a.get(ChronoField.MINUTE_OF_HOUR));
	}

}
