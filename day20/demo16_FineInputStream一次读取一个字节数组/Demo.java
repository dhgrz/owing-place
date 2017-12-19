package com.itcast.demo16_FineInputStreamһ�ζ�ȡһ���ֽ�����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * FileInputStreamһ�ζ�ȡһ���ֽ����飺
 * public int read(byte[] b):�Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С�
 * ����ֵ�����뻺�������ֽ������������Ϊ�Ѿ������ļ�ĩβ��û�и�������ݣ��򷵻� -1�� 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("a.txt");
			/*byte[] byteArray = new byte[20];
			int len = in.read(byteArray);
			System.out.println("��ȡ���ֽ�����" + len);
			System.out.println("��ȡ���ֽ����ݣ�" + Arrays.toString(byteArray));
			//�ܲ��ܽ����byte����ת��Ϊ�ַ����أ�String�Ĺ��췽��
			String str = new String(byteArray);//ʹ�õ�ƽ̨Ĭ�ϵ��ַ������루GBK��
			System.out.println("��ȡ���ַ����ݣ�" + str);
			//String�Ĺ��췽����public String(byte[] bytes,int offset,int length)
			str = new String(byteArray,0,len);
			System.out.println("��ȡ����ַ����ݣ�" + str);*/
			
			//ʹ��ѭ����ȡ
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = in.read(byteArray))!= -1){
				System.out.print(new String(byteArray,0,len,"GBK"));
			}
			
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
