package com.me.action.observer;

import java.util.Enumeration;
import java.util.Vector;

/** 
* @author jialili 
*/
public abstract class AbstractSubject implements Subject{
	
	private Vector<Observer> vector = new Vector<>();
	
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}
	
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		Enumeration<Observer> elements = vector.elements();
		while(elements.hasMoreElements()) {
			elements.nextElement().update();
		}
	}

}
