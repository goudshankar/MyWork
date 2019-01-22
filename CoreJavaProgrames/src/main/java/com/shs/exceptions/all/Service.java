package com.shs.exceptions.all;

public class Service {

	public void getSalery(Object ob) throws AppException{
		
		Dao dao=new Dao();
		dao.getSalery(ob);
	}
	
}
