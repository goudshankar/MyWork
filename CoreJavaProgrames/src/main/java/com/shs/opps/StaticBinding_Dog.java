package com.shs.opps;

public class StaticBinding_Dog {
	private void eat() {
		System.out.println("Dog is eating...");
	}
	public static void main(String[] args) {
		StaticBinding_Dog dog=new StaticBinding_Dog();
		dog.eat();
	}
}
