package com.stringbuffer.zqyc;

public class StringBufferDemo {
	public static void main(String[] args) {
//		appendStrBuff();
//		deleteStrBuff();
//		insertStrBuff();
//		replaceStrBuff();
//		reverseStrBuff();
		toStringStrBuff();
	}
	
	public static void toStringStrBuff(){
		/*
		 * toString() 将可变缓冲区字符对象  转换成不可变的String字符串
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.append(12345);
		System.out.println(buffer.toString());
	}
	
	public static void reverseStrBuff(){
		/*
		 * reverse() 将缓冲区字符 翻转
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.reverse();
		System.out.println(buffer);
	}
	
	public static void replaceStrBuff(){
		/*
		 * replace(int start,int end,String str) 将任意类型字符插入 指定范围的缓冲区字符 
		 * 包含头，不包含尾
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.replace(1, 17, "QQ");
		System.out.println(buffer);
	}
	
	public static void insertStrBuff(){
		/*
		 * insert(int start,任意类型) 将任意类型字符插入 指定索引的缓冲区字符 
		 * 不能超过最大值
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.insert(3, 1.5);
		System.out.println(buffer);
	}
	
	public static void deleteStrBuff(){
		/*
		 * delete(int start,int end) 删除指定的缓冲区字符 
		 * 包含头，不包含尾
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.delete(1,5);
		System.out.println(buffer);
	}
	
	public static void appendStrBuff(){
		/*
		 * StringBuffer类方法
		 * append,将任意类型的数据，添加到缓冲区
		 * append 返回值，return this
		 * 调用者是谁，就返回谁
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append(5).append(true).append(3.14);
		System.out.println(buffer);
	}
}
