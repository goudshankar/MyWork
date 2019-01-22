package com.shs.strings;

public class Address extends Customer{
	String city="hyd",state="TG";
	Customer orderDeliver() {
		System.out.println("Delivered to Address");
		return this;
	}
	public static void main(String[] args) {
		Customer add=new Customer();
		System.out.println(add.orderDeliver().custId);
	}

}
