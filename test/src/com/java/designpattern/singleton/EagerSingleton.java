package com.java.designpattern.singleton;
/**  
 * @Description: EagerSingleton.java 饿汉式单例
 * 安全，效率高。相对懒汉式会在未使用之前就占用内存。
 * @author: liusen
 * @date:   2018年12月9日 下午5:49:36   
 */
public class EagerSingleton {

	private static EagerSingleton singleton =  new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return singleton;
		
	}
	
}
