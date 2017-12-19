package com.itcast.demo01_TCP控制台输入和读取文本在服务端控制台显示的区别;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Clinet {
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		Socket socket = new Socket("127.0.0.1",9888);
		OutputStream netOut = socket.getOutputStream();
		//*********从控制台接收输入***************
		/*BufferedReader conIn = new BufferedReader(new InputStreamReader(System.in));
		String row = null;
		while(true){
			row = conIn.readLine();
			System.out.println("要发送的信息：" + row);
			byte[] byteArray = row.getBytes();
			System.out.println("要发送的byte数组:" + Arrays.toString(byteArray));
			//向客户端发送
			netOut.write(byteArray);
			if(row.equals("886")){
				break;
			}
		}
		*/
		//*********从文本文件读取***********************
		BufferedReader fileIn = new BufferedReader(new FileReader("demo01.txt"));
		String row = null;
		while(true){
			row = fileIn.readLine();
			System.out.println("要发送的信息：" + row);
			byte[] byteArray = row.getBytes();
			System.out.println("要发送的byte数组:" + Arrays.toString(byteArray));
			
			//向客户端发送
			netOut.write(byteArray);
			
			if(row.equals("886")){
				break;
			}
		}
		fileIn.close();
		System.out.println("客户端结束！");
		
		netOut.close();
		socket.close();
		
		
	}
}
