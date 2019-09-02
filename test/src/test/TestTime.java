package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
 
public class TestTime {
	public static String[][] num0 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", " ", " " }, { "|", " ", "|" }, { " ", "-", " " } };
	public static String[][] num1 = new String[][] { { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " } };
	public static String[][] num2 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " } };
	public static String[][] num3 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
	public static String[][] num4 = new String[][] { { " ", " ", " " }, { "|", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", " ", " " } };
	public static String[][] num5 = new String[][] { { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
	public static String[][] num6 = new String[][] { { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " } };
	public static String[][] num7 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " } };
	public static String[][] num8 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " } };
	public static String[][] num9 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
 
	public static String[][] option = new String[][] { { " ", " ", " " }, { " ", "●", " " }, { " ", " ", " " }, { " ", "●", " " }, { " ", " ", " " } };
	public static String[][][] numAll = new String[][][] { num0, num1, num2, num3, num4, num5, num6, num7, num8, num9 };
	public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
 
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		String[][][] newStr = getDateArray();
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < newStr.length; k++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(newStr[k][i][j]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
 
	public static String[][][] getDateArray() {
		String[][][] dateArray = new String[5][][];
		String dateStr = sdf.format(new Date());
		char[] dateChars = dateStr.toCharArray();
		for (int i = 0; i < dateChars.length; i++) {
			switch (dateChars[i]) {
			case ':':
				dateArray[i] = option;
				break;
			default:
				dateArray[i] = numAll[Integer.valueOf(String.valueOf(dateChars[i]))];
				break;
			}
		}
		return dateArray;
	}
	
	
	@Test
	public void testName() throws Exception {
		 String[][] n = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { "|", " ", "|" }, { " ", "-", " " } };
		String[][] n2 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " } };
		 for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j]);
			}
			System.out.println();
		}
	}
}
