package com.shs.opps;

public class RuntimePolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimePoly_Bank bank;
		bank=new RP_SBI();
		System.out.println("SBI Rate of intrest is:"+bank.getRateOfIntrest());
		bank=new RP_ICICI();
		System.out.println("ICICI Rate of Intrest is:"+bank.getRateOfIntrest());
		bank=new RP_AXIS();
		System.out.println("AXIS Rate of Intrest is:"+bank.getRateOfIntrest());
	}

}
