package com.set.zqyc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  Set�ӿ�,�ص㲻�ظ�Ԫ��,û����
 *  
 *  Set�ӿڵ�ʵ����,HashSet (��ϣ��)
 *  �ص�: ���򼯺�,�洢��ȡ����˳��ͬ,û������,���洢�ظ�Ԫ��
 *  ����ı�д��,��ArrayList��ȫһ��
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("aaa");
		set.add("ccc");
		set.add("ddd");
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		for (String string : set) {
			System.out.println(string);
		}
	}
}
