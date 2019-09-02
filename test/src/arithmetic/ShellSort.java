package arithmetic;
/**  
 * @Description: ShellSort.java
 * @author: liusen
 * 希尔排序的运行时间达不到平方级别，使用递增序列 1, 4, 13, 40, ... 的希尔排序所需要的比较次数不会超过 N (数组长度)的若干倍
 * 乘于递增序列的长度。后面介绍的高级排序算法只会比希尔排序快两倍左右。
 */
public class ShellSort<T extends Comparable<T>> extends Sort<T> {

	// len=3 h<1  h = 1    len= 4 h< 1 h = 1    len=6   h<2  h=3*1+1=4 
	@Override
	public void sort(T[] nums) {
		int len = nums.length;
		int h =1;
		while(h < len / 3){
			h = 3 * h + 1;  //1 4 13 40
		}
		//,从h=1开始计算这次计算出的h作为下次步长h,知道h大于要排序的数的个数。
		//如有120个数，当h=40时，h=40*3+1=121>120,则最终步长为40。则每次步长为（40,13,4,1）
		// 1   2   3   4  5  6 
	    while(h >= 1){
	    	for (int i = 1; i < len; i++) {
	    		for (int j = i; j > h && less(nums[j], nums[j-h]); j--) {
	    			swap(nums, j, j-h);
	    		}
		}
			
			h = h / 3;
		}
		
	}

	

	public static void main(String[] args) {
		Integer[] a = { 9, 2, 3, 5, 1,0,15,85,2,3,1,9,52,66,1,5};
		// sort(a);
		// System.out.println(a.toString());
		SelectSort<Integer> bubble = new SelectSort<>();
		bubble.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}
		
		
	}

}
