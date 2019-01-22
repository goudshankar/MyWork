package com.shs.strings;

public class SplitMethodExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloBmynameisBshankarBgoud";
		String[] arr=s.split("B",4);
		for(String words:arr) {
			System.out.println(words);
		}
	}

}
