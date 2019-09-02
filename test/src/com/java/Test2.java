package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.junit.Test;

/**  
 * @Description: Test2.java
 * @author: liusen
 * @date:   2018年12月22日 上午10:27:57   
 * @version V2.0
 */
public class Test2 {
	
	/**
	 * 输入某年某月某日，判断这一天是这一年的第几天？
	 * @throws Exception
	 */
    @Test
	public void testGetDay() throws Exception {
		Scanner s1 = new Scanner(System.in);
		int year;
		int month;
		int day;
		System.out.println("请输入年：");
		year = s1.nextInt();
		System.out.println("请输入月：");
		month = s1.nextInt();
		System.out.println("请输入日：");
		day = s1.nextInt();
		switch (year) {
		case 1:
			
			break;

		default:
			break;
		}
		
		
		s1.close();
    	
	}
    
    /**
     * .编写一个函数将一个十六进制数的字符串参数转换成整数返回。
     * @throws Exception
     */
    @Test
	public void testZhuanHuan() throws Exception {
    	String str = "13abf";
    	int i = Integer.parseInt(str, 16);
    	System.out.println(i);
	}
    
    /**
     *  猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个, 第二天早
		上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下 的一半零一个。到第 10
		天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
		10  1
		9   1  3
		8   1  3  6  1
     */
      @Test
	public void testMonkey() throws Exception {
		int x = 1;
		for (int i = 2; i <= 10; i++) {
			x = 2 * (x + 1);
			
		}
		System.out.println(x);
		System.err.println(fun(10));

	}
    //递归调用
	private  int fun(int n) {
		if (n == 1) {
			return 1;
		} else {
			return fun(n - 1) * 2 + 2;
		}

	}
	
