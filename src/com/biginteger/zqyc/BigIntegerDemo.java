package com.biginteger.zqyc;

import java.math.BigInteger;

/*
 *  超级大的整数运算
 *    超过long取值范围整数,封装成BigInteger类型的对象
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
//		bigI();
		ysI();
	}
	
	public static void ysI(){
	/**
	 *  BigInteger对象的四则运算
	 *  调用方法计算,计算结果也只能是BigInteger对象
	 */
		BigInteger b = new BigInteger("2342323423423423432432436");
		BigInteger b1 = new BigInteger("53242342323423423423432432436");
		BigInteger bAdd = b.add(b1);//加法
		System.out.println(bAdd);
		
		BigInteger bSub = b1.subtract(b);//减法
		System.out.println(bSub);
		
		 //计算b1*b2对象的乘积,调用方法multiply
		 BigInteger bigMul = b1.multiply(b);
		 System.out.println(bigMul);
		 
		//计算b2/b1对象商,调用方法divied
		 BigInteger bigDiv = b1.divide(b);
		 System.out.println(bigDiv);		 
	}
	
	public static void bigI(){
	/**
	 * BigInteger类的构造方法
	 * 传递字符串,要求数字格式,没有长度限制
	 */
		BigInteger b = new BigInteger("53242342323423423423432432432");
		System.out.println(b);
		BigInteger b1 = new BigInteger("532423243242675687342323423423423432432432");
		System.out.println(b1);
	}
}
