package 数学;
/**
 * 滚动数组
 * https://leetcode-cn.com/problems/pascals-triangle-ii/
 * 开头和结尾都是1
 * 下面的数是上面两个数的和
 */

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角_II {
    public List<Integer> getRow(int rowIndex) {
//            定义动态数组
        List<Integer> list=new ArrayList<>();
//        定义开头
        list.add(1);
//        第一层for循环遍历到rowIndex行
        for (int i=1;i<=rowIndex;i++){
//            初始化最后一个元素
            list.add(0);
//            第二层循环遍历到i+1个元素
            for (int j=i;j>0;--j){
                list.set(j,list.get(j)+ list.get(j-1));
            }
        }
        return list;
    }
}
