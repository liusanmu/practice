package com.java.io.objclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

/**  
 * @Description:深克隆
 * @author: liusen
 * @date:   2019年4月2日 下午2:01:53   
 */
public class DeepClone {
	public DeepClone() {
		//throw new AssertionError();
	}
	// 说明：调用 ByteArrayInputStream 或 ByteArrayOutputStream 对象的 close 方法没有任何意义
	// 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放

	@SuppressWarnings("unchecked")
	public static <T extends Serializable>  T clone(T t) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(t);
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		
		return (T)ois.readObject();
	}
	
	
	@Test
	public void testDeepClone() throws Exception {
		Car car = new Car("车子", 220);
		Person p = new Person("aaa", 12, car);
		Person person = clone(p);
		System.out.println(person);
		System.out.println(p==person);
	}
	
}
