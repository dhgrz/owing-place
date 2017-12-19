package com.itcast.demo11_Properties���������ļ�;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * Properties����������ļ���ʹ�ô�����������ļ��Ƿǳ����㣬�����Լ�ȥһ��һ�е�ȥ��������һ��һ�еĽ�����
 * 	public void load(Reader reader)����ȡ
	public void store(Writer writer,String comments)��д��

 */
public class Demo {
	public static void main(String[] args) {
		try {
		//	write();
			read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ϣ�");
	}

	private static void read() throws IOException {
		Properties pro = new Properties();
		//��ȡ��ʹ�ã�load
		Reader in = new FileReader("propertiesTest.properties");
		
		//load
		pro.load(in);//��in�ж�ȡ�ļ��ڵ����ݣ����ҷֽ�ÿһ�е����ݣ�Ȼ��洢��Properties��
		
		//����Properties
		Set<String> keySet = pro.stringPropertyNames();
		for(String s : keySet){
			System.out.println("����" + s + " ֵ��" + pro.getProperty(s));
		}
		
	}

	private static void write() throws IOException {
		//1.ʵ����һ�����ϣ�Properties
		Properties pro = new Properties();
		//2.Ϊ��������һЩ����ֵ����Щ����ֵ����д�뵽�ļ���
		pro.setProperty("it001", "������");
		pro.setProperty("it002", "�˳�");
		pro.setProperty("it003", "֣��");
		
		//3.д���ļ���store����
		Writer out = new FileWriter("propertiesTest.properties");
		pro.store(out, "login");
		
		//4.�ر���Դ
		//��Ҫȥ�ر�Properties����������
		out.close();
		
		
	}
}
