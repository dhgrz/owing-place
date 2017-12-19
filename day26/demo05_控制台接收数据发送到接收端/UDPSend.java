package com.itcast.demo05_控制台接收数据发送到接收端;
/*
 * 从控制台循环接收数据，直到控制台用户输入：886,两边程序结束；
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) {
		//接收控制台数据
		BufferedReader in = new BufferedReader(
								new InputStreamReader(System.in));
		String row = "";
		try {
			//建立UDP的发送端
			DatagramSocket socket = new DatagramSocket();
			
			while(true){
				row = in.readLine();
				byte[] byteArray = row.getBytes();
				
				DatagramPacket pak = new DatagramPacket(byteArray,byteArray.length,
															InetAddress.getByName("Lenovo-PC"),
															8888);
				//发送
				socket.send(pak);
				if(row.equals("886")){
					break;
				}
			}
			System.out.println("程序结束！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
