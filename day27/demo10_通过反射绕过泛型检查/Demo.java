package com.itcast.demo10_通过反射绕过泛型检查;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
	//	intList.add("abc");
		//通过反射
		Class listClass = intList.getClass();
		Method addMethod = listClass.getMethod("add", Object.class);
		addMethod.invoke(intList, "abc");
		
		System.out.println("-----------------");
		for(Object obj : intList){
			System.out.println(obj);
		}
		System.out.println("-----------------");
	}
}
