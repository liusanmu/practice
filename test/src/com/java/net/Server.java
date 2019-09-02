package com.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.net.ssl.SSLContext;

/**  
 * @Description: Server.java
 * @author: liusen
 * @date:   2018年12月12日 下午6:31:41   
 */
public class Server {
	//创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
	//ServerSocket ss;
	public Server()  {
		try {
			ServerSocket ss = new ServerSocket(12345);
			while(true){
				Socket socket = ss.accept();
				String ip = socket.getInetAddress().getHostAddress();
				String port = ":"+socket.getLocalPort();
				System.out.println(ip+port);
				BufferedReader in = new BufferedReader(
						new InputStreamReader(socket.getInputStream())
						);
			   String line = in.readLine();
			   System.out.println("client:" + line);
			   PrintWriter out =  new PrintWriter(socket.getOutputStream());
			   out.println("Your Message Received!");
			   out.close();
			   in.close();
			   socket.close();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Server();

	}

}
