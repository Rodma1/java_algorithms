package 递归;

public class 剑指_Offer_10I_斐波那契数列 {
    public int fib(int n) {
//如果小于等于1直接返回就行0，1
    	if (n<=1) {
			return n;
		}
//    	定义
    	int sum=0,first=0,second=1;
//    	通过for循环遍历
    	for(int i=0;i<n-1;i++) {
//    		答案需要取余数
    		sum=(first+second)%1000000007;
    		first=second;
    		second=sum;
    	}
//    	最后输出
    	return sum;
    }
}
