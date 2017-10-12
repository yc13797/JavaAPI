package com.set.zqyc;

import java.util.HashSet;

/*
 * HashSet集合的自身特点:
 *    底层数据结构,哈希表
 *    存储,取出都比较快
 *    线程不安全,运行速度快
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("aaa");
		set.add("bbb");
		set.add("bbb");

		System.out.println(set);
	}
}
