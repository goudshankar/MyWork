package com.shs.regex;

import java.util.regex.Pattern;

public class CharacterClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]","abcd"));//false ->m,or n is 
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]","ammmna"));
		
	}

}
