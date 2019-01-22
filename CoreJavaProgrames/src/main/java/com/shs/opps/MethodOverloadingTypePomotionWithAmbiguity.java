package com.shs.opps;

public class MethodOverloadingTypePomotionWithAmbiguity {

	void sum(int a,long b) {
		System.out.println("Sume is:"+(a+b));
	}
	void sum(long a,int b) {System.out.println("sum is:"+(a+b));}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTypePomotionWithAmbiguity ml=new MethodOverloadingTypePomotionWithAmbiguity();
		//ml.sum(20,20); //ambiguious error shows bcoz type is mis match
	}

}
