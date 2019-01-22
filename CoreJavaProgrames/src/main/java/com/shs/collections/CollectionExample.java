package com.shs.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("C");
		list.add("CoreJava");
		list.add("AdvJava");
		Collections.addAll(list,"Servlet","Jsp");
		System.out.println("After invoking addAll method:"+list);
		String[] strArr= {"C#",".Net"};
		Collections.addAll(list,strArr);
		System.out.println("After adding the list:"+list);
		
	}

}
