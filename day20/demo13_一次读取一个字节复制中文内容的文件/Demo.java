package com.itcast.demo13_һ�ζ�ȡһ���ֽڸ����������ݵ��ļ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����֮ǰ�Ĵ���������䡣һ�ζ�ȡһ���ֽڣ�һ��д��һ���ֽڡ�ԭ����ȡ��ԭ��д��
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
