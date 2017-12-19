package com.itcast.demo05_InputStreamReader��2�ֶ�ȡ��ʽ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader�����ֶ�ȡ��ʽ��
 * 
 * 	public int read()�������ַ�����һ�ζ�ȡһ���ַ���
	public int read(char[] cbuf)��һ�ζ�ȡһ���ַ����飻

 */
public class Demo {
	public static void main(String[] args) {
		try {
			InputStreamReader in = new InputStreamReader(new FileInputStream("a.txt"));
			//1.	public int read()�������ַ�����һ�ζ�ȡһ���ַ���
			/*int n = in.read();
			System.out.println("��ȡ���ֽڣ�" + n);
			System.out.println("��ȡ���ַ���" + (char)n);*/
			
			/*int n = 0;
			while((n = in.read()) != -1){
				System.out.println("��ȡ���ַ���" + (char)n);
			}*/
			
			//2.public int read(char[] cbuf)��һ�ζ�ȡһ���ַ����飻
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray))!= -1){
				System.out.println(new String(charArray,0,len));
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//ʹ��ƽ̨Ĭ���ַ���
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
