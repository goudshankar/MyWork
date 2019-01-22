package com.shs.collections;

public class Customer implements Comparable<Customer>{
	int customerId;
	String customerName;
	String customerAddress;
	public Customer(int customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	//toString()
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	public int compareTo(Customer c1) {
		// TODO Auto-generated method stub
		return customerName.compareTo(c1.customerName);
	}
	
}
