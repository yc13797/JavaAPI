package com.map.zqyc;

import java.util.HashMap;
import java.util.Map;

/*
 * Map�ӿ��еĳ��÷���
 *    ʹ��Map�ӿڵ�ʵ���� HashMap
 */
public class MapDemo {
	public static void main(String[] args) {
		function_2();
	}

	private static void function_2() {
	/*
	 * �Ƴ������еļ�ֵ��,���ر��Ƴ�֮ǰ��ֵ
	 *  V remove(K)
	 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("a", 2);
		System.out.println(map.remove("a"));
		System.out.println(map);
	}

	private static void function_1() {
	/*
	 *  ͨ��������,��ȡֵ����
	 * V get(K)
	 * ���������û�������,����null
	 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("a", 2);
		System.out.println(map.get("w"));
	}

	private static void function() {
	/*
	 *  ����ֵ�Դ洢��������
	 *  V put(K,V) K ��Ϊ���Ķ���, V��Ϊֵ�Ķ���
	 *  �洢�����ظ��ļ�,��ԭ�е�ֵ,����
	 *  ����ֵһ������·���null,
	 *  �洢�ظ�����ʱ��,���ر�����֮ǰ��ֵ
	 */
		//�������϶���,HashMap,�洢����,�����ַ���,ֵ������
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		Integer a = map.put("a", 2);
		System.out.println(a);
		System.out.println(map);
	}
	
	
}
