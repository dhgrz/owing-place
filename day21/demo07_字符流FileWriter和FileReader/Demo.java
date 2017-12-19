package com.itcast.demo07_�ַ���FileWriter��FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ�����FileWriter �� FileReader
 * 
 * �ַ�����
 * ���������Writer(������)
 * 			|--OutputStreamWriter(���࣬ת����)(���죺�������һ���ֽ���OutputStream)
 * 					|--FileWriter(���࣬�ַ���)(���죺File,String)(д��ķ������ޣ�ʹ�ø����)
 * 		    |--BufferedWriter
 * ����������Reader(������)
 * 			|--InputStreamReader(���࣬ת����)(���죺�������һ���ֽ���InputStream)
 * 					|--FileReader(���࣬�ַ���);(���죺File,String)(��ȡ�ķ������ޣ�ʹ�ø����)
 * 			|--BufferedReader
 * 				
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.�������������
		try {
			//��ȡʱ���ļ��������
			FileReader in = new FileReader("b.txt");
			//��������ļ����Բ�����
			FileWriter out = new FileWriter("c.txt");
			
			//����
			//��ʽһ��һ�ζ�ȡһ���ַ�
			/*int n = 0;
			while((n = in.read()) != -1){
				out.write(n);
				out.flush();
			}*/
			
			//��ʽ����һ�ζ�ȡһ���ַ�����
			char[] charArray =new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1){
				out.write(charArray,0,len);
				out.flush();
			}
			
			
			//�ͷ���Դ
			in.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
