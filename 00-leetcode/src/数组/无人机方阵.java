package 数组;

import java.util.HashMap;

public class 无人机方阵 {
    public int minimumSwitchingTimes(int[][] source, int[][] target) {
    	int num=0;
//通过哈希表解决问题
    	HashMap< Integer, Integer> map=new HashMap<>();
    	for(int i=0;i<source.length;i++) {
    		for(int sou:source[i]) {
    			map.put(sou, map.getOrDefault(sou, 0)+1);
    		}
    	}
//    	在通过遍历target比较map
    	for(int i=0;i<source.length;i++) {
    		for(int sou:target[i]) {
    			map.put(sou, map.getOrDefault(sou, 0)-1);
    			if (map.get(sou)<0) {
					num++;
				}

    		}
    	}
    	return num;
    }
}
