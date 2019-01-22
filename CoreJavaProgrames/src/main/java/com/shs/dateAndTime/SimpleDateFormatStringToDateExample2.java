package com.shs.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatStringToDateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		Date date=formatter.parse("31/03/2015");
		System.out.println("Date is:"+date);
		}
		catch(Exception e) {System.out.println(e);}
	}

}
