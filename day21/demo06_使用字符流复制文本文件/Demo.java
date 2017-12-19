package com.itcast.demo06_ʹ���ַ��������ı��ļ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ʹ���ַ��������ı��ļ���
 * 
 * 1.��ȡ���ݣ�InputStreamReader	--   "a.txt"
 * 2.д�����ݣ�OutputStreamWriter	--   "b.txt"
 */
public class Demo {
	public static void main(String[] args) {
		//1.ʵ�������롢�����
		try {
			//�ļ��������
			InputStreamReader in = new InputStreamReader(new FileInputStream("a.txt"));
			//�ļ����Բ�����
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("b.txt"));
			
			//һ�ζ�дһ���ַ�
			/*int n = 0;
			while((n = in.read())!= -1){
				out.write(n);
				out.flush();
			}*/
			//һ�ζ�дһ���ַ�����
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
