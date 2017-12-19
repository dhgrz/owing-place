package com.itcast.demo11_使用TCP上传文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//1.建立Socket
		ServerSocket server = new ServerSocket(8888);
		//2.等待客户端连接
		Socket clientSocket = server.accept();
		//3.获取输入流，包装成字符缓冲流
		BufferedReader netIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		//4.读取数据
		//5.写入文件，要文件输出流
		BufferedWriter fileOut = new BufferedWriter(new FileWriter("copy.txt"));
		String row = null;
		while((row = netIn.readLine()) != null){
			System.out.println("读取到：" + row);
			fileOut.write(row);
			fileOut.newLine();
			fileOut.flush();
		}
		//5.释放资源
		fileOut.close();
		netIn.close();
		clientSocket.close();
		server.close();
		
	}
}
