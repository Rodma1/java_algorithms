package 数学;
/*
 * https://leetcode-cn.com/problems/number-complement/
 */
public class _476_数字的补数 {
    public int findComplement(int num) {
        int i=1;
        while(i<num){
             i=i*2+1;
        }
        return num^i;
    }
}
