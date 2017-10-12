package com.generic.zqyc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * JDK1.5 出现新的安全机制,保证程序的安全性
 *   泛型: 指明了集合中存储数据的类型  <数据类型>
 */
public class GenericDemo {
	public static void main(String[] args) {
		function();
	}

	private static void function() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("12");
		coll.add("1w2");
		coll.add("w12w");
		coll.add("sz");
		
		for(Iterator<String> it = coll.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
	
	
}
