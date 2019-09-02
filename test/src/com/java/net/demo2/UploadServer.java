package com.java.net.demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;



/**  
 * @Description: UploadServer.java
 * @author: liusen
 * @date:   2019年3月18日 上午10:05:58   
 * @version V2.0
 */
public class UploadServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7778);
		while (true) {
			final Socket socket = ss.accept();
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedInputStream bis = null;
					BufferedOutputStream bos = null;
					try {
						//获取输入流
						InputStream is = socket.getInputStream();
						 bis = new BufferedInputStream(is);
						 bos = new BufferedOutputStream(
								new FileOutputStream("d://"
										+ System.currentTimeMillis() + ".jpg"));
						byte[] bytes = new byte[1024];
						int len;
						while ((len = bis.read(bytes)) != -1) {
							bos.write(bytes, 0, len);
						}
						
						System.out.println("上传成功！");
					} catch (Exception e) {
						e.printStackTrace();
					}finally{
						
						try {
							bis.close();
							bos.close();
							socket.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
			}).start();
			
			
		}
		
		

	}

}
