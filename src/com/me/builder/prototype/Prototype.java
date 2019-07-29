package com.me.builder.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
* @author jialili 
*/
public class Prototype implements Cloneable, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 浅复制
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype)super.clone();
		return proto;
	}
	
	/**
	 * 深复制
	 * 需要采用流的形式读入当前对象的二进制输入，
	 * 再写出二进制数据对应的对象
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		//写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//读出二进制流产生的新对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return ois.readObject();
	}
}
