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
        BinarySearchTreeTwo<Integer> bst=new BinarySearchTreeTwo<>();
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
        System.out.println();
//        大小
        System.out.println(bst.size());
//        清空
//        System.out.println("清空树");
//        bst.clear();
//        判断是否为空
        System.out.println("是否为空"+bst.isEmpty());
//        判断元素是否存在
        System.out.println("元素是否存在:"+bst.contains(7));

    }
}
