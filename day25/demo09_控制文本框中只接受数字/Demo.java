package com.itcast.demo09_�����ı�����ֻ��������;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
	public static void main(String[] args) {
		final Frame frame = new Frame("ֻ�������ֵ��ı���");
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		// ���Ĳ���
		frame.setLayout(new FlowLayout());
		//*********�������**********//
		Label lab = new Label("���������QQ���룬ֻ���������֣����������ԣ�");
		TextField txt = new TextField(20);
		
		txt.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			//���¼���ʱ��
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				char c = e.getKeyChar();
				/*int code = e.getKeyCode();
				String s = e.getKeyText(code);
				System.out.println("�㰴�˼��̵�ĳ���� :KeyChar = " + c + 
										" KeyCode = " + code +
										" KeyText = " + s);*/
				
				//�ж�KeyChar�Ƿ������֣�������ǣ���ȡ���¼�
				if((c < '0' || c > '9')){
					
					//ȡ���¼�
					//	return;
						e.consume();
						
					
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				
				
			}});
		//
		//������
		frame.add(lab);
		frame.add(txt);
		// ��ʾ����
		frame.setVisible(true);
	}
}
