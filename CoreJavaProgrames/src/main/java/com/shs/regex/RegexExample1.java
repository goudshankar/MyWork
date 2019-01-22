package com.shs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b1=m.matches();
		System.out.println(b1);
		//2nd way of defining
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		//3rd way
		boolean b3=Pattern.matches(".s","as");
		System.out.println(b3);
	}

}
