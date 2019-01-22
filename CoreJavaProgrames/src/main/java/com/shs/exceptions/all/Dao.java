package com.shs.exceptions.all;

public class Dao {
	
	public void getSalery(Object ob) throws AppException{

		try {
			/*
		if(ob instanceof Integer) {
			int i=(int) ob;
			int a=20/i;
		}
		String s=(String) ob;
		if(ob.equals("null")){
			throw new AppException("0002");
		}*/
			//instead of the above code we can imagine dataBase contivity logic is there
		}
		catch(ArithmeticException e) {
			throw new AppException("0001");
		}
		catch (NullPointerException e) {
			
			throw new AppException("0002");
		}
		/*catch(InvalidConnectionName icn) {
			throw new AppException("2E");
		}*/
		
	}

}
