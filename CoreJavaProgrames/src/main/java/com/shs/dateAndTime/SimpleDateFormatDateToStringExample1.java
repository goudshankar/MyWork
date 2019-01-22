package com.shs.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDateToStringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat formatter =new SimpleDateFormat("10/2/1989");
		String strDate=formatter.format(d);
		System.out.println("Date is in String format:"+strDate);
	}

}
