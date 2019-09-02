package arithmetic.test;
/**  
 * @Description: MySort.java
 * @author: liusen
 * @date:   2019年3月29日 下午2:13:31   
 */
public abstract class BaseSort<T extends Comparable<T>> {
	
	public abstract void sort(T[] arr);
	
	public boolean less(T v, T w){
		
		return v.compareTo(w) < 0;
	}
	
	public void swap(T[] a,int i, int j){
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}

/**
 * 排序方法		稳定性	   	   时间复杂度	     	     空间复杂度		   元素最终位置		       	初始影响
         
          直接插入	     Y	              平均：O（n2）基本有序O（n）|	O（1）	              每趟无	                            基本有序较好，适用规模小
          
           希尔			 N	       O(nlog2n)			|	O（1）		 每趟无	                                                无影响
         
          冒泡			 Y		平均：O(n2)最好：O（n）          |	    O（1）     	 每趟有最大或最小       	                   有序时最好
        
          快速			 N		  平均： O（nlog2n） 最差：O(n2)| O（log2n）	每趟有                                          有序时最坏,适用规模大
     
       直接选择	     N	           O（n2）		|		O（1）	            每趟有最大或最小	                     无影响
	 
       堆排序			 N			O（nlog2n）		|		O（1）	           每趟有最大或最小	
	
      归并排序	     Y	         O（nlog2n）		|		O（n）		 每趟无			                         无影响
*/
