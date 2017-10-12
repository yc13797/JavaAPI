package com.equals.zqyc;

import java.util.ArrayList;

public class TestEquals {
	public static void main(String[] args) {
		//person类继承object类，equals方法
		Person p1 = new Person("张三",18);
		Person p2 = new Person("张三",17);
		Person p3=p1 ;
		ArrayList<String> arr = new ArrayList<>();
		
		boolean b = p1.equals(p2);
		System.out.println(b);
		
		boolean b2 = p1.equals(null);
		System.out.println(b2);
		
//		boolean b1 = p1.equals(arr);
//		System.out.println(b1);
		
//		boolean c = p1.equals(p3);
//		System.out.println(c);
	}
}
