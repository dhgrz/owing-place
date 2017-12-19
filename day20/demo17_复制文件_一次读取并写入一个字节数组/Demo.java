package com.itcast.demo17_�����ļ�_һ�ζ�ȡ��д��һ���ֽ�����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ļ���һ�ζ�ȡ��д��һ���ֽ�����
 */
public class Demo {
	public static void main(String[] args) {
		//1.������
		try {
			FileInputStream in = new FileInputStream("a.txt");
			//2.�����
			FileOutputStream out = new FileOutputStream("b.txt");
			//3.���ƣ�һ�ζ�ȡһ���ֽ����飬һ��д��һ���ֽ�����
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = in.read(byteArray)) != -1){
				//д��
				out.write(byteArray, 0, len);
			}
			//4.�ͷ���Դ��
			in.close();
			out.close();
			System.out.println("�������");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
