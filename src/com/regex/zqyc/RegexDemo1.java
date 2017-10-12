package com.regex.zqyc;

public class RegexDemo1 {
	public static void main(String[] args) {
//		splitStr();
//		splitIP();
		replaceStr();
	}
	
	public static void replaceStr(){
		/*
		 * 使用replaceAll()方法对String进行替换
		 * "heei2232osd3345"
		 * 将数字替换成#
		 */		
		String str = "heei2232osd3345";
		String str1 = str.replaceAll("[\\d]+", "*");
		System.out.print(str1);
		
	}
	
	public static void splitIP(){
		/*
		 * 使用split()方法对IP进行切割
		 * 192.168.0.1	不能按.对字符串切割，.可以匹配所有的
		 * 对.进行转义\\.
		 */		
		String str = "192.168.0.1";
		String[] str1 = str.split("\\.");
		for(int i=0;i<str1.length;i++){
			System.out.print(str1[i]+" ");
		}
	}
	
	public static void splitStr(){
		/*
		 * 使用split()方法对字符串进行切割
		 * 12-34-56-78	按-对字符串切割
		 * 12 34 56 78	切空格
		 */
//		String str = "12-34-56-78";
//		String[] str1 = str.split("-");
		
		String str = "12  34 56  78";
		String[] str1 = str.split(" +");
		for(int i=0;i<str1.length;i++){
			System.out.print(str1[i]+" ");
		}
	}
}
