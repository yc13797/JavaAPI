package com.generic.zqyc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * JDK1.5 �����µİ�ȫ����,��֤����İ�ȫ��
 *   ����: ָ���˼����д洢���ݵ�����  <��������>
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
