package com.itcast.demo06_��Ӱ�ť������¼�;
/*
 * Frame��Ĭ�ϲ��ֹ�����ΪBorderLayout��������Ӱ�ťʱ�����Խ�����Ĳ��ֹ�������Ϊnull
 * Ҳ����ʹ����ʽ���ֹ�������
 * myFrame.setLayout(null);
 * myFrame.setLayout(new FlowLayout);
 */
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
		//�����ֹ�������Ϊnull,���ʹ�þ���λ���������ڷ�λ�ã����ڲ��ɸı��С�Ĵ��壬������Ϊnull
	//	myFrame.setLayout(null);
		//System.out.println(myFrame.getLayout());//��ȡĬ�ϵĲ��ֹ�������BorderLayout
		//�����ֹ�������ΪFlowLayout
		myFrame.setLayout(new FlowLayout());
		//**********��Ӱ�ť************//
		//��ť��һ�������Button
		Button but = new Button("����һ����ť");
		but.setLocation(100, 100);
		but.setSize(150,50);
		//����ť��ӵ�������
		myFrame.add(but);
	
		
		//����¼���ActionListener�ǰ�ť��һ��"����"�¼����㰴����һ�°�ť
		//Ҳ����ʹ��MouseListener��MouseListener���涨���˶������ĸ���ϸ���¼���
		but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionListener--����һ����ť���㰴�����ң�����������ݰݣ�");
				//�����ʵ�ְ�һ�°�ť���ͽ�������
				System.exit(0);
			}});
		but.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Click()--������");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Pressed()--������");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Released()--�ͷ���");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Entered()--��������");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Exited()--����ƿ���");
			}});
		// 4.��Ϊ�ɼ���
		myFrame.setVisible(true);
	}
}
