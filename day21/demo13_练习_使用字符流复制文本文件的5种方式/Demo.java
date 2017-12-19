package com.itcast.demo13_��ϰ_ʹ���ַ��������ı��ļ���5�ַ�ʽ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ���ַ��������ı��ļ���5�ַ�ʽ��
 * 
 * 1.�������ַ�����
 * 		FileReader
 * 		FileWriter
 * 	 	1).һ�ζ�ȡһ���ַ���method1();
 * 	 	2��.һ�ζ�ȡһ���ַ����飻method2();
 * 2.�����������ַ�����
 * 		BufferedReader
 * 		BufferedWriter
 * 		1.һ�ζ�ȡһ���ַ�:method3();
 * 		2.һ�ζ�ȡһ���ַ����飻:method4();
 * 		3.һ�ζ�ȡһ���ַ�����method5();
 * 
 */
public class Demo {
	public static void main(String[] args) {
		File srcFile = new File("a.txt");
		File destFile = new File("k.txt");
		try {
		//	method1(srcFile,destFile);
		//	method2(srcFile,destFile);
		//	method3(srcFile,destFile);
		//	method4(srcFile,destFile);
			method5(srcFile,destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ϣ�");
	}
	//ʹ�ô����������ַ�����һ�ζ�дһ���ַ���
	private static void method5(File srcFile, File destFile) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(destFile));
		//���ƣ�һ�ζ�дһ���ַ���
		String row = null;
		while((row = in.readLine()) != null){
			out.write(row);
			out.newLine();
			out.flush();
		}
		in.close();
		out.close();
	}

	//ʹ�ô����������ַ�����һ�ζ�дһ���ַ�����
	private static void method4(File srcFile, File destFile) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(destFile));
		//���ƣ�һ�θ���һ���ַ�����
		char[] charArray = new char[1024];
		int len = 0;
		while((len = in.read(charArray))!= -1){
			out.write(charArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
	}

	//ʹ�ô����������ַ�����һ�ζ�дһ���ַ�
	private static void method3(File srcFile, File destFile) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(destFile));
		
		//���ƣ�һ�ζ�дһ���ַ�
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		//�ͷ���Դ
		in.close();
		out.close();
		
		
	}
	//ʹ�û����ַ�����һ�ζ�дһ���ַ����飻
	private static void method2(File srcFile, File destFile) throws IOException {
		FileReader in = new FileReader(srcFile);
		FileWriter out = new FileWriter(destFile);
		
		//���ƣ�һ�ζ�дһ���ַ�����
		char[] charArray = new char[1024];
		int len = 0;
		while((len = in.read(charArray)) != -1){
			//д����һ��д��һ���ַ�����
			out.write(charArray, 0, len);
			out.flush();
		}
		in.close();
		out.close();
	}
	//ʹ�û����ַ�����һ�ζ�дһ���ַ���
	private static void method1(File srcFile, File destFile) throws IOException {
		FileReader in = new FileReader(srcFile);
		FileWriter out = new FileWriter(destFile);
		
		//���ƣ�һ�ζ�дһ���ַ�
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		//�ͷ���Դ
		in.close();
		out.close();
		
		
		
	}

	
}
