package com.shs.opps;

public class This2PassAsAnArgument2Method {
	void m(This2PassAsAnArgument2Method obj ) {
		System.out.println("Method is invoked");
	}
	void p() {
		m(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This2PassAsAnArgument2Method s1=new This2PassAsAnArgument2Method();
		s1.p();
	}

}
