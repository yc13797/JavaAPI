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
	 * 重写父类equals方法，
	 * 不改变父类方法，equals比较的是两个对象的内存地址
	 * 
	 * 两个对象比较地址，没有意义，一般都是false
	 * 比较对象的成员变量，age
	 */
//	public boolean equals(Object obj){
//		return this == obj ;
//	}
	
	/*
	 * 重写父类equals,自己设置比较方法
	 * 比较age是否相等
	 */
	public boolean equals(Object obj){
		//Object 可以传所有类型的参数
		//obj接受的是prison类型才能转,程序健壮性
		//onj是p1本身时，
		//增加的两个if可以不写，但是这样写可以提高程序执行效率
		//对obj进行类型的向下转型，obj转为Person
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
	 * 重写父类中的toString
	 * 在方法中return所以类的成员变量的值
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
