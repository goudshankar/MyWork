package com.shs.corelatedprogrames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoogsAndStatements {
	public static void main(String[] args) {

		for(;;) {
		Scanner scn = new Scanner(System.in);
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Proceed with if and for");
		map.put(2, "Proceed with if and while");
		map.put(3,"Proceed with if and dowhile");
		map.put(4,"Proceed with switch and for");
		System.out.println("Enter Options:");
		int opt=scn.nextInt();
		if(!map.containsKey(opt)) {
			System.out.println("Exit");
			break;
		}
		
		for(Map.Entry<Integer, String> m1:map.entrySet()) {
		int key=m1.getKey();
		
		if(opt==key)
			System.out.println(m1.getValue());
		}
		System.out.println("Enter fruit:");
		String fruit = scn.next();
		System.out.println("Enter Decision statement");
		String stmt = scn.next();
		System.out.println("Enter Loop Statement:");
		String loop = scn.next();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Orange");
		al.add("mango");
		al.add("grapes");
		al.add("Banana");
		if (stmt.equalsIgnoreCase("if") && loop.equalsIgnoreCase("for")) {
			boolean flag = false;
			for (int i = 0; i < al.size(); i++) {
				String frt = al.get(i);
				if (frt.equals(fruit)) {
					flag = true;
					break;
				}
			}
			display(flag);
		}

		else if (stmt.equalsIgnoreCase("if") && loop.equalsIgnoreCase("while")) {
			int count = 0;
			boolean flag = false;
			while (al.size() > count) {
				String frt = al.get(count);
				if (frt.equals(fruit)) {
					flag = true;
					break;
				}
				count++;
			}
			display(flag);
		} else if (stmt.equalsIgnoreCase("if") && loop.equalsIgnoreCase("dowhile")) {
			int count = 0;
			boolean flag = false;
			do {
				String frt = al.get(count);
				if (frt.equals(fruit)) {
					flag = true;
					break;
				}
				count++;
			} while (al.size() > count);
			display(flag);
		} else if (stmt.equalsIgnoreCase("switch") && loop.equalsIgnoreCase("for")) {

			boolean flag = false;
			for (int i = 0; i < al.size(); i++) {
				String frt = al.get(i);
				if (frt.equalsIgnoreCase(fruit))
					switch (frt) {
					case "Apple":
						flag = true;
						break;
					case "Orange":
						flag = true;
						break;
					case "Mango":
						flag = true;
						break;
					case "Banana":
						flag = true;
						break;
					default:
					}
			}
			display(flag);
		}
		}
	}

	private static void display(boolean flag) {
		if (flag == true) {
			System.out.println("Its available");
		} else {
			System.out.println("Its not available");
		}
	}
}
