package com.itcast.demo03_���̸߳Ľ�����ͻ����ϴ��ļ�����;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread implements Runnable{
	private String fileName;//1.png,2.png
	public ClientThread(String fileName){
		this.fileName = fileName;
	}
	public void run() {
		//���ӷ����
		try {
			Socket socket = new Socket("127.0.0.1",9888);
			//���緢�͵������
			OutputStream netOut = socket.getOutputStream();
			//�ļ��Ķ�ȡ��
			FileInputStream fileIn = new FileInputStream(this.fileName);
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = fileIn.read(byteArray)) != -1){
				netOut.write(byteArray,0,len);
			}
			System.out.println(Thread.currentThread().getName() + " �ϴ��ļ���" + this.fileName + " ��ϣ�");
			fileIn.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
