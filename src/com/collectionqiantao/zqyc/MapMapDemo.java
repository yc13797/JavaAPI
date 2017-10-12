package com.collectionqiantao.zqyc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵ�Ƕ��,Map�д洢�Ļ���Map����
 * Ҫ��:
 *    ʵѵ  
 *      Java������
 *        001  ����
 *        002  ����
 *      
 *      Java��ҵ��
 *        001  ����
 *        002  ����
 *   ���������ݽ��ж���Ĵ洢
 *   001 ����  ��ֵ��
 *   Java������: �洢ѧ�ź������ļ�ֵ��
 *   Java��ҵ��:
 *   ʵѵ: �洢���ǰ༶
 *   
 *   ������Map   <ѧ��,����>
 *   ʵѵMap  <�༶����, ������Map>
 */
public class MapMapDemo {
	public static void main(String[] args) {
		//��������༯��
		HashMap<String, String> javase = new HashMap<String, String>();
		//�����ҵ�༯��
		HashMap<String, String> javaee = new HashMap<String, String>();
		javase.put("001", "����");
		javase.put("002", "����");
		
		javaee.put("001", "����");
		javaee.put("002", "����");
		
		HashMap<String, HashMap<String,String>> bj = new HashMap<String, 
				HashMap<String,String>>();
		bj.put("������", javase);
		bj.put("��ҵ��", javaee);
		
		keySet(bj);
		entrySet(bj);
	}
	
	public static void entrySet(HashMap<String,HashMap<String,String>> bj){
		//����bj���Ϸ���entrySet����,��bj���ϵļ�ֵ�Թ�ϵ����,�洢��Set����
		Set<Map.Entry<String, HashMap<String,String>>> 
		                         classNameSet = bj.entrySet();
		//����������Set����
		Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next����,ȡ������bj���ϵļ�ֵ�Թ�ϵ����
			Map.Entry<String, HashMap<String,String>> classNameEntry =  classNameIt.next();
			//classNameEntry���� getKey,getValue
			String classNameKey = classNameEntry.getKey();
			//��ȡֵ,ֵ��һ��Map����
			HashMap<String,String> classMap = classNameEntry.getValue();
			//���ð༶����classMap����entrySet,��ֵ�Թ�ϵ����洢Set����
			Set<Map.Entry<String, String>> studentSet = classMap.entrySet();
			//����Set����
			Iterator<Map.Entry<String, String>> studentIt = studentSet.iterator();
			while(studentIt.hasNext()){
				//studentIt����next��ȡ�����ǰ༶���ϵļ�ֵ�Թ�ϵ����
				Map.Entry<String, String> studentEntry = studentIt.next();
				//studentEntry���� getKey getValue
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
		//����bj���Ϸ���keySet�����洢��Set����
		Set<String> classN = bj.keySet();
		//����Set����
		Iterator<String> className = classN.iterator();
		while(className.hasNext()){
			//classNameIt.next��ȡ��������Set����Ԫ��,bj���ϵļ�
			String classNameKey = className.next();
			//bj���ϵķ���get��ȡֵ,ֵ��һ��HashMap����
			HashMap<String, String> classMap = bj.get(classNameKey);
			//����classMap���Ϸ���keySet,���洢��Set����
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
