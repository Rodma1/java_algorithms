package 数组;

import java.util.ArrayList;
import java.util.List;

public class _118_杨辉三角 {
//	通过上一个列表相邻的两个数相加得到新的列表
    public static List<List<Integer>> generate(int numRows) {
//    	构建一个列表
    	List<List<Integer>> res=new ArrayList<List<Integer>>();
//    	通过for循环遍历列表
    	for(int i=0;i<numRows;i++) {
    		List<Integer> list=new ArrayList<>();
    		for(int j=0;j<=i;j++) {
//    			给第一个和最后一个数组添加1
    			if (j==0||j==i) {
					list.add(1);
				}
//    			剩下的就是获取res前一个列表中相邻的值结合来存入
    			else {
					list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
				}
    		}
//    		将单列表存入
    		res.add(list);
    		System.out.print(list);
    	}
    	return res;
    }
    public static void main(String args[]) {
    	System.out.print(1);
		generate(5);
	}
}
