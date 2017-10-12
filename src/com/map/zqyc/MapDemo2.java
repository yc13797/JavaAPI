package com.map.zqyc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合获取方式
 *  entrySet方法,键值对映射关系(结婚证)获取
 *  实现步骤:
 *    1. 调用map集合方法entrySet()将集合中的映射关系对象,存储到Set集合
 *        Set<Entry <K,V> >
 *    2. 迭代Set集合
 *    3. 获取出的Set集合的元素,是映射关系对象
 *    4. 通过映射关系对象方法 getKet, getValue获取键值对
 *    
 *    创建内部类对象 外部类.内部类 = new 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("a", 11);
		map.put("b", 12);
		map.put("c", 13);
		
		//1. 调用map集合方法entrySet()将集合中的映射关系对象,存储到Set集合
		Set<Map.Entry <String,Integer> >  set = map.entrySet();
		//2. 迭代Set集合
		Iterator<Map.Entry <String,Integer> > it = set.iterator();
		while(it.hasNext()){
			//  3. 获取出的Set集合的元素,是映射关系对象
			// it.next 获取的是什么对象,也是Map.Entry对象
			Map.Entry<String,Integer> entry = it.next();
			//4. 通过映射关系对象方法 getKet, getValue获取键值对
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
