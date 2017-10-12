package com.generictest.hotel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  将的酒店员工,厨师,服务员,经理,分别存储到3个集合中
 *  定义方法,可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法
 */
public class GenericTest {
	public static void main(String[] args) {
		ArrayList<ChuShi> chushi = new ArrayList<ChuShi>();
		ArrayList<FuWuYuan> fuwuyuan = new ArrayList<FuWuYuan>();
		ArrayList<JingLi> jingli = new ArrayList<JingLi>();
		
		chushi.add(new ChuShi("老干妈", "后厨001"));
		chushi.add(new ChuShi("老干爹", "后厨002"));
		
		fuwuyuan.add(new FuWuYuan("翠花", "服务部001"));
		fuwuyuan.add(new FuWuYuan("酸菜", "服务部002"));
		
		jingli.add(new JingLi("小名", "董事会001", 123456789.32));
		
		iterator(chushi);
		iterator(fuwuyuan);
		iterator(jingli);
	}
	
	public static void iterator(ArrayList<? extends Employee> coll){
	/*
	 * 定义方法,可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法 work
	 * ? 通配符,迭代器it.next()方法取出来的是Object类型,怎么调用work方法
	 * 强制转换:  it.next()=Object o ==> Employee
	 * 方法参数: 控制,可以传递Employee对象,也可以传递Employee的子类的对象
	 * 泛型的限定  本案例,父类固定Employee,但是子类可以无限?
	 *   ? extends Employee 限制的是父类, 上限限定, 可以传递Employee,传递他的子类对象
	 *   ? super   Employee 限制的是子类, 下限限定, 可以传递Employee,传递他的父类对象
	 */
		Iterator<? extends Employee> it = coll.iterator();
		while(it.hasNext()){
			//获取出的next() 数据类型,是Employee
			Employee e = it.next();
			e.work();
		}
	}
}
