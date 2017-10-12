package com.list.zqyc;

import java.util.LinkedList;

/*
 *  LinkedList 链表集合的特有功能
 *    自身特点: 链表底层实现,查询慢,增删快
 *  
 *  子类的特有功能,不能多态调用
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		function_2();
	}

	private static void function_2() {
	/*
	 *  E removeFirst() 移除并返回链表的开头
	 *  E removeLast() 移除并返回链表的结尾
	 */
		LinkedList<String> str = new LinkedList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
		
		String a = str.removeFirst();
		String b = str.removeLast();
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
	}

	private static void function_1() {
	/*
	 *  E getFirst() 获取链表的开头
	 * E getLast() 获取链表的结尾
	 * 集合没有元素时会异常
	 */
		LinkedList<String> str = new LinkedList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");

		if(str.isEmpty() == false){
			System.out.println(str.getFirst());
			System.out.println(str.getLast());
		}
	}

	private static void function() {
	/*
	 * addFirst(E) 添加到链表的开头
	 *  addLast(E) 添加到链表的结尾
	 */
		LinkedList<String> str = new LinkedList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
		System.out.println(str);
		str.addFirst("111");
		str.addLast("222");
		System.out.println(str);
		
	}
	
	
}
