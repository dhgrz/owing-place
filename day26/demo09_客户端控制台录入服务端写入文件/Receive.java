package com.itcast.demo09_客户端控制台录入服务端写入文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
 * 4.向文件写入；
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
			//写文件的带缓冲的字符流
			BufferedWriter fileOut = new BufferedWriter(new FileWriter("test09.txt"));
			
			while(true){
				len = netIn.read(byteArray);
				String str = new String(byteArray,0,len);
				if(str.equals("886")){
					System.out.println("服务端收到886，系统结束！");
					break;
				}
				fileOut.write(str);
				fileOut.newLine();
				
			}
			fileOut.close();
			//释放资源
			netIn.close();
			clientSocket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
