package com.arraylist.zqyc;

import java.util.ArrayList;

/*
 *  JDK1.5新特性,增强for循环
 *  JDK1.5版本后,出现新的接口 java.lang.Iterable
 *    Collection开是继承Iterable
 *    Iterable作用,实现增强for循环
 *    
 *    格式:
 *      for( 数据类型  变量名 : 数组或者集合 ){
 *         sop(变量);
 *      }
 */
public class ForeachDemo {
	public static void main(String[] args) {
		function_2();
	}

	
	
	private static void function_2() {
	/*
	 *  增强for循环遍历集合
	 *  存储自定义Person类型	
	 */
		ArrayList<Person> per = new ArrayList<Person>();
		per.add(new Person("小明",18));
		per.add(new Person("小王",20));
		per.add(new Person("小张",20));
		
		for(Person p:per){
			System.out.println(p);
		}
	}



	private static void function_1() {
		//for对于对象数组遍历的时候,能调用对象的方法
		String str[] = {"123","add","2e3","c@3423"};
		for (String string : str) {
			System.out.println(string);
		}
	}



	private static void function() {
	/*
	 *  实现for循环,遍历数组
	 *  好处: 代码少了,方便对容器遍历
	 *  弊端: 没有索引,不能操作容器里面的元素
	 */
		int a[] = {1,23,4,3};
		
		for (int i : a) {
			System.out.print(i+" ");
		}
		
	}
	
	
}
