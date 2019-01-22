package com.shs.regex;

import java.util.regex.Pattern;

/* create a regular expression that accepts 10 digit mobile number and starting with 7,8 or 9 only*/
public class MetaCharacterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("By Character classes and Quantifiers");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9502487251"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "9922046547"));
		System.out.println(Pattern.matches("[789][0-9]{9}","95024072518"));
		System.out.println(Pattern.matches("[789][0-9]{9}","6540987632"));
		System.out.println();
		System.out.println("By MetaCharacters..");
		System.out.println(Pattern.matches("[789]{1}\\d{9}","9922046547"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}","3853038949"));
		
		
	}

}
