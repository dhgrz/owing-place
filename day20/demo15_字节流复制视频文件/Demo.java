package com.itcast.demo15_�ֽ���������Ƶ�ļ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������Ƶ�ļ���
 * 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			//����������ȡ
			FileInputStream in = new FileInputStream("D:\\aaa\\��������.mp4");
			//�������д��
			FileOutputStream out = new FileOutputStream("��������.mp4");
			//���Ʋ���
			//һ�ζ�ȡһ���ֽڣ�һ��д��һ���ֽ�
			int n = 0;
			while((n = in.read()) != -1){
				out.write(n);
			}
			//�ͷ���Դ
			in.close();
			out.close();
			System.out.println("�������");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
