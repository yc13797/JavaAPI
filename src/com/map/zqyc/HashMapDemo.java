package com.map.zqyc;

import java.util.HashMap;
import java.util.Map;

/*
 *  使用HashMap集合,存储自定义的对象
 *  自定义对象,作为键,出现,作为值出现
 */
public class HashMapDemo {
	public static void main(String[] args) {
		function_1();
	}

	private static void function_1() {
	/*
	 * HashMap 存储自定义对象Person,作为键出现
	 * 键的对象,是Person类型,值是字符串
	 * 保证键的唯一性,存储到键的对象,重写hashCode equals
	 */
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(new Person("a",20), "里约热内卢");
		map.put(new Person("b",18), "索马里");
		map.put(new Person("b",18), "索马里");
		map.put(new Person("c",19), "百慕大");
		
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
	 * HashMap 存储自定义的对象Person,作为值出现
	 * 键的对象,是字符串,可以保证唯一性
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
