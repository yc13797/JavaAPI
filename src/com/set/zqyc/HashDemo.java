package com.set.zqyc;

/*
 *  ����Ĺ�ϣֵ,��ͨ��ʮ��������
 *  ����Object,���� public int hashCode() ������int����
 *  
 *   ��������  Person  p1 p2
 *   ����: �����������Ĺ�ϣֵ��ͬ p1.hashCode()==p2.hashCode()
 *        ���������equalsһ������true��  p1.equals(p2) һ����true��
 *        ��ȷ��:��һ��,��������
 *        
 *        ������������equals��������true,p1.equals(p2)==true
 *        ��������Ĺ�ϣֵһ����ͬ��
 *        ��ȷ��: һ��
 */
public class HashDemo {
	public static void main(String[] args) {
		Person p = new Person();
		int i = p.hashCode();
		System.out.println(i);
	
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
