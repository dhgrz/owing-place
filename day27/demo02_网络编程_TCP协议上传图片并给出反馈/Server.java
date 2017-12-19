package com.itcast.demo02_网络编程_TCP协议上传图片并给出反馈;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9888);
		System.out.println("等待客户端连接......");
		
			Socket clientSocket = server.accept();
			InputStream netIn = clientSocket.getInputStream();//从网络读取
			FileOutputStream fileOut = new FileOutputStream("img_copy.ico");//文件写入
			
			
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = netIn.read(byteArray)) != -1){
				//向文件写入
				fileOut.write(byteArray,0,len);
			}
			System.out.println("上传完毕，向客户端发送回馈......");
			OutputStream netOut = clientSocket.getOutputStream();
			netOut.write("服务器接收到您的数据，已经完毕！".getBytes());
			
			netOut.close();
		
		System.out.println("发送回馈完毕！");
		clientSocket.close();
		server.close();
		
	}
}
