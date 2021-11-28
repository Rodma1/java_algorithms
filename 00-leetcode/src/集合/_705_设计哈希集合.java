package 集合;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/design-hashset/
 * 链地址法
 */
public class _705_设计哈希集合 {
    //    定义数组最大值，最好是质数
    private int base = 769;
    //    定义链表数组
    private LinkedList[] data;

    public _705_设计哈希集合() {
        data = new LinkedList[base];
//        循环初始化每个数组的链表
        for (int i = 0; i < base; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    //    增加数据
    public void add(int key) {
        int hash = hash(key);
        if (data(key, hash)) {
            data[hash].offerLast(key);
        }
        return;
    }

    //    删除数据
    public void remove(int key) {
        int hash = hash(key);
        if (!data(key, hash)) {
            System.out.println(key);
//            注意这里要把key用Interger装起来，俗称装箱
            data[hash].remove((Integer)key);
        }
    }

    //    判断是否存在数据
    public boolean contains(int key) {
        int hash=hash(key);
        return !data(key,hash);
    }

    //    判断函数
    public boolean data(int key, int hash) {

//        定义这个数组位置的迭代器
        Iterator<Integer> iterator = data[hash].iterator();
//        遍历当前链表的值
        while (iterator.hasNext()) {
            int element = iterator.next();
//            集合中不存在相等的数
            if (element == key) {
                return false;
            }
        }
        return true;
    }

    //    获取哈希值
    public int hash(int key) {
        return key % base;
    }

}
