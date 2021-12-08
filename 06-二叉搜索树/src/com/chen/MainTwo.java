package com.chen;
import com.chen.dao.Visitor;
import com.chen.dao.comparator;
public class MainTwo {
    public static void main(String[] args) {
//        BinarySearchTreeTwo<Integer> bst=new BinarySearchTreeTwo<>();
//        bst.add(11);
//        System.out.println(bst.getRootElement());
        /**
         * 层序遍历打印节点
         */
//        定义数组
        Integer data[] = new Integer[] {
                7, 4, 9, 2, 5, 8, 11, 3, 12, 1
        };
//        定义二叉树对象,另外我们没有写默认比较器，所以我们这里要加上我们自定义比较器
        BinarySearchTreeTwo<Integer> bst=new BinarySearchTreeTwo<>(new comparator<Integer>(){
                public int compare(Integer o1,Integer o2){
                    return o1-o2;
                }
        });
//        添加节点数据
        for (int i:data){
            bst.add(i);
        }
//        层序遍历
        bst.levelOrder(new Visitor<Integer>() {
            @Override
            public void visit(Integer element) {
                System.out.print(element+"_");
            }
        });
    }
}
