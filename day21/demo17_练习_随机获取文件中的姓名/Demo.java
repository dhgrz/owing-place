package com.itcast.demo17_��ϰ_�����ȡ�ļ��е�����;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * ��ϰ�������ȡ�ļ��е�������
 * 
 * 1.���ļ��е�������ȡ�������У�
 * 2.Ȼ�������ȡһ��������(������)
 * 
 * ˼·��
 * 
 * 1.�ַ���������BufferedReader
 * 2.׼��һ������ArrayList<String>
 * 3.ѭ����ȡ�ļ����ݣ�д�뵽���ϣ�
 * 4.�ͷ���Դ��
 * 5.ʹ��Random�������һ����������Χ��0 -- ����.size()
 * 6.ͨ��������ȡ�����е�Ԫ�أ�
 */
public class Demo {
	public static void main(String[] args) {
		try {
			//1.׼��һ��������
			BufferedReader in = new BufferedReader(new FileReader("listToFile.txt"));
			//2.׼��һ������
			ArrayList<String> nameList = new ArrayList<String>();
			//3.��ȡ�ļ����ݣ���伯��
			String row = null;
			while((row = in.readLine()) != null){
				nameList.add(row);
			}
			//4.�ͷ���Դ
			in.close();
			//5.ʹ��Random�������һ����������Χ��0 -- ����.size()
			Random rdo = new Random();
			int index = rdo.nextInt(nameList.size());//0 -- ����.size()
			System.out.println("�����ȡ��������" + nameList.get(index));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
