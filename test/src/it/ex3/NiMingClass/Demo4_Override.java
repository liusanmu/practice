package it.ex3.NiMingClass;

class Demo4_Override {
	public static void main(String[] args) {
		
	}
}

class Person1 {
	public void print() {
		System.out.println("Person");
	}
}

class Student1 extends Person1 {
	public void print() {
		System.out.println("Student");
	}
}

class Father { 
	public Person1 method() {
		return new Person1();
	}
}

class Son extends Father {
	public Student1 method() {
		return new Student1();
	}
}

