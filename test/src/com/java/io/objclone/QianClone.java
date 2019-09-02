package com.java.io.objclone;

import org.junit.Test;




/**  
 * 基于序列化和反序列化实现的克隆不仅仅是深度克隆，更重要的是通过泛型限定，可以检查出要克隆的对象是否支持序列化，
 * 这项检查是编译器完成的，不是在运行时抛出异常
 * ，这种是方案明显优于使用 Object 类的 clone 方法克隆对象。让问题在编译的时候暴露出来总是好过把问题留到运行时。
 */
public class QianClone {
	
	@Test
	public void testClone() throws Exception {
		Sudent sudent = new Sudent("asdf",123);
		Sudent s = (Sudent) sudent.clone();
		System.out.println(s==sudent);
		System.out.println(s.toString());
	}

}

class Sudent implements Cloneable{
	private String name; // 姓名
	private int age; // 年龄
	
	public Sudent() {
		super();
	}
	
	public Sudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Sudent [name=" + name + ", age=" + age + "]";
	}
	

}