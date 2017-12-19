package com.itcast.demo12_�ֽ�����ȡ��д������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * ʹ��FileOutputStreamд�����ģ�
 * write("���".getBytes());//д�������ǣ�����ʵ����ʹ�õ���һ��д��һ��byte���飻
 * 
 * int read()����ȡʱ��һ�ζ�ȡһ���ֽڣ��϶�ƴ����һ�����֣�
 * ����һ�ζ�ȡһ���ֽ����飬Ȼ��ʹ��ָ���ı���ȥ���룬����������ʾ��
 * 
 * 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("D:\\a.txt");
			byte[] byteArray = "��".getBytes();//��������ת��Ϊbyte[]������أ����ȣ�ʹ�õ���ϵͳƽ̨�ı��룺���Ĳ���ϵͳĬ��ƽ̨���룺GBK
			System.out.println("���鳤�ȣ�" + byteArray.length);//2
			System.out.println("�������ݣ�" + Arrays.toString(byteArray));//[-60, -29]
			out.write(byteArray);
			out.close();
			
			//��ȡ����
			FileInputStream in = new FileInputStream("D:\\a.txt");
			int n = in.read();//һ�ζ�ȡһ���ֽڣ�����ʹ��int��װ
			System.out.println("��ȡ���ֽڣ�" + n);
			System.out.println("��ȡ���ַ���" + (char)n);//196
			n = in.read();//һ�ζ�ȡһ���ֽڣ�����ʹ��int��װ
			System.out.println("��ȡ���ֽڣ�" + n);
			System.out.println("��ȡ���ַ���" + (char)n);//227
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
