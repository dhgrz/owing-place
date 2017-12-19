package com.itcast.demo01_Frame��HelloWorld;

import java.awt.Frame;
import java.awt.Rectangle;

/*
 * Ҫ��ʾһ�����壺
 * ���裺
 * 1.ʵ����һ��Frame;
 * 		���췽����
 * 			Frame():û���趨����
 * 			Frame(String title):ʹ�ñ��⹹�죻
 * 2.���ô����С��λ�ã�
 * 		�趨��С��
 * 			public void setSize(int width,int height)����������
 * 			public void setSize(Dimension d)��
 * 		�趨λ�ã�
 * 			public void setLocation(int x,int y)����Ļ���ص�����ֵ
 * 			public void setLocation(Point p):
 *    ����һ���Ե�ͬʱ���ô�С��λ�ã�
 *    		public void setBounds(int x,int y,int width,int height)��
 *    		lic void setBounds(Rectangle r)��
 * 3.�趨���⣺
 * 		setTitle(String title);�趨����
 * 4.��Ϊ�ɼ���
 * 		ʹ��setVisible(boolean b):bΪtrue,�ɼ���bΪfalse��Ϊ���ɼ�
 */
public class Demo {
	public static void main(String[] args) {
		//1.ʵ����һ��Frame;
		Frame myFrame = new Frame();
		//2.�趨��С��λ�ã�
		/*
	//	myFrame.setSize(600,400);//��С
		myFrame.setSize(new Dimension(600,400));
	//	myFrame.setLocation(300,200);//λ�ã�x = 200,y = 200
		myFrame.setLocation(new Point(200,200));
		*/
		//һ�����趨��С��λ�ã�
	//	myFrame.setBounds(200,200,600,400);
		myFrame.setBounds(new Rectangle(200,200,600,400));
		//3.�趨����
		myFrame.setTitle("HelloWorld--�����ҵĵ�һ������");
		//4.��Ϊ�ɼ���
		myFrame.setVisible(true);
	}
}
