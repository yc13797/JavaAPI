package com.set.zqyc;

import java.util.HashSet;

/*
 * HashSet���ϵ������ص�:
 *    �ײ����ݽṹ,��ϣ��
 *    �洢,ȡ�����ȽϿ�
 *    �̲߳���ȫ,�����ٶȿ�
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("aaa");
		set.add("bbb");
		set.add("bbb");

		System.out.println(set);
	}
}
