package com.me.action.memento;
/** 
* @author jialili 
*/
public class Test {
	public static void main(String[] args) {
		Original original = new Original("egg");
	//	Memento createMemento = original.createMemento();
		
		//创建备忘录
		Storage storage = new Storage(original.createMemento());
		
		System.out.println("初始化原始状态：" + original.getValue());
		original.setValue("nn");
		System.out.println("修改后的状态：" + original.getValue());
		
		//恢复原始状态
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态：" + original.getValue());
	}

}
