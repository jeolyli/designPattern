package com.me.action.observer;
/** 
* @author jialili 
*/
public class Observer1 implements Observer{

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}

}
