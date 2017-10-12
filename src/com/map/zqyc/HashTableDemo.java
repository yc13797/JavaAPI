package com.map.zqyc;

import java.util.Hashtable;

/*
 * Map接口实现类 Hashtable
 *  底层数据结果哈希表,特点和HashMap是一样的
 *  Hashtable 线程安全集合,运行速度慢
 *  HashMap 线程不安全的集合,运行速度快
 *  
 *  Hashtable命运和Vector是一样的,从JDK1.2开始,被更先进的HashMap取代
 *  
 *  HashMap 允许存储null值,null键
 *  Hashtable 不允许存储null值,null键
 *  
 *  Hashtable他的孩子,子类 Properties 依然活跃在开发舞台
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
