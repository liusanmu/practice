package it.ex3.NiMingClass;

class Test2_NoNameInnerClass {
	public static void main(String[] args) {
		//Outer.method().show();			//链式编程,每次调用方法后还能继续调用方法,证明调用方法返回的是对象
		Inter i = Outer.method();
		i.show();
	}
}
//按照要求，补齐代码
interface Inter { 
	void show(); 
}

class Outer { 
	public static Inter method(){
		
		return new Inter() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("HelloWord");
			}
		};
		
	}
}

//要求在控制台输出”HelloWorld”
//补齐代码 
	/*public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("show");
			}
		};
	}*/