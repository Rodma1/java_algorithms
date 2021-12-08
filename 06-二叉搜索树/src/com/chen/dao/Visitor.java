package com.chen.dao;

public interface Visitor<E> {
    void visit(E element);
}
