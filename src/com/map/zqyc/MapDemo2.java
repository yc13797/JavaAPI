package com.map.zqyc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϻ�ȡ��ʽ
 *  entrySet����,��ֵ��ӳ���ϵ(���֤)��ȡ
 *  ʵ�ֲ���:
 *    1. ����map���Ϸ���entrySet()�������е�ӳ���ϵ����,�洢��Set����
 *        Set<Entry <K,V> >
 *    2. ����Set����
 *    3. ��ȡ����Set���ϵ�Ԫ��,��ӳ���ϵ����
 *    4. ͨ��ӳ���ϵ���󷽷� getKet, getValue��ȡ��ֵ��
 *    
 *    �����ڲ������ �ⲿ��.�ڲ��� = new 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("a", 11);
		map.put("b", 12);
		map.put("c", 13);
		
		//1. ����map���Ϸ���entrySet()�������е�ӳ���ϵ����,�洢��Set����
		Set<Map.Entry <String,Integer> >  set = map.entrySet();
		//2. ����Set����
		Iterator<Map.Entry <String,Integer> > it = set.iterator();
		while(it.hasNext()){
			//  3. ��ȡ����Set���ϵ�Ԫ��,��ӳ���ϵ����
			// it.next ��ȡ����ʲô����,Ҳ��Map.Entry����
			Map.Entry<String,Integer> entry = it.next();
			//4. ͨ��ӳ���ϵ���󷽷� getKet, getValue��ȡ��ֵ��
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"...."+value);
		}
		
		System.out.println("=========================");
		for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}
	}
}
