package com.itcast.demo07_���ַ�ʽ�ӿ���̨��������;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 * ���ַ�ʽ�ӿ���̨�������ݣ�
 * 
 * 1.main����(String[] args)���Դӿ���̨��������������
 * 2.Scanner �����ַ�����intֵ
 * 3.System.in
 * 		1).������һ��InputStream���͵ģ�BufferedInputStream�����ֽ�������ת��Ϊһ��������ַ���
 * 		2).ת����ʽ��
 * 			A.ʹ��System.in�ֽ�������һ��ת������InputStreamReader reader = new InputStreamReader(System.in);
 * 			B.ʹ��ת��������һ���������ַ�����BufferedReader bufReader = new BufferedReader(reader);
 * 
 * ��System.out��Ϊ�����ַ���ʹ�ã�
 * 
 * 1.System.out:����PrintStream
 * 2.ʹ���ֽ�������ת������ʹ��ת�������컺�����ַ�����
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		//ͨ����ӡin�������Ƿ�������һ��BufferedInputStream����
		System.out.println(in);//java.io.BufferedInputStream@7b2164ea
		//��in����ת��ΪBufferedInputStream
		BufferedInputStream bufIn = (BufferedInputStream)in;
		//һ�ζ�ȡһ���ֽ�
	//	int n = bufIn.read();//�����������������ȴ��û����룻
	//	System.out.println(n);
		
		//BufferedInputStream����û�а취һ�ζ�ȡһ�����ݣ�
		//������û�а취�ܹ�һ�λ�ȡ����̨��һ�����ݣ�
		//1.Ҫ���ȡһ�����ݣ�readLine()�������˷������ĸ��ࣿBufferedReader��������һ���ַ�����
		//2.��������ֻ���ֽ���������ܽ��ֽ���ת��Ϊ�ַ�������ô���Ǿ���һ�ζ�ȡһ���ˡ�
		//3.�����Ҫת������InputStreamReader.
		/*InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufReader = new BufferedReader(reader);*/
		
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
		
		String row = bufReader.readLine();
		System.out.println("row = " + row);
		
		//��System.out��Ϊ�������ַ���
		PrintStream ps = System.out;
		//ͨ���ֽ���������һ��ת����
		OutputStreamWriter sWriter = new OutputStreamWriter(ps);
		//ʹ��ת����������һ���������ַ���
		BufferedWriter bufWriter = new BufferedWriter(sWriter);
		
		//д��һ�仰
		BufferedWriter bufWriter2 = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bufWriter2.write("hello");
		bufWriter2.newLine();
		bufWriter2.write("java");
		bufWriter2.newLine();
		bufWriter2.write("world");
		bufWriter2.flush();
		
	}
}
