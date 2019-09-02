package com.java.datastructure.array;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/**  
 * @Description: ArrayMethodTest.java
 * @author: lsm
 * @date: 2018年12月28日 下午2:51:40   
 */
public class ArrayMethodTest {

	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDeclare() throws Exception {
		 String[] arr1 = new String[5];  
		 String[] arr2 = {"a","b","c", "d", "e"};  
		 String[] arr3= new String[]{"a","b","c","d","e"};  
		 int[] arr = { 1, 2, 3, 4, 5 };  
		 String arrString = Arrays.toString(arr);  
		 System.out.println(arr);  
		 // [I@139a55
		 System.out.println(arrString);  
		 // [1, 2, 3, 4, 5]
	}
	@Test
	public void test2() throws Exception {
		// 检查一个数组是否包含某值
		String[] arr= { "a", "b", "c", "d", "e" };  
		 boolean f = Arrays.asList(arr).contains("a");
		 System.out.println(f);
		
	}
	/**
	 * 演示反转和找最大最小值：
	 * @throws Exception
	 */
	@Test
	public void testReverse() throws Exception {
		String[] arr= { "a", "b", "c", "d", "e" };
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		String min = Collections.min(Arrays.asList(arr));
        String max = Collections.max(Arrays.asList(arr));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);

	}
}
