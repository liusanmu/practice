package it.ex0_obj;
/**  
 * 子类的构造方法总是先调用父类的构造方法，
 * 如果子类的构造方法没有明显地指明使用父类的哪个构造方法，那么子类就调用父类不带参数的构造方法。
       而父类没有无参的构造函数，所以子类需要在自己的构造函数中显示的调用父类的构造函数。
 */
class Person {
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String id) {
    	super(id);//-----------------------------去留两结果
        empID = id;
    }
}
public class Test1 {
    public static void main(String args[]) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}

