package com.itcast.demo11_ʹ���ֽ��������ı��ļ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ʹ���ֽ��������ı��ļ���
 * 
 * ˼·��
 * 
 * 1.���ƣ���ȡһ���ļ������ݣ�Ȼ������һ���ļ�д�룻
 * 2.��ȡ��FileInputStream       ---      a.txt
 * 			һ�ζ�һ���ֽ�
 * 			
 *   д�룺FileOutputStream      ---      b.txt
 *   		һ��д��һ���ֽ�
 */
public class Demo {
	public static void main(String[] args) {
		
		try {
			//���������ļ�������ڣ�
			FileInputStream in = new FileInputStream("a.txt");
			//׼��һ����������ļ����Բ�����
			FileOutputStream out = new FileOutputStream("b.txt");
			//��ʼ���ƣ�
			//��������һ�ζ�ȡһ���ֽ�
			//�������һ��д��һ���ֽ�
			int n = 0;
			while((n = in.read())!= -1){
				out.write(n);
			}
			//�Ƿ���Դ
			in.close();
			out.close();
			System.out.println("������ϣ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
