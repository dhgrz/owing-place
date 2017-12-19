package com.itcast.demo05_使用适配器模式更改事件处理的方式;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class MyWindowListener implements WindowListener {
  public class MyWindowListener extends WindowAdapter{
	//用户试图从窗口的系统菜单中关闭窗口时调用。
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("你想关了我？");
		System.out.println("好吧，拜拜！！");
		//结束系统运行
		System.exit(0);

	}

	

}
