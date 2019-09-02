package  com.se.object;

public class Demo1_HashCode {

	public static void main(String[] args) {
		Object object = new Object();
		int hashCode = object.hashCode();
		System.out.println(hashCode);

		Student s1 = new Student("13", 23);
		Student s2 = new Student("13", 23);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
