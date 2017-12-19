package com.itcast.demo07_TCP��������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ���նˣ�
 * 
 * 1.����Socket : ServerSocket(int port):
 * 2.����Socket��accept()�ȴ��ͻ������ӣ�
 *   һ���пͻ������ӣ���ô�˷������أ����᷵��һ��Socket����
 * 3.ͨ����Socket���󣬿��Ի�ȡInputStream���󣬻�ȡ���ͷ����͵�����
 * 4.��ȡ����
 * 5.�ͷ���Դ��
 */
public class TCPReceive {

	public static void main(String[] args) throws IOException {
		//1.����Socket : ServerSocket(int port):
		try {
			ServerSocket server = new ServerSocket(8888);
			
			
			System.out.println("�ȴ��ͻ�������......");
			Socket clientSocket = server.accept();//�ȴ��û�����
			System.out.println("�пͻ������ӳɹ���");
			//3.ͨ����Socket���󣬿��Ի�ȡInputStream���󣬻�ȡ���ͷ����͵�����
			InputStream netIn = clientSocket.getInputStream();
			//4.��ȡ����
			byte[] byteArray = new byte[1024];
			int len = netIn.read(byteArray);
			String str = new String(byteArray,0,len);
			System.out.println("����˽��յ���Ϣ��" + str);
			System.out.println("����˽�Ҫ���ͷ���......");
			//��ͻ��˷��ط���
			//1.��ȡ�����������������ʹ�����ͬ"�����û�"��һ���������
			OutputStream netOut = clientSocket.getOutputStream();
			
			netOut.write("�����յ������Ϣ������ģ�".getBytes());
			System.out.println("����˷����Ѿ�������");
				
				//�ٴν�����Ϣ
				
			//	netOut.close();
			
			//5.�ͷ���Դ
			
			server.close();
			System.out.println("�������˽�����");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
