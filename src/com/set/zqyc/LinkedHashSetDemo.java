package com.set.zqyc;

import java.util.LinkedHashSet;

/*
 *   LinkedHashSet ��������Ĺ�ϣ��ʵ��
 *   �̳���HashSet
 *   
 *   LinkedHashSet ��������,����˳��,�洢��ȡ����˳����ͬ��
 *   �̲߳���ȫ�ļ���,�����ٶȿ�
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("abc");
		lhs.add("123");
		lhs.add("wang");
		lhs.add("wang");
		lhs.add("zhang");
		lhs.add("yu");
		lhs.add("wir");
		System.out.println(lhs);
	}
}
