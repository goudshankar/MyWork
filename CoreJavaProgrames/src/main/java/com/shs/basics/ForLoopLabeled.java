package com.shs.basics;

import java.util.ArrayList;
import java.util.List;

public class ForLoopLabeled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start:
		List<String> college1=new ArrayList<String>();
		college1.add("class1");
		college1.add("class2");
		college1.add("class3");
		college1.add("class4");
		List<String> college2=new ArrayList<String>();
		college2.add("class5");
		college2.add("class6");
		college2.add("class7");
		college2.add("class8");
		List<String> college3=new ArrayList<String>();
		college3.add("class9");
		college3.add("class10");
		college3.add("class11");
		college3.add("class12");
		List<java.util.List> university=new ArrayList<List>();
		university.add(college1);
		university.add(college2);
		university.add(college3);
		//start:
		for(List<String> colleges:university) {
			start:
			for(String course:colleges) {
				/*if(course.equalsIgnoreCase("class1")) {
					System.out.println(course);
					//break start;
				}*/
			//	break start;
				System.out.println(course);
				break start;
				
			}
		}
		System.out.println("Exit");
/*		
		for(int i=1;i<=5;i++) {
			//start:
			for(int j=1;j<=5;j++) {
				if(i==2&&j==2) {
					break ;
				}
				System.out.println(i+" "+j);
			}
		}*/
	}

}
