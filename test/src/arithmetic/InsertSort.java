package arithmetic;
/**  
 * @Description: 直接插入排序
 * @author: liusen
  每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。

对于数组 {3, 5, 2, 4, 1}，它具有以下逆序：(3, 2), (3, 1), (5, 2), (5, 4), (5, 1), (2, 1), (4, 1)，
插入排序每次只能交换相邻元素，令逆序数量减少 1，因此插入排序需要交换的次数为逆序数量。

插入排序的复杂度取决于数组的初始顺序，如果数组已经部分有序了，逆序较少，那么插入排序会很快。

平均情况下插入排序需要 ~N2/4 比较以及 ~N2/4 次交换；
最坏的情况下需要 ~N2/2 比较以及 ~N2/2 次交换，最坏的情况是数组是倒序的；
最好的情况下需要 N-1 次比较和 0 次交换，最好的情况就是数组已经有序了。
 */
public class InsertSort<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		int len = nums.length;
		for (int i = 1; i < len; i++) {
			for (int j = i; j > 0 && less(nums[j],nums[j-1]); j--) {
				swap(nums, j, j-1);
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = { 9, 2, 3, 5, 1,0};
		InsertSort<Integer> bubble = new InsertSort<>();
		bubble.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}

	}

}