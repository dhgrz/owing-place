package com.itcast.demo08_客户端键盘录入服务端控制台输出;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 接收端：
 * 1.建立Socket:ServerSocket
 * 		等待客户端连接
 * 2.获取输入流；
 * 3.接收数据；
 * 4.打印数据；
 * 5.如果遇到886,结束
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
				System.out.println("服务端接收到数据：" + str);
				if(str.equals("886")){
					System.out.println("接收到886，服务端结束！");
					break;
				}
			}
			//释放资源
			netIn.close();
			clientSocket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
