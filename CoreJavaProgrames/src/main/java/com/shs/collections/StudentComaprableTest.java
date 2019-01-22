package com.shs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComaprableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(101,"Vijay",23));
		list.add(new Student(102,"Ajat",27));
		list.add(new Student(103,"Garima",24));
		//sort the elements of list type by using collections sort() method
		Collections.sort(list);
		//sort elements in reverse order
		Collections.sort(list,Collections.reverseOrder());
		for(Student s2:list)
			System.out.println(s2.rollno+" "+s2.name+" "+s2.age);
	}

}
