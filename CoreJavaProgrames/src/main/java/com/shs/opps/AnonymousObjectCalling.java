package com.shs.opps;

public class AnonymousObjectCalling {
	
	public void factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling method throug anonymous object
		new AnonymousObjectCalling().factorial(4);
	}

}
