package it.ex11_reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**  
 * @Description: Demo2.java
 * @author: liusen
 * @date:   2019年3月8日 下午3:13:54   
 * @version V2.0
 */
public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		Juicer j = new Juicer();									//创建榨汁机
		//j.run(new Apple());
		//j.run(new Orange());
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(br.readLine());					//获取该类的字节码文件
		Fruit f = (Fruit) clazz.newInstance();						//创建实例对象
		j.run(f);
	}

}
interface Fruit {
	public void squeeze();
}
class Apple implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯苹果汁儿");
	}
}

class Orange implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯橘子汁儿");
	}
}

class Juicer {
	/*public void run(Apple a) {
		a.squeeze();
	}
	
	public void run(Orange o) {
		o.squeeze();
	}*/
	
	public void run(Fruit f) {
		f.squeeze();
	}
}