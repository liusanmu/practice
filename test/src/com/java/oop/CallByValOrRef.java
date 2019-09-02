package com.java.oop;
/**  
 *1.
String和char数组都是引用类型，引用类型是传地址的，会影响原变量的值，但是string是特殊引用类型，
为什么呢？因为string类型的值是不可变的，为了考虑一些内存，安全等综合原因，把它设置成不可变的;
 不可变是怎么实现的？Java在内存中专门为string开辟了一个字符串常量池，用来锁定数据不被篡改，
 所以题目中函数中的str变量和原来的str已经不是一个东西了，
它是一个局部引用，指向一个testok的字符串，随着函数结束，它也就什么都没了，但是char数组是会改变原值的

2.
1.为什么string字符串的值是不可变的？当我们new一个字符串，给它赋值之后，
那么当前对象的值就固定了，永远不会改变。比如String str=new String("test")，那么str的值就是test，
这是因为在String源码当中是用char数组来按顺序存储字符串中的每一个字符的，并且这个char数组是用final修饰的，
这意味着一旦我们给字符串赋值之后，这个对象的值就永远不会改变。
2.可是当我们在一个类当中的某个方法里面，给这个对象str赋值了一个新的字符串，它这时候的值是多少呢？比如这时str="good"，str的值就是good，
(你可以在这个方法里面写输出语句，输出这个引用，就知道怎么回事了)可不是说引用的值不可以改变么？这里改变的不是引用的值
，而是引用str指向的常量不一样了而已，而这个引用的生命周期和当前方法的一样的，也就是方法结束，
引用被杀死，也结束了，那么它刚才指向good的这个引用，
就结束了，所以在这个方法结束之后，再输出引用str的值，自然就是引用str之前指向的值了，也就是test。
 */

public class CallByValOrRef {

	String str = new String("hello");
	char[] ch = {'a','b','c'};
	public static void main(String[] args) {
		CallByValOrRef cvf = new CallByValOrRef();
		cvf.change(cvf.str, cvf.ch);
		System.out.println(cvf.str);
		System.out.println(cvf.ch);
	}
	
	public void change(String str, char ch[] ) {
		str = "test Ok";
		ch[0] = 'g';
	}

}
