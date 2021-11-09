package 阿里云周赛;

public class 最长公共子序列 {
    public static int longestCommonSubsequence(int[] P, int[] Q, int k) {
        int m = P.length, n = Q.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int c1 = P[i - 1];
            for (int j = 1; j <= n; j++) {
                int c2 = Q[j - 1];
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        if (dp[m][n]<P.length&&k!=0) {
        	dp[m][n]++;
        	k--;
		}
        return dp[m][n];

    }
    public static void main(String args[]) {
    	int[] P= {1, 2, 3, 4, 5};
    	int[] Q= {5, 3, 1, 4, 2};
    	int i=longestCommonSubsequence(P, Q,2);
    	System.out.print(i);
    }
}
