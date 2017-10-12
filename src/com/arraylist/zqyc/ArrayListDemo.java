package com.arraylist.zqyc;

import java.util.ArrayList;

/*
 *  集合体系,
 *    目标  集合本身是一个存储的容器:
 *       必须使用集合存储对象
 *       遍历集合,取出对象
 *       集合自己的特性
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 *  集合ArrayList,存储int类型数
		 *  集合本身不接受基本类,自动装箱存储
		 */
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		//集合存储自定义的Person类的对象
		ArrayList<Person> arrPer = new ArrayList<Person>();
		arrPer.add(new Person("张三",18));
		arrPer.add(new Person("李四",19));
		arrPer.add(new Person("王五",17));
		for(int i=0;i<arrPer.size();i++){
			//get(0),取出的对象Person对象
			//打印的是一个对象,必须调用的toString()
			System.out.println(arrPer.get(i));
		}
	}
}
