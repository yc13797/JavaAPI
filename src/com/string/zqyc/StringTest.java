package com.string.zqyc;

public class StringTest {
/*
 * ��Ŀ����ȡָ���ַ����У���д��ĸ��Сд��ĸ�����ֵĸ�����
 * 	1.������������int��������������count++
 * 	2.�����ַ�����str.length()
 * 		String����charAt����������ȡ�ַ�
 * 	3.�жϴ�Сд������
 * 		���ñ����65-90��д��ĸ��97-122Сд��ĸ��48-57����
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
		System.out.println("��д��ĸ:"+upper);
		System.out.println("Сд��ĸ:"+lower);
		System.out.println("�����ַ�:"+digit);
		System.out.println("�����ַ�:"+other);
	}
	
}
