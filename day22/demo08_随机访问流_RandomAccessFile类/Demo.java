package com.itcast.demo08_���������_RandomAccessFile��;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * java.io.RandomAccessFile�ࣺ�����������
 * 
 * 1.�����ʵ��֧�ֶ���������ļ��Ķ�ȡ��д�롣
 * 2.RandomAccessFile�಻����������Object������ࡣ
 * 3.���ں���InputStream��OutputStream�Ĺ��ܡ�֧�ֶ���������ļ��Ķ�ȡ��д�롣
 * 
 * ���÷�����
 * 1.writeXxxx()
 * 2.readXxxx()
 * 3.getFilePointer():��ȡ��ǰ���ļ�ָ���ƫ����
 * 4.seek():���õ�ǰ�ļ�ָ���ƫ������
 */
public class Demo {
	public static void main(String[] args) {
		try {
		//	write();
			read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ִ����ϣ�");
	}

	private static void read() throws IOException {
		RandomAccessFile accFile = new RandomAccessFile("access.txt","rw");
		//��ȡ����
		System.out.println("��ʼ��ƫ����:" + accFile.getFilePointer());//0
		int n = accFile.readInt();//intռ�еĿռ�Ϊ4���ֽ�
		System.out.println("����int���ƫ������" + accFile.getFilePointer());//4
		char c = accFile.readChar();
		System.out.println("����char���ƫ������" + accFile.getFilePointer());//6
		String s = accFile.readUTF();//һ��UTF������ַ�ռ3���ֽڣ�������ں���
		System.out.println("����UTF���ƫ������" + accFile.getFilePointer());//2 + 3//��ӡ���ǣ�11
		System.out.println("intֵΪ��" + n + " charֵΪ��" + c + " UTFֵ��" + s);
		
		accFile.seek(4);
		char cc = accFile.readChar();
		System.out.println("�����ļ�ָ��󣬳��Զ�ȡ�ַ���" + cc);
	}

	private static void write() throws IOException {
		RandomAccessFile accFile = new RandomAccessFile("access.txt","rw");
		accFile.writeInt(100);
		accFile.writeChar('a');
		accFile.writeUTF("��");
		
		accFile.close();
		
	}
}
