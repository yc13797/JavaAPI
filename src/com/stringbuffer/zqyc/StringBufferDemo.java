package com.stringbuffer.zqyc;

public class StringBufferDemo {
	public static void main(String[] args) {
//		appendStrBuff();
//		deleteStrBuff();
//		insertStrBuff();
//		replaceStrBuff();
//		reverseStrBuff();
		toStringStrBuff();
	}
	
	public static void toStringStrBuff(){
		/*
		 * toString() ���ɱ仺�����ַ�����  ת���ɲ��ɱ��String�ַ���
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.append(12345);
		System.out.println(buffer.toString());
	}
	
	public static void reverseStrBuff(){
		/*
		 * reverse() ���������ַ� ��ת
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.reverse();
		System.out.println(buffer);
	}
	
	public static void replaceStrBuff(){
		/*
		 * replace(int start,int end,String str) �����������ַ����� ָ����Χ�Ļ������ַ� 
		 * ����ͷ��������β
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.replace(1, 17, "QQ");
		System.out.println(buffer);
	}
	
	public static void insertStrBuff(){
		/*
		 * insert(int start,��������) �����������ַ����� ָ�������Ļ������ַ� 
		 * ���ܳ������ֵ
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.insert(3, 1.5);
		System.out.println(buffer);
	}
	
	public static void deleteStrBuff(){
		/*
		 * delete(int start,int end) ɾ��ָ���Ļ������ַ� 
		 * ����ͷ��������β
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.delete(1,5);
		System.out.println(buffer);
	}
	
	public static void appendStrBuff(){
		/*
		 * StringBuffer�෽��
		 * append,���������͵����ݣ���ӵ�������
		 * append ����ֵ��return this
		 * ��������˭���ͷ���˭
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append(5).append(true).append(3.14);
		System.out.println(buffer);
	}
}
