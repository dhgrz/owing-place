package com.itcast.demo12_�ϴ�ͼƬ����������;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		//2.�ȴ��ͻ�������
		Socket clientSocket = server.accept();
		//3.��ȡ������
		InputStream netIn = clientSocket.getInputStream();
		//4.�ļ��������
		FileOutputStream fileOut = new FileOutputStream("copy_img.ico");
		//5.��ȡ�������ݣ�д���ļ�
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = netIn.read(byteArray))!=-1){
			fileOut.write(byteArray,0,len);
			fileOut.flush();
		}
		System.out.println("����˿������");
		//��ͻ��˸�������
		//��ȡ���������
		/*OutputStream netOut = clientSocket.getOutputStream();
		netOut.write("�ϴ��ɹ���".getBytes());
		netOut.flush();*/
		
		//6.�ͷ���Դ
		fileOut.close();
		netIn.close();
		clientSocket.close();
		server.close();
		
	}
}
