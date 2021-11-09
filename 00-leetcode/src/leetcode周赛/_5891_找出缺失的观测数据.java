package leetcode周赛;

public class _5891_找出缺失的观测数据 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
    		int[] res=new int[n];
    		
    		int num=0;
    		for(int roll:rolls) {
    			num+=roll;
    		}
    		int avg=(n+rolls.length)*mean;
    		num=avg-num;

    		int j=num/n;
    		if (num<n||j>6) {
				return res;
			}
    		while(n-1>0) {
    			res[n-1]=j;
    			n--;
    		}
    		res[0]=num%4;
    		return res;
    }
}
