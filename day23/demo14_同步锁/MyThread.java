package com.itcast.demo14_ͬ����;

public class MyThread extends Thread{
	private Accound acc = null;//�û��˻�����
	private String type = null;//�û���־���棬����ȡ
	public MyThread(Accound acc ,String type){
		this.acc = acc;
		this.type = type;
	}
	
	@Override
	public void run() {
		if(this.type.equals("��")){
			for(int i = 0;i < 200;i++){
				acc.add(100);
			}
			System.out.println("��Ǯ��ϣ�");
		}else{
			for(int i = 0;i < 200;i++){
				acc.sub(100);
			}
			System.out.println("ȡǮ��ϣ�");
		}
	}
	
	
}
