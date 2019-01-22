package com.shs.dateAndTime;

public class SqlDateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mills=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(mills);
		System.out.println(date);
	}

}
