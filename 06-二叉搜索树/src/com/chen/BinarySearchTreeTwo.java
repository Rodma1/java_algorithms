package com.chen;

import com.chen.dao.TreeDao;

public class BinarySearchTreeTwo<E> implements TreeDao<E> {
//    设置内部类
    private static class Node<E>{
        E element;
        Node<E> right;
        Node<E> left;
//        父节点
        Node<E> parent;
        public Node(E element,Node<E> parent){
            this.element=element;
            this.parent=parent;
        }

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(E element) {

    }

    @Override
    public void remove(E element) {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }
}
