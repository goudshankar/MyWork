package com.shs.bankingproject;

import java.util.RandomAccess;
import java.util.Scanner;

public class Customer implements RandomAccess {
	private int id;
	private String cname;
	private String dob;
	private int bal;
	//setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
	

}
