package com.java.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * @Description: MathDemo.java
 * @author: liusen
 * @date:   2019年3月20日 下午3:31:38   
 * @version V2.0
 */
public class MathDemo {
        /*
	     --public static double abs(double a) ：返回 double 值的绝对值。
	    double d1 = Math.abs(‐5); //d1的值为5
		double d2 = Math.abs(5); //d2的值为5
		
		--public static double ceil(double a) ：返回大于等于参数的最小的整数
	    double d1 = Math.ceil(3.3); //d1的值为 4.0
		double d2 = Math.ceil(‐3.3); //d2的值为 ‐3.0
		double d3 = Math.ceil(5.1); //d3的值为 6.0
		
		--public static double floor(double a) ：返回小于等于参数最大的整数
		double d1 = Math.floor(3.3); //d1的值为3.0
		double d2 = Math.floor(‐3.3); //d2的值为‐4.0
		double d3 = Math.floor(5.1); //d3的值为 5.0
		
		--public static long round(double a) ：返回最接近参数的 long。(相当于四舍五入方法)
		long d1 = Math.round(5.5); //d1的值为6.0
		long d2 = Math.round(5.4); //d2的值为5.0
 */
	
	// 请使用 Math 相关的API，计算在  - 10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
	@Test
	public void test1() throws Exception {
		double min = -10.8;
		double max = 5.9;
		int count = 0;
		for(double i = Math.ceil(min); i < Math.ceil(max); i++){
			if (Math.abs(i)>6 || Math.abs(i)<2.1) {
				count++;
				System.out.println(i);
				//System.out.println(Math.abs(min));
			}
		}
		System.out.println(count);
		
		
	}
}
