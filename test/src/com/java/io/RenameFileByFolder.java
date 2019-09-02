package com.java.io;

import java.io.File;


/**  
 * @Description: RenameFileByFolder.java
 * @author: liusen
 * @date:   2019年3月12日 下午5:36:35   
 * @version V2.0
 */
public class RenameFileByFolder {

	public static void main(String[] args) {
		//readFile("");

	}
	
	
	public static void readFile(String dir){
		File file = new File(dir);
		
		File[] list = file.listFiles();
		
		for (File f : list) {
			if (f.isFile()) {
				String fileName = f.getName();
				System.out.println(fileName);
				File parentPath = f.getParentFile();
				if (fileName.contains("【十次方禁广告闲聊讨论群863676367】")) {
					String newName = fileName.replaceAll("【十次方禁广告闲聊讨论群863676367】","");//新名字
					File newDir = new File(parentPath + "/" + newName);//文件所在文件夹路径+新文件名
					 f.renameTo(newDir);//重命名
					 System.out.println("修改后：" + newDir);
				}
			}
			if (f.isDirectory()) {
				String dirName = f.getName();
				System.out.println(dirName);
				
			}
		}
		
		
		
	}

}
