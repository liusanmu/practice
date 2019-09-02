package com.java.oop.interfac.demo1;
/**  
 * @Description: 细雨飘 清风摇 凭借痴心般情长
				   皓雪落 黄河浊 任由他绝情心伤
 * @author: liusen
 * @date:   2019年3月21日 上午9:31:26   
 * @version V2.0
 */
public interface InterfacA {
	   void run();
    // 抽象方法
	//默认方法
	// 静态方法
	//私有方法

//默认方法：使用  default 修饰，不可省略，供子类调用或者子类重写。
//public default void method(){}  jdk 1.8

//静态方法：使用  static 修饰，供接口直接调用。
//public static void methods(){} //jdk1.8

//私有方法：使用  private 修饰，供接口中的默认方法或者静态方法调用。jdk1.9
//private void method(){}
	 /*  接口中，无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用 public static final修饰。
	   接口中，没有构造方法，不能创建对象。
	   接口中，没有静态代码块。*/
	// //  子接口重写默认方法时，default关键字可以保留。
	//   子类重写默认方法时，default关键字不可以保留。
	   
	 /*  
	   向上转型 ：多态本身是子类类型向父类类型向上转换的过程，这个过程是默认的。
	   当父类引用指向一个子类对象时，便是向上转型。
	   父类类型  变量名 = new 子类类型();
              如：Animal a = new Cat();
	   使用格式：
	   向下转型
	   向下转型 ：父类类型向子类类型向下转换的过程，这个过程是强制的。
	           showDogEat(d);
	           
	           以上两个方法, 均可以被showAnimalEat(Animal a)方法所替代
	           而执行效果一致
	           
	           showAnimalEat(c);
	           showAnimalEat(d);
	       }
	       public static void showCatEat (Cat c){
	           c.eat();
	       }
	       public static void showDogEat (Dog d){
	           d.eat();
	       }
	       public static void showAnimalEat (Animal a){
	           a.eat();
	       }
	   }
	   父类类型  变量名 = new 子类类型();
	   如：Animal a = new Cat();
	   一个已经向上转型的子类对象，将父类引用转为子类引用，可以使用强制类型转换的格式，便是向下转型。
	   使用格式：
	   为什么要转型
	   当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误。也就是说，不能调用子类拥
	   有，而父类没有的方法。编译都错误，更别说运行了。这也是多态给我们带来的一点"小麻烦"。所以，想要调用子
	   类特有的方法，必须做向下转型。
	   
	 */
	   
	   /**
	    * 在Java 9+版本中，接口的内容可以有：

1. 成员变量其实是常量，格式：
[public] [static] [final] 数据类型 常量名称 = 数据值;
注意：
	常量必须进行赋值，而且一旦赋值不能改变。
	常量名称完全大写，用下划线进行分隔。

2. 接口中最重要的就是抽象方法，格式：
[public] [abstract] 返回值类型 方法名称(参数列表);
注意：实现类必须覆盖重写接口所有的抽象方法，除非实现类是抽象类。

3. 从Java 8开始，接口里允许定义默认方法，格式：
[public] default 返回值类型 方法名称(参数列表) { 方法体 }
注意：默认方法也可以被覆盖重写

4. 从Java 8开始，接口里允许定义静态方法，格式：
[public] static 返回值类型 方法名称(参数列表) { 方法体 }
注意：应该通过接口名称进行调用，不能通过实现类对象调用接口静态方法

5. 从Java 9开始，接口里允许定义私有很乏，格式：
普通私有方法：private 返回值类型 方法名称(参数列表) { 方法体 }
静态私有方法：private static 返回值类型 方法名称(参数列表) { 方法体 }
注意：private的方法只有接口自己才能调用，不能被实现类或别人使用。
	    */
}
