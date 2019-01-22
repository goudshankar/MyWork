package com.shs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample2 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(45);
		list.add(65);
		list.add(89);
		list.add(23);
		list.add(98);
		System.out.println("Maximum value:"+Collections.max(list));
		System.out.println("Minimum value:"+Collections.min(list));
	}
}
