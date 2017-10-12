package com.string.zqyc;
/*
 * String类的查找
 */
public class StringSearch {
	public static void main(String[] args) {
//		intLength();
//		subString();
//		startWith();
//		containString();
//		indexOfString();
		getBytesOfString();
	}
	
	public static void getBytesOfString(){
		/*
		 * getBytes() 
		 *   将字符串转为字节数组，并将结果存储到一个新的 byte 数组中
		 *  
		 */
			String str = "张";
			byte[] by = str.getBytes();
			for(int i=0;i<by.length;i++){
				System.out.println(by[i]);
			}
	}
	
	public static void indexOfString(){
		/*
		 * indexOf(int ch) 
		 *   返回指定字符在此字符串中第一次出现处的索引。
		 *   不存在，返回-1，
		 *  
		 */
			String str = "adfewew.java";
			System.out.println(str.indexOf("e"));
	}
	
	public static void containString(){
		/*
		 * contains(CharSequence s)
		 *  当且仅当此字符串包含指定的 char 值序列时，返回 true。
		 *  
		 */
			String str = "adfewew.java";
			System.out.println(str.contains("adf"));
	}
	
	public static void startWith(){
	/*
	 * startsWith(String prefix)
	 *  测试此字符串是否以指定的前缀开始
	 *  
	 * endsWith(String suffix) 
	 *   测试此字符串是否以指定的后缀结束
	 */
		String str = "adfewew.java";
		System.out.println(str.startsWith("adf"));
		System.out.println(str.endsWith(".java"));
	}
	
	public static void subString(){
	/*
	 * String substring(int beginIndex,int endIndex)
	 * 获取字符串的一部分,包含头，不包含尾
	 * 
	 * String substring(int beginIndex)
	 * 包含头，后面的全要
	 */
		String str = "howareyou";
		String str1 = str.substring(1,5);
		String str2 = str.substring(1);
		System.out.println(str);
		System.out.println(str1);	
		System.out.println(str2);
	}
	
	public static void intLength(){
	/*
	 * int length() 返回字符串的长度
	 */
		String str = "sdawe@3$%Z^&*";
		int length = str.length();
		System.out.println(length);
	}
}
