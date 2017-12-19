package com.itcast.demo03_���̸߳Ľ�����ͻ����ϴ��ļ�����;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerThread implements Runnable{
	private Socket clientSocket;
	private int fileName;
	public ServerThread(Socket client,int fileName){
		this.clientSocket = client;
		this.fileName = fileName;
	}
	public void run() {
		//���տͻ����ϴ������ݣ�
		try {
			InputStream netIn = this.clientSocket.getInputStream();
			//�ļ������
			FileOutputStream fileOut = new FileOutputStream(this.fileName + ".png");
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = netIn.read(byteArray)) != -1){
				fileOut.write(byteArray,0,len);
			}
			fileOut.close();
			netIn.close();
			System.out.println("����˴����ϴ��ļ���" + this.fileName + ".png��ɣ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
