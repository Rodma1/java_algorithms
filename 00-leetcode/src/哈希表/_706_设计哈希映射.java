package 哈希表;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/design-hashmap/
 * 链地址法
 */
public class _706_设计哈希映射 {
    //    定义一个存放key和value的对象
    private class Data {
        private int key;
        private int value;
        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }
        int getKey(){
            return key;
        }
        int getValue(){
            return value;
        }
        void setKey(int key){
            this.key=key;
        }
        void setValue(int value){
            this.value=value;
        }

    }
//    定义链表数组大小
    private static final int Base = 769;
//初始化链表数组
    private LinkedList[] data=new LinkedList[Base];
    public _706_设计哈希映射() {
//        初始化链表
        for (int i=0;i<Base;i++){
            data[i]=new LinkedList<Data>();
        }
    }
//    存入键值
    public void put(int key,int value){
        int hash=hash(key);
        Data element=data(key,hash);
        if (element!=null){
            element.setValue(value);
            return;
        }
        data[hash].offerLast(new Data(key, value));
    }
//    获取值
    public int get(int key){
        int hash=hash(key);
        Data element=data(key,hash);
        if (element!=null){
            return element.value;
        }
        return -1;
    }
//    移除
    public void remove(int key){
        int hash=hash(key);
        Data element=data(key,hash);
        if (element!=null){

            data[hash].remove(element);

        }

    }
//    判断是否存在
    public Data data(int key,int hash){
//        初始化迭代器
        Iterator<Data> iterator=data[hash].iterator();
//        遍历当前hash位置的链表数据
        while (iterator.hasNext()){
            Data element=iterator.next();
            if (element.getKey()==key){
                return element;
            }
        }
        return  null;
    }
//    获取hash值
    public int hash(int key){
        return key%Base;
    }
}
