package utils;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

/**  
 * @Description: C.java
 * @author: liusen
 * @date:   2019年3月15日 上午11:12:36   
 * @version V2.0
 */
public class C {

	public C(String name) {
		// TODO Auto-generated constructor stub
		//this.name = name;
	}

	/*	Java语言中一个显著的特点就是引入了垃圾回收机制，它使得Java程序员在编写程序的时候不再需要考虑内存管理。
	由于有个垃圾回收机制，Java中的对象不再有“作用域”的概念，只有对象的引用才有“作用域”。
	垃圾回收可以有效的防止内存泄露，有效的使用可以使用的内存。垃圾回收器通常是作为一个单独的低级别的线程运行，
	不可预知的情况下对内存堆中已经死亡的或者长时间没有使用的对象进行清楚和回收，
	程序员不能实时的调用垃圾回收器对某个对象或所有对象进行垃圾回收。回收机制有分代复制垃圾回收和标记垃圾回收，
	增量垃圾回收。*/
	void doSomething () {
		final String s = "";
		int l = s.length();
		}

	@Test
	public void testName() throws Exception {
		ArrayList<String> list = new ArrayList<>();
		list.add("add");
		list.add("del");
		list.add("del");
            for(int i=0;i<list.size();i++){
		    if(list.get(i).equals("del"))
		        list.remove(i);
		}
		
		
		/*for(String x:list){
		    if(x.equals("del"))
		        list.remove(x);
		}*/


	}

}
