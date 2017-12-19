package com.itcast.demo05_控制台接收数据发送到接收端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket pak = new DatagramPacket(new byte[1024],1024);
			while(true){
				System.out.println("接收端等待发送端数据......");
				socket.receive(pak);
				byte[] infoArray = pak.getData();
				String str = new String(infoArray,0,pak.getLength());
				System.out.println("接收端收到信息：" + str);
				if(str.equals("886")){
					System.out.println("接收到886，那么我也别玩儿了，拜拜！");
					break;
				}
			}
			System.out.println("接收端结束！");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
