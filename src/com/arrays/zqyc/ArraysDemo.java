package com.arrays.zqyc;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *  ����Ĺ�����,��������Ĳ���
 *  java.util.Arrays
 */
public class ArraysDemo {
	public static void main(String[] args) {
//		sortArr();
//		searA();
		toStringA();
	}
	
	public static void toStringA(){
	/*
	 * static String toString(����)
	 *  ���������ַ���
	 */
		int a[] = {2,3,11,15};
		String s = Arrays.toString(a);
		System.out.println(s);
	}
	
	public static void searA(){
	/*
	 * static int binarySearch(����, �����ҵ�Ԫ��)
	 *  ����Ķ���������
	 *  ����Ԫ���������г��ֵ�����
	 *  Ԫ�ز�����, ���ص���  (-�����-1)
	 */
		int a[] = {2,3,5,6,7,11,15};
		int index = Arrays.binarySearch(a, 23);
		System.out.println(index);
	}
	
	public static void sortArr(){
	/*
	 * static void sort(����)
	 *  ��������������,�õ��ǿ�������
	 */
		int a[] = {3,2,5,2,6,7,15,11};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
