package com.itcast.demo15_��ϰ_�������е�����д���ı��ļ�;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
 * ��ϰ����ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 * ˼·��
 * 1.�ȴ���һ������ArrayList����伯��(�ַ���)
 * 2.�����������д�����ı��ļ���ʹ���ַ������ַ��������֣������ַ������ʹ����������ַ���������ѡ��ʹ�ô����������ַ�����
 * 	 BufferedWriter
 * 3.��������
 * 4.ȡ��ÿ��Ԫ���ַ�����д�뵽�ļ�
 * 5.�ر��������
 * 	 
 */
public class Demo {
	public static void main(String[] args) {
		//1.��������
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("����ǿ");
		list.add("����");
		list.add("������");
		list.add("�˳�");
		list.add("�º�");
		list.add("֣��");
		list.add("�");
		list.add("��ӱ");
		
		//2.�����������
		try {
			BufferedWriter out = new BufferedWriter(
									new FileWriter("listToFile.txt"));
			//3.��������
			for(String s : list){
				//4.д���ļ�
				out.write(s);
				out.newLine();
				out.flush();
			}
			//4.�ͷ���Դ
			out.close();
			System.out.println("д����ϣ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
