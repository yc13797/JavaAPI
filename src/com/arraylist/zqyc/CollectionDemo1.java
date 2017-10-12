package com.arraylist.zqyc;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  Collection接口中的方法
 *  是集合中所有实现类必须拥有的方法
 *  使用Collection接口的实现类,程序的演示
 *  ArrayList implements List
 *  List extends Collection
 *  方法的执行,都是实现的重写
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		function_3();
	}
	
	private static void function_3() {
	/*
	 *  Collection接口方法
	 * boolean remove(Object o)移除集合中指定的元素
	 * 只删除第一个
	 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("123");
		coll.add("cdd");
		coll.add("acs");
		coll.add("123");
		
		System.out.println(coll);
		boolean b = coll.remove("123");
		System.out.println(b);
		System.out.println(coll);
	}

	private static void function_2() {
	/*
	 * Collection接口方法
	 *  Object[] toArray() 集合中的元素,转成一个数组中的元素, 集合转成数组
	 *  返回是一个存储对象的数组, 数组存储的数据类型是Object	
	 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("abb");
		coll.add("cdd");
		coll.add("acs");
		coll.add("123");
		Object[] a = coll.toArray();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

/*
 * 学习Java中三种长度表现形式
	 *   数组.length 属性  返回值 int
	 *   字符串.length() 方法,返回值int
	 *   集合.size()方法, 返回值int
 */
	
	public static void function_1(){
	/*
	 *  Collection接口方法
	 * boolean contains(Object o) 判断对象是否存在于集合中,对象存在返回true
	 * 方法参数是Object类型
	 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("abb");
		coll.add("cdd");
		coll.add("acs");
		coll.add("123");
		System.out.println(coll.contains(123));//false
	}
	
	public static void function(){
	/*
	 * Collection接口的方法
	 * void clear() 清空集合中的所有元素
	 * 集合容器本身依然存在
	 * 有序的
	 */
		//接口多态的方式调用
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("abb");
		System.out.println(coll);
		coll.clear();
		System.out.println(coll);
	}
}
