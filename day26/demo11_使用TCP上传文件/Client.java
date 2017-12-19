package com.itcast.demo11_使用TCP上传文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 1.读取文件，
 * 2.向服务器端发送
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.建立文件流
		BufferedReader fileIn = new BufferedReader(new FileReader("D:\\file_write.txt"));
		//2.建立Sokcet
		Socket socket = new Socket("192.168.21.205",8888);
		//3.获取输出流
		BufferedWriter netOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		//4.读取文件，并输出到服务器端
		String row = null;
		while((row = fileIn.readLine()) != null){
			netOut.write(row);
			netOut.newLine();
			netOut.flush();
			
		}
		//5.释放资源
		netOut.close();
		fileIn.close();
		socket.close();
		
		
	}
}
