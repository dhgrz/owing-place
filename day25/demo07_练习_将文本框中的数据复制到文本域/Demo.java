package com.itcast.demo07_��ϰ_���ı����е����ݸ��Ƶ��ı���;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * ���ı����е������ƶ����ı���:
 * 1.����һ�����壻
 * 2.�������������
 * 		1).�ı���java.awt.TextField:�����ı���
 * 		2).��ť��java.awt.Button:��ť
 * 		3).�ı���java.awt.TextArea:�ı��򡣿����趨Ϊֻ�����д��
 * 3.Ϊ��ť���¼�����
 * 4.�������ӵ����壻
 * 5.��ʾ���壻
 * 	
 */
public class Demo {
	public static void main(String[] args) {
		Frame frame = new Frame("�����ı�");
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		//���Ĳ���
		frame.setLayout(new FlowLayout());
		//*********ʵ�������*************//
		final TextField txt1 = new TextField(20);
		Button but = new Button("��������");
		final TextArea txtArea = new TextArea(10,50);
		//Ϊ��ť����¼�
		but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.��ȡ�ı����е����ݣ�
				String str = txt1.getText();
				//2.���������õ��ı�����
			//	txtArea.setText(str);
				//2.������׷�ӵ��ı����У��ӻ��У�
				txtArea.append(str + "\r\n");
				//3.����ı���
				txt1.setText("");
				//4.���ı����ý���
				txt1.requestFocusInWindow();
			}});
		//****************************//
		//������
		frame.add(txt1);
		frame.add(but);
		frame.add(txtArea);
		
		frame.setVisible(true);
	}
}
