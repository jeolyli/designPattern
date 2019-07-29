package com.me.action.mediator;
/** 
* @author jialili 
*/
public abstract class User {
	
	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}
	
	public User(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void work();

}
