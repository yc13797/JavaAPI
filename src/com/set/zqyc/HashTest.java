package com.set.zqyc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashTest {
	public static void main(String[] args) {
		test_3();
	}

	private static void test_3() {
	/*
	 * (1)编写一个泛形方法，实现指定位置数组元素的交换
	 *  (2)编写一个泛形方法，接收一个任意数组，并反转数组中的所有元素	
	 */
		
	}

	private static void test_2() {
	/*
	 * 自己写出contains 方法
	 */
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		
		String sefor = "123";
		boolean flag = false;
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			if(sefor.equals(it.next())){
				flag = true;
				break;
			}
		}
		System.out.println(flag);
	}

	private static void test_1() {
	/*
	 * 利用HashSet对list集合去重(最终结果:list中没有重复元素)
	 */
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		
		HashSet<String> liha = new HashSet<String>();
		for (String string : list) {
			System.out.print(string+" ");
			liha.add(string);
		}
		
		System.out.println("\n================");
		Iterator<String> it = liha.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
}
