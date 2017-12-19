package com.itcast.demo07_FileOutputStreamд������;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * FileOutputStreamд�����ݣ�hello
 * 
 * д�����ݵķ�����
 * write(byte[] b):�� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С�
 * public void write(byte[] b,int off, int len)��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ�������� 
 * public void write(int b)����ָ���ֽ�д����ļ��������


 */
public class Demo {
	public static void main(String[] args) {
		//1.����һ��FileOutputStream
		try {
			//���췽����������ζ��ͨ���ļ���������ͱ����ˣ�����������д��������
			FileOutputStream out = new FileOutputStream("output1.txt");
			//д�����ݣ�
			byte[] byteArray = {97,98,99};//a,b,c
			String str = "hello";
			byte[] byteArray2 = str.getBytes();
			out.write(byteArray2);
			out.write(byteArray2,0,3);
			out.write(97);
			out.write(98);
			//ģ��һ�º������кܶ�������ó��򲻻�ֹͣ
			/*while(true){
				
			}*/
			
			//�ر���Դ��������رգ�����ܵ���һֱ���ڣ�һֱ�����������
			//����ϰ�ߣ�д������֮�������ر�ͨ����
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
