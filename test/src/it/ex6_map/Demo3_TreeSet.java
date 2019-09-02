package it.ex6_map;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class Demo3_TreeSet {

	/**
	 * @param args
	 * TreeSet集合是用来对象元素进行排序的,同样他也可以保证元素的唯一
	 * 当compareTo方法返回0的时候集合中只有一个元素
	 * 当compareTo方法返回正数的时候集合会怎么存就怎么取
	 * 当compareTo方法返回负数的时候集合会倒序存储
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//需求:将字符串按照长度排序
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());		//Comparator c = new CompareByLen();
		ts.add("aaaaaaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("nba");
		ts.add("cba");
		
		System.out.println(ts);
	}

	@Test
	public  void demo4() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 13));
		ts.add(new Person("wangwu", 33));
		ts.add(new Person("zhaoliu", 43));
		ts.add(new Person("aaaa", 53));
		// Person [name=aaaa, age=53], Person [name=lisi, age=13], Person [name=wangwu, age=33], Person [name=zhaoliu, age=43], Person [name=zhangsan, age=23]]
		System.out.println(ts);
	}
	@Test
	public  void demo3() {
		TreeSet<Person> ts = new TreeSet<>(/*new Comparator<Person>() {
		
			@Override
			public int compare(Person o1, Person o2) {
				int n = o1.getAge()-o2.getAge();
				return n == 0 ? o1.compareTo(o2): n;
			}
		} 按照年纪排序，年纪相同按名称排序 
		[Person [name=李四, age=13], Person [name=张三, age=23], Person [name=赵六, age=33], Person [name=王五, age=43]]
		*/);
		ts.add(new Person("李四", 13));
		ts.add(new Person("张三", 23));
		ts.add(new Person("王五", 43));
		ts.add(new Person("赵六", 33));
		
		System.out.println('张' + 0);
		System.out.println('李' + 0);
		System.out.println('王' + 0);
		System.out.println('赵' + 0);
		/*24352
		26446     	原始排序
		29579     [Person [name=张三, age=23], Person [name=李四, age=13], Person [name=王五, age=43], Person [name=赵六, age=33]]
		36213*/
		System.out.println(ts);
	}

	@Test
	public void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三", 23));
		ts.add(new Person("李四", 13));
		ts.add(new Person("周七", 13));
		ts.add(new Person("王五", 43));
		ts.add(new Person("赵六", 33));
		
		System.out.println(ts);
	}

	@Test
	public  void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(2);
		ts.add(3);
		ts.add(3);
		
		System.out.println(ts); // 1 2 3 
	}

}


class CompareByLen /*extends Object*/ implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {		//按照字符串的长度比较
		int num = s1.length() - s2.length();		//长度为主要条件
		return num == 0 ? s1.compareTo(s2) : num;	//内容为次要条件
	}
	
}