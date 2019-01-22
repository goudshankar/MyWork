package com.shs.collections;

import java.util.TreeSet;

public class TreeSetRetrieveAndRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(21);
		set.add(12);
		set.add(64);
		set.add(30);
		System.out.println(set);
		System.out.println("Highest value:"+set.pollLast());
		System.out.println("Lowest value:"+set.pollFirst());
		System.out.println(set);
	}

}
