package com.map.zqyc;

import java.util.HashMap;
import java.util.Map;

/*
 * Map接口中的常用方法
 *    使用Map接口的实现类 HashMap
 */
public class MapDemo {
	public static void main(String[] args) {
		function_2();
	}

	private static void function_2() {
	/*
	 * 移除集合中的键值对,返回被移除之前的值
	 *  V remove(K)
	 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("a", 2);
		System.out.println(map.remove("a"));
		System.out.println(map);
	}

	private static void function_1() {
	/*
	 *  通过键对象,获取值对象
	 * V get(K)
	 * 如果集合中没有这个键,返回null
	 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("a", 2);
		System.out.println(map.get("w"));
	}

	private static void function() {
	/*
	 *  将键值对存储到集合中
	 *  V put(K,V) K 作为键的对象, V作为值的对象
	 *  存储的是重复的键,将原有的值,覆盖
	 *  返回值一般情况下返回null,
	 *  存储重复键的时候,返回被覆盖之前的值
	 */
		//创建集合对象,HashMap,存储对象,键是字符串,值是整数
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		Integer a = map.put("a", 2);
		System.out.println(a);
		System.out.println(map);
	}
	
	
}
