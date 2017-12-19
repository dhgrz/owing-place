package com.itcast.demo16_��ϰ_���ļ��е����ݶ�ȡ��������;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���ļ��е����ݶ�ȡ�������С�
 * 
 * 1.���ļ��ж�ȡ��ʹ���ַ�����BufferedReader
 * 2.׼��һ��װ�ַ����ļ��ϣ�
 * 3.ѭ����ȡ���򼯺���д�����ݣ�
 * 4.�ͷ���Դ��
 * 5.��������
 */
public class Demo {
	public static void main(String[] args) {
		//1.׼��һ���ַ�����
		try {
			BufferedReader in = new BufferedReader(new FileReader("listToFile.txt"));
			//2.׼��һ��װ�ַ����ļ���
			ArrayList<String> list = new ArrayList<String>();
			//3.ѭ����ȡ�ļ�
			String row = null;
			while((row = in.readLine()) != null){
				//�򼯺������Ԫ��
				list.add(row);
			}
			//4.�ͷ���Դ
			in.close();
			//5.��������
			for(String s : list){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
