package com.java.designpattern.decorator.demo01;
/**  
 * @Description: NewPerson.java
 * @author: lsm
 * @date: 2019年1月5日 上午10:05:59   
 */
public class NewPerson implements Person {

	private OldPerson oldPerson;
	
	public NewPerson(OldPerson p) {
		this.oldPerson = p;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("做饭");
		oldPerson.eat();
	}
	
	public static void main(String[] args) { 
	    OldPerson old = new OldPerson(); 
	    //old.eat(); 
	    NewPerson np = new NewPerson(old); 
	    np.eat(); 
	  } 


}
