package com.itcast.demo02_ת�������OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * ת���������OutputStreamWriter:
 * ���캯����
 * 	public OutputStreamWriter(OutputStream out)��ʹ��Ĭ�ϱ��롣�����ֽ���OutputStream�����󣩶�������ѧ����FileOutputStream
	public OutputStreamWriter(OutputStream out,String charsetName):charsetNameָ���ַ�����
   д�����ݣ�
    void write(char[] cbuf)��д���ַ����顣 
	void write(char[] cbuf, int off, int len)�� д���ַ������ĳһ���֡� 
 	void write(int c)��д�뵥���ַ��� 
 	void write(String str)��д���ַ����� ---ʹ������
 	void write(String str, int off, int len) ��д���ַ�����ĳһ���֡� 

 */
public class Demo {
	public static void main(String[] args) {
		//1.����һ��OutputStreamWriter.
		try {
			//�ļ����Բ����ڣ�
		//	OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("a.txt"));
			OutputStreamWriter out= new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
			//2.д������
			out.write("Hello�й�������������");
			//3.ˢ��/�ر���
		//	out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
