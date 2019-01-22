package com.shs.innerClasses;

public class AccessLocalInnerClassLoalVariable {
	private int data=30;
	void display() {
		class Local{
			final int value=50;
			void msg() {
				System.out.println("Local variab"
						+ "le value is::"+value);
			}
		}
		Local l=new Local();
		l.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessLocalInnerClassLoalVariable local=new AccessLocalInnerClassLoalVariable();
		local.display();
	}

}
