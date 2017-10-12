package com.set.zqyc;

public class Person extends Object{
	private String name="" ;
	private int age ;
	
	public int hashCode(){
	/*
	 * û������д����,ÿ�����н�����ǲ�ͬ����
	 *  ���������д����ķ���,��ϣֵ,�Զ����
	 *  �洢��HashSet���ϵ�����
	 */
		return name.hashCode()+age*55;
	}
	
	public Person(){		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}		
	
	/*
	 * ��д�����е�toString
	 * �ڷ�����return������ĳ�Ա������ֵ
	 */
	public String toString(){
		return name+age;
	}
	
	public boolean equals(Object obj){
	//����equals��д����,��֤�͸�����ͬ
	//public boolean equals(Object obj){}
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Person){
			Person p = (Person)obj;
			return name.equals(p.name) && age==p.age;
		}
		return false;
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
