package com.map.zqyc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历
 *    利用键获取值
 *    Map接口中定义方法keySet
 *    所有的键,存储到Set集合
 *    
 *  1. 调用map集合的方法keySet,所有的键存储到Set集合中
 *  2. 遍历Set集合,获取出Set集合中的所有元素 (Map中的键)
 *  3. 调用map集合方法get,通过键获取到值
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("a", 11);
		map.put("b", 12);
		map.put("c", 13);
		map.put("d", 14);
		
	//1. 调用map集合的方法keySet,所有的键存储到Set集合中
		Set set = map.keySet();
	//2. 遍历Set集合,获取出Set集合中的所有元素 (Map中的键)	
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
