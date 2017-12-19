package com.itcast.demo03_为窗体添加事件;
/*
 * 事件处理机制：
 * 1.事件源：Frame
 * 2.可能会发生什么事：很多，在类库中定义了。java.awt.event.XxxxxListener
 * 3.发生某些事，我们怎么做：
 * 	   1).什么事？我们想关注一下，窗体被关闭时我们要做一些事情，所以选择：窗体事件：WindowListener
 * 	   2).如果出事了，我们怎么做：实现WindowListerer接口，重写我们需要关注方法；
 * 4.事件关联：将事件源1与事件处理的方法3进行关联：注册事件。
 * 		myFrame.addWindowListener(new MyWindowListener());
 * 
 * 运行的时候，怎么找到的处理的方法？
 * 1.在屏幕上的窗体上的X处点击按钮；
 * 2.此 信息会被"操作系统"接收：事件：鼠标在某个位置点击了一下
 * 3.操作系统要找到处理事件的程序：谁是当前活动的程序；是Java程序，然后将事件发送给Java虚拟机
 * 4.Java虚拟机接收到事件后：
 * 	    1).找谁是当前活动的窗体。myFrame
 * 		2).验证你是否希望处理此类事件：你是否addWindowListener了，是的。
 *  	3).找你处理的方法：在MyWindowListener中的windowClosing()方法处理；
 *  	4).执行windowClosing方法；
 *   
 */
import java.awt.Frame;

public class Demo {
	public static void main(String[] args) {
		//1.实例化一个Frame;
		Frame myFrame = new Frame();
		//2.设定大小和位置：
		myFrame.setSize(600,400);//大小
		myFrame.setLocation(300,200);//位置：x = 200,y = 200
		//3.设定标题
		myFrame.setTitle("HelloWorld--这是我的第一个窗体");
		
		//**********事件关联************//
		myFrame.addWindowListener(new MyWindowListener());
		//4.设为可见：
		myFrame.setVisible(true);
	}
}
