package com.itcast.demo10_�ͻ��˶�ȡ�ļ�����˿���̨���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
	public static void main(String[] args) {
		//1.����Socket
		try {
			ServerSocket server = new ServerSocket(8887);
			//2.�ȴ��ͻ�������
			Socket clientSocket = server.accept();
			//3.��ȡ������
			//�ֽ�����--����ʹ(�����һ��ʲôԭ��)
			/*InputStream netIn = clientSocket.getInputStream();
			//4.��������
			byte[] byteArray = new byte[1024];
			int len = 0;
			
			while((len = netIn.read(byteArray))!= -1){
				
				String str = new String(byteArray,0,len);
				System.out.println("����˽��յ����ݣ�" + str);
				for(byte b : byteArray){
					System.out.println("���飺" + b);
				}
			}*/
			//�ַ���--���õ�
			BufferedReader netIn = new BufferedReader(
										new InputStreamReader(clientSocket.getInputStream()));
			String row = null;
			while((row = netIn.readLine())!=null){
				System.out.println(row);
			}
			System.out.println("����˽�����");
			//5.�ͷ���Դ
			netIn.close();
			clientSocket.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
