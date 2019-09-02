package it.ex1;

import static org.junit.Assert.*;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

import org.junit.Test;

import com.java.Test2;

/**  
 * @Description: day01.java
 * @author: liusen
 * @date:   2019年3月5日 上午10:58:54   
 * @version V2.0
 */
public class ImportantApi {
	
	@Test
	public void test1() throws Exception {
		Scanner sc = new Scanner(System.in);				//键盘录入
		//int i = sc.nextInt();								//键盘录入整数存储在i中
		//System.out.println(i);
		if(sc.hasNextInt()) {								//判断键盘录入的是否是int类型的数据
			int i = sc.nextInt();							//键盘录入的数据存储在i中
			System.out.println(i);
		}else {
			System.out.println("输入的类型错误");
		}
	}
	
		@Test
		public void test2() throws Exception {
			Scanner sc = new Scanner(System.in);
			/*System.out.println("请输入第一个整数:");
			int i = sc.nextInt();
			System.out.println("请输入第二个整数:");
			int j = sc.nextInt();
			System.out.println("i = " + i + ", j = " + j);*/
			
			/*System.out.println("请输入第一个字符串:");
			String line1 = sc.nextLine();
			System.out.println("请输入第二个字符串:");
			String line2 = sc.nextLine();
			System.out.println("line1 = " + line1 + ", line2 = " + line2 );*/
			
			/*
			 * nextInt()是键盘录入整数的方法,当我们录入10的时候
			 * 其实在键盘上录入的是10和\r\n,nextInt()方法只获取10就结束了
			 * nextLine()是键盘录入字符串的方法,可以接收任意类型,但是他凭什么能获取一行呢?
			 * 通过\r\n,只要遇到\r\n就证明一行结束
			 */
			/*System.out.println("请输入第一个整数:");
			int i = sc.nextInt();
			System.out.println("请输入第二个字符串:");
			String line2 = sc.nextLine();
			//System.out.println("i = " + i + ", line2 = " + line2);
			System.out.println(i);
			System.out.print("11111111111");
			System.out.print(line2);
			System.out.println("2222222222222");*/
			
			/*
			 * 解决方案
			 * 1,创建两次对象,但是浪费空间
			 * 2,键盘录入的都是字符串,都用nextLine方法,后面我们会学习讲整数字符串转换成整数的方法
			 */
			int i = sc.nextInt();
			Scanner sc2 = new Scanner(System.in);
			String line = sc2.nextLine();
			System.out.println(i);
			System.out.println(line);
		}
		
		@Test
		public void test3() throws Exception {
			String str = "abc";					//"abc"可以看成一个字符串对象
			str = "def";						//当把"def"赋值给str,原来的"abc"就变成了垃圾
			System.out.println(str);
		}
		
		
		@Test
		public void test4() throws Exception {
			byte[] arr1 = {97,98,99};		
			String s2 = new String(arr1);			//解码,将计算机读的懂的转换成我们读的懂
			System.out.println(s2);  //abc
			
			byte[] arr2 = {97,98,99,100,101};
			String s3 = new String(arr2,0,4);
			System.out.println(s3);  //abcd
			
			char[] arr3 = {'a','b','c','d','e'};
			String s4 = new String(arr3);
			System.out.println(s4);
			//System.out.println();
			
		}
		
		@Test
		public void test5() throws Exception {
			byte b = 3 + 4;             //在编译时就变成7.然后把赋值给b  常量优化机制
			String s1 = "a" + "b" +"c"; //
			String s2 = "abc";
			System.out.println(s1 == s2); //true java中有常量优化机制	
			System.out.println(s1.equals(s2));
			
		}
		
		@Test
		public void test6() throws Exception {
			String s1 = new String("abc");  //记录的是堆内存对象的地址值
			String s2 = "abc";              //记录的是常量池的地址值
			System.out.println(s1 == s2);  //false
			System.out.println(s1.equals(s2)); //true
		}
		
		@Test
		public void test7() throws Exception {
			//创建几个对象
			//创建两个对象,一个在常量池中,一个在堆内存中
			String s1 = new String("abc");		
			System.out.println(s1);
		}
		
		@Test
		public void test8() throws Exception {
			//常量池中没有这个字符串对象,就创建一个,如果有直接用即可
			String s1 = "abc";
			String s2 = "abc";
			System.out.println(s1 == s2); 			//true	
			System.out.println(s1.equals(s2)); 		//true
		}
	
		@Test
		public void test10() throws Exception {
			 String s1 = "ab";
			 String s2 = "abc";
			 String s3 = s1 + "c";
			 System.out.println(s3 == s2); //false
			 System.out.println(s3.equals(s2));  //true
			 
			 /* boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
			    boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
			    boolean contains(String str):判断大字符串中是否包含小字符串
			    boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
			    boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
			    boolean isEmpty():判断字符串是否为空。
			    
			    * int length():获取字符串的长度。
			    * char charAt(int index):获取指定索引位置的字符
			    * int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
			    * int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
			    * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
			    * int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
			    * lastIndexOf 返回指定字符在此字符串中最后一次出现处的索引，其他类似
			    * String substring(int start):从指定位置开始截取字符串,默认到末尾。
			    * String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
			    */
		}
		
