package com.itcast.demo04_UDP���ն�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * ���նˣ�
 * 
 * 1.����socket:DatagramSocket(int port):ָ���������ݵĶ˿ں�
 * 2.�������ݰ���DatagramPacket(byte[] buf, int length):
 * 3.����socket��receive()�ȴ����Ͷ˷������ݣ�
 *   һ���пͻ��˷��͹������ݣ���ô��������ͻ᷵�أ�
 * 4.ͨ��DatagramPacket�����ȡ���յ����ݣ�
 */
public class UDPReceive {

	public static void main(String[] args) throws IOException {
		//1.����socket:DatagramSocket
		DatagramSocket socket = new DatagramSocket(8888);
		//2.����һ���յ����ݰ�����
		byte[] byteArray = new byte[1024];
		DatagramPacket pak = new DatagramPacket(byteArray,byteArray.length);
		//3.����socket��receive()�ȴ����Ͷ˷������ݣ�һ���пͻ��˷��͹������ݣ���ô��������ͻ᷵�أ�
		socket.receive(pak);//����
		//4.ͨ��DatagramPacket�����ȡ���յ����ݣ�
		//���ջ�ȡ�Է�����IP
		String ip = pak.getAddress().getHostAddress();
		//��ȡ��Ϣ����
		byte[] infoArray = pak.getData();
		int infoLen = pak.getLength();
		String str = new String(infoArray,0,infoLen);
		System.out.println("���յ� IP�� " + ip + " ���ݣ�" + str);

	}

}
