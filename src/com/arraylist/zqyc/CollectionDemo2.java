package com.arraylist.zqyc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  集合中的迭代器:
 *    获取集合中元素方式
 *  接口 Iterator : 两个抽象方法
 *     boolean hasNext() 判断集合中还有没有可以被取出的元素,如果有返回true
 *     next() 取出集合中的下一个元素
 *     
 *  Iterator接口,找实现类.
 *    Collection接口定义方法 
 *       Iterator  iterator()
 *    ArrayList 重写方法 iterator(),返回了Iterator接口的实现类的对象
 *    使用ArrayList集合的对象
 *     Iterator it = array.iterator(),运行结果就是Iterator接口的实现类的对象
 *     it是接口的实现类对象,调用方法 hasNext 和 next 集合元素迭代
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		//集合可以存储任意类型的对象
		//集合中,不指定存储的数据类型, 集合什么都存
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add("uyjgtfd");
		coll.add("123 ddd");
		
//		Iterator it = coll.iterator();
//		while(it.hasNext()){
//			String s = (String) it.next();
//			System.out.println(s);
//		}
		
		//for比while好，it1可以及时释放
		for(Iterator it1 = coll.iterator();it1.hasNext();){
			String s = (String) it1.next();
			System.out.println(s);
		}
	}
}
