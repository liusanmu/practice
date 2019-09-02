package com.java.a;

class Base {
	Base() {
		System.out.println("Base");
	}
}

public class Alpha extends Base {
	
	public Alpha() {
		// TODO Auto-generated constructor stub
		System.out.println("alpha");
	}
	public static void main(String[] args) {
		//new Alpha(); // 调用父类无参的构造方法
		//new Base();
	/*	&运算符有两种用法：(1)按位与；(2)逻辑与。
		&&运算符是短路与运算。逻辑与跟短路与的差别是非常巨大的，虽然二者都要求运算符左右两端的布尔值都是
		true 整个表达式的值才是 true。
		&&之所以称为短路运算是因为，如果&&左边的表达式的值是 false，右边的表达式会被直接短路掉，不会进行
		运算。很多时候我们可能都需要用&&而不是&，例如在验证用户登录时判定用户名不是 null 而且不是空字符串，应
		当写为 username != null &&!username.equals("")，二者的顺序不能交换，更不能用&运算符，因为第一个条件如
		果不成立，根本不能进行字符串的 equals 比较，否则会产生 NullPointerException 异常。注意：逻辑或运算符（|）
		和短路或运算符（||）的差别也是如此。*/
		System.out.println(4&7);
		long temp = (int)3.9;
		System.err.println(temp);
		///temp %= 2;
		//System.err.println(temp);
		int a[][] = new int[10][10];
		//System.out.println(a.toString());
		// int[] ia = new int [15]; 
		// float fa = new float [20]; 
		 //char[] ca = "Some String"; 
		 int ia1 [][] = {{1,1},{2,2}};
		 for (int i = 0; i < 10; i++) {
			if(i==8){
				break;
			}
			System.out.println(i);
		}

	}
	
}
