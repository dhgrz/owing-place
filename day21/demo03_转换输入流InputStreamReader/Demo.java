package com.itcast.demo03_ת��������InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ת������InputStreamReader:
 * 
 * ���췽����
 * 	public InputStreamReader(InputStream in)��ʹ��ƽ̨Ĭ���ַ������롣����InputStream(����)��������ʹ��FileInputStream
	public InputStreamReader(InputStream in,String charsetName):ʹ��ָ���ַ�������
   ��ȡ�ķ�����
    int read() �� ��ȡ�����ַ��� 
 	int read(char[] cbuf) ��  ���ַ��������顣 
	int read(char[] cbuf, int off, int len) �����ַ����������ĳһ���֡� 
 	int read(CharBuffer target) ����ͼ���ַ�����ָ�����ַ��������� 

 */
public class Demo {
	public static void main(String[] args) {
		//1.ʵ����һ��InputStreamReader
		try {
			//�ļ�������ڣ������쳣
			InputStreamReader in = new InputStreamReader(new FileInputStream("a.txt"),"GBK");//ʹ��ƽ̨Ĭ���ַ���
			
			//һ�ζ�ȡһ���ַ�������һ�ζ�ȡһ�����ġ��ؼ���ͬд��ʱ���ַ���һ��
			/*int n = 0;
			while((n = in.read()) != -1){
				System.out.println("��ȡ���ֽڣ�" + n);
				System.out.println("��ȡ���ַ���" + (char)n);//���Զ�ȡһ�������ַ���
			}*/
			//һ�ζ�ȡһ���ַ����飺
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1){
				//��Ҫ��charArrayת��Ϊ�ַ���
				System.out.println("��ȡ���ַ���" + new String(charArray,0,len) );
			}
			in.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
