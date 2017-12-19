package com.itcast.demo15_в╟йндёй╫;

public class Demo {
	public static void main(String[] args) {
		IThinkPad t = new ThinkPadX240();
		t.sellComputer();
		System.out.println("------------------------------------------");
		IThinkPad t2 = new ThinkPad_ZGC_Dealer(new ThinkPadE430());
		t2.sellComputer();
		System.out.println("------------------------------------------");
		IThinkPad t3 = new ThinkPad_XSQ_Dealer(new ThinkPadX240());
		t3.sellComputer();
		
		System.out.println("------------------------------------------");
		IThinkPad t4 = new ThinkPad_ZGC_Dealer(new ThinkPad_XSQ_Dealer(new ThinkPadX240()));
		t4.sellComputer();
		
	}
}
