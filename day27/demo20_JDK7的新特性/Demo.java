package com.itcast.demo20_JDK7��������;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 	������������
	�������������Գ����»���
	switch ���������ַ���
	���ͼ�
	�쳣�Ķ��catch�ϲ�
	try-with-resources ���

 */
public class Demo {
	public static void main(String[] args) {
		//	������������
		System.out.println(0b10_10_10101);
		//�������������Գ����»���
		System.out.println(12_345_678);
		
		//���ͼ�
		ArrayList<Integer> intList = new ArrayList<>();
		//�쳣�Ķ��catch�ϲ�
		try{
			
		}catch(ArithmeticException | NullPointerException e){
			
		};
	}
	
	public void file(){
		try (FileReader in = new FileReader("1.txt");
			 FileWriter out = new FileWriter("2.txt");){
			
			//�����ͷ���Դ��
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
