package com.itcast.demo02_������_TCPЭ���ϴ�ͼƬ����������;
/*
 * �����ϴ��ļ�ʱ�����ڿͻ��˵�����close()��Ϊ�ٳɷ���˵�ѭ��������Ҳ���Ƿ���˵�InputStream���յ�-1
 * ������ϴ��󣬷����Ҫ���ͻ������ͻ���Ҫ�ȴ�������Ϣ����ʱ�ͻ��˲��������ر�socket�����ԣ����·���˵�ѭ�����ܽ���
 * ��ʱ�����ڿͻ���ʹ��ʹ��socket.shutdownOutput()�������ر�������������ܴٳɷ���˵�InputStrean���յ�һ��-1
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",9888);
		OutputStream netOut = socket.getOutputStream();
		FileInputStream fileIn = new FileInputStream("d:\\3000soft.ico");
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = fileIn.read(byteArray)) != -1){
			netOut.write(byteArray,0,len);
			netOut.flush();
		}
		socket.shutdownOutput();
		System.out.println("�ϴ����");
		
		InputStream netIn = socket.getInputStream();
		byte[] byteArray2= new byte[1024];
		int len2 = netIn.read(byteArray2);
		String info = new String(byteArray2,0,len2);
		System.out.println("�ͻ��˽��յ�����˵Ļ�����" + info);
		
		fileIn.close();
		socket.close();
		
	}
}
