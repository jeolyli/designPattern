package com.me.action.state;
/** 
* @author jialili 
*/
public class Test {
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		state.setValue("state1");
		context.method();
	}

}
