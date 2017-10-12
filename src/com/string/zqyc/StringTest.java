package com.string.zqyc;

public class StringTest {
/*
 * 题目：获取指定字符串中，大写字母、小写字母、数字的个数。
 * 	1.计数器，就是int变量，满足条件count++
 * 	2.遍历字符串，str.length()
 * 		String方法charAt，索引，获取字符
 * 	3.判断大小写，数字
 * 		利用编码表，65-90大写字母，97-122小写字母，48-57数字
 */
	public static void main(String[] args) {
		String str = "awe3@#4weA#@34SW23";
		countString(str);
	}
	
	public static void countString(String str){
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int other = 0;
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c >='A'&&c <=90)
				upper++;
			else if(c >=97&&c <=122)
				lower++;
			else if(c >=48&&c <='9')
				digit++;
			else
				other++;
		}
		System.out.println("大写字母:"+upper);
		System.out.println("小写字母:"+lower);
		System.out.println("数字字符:"+digit);
		System.out.println("其他字符:"+other);
	}
	
}
