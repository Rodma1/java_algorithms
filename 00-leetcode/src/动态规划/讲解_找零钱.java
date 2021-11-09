package 动态规划;

public class 讲解_找零钱 {
	public static void main(String args[]) {
		System.out.println(coins(41));
		System.out.print(coins2(21));
	}
//	暴力递归,自顶向下，面临了重叠子问题
	static int coins(int n) {
//		如果相减为负数就返回最大值，相当于这个不能比较
		if (n<1) {
			return Integer.MAX_VALUE;
		}
//		如果n等于给定的硬币数就加一
		if (n==25||n==20||n==5||n==1) {
			return 1;
		}
//		比较取出最接近n的值，硬币数加一
		return Math.min(Math.min(coins(n-25), coins(n-20)),Math.min(coins(n-5), coins(n-1)))+1;
	}
//	递归（自底向上）
	static int coins2(int n) {
//		如果n小于1就返回
		if (n<1) {
			return -1;
		}
//		定义数组
		int[] dp=new int[n+1];
		for(int i=1;i<=n;i++) {
//			设置最小值,数组初始化是0
			int min=dp[i-1];
			if(i>=5) min=Math.min(dp[i-5], min);
			if (i>=20) {
				min=Math.min(dp[i-20],min);
			}
			if (i>=25) {
				min=Math.min(dp[i-25], min);
			}
			dp[i]=min+1;
		}
		for(int d:dp) {
			System.out.print(d+"_");
		}
		return dp[n];
	}
	
}
