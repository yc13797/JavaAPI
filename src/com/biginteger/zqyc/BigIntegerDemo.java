package com.biginteger.zqyc;

import java.math.BigInteger;

/*
 *  ���������������
 *    ����longȡֵ��Χ����,��װ��BigInteger���͵Ķ���
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
//		bigI();
		ysI();
	}
	
	public static void ysI(){
	/**
	 *  BigInteger�������������
	 *  ���÷�������,������Ҳֻ����BigInteger����
	 */
		BigInteger b = new BigInteger("2342323423423423432432436");
		BigInteger b1 = new BigInteger("53242342323423423423432432436");
		BigInteger bAdd = b.add(b1);//�ӷ�
		System.out.println(bAdd);
		
		BigInteger bSub = b1.subtract(b);//����
		System.out.println(bSub);
		
		 //����b1*b2����ĳ˻�,���÷���multiply
		 BigInteger bigMul = b1.multiply(b);
		 System.out.println(bigMul);
		 
		//����b2/b1������,���÷���divied
		 BigInteger bigDiv = b1.divide(b);
		 System.out.println(bigDiv);		 
	}
	
	public static void bigI(){
	/**
	 * BigInteger��Ĺ��췽��
	 * �����ַ���,Ҫ�����ָ�ʽ,û�г�������
	 */
		BigInteger b = new BigInteger("53242342323423423423432432432");
		System.out.println(b);
		BigInteger b1 = new BigInteger("532423243242675687342323423423423432432432");
		System.out.println(b1);
	}
}
