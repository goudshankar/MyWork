package com.shs.dateAndTime;

import java.sql.Date;

public class String2SqlDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date="2015-03-31";
		Date date1=Date.valueOf(date);
		System.out.println(date1);
	}

}
