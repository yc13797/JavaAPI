package com.staticimport.zqyc;

/*
 * JDK1.5�µ�����,�����Ŀɱ����
 *  ǰ��: ����������������ȷ��,�����ĸ�������
 *  �ɱ�����﷨: ��������...������
 *  �ɱ����,���ʾ���һ������
 */
public class VarArgumentsDemo {
	
	public static void main(String[] args) {
		System.out.println(getSum(1,2,3,4,5,6,7));
	}
	
	/*
	 * �ɱ������ע������
	 * 1. һ��������,�ɱ����ֻ����һ��
	 * 2. �ɱ����,����д�ڲ����б�����һλ
	 */
	public static int getSum(int...a){
		int sum = 0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;
	}
}
