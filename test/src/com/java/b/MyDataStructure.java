/**
 * 
 */
package com.java.b;


/**  
 * @Description: 如果系统要使用超大整数（超过long长度范围），
 *               请你设计一个数据结构来存储这种超大型数字以及设计一种算法来实现超大整数加法运算 
 * @author: liusen
 * @date:   2018年12月10日 上午11:17:41   
 */

public class MyDataStructure {

	/*
	 * 1.获取字符串长度
	 * 2.比较字符串大小，长度小的那一个在左边添加0，知道和较长的哪一个相等
	 */
	public static String add(String s1, String s2){
		String result = "";
		// 获取字符串长度
		int len1 = s1.length();
		int len2 = s2.length();
		// 比较字符串大小，
		int maxLen = len1 > len2 ? len1 : len2;
		int minLen = len1 < len2 ? len1 : len2;
		// 长度小的那一个在左边添加0，直到和较长的那一个字符串长度相等
		StringBuffer tempZero = new StringBuffer();
		for (int i = 0; i < maxLen - minLen; i++) {
			// tmepZero = tmepZero + "0";
			tempZero.append("0");
		}
		
		//如果s1的长度等于最大长度 ,s2左边加0
		if (len1 == maxLen) {
			s2 = tempZero + s2;
		} else {
			s1 = tempZero + s1;
		}
		
		// 进位（carryflag）
		int cf = 0;
		// charAt索引范围为从 0 到 length() - 1
		for (int j = maxLen - 1; j >= 0; j--) {
		    int a = Integer.parseInt(String.valueOf(s1.charAt(j)));  
			int b = Integer.parseInt(String.valueOf(s2.charAt(j))); 
			int temp;
			//最左边的那一位（最高位）不需要再进位了
			if (a + b + cf > 10 && j != 0) {
				temp = a + b + cf -10;
				cf = 1;
			}else {
				temp = a + b + cf;
				cf = 0;
			}
		
			//  temp + result; 字符串的连接，位置不可变
			result = temp + result; 
			
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(add("999999999999999999", "999874526863222222222222222222222222222222222"));
	}
}
