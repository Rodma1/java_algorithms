package 冒泡;

import javax.swing.text.AbstractDocument.BranchElement;

public class _01_冒泡 {
	public static void main(String[] args) {
		int[] array= {3,44,38,5,47,15,36};
// 遍历完后将最后一个数排除继续遍历
		
		for(int end=array.length;end>0;end--) {
////			设置boolean判断
//			boolean sorted=true;
			int sortIndex=1;
//			从前往后比较
			for(int begin=1;begin<end;begin++) {
	//			如果后面的数小于前面的数就交换
				if (array[begin]<array[begin-1]) {
					int temp=array[begin];
	//				将后面的数变成前面的数
					array[begin]=array[begin-1];
	//				前面的数变成后面的数
					array[begin-1]=temp;
//					sorted=false;
//					记录最后一次交换的位置
					sortIndex=begin;
				}
			}
			end=sortIndex;
//			如果sorted不为是false就直接返回
//			if (sorted) break;
		}
		for(int c:array) {
			System.out.print(c+",");
		}
			
	}
}
