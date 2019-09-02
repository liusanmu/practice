
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**  
 * @Description: PaCong.java
 * @author: liusen
 * @date:   2018年12月21日 下午2:35:59   
 * @version V2.0
 */
public class PaCong {

	 public static  void  main(String[] args) throws IOException {
	       ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 200, 5 ,TimeUnit.SECONDS,
	               new ArrayBlockingQueue<Runnable>(4000));
	       for(int i=3;i<10;i++){
	           MyCrawler crawler=new MyCrawler(i);
	           executor.execute(crawler);
	           System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的线程的数目："+
	                   executor.getQueue().size());
	       }
	       executor.shutdown();
	 }

}
