package com.java;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.sun.org.apache.xpath.internal.operations.Mult;

/**
 * @Description: Test01.java
 * @author: liusen
 * @date: 2018年12月12日 下午5:41:40
 */
public class Test01 {

	@Test
	public void test01() throws Exception {
		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

		System.out.println(f1 == f2); //true
		System.out.println(f3 == f4); //false

	}

	/**
	 * 1-4的三位数个数
	 * @throws Exception
	 */
	@Test
	public void test02() throws Exception {
		int count = 0;
		for (int x = 1; x < 5; x++) {
			for (int y = 1; y < 5; y++) {
				for (int z = 1; z < 5; z++) {
					if (x != y && y != z && x != z) {
						count++;
						System.out.print(x * 100 + y * 10 + z+" ");
					}
				}
				System.out.println();
			}
		}
		System.out.println("共有" + count + "个三位数");
	}

	@Test
	public void chengfa() throws Exception {
		/*for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + " ");
				if (j * i < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + " ");
				if (i * j < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	/**
	 * 利用递归方法求 5!。
	 * 
	 * @throws Exception
	 */
	@Test
	public void diGui() throws Exception {

		Recursion recursion = new Recursion();
		Long result = recursion.rec(5);
		System.out.println(result);
	}

	class Recursion {
		public Long rec(int n) {
			long val = 0;
			if (n == 1) {
				val = 1;
			} else {
				val = n * rec(n - 1); // 5*fec(4) //5* 4*3 2fec(1)
			}
			return val;
		}
	}

	/**
	 * 求 1+2!+3!+...+20!的和
	 * 
	 * @throws Exception
	 */
	@Test
	public void DiGuiQiuHe() throws Exception {
		long sum = 0;
		long fac = 1;
		for (int i = 1; i <= 3; i++) {
			fac = fac * i; // 1*1*2*3
			sum += fac; // 1 1
		}

		System.out.println(sum);
		/*
		 * long sum = 0; long fac = 1; for(int i=1; i<=20; i++) { fac = fac * i;
		 * sum += fac; } System.out.println(sum);
		 */
	}

	/**
	 * 计算字符串中子串出现的次数
	 */
	@Test
	public void containsNum() throws Exception {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入字符串！");
		// String s1 = sc.nextLine();
		// System.out.println("请输入字串！");
		// String s2 = sc.nextLine();
		String s1 = "abcabcabcabcbbccccfccabcddabc";
		String s2 = "abc";

		// ////////方法一////////////////////////

	/*	int count = 0;
		if ("".equals(s1) || "".equals(s2)) {
			System.err.println("空字符串无法比较!");
			System.exit(0);
		} else {
			for (int i = 0; i < s1.length() - s2.length(); i++) {
				if (s2.equals(s1.substring(i, s2.length() + i))) {
					count++;
				}
			}
			System.out.println(count);
		}*/

		// ////////方法二////////////////////////
		// int indexOf(String str) ：返回第一次出现的指定子字符串在此字符串中的索引。
		// int indexOf(String str, int
		// startIndex)：从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。

	/*	int n = 0;
		while (s1.contains(s2)) {
			s1 = s1.substring(s1.indexOf(s2) + s2.length());
			n++;
		}
		System.err.println(n);
*/
		// /////////////方法三////////////////////////

		int count1 = 0;
		Pattern p = Pattern.compile(s2);
		Matcher m = p.matcher(s1);
		while (m.find()) {
			count1++;
		}
		System.out.println(count1);

		//方法四
		 String[] ary  = s1.split(s2);
		 for (String string : ary) {
			System.out.println(string);
		}
		 System.out.println("ABC的个数 : " + (ary.length - 1));
		 
		
	}

	/**
	 * 编写一个 Java 程序，用 if-else 语句判断某年份是否为闰年。
	 * 
	 * @throws Exception
	 */
	@Test
	public void isLeapYear() throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		String year = scanner.nextLine();
		int year1 = Integer.parseInt(year);
		if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 100 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}

	/**
	 * 编写一个 Java 程序在屏幕上输出 1！+2！+3！+……+10！的和
	 */
	@Test
	public void sum() throws Exception {

		long sum = 0; // 1
		for (int i = 1; i <= 10; i++) { // 2
			long mul = 1; // 1
			for (int j = 1; j <= i; j++) {
				mul = mul * j; // 1*1 1*1*2
			}
			sum = sum + mul;
		}
		System.out.println(sum);

	}

