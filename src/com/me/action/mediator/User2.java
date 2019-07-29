package com.me.action.mediator;
/** 
* @author jialili 
*/
public class User2 extends User{

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");  
	}

}
