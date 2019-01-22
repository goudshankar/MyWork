package com.shs.basics;

import java.util.Scanner;

public class IfExampleOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number::");
		int number=scn.nextInt();
		//check if the number is di	visable by 2 or not
		if(number%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
