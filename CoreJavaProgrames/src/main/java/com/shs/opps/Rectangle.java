package com.shs.opps;
/* Object and class Example Rectangle class stroes multiple values 
 * */
public class Rectangle {
	int length;
	int width;
	void insertRecord(int l,int w) {
		length=l;
		width=w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}
}
