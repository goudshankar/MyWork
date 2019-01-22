package com.shs.basics;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating two variables
		int age=19;
		int weight=48;
		//checking condition of two variables
		if(age>=18) {
			if(weight>=50) {
				System.out.println("Your eligible for blood donation");
			}
			else {
				System.out.println("Your not eligible for blood donation");
			}
		}//outer if
		else {
			System.out.println("Age must be greater than 18");
		}
	}

}
