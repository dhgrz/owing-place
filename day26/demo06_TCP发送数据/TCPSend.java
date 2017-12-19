package com.itcast.demo06_TCP��������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP�������ݣ�
 * 
 * 1.����Socket:Socket(String ip , int port);
 * 2.ͬ��socket���󣬻�ȡһ��OutputStream�������
 * 3.ͨ��OutputStream����ն˷������ݣ�
 * 4.�ͷ���Դ
 * 
 * ע�⣺TCP���������ӵġ�
 * ���Ա�����"���ն�"��������������Ͷ������������쳣��
 */
public class TCPSend {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1.����Socket:Socket(String ip , int port);
		Socket socket = new Socket("192.168.21.205",8888);
		//2.ͬ��socket���󣬻�ȡһ��OutputStream�������
		OutputStream netOut = socket.getOutputStream();
		
		//3.ͨ��OutputStream����ն˷������ݣ�
		netOut.write("��ã�����ͨ��TCP���͵�����".getBytes());
	//	netOut.close();//���Ȳ�Ҫ�ر�
		//1.��ȡInputStream
		InputStream netIn = socket.getInputStream();
		byte[] byteArray = new byte[1024];
		System.out.println("�ͻ��˵ȴ�����......");
		int len = netIn.read(byteArray);
		String str = new String(byteArray,0,len);
		System.out.println("�ͻ��˽��յ�������" + str);
	
		
		netIn.close();
		//4.�ͷ���Դ��
		
		socket.close();
		System.out.println("������ϣ�");
		
		
		
		
		
	}
}
