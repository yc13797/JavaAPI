package com.map.zqyc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı���
 *    ���ü���ȡֵ
 *    Map�ӿ��ж��巽��keySet
 *    ���еļ�,�洢��Set����
 *    
 *  1. ����map���ϵķ���keySet,���еļ��洢��Set������
 *  2. ����Set����,��ȡ��Set�����е�����Ԫ�� (Map�еļ�)
 *  3. ����map���Ϸ���get,ͨ������ȡ��ֵ
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("a", 11);
		map.put("b", 12);
		map.put("c", 13);
		map.put("d", 14);
		
	//1. ����map���ϵķ���keySet,���еļ��洢��Set������
		Set set = map.keySet();
	//2. ����Set����,��ȡ��Set�����е�����Ԫ�� (Map�еļ�)	
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer in = map.get(key);
			System.out.println(key+"==>"+in);
		}
		System.out.println("===========");
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key+"==>"+value);
		}
	}
}
