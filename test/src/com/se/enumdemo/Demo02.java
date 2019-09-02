package com.se.enumdemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * @Description: Demo02.java
 * @author: liusen
 * @date:   2019年3月21日 下午4:18:36   
 * @version V2.0
 */
public class Demo02 {

	@Test
	public void test1() throws Exception {
		//得到枚举对象
		Color100 c100 = Color100.RED;
		//枚举名称
		String name = c100.name();
		//枚举的下标
		int idx = c100.ordinal();
		System.out.println(name+" "+idx); //RED 0
	}
	
	@Test
	public void test2() throws Exception {
		int idx2 = 2;
		//得到枚举的对象
		Color100[] cs = Color100.values();
		//根据下标得到对象
		Color100 c12 = cs[idx2];
		//得到枚举的名称
		String name = c12.name();
		System.out.println(name);
	}
	
	@Test
	public void test3() throws Exception {
		
	}
	
	public static <T> void reverses(T[] arr1) {
		/*
		 * 基本思想：把第一个元素和最后一个元素交换位置，把第二个元素和倒数第二个元素交换位置。。。。
		 * 交换 长度/2
		 * */
		//遍历数组
		for(int i=0;i<arr1.length/2;i++) {
			/*int temp = arr1[0];
			arr1[0] = arr1[arr1.length-1];*/
			T temp = arr1[i];
			arr1[i] = arr1[arr1.length-i-1];
			arr1[arr1.length-i-1] = temp;
		}
		
	}
}

enum Color100 {
	RED,GREEN,YELLOW;
}