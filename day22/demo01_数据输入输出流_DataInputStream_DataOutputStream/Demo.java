package com.itcast.demo01_数据输入输出流_DataInputStream_DataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 数据输入输出流：数据输出流允许应用程序以适当方式将基本 Java 数据类型写入输出流中。然后，应用程序可以使用数据输入流将数据读入。 
 * 
 * DataInputStream
 * DataOutputStream

 */
public class Demo {
	public static void main(String[] args) throws IOException {
		//1.先构造一个DataOutputStream
		DataOutputStream out = new DataOutputStream(new FileOutputStream("dataOutput.txt"));
		
		out.writeByte(10);
		out.writeShort(200);
		out.writeInt(3000);
		out.writeLong(40000);
		out.writeFloat(2.3F);
		out.writeDouble(4.5);
		out.writeChar('a');
		out.writeBoolean(true);
		out.writeUTF("中国");
		
	//	out.flush();
		out.close();
		
		//2.读取流
		DataInputStream in = new DataInputStream(new FileInputStream("dataOutput.txt"));
		
		byte v1 = in.readByte();
		System.out.println("byte = " + v1);
		short v2 = in.readShort();
		System.out.println("short = " + v2);
		//int v3 = in.read();//虽然它也返回一个int，但不是从当前位置读取；
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
