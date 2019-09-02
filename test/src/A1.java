/**  
 * @Description: A1.java
 * @author: lsm
 * @date: 2019年1月15日 下午1:08:11   
 */
public class A1 {
	
	public void m1() {
		System.out.println("m1");
	}
	
	public void m2(){
		m1();
		System.out.println("m2");
		m1();
		
	}
	
	public static void main(String[] args) {
		A1 a = new A1();
		a.m2();
	}

}