	/**
	 * 编写一个 Java 应用程序，从键盘读取用户输入两个字符串，并重载 3 个函数分别实现这两个字符串的
	 * 拼接、整数相加和浮点数相加。要进行异常处理，对输入的不符合要求的字符串提示给用户，不能使程序 崩溃。
	 */
	@Test
	public void overloadTest() throws Exception {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			// BufferedReader strin=new BufferedReader(new
			// InputStreamReader(System.in));
			System.out.println("第一个数:");
			String s1 = sc.nextLine();
			System.out.println("第二个数:");
			String s2 = sc.nextLine();
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			float f1 = Float.parseFloat(s1);
			float f2 = Float.parseFloat(s2);
			String ss = strAdd(s1, s2);
			String si = strAdd(i1, i2);
			String sf = strAdd(f1, f2);
			System.out.println("输入的二个字符串相加结果为：" + ss);
			System.out.println("输入字符串转换为整数相加结果为：" + si);
			System.out.println("输入字符串转换为浮点数相加结果为：" + sf);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	public String strAdd(String s1, String s2) {

		return s1 + s2;
	}

	public String strAdd(Integer s1, Integer s2) {

		return String.valueOf(s1 + s2);

	}

	public String strAdd(Float s1, Float s2) {

		return String.valueOf(s1 + s2);

	}

	// /////////////////////////////////////////////////////////
	/**
	 * 古典问题：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个月后每个月
	 * 又生一对兔子，假如兔子都不死，问10个月的兔子总数为多少？
	 * 兔子的规律为数列1,1,2,3,5,8,13,21.... 
     * 这是一个菲波拉契数列问题
     * {斐波拉契数列原理：除开前两项 后面每位数等于前两项相加之和}
     * 1.通过中间值来保存上一月兔子的和 
     * 2.在将上一月兔子这一月兔子相加 得到下一月数量和
	 * @throws Exception
	 */
	@Test
	public void testRabbit() throws Exception {
	
		System.out.println(f(4));

	}

	public int f(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}

		else {
			return f(i - 1) + f(i - 2); // 1 1 2
		}
	}

	/**
	 * ：判断 101-200 之间有多少个素数，并输出所有素数。 程序分析：判断素数的方法：用一个数分别去除 2 到 sqrt(这个数)，如果能被整除，
	 * 则表明此数不是素数， 反之是素数
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSuShu() throws Exception {
		boolean flag = true;
		int count = 0;
		for (int i = 101; i <= 200; i += 1) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = true;
					break;
				} else {
					flag = false;

				}
			}
			if (flag == false) {
				count++;
				System.out.println(i);

			}

		}
		System.err.println(count);
		;
	}

	/**
	 * 利用条件运算符的嵌套来完成此题：学习成绩> =90 分的同学用 A 表示，60-89 分之间的用 B 表示60 分以下的用 C 表示。
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGrade() throws Exception {
		int x = 50;
		char grade;
//		grade = x >= 90 ? 'A' : x > 60 ? 'B' : 'C';
		grade = x >= 90 ? 'A' : x >= 80 ? 'B':x >= 60 ? 'C' : 'D';
 		System.out.println(grade);

	}

	/**
	 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
	 */
	@Test
	public void testCount() throws Exception {
		String str = "az 9 5 $ ZA % 0 ";
		char[] cs = str.toCharArray();
		System.out.println(cs.length);
		int word = 0;
		int space = 0;
		int num = 0;
		int other = 0;

		for (int i = 0; i < cs.length; i++) {
			if (cs[i] >= 'a' && cs[i] <= 'z' || cs[i] >= 'A' && cs[i] <= 'Z') {
				word++;
			} else if (cs[i] >= '0' && cs[i] <= '9') {
				num++;

			} else if (cs[i] == ' ') {
				space++;
			} else {
				other += 1;
			}
		}
		System.out.println(word);
		System.out.println(space);
		System.out.println(num);
		System.out.println(other);
	}

	/**
	 * 题目：求 s=a+aa+aaa+aaaa+aa...a 的值，其中 a 是一个数字。例如 2+22+222+2222+22222(此时共 有 5
	 * 个数相加)，几个数相加有键盘控制。
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd() throws Exception {

	}

	/**
	 * 一球从 100 米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第 10 次落地时，
	 *  共经过多少米？第 10 次反弹多高？
	 * 
	 * @throws Exception
	 */
	@Test
	public void testFall() throws Exception {
		double high = 100;
		double sum = 100;
		for (int i = 1; i < 10; i++) {
			high = high / 2;
			sum = sum + high;

		}
		System.out.println(sum);
		System.out.println(high);

	}

	/**
	 * 有 1、2、3、4 四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRecombine() throws Exception {
		int count = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int a = 1; a < 5; a++) {
					if (i != j && j != a && i != a) {
						System.out.println(i * 100 + j * 10 + a);
						count++;
					}
				}
			}
		}
		System.err.println(count);

	}

	/**
	 * 一个整数，它加上 100 后是一个完全平方数，再加上 168 又是一个完全平方数，请问该数是多少？
	 * @throws Exception
	 */
	@Test
	public void testCaculator() throws Exception {
		for (int i = 0; i < 10000; i++) {
			if (Math.sqrt(i + 100) % 1 == 0) {
				if (Math.sqrt(i + 268) % 1 == 0) {
					System.out.println(i + "加 100 是一个完全平方数，再加 168 又是一个完全平方数");
				}
			}

		}
	}
	
	@Test
	public void test() throws Exception {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 3;
		//当c==d成立后便不再执行s==b
		if (a==b & c==d) {
			System.out.println("aaa");
		}else {
			System.out.println("bbb");
		}
	}
	

}
