package com.itcast.demo05_使用适配器模式更改事件处理的方式;
/*
 *Java中的事件类：XxxxxListener:WindowListener
 *Java中的事件的适配器类：XxxxxAdapter:WindowAdapter
 *
 *1.将我们的MyWindoListener改为继承自WindowAdapter:
 *2.使用匿名内部类：
 *	1).
 **
 */
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Demo {
	public static void main(String[] args) {
		// 1.实例化一个Frame;
		Frame myFrame = new Frame();
		// 2.设定大小和位置：
		myFrame.setSize(600, 400);// 大小
		myFrame.setLocation(300, 200);// 位置：x = 200,y = 200
		// 3.设定标题
		myFrame.setTitle("使用适配器和匿名内部类方式处理事件");

		// **********事件关联************//
		myFrame.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("匿名内部类，你要关了我？");
				System.out.println("好吧，拜拜！");
				System.exit(0);
			}
			//有选择性的重写我们关心的方法
			
		});
		// 4.设为可见：
		myFrame.setVisible(true);
	}
}
