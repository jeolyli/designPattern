package com.me.action.Iterator;
/** 
* @author jialili 
*/
public class Test {
	
	public static void main(String[] args) {
		Collection coll = new MyCollection();
		Interator iterator = coll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
