package 数组;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntPredicate;
/*
 * https://leetcode-cn.com/problems/the-number-of-weak-characters-in-the-game/
 */
public class _5864_游戏中弱角色的数量 {
    public int numberOfWeakCharacters(int[][] properties) {
//    	//1. 传统写法
//        Arrays.sort(properties, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//    	int people=0;
//    	for(int i=0;i<properties.length;i++) {
//    		int[] b=properties[i];
//    		for(int j=i+1;j<properties.length;j++) {
//    			
//    			int[] c=properties[j];
//    			if (b[0]<c[0]&&b[1]<c[1]) {
//    				people++;
////    				结束循环
//    				break;
//    			}
//    		}
//    		
//    	}
//    	return people;
    	
//    	先排序
    	Arrays.sort(properties,new Comparator<int[]>() {
    		public int compare(int[] o1,int[] o2) {
//    			我们按照攻击多少进行排序,谁越小排在前面
    			if (o1[0]!=o2[0]) {
					return o1[0]-o2[0];
				}
//    			否则两个数相等就根据防御排名,谁越大就排在前面
    			else {

    				return o2[1]-o1[1];
    			}
    		}
		});
        for(int i=0;i<properties.length;i++) {

			System.out.print(properties[i][0]+","+properties[i][1]+"_");
		}
//    	获取长度
    	int len=properties.length;
//    	弱对手数量
    	int people=0;
//    	for循环遍历数组,由于已经排序好了,我们只要比较防御的大小就可以知道前面的数是不是弱角色
    	for(int i=len-1;i>=0;i--) {//这里从后往前遍历,因为要获取最大的防御值
    		int[] left=properties[i];
//    		定义一个defense,为了获取右边的最大防御值
    		int defense=-1;
//    		如果右边的防御值大于左边的防御值，那么左边肯定是弱对手
    		if (defense>left[1]) {
				people++;
			}
//    		然后获取右边最大防御值
    		defense=Math.max(defense, left[1]);
    	}
    	return people;
    }
}
