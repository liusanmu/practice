package arithmetic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**  
 * @Description: 快速排序
 * @author: liusen
 * @date:   2019年3月28日 上午10:52:58   
 * 快速排序是最快的通用排序算法，它的内循环的指令很少，而且它还能利用缓存，
 * 因为它总是顺序地访问数据。它的运行时间近似为 ~cNlogN，这里的 c 比其它线性对数级别的排序算法都要小
 * 快速排序			不稳定			NlogN（时间）		logN（空间）	
 */
public  class QuickSort<T extends Comparable<T>> extends Sort<T> {
	/*
		4.1 切换到插入排序
		因为快速排序在小数组中也会递归调用自己，对于小数组，插入排序比快速排序的性能更好，
		因此在小数组中可以切换到插入排序。
		
		4.2 三数取中
		最好的情况下是每次都能取数组的中位数作为切分元素，但是计算中位数的代价很高。一种折中方法是取 3 个元素，
		并将大小居中的元素作为切分元素。
		
		4.3 三向切分
		三向切分快速排序对于有大量重复元素的随机数组可以在线性时间内完成排序
	 */
	
	 @Override
	    public void sort(T[] nums) {
	        shuffle(nums);
	        sort(nums, 0, nums.length - 1);
	    }

	    private void sort(T[] nums, int l, int h) {
	        if (h <= l)
	            return;
	        int j = partition(nums, l, h);
	        sort(nums, l, j - 1);
	        sort(nums, j + 1, h);
	    }

	    private void shuffle(T[] nums) {
	        List<T> list = Arrays.asList(nums);
	        Collections.shuffle(list);
	        list.toArray(nums);
	    }
	private int partition(T[] nums, int l, int h) {
	    int i = l, j = h + 1;
	    T v = nums[l];
	    while (true) {
	        while (less(nums[++i], v) && i != h) ;
	        while (less(v, nums[--j]) && j != l) ;
	        if (i >= j)
	            break;
	        swap(nums, i, j);
	    }
	    swap(nums, l, j);
	    return j;
	}
	
	public static void main(String[] args) {
		Integer[] a = { 9, 2, 3, 5, 1,0};
		QuickSort<Integer> quickSort = new QuickSort<>();
		quickSort.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}

	}

}
