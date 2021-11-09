package leetcode周赛;

public class _5892_石子游戏 {
    public boolean stoneGameIX(int[] stones) {
    	int a=stones.length%2;
    	int sum=0;
    	for(int stone:stones) {
    		sum+=stone;
    	}
    	if (a!=0&&sum%3==0) {
			return false;
		}
    	else if (a==0&&sum%3!=0) {
			return false;
		}
    	return true;
    }
}
