package com.itcast.demo19_枚举的常用方法;
/* 
 * 	int compareTo(E o)
	String name()
	int ordinal()
	String toString()
	<T> T valueOf(Class<T> type,String name)
	values() 

 */
public class Demo {
	public static void main(String[] args) {
		Color3 c1 = Color3.RED;
		Color3 c2 = Color3.BLUE;
		
		System.out.println("c1.compareTo(c2) : " + (c1.compareTo(c2)));
		System.out.println("c2.compareTo(c1) : " + (c2.compareTo(c1)));
		
		System.out.println("c1.name() : " + c1.name());
		
		System.out.println("c1.ordinal() : " + c1.ordinal());
		System.out.println("c2.ordinal() : " + c2.ordinal());
		//String toString()
		System.out.println("c1.valueOf(Color3.class,\"RED\") : " + c1.valueOf(Color3.class,"RED"));
	
		//values() :
		Color3[] cArray = c1.values();
		for(Color3 c : cArray){
			System.out.println(c);
		}
	}
}
