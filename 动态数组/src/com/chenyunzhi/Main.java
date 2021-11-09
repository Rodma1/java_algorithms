package com.chenyunzhi;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		list.add(99);
		list.add(88);
		System.out.println(list.size());
		System.out.print(list.set(1,80));
		System.out.println(list);
		list.add(1, 10);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.indexOf(80));
		
		ArrayList<person> lists=new ArrayList<>();
		
		lists.add(new person(1,"name"));
		System.out.println(lists);
		System.out.print(lists.set(0,new person(1,"cheng")));
		System.out.println(lists);
	}
}
