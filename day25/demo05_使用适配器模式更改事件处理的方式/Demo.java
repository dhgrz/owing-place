package com.itcast.demo05_ʹ��������ģʽ�����¼�����ķ�ʽ;
/*
 *Java�е��¼��ࣺXxxxxListener:WindowListener
 *Java�е��¼����������ࣺXxxxxAdapter:WindowAdapter
 *
 *1.�����ǵ�MyWindoListener��Ϊ�̳���WindowAdapter:
 *2.ʹ�������ڲ��ࣺ
 *	1).
 **
 */
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Demo {
	public static void main(String[] args) {
		// 1.ʵ����һ��Frame;
		Frame myFrame = new Frame();
		// 2.�趨��С��λ�ã�
		myFrame.setSize(600, 400);// ��С
		myFrame.setLocation(300, 200);// λ�ã�x = 200,y = 200
		// 3.�趨����
		myFrame.setTitle("ʹ���������������ڲ��෽ʽ�����¼�");

		// **********�¼�����************//
		myFrame.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����ڲ��࣬��Ҫ�����ң�");
				System.out.println("�ðɣ��ݰݣ�");
				System.exit(0);
			}
			//��ѡ���Ե���д���ǹ��ĵķ���
			
		});
		// 4.��Ϊ�ɼ���
		myFrame.setVisible(true);
	}
}
