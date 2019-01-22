package com.shs.opps;
/*Method Overloading by changing the data types of the arguments
 * */
public class MethodOverloadingTest2 {
	public int add(int a,int b) {return a+b;}
	
	public double add(double a,double b,double c) {return a+b+c;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTest2 molt2=new MethodOverloadingTest2();
		System.out.println(molt2.add(10, 20));
		System.out.println(molt2.add(2.0,12.6,13.2));
	}

}
