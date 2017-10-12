package com.math.zqyc;

/*
 *  数学计算的工具类
 *  java.lang.Math 静态方法组成
 */
public class MathDemo {
	public static void main(String[] args) {
//		absM();
//		ceilM();
//		function_2();
//		powM();
//		sqrtM();
//		randomM();
		roundM();
	}

	public static void roundM(){
	/*
	 * static double round(doubl d)
	 *  获取参数的四舍五入,取整数
	 *  方法 +0.5强转int 再转double
	 */
		double i = Math.round(5.3);
		System.out.println(i);
	}
	
	public static void randomM(){
	/*
	 * static double random() 返回随机数 0.0-1.0之间
	 *  来源,也是Random类	
	 */
		for(int i=0;i<10;i++){
			double d = Math.random();
			System.out.println(d);
		}
	}
	
	public static void sqrtM(){
	/*
	 * static double sqrt(double d)
	 * 返回参数的平方根
	 * 负数返回NaN
	 */
		double i = Math.sqrt(-2);
		System.out.println(i);
	}
	
	public static void powM(){
	/*
	 * static double pow(double a, double b)
	 * a的b次方
	 */
		double i = Math.pow(2, 3);
		System.out.println(i);
	}
	
	public static void function_2(){
		/*
		 * static double floor(double d)
		 * 返回小于或者等于参数d的最大整数
		 */
		double d = Math.floor(1.5);
		System.out.println(d);
	}	
	
	public static void ceilM(){
		/*
		 *  static double ceil(double d)
		 *  返回大于或者等于参数d的最小整数
		 */	
		double i = Math.ceil(-12.3);
		System.out.println(i);
	}
	
	
	public static void absM(){
	/*
	 *  static int abs(int i)
	 *  获取参数的绝对值
	 */		
		double i = Math.abs(-9.2);
		System.out.println(i);
	}
}
