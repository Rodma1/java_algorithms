package com.chengyunzhi;



public class 堆排序 {
	static int headSize=0;
	static int[] array= {3,44,38,5,47,15,36};
//	记录堆里面还有多少个数据
	public static void sort() {
//		原地建堆
		headSize=array.length;//堆原始大小
		
//		for循环遍历数组元素建堆，效率较高O(n),这里使用了右移运算符移动1位，相当于除于二
//		headSize>>1=3 除法：7/2=3  二进制:111右移1位变成011=3,所以堆的高度只有3，遍历三次就行了
		for(int i=(headSize >>1)-1;i>=0;i--) {
			siftDown(i);
		}
//		通过while循环遍历堆,由于我们要将堆顶元素一一取出来,
		//所以循环终止条件就是剩下最后一个元素的时候
		
		while(headSize>1) {//(nlogn)
			System.out.print(array[0]+"_");//47_44_38_36_15_5_
//			交换堆顶和尾部元素
			int temp=array[--headSize];
			
			array[headSize]=array[0];//array[0]是堆里面最大的数
			array[0]=temp;
//			然后堆0位置进行siftDown(就是从新排列，恢复堆的性质)
			siftDown(0);//(logn)
			
			
		}
//		在输出最后一个数3,   47_44_38_36_15_5_3
		System.out.println(array[0]);
	}
//			原地建堆
	public static  void siftDown(int index) {
//		获取元素
		Integer element=array[index];
//		System.out.print(element);
		int half =headSize>>1;
//		
		while(index<half) {//index必须是非叶子结点
			//默认是左边跟父节点比,index <<1 左移一位加1(0左移一位还是0)
			int childIndex=(index <<1 )+1;
//			获取左节点childIndex元素
			Integer child=array[childIndex];
//			定义右节点
			int rightIndex=childIndex +1;
			//如果右子节点的下标还没有超过数组长度，右子节点比左子节点大，那么说明左右子树成立成立
			if (rightIndex<headSize&& array[rightIndex]-child>0) {
//				左右结点交换，因为默认是左边跟父节点比
				child=array[childIndex=rightIndex];
			}
//			如果根节点大于等于子节点
			if (element-child>=0) {
				break;
			}
//			如果不大于,那么就要交换调整堆顶元素是最大的
			array[index]=child;
			index=childIndex;
		}
//		先存放非叶子结点，也就是最后面的值headSize>>1
		array[index]=element;
	}
	public static void main(String[] args) {
		sort();
	}


	
}
