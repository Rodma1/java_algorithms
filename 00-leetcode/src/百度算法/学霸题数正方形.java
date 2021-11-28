package 百度算法;

import java.util.Scanner;

/**
 * http://106.12.175.135/contest/5/problem/1062
 */
public class 学霸题数正方形 {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        int num=st.nextInt();
        int[][] data=new int[num][num];
//     循环将0~9个数字填入
        int i=0,j=0,p=num-1,nums=1,n=num;
        if (num%2!=0){
            n=(num+1)/2;
        }else {
            n=n/2;
        }

        while(n>0){
            int k=p;
            while(j<=k){
                data[i][j]=(nums-1)%10;
                nums++;
                j++;
            }
            int z=p;
            i++;
            j--;
            while(i<=z){
                data[i][j]=(nums-1)%10;
                i++;
                nums++;
            }
            i--;
            k=num-p-1;
            while(j>k){
                j--;
                data[i][j]=(nums-1)%10;
                nums++;
            }

            z=num-p-1;
            i--;

            while(i>z){

                data[i][j]=(nums-1)%10;
                i--;
                nums++;
            }
            i++;
            j++;
            p--;
            n--;
        }
        for (int k=0;k<num;k++){
            for (int  x=0;x<num;x++){
                if (x!=num-1){
                    System.out.print(data[k][x]+" ");
                }else{
                    System.out.print(data[k][x]);
                }

            }
            System.out.println();
        }


    }
}
