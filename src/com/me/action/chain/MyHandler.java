package com.me.action.chain;


/** 
* @author jialili 
*/
public class MyHandler extends AbstractHandler implements com.me.action.chain.Handler{

	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println(name + "deal");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}

}
