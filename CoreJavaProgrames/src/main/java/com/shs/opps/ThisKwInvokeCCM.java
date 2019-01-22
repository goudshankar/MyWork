package com.shs.opps;

public class ThisKwInvokeCCM {
	void m() {
		System.out.println("This is m() method...");
	}
	void n() {
		System.out.println("Hello N");
		m();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisKwInvokeCCM().n();
	}

}
