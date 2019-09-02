package com.se.enumdemo;
/**  
 * @Description: EnumDemo1.java
 * @author: liusen
 * @date:   2019年3月19日 下午4:47:07   
 * @version V2.0
 */
public enum EnumDemo1 {
	
	 RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
	 
	 private String name;
	 private Integer index;
	 
	private EnumDemo1(String name, Integer index) {
		this.name = name;
		this.index = index;
	}
	public String getName() {
		return name;
	}
	/*public void setNameString(String name) {
		this.name = name;
	}*/
	public Integer getIndex() {
		return index;
	}
	/*public void setIndex(Integer index) {
		this.index = index;
	}*/
	
	public static void main(String[] args) {
		System.out.println(EnumDemo1.RED);
		/*System.out.println(EnumDemo1.RED.getName());
		System.out.println(EnumDemo1.RED.getIndex());
		
		for (EnumDemo1 color : EnumDemo1.values()) {
			System.out.println(color.getName()+":"+color.getIndex());
		}*/
	}
	 
}
