package it.ex0_obj;
/**  
 * @Description: Test2.java
 * @author: liusen
 * @date:   2019年3月12日 下午9:33:13   
 * @version V2.0
 */
public class Test2 {
    private static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();
                } else {
                    System.out.print(i);
                }
            } finally {
                System.out.print("e");
            }
        }
    }
 
    public static void main(String[]args) {
        try {
            test(new int[] {0, 1, 2, 3, 4, 5});
        } catch (Exception e) {
            System.out.print("E");
           // e.printStackTrace();
        }
    }
 
}