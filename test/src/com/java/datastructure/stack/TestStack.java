package com.java.datastructure.stack;
/**  
 * @Description: TestStack.java
 * @author: lsm
 * @date: 2018年12月29日 上午11:26:41   
 */
public class TestStack {

	public static void main(String[] args) throws Exception {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		while (stack.top >= 0) {
			System.out.println(stack.pop());
		}

	}
}

class Stack{
	int[] data;
	int top;
	int maxSize;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		data = new int[maxSize];
		top = -1;
	}
	public boolean push(int data1){
		if (top+1 == maxSize) {
			System.out.println("沾满了");
			return false;	
		}
		this.data[++top] = data1;
		return true;
		
	}
	public int pop() throws Exception{
		if (top == -1) {
			throw new Exception("栈空了");
		}
		return data[top--];
		
	}
	
}