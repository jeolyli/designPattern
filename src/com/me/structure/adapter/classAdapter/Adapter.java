package com.me.structure.adapter.classAdapter;

/** 
* @author jialili 
*/
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is the targetable method");
	}

}
