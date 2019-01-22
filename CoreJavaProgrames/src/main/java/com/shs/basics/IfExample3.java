package com.shs.basics;
/* if-else-if ladder
 * */

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Please Enter Your Marks::");
		int marks=scn.nextInt();
	
		if(marks<50) {
			System.out.println("Your Failed");
		}
		else if(marks>=50&&marks<60) {
			System.out.println("You got D grade");
		}
		else if(marks>=60&&marks<70) {
			System.out.println("You got C grade");
		}
		else if(marks>=70&&marks<80) {
			System.out.println("You got B grade");
			
		}
		else if(marks>=80&&marks<90) {
			System.out.println("You got A grade");
		}
		else if(marks>=90&&marks<100) {
			System.out.println("You got A+ grade");
		}
		else {
			System.out.println("Your Entered Invalid marks");
		}
	}

}
