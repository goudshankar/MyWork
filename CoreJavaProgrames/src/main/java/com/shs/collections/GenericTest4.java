package com.shs.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericTest4 {
	public static void drawShapes(List<? extends Shape> lists) {
		for(Shape s:lists) {
			s.draw();
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle>list1=new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2=new ArrayList<Circle>();
		list2.add(new Circle());
		drawShapes(list1);
		drawShapes(list2);
		
	}

}
