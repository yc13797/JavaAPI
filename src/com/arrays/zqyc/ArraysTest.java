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
	 * 将src数组中前3个元素，复制到dest数组的前3个位置上
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
	 * 循环生成100-999之间的的三位数并进行打印该数，当该数能被10整除时，结束运行的程序
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
	 * 定义一个方法，接收一个数组，数组中存储10个学生考试分数，该方法要求返回考试分数最低的后三名考试分数。
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
