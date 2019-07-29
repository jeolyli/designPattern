package com.me.action.command;
/** 
* @author jialili 
*/
public class Invoker {
	
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action() {
		command.exe();
	}

}
