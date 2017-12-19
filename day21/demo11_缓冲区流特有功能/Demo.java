package com.itcast.demo11_�����������й���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ��������������й��ܣ�
 * 1.�������BufferedWriter: newLine()�����һ�����У�
 * 2.��������BufferedReader: readLine():һ�ζ�ȡһ�����ݣ����������ĩβ������null
 * 
 * ʵ��һ�����ƣ�һ�ζ�ȡһ�����ݣ�һ��д��һ��������
 */
public class Demo {
	public static void main(String[] args) {
		//1.ʵ�������������
		try {
			BufferedReader in = new BufferedReader(new FileReader("a.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("f.txt"));
			
			//һ�ζ�ȡһ�����ݣ�Ȼ��д��
			String row = null;
			while((row = in.readLine()) != null){
				out.write(row);
			//	out.write("\r\n");
				out.newLine();//���һ�����з�
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
