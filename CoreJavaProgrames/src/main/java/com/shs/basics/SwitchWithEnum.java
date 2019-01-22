package com.shs.basics;

import java.util.Scanner;

public class SwitchWithEnum {

	enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATURDAY}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Day day=Day.FRIDAY;
		
		switch(day) {
		case SUNDAY:
			System.out.println("Its Sunday");
			break;
		case MONDAY:
			System.out.println("Its Monday");
			break;
		case TUESDAY:
			System.out.println("Its Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Its Wednesday");
			break;
		case THUSDAY:
			System.out.println("Its Thusday");
			break;
		case FRIDAY:
			System.out.println("Its Friday");
			break;
		case SATURDAY:
			System.out.println("Its Saturday");
			default:
				System.out.println("Your Enter Invalid Day");
		}

	}

}
