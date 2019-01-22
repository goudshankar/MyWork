package com.shs.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		while(true) {
			System.out.println("Enter regex pattern:");
			Pattern pattern=Pattern.compile(scn.nextLine());
			System.out.println("Enter text:");
			Matcher matcher=pattern.matcher(scn.nextLine());
			boolean found=false;
			while(matcher.find()) {
				System.out.println("I found match:"+matcher.group()+"::Starting at index::"+matcher.start()+"::ending at index::"+matcher.end());
				found=true;
			}
			if(!found) {
				System.out.println("Match not found...");
			}
		}
				
	}

}
