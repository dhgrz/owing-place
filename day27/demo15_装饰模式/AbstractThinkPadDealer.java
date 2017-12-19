package com.itcast.demo15_装饰模式;

public abstract class AbstractThinkPadDealer implements IThinkPad{
	private IThinkPad think;
	
	public AbstractThinkPadDealer(IThinkPad t){
		this.think = t;
	}
	
	//重写父类方法
	public void sellComputer(){
		this.think.sellComputer();
	}
}
