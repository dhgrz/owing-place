package com.itcast.demo09_�����������ַ���_BufferedWriter��BufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����������ַ�����
 * 
 * �������BufferedWriter:���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * 	   ���캯����
 * 		BufferedWriter(Writer out)�� ����һ��ʹ��Ĭ�ϴ�С����������Ļ����ַ�������� 

 * ��������BufferedReader:���ַ��������ж�ȡ�ı�����������ַ����Ӷ��ṩ�ַ���������еĸ�Ч��ȡ�� 
 * 	 ���캯����
 * 		BufferedReader(Reader in)�� ����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ���������
 */
public class Demo {
	public static void main(String[] args) {
		//1.����һ��BufferedWriter
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("d.txt"));
			//д�����ݣ�һ���ľ���5��д��ķ���
			//����ʹ��д���ַ���
			out.write("Hellojava�й����");
			//3.�ͷ���Դ
			out.close();
			
			//����һ��������
			BufferedReader in = new BufferedReader(new FileReader("d.txt"));
			//һ�ζ�ȡһ���ַ�
			/*int n = in.read();
			System.out.println("��ȡ��intֵ��" + n);
			System.out.println("��ȡ���ַ���" + (char)n);*/
			//һ�ζ�ȡһ���ַ�����
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1){
				System.out.println(new String(charArray,0,len));
			}
			//�ͷ���Դ
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
