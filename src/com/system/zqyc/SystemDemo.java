package com.system.zqyc;

public class SystemDemo {
	public static void main(String[] args) {
//		show();
//		gc();
//		getOsinfo();
		arraySycopy();
	}
	
	public static void getOsinfo(){
		/*
		 *  获取当前操作系统的属性
		 *  static Properties getProperties() 
		 */
		System.out.println(System.getProperties());
	}
	
	public static void arraySycopy(){
		/*
		 * System类方法,复制数组
		 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 * Object src, 要复制的源数组
		 * int srcPos, 数组源的起始索引
		 * Object dest,复制后的目标数组
		 * int destPos,目标数组起始索引 
		 * int length, 复制几个
		 */
		int a[] = {1,2,3,4,5,6};
		int b[] = {32,33,34,35,36};
		System.arraycopy(a, 1, b, 1, 3);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
	
	public static void gc(){
	/*
	 *  JVM在内存中,收取对象的垃圾
	 *  static void gc()
	 */
		new Person();
		new Person();
		new Person();
		new Person();
		System.gc();
	}
	
	public static void show(){
	/*
	 * 程序执行时间
	 */
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
