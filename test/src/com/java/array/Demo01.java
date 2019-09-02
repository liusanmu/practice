package com.java.array;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * @Description: Demo01.java
 * @author: liusen
 * @date:   2019年3月20日 上午10:00:32   
 * @version V2.0
 */
public class Demo01 {
	
	@Test
	public void test1() throws Exception {
		int[] arr1 = new int[3];
		arr1[0] = 3;
		arr1[1] = 6;
		arr1[2] = 9;
		
		int[] arr2 = arr1;
		arr2[0] = 1;
		arr2[1] = 4;
		for (int i : arr1) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i);
		}
	}
	
	@Test
	public void test2() throws Exception {
		int a = 1;
		int b = 2;
		System.out.println(a+"-"+b);
		//change(a,b);
		a = a + b;
		b = b + a;
		System.out.println(a+":"+b);
		
	}
	//1-2
	//3:5
	/**
	 * 方法的参数类型
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		int a = 1;
		int b = 2;
		System.out.println(a+"-"+b);
		change(a,b);
		System.out.println(a+":"+b);
		
	}
	//1-2
	//1:2
	public static void change(int a, int b) {
		a = a + b;
		b = b + a;
	}
	
	
	//方法的参数为基本类型时,传递的是数据值. 方法的参数为引用类型时,传递的是地址值.
	@Test
    public void test4() throws Exception {
        
		//int[] arr = {1,3,5};
		int[] arr = {1,3,5};
        System.out.println(arr[0]);  //1
        change1(arr);
	
        System.out.println(arr[0]); //200
	}
     
	//数组是引用数据类型
	public static void change1(int[] arr) {
		arr[0] = 200;
	}
    
	
	
	@Test
	public void test5() throws Exception {
		  int[] arrayA = new int[3];
	        System.out.println(arrayA); // 地址值
	        System.out.println(arrayA[0]); // 0
	        System.out.println(arrayA[1]); // 0
	        System.out.println(arrayA[2]); // 0
	        System.out.println("==============");

	        arrayA[1] = 10;
	        arrayA[2] = 20;
	        System.out.println(arrayA); // 地址值
	        System.out.println(arrayA[0]); // 0
	        System.out.println(arrayA[1]); // 10
	        System.out.println(arrayA[2]); // 20
	        System.out.println("==============");

	        // 将arrayA数组的地址值，赋值给arrayB数组
	        int[] arrayB = arrayA;
	        System.out.println(arrayB); // 地址值
	        System.out.println(arrayB[0]); // 0
	        System.out.println(arrayB[1]); // 10
	        System.out.println(arrayB[2]); // 20
	        System.out.println("==============");

	        arrayB[1] = 100;
	        arrayB[2] = 200;
	        System.out.println(arrayB); // 地址值
	        System.out.println(arrayB[0]); // 0
	        System.out.println(arrayB[1]); // 100
	        System.out.println(arrayB[2]); // 200
	        System.out.println("==============");
	        System.out.println(arrayA[0]); // 0
	        System.out.println(arrayA[1]); // 100
	        System.out.println(arrayA[2]); // 200
	}






}
