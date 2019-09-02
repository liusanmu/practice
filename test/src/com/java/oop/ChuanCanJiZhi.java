package com.java.oop;
/**  
 * @Description: ChuanCanJiZhi.java
 * @author: lsm https://www.cnblogs.com/yamito/p/6663956.html
 * @date: 2018年12月30日 上午11:17:53   
 */
public class ChuanCanJiZhi {
	/*String str = new String("你好  ");
    char[] ch = { 'w','o','l','l','d' };*/
	public static void main(String[] args) {
		//String str = new String("你好  ");
		String str = "您好";
	    char[] ch = { 'w','o','l','l','d' };
		ChuanCanJiZhi c = new ChuanCanJiZhi();
		c.change(str,ch);
		System.out.println(str+" "+ch[0]);

	}
	
	public void change(String str, char[] ch){
		str = "hello";
		ch[0] = 'X';
	}

}
//：因为在java里没有引用传递，只有值传递
//这个值指的是实参的地址的拷贝，得到这个拷贝地址后，你可以通过它修改这个地址的内容（引用不变）
//，因为此时这个内容的地址和原地址是同一地址，
//但是你不能改变这个地址本身使其重新引用其它的对象，也就是值传递
