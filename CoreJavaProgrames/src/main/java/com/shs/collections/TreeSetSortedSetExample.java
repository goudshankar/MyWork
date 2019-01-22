package com.shs.collections;

import java.util.TreeSet;

public class TreeSetSortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial set:"+set);
		System.out.println("Head Set:"+set.headSet("E"));
		System.out.println("subSet:"+set.subSet("B", "D"));
		System.out.println("TaileSet:"+set.tailSet("C"));
	}

}
