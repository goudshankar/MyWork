package com.shs.basics;

public class CallPrinter {

	public void invoke(Printer p) {
		if(p instanceof HpPrinter) {
			HpPrinter hp=(HpPrinter)p;
			hp.print();
		}
		if(p instanceof CanonPrinter) {
			CanonPrinter cp=(CanonPrinter)p;
			cp.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Printer p=new CanonPrinter();
		p.print();*/
		CallPrinter c=new CallPrinter();
		c.invoke(new HpPrinter());
		
		
	}

}
