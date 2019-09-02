package com.java.oop.finall;



/**
 * 根据  final 的定义，写法1报错！写法2，为什么通过编译呢？
 * 因为每次循环，都是一次新的变量c。
 * @author lsm
 *
 */

public class Test {
	
	@org.junit.Test
	public void test1() throws Exception {
		final int c = 0;
		for (int j = 0; j < 10; j++) {
			//c = j;
			System.out.println(c);
		}
	
	}
	
	@org.junit.Test
	public void test2() throws Exception {
		
		for (int j = 0; j < 10; j++) {
			final int c = j;
			System.out.println(c);
		}
	
	}

}
