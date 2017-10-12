package com.arraylist.zqyc;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  Collection�ӿ��еķ���
 *  �Ǽ���������ʵ�������ӵ�еķ���
 *  ʹ��Collection�ӿڵ�ʵ����,�������ʾ
 *  ArrayList implements List
 *  List extends Collection
 *  ������ִ��,����ʵ�ֵ���д
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		function_3();
	}
	
	private static void function_3() {
	/*
	 *  Collection�ӿڷ���
	 * boolean remove(Object o)�Ƴ�������ָ����Ԫ��
	 * ֻɾ����һ��
	 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("123");
		coll.add("cdd");
		coll.add("acs");
		coll.add("123");
		
		System.out.println(coll);
		boolean b = coll.remove("123");
		System.out.println(b);
		System.out.println(coll);
	}

	private static void function_2() {
	/*
	 * Collection�ӿڷ���
	 *  Object[] toArray() �����е�Ԫ��,ת��һ�������е�Ԫ��, ����ת������
	 *  ������һ���洢���������, ����洢������������Object	
	 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("abb");
		coll.add("cdd");
		coll.add("acs");
		coll.add("123");
		Object[] a = coll.toArray();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

/*
 * ѧϰJava�����ֳ��ȱ�����ʽ
	 *   ����.length ����  ����ֵ int
	 *   �ַ���.length() ����,����ֵint
	 *   ����.size()����, ����ֵint
 */
	
	public static void function_1(){
	/*
	 *  Collection�ӿڷ���
	 * boolean contains(Object o) �ж϶����Ƿ�����ڼ�����,������ڷ���true
	 * ����������Object����
	 */
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("abb");
		coll.add("cdd");
		coll.add("acs");
		coll.add("123");
		System.out.println(coll.contains(123));//false
	}
	
	public static void function(){
	/*
	 * Collection�ӿڵķ���
	 * void clear() ��ռ����е�����Ԫ��
	 * ��������������Ȼ����
	 * �����
	 */
		//�ӿڶ�̬�ķ�ʽ����
		Collection<String> coll = new ArrayList<String>();
		coll.add("bcc");
		coll.add("abb");
		System.out.println(coll);
		coll.clear();
		System.out.println(coll);
	}
}
