package com.java.designpattern.strategy;
/**  
 * @Description: StrategyTest.java
 * @author: lsm
 * @date: 2019年1月5日 上午10:20:29   
 */
public class StrategyTest {

	public static void main(String[] args) {
		Environment environment = new Environment(new AddCalculator());
		//Environment environment = new Environment(new SubtractCalculator());
		System.out.println(environment.calulate(15, 10));
	}
}

/**
 * 定义抽象对象策略
 *
 */
interface ICalculator{
	
	public int calc(int num1, int num2);
}

/**
定义加策略角色
*/
class AddCalculator implements ICalculator{

	@Override
	public int calc(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
}

/**
定义减略角色
*/
class SubtractCalculator implements ICalculator{

	@Override
	public int calc(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
}

/**
 * 定义环境
 * @author lsm
 *
 */
class Environment{
	private ICalculator calculator;

	public Environment(ICalculator calculator) {
		this.calculator = calculator;
	}
	
	public int calulate(int num1, int num2){
		return calculator.calc(num1, num2);
		
	}
	
}