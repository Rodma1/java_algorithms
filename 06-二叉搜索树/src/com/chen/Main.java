package com.chen;

import com.chen.BinarySearchTree;
import com.chen.BinarySearchTree.Node;
import com.chen.BinarySearchTree.Visitor;
import com.chen.dao.comparator;
import com.mj.printer.BinaryTrees;

public class Main {
	public static void main(String[] args) {
//		定义数组
		Integer data[] = new Integer[] {
				7, 4, 9, 2, 5, 8, 11, 3, 12, 1
		};
//		new一个对象，定义比较器comparator
		BinarySearchTree<Integer> bst = new BinarySearchTree<>(new comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return o1-o2;
			}
		});
		for (int i = 0; i < data.length; i++) {
			bst.add(data[i]);
		}
		System.out.println(bst.contains(10));
		
		BinaryTrees.println(bst);
//		调用前序遍历的接口
		bst.levelOrder(new Visitor<Integer>() {
			public boolean visit(Integer element) {
				// TODO 自动生成的方法存根
				System.out.print(element+"_");
				return element==2 ? true:false;
			}
		});
		System.out.println();
//		调用后序遍历接口
//		bst.postorder();
		bst.postorder(new Visitor<Integer>() {
			public  boolean visit(Integer element) {
				System.out.print(element+"_");
				return element==0?true:false;
			}
		});
		System.out.println();
//		调用前驱节点
		System.out.println(bst.predecessor(8));
//		删除结点
		bst.remove(9);
		BinaryTrees.println(bst);
	}
}
