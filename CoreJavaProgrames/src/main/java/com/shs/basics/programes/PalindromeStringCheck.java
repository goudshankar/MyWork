package com.shs.basics.programes;

import java.util.Scanner;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number/String to check if it is palindrome or not::");
		
		original=in.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) 
			reverse=reverse+original.charAt(i);
			if(original.equals(reverse)) {
				System.out.println("Entered Number/String is Palindrome");
			}
				else {
					System.out.println("Entered Number/String is Not a Palindrome");
				}
			}
		
	}

