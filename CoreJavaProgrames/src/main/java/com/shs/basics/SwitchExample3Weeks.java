package com.shs.basics;

import java.util.Scanner;

public class SwitchExample3Weeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number to Find WeekName::");
		int number=scn.nextInt();
		String weekString="";
		switch(number) {
		case 1:weekString="1-Sunday";
		break;
		case 2:weekString="2-Monday";
		break;
		case 3:weekString="3-Tuesday";
		break;
		case 4:weekString="4-Wednusday";
		break;
		case 5:weekString="5-Thusday";
		break;
		case 6:weekString="6-Friday";
		break;
		case 7:weekString="7-Saturday";
		break;
		default:weekString="Invalid Number";
			
		}
		//print the weekString on the console
		System.out.println(weekString);
	}

}
