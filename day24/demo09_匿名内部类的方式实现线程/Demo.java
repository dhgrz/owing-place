package com.itcast.demo09_�����ڲ���ķ�ʽʵ���߳�;
/*
 * ���ö������࣬ȫ��ʹ�������ڲ���ķ�ʽ
 */
public class Demo {
	public static void main(String[] args) {
		//****��һ�ַ�ʽ*********//
		new Thread(){
			public void run(){
				for(int a = 0;a < 20 ; a++){
					System.out.println("a = " + a);
				}
			}
		}.start();
		//*********�ڶ��ַ�ʽ************//
		new Thread(new Runnable(){
			public void run(){
				for(int b = 0; b < 20; b++){
					System.out.println("b = " + b);
				}
			}
		}){}.start();
		
		//**********�����ַ�ʽ************//
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
