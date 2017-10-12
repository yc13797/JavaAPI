package com.staticimport.zqyc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ���ϲ����Ĺ�����
 *    Collections
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		function_1();
	}

	private static void function_2() {
	/*
	 * Collections.shuffle����
	 * ��List�����е�Ԫ��,�����������
	 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);	
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void function_1() {
	/*
	 *  Collections.binarySearch��̬����
	 * ��List���Ͻ��ж�������,��������,����List����,���ݱ����ҵ�Ԫ��
	 * ���ֲ��ң���������
	 * ���û���򷵻�-�����-1
	 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		//���ù����ྲ̬����binarySearch
		int index = Collections.binarySearch(list, 7);
		System.out.println(index);
	}

	private static void function() {
	/*
	 * Collections.sort��̬����
	 *  ����List����,������������
	 */
		//����List����
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(11);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
		//���ü��Ϲ�����ķ���sort
		Collections.sort(list);
		System.out.println(list);
	}
}
