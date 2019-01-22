package com.shs.innerClasses;

public class AnonymousInnerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass aic=new AnonymousInnerClass() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("nice fruits");
			}
		};
		aic.eat();
	}

}
