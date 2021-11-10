package 动态规划;

import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;

public class 青蛙跳台阶问题 {

    //        创建一个hash
    private static  Map<Integer,Integer> tempMap=new HashMap<>();
    public static void main(String[] args) {
        System.out.println(numWays(4));
        System.out.println(numWays1(20));
    }
//    递归方法：数量太大会超时
    private static int numWays(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return numWays(n-1) + numWays(n-2);
    }

//    因为有重复的数,我们通过哈希解决
     static int numWays1(int n){

//        0也算一种
        if (n==0){
            return 1;
        }
//        如果小于2就直接返回结果
        if (n<=2){
            return  n;
        }
//        先判断有没有计算过，看看备忘录里面有没有
        if (tempMap.containsKey(n)){
//            如果有就返回，值
            return tempMap.get(n);
        }else{
//            否则就继续计算
            tempMap.put(n,(numWays1(n-1)+numWays1(n-2)));
            return tempMap.get(n);
        }
    }
    /**
     * 动态规划解决复杂度为o(1)
     * f(n-1)和f(n-2) 称为 f(n) 的最优子结构
     * f(n)= f（n-1）+f（n-2）就称为状态转移方程
     * f(1) = 1, f(2) = 2 就是边界啦
     * 比如f(10)= f(9)+f(8),f(9) = f(8) + f(7) ,f(8)就是重叠子问题。
     */
    static int numWays2(int n){
//        如果n小于1那么久返回1
        if (n<=1){
            return 1;
        }
//        如果等于2，就返回2
        if (n<=2){
            return 2;
        }
        int a=1;
        int b=2;
        int temp=0;
        for (int i=3;i<n;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return temp;
    }
}
