package com.me.structure.bridge;
/** 
* @author jialili 
*/
public class Test {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();
	}

}
