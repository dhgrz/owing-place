package com.itcast.demo06_添加按钮并添加事件;
/*
 * Frame的默认布局管理器为BorderLayout，我们添加按钮时，可以将窗体的布局管理器设为null
 * 也可以使用流式布局管理器。
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
		//将布局管理器设为null,组件使用绝对位置来决定摆放位置，对于不可改变大小的窗体，可以设为null
	//	myFrame.setLayout(null);
		//System.out.println(myFrame.getLayout());//获取默认的布局管理器：BorderLayout
		//将布局管理器改为FlowLayout
		myFrame.setLayout(new FlowLayout());
		//**********添加按钮************//
		//按钮是一个组件：Button
		Button but = new Button("我是一个按钮");
		but.setLocation(100, 100);
		but.setSize(150,50);
		//将按钮添加到窗体上
		myFrame.add(but);
	
		
		//添加事件：ActionListener是按钮的一个"语意"事件。你按下了一下按钮
		//也可以使用MouseListener，MouseListener里面定义了对于鼠标的更详细的事件。
		but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionListener--我是一个按钮，你按下了我，程序结束，拜拜！");
				//如果想实现按一下按钮，就结束程序
				System.exit(0);
			}});
		but.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Click()--单击了");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Pressed()--按下了");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Released()--释放了");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Entered()--鼠标进入了");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseListener--Exited()--鼠标移开了");
			}});
		// 4.设为可见：
		myFrame.setVisible(true);
	}
}
