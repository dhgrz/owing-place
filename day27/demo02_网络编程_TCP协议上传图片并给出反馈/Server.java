package com.itcast.demo02_������_TCPЭ���ϴ�ͼƬ����������;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9888);
		System.out.println("�ȴ��ͻ�������......");
		
			Socket clientSocket = server.accept();
			InputStream netIn = clientSocket.getInputStream();//�������ȡ
			FileOutputStream fileOut = new FileOutputStream("img_copy.ico");//�ļ�д��
			
			
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = netIn.read(byteArray)) != -1){
				//���ļ�д��
				fileOut.write(byteArray,0,len);
			}
			System.out.println("�ϴ���ϣ���ͻ��˷��ͻ���......");
			OutputStream netOut = clientSocket.getOutputStream();
			netOut.write("���������յ��������ݣ��Ѿ���ϣ�".getBytes());
			
			netOut.close();
		
		System.out.println("���ͻ�����ϣ�");
		clientSocket.close();
		server.close();
		
	}
}
