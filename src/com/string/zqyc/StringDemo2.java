package com.string.zqyc;

public class StringDemo2 {
/*
* String��Ĺ��췽���ж���
*/
	public static void main(String[] args) {
//		byteString();
//		charString();
	}
	

	
	public static void charString(){
	/*
	 * String(char[] value)
	* ���ַ����飬ת���ַ������ַ����Ĳ���������ѯ�����
	* String(char[] value, int offset, int count)
	* ���ַ�����һ����ת���ַ�����offset��ʼ������count����
	*/		
		char a[] = {'a','b','c','d','e','f'};
		String str = new String(a);
		System.out.println(str);
		String str1 = new String(a,1,4);
		System.out.println(str1);
	}
	
	public static void byteString(){
	/*
	* String(byte[] bytes) 
	* ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String��
	* ƽ̨:ָ���ǲ���ϵͳ
	* Ĭ���ַ���������ϵͳ�е�Ĭ�ϱ����Ĭ�ϱ������GBK��������
	* ���ַ������е�ÿ���ֽڣ���ѯ������õ��Ľ��
	* ������ʾ���֣�һ�����������ֽ�
	* 
	* String(byte[] bytes, int offset, int length)
	* �ֽ������һ���� offset��ʼ����  length����
	*/	
		byte[] byt = {97,98,99,100};
		String str = new String(byt);
		System.out.println(str);
		String str1 = new String(byt,1,2);
		System.out.println(str1);
	}
}
