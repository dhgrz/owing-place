package com.itcast.demo05_����̨�������ݷ��͵����ն�;

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
				System.out.println("���ն˵ȴ����Ͷ�����......");
				socket.receive(pak);
				byte[] infoArray = pak.getData();
				String str = new String(infoArray,0,pak.getLength());
				System.out.println("���ն��յ���Ϣ��" + str);
				if(str.equals("886")){
					System.out.println("���յ�886����ô��Ҳ������ˣ��ݰݣ�");
					break;
				}
			}
			System.out.println("���ն˽�����");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
