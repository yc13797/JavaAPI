package com.set.zqyc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashTest {
	public static void main(String[] args) {
		test_3();
	}

	private static void test_3() {
	/*
	 * (1)��дһ�����η�����ʵ��ָ��λ������Ԫ�صĽ���
	 *  (2)��дһ�����η���������һ���������飬����ת�����е�����Ԫ��	
	 */
		
	}

	private static void test_2() {
	/*
	 * �Լ�д��contains ����
	 */
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		
		String sefor = "123";
		boolean flag = false;
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			if(sefor.equals(it.next())){
				flag = true;
				break;
			}
		}
		System.out.println(flag);
	}

	private static void test_1() {
	/*
	 * ����HashSet��list����ȥ��(���ս��:list��û���ظ�Ԫ��)
	 */
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		
		HashSet<String> liha = new HashSet<String>();
		for (String string : list) {
			System.out.print(string+" ");
			liha.add(string);
		}
		
		System.out.println("\n================");
		Iterator<String> it = liha.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
}
