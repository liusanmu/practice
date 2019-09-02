package arithmetic;

/**
 * @Description: 冒泡排序
 * @author: liusen
 *  从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
 *  在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {
		// 判断进入循环的次数 
		int count = 0;
		int len = nums.length;
		boolean hasSorted = false;
		// 由低到高
		for (int i = len - 1; i > 0 && !hasSorted ; i--) {
			hasSorted = true;
			for (int j = 0; j < i; j++) {
				if (less(nums[j + 1], nums[j])) {
					hasSorted = false;
					swap(nums, j, j + 1);
					
				}
			}
			count++;
		}
		
		System.out.println("==="+count);
		/*if (hasSorted == true) {
			return;
		}*/

	}

	public static void main(String[] args) {
		Integer[] a = {9, 2,3,5,6};
		// sort(a);
		// System.out.println(a.toString());
		BubbleSort<Integer> bubble = new BubbleSort<>();
		bubble.sort(a);
		for (Integer integer : a) {
			System.out.print(integer + " ");
		}

		/*
		 * String[] name=new String[2]; name[0]="human"; name[1]="tree";
		 */
		/*
		 * BubbleSort<String> bubble = new BubbleSort<>();
		 *  String[] arr2 ={"rwre","b","ac","bc","asd","qw"};
		 *   bubble.sort(arr2); for (String
		 * string : arr2) { System.out.println(string); }
		 */

	}

}

/**
举例说明：要排序数组：int[] arr={6,3,8,2,9,1};   

第一趟排序：

　　　　第一次排序：6和3比较，6大于3，交换位置：  3  6  8  2  9  1

　　　　第二次排序：6和8比较，6小于8，不交换位置：3  6  8  2  9  1

　　　　第三次排序：8和2比较，8大于2，交换位置：  3  6  2  8  9  1

　　　　第四次排序：8和9比较，8小于9，不交换位置：3  6  2  8  9  1

　　　　第五次排序：9和1比较：9大于1，交换位置：  3  6  2  8  1  9

　　　　第一趟总共进行了5次比较， 排序结果：      3  6  2  8  1  9

---------------------------------------------------------------------

第二趟排序：

　　　　第一次排序：3和6比较，3小于6，不交换位置：3  6  2  8  1  9

　　　　第二次排序：6和2比较，6大于2，交换位置：  3  2  6  8  1  9

　　　　第三次排序：6和8比较，6大于8，不交换位置：3  2  6  8  1  9

　　　　第四次排序：8和1比较，8大于1，交换位置：  3  2  6  1  8  9

　　　　第二趟总共进行了4次比较， 排序结果：      3  2  6  1  8  9

---------------------------------------------------------------------

第三趟排序：

　　　　第一次排序：3和2比较，3大于2，交换位置：  2  3  6  1  8  9

　　　　第二次排序：3和6比较，3小于6，不交换位置：2  3  6  1  8  9

　　　　第三次排序：6和1比较，6大于1，交换位置：  2  3  1  6  8  9

　　　　第二趟总共进行了3次比较， 排序结果：         2  3  1  6  8  9

---------------------------------------------------------------------

第四趟排序：

　　　　第一次排序：2和3比较，2小于3，不交换位置：2  3  1  6  8  9

　　　　第二次排序：3和1比较，3大于1，交换位置：  2  1  3  6  8  9

　　　　第二趟总共进行了2次比较， 排序结果：        2  1  3  6  8  9

---------------------------------------------------------------------

第五趟排序：

　　　　第一次排序：2和1比较，2大于1，交换位置：  1  2  3  6  8  9

　　　　第二趟总共进行了1次比较， 排序结果：  1  2  3  6  8  9

---------------------------------------------------------------------

最终结果：1  2  3  6  8  9

*/