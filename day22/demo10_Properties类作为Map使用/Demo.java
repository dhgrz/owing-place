package com.itcast.demo10_Properties����ΪMapʹ��;

import java.util.Properties;
import java.util.Set;

/*
 * java.util.Properties�����ڲ��������ļ���
 * 
 * 1.��������Hashtable������Properties����һ��Map
 * 2.���еķ�����Properties�еļ���ֵ����String���ͣ�
 * 		public Object setProperty(String key,String value)
		public String getProperty(String key)
		public Set<String> stringPropertyNames()

 * 
 */
public class Demo {
	public static void main(String[] args) {
		//��Properties��ΪMapʹ��
		Properties pro = new Properties();
		//��伯��
		pro.put("it001", "����");
		pro.put("it002", "����");
		pro.put("it003", "����");
		
		//��������
		Set keySet = pro.keySet();
		
		for(Object obj : keySet){
			System.out.println("����" + obj + " ֵ��" + pro.get(obj));
		}
		
		//����Properties�����з�����
		//setProperties(String key,String value):���൱��Map��put()����
		Properties pro2 = new Properties();
		pro2.setProperty("it004", "������");
		pro2.setProperty("it005", "�˳�");
		pro2.setProperty("it006", "�º�");
		
		//ͨ��ĳ������ȡֵ��getProperties()�����൱��Map��get()����
		String v1 = pro2.getProperty("it005");
		System.out.println("v1 = " + v1);
		
		//����
		//stringPropertyNames()�����൱��Map��keySet()����
		Set<String> keySet2 = pro2.stringPropertyNames();
		for(String s : keySet2){
			System.out.println("����" + s + " ֵ��" + pro2.getProperty(s));
		}
		
		
		
		
	}
}
