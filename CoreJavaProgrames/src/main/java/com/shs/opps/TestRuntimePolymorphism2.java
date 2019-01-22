package com.shs.opps;

public class TestRuntimePolymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimePoly_Shape shape;
		shape=new RP_Rectangle();
		shape.draw();
		shape=new RP_CIRCLE();
		shape.draw();
		shape=new RP_TRIANGLE();
		shape.draw();
		
	}

}
