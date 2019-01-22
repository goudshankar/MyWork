package com.shs.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Customer1 implements Comparable<Customer1> {

	int customerId;
	String name;
	public Customer1(int customerId,String name) {
		super();
		this.customerId = customerId;
		this.name=name;
	}

	@Override
	public int compareTo(Customer1 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}
	class CustomerTest{
		public static void main(String[] args) {
			ArrayList<Customer1> al=new ArrayList<Customer1>();
			al.add(new Customer1(101,"Ravi"));
			al.add(new Customer1(102,"Vijay"));
			al.add(new Customer1(103,"Ajay"));
			Collections.sort(al);
			for(Customer1 customer:al) {
				System.out.println(customer.name+" "+customer.customerId);
			}
		}
	}

