package com.itcast.demo01_TCP����̨����Ͷ�ȡ�ı��ڷ���˿���̨��ʾ������;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9888);
		Socket clientSocket = server.accept();
		InputStream netIn = clientSocket.getInputStream();
		
		//ʹ���ֽ�������
		byte[] byteArray = new byte[1024];
		int len = 0;
		while(true){
			len = netIn.read(byteArray);
			String str = new String(byteArray,0,len);
			System.out.println("����˽��յ����ݣ�" + str);
			if(str.equals("886")){
				break;
			}
			
		}
		System.out.println("����˽�����");
		clientSocket.close();
		server.close();
		
		
	}
}
