package com.staticimport.zqyc;

import java.util.Arrays;

/*
 * JDK1.5新特性,静态导入
 * 减少开发的代码量
 * 标准的写法,导入包的时候才能使用
 * 
 * import static java.lang.System.out;最末尾,必须是一个静态成员
 */
import static java.util.Arrays.sort;
public class StaticImportDemo {
	public static void main(String[] args) {
		int a[] = {3,2,1,5,7,8};
		sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
