package com.shs.innerClasses;
/* create a method() in member inner class that access the private data member from outer class*/
public class MemberInnerClass {
	private int data=30;
	class Inner{
		void msg() {
			System.out.println("data is:"+data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an instance of outer class first
		MemberInnerClass obj=new  MemberInnerClass();
		MemberInnerClass.Inner in=obj.new Inner();
		in.msg();
	}

}
