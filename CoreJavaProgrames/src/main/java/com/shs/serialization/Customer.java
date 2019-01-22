package com.shs.serialization;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -767605721563585749L;
	private int custID;
	private transient String customerName;
	String address;
	

	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustomerName() {
		System.out.println("agsf");
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
