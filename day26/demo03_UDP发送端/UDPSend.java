package com.itcast.demo03_UDP发送端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * UDP发送端流程：
 * 
 * 1.建立socket:DatagramSocket；
 * 2.封装数据报：DatagramPacket；
 * 		构造方法
 * 		public DatagramPacket(byte[] buf,
                      int length,
                      InetAddress address,
                      int port)
 * 3.使用socket的send()方法发送数据；
 */
public class UDPSend {

	public static void main(String[] args) {
		//1.建立socket:DatagramSocket；
		try {
			DatagramSocket socket = new DatagramSocket();
			//2.建立数据包：
			byte[] byteArray = "你好，这是通过UDP发送的".getBytes();
			DatagramPacket pak = new DatagramPacket(
										byteArray,
										byteArray.length,
										InetAddress.getByName("Lenovo-PC"),
										8888);
			//3.通过socket的send方法发送
			socket.send(pak);
			System.out.println("信息已发送");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
