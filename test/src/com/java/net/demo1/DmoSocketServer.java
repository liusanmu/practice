package com.java.net.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**  
 * @Description: DmoSocketServer.java
 * @author: liusen
 * @date:   2019年3月18日 上午9:41:59   
 * @version V2.0
 */
public class DmoSocketServer {
	
	public static void main(String[] args) throws IOException {
		System.out.println("服务端启动 , 等待连接 .... ");
	        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
		ServerSocket serverSocket = new ServerSocket(7777);
		//获取Socket对象
		Socket socket = serverSocket.accept();
		//3.通过Socket获取输入流
		InputStream is = socket.getInputStream();
		//4.一次行读取数据
		//4.1 穿件字节数组
		byte[] b = new byte[1024];
		//4.2  据读取到字节数组中.
		int line = is.read(b);
		System.out.println(line);
		System.out.println(b);
		//4.3 解析数组，打印字符
		String msg = new String(b, 0, line);
		System.out.println(msg);
		//5.关闭资源
		is.close();
		socket.close();
		
		
		
	}

}
