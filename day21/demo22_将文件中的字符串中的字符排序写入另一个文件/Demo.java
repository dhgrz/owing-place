package com.itcast.demo22_���ļ��е��ַ����е��ַ�����д����һ���ļ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

/*
 * ��s.txt�е��ַ�����hcexfgijk
 * 				amdnoqrzst
 * 				uvwybpl
 * �����д��ss.txt
 * 
 * ˼·��
 * 1.��ȡ�ļ�
 * 2.�����ַ�������ȡÿ���ַ���
 * 3.���ַ����뵽һ��TreeSet�оͿ��ԣ�
 * 4.��TreeSet�е�����д�뵽�ļ���
 */
public class Demo {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("s.txt"));
			StringBuffer buf = new StringBuffer();
			String row = null;
			while((row = in.readLine()) != null){
				buf.append(row);
			}
			in.close();
			//��StringBuffer�е��ַ�ȡ��
			char[] charArray = buf.toString().toCharArray();
			//׼��һ��TreeSet
			TreeSet<Character> set = new TreeSet<>();//Ŀ�ģ�����
			for(char c : charArray){
				set.add(c);
			}
			//�������е�Ԫ��д���ļ���
			BufferedWriter out = new BufferedWriter(new FileWriter("ss.txt"));
			for(Character c : set){
				out.write(c.toString());
			}
			out.close();
			System.out.println("д����ϣ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
