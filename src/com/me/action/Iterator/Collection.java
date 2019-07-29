package com.me.action.Iterator;


/** 
* @author jialili 
*/
public interface Collection {
	
	public Interator iterator();
	
	//取得集合元素
	public Object get(int i);
	
	//取得集合大小
	public int size();

}
