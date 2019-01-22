package com.shs.dateAndTime;

public class UtilDateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way
		/*java.util.Date date=new java.util.Date();
		System.out.println("The Current date and time is:"+date);*/
		//2nd way
		long mills=System.currentTimeMillis();
		java.util.Date date=new java.util.Date(mills);
		System.out.println("The current date and time in millis:"+date);
	}

}
