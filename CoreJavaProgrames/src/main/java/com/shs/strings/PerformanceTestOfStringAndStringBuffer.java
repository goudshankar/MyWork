package com.shs.strings;

public class PerformanceTestOfStringAndStringBuffer {
	
	public static String concatWithString() {
		String s="java";
		for(int i=0;i<10000;i++) {
			s=s+"world";
		}
		return s;
	}
	public static String concatWithStringBuffer(){
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<10000;i++) {
			sb.append("world");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time tabke to cancating String is:"+(System.currentTimeMillis()-startTime)+"Ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken to cancating StringBuffer is:"+(System.currentTimeMillis()-startTime)+"Ms");
	}
}
