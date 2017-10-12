package com.arraylist.zqyc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  �����еĵ�����:
 *    ��ȡ������Ԫ�ط�ʽ
 *  �ӿ� Iterator : �������󷽷�
 *     boolean hasNext() �жϼ����л���û�п��Ա�ȡ����Ԫ��,����з���true
 *     next() ȡ�������е���һ��Ԫ��
 *     
 *  Iterator�ӿ�,��ʵ����.
 *    Collection�ӿڶ��巽�� 
 *       Iterator  iterator()
 *    ArrayList ��д���� iterator(),������Iterator�ӿڵ�ʵ����Ķ���
 *    ʹ��ArrayList���ϵĶ���
 *     Iterator it = array.iterator(),���н������Iterator�ӿڵ�ʵ����Ķ���
 *     it�ǽӿڵ�ʵ�������,���÷��� hasNext �� next ����Ԫ�ص���
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		//���Ͽ��Դ洢�������͵Ķ���
		//������,��ָ���洢����������, ����ʲô����
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add("uyjgtfd");
		coll.add("123 ddd");
		
//		Iterator it = coll.iterator();
//		while(it.hasNext()){
//			String s = (String) it.next();
//			System.out.println(s);
//		}
		
		//for��while�ã�it1���Լ�ʱ�ͷ�
		for(Iterator it1 = coll.iterator();it1.hasNext();){
			String s = (String) it1.next();
			System.out.println(s);
		}
	}
}
