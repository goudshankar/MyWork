package com.shs.strings;

public class InternMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1= {"ashok,","shankar,"};

		for (String string : s1) {
			System.out.println(string.substring(0,string.length()-1));
		}
	}
}
