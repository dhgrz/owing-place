package com.itcast.demo03_Ϊ��������¼�;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	
	//�û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ���á�
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("��������ң�");
		System.out.println("�ðɣ��ݰݣ���");
		//����ϵͳ����
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
