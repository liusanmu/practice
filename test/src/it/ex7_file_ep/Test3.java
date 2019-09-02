package it.ex7_file_ep;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FilenameFilter;

import org.junit.Test;

public class Test3 {
	
	@Test
	public void testName() throws Exception {
		int rec = rec(4);
		System.out.println(rec);
	}
	
	public static int rec(int n) {
		if (n==1) {
			return n;
		}
		return n*rec(n-1);
		
	}

	/**
	 * @param args
	 * * A:案例演示
	 * 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
	 */
	public static void main(String[] args) {
		File dir = new File("D:\\2019-02");
		
		String[] arr1 = dir.list();					//获取e盘下所有的文件或文件夹
		for (String string : arr1) {
			if(string.endsWith(".jpg")) {
				System.out.println(string);
			}
		}
		
		File[] subFiles = dir.listFiles();			//获取e盘下所有的文件或文件夹对象
		
		for (File subFile : subFiles) {
			if(subFile.isFile() && subFile.getName().endsWith(".jpg")) {
				System.out.println(subFile);
			}
		}
		
		String[] arr2 = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//System.out.println(dir);
				//System.out.println(name);
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr2) {
			System.out.println(string);
		}
	}

}
