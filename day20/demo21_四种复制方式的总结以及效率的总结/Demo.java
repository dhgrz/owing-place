package com.itcast.demo21_���ָ��Ʒ�ʽ���ܽ��Լ�Ч�ʵ��ܽ�;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ָ��Ʒ�ʽ��
 * 
 * 1.FileInputStream��FileOutputStream:һ�ζ�ȡһ���ֽڣ�method1()
 * 2.FileInputStream��FileOutputStream:һ�ζ�ȡһ���ֽ����飻method2()
 * 3.BufferedInputStream��BufferedOutputStream:һ�ζ�ȡһ���ֽڣ�method3()
 * 4.BufferedInputStream��BufferedOutputStream:һ�ζ�ȡһ���ֽ����飺method4();
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
	//	method1();//60376����
	//	method2();//122����
	//	method3();//955����
		method4();//90
		long end = System.currentTimeMillis();
		System.out.println("FileInputStreamһ�ζ�ȡһ���ֽڸ��ƣ�" + (end - start) + " ����");
	}
	//FileInputStream��FileOutputStream:һ�ζ�ȡһ���ֽڣ�method1()
	public static void method1() throws IOException{
		FileInputStream in = new FileInputStream("��������.mp4");
		FileOutputStream out = new FileOutputStream("��������2.mp4");
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
		}
		in.close();
		out.close();
		
	}
	//2.FileInputStream��FileOutputStream:һ�ζ�ȡһ���ֽ����飻method2()
	public static void method2() throws IOException{
		FileInputStream in = new FileInputStream("��������.mp4");
		FileOutputStream out = new FileOutputStream("��������3.mp4");
		byte[] byteArray = new byte[1024];
		int n = 0;
		while((n = in.read(byteArray)) != -1){
			out.write(byteArray,0,n);
		}
		in.close();
		out.close();
	}
	//3.BufferedInputStream��BufferedOutputStream:һ�ζ�ȡһ���ֽڣ�method3()
	public static void method3() throws IOException{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("��������.mp4"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("��������4.mp4"));
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
		}
		in.close();
		out.close();
	}
	//4.4.3.BufferedInputStream��BufferedOutputStream:һ�ζ�ȡһ���ֽ����飺method4();
	public static void method4() throws IOException{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("��������.mp4"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("��������5.mp4"));
		byte[] byteArray = new byte[1024];
		int n = 0;
		while((n = in.read(byteArray)) != -1){
			out.write(byteArray,0,n);
		}
		in.close();
		out.close();
	}
}
