package com.itcast.demo08_�ͻ��˼���¼�����˿���̨���;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ���նˣ�
 * 1.����Socket:ServerSocket
 * 		�ȴ��ͻ�������
 * 2.��ȡ��������
 * 3.�������ݣ�
 * 4.��ӡ���ݣ�
 * 5.�������886,����
 */
public class Receive {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);
			Socket clientSocket = server.accept();
			InputStream netIn = clientSocket.getInputStream();
			byte[] byteArray = new byte[1024];
			int len = 0;
			while(true){
				len = netIn.read(byteArray);
				String str = new String(byteArray,0,len);
				System.out.println("����˽��յ����ݣ�" + str);
				if(str.equals("886")){
					System.out.println("���յ�886������˽�����");
					break;
				}
			}
			//�ͷ���Դ
			netIn.close();
			clientSocket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
