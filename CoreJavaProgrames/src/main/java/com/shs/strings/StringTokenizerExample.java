package com.shs.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer stz=new StringTokenizer("My name is Khan");
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
		
		
	}

}
