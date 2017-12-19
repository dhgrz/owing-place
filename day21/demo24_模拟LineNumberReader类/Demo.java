package com.itcast.demo24_ģ��LineNumberReader��;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * �Զ�����ģ��LineNumberReader�����й��ܻ�ȡÿ�ζ�ȡ���ݵ��к�

 */
public class Demo {
	public static void main(String[] args) {
		//1.����һ��LineNumberReader��
		try {
			MyLineNumberReader in = new MyLineNumberReader("s.txt");
			String row = null;
			/*System.out.println(in.getLineNumber());
			System.out.println(in.getLineNumber());
			System.out.println(in.getLineNumber());*/
			in.setLineNumber(50);
			while((row = in.readLine()) != null){
				System.out.println(in.getLineNumber() + "�У�" + row);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
