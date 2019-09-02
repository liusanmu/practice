package com.java.net.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**  
 * @Description: DmoeSocket.java
 * @author: liusen
 * @date:   2019年3月18日 上午9:41:02   
 * @version V2.0
 */
public class DemoSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1.创建 Socket ( ip , port ) , 确定连接到哪里.
		Socket socket = new Socket("127.0.0.1", 7777);
		OutputStream os = socket.getOutputStream();
		os.write("hello ,你好！".getBytes());
		//关闭资源
		os.close();
		socket.close();
	
		
		
	}

}
