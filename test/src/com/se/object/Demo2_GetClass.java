package  com.se.object;
public class Demo2_GetClass {

	public static void main(String[] args) {
		Student s = new Student("����", 23);
		// Class clazz = new Class();

		Class clazz = s.getClass();
		String name = clazz.getName();
		System.out.println(name);
	}
}
