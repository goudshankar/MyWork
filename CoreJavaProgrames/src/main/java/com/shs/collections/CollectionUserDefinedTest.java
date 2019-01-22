package com.shs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUserDefinedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> al=new ArrayList<Customer>();
		al.add(new Customer(101,"Rahul","Pune"));
		al.add(new Customer(103,"Kedar","Hyd"));
		al.add(new Customer(102,"Garima","Pune"));
		//traverse the al elements
		Collections.sort(al);
		for(Customer c2:al) {
			System.out.println(c2.customerId+" "+c2.customerName+" "+c2.customerAddress);
		}
	}

}
