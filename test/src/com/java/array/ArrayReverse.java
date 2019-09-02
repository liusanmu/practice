package com.java.array;

import static org.junit.Assert.*;

import java.awt.datatransfer.StringSelection;

import org.junit.Test;
import org.junit.experimental.max.MaxCore;

/**  
 * @Description:数组的反转
 * @author: liusen
 * @date:   2019年3月20日 上午10:07:46   
 * @version V2.0
 */
public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr = {2,5,9,6,3};
		//int[] a = new int[]{1,4,7,8,5,2};
		 /*
	      循环中定义变量min=0最小索引
	      max=arr.length‐1最大索引
	      min++,max‐‐
	      */
		for (int min = 0, max = arr.length-1; min <= max; min++, max--) {
			int temp = arr[min];
			arr[min] = arr[max];
			arr[max] = temp;
			/*arr[min] = arr[max] + arr[min];
			arr[max] = arr[min] - arr[max];
			arr[min] = arr[min] - arr[max];*/
			
		}
		for (int i : arr) {
			System.out.print(i);
		}
		/*int a = 10;
		int b = 5 ;
		a = a + b;   //a=15
		b = a - b;   //15-10
		a = a - b;*/

	}
	

	/**
	 * 不借助变量交换变量
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		String str1 = "abcde";
		String str2 = "qwert";
	    str1 =  str1 + str2; //abcdeqwert
		//substring(x)是从字符串的的第x个字符往后截取
       // substring(x,y）是从x到y前的位置停止
	    str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
	}
	
	

}
