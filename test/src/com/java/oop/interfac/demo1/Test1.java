package com.java.oop.interfac.demo1;
/**  
 * @Description: Liveable.java
 * @author: liusen
 * @date:   2019年3月21日 上午9:22:33   
 * @version V2.0
 */
public class Test1 {

	public static void main(String[] args) {
		Animal animal= new Animal();
		//animal.run(); //【错误】无法继承方法,也无法调用
	    // Livable.run     //跑起来
	}
	
}


//jdk1.8生效
interface Livable{
	/*public static void run() {
		System.out.println("跑起来");
	}*/
}

class Animal implements Livable{
	
	
}

