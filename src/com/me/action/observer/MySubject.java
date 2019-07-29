package com.me.action.observer;
/** 
* @author jialili 
*/
public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		System.out.println("update self");
		notifyObservers();
	}

}
