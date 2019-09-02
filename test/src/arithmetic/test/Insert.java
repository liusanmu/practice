package arithmetic.test;


/**  
 * @Description: Insert.java
 * @author: liusen
 * @date:   2019年3月29日 下午3:51:03   
 * 5,6,1,2,9,8,4
 * 
 * 每趟将一个待排元素插入到前面已排好序的一组元素的适当位置上，直到元素全部插入为止。
 * 假设元素放在data[1..n], 其中data[1..i-1]是已排好序的元素，data[i..n]是未排序的元素，把data[i]插入到data[1..i-1]中，使得data[1..i]有序，data[i]的插入过程就是完成插入排序中的一趟。

 */
public class Insert<T extends Comparable<T>> extends BaseSort<T> {

	@Override
	public void sort(T[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 && less(arr[j], arr[j-1]) ; j--) {
				swap(arr, j, j-1);
				/*if (less(arr[j], arr[j-1])) {
					swap(arr, j, j-1);
				}*/
			}
		}
		
	}

	public static void main(String[] args) {
		Integer[] a = {9, 2,3,5,6,65,1};
		// sort(a);
		// System.out.println(a.toString());
		Insert<Integer> bubble = new Insert<>();
		bubble.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}
	}
}


