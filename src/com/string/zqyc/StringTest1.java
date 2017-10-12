package com.string.zqyc;

public class StringTest1 {
/*
 * 题目二：将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串
 */
	public static void main(String[] args) {
		String str = "asdASWCsdOCsawdMPweAD";
		System.out.println(changeString(str));
	}
	
	public static String changeString(String str){
		String str1 = str.substring(0, 1);
		str1 = str1.toUpperCase();
		String str2 = str.substring(1);
		str2 = str2.toLowerCase();
		
		String string = str1+str2;
		return string;
	}
}
