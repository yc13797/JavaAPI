package com.equals.zqyc;

public class Person extends Object{
	private String name="" ;
	private int age ;
	
	public Person(){		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * ��д����equals������
	 * ���ı丸�෽����equals�Ƚϵ�������������ڴ��ַ
	 * 
	 * ��������Ƚϵ�ַ��û�����壬һ�㶼��false
	 * �Ƚ϶���ĳ�Ա������age
	 */
//	public boolean equals(Object obj){
//		return this == obj ;
//	}
	
	/*
	 * ��д����equals,�Լ����ñȽϷ���
	 * �Ƚ�age�Ƿ����
	 */
	public boolean equals(Object obj){
		//Object ���Դ��������͵Ĳ���
		//obj���ܵ���prison���Ͳ���ת,����׳��
		//onj��p1����ʱ��
		//���ӵ�����if���Բ�д����������д������߳���ִ��Ч��
		//��obj�������͵�����ת�ͣ�objתΪPerson
		if(this == obj){
			return true;
		}
		
		if(obj == null){
			return false;
		}
		
		if(obj instanceof Person){
			Person p = (Person)obj;
			return this.age == p.age ;
		}
		return false;
	}
	
	
	/*
	 * ��д�����е�toString
	 * �ڷ�����return������ĳ�Ա������ֵ
	 */
	public String toString(){
		return name+age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
