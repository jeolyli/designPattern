package com.me.builder.abstractfactory;
/** 
* @author jialili 
*/
public interface IFactory {
	
	public IUser createUser();
	
	public ILogin createLogin();
}
