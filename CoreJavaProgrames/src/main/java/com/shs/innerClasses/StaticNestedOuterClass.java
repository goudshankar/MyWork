package com.shs.innerClasses;

public class StaticNestedOuterClass {
	static int data=30;
	int value=20;
	static class Inner{
		void display() {System.out.println("data is:"+data);}
						//System.out.println("The value is:"+value);//Cannot make a static reference to the non-static field value
	}
	public static void main(String[] args) {
		StaticNestedOuterClass.Inner obj=new StaticNestedOuterClass.Inner();
		obj.display();
	}

}
