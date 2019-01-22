package com.shs.strings;

public final class ImmutableClass {
	final String socialSecurityNumber;
	public ImmutableClass(String socialSecurityNumber) {
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public String toString() {
		return "Your socialSecurityNumber is:"+socialSecurityNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass itc=new ImmutableClass("10ADV234");
		System.out.println(itc);
		
	}

}
