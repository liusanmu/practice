package com.java.io.objclone;

import java.io.Serializable;
/**  
 * @Description: Car.java
 * @author: liusen
 * @date:   2019年4月2日 下午1:43:00   
 */
public class Car implements Serializable {
	private static final long serialVersionUID = -5713945027627603702L;
	private String brand; // 品牌
	private int maxSpeed; // 最高时速
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, int maxSpeed) {
		super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}
	
}