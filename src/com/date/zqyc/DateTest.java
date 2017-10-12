package com.date.zqyc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		bitDay();
//		function_1();
	}
	
	/*
	 *  闰年计算
	 *  2000 3000
	 *  高级的算法: 日历设置到指定年份的3月1日,add向前偏移1天,获取天数,29闰年
	 */
	public static void function_1(){
		Calendar c = Calendar.getInstance();
		//将日历,设置到指定年的3月1日
		c.set(2016, 2, 1);
		//日历add方法,向前偏移1天
		c.add(Calendar.DAY_OF_MONTH, -1);
		//get方法获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		if(day == 29)
			System.out.println("闰年");
		else
			System.out.println("平年");
	}
	
	public static void bitDay() throws ParseException{
	/*
	 * 求出自己已经出生多少天
	 */
		System.out.println("输入出生日期(格式yyyy-MM-dd):");
		Scanner getBir = new Scanner(System.in);
		String bid = getBir.next();
		getBir.close();
		SimpleDateFormat bir = new SimpleDateFormat("yyyy-MM-dd");
		Date day = bir.parse(bid);
		
		Date today = new Date();
		
		long birsed = day.getTime();
		long tosed = today.getTime();
		long second = tosed-birsed;
		if(second>0)
			System.out.println(second/1000/60/60/24);
		else
			System.out.println("还没出生");
	}
}