		/**
		 * 遍历字符串
		 * @throws Exception
		 */
		@Test
		public void test11() throws Exception {
			//method one
			String string = "aqweqweqweq";
			for (int i = 0; i < string.length(); i++) {
				//System.out.println(string.charAt(i));
			}
			
			// method two
			char[] array = string.toCharArray();
			for (int i = 0; i < array.length; i++) {
				System.err.println(array[i]);
			}
		}
		
		//---------------------------------------------------------------------------------//			
		@Test
		public void testReverse() throws Exception {
			//String eventuate = reverseByRecursion("acbd");
			//System.out.println(eventuate);
		//	String eventuate2 = reverseByCharAt("abcdef");
			//System.out.println(eventuate2);
			String s3="afads";
			StringBuilder sb = new StringBuilder(s3);	                  
			String afterreverse = sb.reverse().toString();
			System.out.println(afterreverse);
		}
		
		// 字符串翻转  递归
		public String reverseByRecursion(String str)  {
		//	String s1 = "abc";
			int length = str.length();
			/*if (length <= 1) {
				return str;
			}*/
			if(str.isEmpty()) return str;
			/*System.out.println(length/2);
			String left = s1.substring(0, length/2);//从索引值为0截取到索引值为4*(b)  qwert
			System.out.println(left);
			String right = s1.substring(length/2, length);  //从索引值为5开始截取  qwert
			System.out.println(right);*/
			//String temp = 
  			return reverseByRecursion(str.substring(1)) + str.charAt(0);
				 
		}
		
		public String reverseByCharAt(String s){
			StringBuffer sb = new StringBuffer();
			for (int i = s.length()-1; i >=0; i--) {
				sb.append(s.charAt(i));
			}
			String string = new String(sb);
			// StringBuilder sb = new StringBuilder(s);	                  
			 // String afterreverse = sb.reverse().toString()
			
			/*char[] array = s.toCharArray();
		      String reverse = "";
		      for (int i = array.length - 1; i >= 0; i--) {
		          reverse += array[i];
		      }*/
	
			return string;
		}
		
		
//---------------------------------------------------------------------------------//		
		
		 // 修改字符传
		@Test
		public void test9() throws Exception {
			String name = "GDUTtiantian";  
			// name = "ChangedName";
			  change(name);
		     System.out.println(name);  //GDUTtiantian 不是ChangedName
			
		}
		 public static void change(String name){
			          //修改name的值
			   name = "ChangedName";
		 }
		 
		 
		 @Test
		public void test13() throws Exception {
		 	String s1 = "heima";
			String s2 = "";
			String s3 = null;
			System.out.println(s1.isEmpty());  // false
			System.out.println(s2.isEmpty()); //true
			System.out.println(s3.isEmpty()); //NullPointerException
		}
		 
		@Test
		public void testIndex() throws Exception {
			String s1 = "heima";
			int index = s1.indexOf('e'); //1
			System.out.println(index);
			String s2 = "heima";
			int index2 = s1.indexOf('z'); //-1
			System.out.println(index2);
			String s = "woaiheima";
			s.substring(4);		//subString会产生一个新额字符串,需要将新的字符串记录
			System.out.println(s); //woaiheima
			System.out.println(s.contains("adsadfasddaf"));
			//s.concat(str)
		}
		
		@Test
		public void testSearchSmallStr() throws Exception {
		/*	A:定义一个统计变量，初始化值是0
			B:先在大串中查找一次小串第一次出现的位置
			     a:索引是-1，说明不存在了，就返回统计变量
			     b:索引不是-1，说明存在，统计变量++
			C:把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
			D:回到B*/
			  // 定义大串
	        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
	        // 定义小串
	        String minString = "java";
	        int count = 0;
			 int index;
		        //先查，赋值，判断
		        while((index=maxString.indexOf(minString))!=-1){
					count++;
		            maxString = maxString.substring(index + minString.length());
		        }
		        System.out.println(count);
		}
		@Test
		public void testName() throws Exception {
			String string = "abcde";
			String aString = string.substring(0, 3);
			System.out.println(aString);
		}
		
		@Test
		public void testReplace() throws Exception {
			String newStr1 = "com.jd.".replaceAll("." , "/")+"Myclass.class";
			String newStr2 = "com.jd.".replace('.' , '/')+"Myclass.class";
			System.out.println(newStr1);  //   ///////Myclass.class
			System.out.println(newStr2);  //  com/jd/Myclass.class
			
		}
}

/*
 * java运行时内存分五部分：
　　线程共享：堆内存、方法区（包括常量池）
　　线程私有：栈内存、本地方法栈、程序计数器

string不是基本数据类型，那么一个string的内存位置是什么呢？一共有两种情况：
　　1、string直接赋值：
　　　　String s = "haha";
　　　　s的引用存在栈内存中，引用指向的haha存在方法区的常量池中（先判断常量池中是否有一个haha，存在则直接指向）
　　2、string对象new创建
　　　　String s = new String("haha");
　　　　s的引用存在于栈内存中，引用指向的haha对象，存在堆内存中（每new一次，在堆中创建一个新的haha对象）
总结：
　　1、string类型的引用，都是存在栈内存中的；
　　2、string引用指向，直接赋值存在栈内存，new出来的存在栈内存。
 */
