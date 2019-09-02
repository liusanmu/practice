package com.java.reflect;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Test;

/**
 * @Description: Demo01.java
 * @author: liusen
 * @date: 2018年12月14日 下午2:43:44
 */
public class Demo01 {

	public static void main(String[] args) {

	}

	/**
	 * 用反射机制声明长度为 10 的 的 int
	 * 
	 * @throws Exception
	 */
	@Test
	public void declareNum() throws Exception {
		Class<Integer> clazz = int.class;
		Object object = Array.newInstance(clazz, 10);
		for (int i = 0; i < 10; i++) {
			Array.set(object, i, i);
			
		}
		int[] arr = (int[]) object;
		for (int j = 0; j < arr.length; j++) {
			System.err.println(arr[j]);
		}

	}
	
	/**
	 * 跳出循环
	 * @throws Exception
	 */
	@Test
	public void TiaochuXunHuan() throws Exception {
	/*	ok: for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("i=" + i + ",j=" + j);
				if (j == 1) {
					break ok;
				}
			}
		}
	}*/
	
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 9 } };
		boolean found = false;
		for (int i = 0; i < arr.length && !found; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("i=" + i + ",j=" + j);
				if (arr[i][j] == 5) {
					found = true;
					break;
				}
			}
		}

	}
	///////////////////////////
	/**
	 *  short s1 = 1; s1 = s1 + 1; 有什么错? short s1 = 1; s1 += 1; 有什么错?
		对于 short s1 = 1; s1 = s1 + 1; 由于 s1+1 运算时会自动提升表达式的类型，所以结果是 int 型，
		再赋值给 short 类型 s1 时，编译器将报告需要强制转换类型的错误。
		对于 short s1 = 1; s1 += 1;由于 += 是 java 语言规定的运算符，java 编译器会对它进行特殊处
		理，因此可以正确编译。
	 * @throws Exception
	 */
	@Test
	public void testName() throws Exception {
		short s1 = 1; 
		//s1 = s1 + 1;
		short s2 = 1; s2 += 1;
		short a = 1;
		int b = a;
		final StringBuffer sb = new StringBuffer("fcv");
		//sb = new StringBuffer();
		sb.append("abc");
	}
	
	
	/*
	 *  int 是 java 提供的 8 种原始数据类型之一。Java 为每个原始类型提供了封装类，Integer 是 java
		为 int 提供的封装类。int 的默认值为 0，而 Integer 的默认值为 null，即 Integer 可以区分出
		未赋值和值为 0 的区别，int 则无法表达出未赋值的情况，例如，要想表达出没有参加考试
		和考试成绩为 0 的区别，则只能使用 Integer。在 JSP 开发中，Integer 的默认为 null，所以用
		el 表达式在文本框中显示时，值为空白字符串，而 int 默认的默认值为 0，所以用 el 表达式
		在文本框中显示时，结果为 0，所以，int 不适合作为 web 层的表单数据的类型。
		在 Hibernate 中，如果将 OID 定义为 Integer 类型，那么 Hibernate 就可以根据其值是否为 null
		而判断一个对象是否是临时的，如果将 OID 定义为了 int 类型，还需要在 hbm 映射文件中
		设置其 unsaved-value 属性为 0。
		另外，Integer 提供了多个与整数相关的操作方法，例如，将一个字符串转换成整数，Integer
		中还定义了表示整数的最大值和最小值的常量。
	 */
	
}