	/**
	 * 打印出如下图案（菱形）
			*
		   ***
		  *****
		 *******
		  *****
		   ***
			*
	 * @throws Exception
	 */
	@Test
	public void testLingXin() throws Exception {
		int H = 7;
		int W = 7;
		for (int i = 0; i < H/2 + 1 ; i++) {
			for (int j = 0; j < W/2 - i ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i) +1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int a = 1; a <= H / 2 ; a++) {
			for (int b = 1; b <= a; b++) {
			 	System.out.print(" ");
			}
			for(int c = 0; c < W - a * 2 ;c++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	/**
	 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前 20 项之和。
	 * @throws Exception
	 */
	@Test
	public void testFenShu() throws Exception {
		int x = 2, y = 1, t;
		double sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum = sum + (double) x / y;
			t = y;
			y = x;
			x = y + t;
		}
		System.out.println("前 20 项相加之和是： " + sum);
	}
	
	/**
		题目：有 5 个人坐在一起，问第五个人多少岁？他说比第 4 个人大 2 岁。问第 4 个人岁数，他说比第 3 个
		人大 2 岁。问第三个人，又说比第 2 人大两岁。问第 2 个人，说比第一个人大两岁。最后问第一个人，他
		说是 10 岁。请问第五个人多大？
	 */
	@Test
	public void testAge() throws Exception {
		int age = 10;
		for (int i = 2; i <= 5; i++) {
			age = age + 2 ; 
		}
		System.err.println(age);
	}
	
	/**
	 * 利用递归方法求 5!。
	 */
    @Test
	public void testFiveRecursion() throws Exception {
      System.out.println(rec(5));
	}
    
    public static int rec(int n){
        int v = 0;
    	if (n == 1) {
			v = 1;
		}else {
			v = n * rec(n-1);
		}
    	
		return v;
    	
    }
    /**
     * 给一个不多于 5 位的正整数，要求：一、求它是几位数，二、逆序打印出各位数
     * @throws Exception
     */
	@Test
	public void testZs() throws Exception {
		String s = "12345";

		System.out.println(s.length());
		for (int i = s.length(); i > 0; i--) {
			System.out.print(s.substring(i - 1, i));
		}
		System.out.println("***********************************");
		char[] arr = s.toCharArray();
		System.out.println(arr.length);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println("***********************************");
	  long n = Long.parseLong(s);
	  long a = n / 10000;  /*分解出万位 1*/  
	  long b = n % 10000 / 1000;  /*分解出千位*/
	  long c = n % 1000 / 100;
	  long d = n % 100 / 10;
	  long e = n % 10;
	  /*System.out.println(n % 10000);
	  System.out.println(n % 1000);
	  System.out.println(n % 100);	 */
	  System.out.println(n % 1000 / 100);	
	  //System.out.println(a);
	  System.out.printf("%d%d%d%d%d",a,b,c,d,e);
	
	}
	
	/**
	 * 一个 5 位数，判断它是不是回文数。即 12321 是回文数，个位与万位相同，十位与千位相同。
	 * @throws Exception
	 */
	@Test
	public void testHuiWenShu() throws Exception {
		String str= "12121";
		boolean flag = true;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			if (arr[i] != arr[(arr.length-1)-i]) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(flag+"是");
		}else {
			System.out.println(flag+"不是");
		}
		
	}
	
	/**
	 * 求一个 3*3 矩阵对角线元素之和
	 * @throws Exception
	 */
	@Test
	public void testJuZhen() throws Exception {
		Scanner s = new Scanner(System.in);
		int[][] a = new int[][]{{1,2,3},{4,5,6,},{7,8,9}};
		/*System.out.println("请输入 9 个整数：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = s.nextInt();
			}
		}*/
		System.out.println("输入的 3 * 3 矩阵是:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int sum1 = 0;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				if (i == j) {
					sum = sum +a[i][j];
				}
				if (i + j == 2) {
					sum1= sum1+a[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
	
	/**
	 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
	 */
	@Test
	public void testChaRu() throws Exception {
		int[] arr1 = new int[]{1,5,6,9,18};
		int[] arr2 = new int[arr1.length+1];
		int a = 17;
		if (a >= arr1[arr1.length-1]) {
			for (int i = 0; i < arr1.length; i++) {
				arr2[i] = arr1[i];
			}
			arr2[arr2.length-1] = a;
		}else {
			int i;
		/*	for ( i = 0; i < arr1.length; i++) {
				if (arr1[i] <= a) {
					arr2[i] = arr1[i];
					for(i=i+1;i<arr2.length;i++){ 
						arr2[i]=arr1[i-1];
						}
				}else {
					arr2[i] = a;
					break;
				}
				for (int j = i+1; j < arr2.length; j++) {
					arr2[j] = arr1[j-1];
				}
			}*/
			for ( i = 0; i < arr1.length; i++) {
				if (arr1[i] >= a) {
					arr2[i] = a;
					for(i=i+1;i<arr2.length;i++){ 
						arr2[i]=arr1[i-1];
						}
				}else {
					arr2[i] = arr1[i];
				}
				
			}
		}
		System.out.println(Arrays.toString(arr2));
	 
	}
	
	/**
	 * 将一个数组逆序输出。
	 * @throws Exception
	 */
	@Test
	public void testInverse() throws Exception {
		int[] arr ={6,5,4,3,9,8};
		int[] arr2 = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			arr2[arr.length-i-1]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("---------------------------------");
		//////////////////////////利用转换为list进行操作
	     Integer[] numbers = {6,5,4,3,9,8};
	        Collections.reverse(Arrays.asList(numbers));
	        System.out.println("反转后的数组为："+Arrays.asList(numbers));
	        int min = Collections.min(Arrays.asList(numbers));
	        int max = Collections.max(Arrays.asList(numbers));
	        System.out.println("最小值: " + min);
	        System.out.println("最大值: " + max);

	}
	
	/**
	 * 取一个整数 a 从右端开始的 4～7 位。
	 * @throws Exception
	 */
	@Test
	public void testGetVal() throws Exception {
		long a = 123456789L;
		String s = String.valueOf(a);
		char[] cs = s.toCharArray();
		System.out.print(cs[cs.length-4]);
		System.out.print(cs[cs.length-5]);
		System.out.print(cs[cs.length-6]);
		System.out.print(cs[cs.length-7]);
	//	System.out.print(cs.length-4);
	}
	/*打印出杨辉三角形（要求打印出 10 行如下图）
	      1
	      1  1
	      1  2  1
	      1  3  3  1
	      1  4  6  4  1
	      1  5  10 10 5 1
	*/
	@Test
	public void testYHSJ() throws Exception {
		int[][] a = new int[10][10];
		for (int i = 0; i < 10; i++) {
			a[i][i] = 1;
			a[i][0] = 1;
		}
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < i; j++) {
				a[i][j] = a[1][0] + a[i-1][j];
			    a[2][1] = a[1][0] + a[1][1];
			}
		}
		for (int i = 0; i < a.length; i++) {
			/*for (int k = 0; k < 2 * (10 - i) - 1; k++) {
				System.out.print(" ");
			}*/
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 2 * (10 - i) - 1; k++) {
				System.out.print("");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}*/
	}
	
	/**
	 * 输入 3 个数 a,b,c，按大小顺序输出。
	 */
	@Test
	public void testSort() throws Exception {
		int a = 10;
		int b = 11;
		int c = 9;
		if(a < b){
		int t = a;
	        a = b;
	        b = t;
		}
		if (a < c) {
			int t = a;
	        a = c;
	        c = t;
		}
		if (b < c) {
			int t = b;
	        b = c;
	        c = t;
		}
		System.out.println(a+" "+b+" "+c);
	}
	
	
}
