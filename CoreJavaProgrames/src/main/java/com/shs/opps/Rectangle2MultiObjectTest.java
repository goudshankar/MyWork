package com.shs.opps;

public class Rectangle2MultiObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create multiple object of same type(Rectangle)
		Rectangle r1=new Rectangle(),r2=new Rectangle();
		r1.insertRecord(12, 13);
		r1.calculateArea();
		r2.insertRecord(14, 5);
		r2.calculateArea();
	}

}
