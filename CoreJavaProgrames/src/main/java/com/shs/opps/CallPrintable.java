package com.shs.opps;

public class CallPrintable {

	void invoke(Printable p) {	//upcasting
		if(p instanceof Cprinter) {
			Cprinter cp=(Cprinter)p;//downCasting
			cp.print();
		}
		if(p instanceof Hprinter) {
			Hprinter hpp=(Hprinter)p;
			hpp.print();
		}
	}
	
}
