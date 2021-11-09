package 哈希表;

import java.util.Collection;
import java.util.HashMap;

public class _5868_可互换矩形的组数 {
    public long interchangeableRectangles(int[][] rectangles) {
    	long sum=0;
    	double[] res=new double[rectangles.length];
//    	for(int i=0;i<rectangles.length;i++) {
//    		res[i]=rectangles[i][0]/rectangles[i][1];
//    	}
////    	通过双指针比较
//    	int left=0,right=1;
//    	while(right<rectangles.length) {
//    		while(right<rectangles.length) {
//    			if (res[left]==res[right++]) {
//					sum++;
//				}    			
//    		}
//    		left++;
//    		right=left+1;
//    	}
//    	return sum;
    	
//    	通过哈希统计相同字符的次数,再通过公式n(n+1)/2进行统计
    	HashMap<Double,Long> map=new HashMap<>();
        int j=0;
//        for循环统计,然后将的宽高比存入数组中,为接下来取出哈希中的值
    	for(int i=0;i<rectangles.length;i++) {
    		double s=(double)rectangles[i][0]/rectangles[i][1];
//            去重，免得多余的数存入数组
    		if (!map.containsKey(s)) {
    			res[j]=s;
                j++;
			}
//    		每存入一个相同数就加一
    		map.put(s, map.getOrDefault(s, (long)0)+1);
    		
    	}
    	int i=0;
    	while(!map.isEmpty()) {
            // System.out.println(res[i]);
//    		如果指定的数组存在与哈希中
    		if (map.containsKey(res[i]) ){
//    			获取值
    			long s=map.get(res[i])-1;
//    			如果相同的宽高比大于0就说明至少有1次可互换矩形
    			if (s>0) {
//    				在通过公式获取可互换矩形数
    				sum+=s*(s+1)/2;
				}
//    			将对应的值去除
				map.remove(res[i]);
			}
    		i++;
    	}
    	return sum;
    }
}
