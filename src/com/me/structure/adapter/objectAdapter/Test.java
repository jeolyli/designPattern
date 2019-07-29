package com.me.structure.adapter.objectAdapter;

import com.me.structure.adapter.classAdapter.Source;
import com.me.structure.adapter.classAdapter.Targetable;

/** 
* @author jialili 
*/
public class Test {
	
	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
	

}
