package com.shs.strings;

public class Customer {
	int custId;
	String name;
	Customer orderDeliver() {
		System.out.println("Order Delivered....");
		return this;
	}
}
