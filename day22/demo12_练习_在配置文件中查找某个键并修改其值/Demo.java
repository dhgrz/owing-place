package com.itcast.demo12_��ϰ_�������ļ��в���ĳ�������޸���ֵ;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * ��ϰ����propertiesTest.properties�ļ��У��ҵ�һ������it003,����ҵ�����
 * ֵ�޸�Ϊ��������
 * 
 * ˼·��
 * 1.���ȶ�ȡ�����ļ������������ݶ�ȡ��Properties�����У�
 * 2.����Properties���ϣ�����it003,����ҵ�����ֵ�޸�Ϊ����������
 * 3.��Properties�����е�����д�뵽�ļ��У�
 * 
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		//*******��ȡ�����ļ�**************//
		Properties pro = new Properties();
		Reader in = new FileReader("propertiesTest.properties");
		pro.load(in);
		in.close();
		//�������ϣ��ж�
		Set<String> keySet = pro.stringPropertyNames();
		for(String s : keySet){
			if(s.equals("it003")){
				//����ֵ
				pro.setProperty(s, "������");
				break;
			}
		}
		//����Ĵ�������ҵ����޸ģ�û�ҵ�����ʲô��������
		//����������д���ļ�
		Writer out = new FileWriter("propertiesTest.properties");
		pro.store(out, "login");
		out.close();
		System.out.println("������ɣ�");
	}
}
