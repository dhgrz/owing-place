package com.itcast.demo15_װ��ģʽ;

public abstract class AbstractThinkPadDealer implements IThinkPad{
	private IThinkPad think;
	
	public AbstractThinkPadDealer(IThinkPad t){
		this.think = t;
	}
	
	//��д���෽��
	public void sellComputer(){
		this.think.sellComputer();
	}
}
