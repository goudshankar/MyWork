package com.shs.basics;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=scn.nextInt();
		//switch expression
		switch(number) {
		case 10:
			System.out.println("Value found 10");
			break;
		case 20:
			System.out.println("Value found 20");
			break;
		case 30:
			System.out.println("Value found 30");
			break;
			default:
				System.out.println("Number not in 10,20,30");
		}
	}

}
