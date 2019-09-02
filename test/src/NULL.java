/**  
 * @Description: NULL.java
 * @author: lsm
 * @date: 2018年12月30日 上午11:10:28   
 */
public class NULL {

    public static void haha(){
        System.out.println("haha");
    }
    public  void haha1(){
        System.out.println("baba");
    }
 
    
    public static void main(String[] args) {
        ((NULL)null).haha();
        NULL null1 = new NULL();
        null1.haha1();
        NULL null2 = null;
        null2.haha();
        
    }
/**
 * 因为null值可以强制转换为任何java类类型,(String)null也是合法的。但null强制转换后是无效对象
 * ，其返回值还是为null，而static方法的调用是和类名绑定的，不借助对象进行访问所以能正确输出。
 * 反过来，没有static修饰就只能用对象进行访问，使用null调用对象肯定会报空指针错了。这里和C++很类似。 
 */
}