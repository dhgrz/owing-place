package com.itcast.demo14_��ϰ_����ͼƬ��4�ַ�ʽ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����ͼƬ��4�ַ�ʽ��
 * ��Ϊ���Ƶ���ͼƬ�����������ݣ�����ֱ��ʹ���ֽ�����
 * 
 * 1.�����ֽ���:
 * 		FileInputStream:
 * 		FileOutputStream:
 * 		1).һ�ζ�ȡһ���ֽڣ�	method1()
 * 		2).һ�ζ�дһ���ֽ����飻method2()
 * 2.�����������ֽ�����
 * 		BufferedInputStream
 * 		BufferedOutputStream
 * 		1).һ�ζ�дһ���ֽڣ�	method3()
 * 		2).һ�ζ�дһ���ֽ����飻method4();
 *
 */
public class Demo {
	public static void main(String[] args) {
		File srcFile = new File("cxy.bmp");
		File destFile = new File("cxy_copy4.bmp");
		try {
		//	method1(srcFile,destFile);
		//	method2(srcFile,destFile);
		//	method3(srcFile,destFile);
			method4(srcFile,destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ϣ�");
	}
	//ʹ�ô����������ֽ�����һ�ζ�дһ���ֽ����飻
	private static void method4(File srcFile, File destFile) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
		//���ƣ�һ�ζ�дһ���ֽ�����
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = in.read(byteArray)) != -1){
			out.write(byteArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
	}
	//ʹ�ô����������ֽ�����һ�ζ�дһ���ֽ�
	private static void method3(File srcFile, File destFile) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
		//���ƣ�һ�ζ�дһ���ֽ�
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		in.close();
		out.close();
		
	}
	//ʹ�û����ֽ�����һ�ζ�дһ���ֽ�����
	private static void method2(File srcFile, File destFile) throws IOException {
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		//���ƣ�һ�ζ�дһ���ֽ�����1
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = in.read(byteArray)) != -1){
			out.write(byteArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
		
	}

	//ʹ�û������ֽ�����һ�ζ�дһ���ֽ�
	public static void method1(File src,File dest) throws IOException{
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		//��ʼ���ƣ�һ�ζ�дһ���ֽ�
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		in.close();
		out.close();
	}
}
