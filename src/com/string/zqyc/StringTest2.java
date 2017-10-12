package com.string.zqyc;

public class StringTest2 {
/*
 * 题目三：查询大字符串中，出现指定小字符串的次数。如“hellojava,nihaojava,javazhenbang”中查询
 * 出现“java”的次数。
 */
	public static void main(String[] args) {
		String str = "hejavallojava,nihaojava,javazhenbang";
		String index = "java";
		
		System.out.println(countIndexOfString(str,index));;
	}
	
	public static int countIndexOfString(String str,String index){
		int i = 0,count=0;
		while((i=str.indexOf(index))!=-1){
			count++;
			str = str.substring(i+1);
		}
		return count;

	}
}	
