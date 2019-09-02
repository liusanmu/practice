package com.java.oop.extend;
/**  
 * @Description: 普通代码块每次新建对象都会执行一边，， 静态代码块只会在在类初始化时加载一次
 * @author: liusen
 * @date:   2019年4月19日 下午1:36:04   
 */
class A {
    public A() {
        System.out.println("class A");
    }
    { System.out.println("I'm A class"); } 
    static { System.out.println("class A static"); }
}
public class B extends A {
    public B() {
        System.out.println("class B");
    }
    { System.out.println("I'm B class"); }
    static { System.out.println("class B static"); }
    
    public static void main(String[] args) { 
	 new B(); 
	 new B();
 }
}