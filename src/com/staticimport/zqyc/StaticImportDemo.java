package com.staticimport.zqyc;

import java.util.Arrays;

/*
 * JDK1.5������,��̬����
 * ���ٿ����Ĵ�����
 * ��׼��д��,�������ʱ�����ʹ��
 * 
 * import static java.lang.System.out;��ĩβ,������һ����̬��Ա
 */
import static java.util.Arrays.sort;
public class StaticImportDemo {
	public static void main(String[] args) {
		int a[] = {3,2,1,5,7,8};
		sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
