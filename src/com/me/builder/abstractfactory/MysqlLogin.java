package com.me.builder.abstractfactory;
/** 
* @author jialili 
*/
public class MysqlLogin implements ILogin{

	@Override
	public void insert(Login login) {
		System.out.println("对MySQL里的login表插了一条数据");
	}

	@Override
	public Login getLogin(int id) {
		System.out.println("通过id在MySQL里的login表得到一条数据");
		return null;
	}

}
