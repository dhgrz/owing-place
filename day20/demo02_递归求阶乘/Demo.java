package com.itcast.demo02_�ݹ���׳�;
/*
 * ʹ�õݹ���׳ˣ�
 * 
 * ���磺��5�Ľ׳ˣ�5!:1 * 2 * 3 * 4 * 5
 * 
 * �õݹ���ô����
 * 1.������ֽ⣺5��
 *          5 * 4��
 *          5 * 4 * 3��
 *          5 * 4 * 3 * 2��
 *          5 * 4 * 3 * 2 * 1!
 */
public class Demo {
	public static void main(String[] args) {
		int startNum = 1;
		int maxNum = 5;
		int result = 1;
		/*
		while(startNum <= maxNum){
			result *= startNum;
			startNum++;
		}
		System.out.println(maxNum + "�Ľ׳�Ϊ��" + result);*/
		
		System.out.println("�ݹ���׳˵Ľ����" + jieCheng(maxNum));
	}
	
	public static int jieCheng(int num){//5,4,3,2,1
		if(num == 1){
			return 1;
		}
		int result = num * jieCheng(num -1);
		return result;
	}
}
