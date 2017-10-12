package com.string.zqyc;

public class StringDemo {
	public static void main(String[] args) {
/*
 * String类的特点
 * 	一切都是对象，字符串""也是对象
 * 	String类描述字符串对象的类
 * 	所以的"" 都是String类的对象
 * 	String类重写过toString()方法
 * 
 * 字符串是一个常量，一旦创建，不可更改
 */
		String str = "itda";
		System.out.println(str);
		
		str = "itwww";
		//str指向的内存变了， 字符串本身不变
		System.out.println(str);
	}
}
