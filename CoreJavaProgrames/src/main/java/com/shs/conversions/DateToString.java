package com.shs.conversions;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To convert date to String we use format() method of java.text.DateFormat class
 * */
public class DateToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("E,dd MMMM YYYY HH:mm:ss zzzz");
		String strDate=formatter.format(date);
		System.out.println(strDate);
	}

}
