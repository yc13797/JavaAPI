package com.integer.zqyc;

/*
 * Integer 类在对象中包装了一个基本类型 int 的值
 * 该类提供了多个方法，能在 int 类型和 String 类型之间互相转换
 */
public class IntegerDemo {
	public static void main(String[] args) {
//		parIns();
//		StrInt();
		integerS();
	}
	
	public static void integerS(){
	/*
	 * integer(String s)
	 * 将数字格式的字符串,传入构造器中
	 * 将构造器中的字符串，转成int类型，调用非静态的方法，intValue();
	 */
		Integer in = new Integer("100");
		int i = in.intValue();
		System.out.println(--i);
	}
	
	public static void StrInt(){
	/*
	 * 如何将基本类型转为字符串
	 * int-->String 任何类型+""都变成String类型  简单，推荐
	 * Integer类中的静态方法toString();
	 * toString(int a,int b) 将int整数转成指定进制数
	 */
		int i=3;
		String s = i+"";
		System.out.println(s+1);
		
		String s1 = Integer.toString(5);
		System.out.println(s1+1);
		
		String s2 = Integer.toString(600,30);
		System.out.println(s2);
	}
	
	public static void parIns(){
		/*
		 * Integer中的静态方法，parseInt(String str,int radix) 返回基本数据类型
		 * 要求: 字符串必须是数字格式的
		 * radix 基数  多少进制
		 */
			String str = "a";
			int a = Integer.parseInt(str,16);
			
			System.out.println(a);
	}
	
	public static void parIn(){
	/*
	 * Integer中的静态方法，parseInt(String str) 返回基本数据类型
	 * 要求: 字符串必须是数字格式的
	 */
		String str = "-13";
		int a = Integer.parseInt(str);
		
		System.out.println(a/2);
	}
}
