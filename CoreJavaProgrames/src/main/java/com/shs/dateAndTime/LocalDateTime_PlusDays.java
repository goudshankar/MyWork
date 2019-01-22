package com.shs.dateAndTime;

import java.time.LocalDateTime;

public class LocalDateTime_PlusDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime time1=LocalDateTime.of(2017, 2,13, 10, 34);
		LocalDateTime time2=time1.plusDays(2);
		System.out.println("After adding two days to year:"+time2);
	}

}
