package com.list.zqyc;

import java.util.LinkedList;

/*
 *  LinkedList �����ϵ����й���
 *    �����ص�: ����ײ�ʵ��,��ѯ��,��ɾ��
 *  
 *  ��������й���,���ܶ�̬����
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		function_2();
	}

	private static void function_2() {
	/*
	 *  E removeFirst() �Ƴ�����������Ŀ�ͷ
	 *  E removeLast() �Ƴ�����������Ľ�β
	 */
		LinkedList<String> str = new LinkedList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
		
		String a = str.removeFirst();
		String b = str.removeLast();
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
	}

	private static void function_1() {
	/*
	 *  E getFirst() ��ȡ����Ŀ�ͷ
	 * E getLast() ��ȡ����Ľ�β
	 * ����û��Ԫ��ʱ���쳣
	 */
		LinkedList<String> str = new LinkedList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");

		if(str.isEmpty() == false){
			System.out.println(str.getFirst());
			System.out.println(str.getLast());
		}
	}

	private static void function() {
	/*
	 * addFirst(E) ��ӵ�����Ŀ�ͷ
	 *  addLast(E) ��ӵ�����Ľ�β
	 */
		LinkedList<String> str = new LinkedList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
		System.out.println(str);
		str.addFirst("111");
		str.addLast("222");
		System.out.println(str);
		
	}
	
	
}
