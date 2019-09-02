package arithmetic.test;

import arithmetic.SelectSort;

/**  
 * @Description: Selected.java
 * @author: liusen
 * @date:   2019年3月29日 下午4:23:58   
 * 在待排序列找出最小（大）元素，并将该元素放在序列的最前（后）面。
 * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。
 * 再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。不断进行这样的操作，直到将整个数组排序。
 * 4,6,3,1,8,2
 */
public class Selected<T extends Comparable<T>> extends BaseSort<T> {

	@Override
	public void sort(T[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i+1; j < n; j++) {
				//当遇到前面的大于后面的就将指针移到小的上面去
				if (less(arr[j],arr[min])) {
					min = j;
				}
				swap(arr, i, min);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] a = { 9, 2, 3, 5, 1,0};
		// sort(a);
		// System.out.println(a.toString());
		Selected<Integer> bubble = new Selected<>();
		bubble.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}

	}

}
