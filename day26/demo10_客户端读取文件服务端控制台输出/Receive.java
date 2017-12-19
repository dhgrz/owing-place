package com.itcast.demo10_客户端读取文件服务端控制台输出;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
	public static void main(String[] args) {
		//1.建立Socket
		try {
			ServerSocket server = new ServerSocket(8887);
			//2.等待客户端连接
			Socket clientSocket = server.accept();
			//3.获取输入流
			//字节流的--不好使(大家想一下什么原因)
			/*InputStream netIn = clientSocket.getInputStream();
			//4.读入数据
			byte[] byteArray = new byte[1024];
			int len = 0;
			
			while((len = netIn.read(byteArray))!= -1){
				
				String str = new String(byteArray,0,len);
				System.out.println("服务端接收到数据：" + str);
				for(byte b : byteArray){
					System.out.println("数组：" + b);
				}
			}*/
			//字符流--好用的
			BufferedReader netIn = new BufferedReader(
										new InputStreamReader(clientSocket.getInputStream()));
			String row = null;
			while((row = netIn.readLine())!=null){
				System.out.println(row);
			}
			System.out.println("服务端结束！");
			//5.释放资源
			netIn.close();
			clientSocket.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
