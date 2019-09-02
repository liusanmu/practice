package it.ex11_reflect;
/**  
 * @Description: Demo01.java
 * @author: liusen
 * @date:   2019年3月8日 下午3:06:53   
 * @version V2.0
 */
public class Demo01 {
	
	public static void main(String[] args) {
		try {
			Class clazz1 = Class.forName("it.ex11_reflect.Person");
			Class clazz2 = Person.class;
			Person p = new Person();
			Class clazz3 = p.getClass();
			//Class clazz2 = Person.class;
			
			System.out.println(clazz1 == clazz2);  //true
			System.out.println(clazz2 == clazz3);  //true
		} catch (ClassNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
