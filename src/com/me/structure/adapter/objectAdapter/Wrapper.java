package com.me.structure.adapter.objectAdapter;

import com.me.structure.adapter.classAdapter.Source;
import com.me.structure.adapter.classAdapter.Targetable;

/** 
* @author jialili 
*/
public class Wrapper implements Targetable{
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method");
	}

}
