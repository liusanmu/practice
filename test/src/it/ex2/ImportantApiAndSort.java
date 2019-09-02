package it.ex2;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * @Description: ImportantApiAndSort.java
 * @author: liusen
 * @date:   2019年3月5日 下午3:44:45   
 * @version V2.0
 */
public class ImportantApiAndSort {

	 /*A:StringBuffer的添加功能
	* public StringBuffer append(String str):
		* 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
	* public StringBuffer insert(int offset,String str):
		* 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
	StringBuffer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是一个长度为16的字符数组
	当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符*/
	@Test
	public void test01() throws Exception {
		StringBuffer sb = new StringBuffer("abcde");
		System.out.println(sb.capacity());  //21  字符串的length + 初始容量
	}
	
	@Test
	public void test2() throws Exception {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		//StringBuffer类中重写了toString方法,显示的是对象中的属性值
		System.out.println(sb.toString());		
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}
	
	@Test
	public void test3() throws Exception {
		//StringIndexOutOfBoundsException 字符串索引越界
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3, "heima");						//在指定位置添加元素,如果没有指定位置的索引就会报索引越界异常
		System.out.println(sb);
	}
	
	/**
	 * * A:StringBuffer的删除功能
		* public StringBuffer deleteCharAt(int index):
			* 删除指定位置的字符，并返回本身
		* public StringBuffer delete(int start,int end):
			* 删除从指定位置开始指定位置结束的内容，并返回本身
	 */
	@Test
	public void test4() throws Exception {
		StringBuffer sb = new StringBuffer();
		//sb.deleteCharAt(5);					//当缓冲区中这个索引上没有元素的时候就会报StringIndexOutOfBoundsException
		sb.append("heima666");
		//sb.deleteCharAt(4);					    //根据索引删除掉索引位置上对应的字符
		sb.delete(0, 2);						//删除的时候是包含头,不包含尾
		//System.out.println(sb);
		//sb.delete(0, sb.length());				//清空缓冲区
		//System.out.println(sb);
		
		//sb = new StringBuffer();				//不要用这种方式清空缓冲区,原来的会变成垃圾,浪费内存
		System.out.println(sb);
	}
	
	/**
	 * * A:StringBuffer的替换功能
			* public StringBuffer replace(int start,int end,String str):
				* 从start开始到end用str替换
		* B:StringBuffer的反转功能
			* public StringBuffer reverse():
				* 字符串反转
	 */
	@Test
	public void tesst5() throws Exception {
		StringBuffer sb = new StringBuffer("我爱总复习");
		//sb.replace(0, 3, "bai");					//替换
		//System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
	
		/**
		 * * A:StringBuffer的截取功能
			* public String substring(int start):
				* 从指定位置截取到末尾
			* public String substring(int start,int end):
				* 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
		* B:注意事项
			* 注意:返回值类型不再是StringBuffer本身
		 */
		@Test
		public void test6() throws Exception{
		StringBuffer sb = new StringBuffer("woaiheima");
		//String str = sb.substring(4);
		//System.out.println(str);
		
		//System.out.println(sb);
		
		String str3 = sb.substring(4, 7);
		System.out.println(str3);
	}
		

		/**
		 * * A:String -- StringBuffer
			* a:通过构造方法
			* b:通过append()方法
		* B:StringBuffer -- String
			* a:通过构造方法
			* b:通过toString()方法
			* c:通过subString(0,length);

		 */

		/**
		 * * A:形式参数问题
				* String作为参数传递
				* StringBuffer作为参数传递 
			* B:案例演示
				* String和StringBuffer分别作为参数传递问题
				* 
		基本数据类型的值传递,不改变其值
		引用数据类型的值传递,改变其值
		
		String类虽然是引用数据类型,但是他当作参数传递时和基本数据类型是一样的
		 */
		public static void main(String[] args) {
			String s = "heima";
			System.out.println(s);
			change(s);
			System.out.println(s);
			
			System.out.println("---------------------");
			StringBuffer sb = new StringBuffer();
			sb.append("heima");
			System.out.println(sb);
			change(sb);
			System.out.println(sb);
		}

		public static void change(StringBuffer sb) {
			sb.append("itcast");
		}

		public static void change(String s) {
			s += "itcast";
		}


}
