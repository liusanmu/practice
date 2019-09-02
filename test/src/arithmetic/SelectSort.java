package arithmetic;

/**
 * @Description: SelectSort.java
 * @author: liusen
 * @date: 2019年3月28日 上午11:17:30 选择出数组中的最小元素，将它与数组的第一个元素交换位置。
 * 再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。不断进行这样的操作，直到将整个数组排序。
 * 选择排序			不稳定			N2()时时间复杂度				1	空间复杂度
 */
public class SelectSort<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {
		int len = nums.length;
		for (int i = 0; i < len ; i++) {
			int min = i;
			for (int j = i + 1; j < len; j++) {
				if (less(nums[j], nums[min])) {
					min = j;
				}
			}
			swap(nums, i, min);
		}
	}

	public static void main(String[] args) {
		Integer[] a = { 9, 2, 3, 5, 1,0};
		// sort(a);
		// System.out.println(a.toString());
		SelectSort<Integer> bubble = new SelectSort<>();
		bubble.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}

	}

}
