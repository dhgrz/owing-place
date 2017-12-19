package com.itcast.demo01_TCP控制台输入和读取文本在服务端控制台显示的区别;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9888);
		Socket clientSocket = server.accept();
		InputStream netIn = clientSocket.getInputStream();
		
		//使用字节流接收
		byte[] byteArray = new byte[1024];
		int len = 0;
		while(true){
			len = netIn.read(byteArray);
			String str = new String(byteArray,0,len);
			System.out.println("服务端接收到数据：" + str);
			if(str.equals("886")){
				break;
			}
			
		}
		System.out.println("服务端结束！");
		clientSocket.close();
		server.close();
		
		
	}
}
