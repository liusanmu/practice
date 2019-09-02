package test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**  
 * @Description: CalendarTest.java
 * @author: lsm
 * @date: 2019年2月19日 下午1:26:14   
 */
public class CalendarTest {
	
	// 获取时间
	@Test
	public void test1() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
	    // 赋值时年月日时分秒常用的6个值，注意月份下标从0开始，所以取月份要+1
	    System.out.println("年:" + cal.get(Calendar.YEAR));
	    System.out.println("月:" + (cal.get(Calendar.MONTH) + 1));       
	    System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
	    System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
	    System.out.println("分:" + cal.get(Calendar.MINUTE));
	    System.out.println("秒:" + cal.get(Calendar.SECOND));
	
		
	}
	
	// 设置时间
	@Test
	public void test2() throws Exception {
		 Calendar cal = Calendar.getInstance();
		    // 如果想设置为某个日期，可以一次设置年月日时分秒，由于月份下标从0开始赋值月份要-1
		    // cal.set(year, month, date, hourOfDay, minute, second);
		    cal.set(2018, 1, 15, 23, 59, 59);
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    System.out.println(sdf.format(cal.getTime()));
		    
		 // 或者6个字段分别进行设置，由于月份下标从0开始赋值月份要-1
		    cal.set(Calendar.YEAR, 2017);
		    cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		    cal.set(Calendar.DAY_OF_MONTH, 15);
		    cal.set(Calendar.HOUR_OF_DAY, 23);
		    cal.set(Calendar.MINUTE, 59);
		    cal.set(Calendar.SECOND, 57);
		    System.out.println(sdf.format(cal.getTime()));
		
	}
	
	/**
	 * 获取一天的获取当天的结束时间
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTimeInMillis()));
		//2019-02-21 23:59:59
	}
	
	/**
	 * 获取一天的开始时间
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTimeInMillis()));
		
		//2019-02-21 00:00:00
	}
	
	@Test
	public void test5() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_MONTH,1);
		calendar.add(Calendar.MONTH, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTimeInMillis()));
	}
	
	@Test
	public void test6() throws Exception {
		//String value = String.valueOf(System.currentTimeMillis());
		//方法 二
		//String value = String.valueOf(Calendar.getInstance().getTimeInMillis());
		//方法 三
		//String value = String.valueOf(new Date().getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String value = df.format(new Date().getTime());// new Date()为获取当前系统时间，也可使用当前时间戳
		String valueTmp = value.toString().replaceAll("\\s*00:00:00.*", "");
		System.out.println(valueTmp);
	}


}
