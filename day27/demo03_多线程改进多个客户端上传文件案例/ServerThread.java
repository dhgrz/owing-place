package com.itcast.demo03_多线程改进多个客户端上传文件案例;

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
		//接收客户端上传的数据；
		try {
			InputStream netIn = this.clientSocket.getInputStream();
			//文件输出流
			FileOutputStream fileOut = new FileOutputStream(this.fileName + ".png");
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = netIn.read(byteArray)) != -1){
				fileOut.write(byteArray,0,len);
			}
			fileOut.close();
			netIn.close();
			System.out.println("服务端处理上传文件：" + this.fileName + ".png完成！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
