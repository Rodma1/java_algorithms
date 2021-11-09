package 数组;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 心算挑战 {
	static int index=1;
	static PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
    public static  int maxmiumScore(int[] cards, int cnt) {
//    	if (cards.length==1) {
//			if (cards[0]%2==0) {
//				return cards[0];
//			}
//			else {
//				return 0;
//			}
//		}
//    	int sum=0;
//    	int max=0;
//    	先排列
//    	Arrays.sort(cards);
//        int ct = 0;
//        if (index>cnt) {
//			return 0; 
//		}
//        for (int i = index; i <= cards.length - cnt + 1; i++) {
//            ;
//            dfs(i + 1, , lists, list, k - 1);
//            list.remove(list.size() - 1);
//        }
//    	return sum;
    	return 0;
    }
    public static void main(String args[]) {
    	int[] cards= {1,2,8,9,2,4,6};
    	int cnt=3;
    	int sum=maxmiumScore(cards, cnt);
    	System.out.print(sum);
    }
}
