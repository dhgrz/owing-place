package com.itcast.demo06_IO���ĸ���ͼ��������;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * IO����Input��Output������������ˮ�������Եģ��з���ģ�
 * 
 * ���ࣺ
 * 		�ֽ�����
 * 			�������
 * 			��������
 * 		�ַ�����
 * 			�������
 * 			��������
 * ʲô�����ʹ����������
 * 1.�ֽ�������д�������ļ���ͼƬ����Ƶ�ļ��ȣ�Ҳ���Զ�д�ı��ļ���
 * 2.�ַ�������д�ı��ļ��ģ�
 * 
 * Java��IO������ϵ�ṹ��
 * 		�ֽ�����
 * 			�������OutputStream(����)
 * 			��������InputStream(����)
 * 		�ַ�����
 * 			�������Writer:(����)
 * 			��������Reader:(����)
 * 
 * �򵥵��������ļ�д��һ���ַ�����hello
 * 
 * ������
 * 1.���ļ�д��-->�����-->OutputStream
 * 2.��"�ļ�"д��OutputStream�ǳ����࣬�����á�ʹ���������ࣺFileOutputStream
 * 3.�˽�һ��FileOutputStream
 *   ���췽����
 *   	1.public FileOutputStream(String name)������һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
 *   	2.public FileOutputStream(File file)������һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
 */
public class Demo {
	public static void main(String[] args) {
		try {
			//����ļ������ڣ����Զ�����һ�����ļ���
			//ʹ�õľ���·��
		//	FileOutputStream out = new FileOutputStream("D:\\day20FileTest.txt");
			//ʹ�����·��������Ŀ��Ŀ¼��
		//	FileOutputStream out2 = new FileOutputStream("day20FileTest.txt");
			
			//ʹ��File
			File file = new File("D:\\day20FileTest.txt");
			FileOutputStream out3 = new FileOutputStream(file);
			
			File file2 = new File("day20FileTest2.txt");
			FileOutputStream out4 = new FileOutputStream(file2);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
