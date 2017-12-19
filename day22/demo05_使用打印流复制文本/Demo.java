package com.itcast.demo05_ʹ�ô�ӡ�������ı�;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ʹ�ô�ӡ�������ı���
 * 
 * 1.Ҫ���ƣ���Ҫ��ȡ��д�룻
 * 2.��ӡ��ֻ��д�룬���ܶ�ȡ����ȡ��BufferedReader
 * 
 * 3.��ȡ��BufferedReader
 * 	   д�룺PrintWriter
 */
public class Demo {
	public static void main(String[] args) {
		//1.��ȡ��
		try {
			BufferedReader in = new BufferedReader(new FileReader("printWriter_test.txt"));
			//2.�����
			PrintWriter out = new PrintWriter("copy.txt");
			
			//3.��ʼ����
			String row = null;
			while((row = in.readLine()) != null){
			//	out.write(row);
			//	out.write("\r\n");
				
				out.println(row);//print() + newLine()
			}
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
