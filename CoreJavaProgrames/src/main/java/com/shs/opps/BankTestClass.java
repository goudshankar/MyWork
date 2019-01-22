package com.shs.opps;

public class BankTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi=new SBI();
		HDFC hdfc=new HDFC();
		Kotak kotak=new Kotak();
		System.out.println("SBI Rate Of Intrest:"+sbi.getRateOfIntrest());
		System.out.println("HDFC Rate of Intrest:"+hdfc.getRateOfIntrest());
		System.out.println("Kotak Rate of Intrest:"+kotak.getRateOfIntrest());
		
	}

}
