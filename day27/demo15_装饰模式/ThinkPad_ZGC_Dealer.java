package com.itcast.demo15_װ��ģʽ;

public class ThinkPad_ZGC_Dealer extends AbstractThinkPadDealer {

	public ThinkPad_ZGC_Dealer(IThinkPad t) {
		super(t);
	}
	
	public void sellComputer(){
		super.sellComputer();
		System.out.println("��һ�����ۣ�");
	}

}
