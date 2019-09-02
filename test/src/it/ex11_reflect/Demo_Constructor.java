package it.ex11_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**  
 * @Description: Demo_Constructor.java
 * @author: liusen
 * @date:   2019年3月8日 下午3:17:24   
 * @version V2.0
 */
public class Demo_Constructor {
	
	@Test
	public void test1() throws Exception {
		/**
		 * Class类的newInstance()方法是使用该类无参的构造函数创建对象, 如果一个类没有无参的构造函数,
		 * 就不能这样创建了,可以调用Class类的getConstructor
		 * (String.class,int.class)方法获取一个指定的构造函数然后再调用Constructor类的newInstance
		 * ("张三",20)方法创建对象*/
		Class<Person> clazz = (Class<Person>) Class.forName("it.ex11_reflect.Person");
		//Constructor<Person>  con = clazz.getConstructor(String.class, Integer.TYPE);
		Constructor<Person>  con = clazz.getConstructor(String.class, int.class);
		//int.class 和Integer.class返回的class对象不一样，和Integer.TYPE一样
		Person person = con.newInstance("张三",18);
		System.out.println(person);
		
		/**
		 * Class.getField(String)方法可以获取类中的指定字段(可见的),
		 * 如果是私有的可以用getDeclaedField("name")方法获取,通过set(obj, "李四")方法可以设置指定对象上该字段的值,
		 * 如果是私有的需要先调用setAccessible(true)设置访问权限,用获取的指定的字段调用get(obj)可以获取指定对象中该字段的值
		 */
		//Field field = clazz.getField("name");  //NoSuchFieldException
		//field.set(person, "李四");
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);  //不添加这一行会有IllegalAccessException
		field.set(person, "李四");
		System.out.println(person);
		
		/**
		 * Class.getMethod(String, Class...) 和 Class.getDeclaredMethod(String,
		 * Class...)方法可以获取类中的指定方法,调用invoke(Object,
		 * Object...)可以调用该方法,Class.getMethod("eat") invoke(obj)
		 * Class.getMethod("eat",int.class) invoke(obj,10)
		 */
		Method method = clazz.getMethod("eat");
		method.invoke(person);
		Method method1 = clazz.getMethod("eat",int.class);
		method1.invoke(person,10);
		
	}

}
