package arithmetic;

/**
 * @Description: 顺序查找
 * @author: liusen
 * @date: 2019年3月28日 下午3:24:58
 */
public class Search {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int index = binarySearch(arr, 8);
		System.out.println(index);  //7 索引值从0开始de

	}

	//折半查找 
	public static int binarySearch(int[] arr, int key){
		int low, mid, high;
		low = 0;
		high = arr.length - 1;
		while(low < high){
			mid = (high + low) / 2;
			//mid = low + (high - low) * (key - a[low]) / (a[high] - a[low]);
			// 关键字比 折半值 大，则最小下标 调成 折半下标的下一位
			if (key > arr[mid]) {
				low = mid + 1;
			} else if (key < arr[mid]) {
				high = mid - 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	//线性表查询
	public static int sequentialSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}
	//种在查找方向的尽头放置"哨兵"免去了在查找过程中每一次比较后都要判断查找位置是否越界的小技巧，
	//看似与原先差别不大，但在总数据较多时，效率提高很大，是非常好的编码技巧。当然，"哨兵"也不一定就一定要在数组开始，也可以在末端。
	//对于这种顺序查找算法来说，查找成功最好的情况就是在第一个位置就找到了，算法时间复杂度为O(1)，
	//最坏的情况是在最后一位置才找到，需要n次比较，时间复杂度为O(n)，当查找不成功时，需要n+1次比较，时间复杂度为O(n)。我们之前推导过，关键字在任何一位置的概率是相同的，所以平均查找次数为(n+1)/2 ，所以最终时间复杂度还是O(n)。
	//，顺序查找技术是有很大缺点的，n很大时，查找效率极为低下，不过优点也是有的，这个算法非常简单，
	//对静态查找表的记录没有任何要求，在一些小型数据的查找时，是可以适用的。
	
	public static int sequentialSearch2(int[] a, int key) {
		
		int index = a.length - 1;
		a[0] = key;// 将下标为0的数组元素设置为哨兵
		while (a[index] != key) {
			index--;
		}
		return index;
		
		
		
	}

}
