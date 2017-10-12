package com.stringbuffer.zqyc;

import org.omg.CORBA.OBJ_ADAPTER;

public class StringBufferTest {
	/*
	 * 练习：int[] arr = {34,12,89,68};将一个int[]中元素转成字符串  格式 [34,12,89,68]
	 */
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer();
		int[] a = {34,12,89,68};
		buff.append('[');
		for(int i=0;i<a.length;i++){
			if(i<a.length-1){
				buff.append(a[i]);
				buff.append(',');
			}else{
				buff.append(a[i]);
			}
		}
		buff.append(']');
		System.out.println(buff);
	}
}
