package 动态规划;

public class _70_爬楼梯 {
    // 动态规划找规律f(0)=1,f(1)=1,f(x)=f(x-1)+f(x-1)
    public int climbStairs(int n) {
        // 定义r=f(0)
        int p=0,q=0,r=1;
        // 循环遍历从f(1)到第f(n)次
        for(int i=1;i<=n;i++){
            p=q;
            // f(0)
            q=r;
            // f(1)=0+f(0)
            r=p+q;
        }
        return r;
    }
}
