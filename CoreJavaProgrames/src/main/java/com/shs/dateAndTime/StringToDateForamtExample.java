package com.shs.dateAndTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class StringToDateForamtExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		Date d=DateFormat.getDateInstance().parse("31 Mar,2014");
		System.out.println("Date is:"+d);
		}
		catch(Exception e) {System.out.println(e);}
	}

}
