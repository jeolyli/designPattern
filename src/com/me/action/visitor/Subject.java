package com.me.action.visitor;
/** 
* @author jialili 
*/
public interface Subject {
	
	public void accept(Visitor vistor);
	
	public String getSubject();

}
