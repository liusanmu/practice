package com.java.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**  
 * @Description:
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
         深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深
                              复制进行了完全彻底的复制，而浅复制不彻底。
 * @author: lsm
 * @date: 2019年1月4日 下午4:16:48   
 */
public class Prototype implements Cloneable, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String str;
	
    private SerializableObject obj;
	
	//浅拷贝
	@Override
	public Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype)super.clone();
		return prototype;
	}
	
	//深拷贝
	public Object deepClone() throws IOException, ClassNotFoundException {
		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bisStream = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream oiStream  = new ObjectInputStream(bisStream);
		
		return oiStream.readObject();
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	
	public void sayHello(){
		System.out.println("qwer");
	}
	public static void main(String[] args) throws Exception {
		Prototype prototype = new Prototype();
		prototype.sayHello();
		Prototype deep = (Prototype)prototype.clone();
		deep.sayHello();
		Prototype deepClone = (Prototype) prototype.deepClone();
		deepClone.sayHello();
		
	}
	
}

class SerializableObject implements Serializable {
	private static final long serialVersionUID = 1L;
}
