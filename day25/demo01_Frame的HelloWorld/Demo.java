package com.itcast.demo01_Frame的HelloWorld;

import java.awt.Frame;
import java.awt.Rectangle;

/*
 * 要显示一个窗体：
 * 步骤：
 * 1.实例化一个Frame;
 * 		构造方法：
 * 			Frame():没有设定标题
 * 			Frame(String title):使用标题构造；
 * 2.设置窗体大小和位置：
 * 		设定大小：
 * 			public void setSize(int width,int height)：像素数；
 * 			public void setSize(Dimension d)：
 * 		设定位置：
 * 			public void setLocation(int x,int y)：屏幕像素的坐标值
 * 			public void setLocation(Point p):
 *    可以一次性的同时设置大小和位置：
 *    		public void setBounds(int x,int y,int width,int height)：
 *    		lic void setBounds(Rectangle r)：
 * 3.设定标题：
 * 		setTitle(String title);设定标题
 * 4.设为可见：
 * 		使用setVisible(boolean b):b为true,可见，b为false，为不可见
 */
public class Demo {
	public static void main(String[] args) {
		//1.实例化一个Frame;
		Frame myFrame = new Frame();
		//2.设定大小和位置：
		/*
	//	myFrame.setSize(600,400);//大小
		myFrame.setSize(new Dimension(600,400));
	//	myFrame.setLocation(300,200);//位置：x = 200,y = 200
		myFrame.setLocation(new Point(200,200));
		*/
		//一次性设定大小和位置：
	//	myFrame.setBounds(200,200,600,400);
		myFrame.setBounds(new Rectangle(200,200,600,400));
		//3.设定标题
		myFrame.setTitle("HelloWorld--这是我的第一个窗体");
		//4.设为可见：
		myFrame.setVisible(true);
	}
}
