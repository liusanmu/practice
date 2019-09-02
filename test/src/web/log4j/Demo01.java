package web.log4j;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.junit.Test;

/**  
 * @Description: Demo01.java
 * @author: liusen
 * @date:   2019年3月21日 下午2:55:32   
 * @version V2.0
 */
public class Demo01 {
	private static Logger logger = Logger.getLogger(Demo01.class);
	public static void main(String[] args) throws IOException {
		//logger.addAppender(new ConsoleAppender(new SimpleLayout()));
		logger.addAppender(new FileAppender(new SimpleLayout(), "a.log", true));
		logger.setLevel(Level.INFO);
		int a = 1;
		if (a==1) {
			logger.info("sfasfsad");
		}
		String id = "123";
		String symbol = "456";
		//logger.debug("Processing trade with id: {} and symbol : {} ", id, symbol);
		logger.debug("调试");
		logger.info("信息");
		logger.warn("警告");
		logger.error("错误");
		logger.fatal("大错");

	}
	
	@Test
	public void testName() throws Exception  {
		Properties properties = new Properties();
		//properties.
		InputStream stream = Demo01.class.getClassLoader().getResourceAsStream("aa.properties");
		properties.load(stream);
		String a1 = properties.getProperty("class_path");
		System.out.println(a1);
		
		/*BufferedReader br = new BufferedReader(new FileReader("classpath:aa.properties"));
		properties.load(br);
		String a2 = properties.getProperty("bob");
		System.out.println(a2);*/
		
		/*ResourceBundle bundle = ResourceBundle.getBundle("aa");
		String str = bundle.getString("bob");
		System.out.println(str);*/
	
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql//127.0.0.1:3306/aaa","root","root");
		 Statement stmt = con.createStatement();
		 ResultSet rs = stmt.executeQuery("select * from aa");
		 PreparedStatement  pstm =  con.prepareStatement("select * from user where id=?");
		 pstm.setInt(1, 20);
		 ResultSet rs1 = pstm.executeQuery();
		 while(rs.next()){
			 String s1 = rs.getString(1);
			 String s2 = rs.getString(2);
		 }
		 rs.close();
		 pstm.close();
		 con.close();
		 
		 
		
	}

}
