package com.arraylist.zqyc;

import java.util.ArrayList;

/*
 *  ������ϵ,
 *    Ŀ��  ���ϱ�����һ���洢������:
 *       ����ʹ�ü��ϴ洢����
 *       ��������,ȡ������
 *       �����Լ�������
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 *  ����ArrayList,�洢int������
		 *  ���ϱ������ܻ�����,�Զ�װ��洢
		 */
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		//���ϴ洢�Զ����Person��Ķ���
		ArrayList<Person> arrPer = new ArrayList<Person>();
		arrPer.add(new Person("����",18));
		arrPer.add(new Person("����",19));
		arrPer.add(new Person("����",17));
		for(int i=0;i<arrPer.size();i++){
			//get(0),ȡ���Ķ���Person����
			//��ӡ����һ������,������õ�toString()
			System.out.println(arrPer.get(i));
		}
	}
}
