package arithmetic;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * @Description: NormalQuickSort.java
 * @author: liusen
 * @date: 2019年3月28日 下午2:31:25
 * https://www.jianshu.com/p/5f38dd54b11f
 * 所以，数据越随机分布时，快速排序性能越好；数据越接近有序，快速排序性能越差。
 */
public class NormalQuickSort {
	// 3,5,4,1,2  _,5,4,1,2   2,5,4,1,_     2,_,4,1,5   2,1,4,_,5   2,1,_,4,5    2,1,3,4,5
	public static void main(String[] args) {
		 	int[] arr = {3,5,4,1,2};
	        quickSort(arr, 0, arr.length - 1);
	        System.out.println("排序后:");
	        for (int i : arr) {
	            System.out.print(i+"   ");
	        }
	
	}
	public static void quickSort(int[] arr, int low, int high) {
		// 左下标一定小于右下标，否则就越界了
		 if (low >= high) return; 
		//if (low < high) {
	    	 // 找寻基准数据的正确索引
            int index = getIndex(arr, low, high);
            System.out.println("index = "+index);
            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            quickSort(arr, 0, index - 1);
            quickSort(arr, index + 1, high);

	    //}
	    
	    
	}
	
	private static int getIndex(int[] arr, int low, int high) {

		int tmp = arr[low];
		while (low < high) {

			// 从序列右端开始，向左遍历，直到找到小于基准数据tmp的数
			while (low < high && tmp < arr[high]  ) {
				high--;
			}
			//  找到了比tmp小的元素，将这个元素放到tmp的位置
			arr[low] = arr[high];

			// 从序列左端开始，向右遍历，直到找到大于tmp的数
			while (low < high && tmp > arr[low]  ) {
				low++;
			}
			// 找到了比tmp大的元素，将这个元素放到arr[high]的位置（此时arr[high]的值在arr[low]，自己为空）
			arr[high] = arr[low];
		}
		
		// 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
		// 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
		arr[low] = tmp;
	    // 返回tmp的正确位置
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("temp=" + tmp);
		return low;

	}
}
