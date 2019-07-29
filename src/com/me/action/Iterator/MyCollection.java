package com.me.action.Iterator;


/** 
* @author jialili 
*/
public class MyCollection implements Collection{
	
	public String string[] = {"A","B","C","D","E"}; 

	@Override
	public Interator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i];
	}

	@Override
	public int size() {
		return string.length;
	}

}
