package com.itcast.demo08_ʵ�ֻ��к�׷��д��;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ʵ�ֻ��У�
 * 
 * ���з���
 * Windows����ϵͳ�£�\r\n
 * Linuxϵͳ�£�\n
 * Macϵͳ�£�\r
 * 
 * ׷��д�룺��FileOutputStream�Ĺ��췽�������ģ�
 * 
 * public FileOutputStream(File file,boolean append)������һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������append - ���Ϊ true�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ�� 
 * public FileOutputStream(String name,boolean append):

 */
public class Demo {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("output2.txt");
			out.write("hellolololololo".getBytes());
			out.write("\r\n".getBytes());
			out.write("world".getBytes());
			out.write("\r\n".getBytes());
			out.write("java".getBytes());
			//�ر���Դ
			out.close();
			System.out.println("д����ϣ�");
			
			//����һ����׷��д���FileOutputStream
			FileOutputStream appendOut = new FileOutputStream("output2.txt",true);
			appendOut.write("aaaaa\r\n".getBytes());
			appendOut.write("bbbb".getBytes());
			appendOut.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
