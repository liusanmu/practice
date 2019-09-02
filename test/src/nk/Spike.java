package nk;

import static org.junit.Assert.*;

import org.junit.Test;

public class Spike {
	public static void main(String[] args)
    {
        Counter a = new Counter();
        System.out.println(a.increment()); //0
        System.out.println(a.anotherIncrement()); //2
        Counter b = new Counter();
        System.out.println(b.increment()); //2
        System.out.println(b.increment()); //3
    }
}
class Counter
{
    private static int count = 0;
    public int increment()
    {
    	//返回后在自增
        return count++;  // 1  2
    }
    public int anotherIncrement()
    {
        return ++count;
    }
    
    
    @Test
	public void test2() throws Exception {
		
	}
}

/**
 * byte/8 char/16 short/16 int/32 long/64 float32 double/64 boolean/1
 * Bit意为“位”或“比特”，是计算机运算的基础，属于二进制的范畴； 
Byte意为“字节”，是计算机文件大小的基本计算单位； 
换算： 
1 Byte = 8 Bits 
1 KB = 1024 Bytes 
1 MB = 1024 KB 
1 GB = 1024 MB 
Byte简写为B，而bit简写为b；1B=8b； 
一个数字与一个字母都是占1B；一个汉字占两个字节
 */

