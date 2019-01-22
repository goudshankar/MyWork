package com.shs.basics;

import java.util.Scanner;

public class SwitchWithWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please Enter Your Age::");
		Integer age=scn.nextInt();
		switch(age) {
		case(16):
			System.out.println("Your Under 18");
		break;
		case(18):
			System.out.println("Your eligible for vote");
		break;
		case(65):
			System.out.println("Your SeniorCityzen");
		break;
		default:
			System.out.println("Please Enter Valid Age");
			break;
		}
	}

}
