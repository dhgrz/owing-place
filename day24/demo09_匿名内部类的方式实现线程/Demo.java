package com.itcast.demo09_匿名内部类的方式实现线程;
/*
 * 不用定义子类，全部使用匿名内部类的方式
 */
public class Demo {
	public static void main(String[] args) {
		//****第一种方式*********//
		new Thread(){
			public void run(){
				for(int a = 0;a < 20 ; a++){
					System.out.println("a = " + a);
				}
			}
		}.start();
		//*********第二种方式************//
		new Thread(new Runnable(){
			public void run(){
				for(int b = 0; b < 20; b++){
					System.out.println("b = " + b);
				}
			}
		}){}.start();
		
		//**********第三种方式************//
		new Thread(new Runnable(){
			public void run(){
				for(int c = 0; c < 20; c++){
					System.out.println("c = " + c);
				}
			}
		}){
			public void run(){
				for(int d = 0;d < 20 ; d++){
					System.out.println("d = " + d);
				}
			}
		}.start();
	}
}
