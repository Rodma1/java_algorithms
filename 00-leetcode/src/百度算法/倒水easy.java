package 百度算法;

import java.util.Arrays;
import java.util.Scanner;

public class 倒水easy {
    public static void main(String[] args) {

        Scanner st=new Scanner(System.in);
//		非负整数的数量和行数
        int j=st.nextInt();
//		元素

        int[] n=new int[j];
        int[] n1=new int[j];
//		输入元素
        for(int i=0;i<j;i++) {
            n[i]=st.nextInt();

        }
        for(int i=0;i<j;i++) {
            n1[i]=st.nextInt();

        }
        int cut=0;
        int sum=0;
        for (int num:n){
            sum+=num;
        }
        Arrays.sort(n1);
        for (int i=j-1;i>=0;i--){
            if (sum>0){
                cut++;
            }
            sum-=n1[i];
        }
        System.out.println(cut);
    }
}
