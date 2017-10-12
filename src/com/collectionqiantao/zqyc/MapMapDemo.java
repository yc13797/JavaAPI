package com.collectionqiantao.zqyc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的嵌套,Map中存储的还是Map集合
 * 要求:
 *    实训  
 *      Java基础班
 *        001  张三
 *        002  李四
 *      
 *      Java就业班
 *        001  王五
 *        002  赵六
 *   对以上数据进行对象的存储
 *   001 张三  键值对
 *   Java基础班: 存储学号和姓名的键值对
 *   Java就业班:
 *   实训: 存储的是班级
 *   
 *   基础班Map   <学号,姓名>
 *   实训Map  <班级名字, 基础班Map>
 */
public class MapMapDemo {
	public static void main(String[] args) {
		//定义基础班集合
		HashMap<String, String> javase = new HashMap<String, String>();
		//定义就业班集合
		HashMap<String, String> javaee = new HashMap<String, String>();
		javase.put("001", "张三");
		javase.put("002", "李四");
		
		javaee.put("001", "王五");
		javaee.put("002", "赵六");
		
		HashMap<String, HashMap<String,String>> bj = new HashMap<String, 
				HashMap<String,String>>();
		bj.put("基础班", javase);
		bj.put("就业班", javaee);
		
		keySet(bj);
		entrySet(bj);
	}
	
	public static void entrySet(HashMap<String,HashMap<String,String>> bj){
		//调用bj集合方法entrySet方法,将bj集合的键值对关系对象,存储到Set集合
		Set<Map.Entry<String, HashMap<String,String>>> 
		                         classNameSet = bj.entrySet();
		//迭代器迭代Set集合
		Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next方法,取出的是bj集合的键值对关系对象
			Map.Entry<String, HashMap<String,String>> classNameEntry =  classNameIt.next();
			//classNameEntry方法 getKey,getValue
			String classNameKey = classNameEntry.getKey();
			//获取值,值是一个Map集合
			HashMap<String,String> classMap = classNameEntry.getValue();
			//调用班级集合classMap方法entrySet,键值对关系对象存储Set集合
			Set<Map.Entry<String, String>> studentSet = classMap.entrySet();
			//迭代Set集合
			Iterator<Map.Entry<String, String>> studentIt = studentSet.iterator();
			while(studentIt.hasNext()){
				//studentIt方法next获取出的是班级集合的键值对关系对象
				Map.Entry<String, String> studentEntry = studentIt.next();
				//studentEntry方法 getKey getValue
				String numKey = studentEntry.getKey();
				String nameValue = studentEntry.getValue();
				System.out.println(classNameKey+".."+numKey+".."+nameValue);
			}
		}
			System.out.println("==================================");
		
//		for (Map.Entry<String, HashMap<String, String>> me : bj.entrySet()) {
//			String classNameKey = me.getKey();
//			HashMap<String, String> numNameMapValue = me.getValue();
//			for (Map.Entry<String, String> nameMapEntry : numNameMapValue.entrySet()) {
//				String numKey = nameMapEntry.getKey();
//				String nameValue = nameMapEntry.getValue();
//				System.out.println(classNameKey + ".." + numKey + ".." + nameValue);
//			}
//		}
	}
	
	public static void keySet(HashMap<String, HashMap<String, String>> bj){
		//调用bj集合方法keySet将键存储到Set集合
		Set<String> classN = bj.keySet();
		//迭代Set集合
		Iterator<String> className = classN.iterator();
		while(className.hasNext()){
			//classNameIt.next获取出来的是Set集合元素,bj集合的键
			String classNameKey = className.next();
			//bj集合的方法get获取值,值是一个HashMap集合
			HashMap<String, String> classMap = bj.get(classNameKey);
			//调用classMap集合方法keySet,键存储到Set集合
			Set<String> stuNum = classMap.keySet();
			Iterator<String> stu = stuNum.iterator();
			while(stu.hasNext()){
				String numKey = stu.next();
				String numValue = classMap.get(numKey);
				System.out.println(classNameKey+"..."+numKey+"..."+numValue);
			}
		}
		
		
//		for(String className:bj.keySet()){
//			HashMap<String, String> classN = bj.get(className);
//			for(String num:classN.keySet()){
//				String numvalue = classN.get(num);
//				System.out.println(className+"..."+num+"..."+numvalue);
//			}
//		}
	}
}
