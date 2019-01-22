package com.shs.basics.programes;

public class LinearSearchExample2 {
	
	public static  Object linearSearch(int[] array,int key) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==key) {
				return i;
			}
		}
		return "Search key is not found..";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,70,80,45,34,32,12,56};
		int key=1;
		Object ob=linearSearch(arr,key);
		if(ob instanceof String) {
			System.out.println(ob);
		}
		else {
			System.out.println(key+" is found at Index::"+ob);	
		}
		
	}

}
