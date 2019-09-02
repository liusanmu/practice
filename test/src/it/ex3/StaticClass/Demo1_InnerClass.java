package it.ex3.StaticClass;

class Demo1_InnerClass {
	public static void main(String[] args) {
		//外部类名.内部类名 对象名 = 外部类名.内部类对象;
		Outer2.Inner oi = new Outer2.Inner();
		oi.method(); //method

		Outer2.Inner2.print(); //print
	}
}

class Outer2 {
	static class Inner {
		public void method() {
			System.out.println("method");
		}
	}

	static class Inner2 {
		public static void print() {
			System.out.println("print");
		}
	}
}