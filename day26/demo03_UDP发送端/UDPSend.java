package com.itcast.demo03_UDP���Ͷ�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * UDP���Ͷ����̣�
 * 
 * 1.����socket:DatagramSocket��
 * 2.��װ���ݱ���DatagramPacket��
 * 		���췽��
 * 		public DatagramPacket(byte[] buf,
                      int length,
                      InetAddress address,
                      int port)
 * 3.ʹ��socket��send()�����������ݣ�
 */
public class UDPSend {

	public static void main(String[] args) {
		//1.����socket:DatagramSocket��
		try {
			DatagramSocket socket = new DatagramSocket();
			//2.�������ݰ���
			byte[] byteArray = "��ã�����ͨ��UDP���͵�".getBytes();
			DatagramPacket pak = new DatagramPacket(
										byteArray,
										byteArray.length,
										InetAddress.getByName("Lenovo-PC"),
										8888);
			//3.ͨ��socket��send��������
			socket.send(pak);
			System.out.println("��Ϣ�ѷ���");
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
