package com.set.zqyc;

import java.util.LinkedHashSet;

/*
 *   LinkedHashSet 基于链表的哈希表实现
 *   继承自HashSet
 *   
 *   LinkedHashSet 自身特性,具有顺序,存储和取出的顺序相同的
 *   线程不安全的集合,运行速度块
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("abc");
		lhs.add("123");
		lhs.add("wang");
		lhs.add("wang");
		lhs.add("zhang");
		lhs.add("yu");
		lhs.add("wir");
		System.out.println(lhs);
	}
}
