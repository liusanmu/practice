package arithmetic.test;

/**
 * @Description: Bubble.java
 * @author: liusen
 * @date: 2019年3月29日 下午2:52:25 
 * 5,3,6,8,6 
 * 3,5,6,6,8
 * 
 */
public class Bubble<T extends Comparable<T>> extends BaseSort<T> {

	@Override
	public void sort(T[] arr) {
		int n = arr.length;
		boolean hasSorted = false;
		for (int i = n - 1; i > 0 && !hasSorted; i--) {
			hasSorted = true;
			for (int j = 0; j < i; j++) {
				if (less(arr[j + 1], arr[j])) {
					swap(arr, j, j + 1);
				}
			}

		}

	}

	public static void main(String[] args) {
		Integer[] a = { 9, 2, 3, 5, 6, 6 };
		// sort(a);
		// System.out.println(a.toString());
		Bubble<Integer> bubble = new Bubble<>();
		bubble.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}
	}

}
