package com.integer.zqyc;
/*
 * Integer�����������ͱ���
 * 3����̬������2����̬������MAX_VALUE,MIN_value��
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		showIw();
	}
	
	public static void showIw(){
	/*
	 *	3����̬����
	 *	���Ƶ�ת��
	 *	ʮ����ת������  Integer.toBinaryString(99)
	 *	ʮ����ת�˽��� 
	 *	ʮ����תʮ������ 
	 *	��������������ֵ����String��ʽ
	 */
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
	}
	
	public static void showIn(){
	/*
	 * ������̬����
	 */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
