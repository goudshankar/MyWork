package com.shs.io;

import java.util.Scanner;

public class ReadInputByScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String query="Hi I am only 24";
		Scanner scn=new Scanner(query).useDelimiter("\\s");
		System.out.println("Reading the String.....");
		System.out.println(scn.next());
		System.out.println(scn.next());
		System.out.println(scn.next());
		System.out.println(scn.next());
		System.out.println(scn.nextInt());
		}
		catch(Exception e) {System.out.println(e);}
		
	}

}
