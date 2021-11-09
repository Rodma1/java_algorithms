package 排序;
/*
 * https://leetcode-cn.com/problems/sub-sort-lcci/
 *从左向右遍历，逐渐变大,如果当前元素比它之前的最大的元素小，说明不是升序的，更新n为当前元素索引，继续遍历直到末尾
 *从右向左遍历，逐渐变小，如果当前元素比它之后的最小的元素大，说明不是降序的，更新m为当前元素索引，继续遍历直到开始
 */
public class 面试题_16_16_部分排序 {
    public int[] subSort(int[] array) {
    	int m=-1;
    	int n=-1;
    	int[] res=new int[2];
//    	如果array的长度小于1那么就不需要排序了
    	if (array.length>1) {
	//    	定义最小值和最大值
	    	int max=array[0],min=array[array.length-1];
	//    	定义指针
	    	int left=1,right=array.length-2;
	//    	通过while循环遍历每一个值
	    	while(left<array.length){
	//    		右向左,min获取最小值,比较其左边是否有比他大的值，如果有就赋值下标给m
	    		
	    		if (array[right]>min) {
	    			m=right;
				}else {
					min=array[right];
					
				}
	//    		左向右，max获取最大值，比较其右边是否有比他小的值，如果有就赋值其下标给n
	    		if (array[left]<max) {
	    			n=left;
				}else {
					max=array[left];
				}
	
	    		right--;
	    		left++;
			}
    	}
    	
    	res[0]=m;
    	res[1]=n;
    	return res;
    }
}
