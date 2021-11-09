package 数学;
/*
 * https://leetcode-cn.com/problems/nim-game/
 * 通过推理，如果是四的倍数，必输！
 */
public class _292_Nim游戏 {
    public boolean canWinNim(int n) {
    	return n%4!=0;
    }
}
