package com.shs.conversions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sdate="10/02/1989";
		Date date=new SimpleDateFormat("dd/MM/YYYY").parse(sdate);
		System.out.println(date+"\t"+sdate);
	}

}
