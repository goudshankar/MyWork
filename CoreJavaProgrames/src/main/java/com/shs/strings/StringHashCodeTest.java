package com.shs.strings;

public class StringHashCodeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hashcode String test:");
	String s="java";
	System.out.println(s.hashCode());
	s=s+"world";
	System.out.println(s.hashCode());
	System.out.println("Hashcode test of StringBuffer:");
	StringBuffer sb=new StringBuffer("java");
	System.out.println(sb.hashCode());
	sb.append("world");
	System.out.println(sb.hashCode());
	}

}
