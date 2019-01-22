package com.shs.opps;

public class CallPritable1 {
	void invoke(Printable1 p1) {
		if(p1 instanceof APrintable) {
			APrintable ap=(APrintable)p1;//downCasting
			ap.aPrintable();
		}
		
		if(p1 instanceof BPrintable) {
			BPrintable bp=(BPrintable)p1;
			bp.bPrintable();
		}
	}
}
