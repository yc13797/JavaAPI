package com.equals.zqyc;

import java.util.Random;
import java.util.Scanner;

public class TestToString {
	public static void main(String[] args) {
		Person p = new Person("小明",19);
		String str1 = p.toString();
		//输出语句中，写的是一个对象，默认调用toString方法
		System.out.println(p);
		System.out.println(str1);
		
//		Random r = new Random();
//		System.out.println(r);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc);
		
		Person p1 = new Person();
		p1.setAge(45);
		System.out.println(p1);
	}
}
