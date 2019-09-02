package com.java.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**  
 * @Description: ObserverTest.java
 * @author: lsm
 * @date: 2019年1月5日 上午11:16:59   
 */
public class ObserverTest {

	//测试
    public static void main(String[] args) {
        //创建观察者
        IObserver observerA =new ObserverTest(). new ObserverA();
        IObserver observerB = new ObserverTest().new ObserverB();
        IObserver observerC =new ObserverTest(). new ObserverC();
        //创建被观察者
        SubjectA subjectA =new ObserverTest(). new SubjectA(); 
        subjectA.observer.add(observerA);
        subjectA.observer.add(observerB);
        subjectA.observer.add(observerC);
        subjectA.update();      
    }
    
 //--------------------------内部类，内部接口   
  //抽象观察者
    interface IObserver{
    	
    	public void say();
    	
    }

    //具体观察者A
    class ObserverA implements IObserver{

    	@Override
    	public void say() {
    		System.out.println("A收到了变化");
    		
    	}
    	
    }
    //具体观察者B
    class ObserverB implements IObserver{

    	@Override
    	public void say() {
    		System.out.println("B收到了变化");
    		
    	}
    	
    }
    //具体观察者C
    class ObserverC implements IObserver{
        @Override
        public void say() {
            System.out.println("C收到了变化");            
        }
    }
    //抽象被观察者
    interface ISubject{
        public void update();
    }

    class SubjectA implements ISubject{
    	  public List<IObserver> observer = new ArrayList<IObserver>(); 
    	@Override
    	public void update() {
    		 for (IObserver model : observer) {
                 model.say();
             }           
    	}
    } 

}

