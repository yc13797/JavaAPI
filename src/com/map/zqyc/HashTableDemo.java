package com.map.zqyc;

import java.util.Hashtable;

/*
 * Map�ӿ�ʵ���� Hashtable
 *  �ײ����ݽ����ϣ��,�ص��HashMap��һ����
 *  Hashtable �̰߳�ȫ����,�����ٶ���
 *  HashMap �̲߳���ȫ�ļ���,�����ٶȿ�
 *  
 *  Hashtable���˺�Vector��һ����,��JDK1.2��ʼ,�����Ƚ���HashMapȡ��
 *  
 *  HashMap ����洢nullֵ,null��
 *  Hashtable ������洢nullֵ,null��
 *  
 *  Hashtable���ĺ���,���� Properties ��Ȼ��Ծ�ڿ�����̨
 */
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String , String> ht = new Hashtable<String , String>();
		ht.put("a", "123");
		ht.put("b", "111");
		ht.put("c", "222");
		System.out.println(ht);
	}
}
