package 字符串;

/**
 * https://leetcode-cn.com/problems/consecutive-characters/
 * 一次遍历，遇到不相等的就比较最大值
 */
public class _1446_连续字符 {
    public int maxPower(String s) {
        int energy=1,max=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                max=Math.max(energy,max);
                energy=0;
            }
            energy++;
        }
        energy=Math.max(max,energy);
        return energy;
    }
}
