package com.itcast.demo10_�����������ַ��������ı��ļ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����������ַ��������ı��ļ���
 * 
 * 1.��ȡ��BufferedReader  -- a.txt
 * 2.д�룺BufferedWriter  -- e.txt
 * 3.һ�ζ�дһ���ַ���һ�ζ�дһ���ַ�����
 */
public class Demo {
	public static void main(String[] args) {
		//1.���컺������
		try {
			BufferedReader in = new BufferedReader(new FileReader("a.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("e.txt"));
			
			//����
			//һ�ζ�ȡһ���ַ�
			/*int n = 0;
			while((n = in.read()) != -1){
				out.write(n);
				out.flush();
			}*/
			
			//һ�θ���һ���ַ�����
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1 ){
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
