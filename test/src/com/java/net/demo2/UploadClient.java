package com.java.net.demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**  
 * @Description: UploadClient.java
 * @author: liusen
 * @date:   2019年3月18日 上午10:06:10   
 * @version V2.0
 */
public class UploadClient {

	public static void main(String[] args) throws Exception {
		
		//文件输入流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d://404.jpg"));
	    //socket中的文件输出流
		Socket socket = new Socket("localhost",7778);
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] b = new byte[1024];
		int len;
		while((len = bis.read(b))!= -1){
			bos.write(b, 0, len);
			//bos.flush();
		}
		// 关闭输出流,通知服务端,写出数据完毕
           socket.shutdownOutput();
		  System.out.println("文件发送完毕");
	        // 3.释放资源
	      bos.close(); 
	      socket.close();
	      bis.close(); 
	      System.out.println("文件上传完毕 ");
		

	}

}
