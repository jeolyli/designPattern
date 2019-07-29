package com.me.builder.abstractfactory;
/** 
* @author jialili 
*/
public class Test {
	public static void main(String[] args) {
		User user = new User();
		
		IFactory factory = new MysqlFactory();
		IUser createUser = factory.createUser();
		createUser.insert(user);
		createUser.getUser(1);
	}

}
