package com.shs.strings;

public class SplitMethodExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="My name is Khan";
		for(String words:str1.split("\\s",0)){
			System.out.println(words);
		}
		
		for(String words:str1.split("\\s",1)) {
			System.out.println(words);
		}
		for(String words:str1.split("\\s",2)) {
			System.out.println(words);
		}
	}

}
