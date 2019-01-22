package com.shs.opps;

public class Rectangle2MultiObjects {
	int length;
	int width;
	void insertRecord(int l,int w) {
		length=l;
		width=w;
	}
	void calculateArea() {
		System.out.println("Area of Rectangel is:"+(length*width));
	}
}
