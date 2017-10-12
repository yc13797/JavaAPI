package com.integer.zqyc;

/*
 * Integer ���ڶ����а�װ��һ���������� int ��ֵ
 * �����ṩ�˶������������ int ���ͺ� String ����֮�以��ת��
 */
public class IntegerDemo {
	public static void main(String[] args) {
//		parIns();
//		StrInt();
		integerS();
	}
	
	public static void integerS(){
	/*
	 * integer(String s)
	 * �����ָ�ʽ���ַ���,���빹������
	 * ���������е��ַ�����ת��int���ͣ����÷Ǿ�̬�ķ�����intValue();
	 */
		Integer in = new Integer("100");
		int i = in.intValue();
		System.out.println(--i);
	}
	
	public static void StrInt(){
	/*
	 * ��ν���������תΪ�ַ���
	 * int-->String �κ�����+""�����String����  �򵥣��Ƽ�
	 * Integer���еľ�̬����toString();
	 * toString(int a,int b) ��int����ת��ָ��������
	 */
		int i=3;
		String s = i+"";
		System.out.println(s+1);
		
		String s1 = Integer.toString(5);
		System.out.println(s1+1);
		
		String s2 = Integer.toString(600,30);
		System.out.println(s2);
	}
	
	public static void parIns(){
		/*
		 * Integer�еľ�̬������parseInt(String str,int radix) ���ػ�����������
		 * Ҫ��: �ַ������������ָ�ʽ��
		 * radix ����  ���ٽ���
		 */
			String str = "a";
			int a = Integer.parseInt(str,16);
			
			System.out.println(a);
	}
	
	public static void parIn(){
	/*
	 * Integer�еľ�̬������parseInt(String str) ���ػ�����������
	 * Ҫ��: �ַ������������ָ�ʽ��
	 */
		String str = "-13";
		int a = Integer.parseInt(str);
		
		System.out.println(a/2);
	}
}
