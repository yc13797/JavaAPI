package com.string.zqyc;

public class StringDemo2 {
/*
* String类的构造方法有多种
*/
	public static void main(String[] args) {
//		byteString();
//		charString();
	}
	

	
	public static void charString(){
	/*
	 * String(char[] value)
	* 将字符数组，转成字符串，字符串的参数，不查询编码表
	* String(char[] value, int offset, int count)
	* 将字符数组一部分转成字符串，offset开始索引，count个数
	*/		
		char a[] = {'a','b','c','d','e','f'};
		String str = new String(a);
		System.out.println(str);
		String str1 = new String(a,1,4);
		System.out.println(str1);
	}
	
	public static void byteString(){
	/*
	* String(byte[] bytes) 
	* 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
	* 平台:指的是操作系统
	* 默认字符集：操作系统中的默认编码表，默认编码表是GBK简体中文
	* 将字符数组中的每个字节，查询编码表，得到的结果
	* 负数表示汉字，一个汉字两个字节
	* 
	* String(byte[] bytes, int offset, int length)
	* 字节数组的一部分 offset起始索引  length个数
	*/	
		byte[] byt = {97,98,99,100};
		String str = new String(byt);
		System.out.println(str);
		String str1 = new String(byt,1,2);
		System.out.println(str1);
	}
}
