package com.itcast.demo23_ģ��BufferedReader��readLine����;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �Զ���һ���࣬ģ��BufferedReader��readLine()���ܣ�
 * 
 * BufferedReader��readLine()���ܶ�ȡһ�����ݣ��������б�ʶ
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.���������������Լ�����
		try {
			MyBufferedReader in = new MyBufferedReader("s.txt");
			String row = null;
			while((row = in.readLine()) != null){
				System.out.println("��ȡ���У�"  + row);
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
