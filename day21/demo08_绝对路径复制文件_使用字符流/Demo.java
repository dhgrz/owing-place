package com.itcast.demo08_����·�������ļ�_ʹ���ַ���;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("e:\\a.txt");
			FileWriter out = new FileWriter("f:\\b.txt");
			
			//һ�ζ�ȡһ���ַ�����
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray))!= -1){
				out.write(charArray,0,len);
				out.flush();
			}
			//�ͷ���Դ��
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
