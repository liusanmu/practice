package com.java;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;

import com.sun.accessibility.internal.resources.accessibility;

/**
 * @Description: Test3.java
 * @author: liusen
 * @date: 2018年12月25日 上午9:11:55
 * @version V2.0
 */
public class Test3 {

	/**
	 *编程输出一个倒立三角形图。
	  * * * * *
      * * * *
      * * *
      * *
      *
	*/
	@Test
	public void test1() throws Exception {
		for (int j = 0; j < 5; j++) {
			for(int i = 5; i > j ; i--){
				System.out.print("* ");
			}
			System.out.println();
		}
   }	
	
	/**
	 * 打印昨天的当前时刻。
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(dateFormat.format(cal.getTime()));
	}
	

	@Test
	public void test3() throws Exception {
		
		 System.out.println("5" + 2);
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {
		String str1 = "hello";
		String str2 = "he" + new String("llo");
		System.err.println(str1 == str2);
	}
	
	/**
	 * 给定一个txt文件，如何得到某字符串出现的次数
	 */
	@Test
	public void test5() throws Exception {
		File file = new File("e:/a.txt");
		/*BufferedReader br = new BufferedReader(new FileReader(file) );
		String len =  null;
		StringBuilder sb = new StringBuilder();
		while ((len = br.readLine()) != null) {
			//sb.append(System.lineSeparator()+len);  //换行
			sb.append(len);
		}
		System.out.println(sb);
		char[] cs = sb.toString().toCharArray();
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
			if ('o' == cs[i]) {
				count = count+1;
			}
			
		}
		System.out.println(count);
		
		br.close();*/
		InputStream is = new FileInputStream(file);
		byte b[] = new byte[1024];
		int a = is.read(b);
		String str[] = new String(b, 0, a).split("");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if ("o".equals(str[i]))
				count++;
		}
		System.out.println(count);
		is.close();
	}
	
	@Test
	public void test6() throws Exception {
		String str="123";
		Integer i1 = Integer.valueOf(str);
		int i2 = Integer.parseInt(str);
		
		Long sum=0L;

		for( long i = 0; i < 10000; i++) {
		  sum+=i;
		}
	}
	
	@Test
	public void test7() throws Exception {
		
		byte b1=3,b2=4,b;
		//b=b1+b2; //byte运算先变成int,再计算， 因为他们最终是要转向int类型
					//而int类型的值不能赋值给byte,byte,char,short编译时都是需要转成int，才可运算。
		b=3+4;//因为他们都是常量 具有常量类型优化机制 可以直接识别为byte，两个常量相加，先计算常量数值，然
				//后判断是否满足类型范围，再赋值。
		//哪句是编译失败的呢？为什么呢？

		//第二题：
		//byte  by = 130;//有没有问题?有问题如何解决?结果是多少呢?

		//第三题:
		//byte b = 10;
		//b++;
		//b = b + 1;
		//哪句是编译失败的呢？为什么呢？
		//short s = 1; s = s + 1;//有没有问题?如果有怎么解决?
		/*
		 * 隐式类型转换可以从小到大自动转，即byte->short->int->long如果反过来会丢失精度，必须进行显示类型转换
			而s+=1的意思与s = s+1不同，s=s+1这句先执行s+1然后把结果赋给s，由于1为int类型，所以s+1的返回值是int，
			编译器自动进行了隐式类型转换
		 */
		//short s = 1; s += 1;//有没有问题?如果有怎么解决?
		/**
		 * 所以将一个int类型赋给short就会出错，而s+=1不同由于是+=操作符，在解析时候s+=1就等价于s = (short)(s+1),翻番来讲就是
			s+=1 <=> s = (s的类型)(s+1)
		 */
		
	}
	
		@Test
		public void test8() throws Exception {
			int i = beforeFinally();
			System.out.println(i);
		}
	
		  public static int beforeFinally(){
			  int a = 0;
		        try{
		            a = 1;
		            return a;
		        }finally{
		            a = 2;
		            return a; 
		        }   // ---2
		      /*  int a = 0;
		        try{
		            a = 1;
		            return a;
		        }finally{
		            a = 2;
		        }*/ // -------1 -----
		    }
		  
		  @Test
		public void test9() throws Exception {
				//1.迭代遍历：  
				Set<String> set = new HashSet<String>();  
				Iterator<String> it = set.iterator();  
				while (it.hasNext()) {  
				  String str = it.next();  
				  System.out.println(str);  
				}  
				  
				//2.for循环遍历：  
				for (String str : set) {  
				      System.out.println(str);  
				}  
		}
		
		  
		  
		public static void main(String[] args) {
			// a();
			 System.out.println(a());
		}
			
		public static int a(){
			 int i = 110;
			  try {
				i = 1/0;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				return i;
			}finally{
				System.out.println("fianly");
				return 5;
			}
		}
			
		

}
