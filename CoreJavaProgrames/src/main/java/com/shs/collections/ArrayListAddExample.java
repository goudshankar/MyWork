package com.shs.collections;

import java.util.ArrayList;

public class ArrayListAddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Raju");
		al.add("Uma");
		System.out.println("After invoking the add(E e)method:"+al);
		//adding the elements at specied index of the collection
		al.add(1, "Rani");
		System.out.println("After invoking the add(int index,E element) method:"+al);
		//adding the second list elements to first list
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("mobile");
		a2.add("laptop");
		al.addAll(a2);
		System.out.println("After invokig the addAll(Collection<? extends E> c)method:"+al);
		//adding the 3rd list at specied index to first list
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("customer1");
		a3.add("customer2");
		al.addAll(0, a3);
		System.out.println("After invoking the addAll(at specied index to the first list)"+al);
		System.out.println();
		
	}

}
