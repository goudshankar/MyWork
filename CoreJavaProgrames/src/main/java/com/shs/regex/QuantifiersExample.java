package com.shs.regex;

import java.util.regex.Pattern;

public class QuantifiersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("? Quantifiers.....");
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?","aaa"));//false bcoz a comes more than once
		System.out.println(Pattern.matches("[amn]+","aammnn"));//true
		System.out.println(Pattern.matches("[amn]*","ammmna"));
	}

}
