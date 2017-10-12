package com.map.zqyc;

import java.util.HashMap;
import java.util.Map;

/*
 *  ʹ��HashMap����,�洢�Զ���Ķ���
 *  �Զ������,��Ϊ��,����,��Ϊֵ����
 */
public class HashMapDemo {
	public static void main(String[] args) {
		function_1();
	}

	private static void function_1() {
	/*
	 * HashMap �洢�Զ������Person,��Ϊ������
	 * ���Ķ���,��Person����,ֵ���ַ���
	 * ��֤����Ψһ��,�洢�����Ķ���,��дhashCode equals
	 */
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(new Person("a",20), "��Լ����¬");
		map.put(new Person("b",18), "������");
		map.put(new Person("b",18), "������");
		map.put(new Person("c",19), "��Ľ��");
		
		for(Person p:map.keySet()){
			String value = map.get(p);
			System.out.println(p+"==>"+value);
		}
		System.out.println("=========");
		for(Map.Entry<Person, String> entry:map.entrySet()){
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"==>"+value);
		}
	}

	private static void function() {
	/*
	 * HashMap �洢�Զ���Ķ���Person,��Ϊֵ����
	 * ���Ķ���,���ַ���,���Ա�֤Ψһ��
	 */
		HashMap<String,Person> per = new HashMap<String,Person>();
		per.put("beijing", new Person("a",20));
		per.put("tianjin", new Person("b",19));
		per.put("shanghai", new Person("c",17));
		
		for(String key:per.keySet()){
			Person p = per.get(key);
			System.out.println(key+"==>"+p);
		}
		System.out.println("=========");
		
		for(Map.Entry<String, Person> entry: per.entrySet()){
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(key+"==>"+value);
		}
	}
}
