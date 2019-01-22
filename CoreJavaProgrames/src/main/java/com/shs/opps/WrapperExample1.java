package com.shs.opps;
/*AutoBoxing example:
 * Converting primitive to wrapper classes*/
public class WrapperExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		Integer i=Integer.valueOf(a);	//converts the int to Integer value
		Integer j=a;//Autoboxing,compiler converts the int to Integer object
		System.out.println(a+" "+i+" "+j);
	}

}
