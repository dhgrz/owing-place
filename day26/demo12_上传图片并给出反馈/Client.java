package com.itcast.demo12_�ϴ�ͼƬ����������;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.����Socket
		Socket socket = new Socket("192.168.21.205",8888);
		//2.�����ļ��������ֽ���
		FileInputStream fileIn = new FileInputStream("D:\\3000soft.ico");
		//3.��ȡsocket�������
		OutputStream netOut = socket.getOutputStream();
		//4.��ȡ�ļ�����������ϴ�
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = fileIn.read(byteArray))!= -1){
			netOut.write(byteArray,0,len);
			netOut.flush();
		}
		//���շ���˷���
		/*InputStream netIn = socket.getInputStream();
		byte[] byteArray2 = new byte[1024];
		int len2 = 0;
		while((len2 = netIn.read(byteArray2))!= -1){
			String str = new String(byteArray2,0,len2);
			System.out.println("���յ�����˷�����" + str);
		}
		int len2 = netIn.read(byteArray2);
		String str = new String(byteArray2,0,len2);
		System.out.println("���յ�����˷�����" + str);*/
		System.out.println("�ϴ����");
		//5.�ͷ���Դ
		netOut.close();
		fileIn.close();
		socket.close();
		
	}
}
