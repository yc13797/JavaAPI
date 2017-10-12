package com.string.zqyc;

public class StringDemo1 {
	public static void main(String[] args) {
		//定义字符串的方式有两种，直接= 、用String类的构造方法
		String str1 = new String("abc");//"abc"用一块内存地址保存，str1指向该内存地址
		String str2 = "abc";//str2保存的同"str"
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);//引用数据类型，比较的是地址 false
		System.out.println(str1.equals(str2));//String重写了OBject类的equals方法，比较值是否相同，true
	}
}
