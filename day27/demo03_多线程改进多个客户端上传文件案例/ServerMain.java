package com.itcast.demo03_���̸߳Ľ�����ͻ����ϴ��ļ�����;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ���ڿͻ����Ƕ���߳�ͬʱ�ϴ�������Ҫ�������main�����еĴ��뾡����࣬Ϊ�˵ȵ������ͻ�������
 */
public class ServerMain {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9888);
		int fileName = 1;
		while(true){
			
			Socket socket = server.accept();
			//���пͻ������Ӻ������������龡����࣬��������ʹ��һ���߳�
			//�����߳�
			new Thread(new ServerThread(socket,fileName++)).start();
		}
		
	}
}
