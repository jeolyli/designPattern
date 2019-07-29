package com.me.builder.abstractfactory;
/** 
* @author jialili 
*/
public class MysqlFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new MysqlUser();
	}

	@Override
	public ILogin createLogin() {
		return new MysqlLogin();
	}

}
