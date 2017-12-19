package com.itcast.demo04_�ַ���ӡ��_PrintWriter��ΪWriterʹ��;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��PrintWriter��ΪWriterʹ�ã�
 * 
 * PrintWriter��Writer�����࣬��Ȼ��ʵ��Writer�е����г��󷽷���
 * 
 * �Զ�ˢ�£�
 * ʹ�ù��췽����
 * PrintWriter(OutputStream out, boolean autoFlush)��ͨ�����е� OutputStream �����µ� PrintWriter��
 * PrintWriter(Writer out, boolean autoFlush) �������� PrintWriter��
 * autoFlush - boolean ���������Ϊ true���� println��printf �� format ������ˢ�����������
 */
public class Demo {
	public static void main(String[] args) {
		try {
		//	PrintWriter out = new PrintWriter("printWriter_test.txt");
			//ʹ���ַ����Ĺ��췽���������Զ�ˢ��
			PrintWriter out = new PrintWriter(new FileWriter("printWriter_test.txt"),true);
			
			//д������
			/*out.write("helloworld");
			out.write("\r\n");
			out.write(97);*/
			
			//println()�������ʱָ�����Զ�ˢ�£��˷������Զ�ˢ�»�������
			out.println(true);//print() + newLine() + flush()
			
			out.println(100000);
			out.println(2.3);
			
			//print���������Զ�ˢ�»�������
			out.print(false);
			out.print(20);
			out.print(0.0);
			
			out.flush();
			
			
			//�ͷ���Դ
		//	out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
