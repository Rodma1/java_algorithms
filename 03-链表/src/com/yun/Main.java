package com.yun;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(2);
		list.add(4);
		for(int i=1;i<=list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		System.out.println(list.toString());
		list.remove(1);
		System.out.println(list.get(1));
	}
	
}
