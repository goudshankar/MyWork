package com.shs.basics;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your level:");
		String levelString=scn.next();
		int level=0;
		switch(levelString) {
		case "Beginner":level=1;
		break;
		case "Intermediate":level=2;
		break;
		case "Expert":level=3;
		break;
		default:level=0;
		}
		//print the levelString
		System.out.println("Your Level is:"+levelString);
	}

}
