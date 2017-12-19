package com.itcast.demo15_装饰模式;

public class ThinkPad_XSQ_Dealer extends AbstractThinkPadDealer {

	public ThinkPad_XSQ_Dealer(IThinkPad t) {
		super(t);
	}
	
	public void sellComputer(){
		super.sellComputer();
		System.out.println("送一套三居室！");
	}

}
