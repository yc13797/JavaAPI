package com.date.zqyc;

import java.util.Date;

/*
 * 时间和日期类
 * java.util.Date
 * 毫秒级别
 * 
 * 毫秒的0点 System.currentTimeMillis() 返回long类型值
 * 		获取当前日期的毫秒值 1502332265669
 * 		时间原点 ：1970.1.1 午夜0点0分0秒  毫秒值为0;
 * 
 * 重要: 时间的计算，必须要用毫秒值
 */
public class DateDemo {
	public static void main(String[] args) {
//		dateK();
//		dateL();
//		getT();
		setT();
	}

	public static void setT(){
	/*
	 * Date的setTime()方法，传毫秒值
	 * 将毫秒值转换成日期
	 * 利用  Date(long)也可以实现
	 */
		Date date = new Date();
		System.out.println(date);
		date.setTime(0);
		System.out.println(date);
	}	
	
	public static void getT(){
	/*
	 * Date的getTime()方法，返回值long
	 * 返回一个毫秒值
	 * 将日期转换成毫秒值
	 */
		Date date = new Date();
		System.out.println(date.getTime());
	}	
	
	public static void dateL(){
	/*
	 * Date的long参数构造器  Date(long) 表示的是毫秒值
	 * 传递一个毫秒值，转为对应的日期
	 */
		Date date = new Date(989499643992245424L);
		System.out.println(date);
	}
	
	public static void dateK(){
	/*
	 * Date的空参构造器  获取的是当前操作系统的日期和时间
	 */
		Date date = new Date();
		System.out.println(date);
	}
}
