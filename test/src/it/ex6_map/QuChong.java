package it.ex6_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**  
 * @Description: QuChong.java
 * @author: liusen
 * @date:   2019年3月6日 上午9:53:55   
 * @version V2.0
 */
public class QuChong {
	
	//产生集合
	private static ArrayList genList(){
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		return list;
		
	}
	
	//方法一
	/**
	 * 1,创建新集合
	 * 2,根据传入的集合(老集合)获取迭代器
	 * 3,遍历老集合
	 * 4,通过新集合判断是否包含老集合中的元素,如果包含就不添加,如果不包含就添加
	 */
	public static ArrayList removeRepeat(ArrayList list){
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if (!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		return newList;
		
	}
	
	//利用Set去重
	public static ArrayList removeRepeat2(ArrayList list){
		LinkedHashSet lhs = new LinkedHashSet();
		//HashSet lhs = new HashSet();   //用HashSet取出就无序了
		lhs.addAll(list);
		list.clear();
		list.addAll(lhs);
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList list = genList();
		ArrayList removeList = removeRepeat(list);
		System.out.println(removeList.toString());
		//-------------------------------------
		//ArrayList list = genList();
		ArrayList removeList2 = removeRepeat2(list);
		System.out.println(removeList2.toString());

	}

}
