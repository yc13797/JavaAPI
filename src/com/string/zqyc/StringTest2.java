package com.string.zqyc;

public class StringTest2 {
/*
 * ��Ŀ������ѯ���ַ����У�����ָ��С�ַ����Ĵ������硰hellojava,nihaojava,javazhenbang���в�ѯ
 * ���֡�java���Ĵ�����
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
