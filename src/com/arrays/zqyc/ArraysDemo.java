package com.arrays.zqyc;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *  数组的工具类,包含数组的操作
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
	 * static String toString(数组)
	 *  将数组变成字符串
	 */
		int a[] = {2,3,11,15};
		String s = Arrays.toString(a);
		System.out.println(s);
	}
	
	public static void searA(){
	/*
	 * static int binarySearch(数组, 被查找的元素)
	 *  数组的二分搜索法
	 *  返回元素在数组中出现的索引
	 *  元素不存在, 返回的是  (-插入点-1)
	 */
		int a[] = {2,3,5,6,7,11,15};
		int index = Arrays.binarySearch(a, 23);
		System.out.println(index);
	}
	
	public static void sortArr(){
	/*
	 * static void sort(数组)
	 *  对数组升序排列,用的是快速排序法
	 */
		int a[] = {3,2,5,2,6,7,15,11};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
