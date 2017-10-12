package com.integer.zqyc;
/*
 *   JDK1.5后出现的特性,自动装箱和自动拆箱
 *   自动装箱: 基本数据类型,直接变成对象
 *   自动拆箱: 对象中的数据变回基本数据类型
 *   
 *   自动装箱,拆箱的 好处: 基本类型和引用类直接运算
 *   自动装箱和拆箱弊端,可能出现空指针异常
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		function_1();
	}
	
	public static void function_1(){
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i==j);// false 对象地址
		System.out.println(i.equals(j));// true  继承Object重写equals,比较的对象数据
		
		System.out.println("===================");
		Integer a = 500;
		Integer b = 500;
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		System.out.println("===================");
		//数据在byte范围内,JVM不会重新new对象
		Integer aa = 127; // Integer aa = new Integer(127)
		Integer bb = 127; // Integer bb = aa;
		System.out.println(aa==bb); //true
		System.out.println(aa.equals(bb));//true
	}
	
	public static void function(){
		//引用类型 , 引用变量一定指向对象
		//自动装箱, 基本数据类型1, 直接变成了对象
				
		Integer in = 1; // Integer in = new Integer(1)
		//Integer in = null  出现空指针异常
		//in 是引用类型,不能和基本类型运算, 自动拆箱,引用类型in,转换基本类型
				
		//in+1  ==> in.inValue()+1 = 2    
		// in = 2    自动装箱
		in = in + 1;
				
		System.out.println(in);
	}
}
