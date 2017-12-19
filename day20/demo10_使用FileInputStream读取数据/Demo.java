package com.itcast.demo10_ʹ��FileInputStream��ȡ����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �ֽ�����
 * 	�������OutputStresam(������)
 * 			|--FileOutputStream(��)
 *  ��������InputStream(������)
 *  		|--FileInputStream(��)FileInputStream ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽڡ�
 *  
 *  FileInputStream:
 *  ���췽����ע�⣺�������������ļ�������ڣ�����FileNotFoundException�쳣��
 *  public FileInputStream(String name) throws FileNotFoundException��ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е�·���� name ָ����
 *  public FileInputStream(File file) throws FileNotFoundException��ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ����
 *  
 *  ��ȡ���ݣ�
 *  1.int read():�Ӵ��������ж�ȡһ�������ֽڡ����أ���һ�������ֽڣ�����ѵ����ļ�ĩβ���򷵻� -1��
 */
public class Demo {
	public static void main(String[] args) {
		//1.����һ��FileInputStream
		try {
			//�������������ļ�������ڣ�����FileNotFoundException�쳣��
			FileInputStream in = new FileInputStream("output2.txt");
			//2.ʹ��File����
		//	File file = new File("output2.txt");
		//	FileInputStream in2 = new FileInputStream(file);
			//����
		//	FileInputStream in2 = new FileInputStream(new File("output3.txt"));
			//3.��ȡ���ݣ�
			/*int n = in.read();
			System.out.println("��ȡ���ֽ����ݣ�" + n);
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//h
			n = in.read();
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//e
			n = in.read();
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//l
			n = in.read();
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//l
			n = in.read();
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//o
			n = in.read();
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//\r
			n = in.read();
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//\n
			n = in.read();
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//w
			n = in.read();
			System.out.println("��ȡ���ֽ����ݣ�" + n);//-1
			System.out.println("��ȡ���ַ����ݣ�" + (char)n);//?
*/			//ʹ��ѭ����һ
			/*int n = in.read();
			while(n != -1){
				System.out.println("��ȡ�ַ���" + (char)n);
				n = in.read();
			}*/
			//ʹ��ѭ������
			int n = 0;
			while((n = in.read()) != -1){
				System.out.println("��ȡ�ַ���" + (char)n);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("��ȡ������ϣ�");
		
	}
}
