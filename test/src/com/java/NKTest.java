package com.java;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * @Description: NKTest.java
 * @author: liusen
 * @date:   2019年2月25日 下午5:27:26   
 * @version V2.0
 */
public class NKTest {
	
	@Test
	  public void testByt()
	    {
	        Byte a = 127;
	        Byte b = 127;
	        add(++a);
	        System.out.print(a + " "); //-128
	        add(b);
	        System.out.print(b + "");  //127
	    }
	public void add(Byte b){  b = b++;}
	
	
	@Test
	public void testInc() throws Exception {
		NKTest inc = new NKTest();  
	       int i = 0;  
	       inc.fermin(i);  
	       i= i ++;  
	       System.out.println(i);   // 0s
	}
	void fermin(int i){   i++;   }
	@Test
	public void testIntge() throws Exception {
		Integer i01=59;
		int i02=59;
		Integer i03=Integer.valueOf(59);
		Integer i04=new Integer(59);
		System.out.println(i01==i02); //true
		System.out.println(i01==i04);  //false
		System.out.println(i02==i03);   //true
		System.out.println(i03==i04);   //false
		System.out.println(i02==i04);   //true
	}
	
	
	@Test
	public void test10() throws Exception {
		String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
     /*   false
        true
        false
        true
        false*/


	}
	
	@Test
	public void testName() throws Exception {
		 Integer a = new Integer(3);

	        Integer b = 3; // 将3自动装箱成Integer类型，new一个Integer对象
	        Integer c = 3; // 如果整型字面量的值在-128到127之间，那么不会new新的Integer对象，而是直接引用常量池中的Integer对象

	        int d = 3;

	        Integer e = 200;
	        Integer f = 200;

	        System.out.println(a == b); // a和b是不同对象的引用，返回false
	        System.out.println(b == c); // 3在-128到127之间，故c装箱时不再new对象，b和c指向同一个对象，返回true
	        System.out.println(b == d); // 自动拆箱，基本类型的比较，返回true
	        System.out.println(e == f); // 200不在-128到127之间，故e和f分别指向不同的对象，返回false
	}
	
	public static void main(String[] args) {
 
		StringBuffer a, b, c;
		a = new StringBuffer("test"); //test
		b = a;  //b=test
		c = b;  //test
		String processA = processA(a);
		String processB = processB(b);
		String processC = processC(c);
		System.out.println(processA);
		System.out.println(processB);
		System.out.println(processC);
	}
	
	static String processA(StringBuffer str){
		return str.append("A").toString(); //testA
	}
	
	static String processB(StringBuffer str){
		return str.append("B").toString(); //testAB
	}
	
	static String processC(StringBuffer str){
		return str.append("C").toString();//testABC
	}


	@Test
	public void teset1() throws Exception {
		byte b1=1,b2=2,b3,b6,b8;
		final byte b4=4,b5=6,b7;
	//	b3=(b1+b2);  /*语句1*/
		b6=b4+b5;    /*语句2*/
		//b8=(b1+b4);  /*语句3*/
		//b7=(b2+b5);  /*语句4*/
		//System.out.println(b3+b6);
	}
	
	@Test
	public void test2() throws Exception {
		final A a1 = new A();
		//a1 = new B();
	}
	////
	String str=new String("tarena");
    char[]ch={'a','b','c'};
	@Test
	public void test3() throws Exception {
		NKTest ex = new NKTest();
		 ex.change(ex.str,ex.ch);
	        System.out.print(ex.str+" and ");
	        System.out.print(ex.ch);
	}
	public void change(String str,char ch[]){
		   //引用类型变量，传递的是地址，属于引用传递。
		        str="test ok";
		        ch[0]='g';
		    }
	///////
}

class A{}
class B extends A{}