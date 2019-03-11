package com.shs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		String[] array=new String[list.size()];
		array=list.toArray(array);
		System.out.println(Arrays.toString(array));
		//second way to convert ArrayList to array
		Object[] objArray=list.toArray();
		System.out.println(Arrays.toString(objArray));
		
		//convert arrays to as List
		String[] names= {"shankar","Ashok"};
		List<String> list1=new ArrayList<String>();
		List l=new ArrayList<>(Arrays.asList(names)) ;
		l.add("fdg");
		System.out.println(l);
		
	}

}
