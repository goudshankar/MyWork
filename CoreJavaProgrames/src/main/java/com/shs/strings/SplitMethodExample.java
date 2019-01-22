package com.shs.strings;

public class SplitMethodExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Khan";
		String[] words=str.split("\\s");
		for(String s:words) {
			System.out.println(s);
		}
	}

}
