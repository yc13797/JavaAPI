package com.string.zqyc;

public class StringDemo1 {
	public static void main(String[] args) {
		//�����ַ����ķ�ʽ�����֣�ֱ��= ����String��Ĺ��췽��
		String str1 = new String("abc");//"abc"��һ���ڴ��ַ���棬str1ָ����ڴ��ַ
		String str2 = "abc";//str2�����ͬ"str"
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);//�����������ͣ��Ƚϵ��ǵ�ַ false
		System.out.println(str1.equals(str2));//String��д��OBject���equals�������Ƚ�ֵ�Ƿ���ͬ��true
	}
}
