package com.itcast.demo09_�ļ�д����쳣����;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ļ�д����쳣����
 */
public class Demo {
	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("output2.txt",true);
			out.write("hello".getBytes());
			
		} catch (FileNotFoundException e) {
			System.out.println("����ϵͳ�ļ�ʧ�ܣ�����ϵͳ����Ա��ϵ��");
		} catch (IOException e) {
			System.out.println("��ȡ��д��ϵͳ�ļ�ʧ�ܣ�����ϵͳ����Ա��ϵ��");
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				System.out.println("��ͼ�ر�ϵͳ�ļ�������ʱ�����쳣������ϵͳ����Ա��ϵ��");
			}
		}
		
	}
}
