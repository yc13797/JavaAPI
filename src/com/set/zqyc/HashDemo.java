package com.set.zqyc;

/*
 *  对象的哈希值,普通的十进制整数
 *  父类Object,方法 public int hashCode() 计算结果int整数
 *  
 *   两个对象  Person  p1 p2
 *   问题: 如果两个对象的哈希值相同 p1.hashCode()==p2.hashCode()
 *        两个对象的equals一定返回true吗  p1.equals(p2) 一定是true吗
 *        正确答案:不一定,两个对象
 *        
 *        如果两个对象的equals方法返回true,p1.equals(p2)==true
 *        两个对象的哈希值一定相同吗
 *        正确答案: 一定
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
