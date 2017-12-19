package com.itcast.demo08_客户端键盘录入服务端控制台输出;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 客户端代码：
 * 
 * 1.从控制台接收输入；
 * 2.建立Socket;
 * 3.获取输出流，向服务端输出数据；
 * 4.当用户输入886结束
 */
public class Send {
	public static void main(String[] args) {
		//1.从控制台接收输入
		BufferedReader conIn = new BufferedReader(new InputStreamReader(System.in));
		//2.建立Socket
		try {
			Socket socket = new Socket("192.168.21.205",8888);
			//3.建立Socket输出流
			OutputStream netOut = socket.getOutputStream();
			String row = "";
			while(true){
				row = conIn.readLine();
				//输出到服务端
				netOut.write(row.getBytes());
				netOut.flush();
				if(row.equals("886")){
					break;
				}
			}
			//释放资源
			netOut.close();
			socket.close();
			conIn.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
