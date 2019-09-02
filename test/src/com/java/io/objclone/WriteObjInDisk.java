package com.java.io.objclone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Description: WriteObjInDisk.java
 * @author: liusen
 * @date: 2019年4月2日 下午2:43:59
 * 按照流的方向：输入流（inputStream）和输出流（outputStream）。
        按照实现功能分：节点流（可以从或向一个特定的地方（节点）读写数据。如 FileReader）和处理流      
        按照处理数据的单位： 字节流和字符流。字节流继承于 InputStream 和 OutputStream，字符流继承于
InputStreamReader 和OutputStreamWriter。

 */
public class WriteObjInDisk {

	public static void write() throws IOException, ClassNotFoundException {
		// 对象输出流
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream(new File("D://obj")));
		objectOutputStream.writeObject(new User(100,"zhangsan"));
		objectOutputStream.close();

		// 对象输入流
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream(new File("D://obj")));
		User user = (User) objectInputStream.readObject();
		System.out.println(user);
		objectInputStream.close();
	}
	
	public static void main(String[] args) {
		try {
			write();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int no;
	private String name;
	
	public User() {
		super();
	}
	public User(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
	
}
