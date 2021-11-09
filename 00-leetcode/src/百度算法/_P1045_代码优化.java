package 百度算法;

import java.util.Scanner;

public class _P1045_代码优化 {
	static int mod = 1000000007;
	static int n;
	static int ans = 0;
	static int[] a;
	public static void dfs(int k, int max) {
	    if (k == n + 1) {
	        ans = (ans + max) % mod;
	        return;
	    }
	    for (int i = 1; i <= a[k]; ++i) {
	        dfs(k + 1, i > max ? i : max);
	    }
	}

	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
	    n=scanner.nextInt();
	    System.out.println("输入");
	    a=new int[n+1];
	    for (int i = 1; i <= n; ++i) {
	        a[i]=scanner.nextInt();
	    }
	    dfs(1, 0);
	    System.out.println(ans);
	    return;
	}
}
