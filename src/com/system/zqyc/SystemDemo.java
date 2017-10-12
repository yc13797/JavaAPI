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
		 *  ��ȡ��ǰ����ϵͳ������
		 *  static Properties getProperties() 
		 */
		System.out.println(System.getProperties());
	}
	
	public static void arraySycopy(){
		/*
		 * System�෽��,��������
		 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 * Object src, Ҫ���Ƶ�Դ����
		 * int srcPos, ����Դ����ʼ����
		 * Object dest,���ƺ��Ŀ������
		 * int destPos,Ŀ��������ʼ���� 
		 * int length, ���Ƽ���
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
	 *  JVM���ڴ���,��ȡ���������
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
	 * ����ִ��ʱ��
	 */
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
