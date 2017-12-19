package com.itcast.demo19_�����������_BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ͨ��һ�ζ�ȡһ���ֽ����飬������鵽���ֽ�������ڶ�ȡЧ�ʵ�Ӱ�졣
 * ������ֽ�������൱��һ��"������"
 * 
 * ��Java����У�Ϊ�����ṩ���ֽڶ�д�Ĵ����������ࣺ
 * �������BufferedOutputStream:����ʵ�ֻ�����������
 * ��������BufferedInputStream
 * 
 * �������BufferedOutputStream
 * ���췽����
 * 1.public BufferedOutputStream(OutputStream out)��ʹ��һ��OutputStream�����죻
 *   ʵ���ϻ�����FileOutputStream�ṩ�������BufferedOutputStream�ṩ�˻�������
 * 
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.����һ������
		 
		try {
			/*FileOutputStream fileOut = new FileOutputStream("buf.txt");
			BufferedOutputStream out = new BufferedOutputStream(fileOut);*/
			
			BufferedOutputStream out = new BufferedOutputStream(
											new FileOutputStream("buf.txt"));
			out.write("hello".getBytes());
			//�����������������write()֮��һ��Ҫflush()��close()�����ܽ�������������д���ļ���
		//	out.flush();
			out.close();//��ִ���Լ���flush()��������ִ��OutputStream��close()����
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
