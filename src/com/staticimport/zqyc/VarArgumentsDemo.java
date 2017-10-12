package com.staticimport.zqyc;

/*
 * JDK1.5新的特性,方法的可变参数
 *  前提: 方法参数数据类型确定,参数的个数任意
 *  可变参数语法: 数据类型...变量名
 *  可变参数,本质就是一个数组
 */
public class VarArgumentsDemo {
	
	public static void main(String[] args) {
		System.out.println(getSum(1,2,3,4,5,6,7));
	}
	
	/*
	 * 可变参数的注意事项
	 * 1. 一个方法中,可变参数只能有一个
	 * 2. 可变参数,必须写在参数列表的最后一位
	 */
	public static int getSum(int...a){
		int sum = 0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;
	}
}
