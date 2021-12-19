package 数组;

import java.util.HashSet;

public class _997_找到小镇的法官 {
    public static int findJudge(int n, int[][] trust) {
        int[] in = new int[n + 1], out = new int[n + 1];
        for (int[] t : trust) {
            int a = t[0], b = t[1];
            in[b]++; out[a]++;
        }
        for (int i = 1; i <= n; i++) {
            if (in[i] == n - 1 && out[i] == 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] trust={{1,2},{2,3}};
        int n=3;
        int a=findJudge(n,trust);
        System.out.println(a);
    }
}
