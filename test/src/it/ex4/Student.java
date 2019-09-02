package it.ex4;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
		public static void main(String[] args) {
 
		String a, b, c;
		a = "test";
		b = a;
		c = b;
		String processA = processA(a);
		String processB = processB(b);
		String processC = processC(c);
		System.out.println(processA);
		System.out.println(processB);
		System.out.println(processC);
	}
	
	static String processA(String str){
		return str + "A";
	}
	
	static String processB(String str){
		return str + "B";
	}
	
	static String processC(String str){
		return str + "C";
	}

	
}
