package com.shs.opps;

public class SuperKeywordExampleB extends SuperKeywordExampleA{
	String mobileColor="white";
	void printColor() {
		System.out.println("From child class:"+mobileColor);
		System.out.println("From parent class:"+super.mobileColor);
	}
}
