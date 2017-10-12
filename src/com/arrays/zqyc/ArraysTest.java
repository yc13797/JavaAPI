package com.arrays.zqyc;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {
	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
	}
	
	public static void test1(){
	/*
	 * ��src������ǰ3��Ԫ�أ����Ƶ�dest�����ǰ3��λ����
	 */
		int src[] = {1,2,3,4,5};
		int dest[] = {6,7,8,9,10};
		System.arraycopy(src, 0, dest, 0, 3);
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]+" ");
		}
	}
	
	public static void test2(){
	/*
	 * ѭ������100-999֮��ĵ���λ�������д�ӡ�������������ܱ�10����ʱ���������еĳ���
	 */
		Random dom = new Random();
		while(true){
			 int d = dom.nextInt(900)+100;
			 if(d%10 != 0){
				 System.out.println(d);
			 }else{
				 System.out.println("==>"+d);
				 System.exit(0);
			 }
		}
	}
	
	public static void test3(){
	/*
	 * ����һ������������һ�����飬�����д洢10��ѧ�����Է������÷���Ҫ�󷵻ؿ��Է�����͵ĺ��������Է�����
	 */
		int[] arr = {56,65,11,98,57,43,16,18,100,200};
		Arrays.sort(arr);
		int b[]	 = new int[3];
		System.arraycopy(arr, 0, b, 0, 3);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);		
		}
	}
}
