package com.shs.strings;

public class PerformanceTestOfStringBuilderAndStringBuffer {
	public static String appendWithStringBuffer() {
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<10000;i++) {
			sb.append("world");
		}
		return sb.toString();
	}
	
	public static String appendWithStringBuilder() {
		StringBuilder sbuilder=new StringBuilder("java");
		for(int i=0;i<10000;i++) {
			sbuilder.append("world");
		}
		return sbuilder.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		appendWithStringBuffer();
		System.out.println("Time taken to StringBuffer is:"+(System.currentTimeMillis()-startTime)+"Ms");
		startTime=System.currentTimeMillis();
		//appendWithStringBuilder();		
		System.out.println("Time taken to StringBuilder is:"+(System.currentTimeMillis()-startTime)+"Ms");
	}
}
