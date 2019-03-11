package com.shs.basics;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		String i1=o1.custName;
		String i2=o2.custName;
		return -i1.compareTo(i2);
	}
	
}
