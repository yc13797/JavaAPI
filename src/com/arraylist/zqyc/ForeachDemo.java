package com.arraylist.zqyc;

import java.util.ArrayList;

/*
 *  JDK1.5������,��ǿforѭ��
 *  JDK1.5�汾��,�����µĽӿ� java.lang.Iterable
 *    Collection���Ǽ̳�Iterable
 *    Iterable����,ʵ����ǿforѭ��
 *    
 *    ��ʽ:
 *      for( ��������  ������ : ������߼��� ){
 *         sop(����);
 *      }
 */
public class ForeachDemo {
	public static void main(String[] args) {
		function_2();
	}

	
	
	private static void function_2() {
	/*
	 *  ��ǿforѭ����������
	 *  �洢�Զ���Person����	
	 */
		ArrayList<Person> per = new ArrayList<Person>();
		per.add(new Person("С��",18));
		per.add(new Person("С��",20));
		per.add(new Person("С��",20));
		
		for(Person p:per){
			System.out.println(p);
		}
	}



	private static void function_1() {
		//for���ڶ������������ʱ��,�ܵ��ö���ķ���
		String str[] = {"123","add","2e3","c@3423"};
		for (String string : str) {
			System.out.println(string);
		}
	}



	private static void function() {
	/*
	 *  ʵ��forѭ��,��������
	 *  �ô�: ��������,�������������
	 *  �׶�: û������,���ܲ������������Ԫ��
	 */
		int a[] = {1,23,4,3};
		
		for (int i : a) {
			System.out.print(i+" ");
		}
		
	}
	
	
}
