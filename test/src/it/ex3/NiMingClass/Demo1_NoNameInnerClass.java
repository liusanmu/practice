package it.ex3.NiMingClass;

class Demo1_NoNameInnerClass {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.method();
	}
}
/*
* A:匿名内部类
	* 就是内部类的简化写法。
* B:前提：存在一个类或者接口
	* 这里的类可以是具体类也可以是抽象类。
* C:格式：
* 
		new 类名或者接口名(){
			重写方法;
		}
* D:本质是什么呢?
	* 是一个继承了该类或者实现了该接口的子类匿名对象。
* E:案例演示
	* 按照要求来一个匿名内部类d
*/

interface Inter1 {
	public void print();
}

class Outer1 {
	class Inner implements Inter1 {
		public void print() {
			System.out.println("print");
		}
	}

	public void method(){
		Inner i = new Inner();
		i.print();
		new Inner().print();
		Inter1 i2 = new Inner();			//父类引用指向子类对象
		
		new Inter1() {
			
			@Override
			public void print() {
				System.out.println("Print");
			}
		}.print();
		
	}
}