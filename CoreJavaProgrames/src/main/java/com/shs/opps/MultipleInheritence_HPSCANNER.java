package com.shs.opps;

public class MultipleInheritence_HPSCANNER implements MultipleInheritencePrintable,MultipleInheritenceDrawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing through HPSCANNER");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing through HPSCANNER");
	}

}
