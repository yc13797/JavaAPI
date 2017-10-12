package com.staticimport.zqyc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 集合操作的工具类
 *    Collections
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		function_1();
	}

	private static void function_2() {
	/*
	 * Collections.shuffle方法
	 * 对List集合中的元素,进行随机排列
	 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);	
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void function_1() {
	/*
	 *  Collections.binarySearch静态方法
	 * 对List集合进行二分搜索,方法参数,传递List集合,传递被查找的元素
	 * 二分查找，必须有序
	 * 如果没有则返回-插入点-1
	 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		//调用工具类静态方法binarySearch
		int index = Collections.binarySearch(list, 7);
		System.out.println(index);
	}

	private static void function() {
	/*
	 * Collections.sort静态方法
	 *  对于List集合,进行升序排列
	 */
		//创建List集合
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(11);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
		//调用集合工具类的方法sort
		Collections.sort(list);
		System.out.println(list);
	}
}
