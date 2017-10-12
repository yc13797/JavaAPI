package com.integer.zqyc;
/*
 * Integer的其他方法和变量
 * 3个静态方法，2个静态变量（MAX_VALUE,MIN_value）
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		showIw();
	}
	
	public static void showIw(){
	/*
	 *	3个静态方法
	 *	进制的转换
	 *	十进制转二进制  Integer.toBinaryString(99)
	 *	十进制转八进制 
	 *	十进制转十六进制 
	 *	三个方法，返回值都是String形式
	 */
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
	}
	
	public static void showIn(){
	/*
	 * 两个静态常量
	 */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
