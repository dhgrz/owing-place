package com.itcast.demo14_ʹ���ֽ�������ͼƬ�ļ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����ͼƬ������Ƶ��ʹ���ֽ�����
 * 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			//����������ȡ
			FileInputStream in = new FileInputStream("D:\\aaa\\cxy.bmp");
			//�������д��
			FileOutputStream out = new FileOutputStream("cxy.bmp");
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
