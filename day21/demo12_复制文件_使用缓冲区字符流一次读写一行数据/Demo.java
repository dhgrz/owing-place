package com.itcast.demo12_�����ļ�_ʹ�û������ַ���һ�ζ�дһ������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����ļ�_ʹ�û������ַ���һ�ζ�дһ������;
 */
public class Demo {
	public static void main(String[] args) {
		//1.ʵ�������롢�����
		try {
			BufferedReader in = new BufferedReader(new FileReader("f.txt"));
			BufferedWriter out =  new BufferedWriter(new FileWriter("E:\\copyRow.txt"));
			
			//һ�ζ�ȡһ������
			String row = null;
			while((row = in.readLine()) != null){
				out.write(row);
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
