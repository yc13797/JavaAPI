package com.string.zqyc;

public class StringTest1 {
/*
 * ��Ŀ�������ַ����У���һ����ĸת���ɴ�д��������ĸת����Сд������ӡ�ı����ַ���
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
