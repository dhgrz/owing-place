package com.itcast.demo04_适配器模式;
/*
 * 用户类
 */
//public class ClassA implements IA {
  public class ClassA extends AbstractIA{

	@Override
	public void fun1() {
		System.out.println("我只想用fun1()方法，其它方法都要空实现。");

	}

	
}
