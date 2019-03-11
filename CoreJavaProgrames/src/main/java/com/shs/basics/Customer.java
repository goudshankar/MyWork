package com.shs.basics;

public class Customer {
	
	int customerId;
	String custName;
	String address;
	int age;
	double price;
	//param constructor
	
	public Customer(int customerId, String custName, String address, int age, double price) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.address = address;
		this.age = age;
		this.price = price;
	}
}
