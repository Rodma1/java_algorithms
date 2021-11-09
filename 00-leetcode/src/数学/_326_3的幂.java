package 数学;

public class _326_3的幂 {
    public boolean isPowerOfThree(int n) {
//通过while循环判断是否满足除三
        while(n>2&&n%3==0){
            n=n/3;
        }
        if(n==1){
            return true;
        }
        return false;
    }
//    不使用循环，在题目给定的 3232 位有符号整数的范围内，最大的 33 的幂为 3^{19} = 11622614673 
    public boolean isPowerOfThree1(int n) {
    	return n > 0 && 1162261467 % n == 0;
    }
}
