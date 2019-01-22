package com.shs.regex;

import java.util.regex.Pattern;

/* create a regurlar expression that accepts alphanumeric characters only.Its length must be six characters long only*/
public class MetaCharactersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MetaCharacters......");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false bcoz length should be 6 only
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$2"));
	}

}
