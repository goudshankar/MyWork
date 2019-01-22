package com.shs.opps;

public class BikeDefaultConstructor {
		public BikeDefaultConstructor(String s) {
			System.out.println("Bike Object is created.");
		}
		public BikeDefaultConstructor() {
			//System.out.println("Bike Object is created.");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling the default constructor
		
		BikeDefaultConstructor bdf=new BikeDefaultConstructor("");
		BikeDefaultConstructor bdf1=new BikeDefaultConstructor();
		
		
	}

}
