package com.me.builder.abstractfactory;
/** 
* @author jialili 
*/
public interface IUser {
	
	public void insert(User user);
	
	public IUser getUser(int uid);

}
