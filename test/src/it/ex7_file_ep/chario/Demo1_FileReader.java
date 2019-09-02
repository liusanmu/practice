package it.ex7_file_ep.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class Demo1_FileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileReader fr = new FileReader("xxx.txt");
		int c;
		
		while((c = fr.read()) != -1) {					//ͨ����ĿĬ�ϵ����һ�ζ�ȡһ���ַ�
			System.out.print((char)c);
		}
		
		fr.close();
	}

	@Test
	public void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("aaa.txt");
		int x = fr.read();
		System.out.println(x);
		char c = (char)x;
		System.out.println(c);
		fr.close();
	}

}
