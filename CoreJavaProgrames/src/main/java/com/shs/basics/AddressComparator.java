package com.shs.basics;

import java.util.Comparator;

public class AddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer cs1, Customer cs2) {
		// TODO Auto-generated method stub
		return cs1.address.compareTo(cs2.address);
	}

}
