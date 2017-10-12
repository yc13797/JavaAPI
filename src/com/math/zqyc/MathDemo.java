package com.math.zqyc;

/*
 *  ��ѧ����Ĺ�����
 *  java.lang.Math ��̬�������
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
	 *  ��ȡ��������������,ȡ����
	 *  ���� +0.5ǿתint ��תdouble
	 */
		double i = Math.round(5.3);
		System.out.println(i);
	}
	
	public static void randomM(){
	/*
	 * static double random() ��������� 0.0-1.0֮��
	 *  ��Դ,Ҳ��Random��	
	 */
		for(int i=0;i<10;i++){
			double d = Math.random();
			System.out.println(d);
		}
	}
	
	public static void sqrtM(){
	/*
	 * static double sqrt(double d)
	 * ���ز�����ƽ����
	 * ��������NaN
	 */
		double i = Math.sqrt(-2);
		System.out.println(i);
	}
	
	public static void powM(){
	/*
	 * static double pow(double a, double b)
	 * a��b�η�
	 */
		double i = Math.pow(2, 3);
		System.out.println(i);
	}
	
	public static void function_2(){
		/*
		 * static double floor(double d)
		 * ����С�ڻ��ߵ��ڲ���d���������
		 */
		double d = Math.floor(1.5);
		System.out.println(d);
	}	
	
	public static void ceilM(){
		/*
		 *  static double ceil(double d)
		 *  ���ش��ڻ��ߵ��ڲ���d����С����
		 */	
		double i = Math.ceil(-12.3);
		System.out.println(i);
	}
	
	
	public static void absM(){
	/*
	 *  static int abs(int i)
	 *  ��ȡ�����ľ���ֵ
	 */		
		double i = Math.abs(-9.2);
		System.out.println(i);
	}
}
