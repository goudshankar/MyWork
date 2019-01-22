package com.shs.innerClasses;

public class StaticNestedClassWithStaticMethod {
	static int data=30;
	static class Inner{
	static void display() {
		System.out.println("the data is:"+data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClassWithStaticMethod.Inner.display();	}

}
