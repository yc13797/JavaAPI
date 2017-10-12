package com.list.zqyc;

import java.util.ArrayList;
import java.util.List;

/*
 *  List�ӿ���ϵ, �̳�Collection�ӿ�
 *    �����кܶ�ʵ����
 *  List�ӿ��ص�: ����,����,�����ظ�Ԫ��
 *    ʵ����, ArrayList, LinkedList
 *    
 *  List�ӿ��еĳ��󷽷�,��һ���ַ��������ĸ��ӿ�Collection��һ��
 *  List�ӿڵ��Լ����еķ���, ���������Ĺ���
 */
public class ListDemo {
	public static void main(String[] args) {
		function_2();
	}

	private static void function_2() {
	/*
	 *  E set(int index, E)
	 *  �޸�ָ�������ϵ�Ԫ��
	 *  ���ر��޸�֮ǰ��Ԫ��
	 */
		List<Integer> in = new ArrayList<Integer>();
		in.add(1);
		in.add(2);
		in.add(2);
		in.add(4);
		System.out.println(in);
		Integer a =  in.set(2, 3);
		System.out.println(a);
		System.out.println(in);
	}

	private static void function_1() {
	/*
	 * E remove(int index)
	 *  �Ƴ�ָ�������ϵ�Ԫ��
	 *  ���ر�ɾ��֮ǰ��Ԫ��
	 */
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.3);
		System.out.println(list);
		Double d = list.remove(2);
		System.out.println(d);
		System.out.println(list);
	}

	private static void function() {
	/*
	 *  add(int index, E)
	 *  ��Ԫ�ز��뵽�б��ָ��������
	 *  ���������Ĳ���,��ֹԽ������
	 *  java.lang.IndexOutOfBoundsException
	 *     ArrayIndexOutOfBoundsException
	 *     StringIndexOutOfBoundsException
	 */
		List<String> list = new ArrayList<String>();
		list.add("avc1");
		list.add("avc2");
		list.add("avc3");
		list.add("avc4");
		System.out.println(list);
		
		list.add(1, "123");
		System.out.println(list);
	}
}
