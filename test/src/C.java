/**
 * @Description: C.java
 * @author: lsm
 * @date: 2018年12月25日 下午2:21:12
 */
public class C {
//	public final static String  aaa;
	public static String  aaa;
	public static void main(String[] args) {
		System.out.println(new C().test());
		System.out.println(aaa);
	}

	static int test() {
		int x = 1;
		try {
			return x;
		} finally {
			++x;
		}
	}
}
