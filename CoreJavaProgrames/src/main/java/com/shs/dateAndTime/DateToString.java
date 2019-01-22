package com.shs.dateAndTime;

import java.util.Date;
import java.text.DateFormat;

public class DateToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println("The current Date:"+date);
		String dateToString=DateFormat.getInstance().format(date);
		System.out.println("The current date in string format:"+dateToString);
	}

}
