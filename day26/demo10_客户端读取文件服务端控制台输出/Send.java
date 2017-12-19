package com.itcast.demo10_客户端读取文件服务端控制台输出;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 */
public class Send {
	public static void main(String[] args) {
		//1.文件的输入流
		try {
			BufferedReader fileIn = new BufferedReader(new FileReader("test09.txt"));
			//2.建立Socket
			Socket socket = new Socket("192.168.21.205",8887);
			//3.获取向服务端的输出流
			/*OutputStream netOut = socket.getOutputStream();
			//4.读文件
			String row = null;
			while((row = fileIn.readLine()) != null){
				netOut.write(row.getBytes());
				netOut.flush();
				
			}*/
			BufferedWriter netOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//4.读文件
			String row = null;
			while((row = fileIn.readLine()) != null){
				netOut.write(row);
				netOut.newLine();
				netOut.flush();
				System.out.println("发送：" + row);
				
			}
			//5.释放资源
			netOut.close();
			socket.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
