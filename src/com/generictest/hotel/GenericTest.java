package com.generictest.hotel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  ���ľƵ�Ա��,��ʦ,����Ա,����,�ֱ�洢��3��������
 *  ���巽��,����ͬʱ����3����,�����������ϵ�ͬʱ,���Ե��ù�������
 */
public class GenericTest {
	public static void main(String[] args) {
		ArrayList<ChuShi> chushi = new ArrayList<ChuShi>();
		ArrayList<FuWuYuan> fuwuyuan = new ArrayList<FuWuYuan>();
		ArrayList<JingLi> jingli = new ArrayList<JingLi>();
		
		chushi.add(new ChuShi("�ϸ���", "���001"));
		chushi.add(new ChuShi("�ϸɵ�", "���002"));
		
		fuwuyuan.add(new FuWuYuan("�仨", "����001"));
		fuwuyuan.add(new FuWuYuan("���", "����002"));
		
		jingli.add(new JingLi("С��", "���»�001", 123456789.32));
		
		iterator(chushi);
		iterator(fuwuyuan);
		iterator(jingli);
	}
	
	public static void iterator(ArrayList<? extends Employee> coll){
	/*
	 * ���巽��,����ͬʱ����3����,�����������ϵ�ͬʱ,���Ե��ù������� work
	 * ? ͨ���,������it.next()����ȡ��������Object����,��ô����work����
	 * ǿ��ת��:  it.next()=Object o ==> Employee
	 * ��������: ����,���Դ���Employee����,Ҳ���Դ���Employee������Ķ���
	 * ���͵��޶�  ������,����̶�Employee,���������������?
	 *   ? extends Employee ���Ƶ��Ǹ���, �����޶�, ���Դ���Employee,���������������
	 *   ? super   Employee ���Ƶ�������, �����޶�, ���Դ���Employee,�������ĸ������
	 */
		Iterator<? extends Employee> it = coll.iterator();
		while(it.hasNext()){
			//��ȡ����next() ��������,��Employee
			Employee e = it.next();
			e.work();
		}
	}
}
