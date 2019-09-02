package com.java.io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;




/**
 * 
 * @Description: aa.java
 * @author: liusen
 * @date: 2018年12月19日 上午11:35:52
 * @version V2.0
 */
public class CopyFile {
	public static void main(String[] args) {
		File srcFile = new File("C:\\Users\\lsm\\Pictures\\bizhi\\地方和风景");    //这里填源文件夹路径
	//	srcFile.setExecutable(true);//设置可执行权限   
		//srcFile.setReadable(true);//设置可读权限   
		//srcFile.setWritable(true);//设置可写权限  
		copyFolder(srcFile);
	}
	
	public static void copyFolder(File srcFile) {
		File[] ff = srcFile.listFiles();
		for (File f : ff) {
			if (f.isDirectory()) {
			copyFolder(f);
			//System.out.println(f.get);
			}else {
				
				 copyFile(f);
				 System.out.println(f.getName());
			}
		}
	}
	
	public static void copyFile(File srcFile)  {
		File destFile = new File("C:\\Users\\lsm\\Pictures\\bizhi",srcFile.getName());
		/*destFile.setExecutable(true);//设置可执行权限   
		destFile.setReadable(true);//设置可读权限   
		destFile.setWritable(true);//设置可写权限  
*/		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			 bis = new BufferedInputStream(new FileInputStream(srcFile));
			 bos = new BufferedOutputStream(new FileOutputStream(destFile));
			 byte[] b = new byte[1024];
			 int len = 0;
			 try {
				while((len = bis.read(b)) != -1){
					 bos.write(b, 0, len);
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
}