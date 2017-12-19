package com.itcast.demo01_�������������_DataInputStream_DataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����������������������������Ӧ�ó������ʵ���ʽ������ Java ��������д��������С�Ȼ��Ӧ�ó������ʹ�����������������ݶ��롣 
 * 
 * DataInputStream
 * DataOutputStream

 */
public class Demo {
	public static void main(String[] args) throws IOException {
		//1.�ȹ���һ��DataOutputStream
		DataOutputStream out = new DataOutputStream(new FileOutputStream("dataOutput.txt"));
		
		out.writeByte(10);
		out.writeShort(200);
		out.writeInt(3000);
		out.writeLong(40000);
		out.writeFloat(2.3F);
		out.writeDouble(4.5);
		out.writeChar('a');
		out.writeBoolean(true);
		out.writeUTF("�й�");
		
	//	out.flush();
		out.close();
		
		//2.��ȡ��
		DataInputStream in = new DataInputStream(new FileInputStream("dataOutput.txt"));
		
		byte v1 = in.readByte();
		System.out.println("byte = " + v1);
		short v2 = in.readShort();
		System.out.println("short = " + v2);
		//int v3 = in.read();//��Ȼ��Ҳ����һ��int�������Ǵӵ�ǰλ�ö�ȡ��
		int v3 = in.readInt();
		long v4 = in.readLong();
		float v5 = in.readFloat();
		double v6 = in.readDouble();
		char v7 = in.readChar();
		boolean v8 = in.readBoolean();
		String v9 = in.readUTF();
		System.out.println("int = " + v3);
		System.out.println("long = " + v4);
		System.out.println("float = " + v5);
		System.out.println("double = " + v6);
		System.out.println("char = " + v7);
		System.out.println("boolean = " + v8);
		System.out.println("UTF = " + v9);
		
		
		
	}
}
