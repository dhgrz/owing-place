package com.itcast.demo18_������Ƶ_һ�ζ�ȡд��һ���ֽ�����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������Ƶ�ļ���һ�ζ�ȡ��д��һ���ֽ�����
 * 
 * �ٶ����Կ���һ�ζ�ȡһ���ֽڣ�
 */
public class Demo {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("��������.mp4");
			//�����
			FileOutputStream out = new FileOutputStream("��������_copy.mp4");
			//��ʼ���ƣ�һ�ζ�ȡд��һ���ֽ�����
			byte[] byteArray = new byte[2048];
			int len = 0;
			while((len = in.read(byteArray))!= -1){
				//д��
				out.write(byteArray, 0, len);
			}
			//�ͷ���Դ
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
