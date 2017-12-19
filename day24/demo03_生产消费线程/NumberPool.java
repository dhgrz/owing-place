package com.itcast.demo03_���������߳�;
import java.util.ArrayList;
public class NumberPool {
	private ArrayList<Integer> intList = new ArrayList<Integer>();
	//�������ֵķ������˷�����"������"����
	public synchronized void setNum(int n){
		this.intList.add(n);
		this.notifyAll();//Object���� �ķ��������������ڵ�ǰ�����ϵȴ����̣߳�
	}
	//��ȡ���ֵķ������˷�����"���ѷ�"����
	public synchronized Integer getNum(String threadName){
		//��������������ݣ�ֱ�ӷ���һ�����ݣ�Ȼ��ɾ�������ϵĵ�һ������
		if(intList.size() == 0){
			//�����ѷ��ȴ�
			try {
				System.out.println(threadName + " ��ʼ�ȴ�......");
				this.wait();//Object-->wait()����:�õ�ǰ���ʵ��̵߳ȴ����ȴ����һ���
				System.out.println(threadName + " �����ѣ�");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Integer i = intList.get(0);
		intList.remove(0);
		return i;
	}
}
