package com.shs.opps;

public class PrintableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p=new Hprinter();
		CallPrintable cp=new CallPrintable();
		cp.invoke(p);
	}

}
